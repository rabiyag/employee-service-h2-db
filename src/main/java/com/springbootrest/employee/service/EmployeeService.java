package com.springbootrest.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springbootrest.employee.model.Employee;
import com.springbootrest.employee.repositories.EmployeeRepository;

/**
 * Features:
 * Create Employee: Add a new employee.
 * Get All Employees: Retrieve the list of employees.
 * Get Employee by ID: Get details of a specific employee.
 * Update Employee: Modify employee information.
 * Delete Employee: Remove an employe
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(employeeDetails.getName());
                    employee.setDepartment(employeeDetails.getDepartment());
                    employee.setSalary(employeeDetails.getSalary());
                    return employeeRepository.save(employee);
                })
                .orElseGet(() -> {
                    employeeDetails.setId(id);
                    return employeeRepository.save(employeeDetails);
                });
    }

    public void deleteEmployee(Long id) {
         employeeRepository.deleteById(id);
    }
}
