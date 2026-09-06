package com.example.getfluentcreole.dto.response;

public class UserResponseDTO {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public UserResponseDTO() {}

    public UserResponseDTO(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
}
