//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.shadbala;


import com.indoriya.horolib.dhoro.DesktopHoro;
import com.indoriya.horolib.util.Constants;

public class ShadBala extends DesktopHoro {
    private static int e = 0;
    private static int g = 0;
    private static long k;
    private int l = 0;
    private int n = 1;
    private int o = -1;
    private int p = 1;
    private int q = 2;
    private int r = 3;
    private int t = 4;
    private static int[][] u = new int[7][7];
    private int[][] v = new int[7][2];
    private double[] w = new double[7];
    private double[] x = new double[7];
    private double[] z = new double[7];
    private double[] A = new double[7];
    private double[] B = new double[7];
    private double[] C = new double[7];
    private double[] D = new double[7];
    private double[] E = new double[7];
    private double[] F = new double[7];
    private double[] G = new double[7];
    private double[] H = new double[7];
    private double[] I = new double[7];
    private double[] J = new double[7];
    private double[] K = new double[7];
    private double[] L = new double[7];
    private double[] M = new double[7];
    private double[] N = new double[7];
    private double[] O = new double[7];
    private double[] P = new double[7];
    private double[] Q = new double[7];
    private double[] R = new double[7];
    private double[] S = new double[7];
    private double[] T = new double[7];
    private int[] U = new int[12];
    private double[] V = new double[12];
    private double[] W = new double[12];
    private double[] X = new double[12];

    public ShadBala() {
    }

    public void addTwoDoubleValue(double[] dest, double[] src) {
        for(e = 0; e < 7; ++e) {
            int var10001 = e;
            dest[var10001] += src[e];
        }

    }

    public double Calc_Dig_bal(int i) {
        double[] var2;
        (var2 = new double[7])[i] = this.plnt[i] - this.f2[i];
        if (var2[i] > 180.0D) {
            var2[i] = 360.0D - var2[i];
        }

        var2[i] /= 3.0D;
        return var2[i];
    }

    protected void calculateAabdBal(double[] value) {
        this.fillZeroInDoubleArray(value);
        long var2 = (k / 360L * 3L + 1L) % 7L;
        var2 = (long)this.returnAharganDay((int)var2);
        value[(int)var2] = 15.0D;
    }

    protected void calculateAhargan() {
        k = (k = (long)this.getJulianDay()) - 2388478L;
    }

    protected double calculateAspectValueDrikBala(double deg, int plntno) {
        double var4 = 0.0D;
        if (30.0D < deg && deg <= 60.0D) {
            var4 = (deg - 30.0D) / 2.0D;
        } else if (60.0D < deg && deg <= 90.0D) {
            var4 = deg - 60.0D + 15.0D;
        } else if (90.0D < deg && deg <= 120.0D) {
            var4 = (120.0D - deg) / 2.0D + 30.0D;
        } else if (120.0D < deg && deg <= 150.0D) {
            var4 = 150.0D - deg;
        } else if (150.0D < deg && deg <= 180.0D) {
            var4 = (deg - 150.0D) * 2.0D;
        } else if (180.0D < deg && deg <= 300.0D) {
            var4 = (300.0D - deg) / 2.0D;
        }

        switch(plntno) {
        case 3:
            if (90.0D <= deg && deg < 120.0D) {
                var4 += 15.0D;
            } else if (210.0D <= deg && deg < 240.0D) {
                var4 += 15.0D;
            }
        case 4:
        case 6:
        default:
            break;
        case 5:
            if (120.0D <= deg && deg < 150.0D) {
                var4 += 30.0D;
            } else if (240.0D <= deg && deg < 270.0D) {
                var4 += 30.0D;
            }
            break;
        case 7:
            if (60.0D <= deg && deg < 90.0D) {
                var4 += 45.0D;
            } else if (270.0D <= deg && deg < 300.0D) {
                var4 += 45.0D;
            }
        }

        return var4;
    }

    protected void calculateAvasiBala() {
        double[] var11 = new double[7];

        for(int var13 = 1; var13 < 8; ++var13) {
            double var9 = 0.0D;
            double var7 = 0.0D;

            for(int var12 = 0; var12 < 12; ++var12) {
                double var1 = this.f3[var12];
                double var3 = this.f2[var12];
                double var5 = this.f3[var12 >= 11 ? var12 - 11 : var12 + 1];
                if (var1 < this.plnt[var13] && this.plnt[var13] <= var3) {
                    var7 = this.plnt[var13] - var1;
                    var9 = var3 - var1;
                }

                if (var3 < this.plnt[var13] && this.plnt[var13] <= var5) {
                    var7 = var5 - this.plnt[var13];
                    var9 = var5 - var3;
                }
            }

            var11[var13 - 1] = var7 / var9;
            var11[var13 - 1] *= 60.0D;
        }

    }

    protected void calculateAyanaBala(double[] value) {
        value[0] = this.returnAyanaBala(1) * 2.0D;
        value[1] = this.returnAyanaBala(2);
        value[2] = this.returnAyanaBala(3);
        value[3] = this.returnAyanaBala(4);
        value[4] = this.returnAyanaBala(5);
        value[5] = this.returnAyanaBala(6);
        value[6] = this.returnAyanaBala(7);
    }

    protected double calculateBhavaDigBala(int i) {
        int var5 = -1;
        byte var6 = -1;
        int var4 = (int)this.f2[i] / 30 + 1;
        double var2 = this.f2[i] - (double)(var4 - 1) * 30.0D;
        ++i;
        switch(var4) {
        case 1:
        case 2:
            var5 = this.r;
            var6 = 4;
            break;
        case 3:
        case 6:
        case 7:
        case 11:
            var5 = this.p;
            var6 = 7;
            break;
        case 4:
        case 12:
            var5 = this.q;
            var6 = 10;
            break;
        case 5:
            var5 = this.r;
            var6 = 4;
            break;
        case 8:
            var5 = this.t;
            var6 = 1;
            break;
        case 9:
            if (15.0D <= var2 && var2 < 30.0D) {
                var5 = this.r;
                var6 = 4;
            } else {
                var5 = this.p;
                var6 = 7;
            }
            break;
        case 10:
            if (15.0D <= var2 && var2 < 30.0D) {
                var5 = this.q;
                var6 = 10;
            } else {
                var5 = this.r;
                var6 = 4;
            }
        }

        double var7;
        if (var5 > 0) {
            if ((i = var6 - i) < 0) {
                i = -i;
            }

            if (i > 6) {
                i = 12 - i;
            }

            var7 = (double)i * 10.0D;
        } else {
            var7 = 0.0D;
        }

        return var7;
    }

