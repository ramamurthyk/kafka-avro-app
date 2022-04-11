package app.kafka.avrodemo.enrolment.uniontype;

import java.util.UUID;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import app.kafka.avrodemo.ApplicationProperties;
import app.kafka.avrodemo.common.MessageTypes;
import app.kafka.avrodemo.common.RecordHeaderNames;
import app.kafka.avrodemo.common.RecordHeaders;
import app.kafka.avrodemo.schema.CreateEnrolment;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EnrolmentProducer {
	@Autowired
	private KafkaTemplate<Integer, CreateEnrolment> template;

	@Autowired
	private ApplicationProperties properties;

	public void sendCreateMessage(CreateEnrolmentRequest request) {
		// Build message.
		CreateEnrolment createEnrolment = CreateEnrolment.newBuilder()
				.setCustomerId(request.customerId())
				.setProgramme(request.programme())
				.setMembershipId(request.membershipId())
				.build();

		// Create record.
		ProducerRecord<Integer, CreateEnrolment> record = new ProducerRecord<Integer, CreateEnrolment>(
				properties.enrolmentUnionTypeTopic, null, request.customerId(),
				createEnrolment);

		// Add headers.
		record.headers().add(new RecordHeader(RecordHeaderNames.MESSAGE_ID,
				UUID.randomUUID().toString().getBytes()));
		record.headers()
				.add(new RecordHeader(RecordHeaderNames.MESSAGE_TYPE,
						MessageTypes.CREATE_ENROLMENT.getBytes()));

		// Send.
		this.template.send(record);

		log.info(String.format("Produced -> key: %s, value: %s", record.key(), record.value()));
		RecordHeaders.log(record.headers());
	}
}
