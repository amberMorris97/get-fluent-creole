package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.request.CreateUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @GetMapping
    public String createNewUser(@RequestBody CreateUserDTO createUserRequest) {
        // Logic to create a new user
        return "User created successfully!";
    }
}
