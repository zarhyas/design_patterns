package com.ensa.projects.designpatterns.factory;

import com.ensa.projects.designpatterns.dao.IConnection;
import com.ensa.projects.designpatterns.dao.MySqlConnection;
import com.ensa.projects.designpatterns.dao.PostgreSqlConnection;

public class ConnectionFactory {
    public static IConnection createConnection() {
        // silly example

        String dbType = System.getenv("DB_TYPE");

        if ("PostgreSQL".equals(dbType)) {
            return new PostgreSqlConnection();
        }

        return new MySqlConnection();
    }
}
