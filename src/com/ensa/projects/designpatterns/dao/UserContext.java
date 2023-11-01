package com.ensa.projects.designpatterns.dao;

public class UserContext {
    private static UserContext instance;
    private User currentUser;

    public UserContext() {
        // Private constructor to enforce Singleton pattern
    }

    public static UserContext getInstance() {
        if (instance == null) {
            instance = new UserContext();
        }
        return instance;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }
}

