package com.ensa.projects.designpatterns.view;

import com.ensa.projects.designpatterns.service.EmployeeService;

public class EmployeeView {
    private EmployeeService employeeService = EmployeeService.getInstance();    // different call


    // we might want to have multiple views
    // for different users or screens
    // in which case we don't need a singleton class

    private static EmployeeView instance;
    private EmployeeView(){}

    public static EmployeeView getInstance(){
        if(instance == null){
            instance = new EmployeeView();
        }
        return instance;
    }


    // methods for displaying employee info
}
