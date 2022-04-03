package app.kafka.schemaapp.controlcentre;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        log.info("Received GET request for hello method");
        return "Hello from the schemapp successfully initialised and running";
    }
}
