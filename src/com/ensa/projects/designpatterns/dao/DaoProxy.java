package com.ensa.projects.designpatterns.dao;

import com.ensa.projects.designpatterns.beans.Employee;

public class DaoProxy implements IDAO {
    private IDAO dao;

    private UserContext context;

    public DaoProxy(IDAO dao, UserContext context) {
        this.dao = dao;
        this.context = context;
    }

    private boolean isUserGranted() {
        User user = context.getCurrentUser();
        return user.isGranted();
    }

    @Override
    public void insert(Employee employee) {
        if (isUserGranted()) {
            dao.insert(employee);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void update(Employee employee) {
        if (isUserGranted()) {
            dao.update(employee);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void delete(int id) {
        if (isUserGranted()) {
            dao.delete(id);
        } else {
            throw new RuntimeException();
        }
    }
}

