//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.util;

import java.io.Serializable;

public class Util extends SUtil implements Serializable {
    protected String languageCode = "0";

    public Util() {
    }

    public String dms(double x) {
        String[] var3 = new String[3];
        int var4 = (int)x;
        var3[0] = makelength(String.valueOf(var4), 3);
        double var7;
        int x1 = (int)((var7 = x - (double)var4) * 60.0D);
        var3[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var7 *= 60.0D) - (double)x1) * 60.0D + 0.5D);
        var3[2] = makelength(String.valueOf(x1), 2);
        return var3[0] + this.getDashString(1) + var3[1] + this.getDashString(1) + var3[2];
    }

    public String getDashString(int noOfDash) {
        String var2 = "";
        if (this.getLanguageCode().equalsIgnoreCase("0")) {
            var2 = "-";
        } else if (this.getLanguageCode().equalsIgnoreCase("1")) {
            var2 = "&";
        }

        String var3 = "";

        for(int var4 = 0; var4 < noOfDash; ++var4) {
            var3 = var3 + var2;
        }

        return var3;
    }

    public String getDotString() {
        String var1 = "";
        if (this.getLanguageCode().equalsIgnoreCase("0")) {
            var1 = ".";
        } else if (this.getLanguageCode().equalsIgnoreCase("1")) {
            var1 = " + ";
        }

        return var1;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public String getSlashString() {
        String var1 = "";
        if (this.getLanguageCode().equalsIgnoreCase("0")) {
            var1 = "/";
        } else if (this.getLanguageCode().equalsIgnoreCase("1")) {
            var1 = "@";
        }

        return var1;
    }

    public String hms(double x) {
        String[] var3 = new String[3];
        int var4 = (int)x;
        var3[0] = makelength(String.valueOf(var4), 2);
        double var7;
        int x1 = (int)((var7 = x - (double)var4) * 60.0D);
        var3[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var7 *= 60.0D) - (double)x1) * 60.0D);
        var3[2] = makelength(String.valueOf(x1), 2);
        return var3[0] + this.getDotString() + var3[1] + this.getDotString() + var3[2];
    }

    public void setLanguageCode(String language) {
        this.languageCode = language;
    }

    public String ymd(int year, int month, int day) {
        return makespace(String.valueOf(day), 2) + this.getSlashString() + makespace(String.valueOf(month), 2) + this.getSlashString() + makespace(String.valueOf(year), 4).substring(2);
    }

    public String dms1(double x) {
        String[] var3 = new String[3];
        int var4 = (int)x;
        var3[0] = makelength(String.valueOf(var4), 3);
        double var7;
        int x1 = (int)((var7 = x - (double)var4) * 60.0D);
        var3[1] = makelength(String.valueOf(x1), 2);
        x1 = (int)(((var7 *= 60.0D) - (double)x1) * 60.0D);
        var3[2] = makelength(String.valueOf(x1), 2);
        return var3[0] + this.getDashString(1) + var3[1] + this.getDashString(1) + var3[2];
    }

    public String getDasaEndsTerminator() {
        String var1 = "";
        if (this.getLanguageCode().equalsIgnoreCase("0")) {
            var1 = "+";
        } else if (this.getLanguageCode().equalsIgnoreCase("1")) {
            var1 = "+";
        }

        return var1;
    }
}
