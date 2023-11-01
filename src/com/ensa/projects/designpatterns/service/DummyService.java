package com.ensa.projects.designpatterns.service;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.dao.IDAO;
import com.ensa.projects.designpatterns.view.IView;

// Refined Abstraction
public class DummyService implements IService {
    private IDAO dao;
    private IView view;

    public DummyService(IDAO dao, IView view) {
        this.dao = dao;
        this.view = view;
    }

    @Override
    public void performOperation(Employee employee) {
        dao.insert(employee);
        view.displayEmployee(employee);
    }
}
