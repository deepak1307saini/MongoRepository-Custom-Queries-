package com.example.MongoRepository.Custom.Queries.controller;

import com.example.MongoRepository.Custom.Queries.model.Employee;
import com.example.MongoRepository.Custom.Queries.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") String id){
         employeeService.deleteEmployee(id);
    }
}
