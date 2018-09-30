package com.pattern.creational.abstractfactory.bank;

import com.pattern.creational.abstractfactory.Developer;
import com.pattern.creational.abstractfactory.ProjectManager;
import com.pattern.creational.abstractfactory.ProjectTeamFactory;
import com.pattern.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
