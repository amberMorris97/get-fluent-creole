package com.example.getfluentcreole.repositories;

import com.example.getfluentcreole.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
