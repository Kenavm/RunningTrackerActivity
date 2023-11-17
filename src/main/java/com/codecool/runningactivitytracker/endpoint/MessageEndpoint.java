package com.codecool.runningactivitytracker.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MessageEndpoint {

    @GetMapping("/admins")
    String unauthorized() {
        return "this is for admins only";
    }

    @GetMapping("/users")
    String authorized() {
        return "this is for users";
    }
}
