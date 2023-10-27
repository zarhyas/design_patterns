package com.ensa.projects.designpatterns.dao;

import com.ensa.projects.designpatterns.factory.ConnectionFactory;

public class EmployeeDAO {
    private IConnection connection;

    public EmployeeDAO() {
        this.connection = ConnectionFactory.createConnection();
    }

    public void addEmployee(String query) {
        connection.insert(query);
    }

    public void deleteEmployee(String query) {
        connection.delete(query);
    }

    public void selectEmployee(String query) {
        connection.select(query);
    }
}

