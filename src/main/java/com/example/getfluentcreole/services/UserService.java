package com.example.getfluentcreole.services;

import com.example.getfluentcreole.dto.request.CreateUserRequestDTO;

public interface UserService {
    CreateUserRequestDTO createUser(CreateUserRequestDTO createUserRequestDTO);
}