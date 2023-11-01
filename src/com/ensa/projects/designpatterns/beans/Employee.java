package com.ensa.projects.designpatterns.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Cloneable , IEmployee{
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String telephone;
    private String dateNaissance;
    private double salaire;
    private String dateEmbauche;
    private String poste;
    private List<IEmployee> teamMembers = new ArrayList<>();


    // make constructor private
    public Employee(EmployeeBuilder EmployeeEmployeeBuilder) {
        this.id = EmployeeEmployeeBuilder.id;
        this.nom = EmployeeEmployeeBuilder.nom;
        this.prenom = EmployeeEmployeeBuilder.prenom;
        this.adresse = EmployeeEmployeeBuilder.adresse;
        this.email = EmployeeEmployeeBuilder.email;
        this.telephone = EmployeeEmployeeBuilder.telephone;
        this.dateNaissance = EmployeeEmployeeBuilder.dateNaissance;
        this.salaire = EmployeeEmployeeBuilder.salaire;
        this.dateEmbauche = EmployeeEmployeeBuilder.dateEmbauche;
        this.poste = EmployeeEmployeeBuilder.poste;
    }

    public Employee(Employee state) {
        this.id = state.id;
        this.nom = state.nom;
        this.prenom = state.prenom;
        this.adresse = state.adresse;
        this.email = state.email;
        this.telephone = state.telephone;
        this.dateNaissance = state.dateNaissance;
        this.salaire = state.salaire;
        this.dateEmbauche = state.dateEmbauche;
        this.poste = state.poste;

        this.teamMembers = new ArrayList<>();
        for (IEmployee teamMember : state.teamMembers) {
            this.teamMembers.add(new Employee((EmployeeBuilder) teamMember));
        }
    }

    public Employee(int id, String nom) {
    }

    public Employee() {

    }


    @Override
    public void addEmployee(IEmployee employee) {
        teamMembers.add(employee);
    }

    @Override
    public void removeEmployee(IEmployee employee) {
        teamMembers.remove(employee);
    }

    @Override
    public List<IEmployee> getTeamMembers() {
        return Collections.unmodifiableList(teamMembers);
    }

    public static class EmployeeBuilder{
        private int id;
        private String nom;
        private String prenom;
        private String adresse;
        private String email;
        private String telephone;
        private String dateNaissance;
        private double salaire;
        private String dateEmbauche;
        private String poste;

        public EmployeeBuilder(int id, String nom) {
            this.id = id;
            this.nom = nom;
        }

        public EmployeeBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        // other setters

        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    // constructors, getters, setters
}
