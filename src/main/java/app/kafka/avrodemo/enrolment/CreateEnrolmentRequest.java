package app.kafka.avrodemo.enrolment;

public record CreateEnrolmentRequest(int entityId, String rewardName, String rewardMembershipId) {
}
