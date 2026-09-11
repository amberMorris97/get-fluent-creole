package com.example.getfluentcreole.controllers;

import com.example.getfluentcreole.dto.UserFlashcardDTO;
import com.example.getfluentcreole.dto.request.UserFlashcardRequestDTO;
import com.example.getfluentcreole.models.Phrase;
import com.example.getfluentcreole.models.User;
import com.example.getfluentcreole.models.UserFlashcard;
import com.example.getfluentcreole.repositories.PhraseRepository;
import com.example.getfluentcreole.repositories.UserFlashcardRepository;
import com.example.getfluentcreole.repositories.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    @Autowired
    PhraseRepository phraseRepository;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public UserFlashcardRequestDTO createNewUserFlashcard(@RequestBody UserFlashcardRequestDTO dto) {
        User user = userRepository.findById(dto.getUserId()).orElse(null);
        Phrase phrase = phraseRepository.findById(dto.getPhraseId()).orElse(null);
        UserFlashcard userFlashcard = new UserFlashcard(user, phrase, dto.getStatus());
        userFlashcardRepository.save(userFlashcard);
        return dto;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserFlashcards(@PathVariable int userId) {
        User user = userRepository.findById(userId).orElse(null);
        List<UserFlashcard> flashcards = userFlashcardRepository.findAllByUser(user);
        return new ResponseEntity<>(flashcards, HttpStatus.OK);
    }

    @DeleteMapping("/{flashcardId}")
    public ResponseEntity<?> deleteUserFlashcard(@PathVariable int flashcardId) {
        userFlashcardRepository.deleteById(flashcardId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}