package app.kafka.avrodemo.enrolment.payloadtype;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64.Decoder;

import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Headers;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import app.kafka.avrodemo.common.MessageTypes;
import app.kafka.avrodemo.common.RecordHeaderNames;
import app.kafka.avrodemo.common.RecordHeaders;
import app.kafka.avrodemo.schema.EnrolmentRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@KafkaListener(id = "${app.enrolment.payloadtype.kafka.consumer.group-id}", topics = "${app.topic.enrolment.payloadtype}")
public class PEnrolmentConsumer {
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
    public void processEnrolmentRequest(ConsumerRecord<String, EnrolmentRequest> record) {
        log.info(
                String.format("processEnrolmentRequest: Received <- key: %s. value: %s", record.key(), record.value()));
        process(record.headers(), record.value());
    }

    // Until the specific handlers can be selected and called, process all the
    // events here.
    // This method would anyway be required to receive and acknowledge messages
    // types which won't be processed by this consumer.
    @KafkaHandler(isDefault = true)
    public void processOtherMessages(ConsumerRecord<String, Object> record) {
        log.info(String.format("processOtherMessages: Received <- key: %s. value: %s", record.key(), record.value()));
        process(record.headers(), record.value());
    }
}
