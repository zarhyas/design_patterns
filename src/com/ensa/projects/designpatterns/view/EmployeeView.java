package com.ensa.projects.designpatterns.view;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.service.EmployeeService;

public class EmployeeView implements IView{
    private EmployeeService employeeService = EmployeeService.getInstance();    // different call


    // we might want to have multiple views
    // for different users or screens
    // in which case we don't need a singleton class

    private static EmployeeView instance;
    public EmployeeView(){}

    public static EmployeeView getInstance(){
        if(instance == null){
            instance = new EmployeeView();
        }
        return instance;
    }

    public void displayEmployeeDetails(int id, String nom) {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + nom);
    }

    public void addAndDisplayEmployee(int id, String nom) {
        Employee employee = new Employee(id, nom);
        employeeService.addEmployee(employee);
        displayEmployeeDetails(id, nom);
    }

    public void copyAndShow(Employee original) throws CloneNotSupportedException {
        Employee copy = EmployeeService.getInstance().copyEmployee(original);
        // do something with copy
    }

    @Override
    public void displayEmployee(Employee employee) {

    }
}
