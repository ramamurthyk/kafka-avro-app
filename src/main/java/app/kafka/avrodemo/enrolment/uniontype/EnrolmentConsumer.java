package app.kafka.avrodemo.enrolment.uniontype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Headers;
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
@KafkaListener(id = "${app.enrolment.uniontype.kafka.consumer.group-id}", topics = "${app.topic.enrolment.uniontype}")
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
    // types which won't be processed by this consumer.
    @KafkaHandler(isDefault = true)
    public void processOtherMessages(ConsumerRecord<String, Object> record) {
        log.info(String.format("processOtherMessages: Received <- key: %s. value: %s", record.key(), record.value()));
        process(record.headers(), record.value());

        // DEBUG stuffs:
        log.info("name: " + record.value().getClass().getName());
        var s = (SpecificRecord) record.value();
        log.info(s.get(0).toString());

        // Results in.
        // "java.lang.ClassCastException: class
        // app.kafka.avrodemo.schema.CreateEnrolment cannot be cast to class
        // app.kafka.avrodemo.schema.CreateEnrolment
        // (app.kafka.avrodemo.schema.CreateEnrolment is in unnamed module of loader
        // 'app'; app.kafka.avrodemo.schema.CreateEnrolment is in unnamed module of
        // loader
        // org.springframework.boot.devtools.restart.classloader.RestartClassLoader
        // @612c4c2d)"
        // CreateEnrolment c = (CreateEnrolment) s;
    }

    // DEBUG stuffs:
    // https://github.com/eugenp/tutorials/blob/c65dcf73f741392aaf1fc9c6c05625124225910d/apache-libraries/src/main/java/com/baeldung/avro/util/serealization/AvroSerealizer.java
    public byte[] serealizeAvroRequestBinary(CreateEnrolment request) {
        DatumWriter<CreateEnrolment> writer = new SpecificDatumWriter<>(CreateEnrolment.class);
        byte[] data = new byte[0];
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder jsonEncoder = EncoderFactory.get()
                .binaryEncoder(stream, null);
        try {
            writer.write(request, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
        } catch (IOException e) {
            log.error("Serialization error " + e.getMessage());
        }

        return data;
    }

    public CreateEnrolment deSerealizeAvroRequestBinary(byte[] data) {
        DatumReader<CreateEnrolment> reader = new SpecificDatumReader<>(CreateEnrolment.class);
        BinaryDecoder decoder = DecoderFactory.get()
                .binaryDecoder(data, null);
        try {
            return reader.read(null, decoder);
        } catch (IOException e) {
            log.error("Deserialization error" + e.getMessage());
        }
        return null;
    }
}
