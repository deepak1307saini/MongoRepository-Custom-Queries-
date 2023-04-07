package com.example.MongoRepository.Custom.Queries.Repository;

import com.example.MongoRepository.Custom.Queries.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
    List<Employee> findAllByFirstNameStartingWith(String firstName);

    List<Employee> findAllByAddressZipcode(int zipcode);


    //Using json query
    @Query(value = "{'salary':{$gte:?0}}",fields = "{'firstName':1,'id':0}")
    List<Employee> abc(int salary);
}

//gte:?0 , in this ? means randoms comes and 0 means 1st argument
//fields = "{'firstName':1,'id':0}  in this 0 show not return id and 1 shows return, and to remove default values return check in application file