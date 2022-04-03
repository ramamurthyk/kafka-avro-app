package app.kafka.schemaapp.enrolment;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import app.kafka.schemaapp.schema.BaselineEventStructure;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EnrolmentConsumer {
    @KafkaListener(id = "${app.enrolment.kafka.consumer.group-id}", topics = "${app.topic.enrolment-request}")
    public void listen(ConsumerRecord<String, BaselineEventStructure> record) {
        log.info(String.format("Received %s", record.value()));
    }
}
