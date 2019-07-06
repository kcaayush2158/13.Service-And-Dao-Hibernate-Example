package com.application.dao;

import com.application.entities.Employee;

public interface EmployeeDao {
    public abstract void createEmployee(Employee employee);
    public abstract void deleteEmployee(int id);
    public abstract void editEmployeeById(int id,Double Salary);
    public abstract Employee getEmployeeById(Integer employeeId);
}
