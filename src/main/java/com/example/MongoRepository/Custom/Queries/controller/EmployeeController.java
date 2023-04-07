package com.example.MongoRepository.Custom.Queries.controller;

import com.example.MongoRepository.Custom.Queries.model.Employee;
import com.example.MongoRepository.Custom.Queries.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/page")
    public Map<String,Object> getAll(@RequestParam(name = "pageNo", defaultValue = "0") int pageNo,
                                     @RequestParam(name = "pageSize", defaultValue = "3") int pageSize,
                                     @RequestParam(name = "sortBy", defaultValue = "id") String sortBy){
        return employeeService.getAllEmployeeInPage(pageNo,pageSize,sortBy);
    }


    @GetMapping("/example")
    public List<Employee> getAllByExample(@RequestBody Employee employee){
        return employeeService.getAllByExample(employee);
    }
}
