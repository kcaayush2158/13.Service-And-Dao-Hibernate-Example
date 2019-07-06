package com.application.main;

import com.application.entities.Employee;
import com.application.service.EmployeeService;
import com.application.service.impl.ServiceImpl;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        EmployeeService employeeService = new ServiceImpl();
        //getEmployeeById(employeeService);
        // updateEmployeeId(employeeService);
        //deleteEmployeeById(employeeService);
        createEmployee(employeeService);
    }

    public static void createEmployee(EmployeeService employeeService){
        employeeService.createEmployee(employee());
    }
    public static void deleteEmployeeById(EmployeeService employeeService){
        employeeService.deleteEmployee(1);
    }
    private static void getEmployeeById(EmployeeService employeeService){
        Employee employee = employeeService.getEmployeeById(1);
        System.out.print(employee);
    }
    public static void updateEmployeeId(EmployeeService employeeService){

        employeeService.editEmployeeById(1,10000.00);
    }
    public static Employee employee(){
        Employee employee = new Employee();
        employee.setEmail("aayushkc2158@gmail.com");
        employee.setDoj(new Date());
        employee.setEmployeeName("aayush kc");
        employee.setSalary(40000.00);
        return employee;
    }
}

