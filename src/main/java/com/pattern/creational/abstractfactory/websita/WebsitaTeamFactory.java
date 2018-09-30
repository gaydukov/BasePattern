package com.pattern.creational.abstractfactory.websita;

import com.pattern.creational.abstractfactory.Developer;
import com.pattern.creational.abstractfactory.ProjectManager;
import com.pattern.creational.abstractfactory.ProjectTeamFactory;
import com.pattern.creational.abstractfactory.Tester;

/**
 * Created by Маша on 15.09.2018.
 */
public class WebsitaTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitaPM();
    }
}
