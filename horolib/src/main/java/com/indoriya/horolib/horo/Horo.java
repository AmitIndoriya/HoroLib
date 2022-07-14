//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.horo;

import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.Util;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Vector;

public class Horo implements IHoro, Serializable {
    private String e = "0";
    protected Util util = new Util();
    public int[][] plsig = new int[13][13];
    public double[] plnt = new double[26];
    protected double[] plntkp = new double[12];
    protected double[] jupc = new double[4];
    protected double[] satc = new double[4];
    protected double[] tt = new double[4];
    protected double[] f2 = new double[12];
    protected double[] f3 = new double[12];
    protected double[] f4 = new double[12];
    protected int[] totalAshtavarga = new int[12];
    protected int ayanamsaType;
    protected int kpAyanamsaType;
    protected int latitudeType;
    protected double[] f5 = new double[12];
    protected double[] f6 = new double[12];
    protected double ps;
    protected double pt;
    protected double z1;
    protected double z2;
    protected double b6;
    protected double s1;
    protected double lat;
    protected double longt;
    protected double aya;
    protected double kpaya;
    protected double obliq;
    protected double sidtime;
    protected double h6;
    protected double rise;
    protected double set;
    protected double sRA;
    protected double sdec;
    protected double sr;
    protected double birthTime;
    protected double customizedAyan;
    protected int ret = 0;
    protected int page = 1;
    protected int line;
    protected int[] r3 = new int[13];
    protected int[] s3 = new int[13];
    protected int[] house1 = new int[12];
    protected int[][] varga = new int[13][16];
    protected String companyName;
    protected String companyAddressLine1;
    protected String userName;
    protected String place;
    protected String sex;
    protected int d;
    protected int m;
    protected int y;
    protected int horarySeed;
    protected int i;
    protected int h;
    protected int mt;
    protected int s;
    protected int latdeg;
    protected int latmt;
    protected int longdeg;
    protected int longmt;
    protected int longsec;
    protected int latsec;
    protected int dst;
    protected int julDay;
    protected int vedicDay;
    protected int daylor;
    public int j;
    protected char ns;
    protected char ew;
    protected float timeZone;
    protected int kundliType;
    protected int entryYear;
    protected String entryMonth;
    protected int exitMonthInNo;
    protected int entryMonthInNo;
    protected int entryDay;
    protected int entryHour;
    protected int entryMinute;
    protected int entrySecond;
    protected int exitYear;
    protected String exitMonth;
    protected int exitDay;
    protected int exitHour;
    protected int exitMinute;
    protected int exitSecond;
    protected int nakNo;
    protected String nakshatra;
    protected final double[] y1 = new double[]{7.0D, 20.0D, 6.0D, 10.0D, 7.0D, 18.0D, 16.0D, 19.0D, 17.0D};
    protected int own = 0;
    protected int ra;
    protected double fortuna;
    protected double aa;
    protected String tmp;
    protected String pp;
    protected int a;
    protected int f;
    protected int part;
    protected int na;
    protected int b;
    protected int c;
    protected String[] tt2 = new String[5];
    protected int[] owner = new int[12];
    protected int[][] ashtakArray = new int[7][12];
    protected int[][][] prastakvarga = new int[8][8][13];
    protected int planetNo = 1;
    protected int tableNo = 1;
    protected String[] day = new String[7];
    protected String[] daylrd = new String[7];
    protected String[] ras = new String[12];
    protected String[] raslrd = new String[12];
    protected String[] naklrd = new String[9];
    protected String[] tit = new String[30];
    protected String[] nak = new String[27];
    protected String[] yog = new String[27];
    protected String[] x1 = new String[9];
    protected String[] graha = new String[13];
    protected String[] bhavanum = new String[12];
    protected String[] Karan = new String[60];
    protected String[] paksha = new String[2];
    protected String[] div = new String[16];
    protected String[] mangalDosh = new String[4];
    protected String[] gana = new String[3];
    protected String[] vasya = new String[6];
    protected String ayan;
    protected String[] paya = new String[4];
    protected String[] Deb = new String[12];
    protected String[] Exal = new String[12];
    protected String[] aspects = new String[7];
    protected String[] planetNameVim = new String[9];
    protected String[] planetName = new String[9];
    protected String[] outcomes = new String[6];
    protected String[] nadi = new String[3];
    protected String[] varna = new String[4];
    protected String[] yoni = new String[14];
    protected String[] x9 = new String[9];

    public Horo() {
    }

    public void setHoro(String day, String month, String year, String hrs, String min, String sec, String latDeg, String latMin, String latNS, String longDeg, String longMin, String longEW, String timeZone) {
        this.setCompanyName("CSL SOFTWARE LTD., G-4A, Green park Extn., New Delhi-110 016");
        this.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
        this.setName("punit");
        this.setPlace("agra");
        this.setTimeZone(timeZone);
        this.setMaleFemale("M");
        this.setSecondOfBirth(sec);
        this.setMinuteOfBirth(min);
        this.setHourOfBirth(hrs);
        this.setDayOfBirth(day);
        this.setMonthOfBirth(month);
        this.setYearOfBirth(year);
        this.setDegreeOfLattitude(latDeg);
        this.setDegreeOfLongitude(longDeg);
        this.setSecondOfLattitude("00");
        this.setSecondOfLongitude("00");
        this.setMinuteOfLongitude(longMin);
        this.setMinuteOfLattitude(latMin);
        this.setEastWest(longEW);
        this.setNorthSouth(latNS);
        this.setLanguageCode("0");
        this.setDST("0");
        this.setAyanamsaType(1);
        this.setLanguageCode("0");
    }

