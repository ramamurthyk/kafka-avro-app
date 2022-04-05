package app.kafka.avrodemo.enrolment;

public record EnrolmentRequest(int entityId, String rewardName, String rewardMembershipId) {
}
