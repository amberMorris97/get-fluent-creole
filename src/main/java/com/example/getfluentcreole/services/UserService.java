package com.example.getfluentcreole.services;

import com.example.getfluentcreole.dto.request.CreateUserDTO;

public interface UserService {
    CreateUserDTO createUser(CreateUserDTO createUserDTO);
}