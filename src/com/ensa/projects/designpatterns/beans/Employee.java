package com.ensa.projects.designpatterns.beans;

public class Employee implements Cloneable{
    private int id;
    private String nom;

    public Employee(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    // constructors, getters, setters
}
