package com.example.reactiveFirstDay.model;

import javax.lang.model.type.PrimitiveType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Employee
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Employee {

    private int id;
    private String name;
    private int age;
    private String department;
    
}