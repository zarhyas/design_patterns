package com.ensa.projects.designpatterns.dao;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.logging.Logger;

import java.time.LocalDate;

public class LoggingDAODecorator implements IDAO {
    private IDAO wrapped;
    private Logger logger;

    public LoggingDAODecorator(IDAO dao, Logger logger) {
        this.wrapped = dao;
        this.logger = logger;
    }

    @Override
    public void insert(Employee employee) {
        wrapped.insert(employee);
        logger.log("Insertion: " + employee + " on " + LocalDate.now());
    }

    @Override
    public void update(Employee employee) {
        wrapped.update(employee);
        logger.log("Update: " + employee + " on " + LocalDate.now());
    }

    @Override
    public void delete(int id) {
        wrapped.delete(id);
        logger.log("Deletion: Employee ID " + id + " on " + LocalDate.now());
    }
}
