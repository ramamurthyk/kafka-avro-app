package app.kafka.schemaapp.enrolment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import app.kafka.schemaapp.SchemaApplicationProperties;
import app.kafka.schemaapp.schema.BaselineEventStructure;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EnrolmentProducer {
    @Autowired
    private KafkaTemplate<String, Object> template;

    @Autowired
    private SchemaApplicationProperties properties;

    public void sendCreateMessage(String key, BaselineEventStructure enrolment) {
        this.template.send(properties.enrolmentRequestTopic, key, enrolment);
        log.info(String.format("Produced enrolment -> %s", enrolment));
    }

    public void sendCancelMessage(String key, BaselineEventStructure cancelEnrolmentRequest) {
        this.template.send(properties.enrolmentRequestTopic, key,
                cancelEnrolmentRequest);
        log.info(String.format("Produced cancelEnrolment -> %s", cancelEnrolmentRequest));
    }
}
