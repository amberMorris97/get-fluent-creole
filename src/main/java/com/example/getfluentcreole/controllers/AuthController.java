package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.UserDTO;
import com.example.getfluentcreole.dto.request.UserRequestDTO;
import com.example.getfluentcreole.dto.response.UserResponseDTO;
import com.example.getfluentcreole.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class AuthController {

    private final ModelMapper modelMapper;
    private final UserService userService;


    public AuthController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    public UserResponseDTO createNewUser(@RequestBody UserRequestDTO userRequest) {
        UserDTO userDTO = mapToUserDTO(userRequest);
        userDTO = userService.createUser(userDTO);

        return mapToUserResponse(userDTO);
    }

    private UserDTO mapToUserDTO(UserRequestDTO userRequestDTO) {
        return modelMapper.map(userRequestDTO, UserDTO.class);
    }

    private UserResponseDTO mapToUserResponse(UserDTO userDTO) {
        return modelMapper.map(userDTO, UserResponseDTO.class);
    }
}
