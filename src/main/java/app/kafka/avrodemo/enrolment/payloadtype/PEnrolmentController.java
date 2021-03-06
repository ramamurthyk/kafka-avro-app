package app.kafka.avrodemo.enrolment.payloadtype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PEnrolmentController {
    @Autowired
    private PEnrolmentProducer enrolmentProducer;

    @Autowired
    private PCancelEnrolmentProducer cancelEnrolmentProducer;

    @PostMapping(path = "/api/enrolments-payloadtype")
    public void CreateEnrolment(@RequestBody CreateEnrolmentRequest request) {
        log.info("Received POST request to create enrolment");

        enrolmentProducer.sendCreateMessage(request);
    }

    @PatchMapping(path = "/api/enrolments-payloadtype")
    public void CancelEnrolment(@RequestBody CancelEnrolmentRequest request) {
        log.info("Received PATCH request to cancel enrolment");

        cancelEnrolmentProducer.sendCancelMessage(request);
    }
}
