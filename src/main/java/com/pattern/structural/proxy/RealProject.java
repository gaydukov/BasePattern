package com.pattern.structural.proxy;

public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        Load();
    }

    private void Load(){
        System.out.println("Loading project from "+url+"...");
    }

    public void run() {
        System.out.println("Running project "+url+"...");

    }
}
