package com.pattern.structural.facade;

public class FacadeWorkFlow {
    Developer developer=new Developer();
    BugTracker bugTracker=new BugTracker();
    Job job=new Job();

    public void solveProblems(){
        job.doJab();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }


}
