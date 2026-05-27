package com.example.employeeDepartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeedepartment.model.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}