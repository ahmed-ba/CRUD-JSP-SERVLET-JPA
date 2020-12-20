package com.training.wcd.dao.employee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.training.wcd.common.PersistenceManager;
import com.training.wcd.dao.common.BaseDaoImpl;
import com.training.wcd.domain.Employee;
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {
public EmployeeDaoImpl() {
 super();
 this.beanClass = Employee.class;
}
public Employee findByName(String employeeName) {
 // Create an entityManager from entityManagerFactory
 EntityManager em =
PersistenceManager.retrieveEntityManagerFactory().createEntityManager();

 // Create TypedQuery from NamedQuery
 TypedQuery<Employee> typedQuey = em.createNamedQuery("Employee.findByName",
Employee.class);
 typedQuey.setParameter("firstName", "Martin");
 return typedQuey.getSingleResult();
}
}
