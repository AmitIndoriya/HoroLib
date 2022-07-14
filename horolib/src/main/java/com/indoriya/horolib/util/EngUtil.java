//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.util;

public class EngUtil extends SUtil {
    public EngUtil() {
    }

    public static String dms(double x) {
        String[] var2 = new String[3];
        int var3 = (int)x;
        var2[0] = makelength(String.valueOf(var3), 3);
        double var6;
        int x1 = (int)((var6 = x - (double)var3) * 60.0D);
        var2[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var6 *= 60.0D) - (double)x1) * 60.0D + 0.5D);
        var2[2] = makelength(String.valueOf(x1), 2);
        return var2[0] + getDashString(1) + var2[1] + getDashString(1) + var2[2];
    }

    public static String getDashString(int noOfDash) {
        String var1 = "-";
        String var2 = "";

        for(int var3 = 0; var3 < noOfDash; ++var3) {
            var2 = var2 + var1;
        }

        return var2;
    }

    public static String getDotString() {
        return ".";
    }

    public static String getSlashString() {
        return "/";
    }

    public static String hms(double x) {
        String[] var2 = new String[3];
        int var3 = (int)x;
        var2[0] = makelength(String.valueOf(var3), 2);
        double var6;
        int x1 = (int)((var6 = x - (double)var3) * 60.0D);
        var2[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var6 *= 60.0D) - (double)x1) * 60.0D);
        var2[2] = makelength(String.valueOf(x1), 2);
        return var2[0] + getDotString() + var2[1] + getDotString() + var2[2];
    }

    public static String ymd(int year, int month, int day) {
        return makespace(String.valueOf(day), 2) + getSlashString() + makespace(String.valueOf(month), 2) + getSlashString() + makespace(String.valueOf(year), 4).substring(2);
    }

    public static String dms1(double x) {
        String[] var2 = new String[3];
        int var3 = (int)x;
        var2[0] = makelength(String.valueOf(var3), 3);
        double var6;
        int x1 = (int)((var6 = x - (double)var3) * 60.0D);
        var2[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var6 *= 60.0D) - (double)x1) * 60.0D);
        var2[2] = makelength(String.valueOf(x1), 2);
        return var2[0] + getDashString(1) + var2[1] + getDashString(1) + var2[2];
    }

    public static String getDasaEndsTerminator() {
        return "+";
    }
}
