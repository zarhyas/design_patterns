package com.ensa.projects.designpatterns.dao;

import com.ensa.projects.designpatterns.beans.Employee;

public interface IDAO {
    void insert(Employee employee);
    void update(Employee employee);
    void delete(int id);
}
