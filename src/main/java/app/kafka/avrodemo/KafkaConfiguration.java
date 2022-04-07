package app.kafka.avrodemo;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.support.converter.RecordMessageConverter;

import app.kafka.avrodemo.schema.CreateEnrolment;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroSerializer;

@Configuration
@EnableKafka
public class KafkaConfiguration {
    @Autowired
    private ApplicationProperties properties;

    // Topic creation.
    @Bean
    public NewTopic enrolmentRequestTopic() {
        return new NewTopic(properties.enrolmentRequestTopic, 1, (short) 1);
    }

    @Bean
    public NewTopic enrolmentTopic() {
        return new NewTopic(properties.enrolmentTopic, 1, (short) 1);

    }
}
