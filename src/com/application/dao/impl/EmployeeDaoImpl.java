package com.application.dao.impl;


import com.application.dao.EmployeeDao;
import com.application.entities.Employee;
import com.application.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void createEmployee(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(employee);
            System.out.println("Employee is created with the id of ::" + id);
            session.getTransaction().commit();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Employee employee = session.get(Employee.class,id);
            if(employee != null){
                session.beginTransaction();
                session.delete(employee);
                session.getTransaction().commit();
            }else{
                System.out.println("Employee doesn't exist with provideded Id..");
            }
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void editEmployeeById(int id, Double Salary) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                employee.setSalary(Salary);
                session.beginTransaction();
                session.update(employee);
                session.getTransaction().commit();
            } else {
                System.out.println("Employee doesn't exist with provideded Id..");
            }
        }

    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employee = session.get(Employee.class, employeeId);
            if (employee != null) {
                return employee;
            } else {
                System.out.print("Employee does not exist with provided id");
            }
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}