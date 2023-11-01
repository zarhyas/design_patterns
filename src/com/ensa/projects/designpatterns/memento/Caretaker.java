package com.ensa.projects.designpatterns.memento;

import com.ensa.projects.designpatterns.beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<EmployeeMemento> mementoList = new ArrayList<>();

    public void saveState(Employee employee) {
        mementoList.add(new EmployeeMemento(employee));
    }

    public Employee restoreState(int index) {
        if(index >= 0 && index < mementoList.size()) {
            return mementoList.get(index).getState();
        }
        return null;
    }
}