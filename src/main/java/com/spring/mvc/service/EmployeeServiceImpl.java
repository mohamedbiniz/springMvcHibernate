package com.spring.mvc.service;
import com.spring.mvc.dao.EmployeeDAO;
import com.spring.mvc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO EmployeeDAO;

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return EmployeeDAO.getEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        EmployeeDAO.saveEmployee(theEmployee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int theId) {
        return EmployeeDAO.getEmployee(theId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        EmployeeDAO.deleteEmployee(theId);
    }
}
