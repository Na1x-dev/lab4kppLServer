package com.example.testspringboot.repository;

import com.example.testspringboot.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

    List<Application> findByClientId(Integer clientId);
}
