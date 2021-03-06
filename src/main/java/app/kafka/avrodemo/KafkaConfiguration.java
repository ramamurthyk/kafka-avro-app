package app.kafka.avrodemo;

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfiguration {
    @Autowired
    private ApplicationProperties properties;

    // Topic creation.
    @Bean
    public NewTopic enrolmentRequestTopic() {
        return new NewTopic(properties.enrolmentUnionTypeTopic, 1, (short) 1);
    }

    @Bean
    public NewTopic enrolmentTopic() {
        return new NewTopic(properties.enrolmentPayloadTypeTopic, 1, (short) 1);
    }
}
