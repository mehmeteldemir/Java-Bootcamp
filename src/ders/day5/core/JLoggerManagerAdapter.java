package ders.day5.core;

import ders.day5.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{


    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
