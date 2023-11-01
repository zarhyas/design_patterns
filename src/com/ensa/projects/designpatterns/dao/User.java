package com.ensa.projects.designpatterns.dao;

public class User {
    private String username;
    private boolean granted;

    public User(String username, boolean granted) {
        this.username = username;
        this.granted = granted;
    }

    public String getUsername() {
        return username;
    }

    public boolean isGranted() {
        return granted;
    }
}
