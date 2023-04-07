package com.example.MongoRepository.Custom.Queries.Repository;

import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