    public int akshvedamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 45; ++var2) {
            if ((double)var2 * 0.666666666667D <= var4 && var4 < (double)(var2 + 1) * 0.666666666667D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = var6 + 1;
            break;
        case 2:
        case 5:
        case 8:
        case 11:
            var3 = var6 + 5;
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            var3 = var6 + 9;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    protected void ashaccu() {
        for(int var1 = 1; var1 <= 12; ++var1) {
            int[] var10000 = this.s3;
            var10000[var1] += this.r3[var1];
            this.r3[var1] = 0;
        }

    }

    protected void ashaccu(int row) {
        for(int var2 = 1; var2 <= 12; ++var2) {
            int[] var10000 = this.s3;
            var10000[var2] += this.r3[var2];
            this.ashtakArray[row][var2 - 1] = this.r3[var2];
            this.r3[var2] = 0;
        }

    }

    protected void ashcomp(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int n) {
        int var14 = 0;
        int[] var15;
        (var15 = new int[13])[1] = a;
        var15[2] = b;
        var15[3] = c;
        var15[4] = d;
        var15[5] = e;
        var15[6] = f;
        var15[7] = g;
        var15[8] = h;
        var15[9] = i;
        var15[10] = j;
        var15[11] = k;
        var15[12] = l;

        for(b = 1; b <= 12; ++b) {
            if ((a = n + b - 1) > 12) {
                a -= 12;
            }

            this.prastakvarga[this.tableNo - 1][this.planetNo - 1][a - 1] = var15[b];
            var14 += var15[b];
            int[] var10000 = this.r3;
            var10000[a] += var15[b];
        }

        this.prastakvarga[this.tableNo - 1][this.planetNo - 1][12] = var14;
        ++this.planetNo;
    }

    protected void ashtak() {
        this.tableNo = 1;
        this.planetNo = 1;

        int var1;
        for(var1 = 1; var1 <= 12; ++var1) {
            this.s3[var1] = 0;
        }

        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[1][0]);
        this.ashcomp(0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, this.varga[2][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[3][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, this.varga[4][0]);
        this.ashcomp(0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, this.varga[5][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, this.varga[6][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[7][0]);
        this.ashcomp(0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(0);
        this.ashcomp(0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, this.varga[1][0]);
        this.ashcomp(1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, this.varga[2][0]);
        this.ashcomp(0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, this.varga[3][0]);
        this.ashcomp(1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, this.varga[4][0]);
        this.ashcomp(1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, this.varga[5][0]);
        this.ashcomp(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, this.varga[6][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, this.varga[7][0]);
        this.ashcomp(0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(1);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, this.varga[1][0]);
        this.ashcomp(0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, this.varga[2][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, this.varga[3][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, this.varga[4][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, this.varga[5][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, this.varga[6][0]);
        this.ashcomp(1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[7][0]);
        this.ashcomp(1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(2);
        this.ashcomp(0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, this.varga[1][0]);
        this.ashcomp(0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, this.varga[2][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[3][0]);
        this.ashcomp(1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, this.varga[4][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, this.varga[5][0]);
        this.ashcomp(1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, this.varga[6][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[7][0]);
        this.ashcomp(1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(3);
        this.ashcomp(1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, this.varga[1][0]);
        this.ashcomp(0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, this.varga[2][0]);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, this.varga[3][0]);
        this.ashcomp(1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, this.varga[4][0]);
        this.ashcomp(1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, this.varga[5][0]);
        this.ashcomp(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, this.varga[6][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, this.varga[7][0]);
        this.ashcomp(1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(4);
        this.ashcomp(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, this.varga[1][0]);
        this.ashcomp(1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, this.varga[2][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, this.varga[3][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, this.varga[4][0]);
        this.ashcomp(0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, this.varga[5][0]);
        this.ashcomp(1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, this.varga[6][0]);
        this.ashcomp(0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, this.varga[7][0]);
        this.ashcomp(1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, this.varga[0][0]);
        ++this.tableNo;
        this.planetNo = 1;
        this.ashaccu(5);
        this.ashcomp(1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, this.varga[1][0]);
        this.ashcomp(0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, this.varga[2][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, this.varga[3][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, this.varga[4][0]);
        this.ashcomp(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, this.varga[5][0]);
        this.ashcomp(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, this.varga[6][0]);
        this.ashcomp(0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, this.varga[7][0]);
        this.ashcomp(1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, this.varga[0][0]);
        this.ashaccu(6);
        var1 = 0;

        for(int var2 = 0; var2 < 12; ++var2) {
            for(int var3 = 0; var3 < 7; ++var3) {
                var1 += this.ashtakArray[var3][var2];
            }

            this.totalAshtavarga[var2] = var1;
            var1 = 0;
        }

    }

    protected void ayan() {
        this.plnt[0] = 22.460148D + 1.396042D * this.b6 + 3.08E-4D * this.b6 * this.b6;
        this.aya = this.plnt[0];
    }

    public double getAsc() {
        return this.f2[0];
    }

    protected void bahvgnl(double j0, double k0, int u) {
        for(int var6 = 0; var6 < 3; ++var6) {
            double var8;
            if ((var8 = j0 + k0 * (double)var6) >= 360.0D) {
                var8 -= 360.0D;
            }

            int var7 = u + var6 - 1;
            this.f2[var7] = var8;
        }

    }

    protected boolean between(double gdeg, double adeg, double orbdeg) {
        double var7 = adeg - orbdeg;
        double var9 = adeg + orbdeg;
        return gdeg > var7 && gdeg < var9;
    }

    public static int bhamsa(double deg) {
        int var2 = 0;
        double var3 = deg % 30.0D;
        int var5 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var1 = 0; var1 < 27; ++var1) {
            if ((double)var1 * 1.111111111111D <= var3 && var3 < (double)(var1 + 1) * 1.111111111111D) {
                var5 = var1;
            }
        }

        switch(deg1) {
        case 1:
        case 5:
        case 9:
            var2 = var5 + 1;
            break;
        case 2:
        case 6:
        case 10:
            var2 = var5 + 4;
            break;
        case 3:
        case 7:
        case 11:
            var2 = var5 + 7;
            break;
        case 4:
        case 8:
        case 12:
            var2 = var5 + 10;
        }

        if ((var2 %= 12) == 0) {
            var2 = 12;
        }

        return var2;
    }

    protected void bhavInit() {
        this.aya = this.plnt[0];
        this.obliq = 23.452294D - 0.0130125D * this.b6;
        double var1 = 24.0D * Util.fract(0.2769D + 100.00214D * this.b6);
        double var3 = this.h6 * 24.0D + 12.0D;
        double var5 = this.longt / 15.0D;
        this.sidtime = 24.0D * Util.fract((var1 + var3 + var5) / 24.0D);
        if (this.sidtime < 0.0D) {
            this.sidtime += 24.0D;
        }

        var1 = this.bhavspl(this.sidtime, this.lat);
        var3 = this.bhavspl(this.sidtime - 6.0D, 0.0D);
        var5 = (var3 + 180.0D - var1) / 3.0D;
        if (var3 > var1) {
            var5 -= 120.0D;
        }

        double var7 = 60.0D - var5;
        this.bahvgnl(var1, var5, 1);
        this.bahvgnl(var3 + 180.0D, var7, 4);
        this.bahvgnl(var1 + 180.0D, var5, 7);
        this.bahvgnl(var3, var7, 10);
        this.f3[0] = (this.f2[11] + this.f2[0]) / 2.0D;
        double[] var10000;
        if (this.f2[0] < this.f2[11]) {
            var10000 = this.f3;
            var10000[0] += 180.0D;
        }

        if (this.f3[0] >= 360.0D) {
            var10000 = this.f3;
            var10000[0] -= 360.0D;
        }

        for(int var9 = 1; var9 < 12; ++var9) {
            this.f3[var9] = (this.f2[var9 - 1] + this.f2[var9]) / 2.0D;
            if (this.f2[var9] < this.f2[var9 - 1]) {
                var10000 = this.f3;
                var10000[var9] += 180.0D;
            }

            if (this.f3[var9] > 360.0D) {
                var10000 = this.f3;
                var10000[var9] -= 360.0D;
            }
        }

    }

    protected double bhavspl(double a0, double c0) {
        double var5 = this.aya;
        double var7 = this.obliq * this.z2;
        double var9;
        if ((var9 = a0 * 15.0D + 90.0D) >= 360.0D) {
            var9 -= 360.0D;
        }

        a0 *= this.z1 / 12.0D;
        c0 *= this.z2;
        if (a0 == 0.0D && c0 == 0.0D) {
            return 90.0D;
        } else {
            double var11;
            if ((var11 = Math.atan(-Math.cos(a0) / (Math.sin(c0) * Math.sin(var7) / Math.cos(c0) + Math.sin(a0) * Math.cos(var7))) / this.z2) < 0.0D) {
                var11 += 180.0D;
            }

            if (var9 - var11 > 75.0D) {
                var11 += 180.0D;
            }

            if ((var11 -= var5) < 0.0D) {
                var11 += 360.0D;
            }

            if (var11 > 360.0D) {
                var11 -= 360.0D;
            }

            return var11;
        }
    }

    protected void calcSunRiseSet(int yy, int mm, int dd, double lon, double lat) {
        double var18 = 0.0D;
        double var8 = (double)(367L * (long)yy - (long)(7 * (yy + (mm + 9) / 12) / 4) + (long)(mm * 275 / 9) + (long)dd - 730530L) + 0.5D - lon / 360.0D;
        double var16 = this.revolution(this.GMST0(var8) + 180.0D + lon);
        this.sun_RA_dec(var8);
        double var14 = 12.0D - this.rev180(var16 - this.sRA) / 15.0D;
        double var10 = 0.2666D / this.sr;
        double var12;
        double var20;
        if ((var20 = (Math.sin((var18 = -0.5833333333333334D - var10) * 0.017453292519943295D) - Math.sin(lat * 0.017453292519943295D) * Math.sin(this.sdec * 0.017453292519943295D)) / (Math.cos(lat * 0.017453292519943295D) * Math.cos(this.sdec * 0.017453292519943295D))) >= 1.0D) {
            var12 = 0.0D;
        } else if (var20 <= -1.0D) {
            var12 = 12.0D;
        } else {
            var12 = 57.29577951308232D * Math.acos(var20) / 15.0D;
        }

        this.rise = var14 - var12;
        this.set = var14 + var12;
        this.rise += (double)this.timeZone;
        this.set += (double)this.timeZone;
    }

    protected double[] calcSunRiseSet(int yy, int mm, int dd, double lon, double lat, boolean upper_limb) {
        double var23 = -0.5833333333333334D;
        double var9 = (double)(367L * (long)yy - (long)(7 * (yy + (mm + 9) / 12) / 4) + (long)(mm * 275 / 9) + (long)dd - 730530L) + 0.5D - lon / 360.0D;
        double var17 = this.revolution(this.GMST0(var9) + 180.0D + lon);
        this.sun_RA_dec(var9);
        double var15 = 12.0D - this.rev180(var17 - this.sRA) / 15.0D;
        double var11 = 0.2666D / this.sr;
        if (upper_limb) {
            var23 = -0.5833333333333334D - var11;
        }

        double var13;
        double var25;
        if ((var25 = (Math.sin(var23 * 0.017453292519943295D) - Math.sin(lat * 0.017453292519943295D) * Math.sin(this.sdec * 0.017453292519943295D)) / (Math.cos(lat * 0.017453292519943295D) * Math.cos(this.sdec * 0.017453292519943295D))) >= 1.0D) {
            var13 = 0.0D;
        } else if (var25 <= -1.0D) {
            var13 = 12.0D;
        } else {
            var13 = 57.29577951308232D * Math.acos(var25) / 15.0D;
        }

        double var19 = var15 - var13;
        double var21 = var15 + var13;
        var19 += (double)this.timeZone;
        var21 += (double)this.timeZone;
        return new double[]{var19, var21};
    }

    public void calculateAvakadha() {
        double var3 = 24.0D * Util.fract(0.2769D + 100.00214D * this.b6);
        double var5 = this.h6 * 24.0D + 12.0D;
        double var7 = this.longt / 15.0D;
        this.sidtime = 24.0D * Util.fract((var3 + var5 + var7) / 24.0D);
        if (this.sidtime < 0.0D) {
            this.sidtime += 24.0D;
        }

        this.ra = (int)this.tt[3];
        int[] var10000 = new int[]{0, 2, 1, 3, 0, 2, 1, 3, 0, 2, 1, 3};
        this.na = (int)this.tt[1] + 1;

        for(int var1 = 0; var1 < 3; ++var1) {
            for(int var2 = 0; var2 < 9 && Constants.igana[var1][var2] != this.na; ++var2) {
            }
        }

        this.part = (int)(4.0D * Util.fract(this.tt[1]) + 1.0D);
    }

    protected void calculateKPCusp() {
        double var2 = this.aya;
        this.plnt[0] = this.kpaya;
        this.aya = this.kpaya;

        for(int var1 = 0; var1 < 12; ++var1) {
            double[] var10000;
            if (this.f4[var1] >= 360.0D) {
                var10000 = this.f4;
                var10000[var1] -= 360.0D;
            }

            if (this.f4[var1] < 0.0D) {
                var10000 = this.f4;
                var10000[var1] += 360.0D;
            }
        }

        this.aya = var2;
        this.plnt[0] = var2;
    }

    protected void calculateShodashvarga() {
        this.vgcomp("LAGNA   ", this.f2[0], 0);
        this.vgcomp("SUN      ", this.plnt[1], 1);
        this.vgcomp("MOON    ", this.plnt[2], 2);
        this.vgcomp("MARS    ", this.plnt[3], 3);
        this.vgcomp("MERCURY\t  ", this.plnt[4], 4);
        this.vgcomp("JUPITER ", this.plnt[5], 5);
        this.vgcomp("VENUS   ", this.plnt[6], 6);
        this.vgcomp("SATURN\t  ", this.plnt[7], 7);
        this.vgcomp("RAHU\t  ", this.plnt[8], 8);
        this.vgcomp("KETU\t  ", this.plnt[9], 9);
        this.vgcomp("URANUS  ", this.plnt[10], 10);
        this.vgcomp("NEPTUNE ", this.plnt[11], 11);
        this.vgcomp("PLUTO   ", this.plnt[12], 12);

        int var1;
        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][1] = this.getHora(this.f2[var1]);
            } else {
                this.varga[var1][1] = this.getHora(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][2] = this.getDrekkana(this.f2[var1]);
            } else {
                this.varga[var1][2] = this.getDrekkana(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][3] = this.getChaturtamsa(this.f2[var1]);
            } else {
                this.varga[var1][3] = this.getChaturtamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][4] = this.getSaptamsa(this.f2[var1]);
            } else {
                this.varga[var1][4] = this.getSaptamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][6] = this.getDasamsa(this.f2[var1]);
            } else {
                this.varga[var1][6] = this.getDasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][7] = this.getDwadasamsa(this.f2[var1]);
            } else {
                this.varga[var1][7] = this.getDwadasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][8] = this.getShodasamsa(this.f2[var1]);
            } else {
                this.varga[var1][8] = this.getShodasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][9] = this.getVimshamsa(this.f2[var1]);
            } else {
                this.varga[var1][9] = this.getVimshamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][10] = this.getSiddhamsa(this.f2[var1]);
            } else {
                this.varga[var1][10] = this.getSiddhamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][11] = this.getBhamsa(this.f2[var1]);
            } else {
                this.varga[var1][11] = this.getBhamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][12] = this.getTrimshamsa(this.f2[var1]);
            } else {
                this.varga[var1][12] = this.getTrimshamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][13] = this.getKhavedamsa(this.f2[var1]);
            } else {
                this.varga[var1][13] = this.getKhavedamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][14] = this.getAkshvedamsa(this.f2[var1]);
            } else {
                this.varga[var1][14] = this.getAkshvedamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][15] = this.getShastiamsa(this.f2[var1]);
            } else {
                this.varga[var1][15] = this.getShastiamsa(this.plnt[var1]);
            }
        }

    }

    public void calculateSigBhav() {
        double var10 = 0.0D;

        int var1;
        int var3;
        for(var1 = 1; var1 <= 12; ++var1) {
            for(var3 = 1; var3 <= 12; ++var3) {
                this.plsig[var1][var3] = 0;
            }
        }

        for(int var2 = 1; var2 <= 12; ++var2) {
            double var6 = this.f4[var2 - 1];
            double var8;
            if ((var8 = var2 >= 12 ? this.f4[var2 - 12] : this.f4[var2]) < var6) {
                var10 = var8;
                var8 += 360.0D;
            }

            var1 = (int)(var6 / 30.0D);
            var1 = Constants.rlp[var1] - 48;
            this.plsig[var1][var2] = 1;

            for(var3 = 1; var3 <= 12; ++var3) {
                double var12 = this.plnt[var3];
                if (var10 != 0.0D && var12 < var10) {
                    var12 += 360.0D;
                    var10 = 0.0D;
                }

                if (var12 >= var6 && var12 < var8) {
                    this.plsig[var3][var2] = 1;
                }
            }

            this.owner[var2 - 1] = var1;
        }

    }

    public int chaturtamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 4; ++var2) {
            if ((double)var2 * 7.5D <= var4 && var4 < (double)(var2 + 1) * 7.5D) {
                var6 = var2 + 1;
            }
        }

        switch(var6) {
        case 1:
            var3 = deg1;
            break;
        case 2:
            var3 = deg1 + 3;
            break;
        case 3:
            var3 = deg1 + 6;
            break;
        case 4:
            var3 = deg1 + 9;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    protected void cusp() {
        new StringBuffer();
        double var8 = this.obliq * this.z2;
        double var10 = this.aya;
        this.plnt[0] = this.kpaya;
        this.aya = this.kpaya;
        double var2;
        double var4 = Math.atan(Math.sin((var2 = Math.asin(Math.tan(var8) * Math.tan(this.lat * this.z2))) / 3.0D) / Math.tan(var8));
        double var6 = Math.atan(Math.sin(var2 * 2.0D / 3.0D) / Math.tan(var8));
        var4 /= this.z2;
        var6 /= this.z2;
        this.f4[0] = this.bhavspl(this.sidtime, this.lat);
        this.f4[9] = this.bhavspl(this.sidtime - 6.0D, 0.0D);
        this.f4[10] = this.bhavspl(this.sidtime - 4.0D, var4);
        this.f4[11] = this.bhavspl(this.sidtime - 2.0D, var6);
        this.f4[1] = this.bhavspl(this.sidtime + 2.0D, var6);
        this.f4[2] = this.bhavspl(this.sidtime + 4.0D, var4);

        for(int var1 = 0; var1 < 3; ++var1) {
            this.f4[var1 + 3] = this.f4[var1 + 9] - 180.0D;
            this.f4[var1 + 6] = this.f4[var1] + 180.0D;
        }

        boolean var12 = false;

        double[] var10000;
        int var13;
        for(var13 = 0; var13 < 12; ++var13) {
            if (Double.isNaN(this.f4[var13])) {
                var12 = true;
                break;
            }

            if (this.f4[var13] < 0.0D) {
                var10000 = this.f4;
                var10000[var13] += 360.0D;
            } else if (this.f4[var13] > 360.0D) {
                var10000 = this.f4;
                var10000[var13] -= 360.0D;
            }
        }

        if (var12) {
            for(var13 = 1; var13 < 12; ++var13) {
                this.f4[var13] = this.f4[0] + 30.0D * (double)var13;
                if (this.f4[var13] >= 360.0D) {
                    var10000 = this.f4;
                    var10000[var13] -= 360.0D;
                }
            }
        }

        this.aya = var10;
        this.plnt[0] = var10;
    }

    protected void customizedAyan() {
        double var1 = this.plnt[0] - this.customizedAyan;

        for(int var3 = 1; var3 < 26; ++var3) {
            if (var3 != 13) {
                double[] var10000 = this.plnt;
                var10000[var3] += var1;
                if (this.plnt[var3] >= 360.0D) {
                    var10000 = this.plnt;
                    var10000[var3] -= 360.0D;
                }

                if (this.plnt[var3] < 0.0D) {
                    var10000 = this.plnt;
                    var10000[var3] += 360.0D;
                }
            }
        }

        this.plnt[0] = this.customizedAyan;
        this.aya = this.customizedAyan;
    }

    protected int getAkshvedamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 45; ++var2) {
            if ((double)var2 * 0.666666666667D <= var4 && var4 < (double)(var2 + 1) * 0.666666666667D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = var6 + 1;
            break;
        case 2:
        case 5:
        case 8:
        case 11:
            var3 = var6 + 5;
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            var3 = var6 + 9;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public Enumeration getAllTimeZones() {
        String[] var1 = TimeZone.getAvailableIDs();
        Vector var2 = new Vector();

        for(int var3 = 0; var3 < var1.length; ++var3) {
            if ((float)((double)TimeZone.getTimeZone(var1[var3]).getRawOffset() / 3600000.0D) == this.timeZone) {
                var2.addElement(var1[var3]);
            }
        }

        return var2.elements();
    }

    public int getAyanamsaType() {
        return this.ayanamsaType;
    }

    protected int getBhamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 27; ++var2) {
            if ((double)var2 * 1.111111111111D <= var4 && var4 < (double)(var2 + 1) * 1.111111111111D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 1:
        case 5:
        case 9:
            var3 = var6 + 1;
            break;
        case 2:
        case 6:
        case 10:
            var3 = var6 + 4;
            break;
        case 3:
        case 7:
        case 11:
            var3 = var6 + 7;
            break;
        case 4:
        case 8:
        case 12:
            var3 = var6 + 10;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    protected int getBhavNo(int planetRasi, int lagnaRasi) {
        new StringBuffer();
        if (planetRasi == 0) {
            planetRasi = 12;
        }

        if ((planetRasi = planetRasi - lagnaRasi + 1) <= 0) {
            planetRasi += 12;
        }

        return planetRasi;
    }

    protected int getChaturtamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 4; ++var2) {
            if ((double)var2 * 7.5D <= var4 && var4 < (double)(var2 + 1) * 7.5D) {
                var6 = var2 + 1;
            }
        }

        switch(var6) {
        case 1:
            var3 = deg1;
            break;
        case 2:
            var3 = deg1 + 3;
            break;
        case 3:
            var3 = deg1 + 6;
            break;
        case 4:
            var3 = deg1 + 9;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public String getCompanyAddLine1() {
        return this.companyAddressLine1;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    protected int getDasamsa(double deg) {
        int var3 = 0;
        int var4;
        int var5 = (var4 = (var4 = (int)deg) / 30 + 1) % 2;
        int deg1 = (int)deg % 30;
        int var2 = 0;

        for(double var8 = 0.0D; var8 <= 10.0D; ++var8) {
            if (var8 * 3.0D <= (double)deg1 && (double)deg1 < (var8 + 1.0D) * 3.0D) {
                var2 = (int)var8;
                break;
            }
        }

        if (var5 > 0) {
            var3 = (var4 + var2) % 12;
        }

        if (var5 == 0) {
            var3 = (var4 + 8 + var2) % 12;
        }

        if (var3 == 0) {
            var3 = 12;
        }

        return var3;
    }

    public int getDayOfBirth() {
        return this.d;
    }

    public String getDegreeOfLattitude() {
        return (new Integer(this.latdeg)).toString();
    }

    public String getDegreeOfLongitude() {
        return (new Integer(this.longdeg)).toString();
    }

    public int getDrekkana(double deg) {
        int var3 = 0;
        int var6 = (int)deg;
        double var4 = deg % 30.0D;
        var6 /= 30;
        if (0.0D <= var4 && var4 < 10.0D) {
            var3 = var6 + 1;
        }

        if (10.0D <= var4 && var4 < 20.0D) {
            var3 = var6 + 5;
        }

        if (20.0D <= var4 && var4 <= 30.0D) {
            var3 = var6 + 9;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public String getDST() {
        return (new Integer(this.dst)).toString();
    }

    public int getDstWRTTimeZone(String timeZone1) {
        TimeZone timeZone11 = TimeZone.getTimeZone(timeZone1);
        return (new GregorianCalendar(timeZone11)).get(16) / 3600000;
    }

    protected int getDwadasamsa(double deg) {
        int var3 = (var3 = (int)deg) / 30 + 1;
        double var5 = deg % 30.0D;
        int deg1 = 0;

        for(double var8 = 0.0D; var8 <= 12.0D; ++var8) {
            if (var8 * 2.5D <= var5 && var5 < (var8 + 1.0D) * 2.5D) {
                deg1 = (int)var8;
                break;
            }
        }

        if ((deg1 = (var3 + deg1) % 12) == 0) {
            deg1 = 12;
        }

        return deg1;
    }

    public String getEastWest() {
        return String.valueOf(this.ew);
    }

    protected int getHora(double deg) {
        byte var3 = 0;
        byte var4 = 0;
        double var5 = deg;
        int deg1;
        if ((deg1 = ((deg1 = (int)deg) / 30 + 1) % 2) == 0) {
            var4 = 0;
        }

        if (deg1 > 0) {
            var4 = 1;
        }

        if ((deg1 = (int)var5 % 30) < 15 && var4 == 0) {
            var3 = 4;
        }

        if (deg1 < 15 && var4 > 0) {
            var3 = 5;
        }

        if (deg1 >= 15 && var4 == 0) {
            var3 = 5;
        }

        if (deg1 >= 15 && var4 > 0) {
            var3 = 4;
        }

        return var3;
    }

    public int getHoroscopeStyle() {
        return this.kundliType;
    }

    public String getHourOfBirth() {
        return (new Integer(this.h)).toString();
    }

    public double getJupitor() {
        return this.plnt[5];
    }

    public int getKaran() {
        double var1;
        if ((var1 = this.plnt[2] - this.plnt[1]) < 0.0D) {
            var1 += 360.0D;
        }

        return (int)(var1 / 6.0D);
    }

    public double getKetu() {
        return this.plnt[9];
    }

    protected int getKhavedamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = ((int)(deg / 30.0D) + 1) % 2;

        for(int var2 = 0; var2 < 40; ++var2) {
            if ((double)var2 * 0.75D <= var4 && var4 < (double)(var2 + 1) * 0.75D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 0:
            var3 = var6 + 7;
            break;
        case 1:
            var3 = var6 + 1;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public int getKPAyanamsaType() {
        return this.kpAyanamsaType;
    }

    public int getKPHorarySeed() {
        return this.horarySeed;
    }

    public String getLanguageCode() {
        return this.e;
    }

    public int getLatitudeType() {
        return this.latitudeType;
    }

    public String getMaleFemale() {
        return this.sex;
    }

    public double getMars() {
        return this.plnt[3];
    }

    public double getMercury() {
        return this.plnt[4];
    }

    public String getMinuteOfBirth() {
        return (new Integer(this.mt)).toString();
    }

    public String getMinuteOfLattitude() {
        return (new Integer(this.latmt)).toString();
    }

    public String getMinuteOfLongitude() {
        return (new Integer(this.longmt)).toString();
    }

    public int getMonthOfBirth() {
        return this.m;
    }

    public double getMoon() {
        return this.plnt[2];
    }

    protected int getMuntha(int varshYear) {
        int var2 = (int)(this.f2[0] / 30.0D) + 1;
        if ((varshYear = varshYear % 12 + var2) > 12) {
            varshYear -= 12;
        } else {
            varshYear = varshYear;
        }

        return varshYear - var2 + 1;
    }

    public String getName() {
        return this.userName;
    }

    public double getNeptune() {
        return this.plnt[11];
    }

    public String getNorthSouth() {
        return String.valueOf(this.ns);
    }

    public String getPlace() {
        return this.place;
    }

    public double getPluto() {
        return this.plnt[12];
    }

    public double getRahu() {
        return this.plnt[8];
    }

    protected int getSaptamsa(double deg) {
        int var3 = 0;
        int var4;
        int var5 = (var4 = (var4 = (int)deg) / 30 + 1) % 2;
        int deg1 = (int)deg % 30;
        int var2 = 0;

        for(double var8 = 0.0D; var8 <= 7.0D; ++var8) {
            if (var8 * 4.2857138D <= (double)deg1 && (double)deg1 < (var8 + 1.0D) * 4.2857138D) {
                var2 = (int)var8;
                break;
            }
        }

        if (var5 > 0) {
            var3 = (var4 + var2) % 12;
        }

        if (var5 == 0) {
            var3 = (var4 + 6 + var2) % 12;
        }

        return var3;
    }

    public double getSaturn() {
        return this.plnt[7];
    }

    public double[] getPlanetaryDegree() {
        return this.plnt;
    }

    public String getSecondOfBirth() {
        return (new Integer(this.s)).toString();
    }

    public String getSecondOfLattitude() {
        return (new Integer(this.latsec)).toString();
    }

    public String getSecondOfLongitude() {
        return (new Integer(this.longsec)).toString();
    }

    protected int getShastiamsa(double deg) {
        double var4;
        int var3 = (int)(var4 = deg * 2.0D);
        int deg1;
        if ((deg1 = ((deg1 = (int)deg) / 30 + 1 + var3) % 12) == 0) {
            deg1 = 12;
        }

        return deg1;
    }

    protected int getShodasamsa(double deg) {
        byte var3 = 0;
        int var4 = (var4 = (int)deg) / 30 + 1;
        double var6 = deg % 30.0D;
        int deg1 = 0;

        for(double var9 = 0.0D; var9 <= 16.0D; ++var9) {
            if (var9 * 1.875D <= var6 && var6 < (var9 + 1.0D) * 1.875D) {
                deg1 = (int)var9;
                break;
            }
        }

        switch(var4) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = 1;
            break;
        case 2:
        case 5:
        case 8:
        case 11:
            var3 = 5;
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            var3 = 9;
        }

        if ((deg1 = (var3 + deg1) % 12) == 0) {
            deg1 = 12;
        }

        return deg1;
    }

    protected int getSiddhamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = ((int)(deg / 30.0D) + 1) % 2;

        for(int var2 = 0; var2 < 24; ++var2) {
            if ((double)var2 * 1.25D <= var4 && var4 < (double)(var2 + 1) * 1.25D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 0:
            var3 = var6 + 4;
            break;
        case 1:
            var3 = var6 + 5;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public double getSun() {
        return this.plnt[1];
    }

    public String getTimeZone() {
        return (new Float(this.timeZone)).toString();
    }

    protected int getTrimshamsa(double deg) {
        byte var3 = 0;
        int var4 = ((var4 = (int)deg) / 30 + 1) % 2;
        double var6 = deg % 30.0D;
        int deg1 = 0;

        for(double var9 = 0.0D; var9 <= 30.0D; ++var9) {
            if (var9 <= var6 && var6 < var9 + 1.0D) {
                deg1 = (int)var9;
                break;
            }
        }

        if (var4 > 0) {
            if (deg1 < 5) {
                var3 = 1;
            } else if (5 <= deg1 && deg1 < 10) {
                var3 = 11;
            } else if (10 <= deg1 && deg1 < 18) {
                var3 = 9;
            } else if (18 <= deg1 && deg1 < 25) {
                var3 = 3;
            } else if (25 <= deg1 && deg1 < 30) {
                var3 = 7;
            }
        } else if (var4 == 0) {
            if (deg1 < 5) {
                var3 = 2;
            } else if (5 <= deg1 && deg1 < 12) {
                var3 = 6;
            } else if (12 <= deg1 && deg1 < 20) {
                var3 = 12;
            } else if (20 <= deg1 && deg1 < 25) {
                var3 = 10;
            } else if (25 <= deg1 && deg1 < 30) {
                var3 = 8;
            }
        }

        return var3;
    }

    public double getUranus() {
        return this.plnt[10];
    }

    public int[][] getVarga() {
        return this.varga;
    }

    public double getVenus() {
        return this.plnt[6];
    }

    protected int getVimshamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 20; ++var2) {
            if ((double)var2 * 1.5D <= var4 && var4 < (double)(var2 + 1) * 1.5D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = var6 + 1;
            break;
        case 2:
        case 5:
        case 8:
        case 11:
            var3 = var6 + 9;
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            var3 = var6 + 5;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public int getYearOfBirth() {
        return this.y;
    }

    protected double GMST0(double d) {
        return this.revolution(818.9874D + d * 0.985647352D);
    }

    protected void init() {
        double var1 = this.b6 / 5.0D + 0.1D;
        double var3 = 2.0D * this.z1 * Util.fract(0.65965D + 8.43029D * this.b6);
        double var5 = 2.0D * this.z1 * Util.fract(0.73866D + 3.39476D * this.b6);
        double var7 = 2.0D * this.z1 * Util.fract(0.67644D + 1.19019D * this.b6);
        double var9 = var5 * 5.0D - var3 * 2.0D;
        double var11 = var7 - var5;
        double var13 = var5 - var3;
        double var15 = Math.sin(var9);
        double var17 = Math.sin(var9 * 2.0D);
        double var19 = Math.cos(var9);
        double var21 = Math.cos(var9 * 2.0D);
        double var23 = Math.sin(var13);
        double var25 = Math.sin(var13 * 2.0D);
        double var27 = Math.sin(var13 * 3.0D);
        double var29 = Math.cos(var13);
        double var31 = Math.cos(var13 * 2.0D);
        double var33 = Math.cos(var13 * 3.0D);
        double var35 = Math.sin(var5);
        double var37 = Math.sin(var5 * 2.0D);
        double var39 = Math.sin(var5 * 3.0D);
        double var41 = Math.cos(var5);
        double var43 = Math.cos(var5 * 2.0D);
        double var45 = Math.cos(var5 * 3.0D);
        double var47 = Math.sin(var11 * 3.0D);
        double var49 = (0.331D - var1 * 0.01D) * var15 - var1 * 0.064D * var19 + var23 * 0.014D + (var25 * 0.018D - var29 * 0.034D * var35 - var23 * 0.036D * var41);
        double var51 = var15 * 0.007D - var19 * 0.02D + var35 * (var23 * 0.007D + var29 * 0.034D + var31 * 0.006D) + var41 * (var23 * 0.038D + var25 * 0.006D - var29 * 0.007D) + var37 * (var23 * -0.005D + var29 * 0.004D) + var43 * (var23 * 0.004D + var29 * 0.006D);
        double var53 = (var15 * 3606.0D + (1289.0D - var1 * 580.0D) * var19 + var35 * (var23 * -6764.0D - var25 * 1110.0D - 204.0D + var29 * 1248.0D) + var41 * (var23 * 1460.0D - 817.0D + var29 * 6074.0D + var31 * 992.0D + var33 * 508.0D) + var37 * (var23 * -956.0D - var29 * 997.0D + var31 * 480.0D) + var43 * (var23 * -956.0D + var25 * 490.0D + 179.0D + var29 * 1024.0D - var31 * 437.0D)) * 1.0E-7D;
        double var55 = (var19 * -263.0D + var29 * 205.0D + var31 * 693.0D + var33 * 312.0D + var35 * (var23 * 299.0D + var31 * 181.0D) + var41 * (var25 * 204.0D + var27 * 111.0D - var31 * 111.0D)) * 1.0E-6D;
        double var57 = (-0.814D + var1 * 0.018D - var1 * 0.017D * var1) * var15 + ((-0.01D + var1 * 0.161D) * var19 - var23 * 0.149D - var25 * 0.041D - var27 * 0.015D) + var35 * (-0.006D - var25 * 0.017D + var29 * 0.081D + var31 * 0.015D) + var41 * (var23 * 0.086D + var29 * 0.025D + var31 * 0.014D + var33 * 0.006D);
        double var59 = (0.077D + var1 * 0.007D) * var15 + (0.046D - var1 * 0.015D) * var19 - var23 * 0.007D - var35 * (var23 * 0.076D + var25 * 0.025D + var27 * 0.009D) + var41 * (-0.073D - var29 * 0.15D + var31 * 0.027D + var33 * 0.01D) + var45 * (var23 * -0.014D - var29 * 0.008D + var31 * 0.014D) + var43 * (var23 * -0.014D + var25 * 0.012D + var29 * 0.015D - var31 * 0.013D);
        double var61 = ((-7927.0D + var1 * 2548.0D) * var15 + (13381.0D + var1 * 1226.0D) * var19 + var17 * 248.0D - var21 * 305.0D + var25 * 412.0D + var35 * (12415.0D + (390.0D - var1 * 617.0D) * var23 + var29 * 26599.0D - var31 * 4687.0D - var33 * 1870.0D - 821.0D * Math.cos(var13 * 4.0D)) + var41 * (163.0D - var1 * 611.0D - var23 * 12696.0D - var25 * 4200.0D - var27 * 1503.0D - 619.0D * Math.sin(var13 * 4.0D) - (282.0D + var1 * 1306.0D) * var29) + var37 * (-350.0D + var23 * 2211.0D - var25 * 2208.0D - var27 * 568.0D - var29 * 2780.0D + var31 * 2022.0D) + var43 * (-490.0D - var23 * 2842.0D - var29 * 1594.0D + var31 * 2162.0D + var33 * 561.0D + var47 * 469.0D)) * 1.0E-7D;
        double var63 = (var15 * 572.0D + var19 * 2933.0D + var29 * 33629.0D - var31 * 3081.0D - var33 * 1423.0D - 671.0D * Math.cos(var13 * 4.0D) + var35 * (1098.0D - var23 * 2812.0D + var25 * 688.0D - var27 * 393.0D + var29 * 2138.0D - var31 * 999.0D - var33 * 642.0D) + var41 * (-890.0D + var23 * 2206.0D - var25 * 1590.0D - var27 * 647.0D + var29 * 2285.0D + var31 * 2172.0D + var33 * 296.0D) + var37 * (var25 * -267.0D - var29 * 778.0D + var31 * 495.0D + var33 * 250.0D) + var43 * (var23 * -856.0D + var25 * 441.0D + var31 * 296.0D + var33 * 211.0D) + var39 * (var23 * -427.0D + var27 * 398.0D) + var45 * (var29 * 344.0D - var33 * 427.0D)) * 1.0E-6D;
        this.jupc[0] = var49;
        this.jupc[1] = var51;
        this.jupc[2] = var53;
        this.jupc[3] = var55;
        this.satc[0] = var57;
        this.satc[1] = var59;
        this.satc[2] = var61;
        this.satc[3] = var63;
    }

    public void initLimited(boolean[] planets) throws Exception {
        this.ret = 0;
        this.ps = 0.0D;
        this.pt = 0.0D;
        this.z1 = 3.14159265359D;
        this.z2 = this.z1 / 180.0D;
        this.s1 = 99.99826D;
        this.lat = (double)this.latdeg + (double)this.latmt / 60.0D + (double)(this.latsec / 3600);
        if (this.ns == 'S' || this.ns == 's') {
            this.lat = -this.lat;
        }

        this.longt = (double)this.longdeg + (double)this.longmt / 60.0D + (double)(this.longsec / 3600);
        if (this.ew == 'W' || this.ew == 'w') {
            this.longt = -this.longt;
        }

        if (this.dst != 0) {
            this.setUserTime();
        }

        this.j = this.jd(this.d, this.m, this.y);
        this.julDay = this.j;
        this.h6 = ((double)this.h + (double)this.mt / 60.0D + (double)this.s / 3600.0D - (12.0D + (double)this.timeZone)) / 24.0D;
        this.b6 = ((double)(this.j - 694025) + this.h6) / 36525.0D;
        this.j = (this.j + 4) % 7;
        this.daylor = this.j;
        if (planets[4] || planets[6]) {
            this.init();
        }

        this.ayan();
        if (this.kpAyanamsaType == 0) {
            this.kpayannew((double)this.d, (double)this.m, (double)this.y);
        } else if (this.kpAyanamsaType == 1) {
            this.kpayan((double)this.d, (double)this.m, (double)this.y);
        } else {
            this.kpayankhu((double)this.d, (double)this.m, (double)this.y);
        }

        if (planets[0]) {
            this.sun();
        }

        if (planets[3]) {
            this.mer();
        }

        if (planets[5]) {
            this.ven();
        }

        if (planets[2]) {
            this.mars();
        }

        if (planets[4]) {
            this.jup();
        }

        if (planets[6]) {
            this.sat();
        }

        if (planets[1]) {
            this.moon();
        }

        if (planets[9]) {
            this.ura();
        }

        if (planets[10]) {
            this.nep();
        }

        if (planets[11]) {
            this.plu();
        }

        switch(this.getAyanamsaType()) {
        case 1:
            this.KPAyan();
            return;
        case 2:
            this.ramanAyan();
            return;
        case 3:
            this.sayan();
            return;
        case 4:
            this.customizedAyan();
        default:
        }
    }

    public void initialize() throws Exception {
        this.initializesArrayValues();
        this.ret = 0;
        this.ps = 0.0D;
        this.pt = 0.0D;
        this.z1 = 3.14159265359D;
        this.z2 = this.z1 / 180.0D;
        this.s1 = 99.99826D;
        this.lat = (double)this.latdeg + (double)this.latmt / 60.0D + (double)(this.latsec / 3600);
        if (this.latitudeType == 1) {
            this.lat = this.returnGeoCentricLat(this.lat);
        }

        if (this.ns == 'S' || this.ns == 's') {
            this.lat = -this.lat;
        }

        this.longt = (double)this.longdeg + (double)this.longmt / 60.0D + (double)(this.longsec / 3600);
        if (this.ew == 'W' || this.ew == 'w') {
            this.longt = -this.longt;
        }

        if (this.dst != 0) {
            this.setUserTime();
        }

        this.j = this.jd(this.d, this.m, this.y);
        this.julDay = this.j;
        this.h6 = ((double)this.h + (double)this.mt / 60.0D + (double)this.s / 3600.0D - (12.0D + (double)this.timeZone)) / 24.0D;
        this.b6 = ((double)(this.j - 694025) + this.h6) / 36525.0D;
        this.j = (this.j + 4) % 7;
        this.daylor = this.j;
        this.init();
        this.ayan();
        if (this.kpAyanamsaType == 0) {
            this.kpayannew((double)this.d, (double)this.m, (double)this.y);
        } else if (this.kpAyanamsaType == 1) {
            this.kpayan((double)this.d, (double)this.m, (double)this.y);
        } else {
            this.kpayankhu((double)this.d, (double)this.m, (double)this.y);
        }

        this.sun();
        this.mer();
        this.ven();
        this.mars();
        this.jup();
        this.sat();
        this.moon();
        this.ura();
        this.nep();
        this.plu();
        this.ret = 1;
        this.b6 += 1.1407711613050422E-6D;
        this.sun();
        this.mer();
        this.ven();
        this.mars();
        this.jup();
        this.sat();
        this.moon();
        this.ura();
        this.nep();
        this.plu();
        switch(this.getAyanamsaType()) {
        case 1:
            this.KPAyan();
            return;
        case 2:
            this.ramanAyan();
            return;
        case 3:
            this.sayan();
            return;
        case 4:
            this.customizedAyan();
        default:
        }
    }

    public void initializesArrayValues() throws Exception {
        this.util.setLanguageCode(this.getLanguageCode());
        Constants.LoadProperties(this.e);
        Constants.getValues("DAY_VALUES", this.day);
        Constants.getValues("DAYLRD_VALUES", this.daylrd);
        Constants.getValues("RAS_VALUES", this.ras);
        Constants.getValues("RASLRD_VALUES", this.raslrd);
        Constants.getValues("NAKLRD_VALUES", this.naklrd);
        Constants.getValues("TIT_VALUES", this.tit);
        Constants.getValues("NAK_VALUES", this.nak);
        Constants.getValues("YOG_VALUES", this.yog);
        Constants.getValues("X1_VALUES", this.x1);
        Constants.getValues("GRAHA_VALUES", this.graha);
        Constants.getValues("BHAVANUM_VALUES", this.bhavanum);
        Constants.getValues("KARAN_VALUES", this.Karan);
        Constants.getValues("PAKSHA_VALUES", this.paksha);
        Constants.getValues("DIV_VALUES", this.div);
        Constants.getValues("MANGALDOSH_VALUES", this.mangalDosh);
        Constants.getValues("GANA_VALUES", this.gana);
        Constants.getValues("VASYA_VALUES", this.vasya);
        Constants.getValues("PAYA_VALUES", this.paya);
        Constants.getValues("DEB_VALUES", this.Deb);
        Constants.getValues("EXAL_VALUES", this.Exal);
        Constants.getValues("ASPECTS_VALUES", this.aspects);
        Constants.getValues("PLANETNAMEVIM_VALUES", this.planetNameVim);
        Constants.getValues("PLANETNAME_VALUES", this.planetName);
        Constants.getValues("OUTCOMES_VALUES", this.outcomes);
        this.ayan = Constants.getValue("AYAN_KEY");
        Constants.getValues("X9_VALUES", this.x9);
        Constants.getValues("VARNA_VALUES", this.varna);
        Constants.getValues("YONI_VALUES", this.yoni);
        Constants.getValues("NADI_VALUES", this.nadi);
    }

    public boolean isDifferentDst() {
        String[] var1 = TimeZone.getAvailableIDs();
        Vector var2 = new Vector();

        int var3;
        for(var3 = 0; var3 < var1.length; ++var3) {
            TimeZone var4 = TimeZone.getTimeZone(var1[var3]);
            GregorianCalendar var5 = new GregorianCalendar(var4);
            if ((float)((double)var4.getRawOffset() / 3600000.0D) == this.timeZone) {
                var2.addElement(new Integer(var5.get(16) / 3600000));
            }
        }

        for(var3 = 0; var3 < var2.size() - 1; ++var3) {
            if (!var2.elementAt(var3).equals(var2.elementAt(var3 + 1))) {
                return true;
            }

            this.setDST(var2.elementAt(var3 + 1).toString());
        }

        return false;
    }

    public int jd(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            --y;
        }

        int var4 = y / 100;
        float m1;
        m = (int)(m1 = 30.6F * (float)(m + 1));
        return y * 365 + y / 4 + m + 2 - var4 + var4 / 4 + d;
    }

    protected void jup() {
        double var1 = 360.0D * Util.fract(0.59886D + 8.43029D * this.b6) + this.jupc[0];
        double var7 = 0.048335D - 1.64E-4D * this.b6 + this.jupc[2];
        double var3 = 350.26D + 0.214D * this.b6 + this.jupc[1] / var7;
        double var5 = 76.98D - 0.386D * this.b6;
        double var9 = 1.308376D - 0.005696D * this.b6;
        double var11 = 5.2026D + this.jupc[3];
        if (this.ret == 0) {
            this.plnt[5] = this.planet(var1, var3, var5, var7, var9, var11, 5);
        } else {
            this.plnt[18] = this.planet(var1, var3, var5, var7, var9, var11, 5);
        }
    }

    public int khavedamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = ((int)(deg / 30.0D) + 1) % 2;

        for(int var2 = 0; var2 < 40; ++var2) {
            if ((double)var2 * 0.75D <= var4 && var4 < (double)(var2 + 1) * 0.75D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 0:
            var3 = var6 + 7;
            break;
        case 1:
            var3 = var6 + 1;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    protected void KPAyan() {
        for(int var1 = 1; var1 <= 25; ++var1) {
            if (var1 != 13) {
                this.plnt[var1] = this.plnt[var1] + this.aya - this.kpaya;
                if (this.plnt[var1] >= 360.0D) {
                    double[] var10000 = this.plnt;
                    var10000[var1] -= 360.0D;
                }
            }
        }

        this.aya = this.kpaya;
        this.plnt[0] = this.kpaya;
    }

    protected void kpayan(double dd, double mm, double yy) {
        this.kpaya = Util.kpayan(dd, mm, yy);
    }

    protected double kpayannew(double dd, double mm, double yy) {
        double var7 = Util.kpayannew(dd, mm, yy);
        this.kpaya = var7;
        return var7;
    }

    protected double kpayankhu(double dd, double mm, double yy) {
        double var7 = Util.kpayankhu(dd, mm, yy);
        this.kpaya = var7;
        return var7;
    }

    protected void KPHorary(int seed) {
        this.horarySeed = seed;
        double var2 = this.seedToDegree(seed) + this.kpaya;
        double var4 = this.lat;
        double var22 = 0.0D;
        if (var2 >= 360.0D) {
            var2 -= 360.0D;
        }

        this.f4[0] = var2;
        double var6;
        if ((var6 = Util.atand(Util.tand(var2) * Util.cosd(23.445D))) < 0.0D) {
            var6 += 180.0D;
        }

        if (var2 > 180.0D) {
            var6 += 180.0D;
        }

        double var10 = Util.asind(Util.sind(var2) * Util.sind(23.445D));
        double var8 = Util.asind(Util.tand(var4) * Util.tand(var10));
        double var12;
        if ((var12 = var6 - var8 - 90.0D) < 0.0D) {
            var12 += 360.0D;
        }

        double var14;
        if ((var14 = Util.atand(Util.tand(var12) / Util.cosd(23.445D))) < 0.0D) {
            var14 += 180.0D;
        }

        if (var12 > 180.0D) {
            var14 += 180.0D;
        }

        this.f4[9] = var14;
        if ((var12 = Util.atand(Util.tand(var14) * Util.cosd(23.445D))) < 0.0D) {
            var12 += 180.0D;
        }

        if (var14 > 180.0D) {
            var12 += 180.0D;
        }

        int var24;
        for(var24 = 1; var24 <= 4; ++var24) {
            double var16 = var14;

            for(seed = 1; seed <= 5; ++seed) {
                double var18 = Util.sind(var16) * Util.sind(23.445D);
                double var20 = 90.0D + Util.asind(Util.tand(var4) * var18 / Math.sqrt(1.0D - var18 * var18));
                switch(var24) {
                case 1:
                case 2:
                    var22 = var12 + (double)var24 * var20 / 3.0D;
                    break;
                case 3:
                case 4:
                    var22 = var12 + (double)(5 - var24) * var20 / 3.0D + (double)((var24 - 2) * 60);
                }

                if (var22 >= 360.0D) {
                    var22 -= 360.0D;
                }

                if ((var16 = Util.atand(Util.tand(var22) / Util.cosd(23.445D))) < 0.0D) {
                    var16 += 180.0D;
                }

                if (var22 >= 180.0D) {
                    var16 += 180.0D;
                }

                switch(var24) {
                case 1:
                case 2:
                    this.f4[var24 + 9] = var16;
                    break;
                case 3:
                case 4:
                    this.f4[var24 - 2] = var16;
                }
            }
        }

        for(seed = 3; seed <= 8; ++seed) {
            if ((var24 = seed + 6) > 11) {
                var24 -= 12;
            }

            this.f4[seed] = this.f4[var24] + 180.0D;
            if (this.f4[seed] >= 360.0D) {
                this.f4[seed] -= 360.0D;
            }
        }

        for(var24 = 0; var24 <= 11; ++var24) {
            this.f4[var24] -= this.kpaya;
            if (this.f4[var24] < 0.0D) {
                double[] var10000 = this.f4;
                var10000[var24] += 360.0D;
            }
        }

    }

    protected void kpplnt() {
        for(int var1 = 1; var1 <= 12; ++var1) {
            this.plntkp[var1 - 1] = this.plnt[var1] + this.aya - this.kpaya;
            double[] var10000;
            if (this.plntkp[var1 - 1] >= 360.0D) {
                var10000 = this.plntkp;
                var10000[var1 - 1] -= 360.0D;
            }

            if (this.plntkp[var1 - 1] < 0.0D) {
                var10000 = this.plntkp;
                var10000[var1 - 1] += 360.0D;
            }
        }

    }

    protected void kprp(int j) {
        for(j = 1; j <= 2; ++j) {
            double var3;
            if (j == 1) {
                this.tmp = "LAGNA";
                var3 = this.f4[0];
            } else {
                this.tmp = "MOON ";
                var3 = this.plntkp[1];
            }

            this.f = (int)(var3 / 30.0D);
            this.a = (int)(var3 / 120.0D);
            var3 -= (double)((int)((double)this.a * 120.0D));
            this.a = (int)(var3 * 3.0D / 40.0D);
        }

    }

    protected void mars() {
        double var1 = 360.0D * Util.fract(0.75358D + 53.16751D * this.b6);
        double var3 = 311.76D + 0.445D * this.b6;
        double var5 = 26.33D - 0.625D * this.b6;
        double var7 = 0.093313D - 9.2E-5D * this.b6;
        double var9 = 1.850333D + 6.75E-4D * this.b6;
        if (this.ret == 0) {
            this.plnt[3] = this.planet(var1, var3, var5, var7, var9, 1.5237D, 3);
        } else {
            this.plnt[16] = this.planet(var1, var3, var5, var7, var9, 1.5237D, 3);
        }
    }

    protected void mer() {
        double var1 = 360.0D * Util.fract(0.43255D + 415.20187D * this.b6);
        double var3 = 53.44D + 0.159D * this.b6;
        double var5 = 24.69D - 0.211D * this.b6;
        double var7 = 0.205614D - 2.0E-5D * this.b6;
        double var9 = 7.00288D + 0.001861D * this.b6;
        if (this.ret == 0) {
            this.plnt[4] = this.planet(var1, var3, var5, var7, var9, 0.3871D, 4);
        } else {
            this.plnt[17] = this.planet(var1, var3, var5, var7, var9, 0.3871D, 4);
        }
    }

    protected void misc() {
        double var1;
        if ((var1 = (this.plnt[2] - this.plnt[1]) / 12.0000001D) < 0.0D) {
            var1 += 30.0D;
        }

        this.tt[0] = (double)Math.round(var1 * 100.0D) / 100.0D;
        double var3 = this.plnt[2] * 0.075D;
        this.tt[1] = (double)Math.round(var3 * 100.0D) / 100.0D;
        double var5;
        if ((var5 = (this.plnt[2] + this.plnt[1]) * 0.075D) > 27.0D) {
            var5 -= 27.0D;
        }

        this.tt[2] = (double)Math.round(var5 * 100.0D) / 100.0D;
        double var7 = this.plnt[2] / 30.0000001D;
        this.tt[3] = (double)Math.round(var7 * 100.0D) / 100.0D;
    }

    protected void moon() {
        double var1 = 360.0D * Util.fract(0.71455D + 99.99826D * this.b6);
        double var3 = 258.76D + 0.323D * this.b6;
        double var5 = 360.0D * Util.fract(0.68882D + 1336.851353D * this.b6);
        double var7 = 360.0D * Util.fract(0.8663D + 11.298994D * this.b6 - 3.0E-5D * this.b6 * this.b6);
        double var9;
        if ((var9 = 360.0D * Util.fract(0.65756D - 5.376495D * this.b6)) < 0.0D) {
            var9 += 360.0D;
        }

        double var11 = this.z2 * (var5 - var7);
        double var13 = this.z2 * (var1 - var3);
        double var15 = this.z2 * (var5 - var1);
        double var17 = this.z2 * (var5 - var9);
        double var19 = var5 + 6.2888D * Math.sin(var11) + 0.2136D * Math.sin(var11 * 2.0D) + 0.01D * Math.sin(var11 * 3.0D) + 1.274D * Math.sin(var15 * 2.0D - var11) + 0.0085D * Math.sin(var15 * 4.0D - var11 * 2.0D) - 0.0347D * Math.sin(var15) + 0.6583D * Math.sin(var15 * 2.0D) + 0.0039D * Math.sin(var15 * 4.0D) - 0.1856D * Math.sin(var13) - 0.0021D * Math.sin(var13 * 2.0D) + 0.0052D * Math.sin(var11 - var15) - 0.0588D * Math.sin(var11 * 2.0D - var15 * 2.0D) + 0.0572D * Math.sin(var15 * 2.0D - var11 - var13) + 0.0533D * Math.sin(var11 + 2.0D * var15) + 0.0458D * Math.sin(var15 * 2.0D - var13) + 0.041D * Math.sin(var11 - var13) - 0.0305D * Math.sin(var11 + var13) - 0.0237D * Math.sin(var17 * 2.0D - var11) - 0.0153D * Math.sin(var17 * 2.0D - var15 * 2.0D) + 0.0107D * Math.sin(var15 * 4.0D - var11) - 0.0079D * Math.sin(-var11 + var13 + var15 * 2.0D) - 0.0068D * Math.sin(var13 + 2.0D * var15) + 0.005D * Math.sin(var13 + var15) - 0.0023D * Math.sin(var11 + var15) + 0.004D * Math.sin(var11 * 2.0D + var15 * 2.0D) + 0.004D * Math.sin(var11 - var13 + var15 * 2.0D) - 0.0037D * Math.sin(var11 * 3.0D - var15 * 2.0D) - 0.0026D * Math.sin(var11 - 2.0D * var15 + var17 * 2.0D) + 0.0027D * Math.sin(var11 * 2.0D - var13) - 0.0024D * Math.sin(var11 * 2.0D + var13 - var15 * 2.0D) + 0.0022D * Math.sin(var15 * 2.0D - var13 * 2.0D) - 0.0021D * Math.sin(var11 * 2.0D + var13) + 0.0021D * Math.sin(var9 * this.z2) + 0.0021D * Math.sin(var15 * 2.0D - var11 - var13 * 2.0D) - 0.0018D * Math.sin(var11 + 2.0D * var15 - var17 * 2.0D) + 0.0012D * Math.sin(var15 * 4.0D - var11 - var13) - 8.0E-4D * Math.sin(var15 * 3.0D - var11);
        double var21 = this.z2 * 2.0D * (var19 - var9);
        double var23;
        if ((var23 = var19 - 0.1143D * Math.sin(var21) + 0.004D) >= 360.0D) {
            var23 -= 360.0D;
        }

        if (var23 < 0.0D) {
            var23 += 360.0D;
        }

        if (this.ret == 0) {
            this.plnt[2] = var23;
        } else {
            this.plnt[15] = var23;
        }

        if (this.ret == 0) {
            this.plnt[8] = var9;
        } else {
            this.plnt[21] = var9;
        }

        double var27;
        if ((var27 = var9 + 180.0D) >= 360.0D) {
            var27 -= 360.0D;
        }

        if (this.ret == 0) {
            this.plnt[9] = var27;
        } else {
            this.plnt[22] = var27;
        }
    }

    protected void nep() {
        double var1 = (var1 = 360.0D * Util.fract(0.17361D + 0.60692D * this.b6)) + 0.1D - 0.1D * Math.sin((var1 / 2.0D - 90.0D + this.plnt[0]) * this.z2) + 0.166D * Math.sin(this.b6 - 1.0D);
        double var3 = 24.27D + 0.028D * this.b6;
        double var5 = 108.22D - 0.297D * this.b6;
        double var7 = 0.009D - 6.0E-6D * this.b6;
        double var9 = 1.779242D + 0.009544D * this.b6;
        if (this.ret == 0) {
            this.plnt[11] = this.planet(var1, var3, var5, var7, var9, 30.11D, 11);
        } else {
            this.plnt[24] = this.planet(var1, var3, var5, var7, var9, 30.11D, 11);
        }
    }

    protected double planet(double pg, double ph, double pp, double pe, double pq, double pa, int pno) {
        double var14;
        if ((var14 = pg - ph) < 0.0D) {
            var14 += 360.0D;
        }

        double var16;
        double var18 = (var16 = var14 * this.z2) + pe * Math.sin(var16);

        double var20;
        double var22;
        do {
            var20 = var18 - pe * Math.sin(var18) - var16;
            var22 = 1.0D - pe * Math.cos(var18);
            var18 -= var20 / var22;
        } while(Math.abs(var20 / var22) > 0.01D);

        double var24 = pa * (1.0D - pe * Math.cos(var18));
        double var26 = Math.atan(pe / Math.sqrt(1.0D - pe * pe));
        double var30 = Math.tan(this.z1 / 4.0D - var26 / 2.0D);
        double var34;
        if ((var34 = Math.atan(Math.tan(var18 / 2.0D) / var30)) < 0.0D) {
            var34 += this.z1;
        }

        double var36 = var34 * 2.0D;
        var20 = ph * this.z2;
        var22 = pp * this.z2;
        var16 = pq * this.z2;
        double var38;
        double var40 = (var38 = var36 + var20) - var22;
        double var42 = 1.0D - Math.cos(var16);
        double var44 = (Math.cos(var38) + Math.sin(var40) * Math.sin(var22) * var42) * var24;
        double var46 = (Math.sin(var38) - Math.sin(var40) * Math.cos(var22) * var42) * var24;
        if (pno == 1) {
            this.ps = var44;
            this.pt = var46;
        }

        var20 = this.ps + var44;
        var14 = Math.atan((var22 = this.pt + var46) / var20) / this.z2;
        if (var20 < 0.0D) {
            var14 += 180.0D;
        } else if (var22 < 0.0D) {
            var14 += 360.0D;
        }

        return var14;
    }

    protected void plu() {
        double var1 = (var1 = 360.0D * Util.fract(0.19434D + 0.40254D * this.b6)) - 0.1D * Math.sin((var1 + this.plnt[0]) * this.z2);
        double var3 = 200.02D + 0.002D * this.b6;
        double var5 = 86.49D - 0.038D * this.b6;
        double var7 = 17.146778D - 0.005531D * this.b6;
        if (this.ret == 0) {
            this.plnt[12] = this.planet(var1, var3, var5, 0.248644D, var7, 39.52D, 12);
        } else {
            this.plnt[25] = this.planet(var1, var3, var5, 0.248644D, var7, 39.52D, 12);
        }
    }

    protected void prplnt() {
        for(int var1 = 1; var1 <= 12; ++var1) {
            this.aa = this.plnt[var1] % 30.0D;
            this.b = (int)(this.plnt[var1] * 3.0D / 40.0D);
            this.c = (int)(4.0D * Util.fract(this.plnt[var1] * 3.0D / 40.0D) + 1.0D);
        }

    }

    protected void ramanAyan() {
        double var1 = 21.013972D + 1.398191D * this.b6;
        double var3 = this.plnt[0] - var1;

        for(int var5 = 1; var5 < 26; ++var5) {
            if (var5 != 13) {
                double[] var10000 = this.plnt;
                var10000[var5] += var3;
                if (this.plnt[var5] >= 360.0D) {
                    var10000 = this.plnt;
                    var10000[var5] -= 360.0D;
                }
            }
        }

        this.plnt[0] = var1;
        this.aya = var1;
    }

    public char[] replstr(char[] string, int no, String plnt_no2) {
        char[] var4 = plnt_no2.toCharArray();

        for(int plnt_no21 = 0; plnt_no21 <= 3; ++plnt_no21) {
            string[no + plnt_no21 - 1] = var4[plnt_no21];
        }

        return string;
    }

    protected double returnGeoCentricLat(double lat) {
        return Math.atan(Math.tan(lat * this.z1 / 180.0D) * 0.99330546D) * 180.0D / this.z1;
    }

    protected int returnMangalDoshPoints(int lagn, int marRasi) {
        byte var3 = 0;
        if ((lagn = marRasi - lagn) < 0) {
            lagn += 12;
        }

        ++lagn;
        if (lagn == 1 || lagn == 4 || lagn == 7 || lagn == 8 || lagn == 12) {
            var3 = 33;
        }

        return var3;
    }

    protected double rev180(double x) {
        return x - 360.0D * Math.floor(x * 0.002777777777777778D + 0.5D);
    }

    protected double revolution(double x) {
        return x - 360.0D * Math.floor(x * 0.002777777777777778D);
    }

    public String rnss(double d) {
        int var7 = 0;
        int var6 = (int)(d / 30.0D);
        int var3 = (int)(d / 120.0D);
        var3 = (int)((d -= (double)((int)((double)var3 * 120.0D))) * 3.0D / 40.0D);
        d = (d - (double)var3 * 40.0D / 3.0D) * 9.0D;

        int var4;
        for(var4 = 0; var4 < 9; ++var4) {
            if ((var7 = var3 + var4) >= 9) {
                var7 -= 9;
            }

            if (this.y1[var7] > d) {
                break;
            }

            d -= this.y1[var7];
        }

        var4 = var7;
        d = d / this.y1[var7] * 13.333333333333334D * 9.0D;

        for(int var5 = 0; var5 < 9; ++var5) {
            if ((var7 = var4 + var5) >= 9) {
                var7 -= 9;
            }

            if (this.y1[var7] > d) {
                break;
            }

            d -= this.y1[var7];
        }

        return this.raslrd[var6] + this.util.getDashString(1) + this.naklrd[var3] + this.util.getDashString(1) + this.naklrd[var4] + this.util.getDashString(1) + this.naklrd[var7];
    }

    public void saptavg() {
        this.vgcomp("LAGNA   ", this.f2[0], 0);
        this.vgcomp("SUN      ", this.plnt[1], 1);
        this.vgcomp("MOON    ", this.plnt[2], 2);
        this.vgcomp("MARS    ", this.plnt[3], 3);
        this.vgcomp("MERCURY\t  ", this.plnt[4], 4);
        this.vgcomp("JUPITER ", this.plnt[5], 5);
        this.vgcomp("VENUS   ", this.plnt[6], 6);
        this.vgcomp("SATURN\t  ", this.plnt[7], 7);
        this.vgcomp("RAHU\t  ", this.plnt[8], 8);
        this.vgcomp("KETU\t  ", this.plnt[9], 9);
        this.vgcomp("URANUS  ", this.plnt[10], 10);
        this.vgcomp("NEPTUNE ", this.plnt[11], 11);
        this.vgcomp("PLUTO   ", this.plnt[12], 12);

        int var1;
        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][1] = this.getHora(this.f2[var1]);
            } else {
                this.varga[var1][1] = this.getHora(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][2] = this.getDrekkana(this.f2[var1]);
            } else {
                this.varga[var1][2] = this.getDrekkana(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][3] = this.chaturtamsa(this.f2[var1]);
            } else {
                this.varga[var1][3] = this.chaturtamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][4] = this.getSaptamsa(this.f2[var1]);
            } else {
                this.varga[var1][4] = this.getSaptamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][6] = this.getDasamsa(this.f2[var1]);
            } else {
                this.varga[var1][6] = this.getDasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][7] = this.getDwadasamsa(this.f2[var1]);
            } else {
                this.varga[var1][7] = this.getDwadasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][8] = this.getShodasamsa(this.f2[var1]);
            } else {
                this.varga[var1][8] = this.getShodasamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][9] = this.vimshamsa(this.f2[var1]);
            } else {
                this.varga[var1][9] = this.vimshamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][10] = bhamsa(this.f2[var1]);
            } else {
                this.varga[var1][10] = bhamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][11] = this.siddhamsa(this.f2[var1]);
            } else {
                this.varga[var1][11] = this.siddhamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][12] = this.getTrimshamsa(this.f2[var1]);
            } else {
                this.varga[var1][12] = this.getTrimshamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][13] = this.khavedamsa(this.f2[var1]);
            } else {
                this.varga[var1][13] = this.khavedamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][14] = this.akshvedamsa(this.f2[var1]);
            } else {
                this.varga[var1][14] = this.akshvedamsa(this.plnt[var1]);
            }
        }

        for(var1 = 0; var1 < 13; ++var1) {
            if (var1 == 0) {
                this.varga[var1][15] = this.getShastiamsa(this.f2[var1]);
            } else {
                this.varga[var1][15] = this.getShastiamsa(this.plnt[var1]);
            }
        }

    }

    protected void sat() {
        double var1 = 360.0D * Util.fract(0.67807D + 3.39476D * this.b6) + this.satc[0];
        double var7 = 0.055892D - 3.46E-4D * this.b6 + this.satc[2];
        double var3 = 68.64D + 0.562D * this.b6 + this.satc[1] / var7;
        double var5 = 90.33D - 0.523D * this.b6;
        double var9 = 2.49252D - 0.00392D * this.b6;
        double var11 = 9.5547D + this.satc[3];
        if (this.ret == 0) {
            this.plnt[7] = this.planet(var1, var3, var5, var7, var9, var11, 7);
        } else {
            this.plnt[20] = this.planet(var1, var3, var5, var7, var9, var11, 7);
        }
    }

    protected void sayan() {
        for(int var1 = 1; var1 < 26; ++var1) {
            if (var1 != 13) {
                double[] var10000 = this.plnt;
                var10000[var1] += this.plnt[0];
                if (this.plnt[var1] >= 360.0D) {
                    var10000 = this.plnt;
                    var10000[var1] -= 360.0D;
                }
            }
        }

        this.aya = 0.0D;
        this.plnt[0] = 0.0D;
    }

    protected double seedToDegree(int s) {
        int[] var4 = new int[]{7, 20, 6, 10, 7, 18, 16, 19, 17};
        double var5 = 0.0D;
        int[] var2 = new int[]{229, 189, 146, 106, 63, 23};
        double[] var7 = new double[]{330.0D, 270.0D, 210.0D, 150.0D, 90.0D, 30.0D};

        int var3;
        for(var3 = 0; var3 < 6; ++var3) {
            if (s == var2[var3]) {
                return var7[var3];
            }

            if (s > var2[var3]) {
                --s;
            }
        }

        --s;
        int var8 = s / 9;

        for(var3 = 0; var3 < var8; ++var3) {
            var5 += 13.333333333333334D;
            s -= 9;
        }

        var8 %= 9;

        for(var3 = 0; var3 < s; ++var3) {
            var5 += (double)var4[(var8 + var3) % 9] / 120.0D * 13.333333333333334D;
        }

        return var5 + 1.0E-13D;
    }

    public void setAyanamsaType(int ayanamsaType) {
        this.ayanamsaType = ayanamsaType;
    }

    public void setAyan(int ayanamsaType) {
        switch(ayanamsaType) {
        case 1:
            this.setAyanamsaType(1);
            return;
        case 2:
            this.setAyanamsaType(1);
            this.setKPAyanamsaType(1);
            return;
        case 3:
            this.setAyanamsaType(2);
            return;
        case 4:
            this.setAyanamsaType(1);
            this.setKPAyanamsaType(2);
            return;
        case 5:
            this.setAyanamsaType(3);
            return;
        case 6:
            this.setAyanamsaType(4);
        default:
        }
    }

    public int getAyan() {
        if (this.getAyanamsaType() == 0) {
            return 0;
        } else {
            if (this.getAyanamsaType() == 1) {
                if (this.getKPAyanamsaType() == 0) {
                    return 1;
                }

                if (this.getKPAyanamsaType() == 1) {
                    return 2;
                }

                if (this.getKPAyanamsaType() == 2) {
                    return 4;
                }
            }

            if (this.getAyanamsaType() == 2) {
                return 3;
            } else if (this.getAyanamsaType() == 3) {
                return 5;
            } else {
                return this.getAyanamsaType() == 4 ? 6 : this.getAyanamsaType();
            }
        }
    }

    public void setCompanyAddLine1(String companyAddLine1) {
        this.companyAddressLine1 = companyAddLine1;
    }

    public void setCompanyName(String companyname) {
        this.companyName = companyname;
    }

    public void setCustomizedAyanamsa(String ayanamsa) {
        this.customizedAyan = Double.valueOf(ayanamsa);
    }

    public void setDayOfBirth(String day) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(day)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setDayOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for Day");
            throw new NullPointerException("Null value Encountered for Day");
        } else {
            try {
                this.d = Integer.parseInt(day);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setDayOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setDegreeOfLattitude(String latdegree) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(latdegree)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setDegreeOfLattitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for DegreeOfLatitude");
            throw new NullPointerException("Null value Encountered for DegreeOfLatitude");
        } else {
            try {
                this.latdeg = Integer.parseInt(latdegree);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setDegreeOfLattitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setDegreeOfLongitude(String longdegree) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(longdegree)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setDegreeOfLongitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for DegreeOfLongitude");
            throw new NullPointerException("Null value Encountered for DegreeOfLongitude");
        } else {
            try {
                this.longdeg = Integer.parseInt(longdegree);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setDegreeOfLattitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setDST(String dst) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(dst)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setDST   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for DST");
            throw new NullPointerException("Null value Encountered for DST");
        } else {
            try {
                this.dst = Integer.parseInt(dst);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setDST   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setEastWest(String eastWest) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(eastWest)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setEastWest   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for EastWest");
            throw new NullPointerException("Null value Encountered for EastWest");
        } else {
            try {
                this.ew = eastWest.charAt(0);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setEastWest   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setHinduWeekday() {
        if (this.birthTime - this.rise < 0.0D) {
            this.vedicDay = this.daylor - 1;
        } else {
            this.vedicDay = this.daylor;
        }

        if (this.vedicDay < 0) {
            this.vedicDay += 7;
        }

    }

    public void setHoroscopeStyle(int kt) {
        try {
            this.kundliType = kt;
        } catch (NumberFormatException var2) {
        }
    }

    public void setHourOfBirth(String hour) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(hour)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setHourOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for HourOfBirth");
            throw new NullPointerException("Null value Encountered for HourOfBirth");
        } else {
            try {
                this.h = Integer.parseInt(hour);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setHourOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setKPAyanamsaType(int kpAyanamsaType) {
        this.kpAyanamsaType = kpAyanamsaType;
    }

    public void setKPHorarySeed(int seed) {
        try {
            this.horarySeed = seed;
        } catch (NumberFormatException var2) {
        }
    }

    public void setLanguageCode(String lang) {
        this.e = lang;
    }

    public void setLatitudeType(int latitudeType) {
        this.latitudeType = latitudeType;
    }

    public void setMaleFemale(String gender) {
        this.sex = gender;
    }

    public void setMinuteOfBirth(String minute) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(minute)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for MinuteOfBirth");
            throw new NullPointerException("Null value Encountered for MinuteOfBirth");
        } else {
            try {
                this.mt = Integer.parseInt(minute);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setMinuteOfLattitude(String latminute) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(latminute)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfLattitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for MinuteOfLattitude");
            throw new NullPointerException("Null value Encountered for MinuteOfLattitude");
        } else {
            try {
                this.latmt = Integer.parseInt(latminute);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfLattitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setMinuteOfLongitude(String longminute) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(longminute)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfLongitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for MinuteOfLongitude");
            throw new NullPointerException("Null value Encountered for MinuteOfLongitude");
        } else {
            try {
                this.longmt = Integer.parseInt(longminute);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setMinuteOfLongitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setMonthOfBirth(String month) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(month)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setMonthOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for MonthOfBirth");
            throw new NullPointerException("Null value Encountered for MonthOfBirth");
        } else {
            try {
                this.m = Integer.parseInt(month);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setMonthOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setName(String username) {
        this.userName = username;
    }

    public void setNorthSouth(String northSouth) throws NullPointerException {
        if (Constants.isNullOrEmpty(northSouth)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setNorthSouth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for NorthSouth");
            throw new NullPointerException("Null value Encountered for NorthSouth");
        } else {
            this.ns = northSouth.charAt(0);
        }
    }

    public void setPlace(String userplace) {
        this.place = userplace;
    }

    public void setSecondOfBirth(String second) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(second)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for SecondOfBirth");
            throw new NullPointerException("Null value Encountered for SecondOfBirth");
        } else {
            try {
                this.s = Integer.parseInt(second);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setSecondOfLattitude(String latsecond) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(latsecond)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfLattitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for SecondOfLattitude");
            throw new NullPointerException("Null value Encountered for SecondOfLattitude");
        } else {
            try {
                this.latsec = Integer.parseInt(latsecond);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfLattitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setSecondOfLongitude(String longsecond) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(longsecond)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfLongitude   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for SecondOfLongitude");
            throw new NullPointerException("Null value Encountered for SecondOfLongitude");
        } else {
            try {
                this.longsec = Integer.parseInt(longsecond);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setSecondOfLongitude   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public void setTimeZone(String timezone) throws NumberFormatException, NullPointerException {
        if (Constants.isNullOrEmpty(timezone)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setTimeZone   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for TimeZone");
            throw new NullPointerException("Null value Encountered for TimeZone");
        } else {
            try {
                this.timeZone = new Float(timezone);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setTimeZone   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    protected void setUserTime() throws NumberFormatException {
        try {
            Calendar var1;
            (var1 = Calendar.getInstance()).set(this.getYearOfBirth(), this.getMonthOfBirth() - 1, this.getDayOfBirth(), Integer.parseInt(this.getHourOfBirth()), Integer.parseInt(this.getMinuteOfBirth()), Integer.parseInt(this.getSecondOfBirth()));
            int var2 = -Integer.parseInt(this.getDST());
            var1.add(10, var2);
            this.setDayOfBirth((new Integer(var1.get(5))).toString());
            this.setMonthOfBirth((new Integer(var1.get(2) + 1)).toString());
            this.setYearOfBirth((new Integer(var1.get(1))).toString());
            this.setHourOfBirth((new Integer(var1.get(11))).toString());
            this.setMinuteOfBirth((new Integer(var1.get(12))).toString());
            this.setSecondOfBirth((new Integer(var1.get(13))).toString());
        } catch (NumberFormatException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setUserTime   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, var3.toString());
            throw new NumberFormatException(var3.toString());
        }
    }

    public void setYearOfBirth(String year) throws NumberFormatException {
        if (Constants.isNullOrEmpty(year)) {
            CSystem.out(CSystem.ERRO_R, "Method Name : setYearOfBirth   ClassName : Horo");
            CSystem.out(CSystem.ERRO_R, "Null value Encountered for YearOfBirth");
            throw new NullPointerException("Null value Encountered for YearOfBirth");
        } else {
            try {
                this.y = Integer.parseInt(year);
            } catch (NumberFormatException var2) {
                CSystem.out(CSystem.ERRO_R, "Method Name : setYearOfBirth   ClassName : Horo");
                CSystem.out(CSystem.ERRO_R, var2.toString());
                throw new NumberFormatException(var2.toString());
            }
        }
    }

    public int siddhamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = ((int)(deg / 30.0D) + 1) % 2;

        for(int var2 = 0; var2 < 24; ++var2) {
            if ((double)var2 * 1.25D <= var4 && var4 < (double)(var2 + 1) * 1.25D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 0:
            var3 = var6 + 4;
            break;
        case 1:
            var3 = var6 + 5;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    protected void sun() {
        double var1 = 360.0D * Util.fract(0.71455D + 99.99826D * this.b6);
        double var3 = 258.76D + 0.323D * this.b6;
        double var5 = 0.016751D - 4.2E-5D * this.b6;
        if (this.ret == 0) {
            this.plnt[1] = this.planet(var1, var3, 0.0D, var5, 0.0D, 1.0D, 1);
        } else {
            this.plnt[14] = this.planet(var1, var3, 0.0D, var5, 0.0D, 1.0D, 1);
        }
    }

    protected void sun_RA_dec(double d) {
        double var11 = this.sunpos(d);
        double var5 = this.sr * Math.cos(var11 * 0.017453292519943295D);
        double var7 = this.sr * Math.sin(var11 * 0.017453292519943295D);
        double var3 = 23.4393D - d * 3.563E-7D;
        double var9 = var7 * Math.sin(var3 * 0.017453292519943295D);
        var7 *= Math.cos(var3 * 0.017453292519943295D);
        this.sRA = 57.29577951308232D * Math.atan2(var7, var5);
        this.sdec = 57.29577951308232D * Math.atan2(var9, Math.sqrt(var5 * var5 + var7 * var7));
    }

    protected double sunpos(double d) {
        double var3 = this.revolution(356.047D + d * 0.9856002585D);
        double var5 = 282.9404D + d * 4.70935E-5D;
        double var7 = 0.016709D - d * 1.151E-9D;
        double var9;
        double var11 = Math.cos((var9 = var3 + var7 * 57.29577951308232D * Math.sin(var3 * 0.017453292519943295D) * (1.0D + var7 * Math.cos(var3 * 0.017453292519943295D))) * 0.017453292519943295D) - var7;
        double var13 = Math.sqrt(1.0D - var7 * var7) * Math.sin(var9 * 0.017453292519943295D);
        this.sr = Math.sqrt(var11 * var11 + var13 * var13);
        double var17;
        double var15;
        if ((var17 = (var15 = 57.29577951308232D * Math.atan2(var13, var11)) + var5) >= 360.0D) {
            var17 -= 360.0D;
        }

        return var17;
    }

    protected void ura() {
        double var1 = (var1 = 360.0D * Util.fract(0.61372D + 1.190191D * this.b6)) - 0.166D * Math.sin((var1 + 50.0D + this.plnt[0]) * this.z2);
        double var3 = 149.09D + 0.088D * this.b6;
        double var5 = 51.02D - 0.897D * this.b6;
        double var7 = 0.046344D - 2.7E-5D * this.b6;
        double var9 = 0.772464D + 6.25E-4D * this.b6;
        if (this.ret == 0) {
            this.plnt[10] = this.planet(var1, var3, var5, var7, var9, 19.218D, 10);
        } else {
            this.plnt[23] = this.planet(var1, var3, var5, var7, var9, 19.218D, 10);
        }
    }

    protected void ven() {
        double var1 = 360.0D * Util.fract(0.88974D + 162.54949D * this.b6);
        double var3 = 107.7D + 0.012D * this.b6;
        double var5 = 53.22D - 0.496D * this.b6;
        double var7 = 0.00682D - 4.8E-5D * this.b6;
        double var9 = 3.39363D + 0.001D * this.b6;
        if (this.ret == 0) {
            this.plnt[6] = this.planet(var1, var3, var5, var7, var9, 0.72333D, 6);
        } else {
            this.plnt[19] = this.planet(var1, var3, var5, var7, var9, 0.72333D, 6);
        }
    }

    protected void vgcomp(String y1, double x0, int t) {
        int[] var7 = new int[8];
        int y11;
        int var5 = (y11 = (int)(x0 / 30.0D)) + 1;
        var7[1] = var5 - 12 * (var5 / 12);
        double var11;
        byte var14;
        if ((var11 = 30.0D * Util.fract(x0 / 30.0D)) >= 0.0D && var11 < 10.0D) {
            var14 = 1;
        } else if (var11 >= 10.0D && var11 < 20.0D) {
            var14 = 5;
        } else {
            var14 = 9;
        }

        var5 = y11 + var14;
        var7[2] = var5 - 12 * (var5 / 12);
        var5 = (int)(x0 * 7.0D / 30.0D + 1.0D);
        var7[3] = var5 - 12 * (var5 / 12);
        var5 = (int)(x0 * 9.0D / 30.0D + 1.0D);
        var7[4] = var5 - 12 * (var5 / 12);
        int var6 = (int)(10.0D * Util.fract(x0 / 30.0D));
        if (y11 % 2 == 0) {
            var14 = 1;
        } else {
            var14 = 9;
        }

        var5 = y11 + var6 + var14;
        var7[5] = var5 - 12 * (var5 / 12);
        var6 = (int)(12.0D * Util.fract(x0 / 30.0D));
        var5 = y11 + var6 + 1;
        var7[6] = var5 - 12 * (var5 / 12);
        var5 = (int)(x0 * 16.0D / 30.0D + 1.0D);
        var7[7] = var5 - 12 * (var5 / 12);

        for(y11 = 1; y11 <= 7; ++y11) {
            if (var7[y11] == 0) {
                var7[y11] = 12;
            }
        }

        for(y11 = 1; y11 <= 7; ++y11) {
            if (y11 == 1) {
                this.varga[t][y11 - 1] = var7[y11];
            }

            if (y11 == 4) {
                this.varga[t][5] = var7[y11];
            }
        }

    }

    public int vimshamsa(double deg) {
        int var3 = 0;
        double var4 = deg % 30.0D;
        int var6 = 0;
        int deg1 = (int)(deg / 30.0D) + 1;

        for(int var2 = 0; var2 < 20; ++var2) {
            if ((double)var2 * 1.5D <= var4 && var4 < (double)(var2 + 1) * 1.5D) {
                var6 = var2;
            }
        }

        switch(deg1) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = var6 + 1;
            break;
        case 2:
        case 5:
        case 8:
        case 11:
            var3 = var6 + 9;
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            var3 = var6 + 5;
        }

        if ((var3 %= 12) == 0) {
            var3 = 12;
        }

        return var3;
    }

    public String toString() {
        return "Name: " + this.getName() + ", Date: " + this.getDayOfBirth() + "/" + this.getMonthOfBirth() + "/" + this.getYearOfBirth() + ", Time: " + this.getHourOfBirth() + ":" + this.getMinuteOfBirth() + ":" + this.getSecondOfBirth() + ", TimeZone: " + this.getTimeZone() + " Latitude:" + this.getDegreeOfLattitude() + ":" + this.getMinuteOfLattitude() + ":" + this.getSecondOfLattitude() + " " + this.getNorthSouth() + " Longitude:" + this.getDegreeOfLongitude() + ":" + this.getMinuteOfLongitude() + ":" + this.getSecondOfLongitude() + " " + this.getEastWest();
    }

    public double getLatitude() {
        return this.lat;
    }

    public double getLongitude() {
        return this.longt;
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));
        System.out.println("started");

        try {
            Horo args1;
            (args1 = new Horo()).setHoro("8", "11", "1888", "6", "10", "0", "10", "50", "N", "78", "42", "E", "5.5");
            args1.initialize();
            args1.saptavg();
        } catch (Exception var1) {
        }
    }
}
