package app.kafka.avrodemo.enrolment;

import java.util.UUID;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import app.kafka.avrodemo.ApplicationProperties;
import app.kafka.avrodemo.common.MessageTypes;
import app.kafka.avrodemo.common.RecordHeaderNames;
import app.kafka.avrodemo.common.RecordHeaders;
import app.kafka.avrodemo.schema.CancelEnrolment;
import app.kafka.avrodemo.schema.ReasonCode;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CancelEnrolmentProducer {
    @Autowired
    private KafkaTemplate<String, CancelEnrolment> template;

    @Autowired
    private ApplicationProperties properties;

    public void sendCancelMessage(CancelEnrolmentRequest request) {
        // Build message.
        CancelEnrolment cancelEnrolment = CancelEnrolment.newBuilder().setEntityId(request.entityId())
                .setRewardName(request.rewardName()).setReasonCode(ReasonCode.MemberRequested).build();

        // Create record.
        ProducerRecord<String, CancelEnrolment> record = new ProducerRecord<String, CancelEnrolment>(
                properties.enrolmentRequestTopic, null, Integer.toString(request.entityId()), cancelEnrolment);

        // Add headers.
        record.headers().add(new RecordHeader(RecordHeaderNames.MESSAGE_ID, UUID.randomUUID().toString().getBytes()));
        record.headers()
                .add(new RecordHeader(RecordHeaderNames.MESSAGE_TYPE, MessageTypes.CANCEL_ENROLMENT.getBytes()));

        // Send.
        this.template.send(record);

        log.info(String.format("Produced -> key: %s, value: %s", record.key(), record.value()));
        RecordHeaders.log(record.headers());
    }
}