package app.kafka.schemaapp.enrolment;

public record EnrolmentRequest(int entityId, String rewardName, String rewardMembershipId) {
}
