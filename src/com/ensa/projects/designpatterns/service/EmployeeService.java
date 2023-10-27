package com.ensa.projects.designpatterns.service;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.dao.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static EmployeeService instance;
    private List<Employee> employees = new ArrayList<>();
    private EmployeeDAO employeeDAO;

    private EmployeeService(){}

    public static EmployeeService getInstance(){
        if (instance == null){
            instance = new EmployeeService();
        }
        return instance;
    }

    public Employee copyEmployee(Employee original) throws CloneNotSupportedException {
        return employeeDAO.copyEmployee(original);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // CRUD on Employee, ...
}
