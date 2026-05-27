package com.example.question_9.repository;

package com.example.question_9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.question_9.model.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    @Query("""
            SELECT MAX(e.salary)
            FROM Employee e
            WHERE e.salary < (
                SELECT MAX(emp.salary)
                FROM Employee emp
            )
           """)
    Double findSecondHighestSalary();

}