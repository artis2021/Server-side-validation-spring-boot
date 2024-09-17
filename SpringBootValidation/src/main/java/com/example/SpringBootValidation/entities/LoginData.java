package com.example.SpringBootValidation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
    @NotBlank(message = "username can not be empty")
    @Size(min = 3, max = 12, message = "username should be length of between 3 to 12")
    String username;
//    @NotBlank(message = "email can not be black")
    @Email(message = "Invalid email.")
    String email;
    @AssertTrue
    boolean agreed;

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
