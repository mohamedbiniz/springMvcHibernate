package com.spring.mvc.dao;

import com.spring.mvc.entities.Employee;

import java.util.List;

public interface EmployeeDAO  {
    public List<Employee> getEmployees();

    public void saveEmployee(Employee theEmployee);

    public Employee getEmployee(int theId);

    public void deleteEmployee(int theId);
}
