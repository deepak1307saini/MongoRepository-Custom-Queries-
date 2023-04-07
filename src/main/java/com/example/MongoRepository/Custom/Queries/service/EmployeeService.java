package com.example.MongoRepository.Custom.Queries.service;

import com.example.MongoRepository.Custom.Queries.Repository.EmployeeRepository;
import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.insert(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public void deleteEmployee(String id) {
         employeeRepository.deleteById(id);
    }


}
