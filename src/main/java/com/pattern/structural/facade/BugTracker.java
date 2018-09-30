package com.pattern.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint=true;
    }
    public void finishSorint(){
        System.out.println("Sprint is not active.");
        activeSprint=false;
    }
}
