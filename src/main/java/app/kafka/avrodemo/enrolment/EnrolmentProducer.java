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
import app.kafka.avrodemo.schema.CreateEnrolment;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EnrolmentProducer {
    @Autowired
    private KafkaTemplate<String, CreateEnrolment> template;

    @Autowired
    private ApplicationProperties properties;

    public void sendCreateMessage(CreateEnrolmentRequest request) {
        // Build message.
        CreateEnrolment createEnrolment = CreateEnrolment.newBuilder()
                .setEntityId(request.entityId())
                .setRewardName(request.rewardName()).setRewardMembershipId(request.rewardMembershipId())
                .build();

        // Create record.
        ProducerRecord<String, CreateEnrolment> record = new ProducerRecord<String, CreateEnrolment>(
                properties.enrolmentRequestTopic, null, Integer.toString(request.entityId()),
                createEnrolment);

        // Add headers.
        record.headers().add(new RecordHeader(RecordHeaderNames.MESSAGE_ID,
                UUID.randomUUID().toString().getBytes()));
        record.headers()
                .add(new RecordHeader(RecordHeaderNames.MESSAGE_TYPE,
                        MessageTypes.CREATE_ENROLMENT.getBytes()));

        // Send.
        this.template.send(record);

        log.info(String.format("Produced -> key: %s, value: %s", record.key(), record.value()));
        RecordHeaders.log(record.headers());
    }
}
