package com.example.StudentApplication_3.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.StudentApplication_3.model.Student;
import com.example.StudentApplication_3.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<?> createStudent(
            @Valid @RequestBody Student student,
            BindingResult result) {

        if (result.hasErrors()) {

            String errorMessage =
                    result.getFieldError().getDefaultMessage();

            return ResponseEntity
                    .badRequest()
                    .body(errorMessage);
        }

        String response =
                studentService.createStudent(student);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
