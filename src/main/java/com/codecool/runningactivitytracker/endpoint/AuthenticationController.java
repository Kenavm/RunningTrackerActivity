package com.codecool.runningactivitytracker.endpoint;

import com.codecool.runningactivitytracker.auth.AuthenticationRequest;
import com.codecool.runningactivitytracker.auth.AuthenticationResponse;
import com.codecool.runningactivitytracker.auth.RegisterRequest;
import com.codecool.runningactivitytracker.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final AuthenticationService userService;

    public AuthenticationController(AuthenticationService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(userService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(userService.authenticate(request));
    }

}
