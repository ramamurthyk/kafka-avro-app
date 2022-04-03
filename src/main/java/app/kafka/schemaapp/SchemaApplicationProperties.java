package app.kafka.schemaapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SchemaApplicationProperties {
     // Server settings.
     @Value("${server.port}")
     public String port;
 
     @Value("${server.baseurl}")
     public String baseurl;
 
     // Kafka broker hostname.
     @Value("${spring.kafka.bootstrap-servers}")
     public String bootstrapServers;
     
     // Topic names.
     @Value("${app.topic.enrolment-request}")
     public String enrolmentRequestTopic;

     @Value("${app.topic.enrolment}")
     public String enrolmentTopic;

     // Consumers.
     @Value("${app.enrolment.kafka.consumer.group-id}")
     public String enrolmentConsumerGroupId;
}
