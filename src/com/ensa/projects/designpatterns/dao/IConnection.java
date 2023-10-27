package com.ensa.projects.designpatterns.dao;

public interface IConnection {
    void insert(String query);
    void delete(String query);
    void select(String query);
}
