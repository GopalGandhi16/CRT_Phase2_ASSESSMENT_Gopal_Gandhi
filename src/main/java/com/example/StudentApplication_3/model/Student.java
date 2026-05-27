package com.example.StudentApplication_3.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 18, message = "Age must be 18 or above")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}