package app.kafka.avrodemo.enrolment.uniontype;

public record CancelEnrolmentRequest(int customerId, String programme) {
}