    public void calculateBhavaDrishtiBala(double[] value, int planetNumber) {
        double[] var4 = new double[12];

        for(int var3 = 0; var3 < 12; ++var3) {
            var4[var3] = this.f2[var3] - this.plnt[planetNumber];
            if (var4[var3] < 0.0D) {
                var4[var3] += 360.0D;
            }

            value[var3] = this.calculateAspectValueDrikBala(var4[var3], planetNumber);
        }

    }

    protected void calculateBhavBala() {
        int var1 = this.varga[0][0];

        int var2;
        for(var2 = 0; var2 < 12; ++var2) {
            this.U[var2] = var1++;
            if (var1 > 12) {
                var1 = 1;
            }
        }

        for(var2 = 0; var2 < 12; ++var2) {
            this.V[var2] = this.D[this.getRasiLordOfEachBhav(this.U[var2])];
        }

        for(e = 0; e < 12; ++e) {
            this.W[e] = this.calculateBhavaDigBala(e);
        }

        this.setBhavaDrishtiBala();
    }

    protected void calculateChestaBala(double[] value) {
        double[] var4 = new double[7];
        double[] var5 = new double[7];
        double var2 = this.calculateTotalDays();
        var5[0] = this.calculateDegreeOfPlanetForChastaBala(var2, 1);
        var5[2] = this.calculateDegreeOfPlanetForChastaBala(var2, 3);
        var5[4] = this.calculateDegreeOfPlanetForChastaBala(var2, 5);
        var5[6] = this.calculateDegreeOfPlanetForChastaBala(var2, 7);
        var5[3] = var5[0];
        var5[5] = var5[0];
        var4[3] = this.calculateDegreeOfPlanetForChastaBala(var2, 4);
        var4[5] = this.calculateDegreeOfPlanetForChastaBala(var2, 6);
        var4[2] = var5[0];
        var4[4] = var5[0];
        var4[6] = var5[0];
        value[0] = this.returnChestaBala(0.0D, 0.0D, 1);
        value[1] = this.returnChestaBala(0.0D, 0.0D, 2);
        value[2] = this.returnChestaBala(var5[2], var4[2], 3);
        value[3] = this.returnChestaBala(var5[3], var4[3], 4);
        value[4] = this.returnChestaBala(var5[4], var4[4], 5);
        value[5] = this.returnChestaBala(var5[5], var4[5], 6);
        value[6] = this.returnChestaBala(var5[6], var4[6], 7);
    }

    protected double calculateDegreeOfPlanetForChastaBala(double totdays, int plnt) {
        double var6 = 0.0D;
        double var8 = 0.0D;
        double var10 = 0.0D;
        int var4 = this.y - 1900;
        switch(plnt) {
        case 1:
            var6 = 257.4568D;
            var8 = 0.9856D;
            var10 = 0.0D;
        case 2:
        default:
            break;
        case 3:
            var6 = 270.22D;
            var8 = 0.52401667D;
            var10 = 0.0D;
            break;
        case 4:
            var6 = 164.0D;
            var8 = 4.0923D;
            var10 = 6.67D - 0.00133D * (double)var4;
            break;
        case 5:
            var6 = 220.04D;
            var8 = 0.0831D;
            var10 = -(3.33D + 0.0067D * (double)var4);
            break;
        case 6:
            var6 = 328.51D;
            var8 = 1.6022222D;
            var10 = -(5.0D + 0.001D * (double)var4);
            break;
        case 7:
            var6 = 236.74D;
            var8 = 0.033439D;
            var10 = 5.0D + 0.001D * (double)var4;
        }

        double var12;
        if ((var12 = totdays * var8 + var6 + var10) >= 360.0D) {
            while((var12 -= 360.0D) >= 360.0D) {
            }
        }

        return var12;
    }

    protected void calculateDigBal(double[] value) {
        value[0] = this.plnt[1] - this.f2[3];
        value[1] = this.plnt[2] - this.f2[9];
        value[2] = this.plnt[3] - this.f2[3];
        value[3] = this.plnt[4] - this.f2[6];
        value[4] = this.plnt[5] - this.f2[6];
        value[5] = this.plnt[6] - this.f2[9];
        value[6] = this.plnt[7] - this.f2[0];

        for(e = 0; e < 7; ++e) {
            int var10001;
            if (value[e] < 0.0D) {
                var10001 = e;
                value[var10001] += 360.0D;
            }

            if (value[e] >= 180.0D) {
                value[e] = 360.0D - value[e];
            }

            var10001 = e;
            value[var10001] /= 3.0D;
            if (value[e] < 0.0D) {
                var10001 = e;
                value[var10001] = -value[var10001];
            }
        }

    }

    protected void calculateDrashkodBal(double[] value) {
        this.fillZeroInDoubleArray(value);

        for(int var4 = 1; var4 <= 7; ++var4) {
            int var2 = (int)(this.plnt[var4] / 30.0D);
            double var5 = this.plnt[var4] - (double)var2 * 30.0D;
            switch(var4) {
            case 1:
            case 3:
            case 5:
                if (0.0D <= var5 && var5 < 10.0D) {
                    value[var4 - 1] = 15.0D;
                    break;
                }

                value[var4 - 1] = 0.0D;
                break;
            case 2:
            case 6:
                if (20.0D <= var5 && var5 < 30.0D) {
                    value[var4 - 1] = 15.0D;
                    break;
                }

                value[var4 - 1] = 0.0D;
                break;
            case 4:
            case 7:
                if (10.0D <= var5 && var5 < 20.0D) {
                    value[var4 - 1] = 15.0D;
                } else {
                    value[var4 - 1] = 0.0D;
                }
            }
        }

    }

