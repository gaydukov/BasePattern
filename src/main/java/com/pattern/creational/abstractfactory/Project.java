package com.pattern.creational.abstractfactory;

import com.pattern.creational.abstractfactory.bank.BankingTeamFactory;
import com.pattern.creational.abstractfactory.websita.WebsitaTeamFactory;

public class Project {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=createTeam("website");
        Developer developer=projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();
        ProjectManager projectManager=projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

    public static ProjectTeamFactory createTeam(String nameProjectTeam){
        if(nameProjectTeam.equalsIgnoreCase("Bank")){
            return new BankingTeamFactory();
        } else if (nameProjectTeam.equalsIgnoreCase("Website")){
            return new WebsitaTeamFactory();
        } else throw new RuntimeException(nameProjectTeam + "is unknowen");
    }
}
