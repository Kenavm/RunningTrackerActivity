package com.codecool.runningactivitytracker.security;

import com.codecool.runningactivitytracker.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TokenService {

    private final String secret;

    private final PasswordEncoder passwordEncoder;

    public TokenService(@Value("${token.secret}") String secret, PasswordEncoder passwordEncoder) {
        this.secret = secret;
        this.passwordEncoder = passwordEncoder;
    }


    public String generateToken(User user) {
        StringBuilder tokenBuilder = new StringBuilder();

        tokenBuilder.append(user.getEmail());
        tokenBuilder.append(";");
        tokenBuilder.append(this.passwordEncoder.encode(this.secret + user.getEmail()));

        return tokenBuilder.toString();
    }
}
