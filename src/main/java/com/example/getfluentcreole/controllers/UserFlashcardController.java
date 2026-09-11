package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.UserFlashcardDTO;
import com.example.getfluentcreole.models.UserFlashcard;
import com.example.getfluentcreole.repositories.UserFlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userFlashcards")
public class UserFlashcardController {

    @Autowired
    UserFlashcardRepository userFlashcardRepository;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public UserFlashcardDTO createNewUserFlashcard(@RequestBody UserFlashcardDTO userFlashcardDTO) {
        UserFlashcard userFlashcard = new UserFlashcard(userFlashcardDTO.getUser(), userFlashcardDTO.getPhrase(), userFlashcardDTO.getStatus());
        userFlashcardRepository.save(userFlashcard);
        return userFlashcardDTO;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserFlashcards(@PathVariable int userId) {
        List<UserFlashcard> flashcards = userFlashcardRepository.findAllByUserId(userId);
        return new ResponseEntity<>(flashcards, HttpStatus.OK);
    }
}