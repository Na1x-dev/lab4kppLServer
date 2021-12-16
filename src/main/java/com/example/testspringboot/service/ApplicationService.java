package com.example.testspringboot.service;

import com.example.testspringboot.model.Application;

import java.util.List;

public interface ApplicationService {

    void create(Application application);

    List<Application> readAll();

    List<Application> readByUserId(int clientId);

    boolean update(Application Application, int id);

    boolean delete(int id);
}
