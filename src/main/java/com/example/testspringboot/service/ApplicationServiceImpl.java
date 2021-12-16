package com.example.testspringboot.service;


import com.example.testspringboot.model.Application;
import com.example.testspringboot.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;



    @Override
    public void create(Application application) {
        Runnable task = () -> {
            try {
                applicationRepository.save(application);
                Thread.sleep(10000);
                application.setStatus("Выполняется");
                applicationRepository.save(application);
                Thread.sleep(10000);
                application.setStatus("Выполнен");
                applicationRepository.save(application);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    @Override
    public List<Application> readAll() {
        return applicationRepository.findAll();
    }

    @Override
    public List<Application> readByUserId(int clientId) {
        return applicationRepository.findByClientId(clientId);
    }

    @Override
    public boolean update(Application application, int id) {
        if (applicationRepository.existsById(id)) {
            application.setId(id);
            applicationRepository.save(application);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (applicationRepository.existsById(id)) {
            applicationRepository.deleteById(id);
            return true;
        }
        return false;
    }


}