package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @PostMapping("/hello")
    public void sendMessage(@RequestParam("message") String message) {
        log.info("Received a request for greeting with name: {}", message);

        log.debug("Received a request for greeting with name: {}", message);

        log.error("Received a request for greeting with name: {}", message);

        log.trace("Received a request for greeting with name: {}", message);

        log.warn("Received a request for greeting with name: {}", message);
    }
}