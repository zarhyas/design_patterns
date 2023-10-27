package com.ensa.projects.designpatterns.dao;


import java.sql.Connection;

public class PostgreSqlConnection implements IConnection {

    private Connection connection;

    @Override
    public void insert(String query) {
        // query for insertion
        // connection.execute(query);
    }

    @Override
    public void delete(String query) {
        // query for deletion
        // connection.execute(query);
    }

    @Override
    public void select(String query) {
        // query for selection
        // connection.executeQuery(query);
    }
}

