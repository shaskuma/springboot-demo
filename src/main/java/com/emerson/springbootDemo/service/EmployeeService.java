package com.emerson.springbootDemo.service;

import com.emerson.springbootDemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee createEmployee(Employee employee);
}
