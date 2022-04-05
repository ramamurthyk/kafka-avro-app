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
import app.kafka.avrodemo.schema.CreateEnrolment;
import app.kafka.avrodemo.schema.EventName;
import app.kafka.avrodemo.schema.MessageHeader;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EnrolmentProducer {
        @Autowired
        private KafkaTemplate<String, BaselineEventStructure> template;

        @Autowired
        private SchemaApplicationProperties properties;

        public void sendCreateMessage(EnrolmentRequest request) {
                // Build message.
                MessageHeader header = MessageHeader.newBuilder()
                                .setEventName(EventName.CreateEnrolmentEvent)
                                .build();

                CreateEnrolment createEnrolment = CreateEnrolment.newBuilder()
                                .setEntityId(request.entityId())
                                .setRewardName(request.rewardName())
                                .setRewardMembershipId(request.rewardMembershipId())
                                .build();

                BaselineEventStructure createEnrolmentRequest = BaselineEventStructure.newBuilder()
                                .setHeader(header)
                                .setPayload(createEnrolment)
                                .build();

                ProducerRecord<String, BaselineEventStructure> record = new ProducerRecord<String, BaselineEventStructure>(
                                properties.enrolmentRequestTopic, null, Integer.toString(request.entityId()),
                                createEnrolmentRequest);

                // Add headers.
                record.headers()
                                .add(new RecordHeader(KafkaHeaders.CORRELATION_ID,
                                                UUID.randomUUID().toString().getBytes()));
                record.headers().add(new RecordHeader("X_messageType",
                                EventName.CreateEnrolmentEvent.toString().getBytes()));

                this.template.send(record);

                log.info(String.format("Produced EnrolmentRequest -> %s", record));
        }

}
