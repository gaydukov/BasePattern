package com.pattern.structural.adapter;

/**
 * Created by Маша on 16.09.2018.
 */
public class AdapterJavaToDatabase extends JavaApplicotion implements Database {
    public void insert() {
        saveObject();
    }

    public void update() {
        updataObject();
    }

    public void select() {
        loadObject();
    }

    public void remuve() {
        deletObject();
    }
}
