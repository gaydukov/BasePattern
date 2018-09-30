package com.pattern.creational.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        ProgramLogger.getInstanceProgramLogger().addLogInfo("First log");
        ProgramLogger.getInstanceProgramLogger().addLogInfo("Second log");
        ProgramLogger.getInstanceProgramLogger().addLogInfo("Third log");

        ProgramLogger.getInstanceProgramLogger().showLogFile();
    }
}
