package com.codecool.RunningActivityTracker.runner;

import com.codecool.RunningActivityTracker.model.User;
import com.codecool.RunningActivityTracker.model.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class UserPopulator {

    @Bean
    ApplicationRunner populateUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String password = passwordEncoder.encode("123");
            User user = new User(0, "manuel", password, Set.of("USER"));
            userRepository.save(user);
        };
    }
}
