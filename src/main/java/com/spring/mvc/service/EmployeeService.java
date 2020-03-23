package com.spring.mvc.service;

import com.spring.mvc.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public void saveEmployee(Employee theEmployee);
    public Employee getEmployee(int theId);
    public void deleteEmployee(int theId);
}
