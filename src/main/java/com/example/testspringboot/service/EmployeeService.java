package com.example.testspringboot.service;

import com.example.testspringboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    void create(Employee employee);

    List<Employee> readAll();

    Employee read(int id);

    boolean delete(int id);
}