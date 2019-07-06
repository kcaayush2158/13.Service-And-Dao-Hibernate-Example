package com.application.service.impl;


import com.application.dao.impl.EmployeeDaoImpl;
import com.application.entities.Employee;
import com.application.service.EmployeeService;

public class ServiceImpl implements EmployeeService {


    @Override
    public void createEmployee(Employee employee) {
        new EmployeeDaoImpl().createEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {

        new EmployeeDaoImpl().deleteEmployee(id);
    }

    @Override
    public void editEmployeeById(int id,Double salary) {
        new EmployeeDaoImpl().editEmployeeById(id,salary);
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return new EmployeeDaoImpl().getEmployeeById(employeeId);
    }
}
