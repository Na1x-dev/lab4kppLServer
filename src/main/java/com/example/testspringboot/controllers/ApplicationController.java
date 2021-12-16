package com.example.testspringboot.controllers;


import com.example.testspringboot.model.Application;
import com.example.testspringboot.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping(value = "/applications")
    public ResponseEntity<?> create(@RequestBody Application application) {
        applicationService.create(application);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/applications")
    public ResponseEntity<List<Application>> read() {
        final List<Application> applications = applicationService.readAll();
        return applications != null && !applications.isEmpty()
                ? new ResponseEntity<>(applications, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/applications/byClientId/{clientId}")
    public ResponseEntity<List<Application>> read(@PathVariable(name = "clientId") int clientId) {
        final List<Application> applications = applicationService.readByUserId(clientId);
        return applications != null
                ? new ResponseEntity<>(applications, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/applications/byId/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Application application) {
        final boolean updated = applicationService.update(application, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/applications/byId/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = applicationService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}