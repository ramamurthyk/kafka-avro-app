package app.kafka.avrodemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {
    // Server settings.
    @Value("${server.port}")
    public String port;

    @Value("${server.baseurl}")
    public String baseurl;

    // Kafka broker hostname.
    @Value("${spring.kafka.bootstrap-servers}")
    public String bootstrapServers;

    // Topic names.
    @Value("${app.topic.enrolment.uniontype}")
    public String enrolmentUnionTypeTopic;

    @Value("${app.topic.enrolment.payloadtype}")
    public String enrolmentPayloadTypeTopic;

    // Consumers.
    @Value("${app.enrolment.uniontype.kafka.consumer.group-id}")
    public String enrolmentUnionTypeConsumerGroupId;

    @Value("${app.enrolment.payloadtype.kafka.consumer.group-id}")
    public String enrolmentPayloadTypeConsumerGroupId;
}
