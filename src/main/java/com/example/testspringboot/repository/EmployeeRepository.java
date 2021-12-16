package com.example.testspringboot.repository;

import com.example.testspringboot.model.Application;
import com.example.testspringboot.model.Employee;
import com.example.testspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
