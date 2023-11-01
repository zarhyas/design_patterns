package com.ensa.projects.designpatterns.dao;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.factory.ConnectionFactory;

public class EmployeeDAO implements IDAO{
    private IConnection connection;

    public EmployeeDAO() {
        this.connection = ConnectionFactory.createConnection();
    }

    public Employee copyEmployee(Employee original) throws CloneNotSupportedException {
        Employee copy = original.clone();

        // modify id and insert in db for e.g.
        // insertEmployee(copy)

        return copy;
    }

    @Override
    public void insert(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}

