package com.ensa.projects.designpatterns.beans;

public class Employee implements Cloneable{
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

    // make constructor private
    private Employee(EmployeeBuilder EmployeeEmployeeBuilder) {
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
