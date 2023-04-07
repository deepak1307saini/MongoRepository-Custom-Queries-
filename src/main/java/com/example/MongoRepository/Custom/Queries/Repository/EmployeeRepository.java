package com.example.MongoRepository.Custom.Queries.Repository;

import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
    List<Employee> findAllByFirstNameStartingWith(String firstName);
}
