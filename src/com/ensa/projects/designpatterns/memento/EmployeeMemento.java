package com.ensa.projects.designpatterns.memento;

import com.ensa.projects.designpatterns.beans.Employee;

public class EmployeeMemento {
    private Employee state;

    public EmployeeMemento(Employee state) {
        this.state = new Employee(state);
        // assuming Employee has a copy constructor
    }

    public Employee getState() {
        return state;
    }
}
