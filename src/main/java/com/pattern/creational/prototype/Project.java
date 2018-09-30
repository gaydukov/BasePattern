package com.pattern.creational.prototype;

public class Project implements Copyable {
    private int id;
    private String namneProject;
    private String sourceCode;

    public Project(int id, String namneProject, String sourceCode) {
        this.id = id;
        this.namneProject = namneProject;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamneProject() {
        return namneProject;
    }

    public void setNamneProject(String namneProject) {
        this.namneProject = namneProject;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Object copy() {
        Project copy=new Project(id,namneProject,sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", namneProject='" + namneProject + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
