package app.kafka.avrodemo.enrolment.payloadtype;

public record CreateEnrolmentRequest(int customerId, String programme, String membershipId) {
}
