package app.kafka.avrodemo.enrolment;

public record CancelEnrolmentRequest(int entityId, String rewardName) {
}
