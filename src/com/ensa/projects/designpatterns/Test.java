package com.ensa.projects.designpatterns;

import com.ensa.projects.designpatterns.beans.Employee;
import com.ensa.projects.designpatterns.beans.IEmployee;
import com.ensa.projects.designpatterns.dao.*;
import com.ensa.projects.designpatterns.logging.Logger;
import com.ensa.projects.designpatterns.memento.Caretaker;
import com.ensa.projects.designpatterns.service.DummyService;
import com.ensa.projects.designpatterns.service.IService;
import com.ensa.projects.designpatterns.view.EmployeeView;
import com.ensa.projects.designpatterns.view.IView;


public class Test {
    public static void main(String[] args) {

        // proxy
        UserContext userContext = new UserContext();
        IDAO dao = new EmployeeDAO();
        IDAO proxyDao = new DaoProxy(dao, userContext);

        // proxyDao.insert(new Employee();
        // on vérifie si l'User a la permission avant de faire l'opération

        // decorator
        Logger logger = new Logger("db.log");
        IDAO daoWithLogging = new LoggingDAODecorator(dao, logger);

        // composite
        // non args constructor, juste pour demo
        IEmployee teamLeader = new Employee();
        IEmployee teamMember1 = new Employee();
        IEmployee teamMember2 = new Employee();
        teamLeader.addEmployee(teamMember1);
        teamLeader.addEmployee(teamMember2);

        // memento
        Caretaker caretaker = new Caretaker();
        Employee emp = new Employee(/* ... */);
        caretaker.saveState(emp);

        // Retenir l'état
        emp = caretaker.restoreState(0);

        // bridge
        IView view = new EmployeeView();
        IService service = new DummyService(dao, view);
        service.performOperation(new Employee(/* ... */));

    }
}
