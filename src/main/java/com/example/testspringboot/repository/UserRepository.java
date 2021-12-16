package com.example.testspringboot.repository;

import com.example.testspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

     User findByUsername(String username);
}
