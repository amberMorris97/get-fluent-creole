package com.example.getfluentcreole.services;

import com.example.getfluentcreole.dto.UserDTO;
import com.example.getfluentcreole.models.User;
import com.example.getfluentcreole.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        if (userRepository.existsByEmailAddress(userDTO.getEmailAddress())) {
            // TODO: throw new ItemNotFoundException
        }

        // TODO: set encoded password

        User user = mapToProfileEntity(userDTO);
        user = userRepository.save(user);

        return mapToProfileDTO(user);
    }

    private UserDTO mapToProfileDTO(User userEntity) {
        return modelMapper.map(userEntity, UserDTO.class);
    }

    private User mapToProfileEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
