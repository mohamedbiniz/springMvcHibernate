package com.spring.mvc.dao;

import com.spring.mvc.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements  EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getEmployees() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery< Employee > cq = cb.createQuery(Employee.class);
        Root< Employee > root = cq.from(Employee.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee catalogue = session.byId(Employee.class).load(id);
        session.delete(catalogue);
    }

    @Override
    public void saveEmployee(Employee theEmployee) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theEmployee);
    }

    @Override
    public Employee getEmployee(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Employee theEmployee = currentSession.get(Employee.class, theId);
        return theEmployee;
    }
}
