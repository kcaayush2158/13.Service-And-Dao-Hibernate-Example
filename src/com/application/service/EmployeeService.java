package com.application.service;

import com.application.entities.Employee;

public interface EmployeeService {
    public abstract void createEmployee(Employee employee);
    public abstract void deleteEmployee(Integer id);
    public abstract void editEmployeeById(int id,Double salary);
    public abstract Employee getEmployeeById(int employeeId);
}
