package app.kafka.avrodemo.enrolment.payloadtype;

public record CancelEnrolmentRequest(int customerId, String programme) {
}
