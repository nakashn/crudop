package com.curdop.curd.operation.entites;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Student {
    int studentId;
    String studentFirstname;
    String studentLastname;
    String address;
    String phoneNumber;
}
