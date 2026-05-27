package com.example.StudentApplication_3.service;


import org.springframework.stereotype.Service;

import com.example.StudentApplication_3.model.Student;

@Service
public class StudentService {

    public String createStudent(Student student) {

        return "Student created successfully";
    }
}
