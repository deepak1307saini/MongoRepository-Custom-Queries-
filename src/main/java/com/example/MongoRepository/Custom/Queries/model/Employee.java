package com.example.MongoRepository.Custom.Queries.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document( value = "employee")
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private int salary;

    public Employee( String firstName, String lastName, Address address, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
        super();
    }
}
