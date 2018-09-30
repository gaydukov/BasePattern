package com.pattern.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new VisitCartWebsiteBuilder());
        Website website=director.buildWebsite();

        System.out.println(website);
    }
}
