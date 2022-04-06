package app.kafka.avrodemo.enrolment;

import java.nio.charset.StandardCharsets;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Headers;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import app.kafka.avrodemo.common.MessageTypes;
import app.kafka.avrodemo.common.RecordHeaderNames;
import app.kafka.avrodemo.common.RecordHeaders;
import app.kafka.avrodemo.schema.CancelEnrolment;
import app.kafka.avrodemo.schema.CreateEnrolment;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@KafkaListener(id = "${app.enrolment.kafka.consumer.group-id}", topics = "${app.topic.enrolment-request}")
public class EnrolmentConsumer {
    public void process(Headers headers, Object message) {
        // Log headers.
        RecordHeaders.log(headers);

        // Get MessageType and process.
        String messageType = new String(headers.lastHeader(RecordHeaderNames.MESSAGE_TYPE).value(),
                StandardCharsets.UTF_8);

        switch (messageType) {
            case MessageTypes.CREATE_ENROLMENT:
                // Convert the message to a specific object..
                // Pseudocode: CreateEnrolment enrolment = convert(message);
                log.info(String.format("Processed messageType: %s", messageType));
                break;

            case MessageTypes.CANCEL_ENROLMENT:
                // Convert the message to a specific object..
                // Pseudocode: CancelEnrolment cancelEnrolment = convert(message);
                log.info(String.format("Processed messageType: %s", messageType));
                break;

            default:
                log.info(String.format("Processed messageType: %s", messageType));
                break;
        }
    }

    // This method is not being called. Requires investigation and potentially type
    // matching configuration during Avro deserialisation.
    @KafkaHandler
    public void processEnrolmentRequest(ConsumerRecord<String, CreateEnrolment> record) {
        log.info(
                String.format("processEnrolmentRequest: Received <- key: %s. value: %s", record.key(), record.value()));
        process(record.headers(), record.value());
    }

    // This method is not being called. Requires investigation and potentially type
    // matching configuration during Avro deserialisation.
    @KafkaHandler
    public void processEnrolmentCancellation(ConsumerRecord<String, CancelEnrolment> record) {
        log.info(String.format("processEnrolmentCancellation: Received <- key: %s. value: %s", record.key(),
                record.value()));
        process(record.headers(), record.value());
    }

    // Until the specific handlers can be selected and called, process all the
    // events here.
    // This method would anyway be required to receive and acknowledge messages
    // types which won be processed by this consumer.
    @KafkaHandler(isDefault = true)
    public void processOtherMessages(ConsumerRecord<String, Object> record) {
        log.info(String.format("processOtherMessages: Received <- key: %s. value: %s", record.key(), record.value()));
        process(record.headers(), record.value());
    }
}
