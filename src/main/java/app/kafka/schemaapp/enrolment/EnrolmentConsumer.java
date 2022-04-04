package app.kafka.schemaapp.enrolment;

import java.nio.charset.StandardCharsets;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import app.kafka.schemaapp.schema.BaselineEventStructure;
import app.kafka.schemaapp.schema.EventName;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EnrolmentConsumer {
    @KafkaListener(id = "${app.enrolment.kafka.consumer.group-id}", topics = "${app.topic.enrolment-request}")
    public void listen(ConsumerRecord<String, BaselineEventStructure> record) {
        record.headers().forEach(header -> log.info(String.format("Received header: key: %s, value: %s", header.key(),
                new String(header.value(), StandardCharsets.UTF_8))));
        log.info(String.format("Received key: %s. value: %s", record.key(),
                record.value()));

        String messageType = new String(record.headers().lastHeader("X_messageType").value(), StandardCharsets.UTF_8);
        EventName eventType = EventName.valueOf(messageType);

        if (eventType == EventName.CreateEnrolmentEvent) {
            log.info(String.format("Processing %s event", eventType.toString()));
        } else if (eventType == EventName.CancelEnrolmentEvent) {
            log.info(String.format("Processing %s event", eventType.toString()));
        } else {
            log.info(String.format("Ignoring %s event", eventType.toString()));
        }
    }
}
