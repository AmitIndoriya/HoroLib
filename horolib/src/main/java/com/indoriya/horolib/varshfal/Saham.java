//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.varshfal;


import com.indoriya.horolib.util.Util;

public class Saham {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double[] l = new double[23];
    private int m;
    private double[] n = new double[26];
    private double[] o = new double[12];
    private int[] p = new int[]{3, 6, 4, 2, 1, 4, 6, 3, 5, 7, 7, 5};
    private int[] q = new int[13];

    public Saham() {
    }

    public void calculateSaham(double planet1, double planet2, double planet3, int sahamNo) {
        if (sahamNo == 12) {
            Util.between(planet1, planet2, planet3);
        }

        double var8;
        if (sahamNo != 8 && sahamNo != 9 && sahamNo != 10 && sahamNo != 11 && sahamNo != 12 && sahamNo != 14 && sahamNo != 16 && sahamNo != 18 && sahamNo != 19 && sahamNo != 22) {
            if (this.isItDayvarshparvesh()) {
                if (Util.between(planet1, planet2, planet3)) {
                    var8 = planet1 - planet2 + planet3;
                } else {
                    var8 = planet1 - planet2 + planet3 + 30.0D;
                }
            } else if (Util.between(planet2, planet1, planet3)) {
                var8 = planet2 - planet1 + planet3;
            } else {
                var8 = planet2 - planet1 + planet3 + 30.0D;
            }
        } else if (Util.between(planet1, planet2, planet3)) {
            var8 = planet1 - planet2 + planet3;
        } else {
            var8 = planet1 - planet2 + planet3 + 30.0D;
        }

        if (var8 > 360.0D) {
            var8 -= 360.0D;
        } else if (var8 <= 0.0D) {
            var8 += 360.0D;
        }

        this.l[sahamNo] = var8;
    }

    public void create(double asc, double sun, double moon, double mars, double mercury, double jupiter, double venus, double saturn, double bhav1, double bhav2, double bhav3, double bhav4, double bhav5, double bhav6, double bhav7, double bhav8, double bhav9, double bhav10, double bhav11, double bhav12, double varshparveshTime, double sunriseTime, double sunsetTime) {
        this.a = asc;
        this.b = sun;
        this.c = moon;
        this.d = mars;
        this.f = mercury;
        this.e = jupiter;
        this.g = venus;
        this.h = saturn;
        this.i = varshparveshTime;
        this.j = sunriseTime;
        this.k = sunsetTime;
    }

    public void create(int ascNo, int[] planetInRashi, double asc, double[] plnt, double[] f2, double varshparveshTime, double sunriseTime, double sunsetTime) {
        this.m = ascNo;
        this.a = asc;
        this.b = plnt[1];
        this.c = plnt[2];
        this.d = plnt[3];
        this.f = plnt[4];
        this.e = plnt[5];
        this.g = plnt[6];
        this.h = plnt[7];
        this.o = f2;
        this.n = plnt;
        this.i = varshparveshTime;
        this.j = sunriseTime;
        this.k = sunsetTime;
        this.q = planetInRashi;
    }

    public double getLordDegree(int houseNo) {
        if ((houseNo = this.m + (houseNo - 1)) > 12) {
            houseNo -= 12;
        }

        houseNo = this.p[houseNo - 1];
        return this.n[houseNo];
    }

    public double[] getSaham() {
        return this.l;
    }

    public double getSunMoonSignLordDeg(int planetNo) {
        if (planetNo == 1) {
            planetNo = this.q[1];
            planetNo = this.p[planetNo - 1];
            return this.n[planetNo];
        } else {
            planetNo = this.q[2];
            planetNo = this.p[planetNo - 1];
            return this.n[planetNo];
        }
    }

    public void initializeSaham() {
        this.calculateSaham(this.c, this.b, this.a, 0);
        this.calculateSaham(this.b, this.c, this.a, 1);
        this.calculateSaham(this.e, this.l[0], this.a, 2);
        this.calculateSaham(this.l[1], this.l[0], this.g, 3);
        this.calculateSaham(this.h, this.b, this.a, 4);
        this.calculateSaham(this.c, this.g, this.a, 5);
        this.calculateSaham(this.h, this.e, this.a, 6);
        this.calculateSaham(this.d, this.f, this.a, 7);
        this.calculateSaham(this.o[7], this.c, this.h, 8);
        this.calculateSaham(this.o[8], this.getLordDegree(9), this.a, 9);
        this.calculateSaham(this.o[1], this.getLordDegree(2), this.a, 10);
        this.calculateSaham(this.g, this.b, this.a, 11);
        this.calculateSaham(this.a, this.c, this.a, 12);
        this.calculateSaham(this.c, this.h, this.a, 13);
        this.calculateSaham(this.c, this.f, this.a, 14);
        if (this.isItDayvarshparvesh()) {
            this.calculateSaham(this.h, this.b, this.getSunMoonSignLordDeg(1), 15);
        } else {
            this.calculateSaham(this.h, this.c, this.getSunMoonSignLordDeg(2), 15);
        }

        this.calculateSaham(this.g, this.h, this.a, 16);
        this.calculateSaham(this.e, this.f, this.a, 17);
        this.calculateSaham(this.l[1], this.l[0], this.a, 18);
        this.calculateSaham(this.d, this.f, this.a, 19);
        this.calculateSaham(this.d, this.h, this.a, 20);
        this.calculateSaham(this.l[0], this.h, this.a, 21);
        this.calculateSaham(this.c, this.g, this.a, 22);
    }

    public boolean isItDayvarshparvesh() {
        boolean var1;
        if (this.i >= this.j && this.i < this.k) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public static void main(String[] args) {
        new Saham();
    }
}
