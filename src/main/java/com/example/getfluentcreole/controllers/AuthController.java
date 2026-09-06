package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.UserDTO;
import com.example.getfluentcreole.dto.request.CreateUserRequestDTO;
import com.example.getfluentcreole.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AuthController {

    private final ModelMapper modelMapper;
    private final UserService userService;


    public AuthController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }
    @GetMapping
    public String createNewUser(@RequestBody CreateUserRequestDTO createUserRequest) {
//        UserDTO userDTO = mapTo
        return "User created successfully!";
    }

    private UserDTO mapToUserDTO(CreateUserRequestDTO createUserRequestDTO) {
        return modelMapper.map(userProfileRequest, UserProfileDTO.class);
    }
}
