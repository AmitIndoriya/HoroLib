//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.util;

import java.util.Date;

public class CSystem {
    public static String strPathLogFile;
    public static String DEBUG = "DEBUG";
    public static String INFO = "INFO";
    public static String WARNING = "WARNING";
    public static String ERRO_R = "ERROR";
    protected static boolean DEBUG_STATUS = true;
    protected static boolean INFO_STATUS = false;
    protected static boolean WARNING_STATUS = true;
    protected static boolean ERROR_STATUS = true;

    public CSystem() {
    }

    public static void Log(String logMessage) {
        new Date();
    }

    public static void out(String ErrorType, String conStr) {
    }

    public void setLogPath(String path) {
        strPathLogFile = path;
    }
}
