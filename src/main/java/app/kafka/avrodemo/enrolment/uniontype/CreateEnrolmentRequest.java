package app.kafka.avrodemo.enrolment.uniontype;

public record CreateEnrolmentRequest(int customerId, String programme, String membershipId) {
}
