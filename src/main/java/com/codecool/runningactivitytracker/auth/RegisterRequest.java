package com.codecool.runningactivitytracker.auth;

import com.codecool.runningactivitytracker.model.Role;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class RegisterRequest {

    private String email;
    private String password;
    private Set<Role> authorities;

    public RegisterRequest(String email, String password,  Set<Role> role) {
        this.email = email;
        this.password = password;
        this.authorities = role;
    }

    public RegisterRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  Set<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Role> authorities) {
        this.authorities = authorities;
    }
}
