package com.syne.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syne.api.model.Employee;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
 
}
