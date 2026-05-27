package com.example.employeeDepartment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeedepartment.model.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

}