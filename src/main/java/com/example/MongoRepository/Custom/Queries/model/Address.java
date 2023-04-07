package com.example.MongoRepository.Custom.Queries.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document( value = "address")
public class Address {
 private String line1;
 private String line2;
 private String city;
 private String state;
 private int zipcode;
}
