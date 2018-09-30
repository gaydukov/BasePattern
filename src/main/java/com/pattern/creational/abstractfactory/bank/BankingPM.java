package com.pattern.creational.abstractfactory.bank;

import com.pattern.creational.abstractfactory.ProjectManager;

/**
 * Created by Маша on 15.09.2018.
 */
public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
