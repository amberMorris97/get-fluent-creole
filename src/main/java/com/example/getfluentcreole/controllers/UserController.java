package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.CreateUserRequest;
import com.example.getfluentcreole.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String createNewUser(@RequestBody CreateUserRequest userRequest) {
        // Logic to create a new user
        return "User created successfully!";
    }
}
