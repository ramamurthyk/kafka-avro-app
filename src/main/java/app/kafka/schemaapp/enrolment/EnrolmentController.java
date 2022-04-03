package app.kafka.schemaapp.enrolment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.kafka.schemaapp.schema.BaselineEventStructure;
import app.kafka.schemaapp.schema.CancelEnrolment;
import app.kafka.schemaapp.schema.CreateEnrolment;
import app.kafka.schemaapp.schema.EventName;
import app.kafka.schemaapp.schema.MessageHeader;
import app.kafka.schemaapp.schema.ReasonCode;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EnrolmentController {
    @Autowired
    private EnrolmentProducer enrolmentProducer;

    @PostMapping(path = "/api/enrolments")
    public void CreateEnrolment(@RequestBody EnrolmentRequest request) {
        log.info("Received POST request to create enrolment");

        MessageHeader header = MessageHeader.newBuilder()
                .setEventName(EventName.CreateEnrolmentEvent)
                .build();

        CreateEnrolment createEnrolment = CreateEnrolment.newBuilder()
                .setEntityId(request.entityId())
                .setRewardName(request.rewardName())
                .setRewardMembershipId(request.rewardMembershipId())
                .build();

        BaselineEventStructure createEnrolmentRequest = BaselineEventStructure.newBuilder()
                .setHeader(header)
                .setPayload(createEnrolment)
                .build();

        enrolmentProducer.sendCreateMessage(Integer.toString(request.entityId()), createEnrolmentRequest);
    }

    @PatchMapping(path = "/api/enrolments")
    public void CancelEnrolment(@RequestBody CancelEnrolmentRequest request) {
        log.info("Received PATCH request to cancel enrolment");

        MessageHeader header = MessageHeader.newBuilder()
                .setEventName(EventName.CancelEnrolmentEvent)
                .build();

        CancelEnrolment cancelEnrolment = CancelEnrolment.newBuilder()
                .setEntityId(request.entityId())
                .setRewardName(request.rewardName())
                .setReasonCode(ReasonCode.MemberRequested)
                .build();

        BaselineEventStructure createEnrolmentRequest = BaselineEventStructure.newBuilder()
                .setHeader(header)
                .setPayload(cancelEnrolment)
                .build();

        enrolmentProducer.sendCancelMessage(Integer.toString(request.entityId()), createEnrolmentRequest);
    }
}
