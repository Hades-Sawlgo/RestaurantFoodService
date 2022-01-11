package com.hades.pizzafoodservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private String fname;
    private String lname;
    private int age;

    private int salary;
    private LocalDateTime creationDate;
}
