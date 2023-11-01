package com.ensa.projects.designpatterns.beans;

import java.util.List;

public interface IEmployee {
    void addEmployee(IEmployee employee);
    void removeEmployee(IEmployee employee);
    List<IEmployee> getTeamMembers();
}

