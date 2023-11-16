package com.codecool.RunningActivityTracker.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageEndpoint {

    @GetMapping("unauthorized")
    String unauthorized() {
        return "unauthorized";
    }

    @GetMapping("authorized")
    String authorized() {
        return "authorized";
    }
}
