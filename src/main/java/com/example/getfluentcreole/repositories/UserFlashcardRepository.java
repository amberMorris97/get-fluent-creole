package com.example.getfluentcreole.repositories;

import com.example.getfluentcreole.models.UserFlashcard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFlashcardRepository extends JpaRepository<UserFlashcard, Integer> {
    List<UserFlashcard> findAllByUserId(int userId);
}
