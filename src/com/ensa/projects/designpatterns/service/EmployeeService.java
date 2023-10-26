package com.ensa.projects.designpatterns.service;

public class EmployeeService {

    private static EmployeeService instance;
    private EmployeeService(){}

    public static EmployeeService getInstance(){
        if (instance == null){
            instance = new EmployeeService();
        }
        return instance;
    }

    // CRUD on Employee, ...
}
