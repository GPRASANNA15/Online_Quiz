package com.example.OnlineQuiz.Dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AuthDto {
    @NotBlank(message = "Email should not be blank")
    @Email(message = "give valid email")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;

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
}
