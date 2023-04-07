package com.example.MongoRepository.Custom.Queries;

import com.example.MongoRepository.Custom.Queries.Repository.EmployeeRepository;
import com.example.MongoRepository.Custom.Queries.model.Address;
import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        List<Employee> listOfEmployees = new ArrayList<>();
//
//        Employee e1 = new Employee("BAT", "HAN", new Address("Bat Cave", "My Back Yard", "Gotham", "CA", 1234), 5888);
//        Employee e2 = new Employee("SUPER", "MAN", new Address("Kriptonian Home", "Kriptonian City", "Kripton", "IN SPACE", 9999), 2008);
//        Employee e3 = new Employee("AQUA", "HAN", new Address("My House", "in Ocean", "Atlantis", "NOWHERE", 77777), 10000);
//
//        Employee e4 = new Employee("IRON", "MAN", new Address("Malibu", "Near Ocean", "CA", "CA", 1234), 12888);
//        Employee e5 = new Employee("Oliver", "Queen", new Address("On Street", "at night", "starcity", "US", 1232), 34342);
//
//        Employee e6 = new Employee("Berry", "Allan", new Address("Polics Station", "Star LAB", "Central City", "AAA", 333444), 6000);
//
//        Employee e7 = new Employee("Bruce", "Banner", new Address("In Lab", "Near Militery Base", "New York", "NY", 1234), 7800);
//        Employee e8 = new Employee("Steve", "Rogers", new Address("On Street", "at night", "starcity", "US", 1232), 8000);
//        Employee e9 = new Employee("Thor", "Esgardian", new Address("Polics Station", "Star LAB", "Central City", "AAA", 333444), 6880);
//
//        Employee e10 = new Employee("Peter", "Parker", new Address("School", "School 2", "Forest Hills,", "New York", 23456), 4000);
//        Employee e11 = new Employee("Natasha", "Romanoff", new Address("Street 1", "at night", "Stalingrad", "Russia", 22222), 34343);
//        Employee e12 = new Employee("Phil", "Colson", new Address("Unknown", "Shield", "Boston", "MA", 111122345), 34342);
//
//        listOfEmployees.add(e1);
//        listOfEmployees.add(e2);
//        listOfEmployees.add(e3);
//        listOfEmployees.add(e4);
//        listOfEmployees.add(e5);
//        listOfEmployees.add(e6);
//        listOfEmployees.add(e7);
//        listOfEmployees.add(e8);
//        listOfEmployees.add(e9);
//        listOfEmployees.add(e10);
//        listOfEmployees.add(e11);
//        listOfEmployees.add(e12);
//
//        employeeRepository.insert(listOfEmployees);

    }
}