    protected void calculateDrikBala(double[] value) {
        double[][] var2 = new double[7][7];
        byte var5 = 1;
        byte var6 = 1;
        if (this.moonIsPapiOrNot()) {
            var5 = -1;
        }

        if (this.mercuryIsPapiOrNot()) {
            var6 = -1;
        }

        int var7;
        int var8;
        for(var7 = 1; var7 <= 7; ++var7) {
            for(var8 = 1; var8 <= 7; ++var8) {
                double var3;
                if ((var3 = this.plnt[var8] - this.plnt[var7]) < 0.0D) {
                    var3 += 360.0D;
                }

                switch(var7 - 1) {
                case 0:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = -this.calculateAspectValueDrikBala(var3, 1);
                    }
                    break;
                case 1:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = this.calculateAspectValueDrikBala(var3, 2) * (double)var5;
                    }
                    break;
                case 2:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = -this.calculateAspectValueDrikBala(var3, 3);
                    }
                    break;
                case 3:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = this.calculateAspectValueDrikBala(var3, 4) * (double)var6;
                    }
                    break;
                case 4:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = this.calculateAspectValueDrikBala(var3, 5);
                    }
                    break;
                case 5:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = this.calculateAspectValueDrikBala(var3, 6);
                    }
                    break;
                case 6:
                    if (var7 != var8 && 30.0D < var3 && var3 <= 300.0D) {
                        var2[var7 - 1][var8 - 1] = -this.calculateAspectValueDrikBala(var3, 7);
                    }
                }
            }
        }

        for(var7 = 0; var7 < 7; ++var7) {
            for(var8 = 0; var8 < 7; ++var8) {
                value[var7] += var2[var8][var7];
            }

            value[var7] /= 4.0D;
        }

    }

    protected void calculateHoradhipatiBal(double[] value) {
        boolean var12 = false;
        this.fillZeroInDoubleArray(value);
        double var2 = (double)Integer.parseInt(this.getHourOfBirth()) + (double)Integer.parseInt(this.getMinuteOfBirth()) / 60.0D + (double)Integer.parseInt(this.getSecondOfBirth()) / 3600.0D;
        int var10;
        if (this.vedicDay < 7) {
            var10 = this.vedicDay;
        } else {
            var10 = this.daylor;
        }

        if (0.0D <= var2 && var2 < this.rise) {
            var2 += 24.0D;
        }

        int var11 = var10;
        double var4 = (this.set - this.rise) / 12.0D;

        double var6;
        double var8;
        for(e = 0; e < 12; ++e) {
            var6 = this.rise + (double)e * var4;
            if (e < 11) {
                var8 = this.rise + (double)(e + 1) * var4;
            } else {
                var8 = this.set;
            }

            if (var6 <= var2 && var2 <= var8) {
                var12 = true;
            }

            if (!var12) {
                var11 = (var10 + e * 5) % 7;
            }
        }

        if (!var12) {
            var10 = var11;
            var4 = (24.0D - this.set + this.rise) / 12.0D;

            for(e = 0; e < 13; ++e) {
                var6 = this.set + (double)e * var4;
                var8 = this.set + (double)(e + 1) * var4;
                if (!var12) {
                    var11 = (var10 + (e + 1) * 5) % 7;
                }

                if (var6 < var2 && var2 <= var8) {
                    var12 = true;
                }
            }
        }

        value[var11] = 60.0D;
    }

    protected void calculateIsthaniyaBala(double[] value) {
        this.calculateUcchBala(this.G);
        this.calculateSaptavargaBala(this.H);
        this.calculateOojyugmBal(this.I);
        this.calculateKendradiBal(this.J);
        this.calculateDrashkodBal(this.K);

        for(int value1 = 0; value1 < 7; ++value1) {
            this.w[value1] = this.G[value1] + this.H[value1] + this.I[value1] + this.J[value1] + this.K[value1];
        }

    }

    protected void calculateKaalBala(double[] value) {
        this.fillZeroInDoubleArray(value);
        this.calculateNattonatBal(this.L);
        this.calculatePakshBal(this.P);
        this.calculateTribaghBal(this.M);
        this.calculateAhargan();
        this.calculateAabdBal(this.Q);
        this.calculateMasadhipatiBal(this.N);
        this.calculateVaradhipatiBal(this.R);
        this.calculateHoradhipatiBal(this.O);
        this.calculateAyanaBala(this.S);

        for(int var2 = 0; var2 < 7; ++var2) {
            value[var2] = this.L[var2] + this.M[var2] + this.N[var2] + this.O[var2] + this.P[var2] + this.Q[var2] + this.R[var2] + this.S[var2] + this.T[var2];
        }

    }

    protected void calculateKastaIstaPhal(double[] kasta, double[] ista) {
        double[] var3 = new double[7];
        double[] var4 = new double[7];
        this.calculateUcchBala(var3);
        this.calculateChestaBala(var4);

        for(e = 0; e < 7; ++e) {
            kasta[e] = Math.sqrt((60.0D - var3[e]) * (60.0D - var4[e]));
            ista[e] = Math.sqrt(var3[e] * var4[e]);
        }

    }

    protected void calculateKendradiBal(double[] value) {
        int[] var2 = new int[7];
        this.fillZeroInDoubleArray(value);
        var2[0] = this.planetInBhav(1, 0);
        var2[1] = this.planetInBhav(2, 0);
        var2[2] = this.planetInBhav(3, 0);
        var2[3] = this.planetInBhav(4, 0);
        var2[4] = this.planetInBhav(5, 0);
        var2[5] = this.planetInBhav(6, 0);
        var2[6] = this.planetInBhav(7, 0);

        for(int var3 = 0; var3 < 7; ++var3) {
            if (var2[var3] == 1 || var2[var3] == 4 || var2[var3] == 7 || var2[var3] == 10) {
                value[var3] = 60.0D;
            }

            if (var2[var3] == 2 || var2[var3] == 5 || var2[var3] == 8 || var2[var3] == 11) {
                value[var3] = 30.0D;
            }

            if (var2[var3] == 3 || var2[var3] == 6 || var2[var3] == 9 || var2[var3] == 12) {
                value[var3] = 15.0D;
            }
        }

    }

    protected void calculateMasadhipatiBal(double[] value) {
        this.fillZeroInDoubleArray(value);
        long var2 = ((k / 30L << 1) + 1L) % 7L;
        var2 = (long)this.returnAharganDay((int)var2);
        value[(int)var2] = 30.0D;
    }

    protected void calculateNaisargikaBal(double[] value) {
        value[0] = 60.0D;
        value[1] = 51.42D;
        value[2] = 17.16D;
        value[3] = 25.74D;
        value[4] = 34.26D;
        value[5] = 42.84D;
        value[6] = 8.58D;
    }

    protected void calculateNattonatBal(double[] value) {
        double var4 = 0.0D;
        boolean var8 = true;
        this.fillZeroInDoubleArray(value);
        double var6 = (double)Integer.parseInt(this.getHourOfBirth()) + (double)Integer.parseInt(this.getMinuteOfBirth()) / 60.0D + (double)Integer.parseInt(this.getSecondOfBirth()) / 3600.0D;
        double var2;
        if (this.rise <= var6 && var6 <= this.set) {
            if ((var2 = (this.set - this.rise) / 2.0D + this.rise) - var6 < 0.0D) {
                var4 = var6 - var2;
            } else {
                var4 = var2 - var6;
            }
        } else {
            var8 = false;
            if ((var2 = (24.0D - this.set + this.rise) / 2.0D + this.set) <= 24.0D && var6 > this.set && var6 <= 24.0D) {
                if (var2 - var6 < 0.0D) {
                    var4 = var6 - var2;
                } else {
                    var4 = var2 - var6;
                }
            } else if (var2 <= 24.0D && var6 < this.rise) {
                var4 = (var4 = 24.0D - var2) + var6;
            } else if (var2 > 24.0D && var6 > this.set && var6 < 24.0D) {
                var4 = (var4 = var2 - 24.0D) + (24.0D - var6);
            } else if (var2 > 24.0D) {
                if ((var4 = var2 - 24.0D) - var6 < 0.0D) {
                    var4 = var6 - var4;
                } else {
                    var4 -= var6;
                }
            }
        }

        var4 = var4 * 15.0D / 3.0D;
        double var10;
        double var12;
        if (var8) {
            var12 = 60.0D - var4;
            var10 = var4;
        } else {
            var12 = var4;
            var10 = 60.0D - var4;
        }

        value[0] = var12;
        value[1] = var10;
        value[2] = var10;
        value[3] = 60.0D;
        value[4] = var12;
        value[5] = var12;
        value[6] = var10;
    }

    protected void calculateOojyugmBal(double[] value) {
        for(int var2 = 1; var2 <= 7; ++var2) {
            if (var2 != 2 && var2 != 6) {
                if (this.varga[var2][0] % 2 != 0) {
                    value[var2 - 1] = 15.0D;
                }

                if (this.varga[var2][5] % 2 != 0) {
                    value[var2 - 1] += 15.0D;
                }
            } else {
                if (this.varga[var2][0] % 2 == 0) {
                    value[var2 - 1] = 15.0D;
                }

                if (this.varga[var2][5] % 2 == 0) {
                    value[var2 - 1] += 15.0D;
                }
            }
        }

    }

    protected void calculatePakshBal(double[] value) {
        boolean var4 = true;
        double var2;
        if (this.plnt[2] < this.plnt[1]) {
            var2 = this.plnt[2] + 360.0D;
        } else {
            var2 = this.plnt[2];
        }

        if ((var2 -= this.plnt[1]) > 180.0D) {
            var4 = false;
            var2 = 360.0D - var2;
        }

        var2 /= 3.0D;
        if (var4) {
            value[0] = 60.0D - var2;
            if (this.moonIsPapiOrNot()) {
                value[1] = 60.0D - var2;
            } else {
                value[1] = var2;
            }

            value[2] = 60.0D - var2;
            if (this.mercuryIsPapiOrNot()) {
                value[3] = 60.0D - var2;
            } else {
                value[3] = var2;
            }

            value[4] = var2;
            value[5] = var2;
            value[6] = 60.0D - var2;
        } else {
            value[0] = 60.0D - var2;
            if (this.moonIsPapiOrNot()) {
                value[1] = var2 * 2.0D;
            } else {
                value[1] = 60.0D - var2;
            }

            value[2] = 60.0D - var2;
            if (this.mercuryIsPapiOrNot()) {
                value[3] = 60.0D - var2;
            } else {
                value[3] = var2;
            }

            value[4] = var2;
            value[5] = var2;
            value[6] = 60.0D - var2;
        }
    }

    protected void calculateSaptavargaBala(double[] value) {
        double[][] var2 = new double[7][7];
        int[] var3 = new int[]{0, 1, 2, 4, 5, 7, 12};
        this.fillZeroInDoubleArray(value);
        this.tatkalikMatriChart();

        int var5;
        int var6;
        for(var5 = 0; var5 < 7; ++var5) {
            this.panchadMatri(var3[var5]);

            for(var6 = 0; var6 < 7; ++var6) {
                if (this.isInOwnSign(var6, this.varga[var6 + 1][var3[var5]])) {
                    if (this.planetInMoolTrikon(var6) && var5 == 0) {
                        var2[var6][var5] = 45.0D;
                    } else if (var5 == 0) {
                        var2[var6][var5] = 45.0D;
                    } else {
                        var2[var6][var5] = 30.0D;
                    }
                } else {
                    int var4 = this.v[var6][0] + this.returnTatkalikMatriPoints(var6, var3[var5]);
                    var2[var6][var5] = this.returnSaptavargaBala(var4);
                }

                this.v[var6][0] = 0;
            }
        }

        for(var5 = 0; var5 < 7; ++var5) {
            for(var6 = 0; var6 < 7; ++var6) {
                value[var5] += var2[var5][var6];
            }
        }

    }

    protected double calculateTotalDays() {
        int var1;
        int var2 = (var1 = this.getYearOfBirth() - 1900) / 4;
        double var3 = ((double)Integer.parseInt(this.getHourOfBirth()) + (double)Integer.parseInt(this.getMinuteOfBirth()) / 60.0D) / 24.0D;
        return (double)var1 * 365.0D + (double)var2 + ((double)((this.getMonthOfBirth() - 1) * 30) + (double)(this.getDayOfBirth() - 1) + var3 - 0.04D);
    }

    protected void calculateTotalShadBala(double[] value) {
        for(int var2 = 0; var2 < 7; ++var2) {
            value[var2] = this.w[var2] + this.x[var2] + this.z[var2] + this.A[var2] + this.B[var2] + this.C[var2];
        }

    }

    protected void calculateTribaghBal(double[] value) {
        double[] var4 = new double[3];
        this.fillZeroInDoubleArray(value);
        double var2 = Double.valueOf(this.getHourOfBirth()) + Double.valueOf(this.getMinuteOfBirth()) / 60.0D + Double.valueOf(this.getSecondOfBirth()) / 3600.0D;
        double var5;
        if (this.rise < var2 && var2 < this.set) {
            var5 = this.set - this.rise;
            var4[0] = this.rise;
            var4[1] = this.rise + var5 / 3.0D;
            var4[2] = this.rise + var5 * 2.0D / 3.0D;
            if (var4[0] < var2 && var2 < var4[1]) {
                value[3] = 60.0D;
            } else if (var4[1] < var2 && var2 < var4[2]) {
                value[0] = 60.0D;
            } else if (var4[2] < var2 && var2 < this.set) {
                value[6] = 60.0D;
            }
        } else {
            var5 = 24.0D + this.rise - this.set;
            var4[0] = this.set;
            var4[1] = this.set + var5 / 3.0D;
            var4[2] = this.set + var5 * 2.0D / 3.0D;

            for(e = 0; e < 3; ++e) {
                if (var4[e] >= 24.0D) {
                    int var10001 = e;
                    var4[var10001] -= 24.0D;
                }
            }

            if (var4[0] < var2 && var2 < var4[1]) {
                value[1] = 60.0D;
            } else if (var4[2] < var2 && var2 < this.rise) {
                value[2] = 60.0D;
            } else {
                value[5] = 60.0D;
            }
        }

        value[4] = 60.0D;
    }

    protected void calculateUcchBala(double[] value) {
        double[] var2 = new double[]{190.0D, 213.0D, 118.0D, 345.0D, 275.0D, 177.0D, 20.0D};
        this.fillZeroInDoubleArray(value);

        for(int var3 = 0; var3 < 7; ++var3) {
            value[var3] = this.plnt[var3 + 1] - var2[var3];
            if (value[var3] < 0.0D) {
                value[var3] = -value[var3];
            }

            if (value[var3] > 180.0D) {
                value[var3] = 360.0D - value[var3];
            }

            value[var3] /= 3.0D;
        }

    }

    protected void calculateVaradhipatiBal(double[] value) {
        this.fillZeroInDoubleArray(value);
        if (this.vedicDay < 7) {
            value[this.vedicDay] = 45.0D;
        } else {
            value[this.daylor] = 45.0D;
        }

        System.out.println("  vedicDay   " + this.vedicDay);
        System.out.println("  daylor   " + this.daylor);
    }

    protected void fillZeroInDoubleArray(double[] value) {
        for(e = 0; e < 7; ++e) {
            value[e] = 0.0D;
        }

    }

    public double getAbdaBala(int planetName) {
        return this.Q[planetName];
    }

    public double getAllPlanetBalaInRatio(int planetName) {
        return this.getTotalShadBalaInRupa(planetName) / this.getAllPlanetMinimumBalaInRupa(planetName);
    }

    public double getAllPlanetMinimumBalaInRupa(int planetName) {
        return (new double[]{5.0D, 6.0D, 5.0D, 7.0D, 6.5D, 5.5D, 5.0D})[planetName];
    }

    public double getAyanaBala(int planetName) {
        return this.S[planetName];
    }

    public double getBhavaDhipatiBala(int bhavNumber) {
        return this.V[bhavNumber];
    }

    public double getBhavaDigBala(int bhavaNumber) {
        return this.W[bhavaNumber];
    }

    public double getBhavaDrishtiBala(int bhavaNumber) {
        return this.X[bhavaNumber];
    }

    public double getChestaBala(int planetName) {
        return this.A[planetName];
    }

    public double getDigBala(int planetName) {
        return this.x[planetName];
    }

    public double getDreskonBala(int planetName) {
        return this.K[planetName];
    }

    public double getDrikBala(int planetName) {
        return this.C[planetName];
    }

    public double getHoraBala(int planetName) {
        return this.O[planetName];
    }

    public double getIstaPhal(int planetName) {
        return this.E[planetName];
    }

    public double getIsthaniyaBala(int planetNumber) {
        return this.w[planetNumber];
    }

    public double getKaalBala(int planetName) {
        return this.z[planetName];
    }

    public double getKandraBala(int planetName) {
        return this.J[planetName];
    }

    public double getKastPhal(int planetName) {
        return this.F[planetName];
    }

    public double getMasaBala(int planetName) {
        return this.N[planetName];
    }

    public double getNaisargikaBala(int planetName) {
        return this.B[planetName];
    }

    public double getNathonnathBala(int planetName) {
        return this.L[planetName];
    }

    public double getOjhaBala(int planetName) {
        return this.I[planetName];
    }

    public double getPakshaBala(int planetName) {
        return this.P[planetName];
    }

    public int getRasiLordOfEachBhav(int rasi) {
        System.out.println(rasi);
        byte rasi1;
        switch(rasi) {
        case 1:
        case 8:
            rasi1 = 2;
            break;
        case 2:
        case 7:
            rasi1 = 5;
            break;
        case 3:
        case 6:
            rasi1 = 3;
            break;
        case 4:
            rasi1 = 1;
            break;
        case 5:
            rasi1 = 0;
            break;
        case 9:
        case 12:
            rasi1 = 4;
            break;
        case 10:
        case 11:
            rasi1 = 6;
            break;
        default:
            rasi1 = 0;
        }

        System.out.println(rasi1);
        System.out.println("----------------------------");
        return rasi1;
    }

    public double getSaptaBala(int planetName) {
        return this.H[planetName];
    }

    public double getSaptaBalaInRupa(int planetName) {
        return this.H[planetName] / 60.0D;
    }

    public double getTotalBhavaBalaInRupa(int bhavNumber) {
        return this.getTotalBhavBala(bhavNumber) / 60.0D;
    }

    public double getTotalBhavBala(int bhavNumber) {
        return this.V[bhavNumber] + this.W[bhavNumber] + this.X[bhavNumber];
    }

    public double getTotalBhavBalaInRupa(int bhavNumber) {
        return this.V[bhavNumber] / 60.0D;
    }

    public double getTotalShadBala(int planetName) {
        return this.D[planetName];
    }

    public double getTotalShadBalaInRupa(int planetName) {
        return this.getTotalShadBala(planetName) / 60.0D;
    }

    public double getTribhagaBala(int planetName) {
        return this.M[planetName];
    }

    public double getUccahBala(int planetName) {
        return this.G[planetName];
    }

    public double getVaraBala(int planetName) {
        return this.R[planetName];
    }

    public double getYuddhaBala(int planetName) {
        return 0.0D;
    }

    public boolean isInOwnSign(int planetNumber, int sign) {
        boolean var3 = false;
        switch(planetNumber) {
        case 0:
            if (sign != 5) {
                return var3;
            }
            break;
        case 1:
            if (sign != 4) {
                return var3;
            }
            break;
        case 2:
            if (sign == 1 || sign == 8) {
                var3 = true;
            }

            return var3;
        case 3:
            if (sign != 3) {
                return var3;
            }
            break;
        case 4:
            if (sign == 9 || sign == 12) {
                var3 = true;
            }

            return var3;
        case 5:
            if (sign == 2 || sign == 7) {
                var3 = true;
            }

            return var3;
        case 6:
            if (sign != 10 && sign != 11) {
                return var3;
            }
            break;
        default:
            return var3;
        }

        var3 = true;
        return var3;
    }

    protected void kaalBala(double[] value) {
        double[] var2 = new double[7];
        this.fillZeroInDoubleArray(value);
        this.calculateNattonatBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculatePakshBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateTribaghBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateAhargan();
        this.calculateAabdBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateMasadhipatiBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateVaradhipatiBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateHoradhipatiBal(var2);
        this.addTwoDoubleValue(value, var2);
        this.calculateAyanaBala(var2);
        this.addTwoDoubleValue(value, var2);
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));
        ShadBala args1 = new ShadBala();

        try {
            args1.setHoro("8", "11", "1888", "6", "10", "0", "10", "50", "N", "78", "42", "E", "5.5");
            args1.initialize();
            args1.setShadBala();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        System.out.println("--------------------BhavaDhipatiBala-------------------------");

        int var1;
        for(var1 = 0; var1 < 12; ++var1) {
            System.out.println(var1 + "  " + args1.getBhavaDhipatiBala(var1));
        }

        System.out.println("--------------------BhavaDigBala-------------------------");

        for(var1 = 0; var1 < 12; ++var1) {
            System.out.println(var1 + "  " + args1.getBhavaDigBala(var1));
        }

        System.out.println("--------------------BhavaDrishtiBala-------------------------");

        for(var1 = 0; var1 < 12; ++var1) {
            System.out.println(var1 + "  " + args1.getBhavaDrishtiBala(var1));
        }

        System.out.println("--------------------TotalBhavBala-------------------------");

        for(var1 = 0; var1 < 12; ++var1) {
            System.out.println(var1 + "  " + args1.getTotalBhavBala(var1));
        }

        System.out.println("--------------------TotalShadBala-------------------------");

        for(var1 = 0; var1 < 7; ++var1) {
            System.out.println(var1 + "  " + args1.getTotalShadBala(var1));
        }

    }

    protected boolean mercuryIsPapiOrNot() {
        boolean var1 = false;
        int var2 = 0;
        int var3 = 0;
        if (this.moonIsPapiOrNot()) {
            var1 = true;
        }

        for(e = 1; e <= 7; ++e) {
            if (e != 4 && this.varga[4][0] == this.varga[e][0]) {
                switch(e) {
                case 1:
                case 3:
                case 7:
                    ++var2;
                    break;
                case 2:
                    if (var1) {
                        ++var2;
                    } else {
                        ++var3;
                    }
                case 4:
                default:
                    break;
                case 5:
                case 6:
                    ++var3;
                }
            }
        }

        if (var2 - var3 > 0) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean moonIsPapiOrNot() {
        double var1;
        if ((var1 = this.plnt[2] - this.plnt[1]) < 0.0D) {
            var1 += 360.0D;
        }

        var1 = (var1 /= 12.0D) + 1.0D;
        if (23.0D <= var1 && var1 <= 30.0D) {
            return true;
        } else {
            return 1.0D <= var1 && var1 <= 7.0D;
        }
    }

    protected int naisargikMatri(int plntno, int colNumber) {
        int var3 = 0;
        colNumber = this.varga[plntno][colNumber];
        switch(plntno) {
        case 1:
            if (colNumber != 1 && colNumber != 4 && colNumber != 8 && colNumber != 9 && colNumber != 12 && colNumber != 5) {
                if (colNumber != 2 && colNumber != 7 && colNumber != 10 && colNumber != 11) {
                    if (colNumber == 3 || colNumber == 6) {
                        var3 = 0;
                        return var3;
                    }
                } else {
                    var3 = this.o;
                }

                return var3;
            }

            var3 = this.n;
            return var3;
        case 2:
            if (colNumber != 3 && colNumber != 5 && colNumber != 6 && colNumber != 4) {
                if (colNumber == 1 || colNumber == 8 || colNumber == 9 || colNumber == 12 || colNumber == 2 || colNumber == 7 || colNumber == 10 || colNumber == 11) {
                    var3 = 0;
                }

                return var3;
            }

            var3 = this.n;
            return var3;
        case 3:
            if (colNumber != 5 && colNumber != 4 && colNumber != 9 && colNumber != 12 && colNumber != 1 && colNumber != 8) {
                if (colNumber != 2 && colNumber != 7 && colNumber != 10 && colNumber != 11) {
                    if (colNumber == 3 || colNumber == 6) {
                        var3 = this.o;
                        return var3;
                    }
                } else {
                    var3 = 0;
                }

                return var3;
            }

            var3 = this.n;
            return var3;
        case 4:
            if (colNumber == 2 || colNumber == 5 || colNumber == 7 || colNumber == 3 || colNumber == 6) {
                var3 = this.n;
                return var3;
            }

            if (colNumber != 1 && colNumber != 8 && colNumber != 9 && colNumber != 10 && colNumber != 11 && colNumber != 12) {
                if (colNumber != 4) {
                    return var3;
                }
                break;
            }

            var3 = 0;
            return var3;
        case 5:
            if (colNumber != 1 && colNumber != 4 && colNumber != 5 && colNumber != 8 && colNumber != 9 && colNumber != 12) {
                if (colNumber != 10 && colNumber != 11) {
                    if (colNumber == 2 || colNumber == 3 || colNumber == 6 || colNumber == 7) {
                        var3 = this.o;
                        return var3;
                    }
                } else {
                    var3 = 0;
                }

                return var3;
            } else {
                var3 = this.n;
                return var3;
            }
        case 6:
            if (colNumber != 3 && colNumber != 6 && colNumber != 10 && colNumber != 11 && colNumber != 2 && colNumber != 7) {
                if (colNumber != 1 && colNumber != 8 && colNumber != 9 && colNumber != 12) {
                    if (colNumber == 4 || colNumber == 5) {
                        var3 = this.o;
                        return var3;
                    }
                } else {
                    var3 = 0;
                }

                return var3;
            } else {
                var3 = this.n;
                return var3;
            }
        case 7:
            if (colNumber == 2 || colNumber == 3 || colNumber == 6 || colNumber == 7 || colNumber == 10 || colNumber == 11) {
                var3 = this.n;
                return var3;
            } else {
                if (colNumber == 9 || colNumber == 12) {
                    var3 = 0;
                } else if (colNumber == 1 || colNumber == 4 || colNumber == 5 || colNumber == 8) {
                    break;
                }

                return var3;
            }
        default:
            return var3;
        }

        var3 = this.o;
        return var3;
    }

    public void newMethod() {
    }

    protected void panchadMatri(int colNumber) {
        this.v[0][0] = this.naisargikMatri(1, colNumber);
        this.v[0][1] = this.tatkalikMatri(1, this.varga[2][colNumber], colNumber);
        this.v[1][0] = this.naisargikMatri(2, colNumber);
        this.v[1][1] = this.tatkalikMatri(2, this.varga[3][colNumber], colNumber);
        this.v[2][0] = this.naisargikMatri(3, colNumber);
        this.v[2][1] = this.tatkalikMatri(3, this.varga[4][colNumber], colNumber);
        this.v[3][0] = this.naisargikMatri(4, colNumber);
        this.v[3][1] = this.tatkalikMatri(4, this.varga[5][colNumber], colNumber);
        this.v[4][0] = this.naisargikMatri(5, colNumber);
        this.v[4][1] = this.tatkalikMatri(5, this.varga[6][colNumber], colNumber);
        this.v[5][0] = this.naisargikMatri(6, colNumber);
        this.v[5][1] = this.tatkalikMatri(6, this.varga[7][0], colNumber);
        this.v[6][0] = this.naisargikMatri(7, colNumber);
        this.v[6][1] = this.tatkalikMatri(7, this.varga[8][colNumber], colNumber);
    }

    protected int planetInBhav(int planet, int kundlitype) {
        if ((planet = this.varga[planet][0] - this.varga[0][0]) < 0) {
            planet += 12;
        }

        ++planet;
        return planet;
    }

    protected boolean planetInMoolTrikon(int plntnum) {
        boolean var2 = false;
        int var5 = (int)(this.plnt[plntnum + 1] / 30.0D);
        double var3 = this.plnt[plntnum + 1] - 30.0D * (double)var5;
        ++var5;
        switch(plntnum) {
        case 0:
            if (var5 == 5 && var3 <= 20.0D) {
                var2 = true;
            }
            break;
        case 1:
            if (var5 == 2 && 3.0D < var3 && var3 <= 30.0D) {
                var2 = true;
            }
            break;
        case 2:
            if (var5 == 1 && var3 <= 12.0D) {
                var2 = true;
            }
            break;
        case 3:
            if (var5 == 6 && 15.0D < var3 && var3 <= 20.0D) {
                var2 = true;
            }
            break;
        case 4:
            if (var5 == 9 && var3 <= 10.0D) {
                var2 = true;
            }
            break;
        case 5:
            if (var5 == 7 && var3 <= 20.0D) {
                var2 = true;
            }
            break;
        case 6:
            if (var5 == 11 && var3 <= 20.0D) {
                var2 = true;
            }
        }

        return var2;
    }

    protected int returnAharganDay(int day) {
        if ((day += 2) > 6) {
            --day;
            day %= 6;
        }

        return day;
    }

    protected double returnAyanaBala(int plntno) {
        double var2 = this.returnPlntDegreeAyanBala(plntno);
        double var4 = this.returnBhujAyanBala(var2);
        double var6 = this.returnvalueOfBhujAyanBala(var4);
        plntno = this.returnSignAyanBala(var2, plntno);
        var6 = var6 * (double)plntno / 60.0D;
        return (var6 + 24.0D) * 5.0D / 4.0D;
    }

    public double returnBhavaDrishtiBala(double deg, int planetNumber) {
        return 0.0D;
    }

    protected double returnBhujAyanBala(double deg) {
        if (0.0D <= deg && deg < 90.0D) {
            return deg;
        } else if (90.0D <= deg && deg < 180.0D) {
            return 180.0D - deg;
        } else if (180.0D <= deg && deg < 270.0D) {
            return deg - 180.0D;
        } else {
            return 270.0D <= deg && deg < 360.0D ? 360.0D - deg : deg - 360.0D;
        }
    }

    protected double returnChestaBala(double meanDeg, double seeghDeg, int plntNo) {
        double var6 = -1.0D;
        double var8 = -1.0D;
        switch(plntNo) {
        case 1:
            var8 = this.plnt[1] + this.plnt[0] + 90.0D;
            var6 = 0.0D;
            break;
        case 2:
            if ((var8 = this.plnt[2] - this.plnt[1]) < 0.0D) {
                var8 = -var8;
            }

            var6 = 0.0D;
            break;
        case 3:
            var8 = (meanDeg + this.plnt[3]) / 2.0D;
            var6 = seeghDeg;
            break;
        case 4:
            var8 = (meanDeg + this.plnt[4]) / 2.0D;
            var6 = seeghDeg;
            break;
        case 5:
            var8 = (meanDeg + this.plnt[5]) / 2.0D;
            var6 = seeghDeg;
            break;
        case 6:
            var8 = (meanDeg + this.plnt[6]) / 2.0D;
            var6 = seeghDeg;
            break;
        case 7:
            var8 = (meanDeg + this.plnt[7]) / 2.0D;
            var6 = seeghDeg;
        }

        double var10;
        if (var8 >= var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }

        if (var8 >= 360.0D) {
            var10 -= 360.0D;
        } else if (var10 >= 180.0D) {
            var10 = 360.0D - var10;
        }

        return var10 /= 3.0D;
    }

    protected double returnPlntDegreeAyanBala(int plntno) {
        switch(plntno) {
        case 1:
            return this.plnt[1] + this.plnt[0];
        case 2:
            return this.plnt[2] + this.plnt[0];
        case 3:
            return this.plnt[3] + this.plnt[0];
        case 4:
            return this.plnt[4] + this.plnt[0];
        case 5:
            return this.plnt[5] + this.plnt[0];
        case 6:
            return this.plnt[6] + this.plnt[0];
        case 7:
            return this.plnt[7] + this.plnt[0];
        default:
            return -1.0D;
        }
    }

    protected double returnSaptavargaBala(int index) {
        double var2 = 0.0D;
        switch(index) {
        case -2:
            var2 = 1.875D;
            break;
        case -1:
            var2 = 3.75D;
            break;
        case 0:
            var2 = 7.5D;
            break;
        case 1:
            var2 = 15.0D;
            break;
        case 2:
            var2 = 22.5D;
        }

        return var2;
    }

    protected int returnSignAyanBala(double degOfplnt, int plntno) {
        double var4 = degOfplnt;
        if (degOfplnt >= 360.0D) {
            var4 = degOfplnt - 360.0D;
        }

        switch(plntno) {
        case 1:
            if (0.0D <= var4 && var4 < 180.0D) {
                return 1;
            }

            return -1;
        case 2:
            if (0.0D <= var4 && var4 < 180.0D) {
                return -1;
            }

            return 1;
        case 3:
            if (0.0D <= var4 && var4 < 180.0D) {
                return 1;
            }

            return -1;
        case 4:
            return 1;
        case 5:
            if (0.0D <= var4 && var4 < 180.0D) {
                return 1;
            }

            return -1;
        case 6:
            if (0.0D <= var4 && var4 < 180.0D) {
                return 1;
            }

            return -1;
        case 7:
            if (0.0D <= var4 && var4 < 180.0D) {
                return -1;
            }

            return 1;
        default:
            return -100;
        }
    }

    protected int returnTatkalikMatriPoints(int plntno, int colnumber) {
        byte var3 = 0;
        byte var4 = 0;
        switch(plntno) {
        case 0:
            var3 = 0;
            break;
        case 1:
            var3 = 1;
            break;
        case 2:
            var3 = 2;
            break;
        case 3:
            var3 = 3;
            break;
        case 4:
            var3 = 4;
            break;
        case 5:
            var3 = 5;
            break;
        case 6:
            var3 = 6;
        }

        if (this.varga[plntno + 1][colnumber] == 5) {
            var4 = 0;
        }

        if (this.varga[plntno + 1][colnumber] == 4) {
            var4 = 1;
        }

        if (this.varga[plntno + 1][colnumber] == 1 || this.varga[plntno + 1][colnumber] == 8) {
            var4 = 2;
        }

        if (this.varga[plntno + 1][colnumber] == 3 || this.varga[plntno + 1][colnumber] == 6) {
            var4 = 3;
        }

        if (this.varga[plntno + 1][colnumber] == 9 || this.varga[plntno + 1][colnumber] == 12) {
            var4 = 4;
        }

        if (this.varga[plntno + 1][colnumber] == 2 || this.varga[plntno + 1][colnumber] == 7) {
            var4 = 5;
        }

        if (this.varga[plntno + 1][colnumber] == 10 || this.varga[plntno + 1][colnumber] == 11) {
            var4 = 6;
        }

        return u[var3][var4];
    }

    protected double returnvalueOfBhujAyanBala(double bhuj) {
        int[] var3 = new int[]{362, 341, 299, 236, 150, 52};
        int[] var4 = new int[]{362, 703, 1002, 1238, 1388, 1440};
        double var8 = 0.0D;
        int var5 = (int)bhuj / 15;
        double var6 = bhuj - (double)(var5 * 15);
        if (var5 == 0) {
            var8 = var6 * (double)var3[var5] / 15.0D;
        }

        if (var5 > 0) {
            --var5;
            var8 = (double)var4[var5] + var6 * (double)var3[var5 + 1] / 15.0D;
        }

        return var8;
    }

    public void setBhavaDrishtiBala() {
        double[] var1 = new double[12];
        double[] var2 = new double[12];
        double[] var3 = new double[12];
        double[] var4 = new double[12];
        double[] var5 = new double[12];
        double[] var6 = new double[12];
        double[] var7 = new double[12];
        this.calculateBhavaDrishtiBala(var1, 1);
        this.calculateBhavaDrishtiBala(var2, 2);
        this.calculateBhavaDrishtiBala(var3, 3);
        this.calculateBhavaDrishtiBala(var4, 4);
        this.calculateBhavaDrishtiBala(var5, 5);
        this.calculateBhavaDrishtiBala(var6, 6);
        this.calculateBhavaDrishtiBala(var7, 7);
        boolean var9 = this.moonIsPapiOrNot();
        boolean var10 = this.mercuryIsPapiOrNot();
        if (var9) {
            System.out.println(" MOON IS PAPI");
        }

        if (var10) {
            System.out.println(" merisPAPI");
        }

        System.out.println("sunBala->  " + var1[0] + "moonBala->  " + var2[0] + "marBala->  " + var3[0] + "merBala->  " + var4[0] + "jupBala->  " + var5[0] + "venBala->  " + var6[0] + "satBala->  " + var7[0]);

        int var8;
        for(var8 = 0; var8 < 12; ++var8) {
            var1[var8] /= -4.0D;
            if (var9) {
                var2[var8] /= -4.0D;
            } else {
                var2[var8] /= 4.0D;
            }

            var3[var8] /= -4.0D;
            var6[var8] /= 4.0D;
            var7[var8] /= -4.0D;
            if (var10) {
                var4[var8] = -var4[var8];
            }
        }

        for(var8 = 0; var8 < 12; ++var8) {
            this.X[var8] = var1[var8] + var2[var8] + var3[var8] + var4[var8] + var5[var8] + var6[var8] + var7[var8];
        }

    }

    public void setShadBala() {
        this.calculateIsthaniyaBala(this.w);
        this.calculateDigBal(this.x);
        this.calculateKaalBala(this.z);
        this.calculateChestaBala(this.A);
        this.calculateNaisargikaBal(this.B);
        this.calculateDrikBala(this.C);
        this.calculateTotalShadBala(this.D);
        this.calculateBhavBala();
        this.calculateKastaIstaPhal(this.F, this.E);
    }

    protected int tatkalikMatri(int plntno, int rasi, int colNumber) {
        int var4 = 0;
        int var5 = 0;
        if (rasi == 5) {
            var5 = this.varga[1][colNumber];
        } else if (rasi == 4) {
            var5 = this.varga[2][colNumber];
        } else if (rasi != 1 && rasi != 8) {
            if (rasi != 3 && rasi != 6) {
                if (rasi != 9 && rasi != 12) {
                    if (rasi != 2 && rasi != 7) {
                        if (rasi == 10 || rasi == 11) {
                            var5 = this.varga[7][colNumber];
                        }
                    } else {
                        var5 = this.varga[6][colNumber];
                    }
                } else {
                    var5 = this.varga[5][colNumber];
                }
            } else {
                var5 = this.varga[4][colNumber];
            }
        } else {
            var5 = this.varga[3][colNumber];
        }

        if ((plntno = var5 - this.varga[plntno + 1][colNumber]) < 0) {
            plntno += 12;
        }

        ++plntno;
        switch(plntno) {
        case 1:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            var4 = this.o;
            break;
        case 2:
        case 3:
        case 4:
        case 10:
        case 11:
        case 12:
            var4 = this.n;
        }

        return var4;
    }

    protected void tatkalikMatriChart() {
        for(e = 0; e < 7; ++e) {
            for(g = 0; g < 7; ++g) {
                if (e != g) {
                    int var1;
                    if ((var1 = this.varga[e + 1][0] - this.varga[g + 1][0]) < 0) {
                        var1 += 12;
                    }

                    ++var1;
                    switch(var1) {
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        u[e][g] = this.o;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                        u[e][g] = this.n;
                    }
                }

                if (e == g) {
                    u[e][g] = 0;
                }
            }
        }

    }

    protected void yuddhaBala() {
    }
}
