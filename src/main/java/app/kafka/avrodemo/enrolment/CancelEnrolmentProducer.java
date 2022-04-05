package app.kafka.avrodemo.enrolment;

import java.util.UUID;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Service;

import app.kafka.avrodemo.SchemaApplicationProperties;
import app.kafka.avrodemo.schema.BaselineEventStructure;
import app.kafka.avrodemo.schema.CancelEnrolment;
import app.kafka.avrodemo.schema.EventName;
import app.kafka.avrodemo.schema.MessageHeader;
import app.kafka.avrodemo.schema.ReasonCode;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CancelEnrolmentProducer {
        @Autowired
        private KafkaTemplate<String, BaselineEventStructure> template;

        @Autowired
        private SchemaApplicationProperties properties;

        public void sendCancelMessage(CancelEnrolmentRequest request) {
                // Build message.
                MessageHeader header = MessageHeader.newBuilder()
                                .setEventName(EventName.CancelEnrolmentEvent)
                                .build();

                CancelEnrolment cancelEnrolment = CancelEnrolment.newBuilder()
                                .setEntityId(request.entityId())
                                .setRewardName(request.rewardName())
                                .setReasonCode(ReasonCode.MemberRequested)
                                .build();

                BaselineEventStructure cancelEnrolmentRequest = BaselineEventStructure.newBuilder()
                                .setHeader(header)
                                .setPayload(cancelEnrolment)
                                .build();

                ProducerRecord<String, BaselineEventStructure> record = new ProducerRecord<String, BaselineEventStructure>(
                                properties.enrolmentRequestTopic, null, Integer.toString(request.entityId()),
                                cancelEnrolmentRequest);

                // Add headers.
                record.headers()
                                .add(new RecordHeader(KafkaHeaders.CORRELATION_ID,
                                                UUID.randomUUID().toString().getBytes()));
                record.headers().add(new RecordHeader("X_messageType",
                                EventName.CancelEnrolmentEvent.toString().getBytes()));

                this.template.send(record);

                log.info(String.format("Produced CancelEnrolmentRequest -> %s", record));
        }
}
