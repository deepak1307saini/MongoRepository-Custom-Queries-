package com.example.MongoRepository.Custom.Queries.service;

import com.example.MongoRepository.Custom.Queries.Repository.EmployeeRepository;
import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public Map<String, Object> getAllEmployeeInPage(int pageNo, int pageSize, String sortBy) {
        Map<String,Object> response=new HashMap<>();
        Sort sort=Sort.by(sortBy);
        Pageable page=PageRequest.of(pageNo,pageSize, sort);
        Page<Employee> employeePage=employeeRepository.findAll(page);
        response.put("data",employeePage.getContent());
        response.put("Total no. of page",employeePage.getTotalPages());
        response.put("Total no. of elements",employeePage.getTotalElements());
        response.put("Current Page No.",employeePage.getNumber()+1);
        return response;
    }

    public List<Employee> getAllByExample(Employee employee) {
        ExampleMatcher matcher=ExampleMatcher.matchingAny().withIgnoreCase().withMatcher("firstName", ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.ENDING));
        Example<Employee> e=Example.of(employee,matcher);
        System.out.println(e);
        return employeeRepository.findAll(e);
    }

    public List<Employee> getAllByFirstName(String firstName) {
        return employeeRepository.findAllByFirstNameStartingWith(firstName);
    }
}
