package com.ems.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
