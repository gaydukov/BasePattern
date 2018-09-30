package com.pattern.creational.singleton;

public class ProgramLogger {
    private ProgramLogger(){}
    private static ProgramLogger programLogger;
    private  String logFile="This is log file \n\n";

    public static ProgramLogger getInstanceProgramLogger(){
        if(programLogger==null)
            programLogger=new ProgramLogger();
        return programLogger;
    }

    public void addLogInfo(String logInfo){
        logFile+=logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }


}
