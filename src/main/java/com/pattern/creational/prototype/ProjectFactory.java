package com.pattern.creational.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProgject (){
        return (Project) project.copy();
    }
}
