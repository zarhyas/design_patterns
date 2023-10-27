package com.ensa.projects.designpatterns.service;

import com.ensa.projects.designpatterns.beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static EmployeeService instance;
    private List<Employee> employees = new ArrayList<>();

    private EmployeeService(){}

    public static EmployeeService getInstance(){
        if (instance == null){
            instance = new EmployeeService();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // CRUD on Employee, ...
}
