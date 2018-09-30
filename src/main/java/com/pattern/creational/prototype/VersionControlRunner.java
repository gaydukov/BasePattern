package com.pattern.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project=new Project(123,"EnterpriseProject","Project project=new Project()");
        System.out.println(project);

        System.out.println("\n=====================\n");
        ProjectFactory projectFactory=new ProjectFactory(project);
        Project clonProject=projectFactory.cloneProgject();
        System.out.println(clonProject);
    }
}
