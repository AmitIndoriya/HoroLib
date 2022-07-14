//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.purehoro;


import com.indoriya.horolib.AscTable;
import com.indoriya.horolib.horo.Horo;
import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.EngUtil;
import com.indoriya.horolib.util.SUtil;
import com.indoriya.horolib.util.Util;
import com.indoriya.horolib.util.UtilDesktop;

public class PureHoro extends Horo implements IPureHoro {
    protected UtilDesktop utilDesktop = new UtilDesktop();

    public PureHoro() {
    }

    public StringBuffer balance(double moon) {
        StringBuffer var9 = new StringBuffer();
        double var3;
        double var5 = Util.fract(var3 = 9.0D * Util.fract(moon / 120.0D));
        int moon1 = (int)var3;
        double var7;
        int var4 = (int)(var7 = (1.0D - var5) * this.y1[moon1]);
        int var12 = (int)(Util.fract(var7) * 12.0D);
        int var2 = (int)(Util.fract(Util.fract(var7) * 12.0D) * 31.0D);

        try {
            if (this.getLanguageCode().equalsIgnoreCase("0")) {
                var9.append(this.x1[moon1] + " " + var4 + " Y " + var12 + " M " + var2 + " D \n");
            } else {
                var9.append(this.x1[moon1] + " " + var4 + " o " + var12 + " ek " + var2 + " fn \n");
            }
        } catch (NullPointerException var10) {
            CSystem.out(CSystem.ERRO_R, "Method Name : balance   ClassName : PureHoro");
            CSystem.out(CSystem.ERRO_R, var10.toString());
        }

        return var9;
    }

    public int CalcMangalDosh() {
        int var1;
        if ((var1 = (var1 = 0 + this.returnMangalDoshPoints(this.varga[0][0], this.varga[3][0])) + this.returnMangalDoshPoints(this.varga[2][0], this.varga[3][0]) + this.returnMangalDoshPoints(this.varga[0][3], this.varga[3][3])) == 99) {
            var1 = 100;
        }

        switch(var1) {
        case 0:
            return 1;
        case 33:
            return 2;
        case 66:
            return 3;
        case 100:
            return 4;
        default:
            return -1;
        }
    }

    public double degreesInSign(double degree) {
        return degree - (double)((int)(degree / 30.0D) * 30) + 0.005D;
    }

    public double getAscendentLongitude() {
        return this.f2[0];
    }

    public int getAscendentSign() {
        return (int)(this.f2[0] / 30.0D + 1.0D);
    }

    public int getAscendentSubLord() {
        return Util.getSub(this.f2[0]);
    }

    public int getAshtakvargaBinduForSignAndPlanet(int signNo, int planetNo) {
        return this.ashtakArray[signNo][planetNo];
    }

    public double getAyanamsa() {
        return this.aya;
    }

    public double getBhavBeginForBhav(int bhavNo) {
        return this.f3[bhavNo - 1];
    }

    public double getDayDuration() {
        return this.set - this.rise;
    }

    public double getFortuna() {
        double var1;
        if ((var1 = this.plntkp[1] + this.f4[0] - this.plntkp[0]) < 0.0D) {
            var1 += 360.0D;
        }

        return var1;
    }

    public int getGana() {
        int var2 = 0;
        int[][] var3 = new int[][]{{1, 5, 7, 8, 13, 15, 17, 22, 27}, {3, 9, 10, 14, 16, 18, 19, 23, 24}, {2, 4, 6, 11, 12, 20, 21, 25, 26}};
        double var4 = this.plnt[2] * 0.075D;
        this.tt[1] = (double)Math.round(var4 * 100.0D) / 100.0D;
        int var1 = (int)this.tt[1] + 1;

        for(int var6 = 0; var6 < 3; ++var6) {
            for(int var5 = 0; var5 < 9; ++var5) {
                if (var3[var6][var5] == var1) {
                    var2 = var6;
                    break;
                }
            }
        }

        return var2;
    }

    public double getGmtAtBirth() {
        return this.birthTime - (double)this.timeZone;
    }

    public int getHinduWeekday() {
        if (this.birthTime - this.rise < 0.0D) {
            this.vedicDay = this.daylor - 1;
        } else {
            this.vedicDay = this.daylor;
        }

        if (this.vedicDay < 0) {
            this.vedicDay += 7;
        }

        return this.vedicDay;
    }

    public int getIndianSunSign() {
        if (this.plnt[1] >= 360.0D) {
            double[] var10000 = this.plnt;
            var10000[1] -= 360.0D;
        }

        return (int)(this.plnt[1] / 30.0D);
    }

    public double getIshtkaal() {
        double var1;
        if ((var1 = (this.birthTime - this.rise) * 2.5D) < 0.0D) {
            var1 += 60.0D;
        }

        return var1;
    }

    public int getJulianDay() {
        return this.julDay + 1720995;
    }

    public int getjvalue() {
        return this.j;
    }

    public int getKPAscendentNakshatraLord() {
        return (int)(this.f4[0] * 0.075D) % 9;
    }

    public int getKPAscendentSubLord() {
        return Util.getSub(this.f4[0]);
    }

    public double getKPAyanamsaLongitude() {
        return this.kpaya;
    }

    public int[] getKPBhavOccupants(int bhavNo) {
        int[] var2 = new int[12];
        double var5 = 0.0D;
        int var11 = 0;
        int[] var12 = new int[13];

        int var13;
        for(var13 = 0; var13 < 13; ++var13) {
            var12[var13] = 0;
        }

        double var3 = this.f4[bhavNo - 1];
        double var7;
        if ((var7 = bhavNo >= 12 ? this.f4[bhavNo - 12] : this.f4[bhavNo]) < var3) {
            var5 = var7;
            var7 += 360.0D;
        }

        for(var13 = 1; var13 <= 12; ++var13) {
            double var9 = this.plnt[var13];
            if (var5 != 0.0D && var9 < var5) {
                var9 += 360.0D;
                var5 = 0.0D;
            }

            if (var9 >= var3 && var9 < var7) {
                var12[var13] = 1;
            }
        }

        for(var13 = 1; var13 < 13; ++var13) {
            if (var12[var13] == 1) {
                var2[var11] = var13;
                ++var11;
            }
        }

        return var2;
    }

    public int getKPBhavOwner(int bhavaNo) {
        return this.owner[bhavaNo - 1];
    }

    public double getKPCuspLongitude(int cuspNo) {
        return this.f4[cuspNo - 1];
    }

    public double getKPFortunaLongitude() {
        return this.plntkp[1] + this.f4[0] - this.plntkp[0];
    }

    public int getKPMoonSubLord() {
        return Util.getSub(this.getKPPlanetLongitude(2));
    }

    public int getKPNakshatraLord() {
        return (int)(this.f4[0] * 0.075D) % 9;
    }

    public double getKPPlanetLongitude(int planetNo) {
        double var2;
        if ((var2 = this.plntkp[planetNo - 1]) >= 360.0D) {
            var2 -= 360.0D;
        }

        return var2;
    }

    public int[] getKPPlanetSignification(int planetNo) {
        char[] var2 = "364214635775".toCharArray();
        char[] var3 = "345972861".toCharArray();
        int[] var5 = new int[13];
        int[] var6 = new int[12];
        int[][] var9 = new int[13][13];

        int var4;
        int var8;
        for(var4 = 1; var4 <= 12; ++var4) {
            for(var8 = 1; var8 <= 12; ++var8) {
                var9[var4][var8] = 0;
            }
        }

        for(int var7 = 1; var7 <= 12; ++var7) {
            double var16 = 0.0D;

            for(var8 = 0; var8 < 13; ++var8) {
                var5[var8] = 0;
            }

            double var12 = this.f4[var7 - 1];
            double var14;
            if ((var14 = var7 >= 12 ? this.f4[var7 - 12] : this.f4[var7]) < var12) {
                var16 = var14;
                var14 += 360.0D;
            }

            var4 = (int)(var12 / 30.0D);
            var4 = var2[var4] - 48;
            var9[var4][var7] = 1;

            double var18;
            for(var8 = 1; var8 <= 12; ++var8) {
                var18 = this.plnt[var8];
                if (var16 != 0.0D && var18 < var16) {
                    var18 += 360.0D;
                }

                if (var18 >= var12 && var18 < var14) {
                    var5[var8] = 1;
                    var9[var8][var7] = 1;
                }
            }

            var12 = (double)((var4 = var3[var4 - 1] - 48) - 1) * 40.0D / 3.0D;
            var14 = (double)var4 * 40.0D / 3.0D;

            for(var8 = 1; var8 <= 12; ++var8) {
                if ((var18 = this.plnt[var8]) >= var12 && var18 < var14) {
                    var9[var8][var7] = 1;
                }

                if (var18 >= var12 + 120.0D && var18 < var14 + 120.0D) {
                    var9[var8][var7] = 1;
                }

                if (var18 >= var12 + 240.0D && var18 < var14 + 240.0D) {
                    var9[var8][var7] = 1;
                }
            }

            for(var8 = 1; var8 <= 9; ++var8) {
                if (var5[var8] == 1) {
                    var12 = (double)((var4 = var3[var8 - 1] - 48) - 1) * 40.0D / 3.0D;
                    var14 = (double)var4 * 40.0D / 3.0D;

                    for(var4 = 1; var4 <= 12; ++var4) {
                        if ((var18 = this.plnt[var4]) > var12 && var18 <= var14) {
                            var9[var4][var7] = 1;
                        }

                        if (var18 > var12 + 120.0D && var18 <= var14 + 120.0D) {
                            var9[var4][var7] = 1;
                        }

                        if (var18 > var12 + 240.0D && var18 <= var14 + 240.0D) {
                            var9[var4][var7] = 1;
                        }
                    }
                }
            }
        }

        int var20 = 0;

        for(var8 = 1; var8 <= 12; ++var8) {
            if (var9[planetNo][var8] == 1) {
                var6[var20] = var8;
                ++var20;
            }
        }

        return var6;
    }

    public int[] getKPPlanetSignificator(int planetNo) {
        char[] var2 = "34597286100000".toCharArray();
        int[] var3 = new int[12];
        int var4 = 0;
        int var11 = 0;

        int var12;
        for(var12 = 0; var12 < 12; ++var12) {
            if (this.owner[var12] == planetNo) {
                var11 = var12 + 1;
            }
        }

        int var7;
        double var5 = (double)((var7 = var2[planetNo - 1] - 48) - 1) * 40.0D / 3.0D;
        double var13 = (double)var7 * 40.0D / 3.0D;

        double var9;
        for(var12 = 1; var12 <= 12; ++var12) {
            if ((var9 = this.plnt[var12]) >= var5 && var9 < var13) {
                this.plsig[var12][var11] = 1;
            }

            if (var9 >= var5 + 120.0D && var9 < var13 + 120.0D) {
                this.plsig[var12][var11] = 1;
            }

            if (var9 >= var5 + 240.0D && var9 < var13 + 240.0D) {
                this.plsig[var12][var11] = 1;
            }
        }

        int[] var14 = this.getKPBhavOccupants(var11);

        for(var11 = 1; var11 <= 9; ++var11) {
            if (var14[var11] == 1) {
                var5 = (double)((var7 = var2[var11 - 1] - 48) - 1) * 40.0D / 3.0D;
                var13 = (double)var7 * 40.0D / 3.0D;

                for(this.i = 1; this.i <= 12; ++this.i) {
                    if ((var9 = this.plnt[this.i]) > var5 && var9 <= var13) {
                        this.plsig[this.i][this.y] = 1;
                    }

                    if (var9 > var5 + 120.0D && var9 <= var13 + 120.0D) {
                        this.plsig[this.i][this.y] = 1;
                    }

                    if (var9 > var5 + 240.0D && var9 <= var13 + 240.0D) {
                        this.plsig[this.i][this.y] = 1;
                    }
                }
            }
        }

        for(var11 = 1; var11 <= 12; ++var11) {
            if (this.plsig[planetNo][var11] == 1) {
                var3[var4] = var11;
                ++var4;
            }
        }

        return var3;
    }

    public int[] getKPPlanetSignificationStrong(int planetNo) {
        char[] var2 = "364214635775".toCharArray();
        char[] var3 = "345972861".toCharArray();
        int[] var5 = new int[13];
        int[] var6 = new int[12];
        int[][] var9 = new int[13][13];

        int var4;
        int var8;
        for(var4 = 1; var4 <= 12; ++var4) {
            for(var8 = 1; var8 <= 12; ++var8) {
                var9[var4][var8] = 0;
            }
        }

        for(int var7 = 1; var7 <= 12; ++var7) {
            double var16 = 0.0D;

            for(var8 = 0; var8 < 13; ++var8) {
                var5[var8] = 0;
            }

            double var12 = this.f4[var7 - 1];
            double var14;
            if ((var14 = var7 >= 12 ? this.f4[var7 - 12] : this.f4[var7]) < var12) {
                var16 = var14;
                var14 += 360.0D;
            }

            var4 = (int)(var12 / 30.0D);
            var4 = var2[var4] - 48;
            if (this.a(var7)) {
                var9[var4][var7] = 1;
            }

            double var18;
            for(var8 = 1; var8 <= 12; ++var8) {
                var18 = this.plnt[var8];
                if (var16 != 0.0D && var18 < var16) {
                    var18 += 360.0D;
                }

                if (var18 >= var12 && var18 < var14) {
                    var5[var8] = 1;
                    var9[var8][var7] = 1;
                }
            }

            if (this.a(var7)) {
                var12 = (double)((var4 = var3[var4 - 1] - 48) - 1) * 40.0D / 3.0D;
                var14 = (double)var4 * 40.0D / 3.0D;

                for(var8 = 1; var8 <= 12; ++var8) {
                    if ((var18 = this.plnt[var8]) >= var12 && var18 < var14) {
                        var9[var8][var7] = 1;
                    }

                    if (var18 >= var12 + 120.0D && var18 < var14 + 120.0D) {
                        var9[var8][var7] = 1;
                    }

                    if (var18 >= var12 + 240.0D && var18 < var14 + 240.0D) {
                        var9[var8][var7] = 1;
                    }
                }
            }

            for(var8 = 1; var8 <= 9; ++var8) {
                if (var5[var8] == 1) {
                    var12 = (double)((var4 = var3[var8 - 1] - 48) - 1) * 40.0D / 3.0D;
                    var14 = (double)var4 * 40.0D / 3.0D;

                    for(var4 = 1; var4 <= 12; ++var4) {
                        if ((var18 = this.plnt[var4]) > var12 && var18 <= var14) {
                            var9[var4][var7] = 1;
                        }

                        if (var18 > var12 + 120.0D && var18 <= var14 + 120.0D) {
                            var9[var4][var7] = 1;
                        }

                        if (var18 > var12 + 240.0D && var18 <= var14 + 240.0D) {
                            var9[var4][var7] = 1;
                        }
                    }
                }
            }
        }

        int var20 = 0;

        for(var8 = 1; var8 <= 12; ++var8) {
            if (var9[planetNo][var8] == 1) {
                var6[var20] = var8;
                ++var20;
            }
        }

        return var6;
    }

    private boolean a(int var1) {
        double var2 = this.f4[var1 - 1];
        double var4 = var1 >= 12 ? this.f4[var1 - 12] : this.f4[var1];
        double var6 = 0.0D;
        if (var4 < var2) {
            var6 = var4;
            var4 += 360.0D;
        }

        this.f = (int)(var2 / 30.0D);

        for(this.j = 1; this.j <= 9; ++this.j) {
            double var8 = this.plnt[this.j];
            if (var6 != 0.0D && var8 < var6) {
                var8 += 360.0D;
            }

            if (var8 >= var2 && var8 < var4) {
                return false;
            }
        }

        return true;
    }

    public int[] getKPPlnetsInPlanetNakshatra(int planetNo) {
        char[] var2 = "345972861".toCharArray();
        int[] var9 = new int[13];
        int var10 = 0;
        int[] var11 = new int[12];
        if (planetNo > 0 && planetNo <= 9) {
            int var12 = 0;

            int var13;
            for(var13 = 0; var13 < 12; ++var13) {
                if (this.owner[var13] == planetNo) {
                    var12 = var13 + 1;
                }
            }

            for(var13 = 0; var13 < 13; ++var13) {
                var9[var13] = 0;
            }

            double var3 = (double)((planetNo = var2[planetNo - 1] - 48) - 1) * 40.0D / 3.0D;
            double var5 = (double)planetNo * 40.0D / 3.0D;

            for(var13 = 1; var13 <= 12; ++var13) {
                double var7;
                if ((var7 = this.plnt[var13]) >= var3 && var7 < var5) {
                    var9[var13] = 1;
                    this.plsig[var13][var12] = 1;
                }

                if (var7 >= var3 + 120.0D && var7 < var5 + 120.0D) {
                    var9[var13] = 1;
                    this.plsig[var13][var12] = 1;
                }

                if (var7 >= var3 + 240.0D && var7 < var5 + 240.0D) {
                    var9[var13] = 1;
                    this.plsig[var13][var12] = 1;
                }
            }

            for(var13 = 1; var13 < 13; ++var13) {
                if (var9[var13] == 1) {
                    var11[var10] = var13;
                    ++var10;
                }
            }

            return var11;
        } else {
            return var9;
        }
    }

    public int getLagna() {
        return (int)(this.f2[0] / 30.0D);
    }

    public double getLMTCorrection() {
        double var1;
        double var3 = ((var1 = (double)this.timeZone * 15.0D) - this.longt) * 4.0D / 60.0D;
        if (this.longt > var1) {
            var3 = -var3;
        }

        return var3;
    }

    public double getLMTOfBirth() {
        double var3 = ((double)this.timeZone * 15.0D - this.longt) * 4.0D / 60.0D;
        return this.birthTime - var3;
    }

    public double getLongitudeOfPlanet(int planetNo) {
        return this.plnt[planetNo - 1];
    }

    public double getMidBhavForBhava(int bhavNo) {
        return this.f2[bhavNo - 1];
    }

    public int getMoonSign() {
        return (int)(this.getMoon() / 30.0D);
    }

    public int getMoonSubLord() {
        return Util.getSub(this.getMoon());
    }

    public int getNadi() {
        byte var3 = 0;
        double var5 = this.plnt[2] * 0.075D;
        this.tt[1] = (double)Math.round(var5 * 100.0D) / 100.0D;
        int var1;
        int var2 = (int)((double)(var1 = (int)this.tt[1] + 1) / 3.0D + 0.99D);
        var1 -= (var2 - 1) * 3;
        if (var2 % 2 == 0) {
            if (var1 == 1) {
                var3 = 2;
            } else if (var1 == 3) {
                var3 = 0;
            }
        } else if (var1 == 3) {
            var3 = 2;
        } else if (var1 == 1) {
            var3 = 0;
        }

        if (var1 == 2) {
            var3 = 1;
        }

        return var3;
    }

    public int getNakshatra() {
        return (int)(this.plnt[2] * 0.075D);
    }

    public int getNakshatra(double d) {
        int d1;
        return d1 = (int)(d * 0.075D);
    }

    public int getNakshatraForKPCusp(int cuspNo) {
        return (int)(this.f4[cuspNo - 1] * 0.075D);
    }

    public int getNakshatraForKPPlanet(int planetNo) {
        planetNo = (int)(this.plntkp[planetNo - 1] * 0.075D);
        System.out.println("LLL" + planetNo);
        return planetNo;
    }

    public int getNakshatraForPlanet(int j) {
        double var2 = this.plnt[j];
        return this.getNakshatra(var2);
    }

    public int getNakshatraLord() {
        return (int)Math.round(this.plnt[2] * 0.075D * 100.0D) / 100 % 9;
    }

    public double getObliquity() {
        return this.obliq;
    }

    public int getPadaOfPlanet(int planetNo) {
        return (int)(4.0D * Util.fract(this.plnt[planetNo] * 3.0D / 40.0D) + 1.0D);
    }

    public int getPaksha() {
        double var1;
        if ((var1 = (this.plnt[2] - this.plnt[1]) / 12.0000001D) < 0.0D) {
            var1 += 30.0D;
        }

        this.tt[0] = (double)Math.round(var1 * 100.0D) / 100.0D;
        int var3;
        if ((var3 = (int)this.tt[0] + 1) == 30) {
            var3 = 15;
        } else {
            var3 = var3 % 15 - 1;
        }

        if (var3 == -1) {
            var3 = 14;
        }

        int var2;
        if ((var2 = (int)(this.plnt[2] - this.plnt[1])) <= 0) {
            var2 += 360;
        }

        if (var2 > 180 && var2 < 360) {
            return var3 == 15 ? 0 : 0;
        } else {
            return 1;
        }
    }

    public int getPanchadhaFriendshipOfPlanet(int planetNo) {
        return 1;
    }

    public int getPaya() {
        byte var1 = 0;
        int var2;
        if ((var2 = (int)this.plnt[2] / 30 - (int)this.f2[0] / 30 + 1) <= 0) {
            var2 += 12;
        }

        switch(var2) {
        case 1:
        case 6:
        case 11:
            var1 = 0;
            break;
        case 2:
        case 5:
        case 9:
            var1 = 1;
            break;
        case 3:
        case 7:
        case 10:
            var1 = 2;
            break;
        case 4:
        case 8:
        case 12:
            var1 = 3;
        }

        return var1;
    }

    public int getPermanentFriendshipOfPlanet(int planetNo) {
        return 1;
    }

    public double getPlanetaryLongitude(int planetNo) {
        return this.plnt[planetNo];
    }

    public int getPlanetaryPada(int planetNo) {
        return (int)(4.0D * Util.fract(this.plnt[planetNo] * 3.0D / 40.0D) + 1.0D);
    }

    public int getPlanetaryRasi(int planetNo) {
        return (int)(this.plnt[planetNo] / 30.0D);
    }

    public String getPlanetName(int planetNo) {
        String var2 = "";

        try {
            var2 = this.graha[planetNo];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPlanetName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public int[] getPositionForShodasvarg(int position) {
        int[] var2 = new int[13];

        for(int var3 = 0; var3 < 13; ++var3) {
            var2[var3] = this.varga[var3][position];
        }

        return var2;
    }

    public int getPrastharashtakvargaTables(int tableNo1, int planetNo1, int bindu) {
        return this.prastakvarga[tableNo1 - 1][planetNo1 - 1][bindu - 1];
    }

    public int getRashiForKPCusp(int cusp) {
        return (int)(this.f4[cusp - 1] / 30.0D);
    }

    public int getRashiForKPPlanet(int planetNo) {
        return (int)this.plnt[planetNo] / 30;
    }

    public int getRasi() {
        return (int)(this.plnt[2] / 30.0D);
    }

    public int getRasiLord() {
        return (int)(this.plnt[2] / 30.0D);
    }

    public int getShodashvargaSignForVargaAndPlanet(int vargaNo, int planetNo) {
        return this.varga[vargaNo][planetNo];
    }

    public double getSiderealTime() {
        return this.sidtime;
    }

    public int getSookshmaDasaForPlanet(int planetNo1, int planetNo2, int planetNo3, int planetNo4) {
        return 1;
    }

    public int getSthiraAnatykarkaPlanet() {
        return 0;
    }

    public int getSthiraAtmakarakaPlanet() {
        return 0;
    }

    public int getSthiraBhatruPlanet() {
        return 0;
    }

    public int getSthiraDarakarakaPlanet() {
        return 0;
    }

    public int getSthiraGrathikarakaPlanet() {
        return 0;
    }

    public int getSthiraMatruKarkaPlanet() {
        return 0;
    }

    public int getSthiraPutrakarakaPlanet() {
        return 0;
    }

    public int getSubLordForKPCusp(int cuspNo) {
        return Util.getSub(this.f4[cuspNo - 1]);
    }

    public int getSubLordForKPPlanet(int planetNo) {
        return Util.getSub(this.plntkp[planetNo - 1]);
    }

    public int getSubSubLordForKPCusp(int cuspNo) {
        return Util.getSubSub(this.f4[cuspNo - 1]);
    }

    public int getSubSubLordForKPPlanet(int planetNo) {
        return Util.getSubSub(this.plntkp[planetNo - 1]);
    }

    public double getSunRiseTime() {
        this.calcSunRiseSet(this.y, this.m, this.d, this.longt, this.lat);
        return this.rise;
    }

    public double getSunSetTime() {
        this.calcSunRiseSet(this.y, this.m, this.d, this.longt, this.lat);
        return this.set;
    }

    public int getSunSign() {
        double var1;
        if ((var1 = this.plnt[1] + this.plnt[0]) >= 360.0D) {
            var1 -= 360.0D;
        }

        int var3;
        return var3 = (int)(var1 / 30.0D);
    }

    public int getSunSignLord() {
        double var1;
        if ((var1 = this.plnt[1] + this.plnt[0]) >= 360.0D) {
            var1 -= 360.0D;
        }

        int var3;
        return var3 = (int)(var1 / 30.0D);
    }

    public int getTemporaryFriendshipOfPlanet(int planetNo) {
        return 1;
    }

    public int getTithi() {
        double var1;
        if ((var1 = (this.plnt[2] - this.plnt[1]) / 12.0000001D) < 0.0D) {
            var1 += 30.0D;
        }

        this.tt[0] = var1;
        return (int)this.tt[0];
    }

    public double getTithiValue() {
        return this.tt[0];
    }

    public int[] getTotalAshtakVargaValue() {
        return this.totalAshtavarga;
    }

    public double getTropicalCuspalLongitude() {
        return this.sidtime;
    }

    public double getTropicalPlanetLongitude(int planetNo) {
        return this.sidtime;
    }

    public int getVarna() {
        double var1 = (double)((int)this.plnt[2]) / 30.0000001D;
        int[] var3 = new int[]{0, 2, 1, 3, 0, 2, 1, 3, 0, 2, 1, 3};
        int var4 = (int)Math.round(var1 * 100.0D) / 100;
        return var3[var4];
    }

    public int getVasya() {
        int var1;
        byte var5;
        if ((var1 = (int)Math.round(this.plnt[2] / 30.0000001D * 100.0D) / 100) != 0 && var1 != 1 && var1 != 4) {
            if (var1 != 2 && var1 != 5 && var1 != 6) {
                if (var1 == 3) {
                    var5 = 2;
                } else if (var1 == 7) {
                    var5 = 3;
                } else if (var1 != 10 && var1 != 11) {
                    if (var1 == 8) {
                        var5 = 0;
                    } else {
                        if (var1 != 9) {
                            return 5;
                        }

                        var5 = 4;
                    }
                } else {
                    var5 = 4;
                }
            } else {
                var5 = 1;
            }
        } else {
            var5 = 0;
        }

        return var5;
    }

    public double getWarDaylightCorrection() {
        return (double)this.dst;
    }

    public int getYoga() {
        double var1;
        if ((var1 = (this.plnt[2] + this.plnt[1]) * 0.075D) > 27.0D) {
            var1 -= 27.0D;
        }

        int var3;
        return var3 = (int)var1;
    }

    public double getYogaValue() {
        return this.tt[2];
    }

    public int getYoni() {
        double var1 = this.plnt[2] * 0.075D;
        this.tt[1] = (double)Math.round(var1 * 100.0D) / 100.0D;
        byte var2 = 0;
        switch((int)this.tt[1] + 1) {
        case 1:
        case 24:
            var2 = 0;
            break;
        case 2:
        case 27:
            var2 = 1;
            break;
        case 3:
        case 8:
            var2 = 2;
            break;
        case 4:
        case 5:
            var2 = 3;
            break;
        case 6:
        case 19:
            var2 = 4;
            break;
        case 7:
        case 9:
            var2 = 5;
            break;
        case 10:
        case 11:
            var2 = 6;
            break;
        case 12:
        case 26:
            var2 = 7;
            break;
        case 13:
        case 15:
            var2 = 8;
            break;
        case 14:
        case 16:
            var2 = 9;
            break;
        case 17:
        case 18:
            var2 = 10;
            break;
        case 20:
        case 22:
            var2 = 11;
            break;
        case 21:
            var2 = 13;
            break;
        case 23:
        case 25:
            var2 = 12;
        }

        return var2;
    }

    public void initialize() throws Exception {
        super.initialize();
        this.b6 -= 1.1407711613050422E-6D;
        this.bhavInit();
        this.misc();
        this.calcSunRiseSet(this.y, this.m, this.d, this.longt, this.lat);
        this.birthTime = (double)this.h + (double)this.mt / 60.0D + (double)this.s / 3600.0D;
        this.setHinduWeekday();
        if (this.horarySeed != 0) {
            this.KPHorary(this.horarySeed);
        } else {
            this.cusp();
        }

        for(int var1 = 0; var1 < 12; ++var1) {
            this.f5[var1] = this.f4[var1] + this.kpaya - this.aya;
            double[] var10000;
            if (this.f5[var1] >= 360.0D) {
                var10000 = this.f5;
                var10000[var1] -= 360.0D;
            } else if (this.f5[var1] <= 0.0D) {
                var10000 = this.f5;
                var10000[var1] += 360.0D;
            }

            this.f6[var1] = this.f4[var1] + this.kpaya;
            if (this.f6[var1] >= 360.0D) {
                var10000 = this.f6;
                var10000[var1] -= 360.0D;
            } else if (this.f6[var1] <= 0.0D) {
                var10000 = this.f6;
                var10000[var1] += 360.0D;
            }
        }

        this.kpplnt();
        this.saptavg();
        this.calculateShodashvarga();
        super.ashtak();
        super.calculateSigBhav();
        this.utilDesktop.setLanguageCode(this.getLanguageCode());
    }

    public boolean isAccelerate(int planetNumber) {
        boolean var2 = false;
        double var3 = this.plnt[planetNumber + 1] + this.aya;
        double var5 = this.plnt[planetNumber + 1 + 13] + this.aya;
        if (var3 > 360.0D) {
            var3 -= 360.0D;
        }

        if (var5 > 360.0D) {
            var5 -= 360.0D;
        }

        if ((var3 -= var5) < 0.0D) {
            var3 += 60.0D;
        }

        var3 *= 24.0D;
        switch(planetNumber) {
        case 1:
            if (var3 > 1.0D) {
                var2 = true;
            }
            break;
        case 2:
            if (var3 > 11.84D) {
                var2 = true;
            }
            break;
        case 3:
            if (var3 > 0.78D) {
                var2 = true;
            }
            break;
        case 4:
            if (var3 > 2.0D) {
                var2 = true;
            }
            break;
        case 5:
            if (var3 > 0.17D) {
                var2 = true;
            }
            break;
        case 6:
            if (var3 > 1.18D) {
                var2 = true;
            }
            break;
        case 7:
            if (var3 > 0.13D) {
                var2 = true;
            }
        }

        return var2;
    }

    public boolean isCombust(int planetNumber) {
        boolean var2 = false;
        double var3;
        if ((var3 = this.plnt[1] - this.plnt[planetNumber + 1]) < 0.0D) {
            var3 = -var3;
        }

        switch(planetNumber + 1) {
        case 2:
            if (var3 <= 12.0D) {
                var2 = true;
            }
            break;
        case 3:
            if (var3 <= 17.0D) {
                var2 = true;
            }
            break;
        case 4:
            if (this.isRetrograde(planetNumber)) {
                if (var3 <= 12.0D) {
                    var2 = true;
                }
            } else if (var3 <= 14.0D) {
                var2 = true;
            }
            break;
        case 5:
            if (var3 <= 11.0D) {
                var2 = true;
            }
            break;
        case 6:
            if (this.isRetrograde(planetNumber)) {
                if (var3 <= 8.0D) {
                    var2 = true;
                }
            } else if (var3 <= 10.0D) {
                var2 = true;
            }
            break;
        case 7:
            if (var3 <= 16.0D) {
                var2 = true;
            }
        }

        return var2;
    }

    /** @deprecated */
    public boolean isDeblited(int planetNumber, int sign) {
        return SUtil.isDeblited(planetNumber, sign);
    }

    /** @deprecated */
    public boolean isExalted(int planetNumber, int sign) {
        return SUtil.isExalted(planetNumber, sign);
    }

    protected boolean isInAnimicalSign(int planetNumber, int sign) {
        boolean var3 = false;
        switch(planetNumber) {
        case 1:
            if (sign == 2 || sign == 10 || sign == 11) {
                var3 = true;
            }

            return var3;
        case 2:
        default:
            return var3;
        case 3:
            if (sign == 3 || sign == 6) {
                var3 = true;
            }

            return var3;
        case 4:
            if (sign != 4) {
                return var3;
            }
            break;
        case 5:
            if (sign == 2 || sign == 3 || sign == 6 || sign == 7) {
                var3 = true;
            }

            return var3;
        case 6:
            if (sign == 4 || sign == 5) {
                var3 = true;
            }

            return var3;
        case 7:
            if (sign != 1 && sign != 4 && sign != 5 && sign != 8) {
                return var3;
            }
        }

        var3 = true;
        return var3;
    }

    public boolean isInFriendSign(int planetNumber, int sign) {
        boolean var3 = false;
        switch(planetNumber) {
        case 1:
            if (sign == 4 || sign == 9 || sign == 8 || sign == 12) {
                var3 = true;
            }
            break;
        case 2:
            if (sign == 1 || sign == 3 || sign == 5 || sign == 6) {
                var3 = true;
            }
            break;
        case 3:
            if (sign == 5 || sign == 9 || sign == 12) {
                var3 = true;
            }
            break;
        case 4:
            if (sign == 2 || sign == 5 || sign == 7) {
                var3 = true;
            }
            break;
        case 5:
            if (sign == 1 || sign == 5 || sign == 8) {
                var3 = true;
            }
            break;
        case 6:
            if (sign == 3 || sign == 10 || sign == 11) {
                var3 = true;
            }
            break;
        case 7:
            if (sign == 2 || sign == 3 || sign == 6) {
                var3 = true;
            }
        }

        return var3;
    }

    public boolean isInLastQuarter(int planetNumber) {
        boolean var2 = false;
        double var3 = this.plnt[planetNumber + 1] / 30.0D;
        if (22.5D <= var3 && var3 <= 30.0D) {
            var2 = true;
        }

        return var2;
    }

    public boolean isInNeutralSign(int planetNumber, int sign) {
        boolean var3 = false;
        switch(planetNumber) {
        case 1:
            if (sign == 3 || sign == 6) {
                var3 = true;
            }

            return var3;
        case 2:
            if (sign == 7 || sign == 9 || sign == 10 || sign == 11 || sign == 12) {
                var3 = true;
            }

            return var3;
        case 3:
            if (sign == 2 || sign == 7 || sign == 11) {
                var3 = true;
            }

            return var3;
        case 4:
            if (sign == 1 || sign == 8 || sign == 9 || sign == 10 || sign == 11) {
                var3 = true;
            }

            return var3;
        case 5:
            if (sign != 11) {
                return var3;
            }
            break;
        case 6:
            if (sign == 1 || sign == 8 || sign == 9) {
                var3 = true;
            }

            return var3;
        case 7:
            if (sign != 9 && sign != 12) {
                return var3;
            }
            break;
        default:
            return var3;
        }

        var3 = true;
        return var3;
    }

    /** @deprecated */
    public boolean isInOwnSign(int planetNumber, int sign) {
        return SUtil.isInOwnSign(planetNumber, sign);
    }

    public boolean isPlanetDirect(int planetNo) {
        double var2 = this.plnt[planetNo];
        double var4;
        double var7 = (var4 = this.plnt[planetNo + 13]) - var2;
        boolean var10000;
        boolean planetNo1;
        if (planetNo != 1 && planetNo != 2) {
            if (Math.abs(var7) >= 3.0D) {
                if (var7 < 0.0D) {
                    var4 += 360.0D;
                } else {
                    var2 += 360.0D;
                }

                planetNo1 = var4 >= var2;
                return planetNo1;
            }

            var10000 = var4 >= var2;
        } else {
            var10000 = true;
        }

        planetNo1 = var10000;
        return planetNo1;
    }

    public boolean isPlanetRetrograde(int planetNo) {
        double var2 = this.plnt[planetNo];
        double var4;
        double var7 = (var4 = this.plnt[planetNo + 13]) - var2;
        boolean var10000;
        boolean planetNo1;
        if (planetNo != 1 && planetNo != 2) {
            if (Math.abs(var7) >= 3.0D) {
                if (var7 < 0.0D) {
                    var4 += 360.0D;
                } else {
                    var2 += 360.0D;
                }

                planetNo1 = var4 < var2;
                return planetNo1;
            }

            var10000 = var4 < var2;
        } else {
            var10000 = false;
        }

        planetNo1 = var10000;
        return planetNo1;
    }

    public boolean isRetrograde(int planetNumber) {
        boolean var2 = false;
        double var3 = this.plnt[planetNumber + 1] + this.aya;
        double var5 = this.plnt[planetNumber + 1 + 13] + this.aya;
        if (var3 > 360.0D) {
            var3 -= 360.0D;
        }

        if (var5 > 360.0D) {
            var5 -= 360.0D;
        }

        switch(planetNumber) {
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
            if (var3 > var5) {
                var2 = true;
            }
        default:
            return var2;
        }
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));

        try {
            PureHoro args1;
            (args1 = new PureHoro()).setCompanyName("CSL SOFTWARE LTD., G-4A, Green Park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("agra");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("10");
            args1.setHourOfBirth("9");
            args1.setDayOfBirth("26");
            args1.setMonthOfBirth("1");
            args1.setYearOfBirth("2015");
            args1.setDegreeOfLattitude("28");
            args1.setDegreeOfLongitude("77");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("12");
            args1.setMinuteOfLattitude("36");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setDST("0");
            args1.setLanguageCode("0");
            args1.initialize();
            args1.getUpgrahasMaandiAadi();
            double[] args2 = args1.getUpgraha();

            for(int var1 = 0; var1 < args2.length; ++var1) {
                System.out.println(var1 + ": " + EngUtil.dms(args2[var1]));
            }

        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public int returnMangalDoshPoints() {
        int var1 = this.getLagna();
        int var2 = this.getPlanetaryRasi(3);
        byte var3 = 0;
        if ((var1 = var2 - var1) < 0) {
            var1 += 12;
        }

        ++var1;
        if (var1 == 1 || var1 == 4 || var1 == 7 || var1 == 8 || var1 == 12) {
            var3 = 33;
        }

        return var3;
    }

    public double[] getUpgraha() {
        double var1 = (this.getSun() + 133.33333333333334D) % 360.0D;
        double var3;
        double var5 = ((var3 = 360.0D - var1) + 180.0D) % 360.0D;
        double var7 = 360.0D - var5;
        double var9 = SUtil.sub_mod(this.getSun() - 30.0D);
        return new double[]{var1, var3, var5, var7, var9};
    }

    public double[] getUpgrahasMaandiAadi() {
        double[] var1;
        double var2 = (var1 = this.calcSunRiseSet(this.y, this.m, this.d, this.longt, this.lat, false))[1] - var1[0];
        double[] var4 = this.getDayDivisons(var1[0], 8, var2);
        double var5 = var2 / 16.0D;
        boolean var19 = false;
        double var8;
        if ((var8 = (double)this.h + (double)this.mt / 60.0D + (double)this.s / 3600.0D) > var1[1] || var8 < var1[0]) {
            var19 = true;
        }

        int var18 = this.getHinduWeekday() + 1;
        int[] var3 = new int[]{1, 3, 4, 5, 7, 7};
        int[] var7 = new int[6];
        double[] var20 = new double[6];
        double[] var9 = new double[6];
        System.out.println("Today's Day: " + var18);

        for(int var10 = 0; var10 < 6; ++var10) {
            var7[var10] = var3[var10] - var18;
            if (var19) {
                var7[var10] = (var7[var10] + 4) % 8;
            }

            if (var7[var10] < 0) {
                var7[var10] += 8;
            }

            var20[var10] += var4[var7[var10]];
            if (var10 != 5) {
                var20[var10] += var5;
            }

            double var16;
            String var11 = String.valueOf((int)(var16 = var20[var10]));
            String var12 = String.valueOf((int)(var16 = Util.fract(var16) * 60.0D));
            String var13 = String.valueOf((int)(Util.fract(var16) * 60.0D));
            AscTable var14;
            (var14 = new AscTable()).setHoro(String.valueOf(this.getDayOfBirth()), String.valueOf(this.getMonthOfBirth()), String.valueOf(this.getYearOfBirth()), var11, var12, var13, this.getDegreeOfLattitude(), this.getMinuteOfLattitude(), this.getNorthSouth(), this.getDegreeOfLongitude(), this.getMinuteOfLongitude(), this.getEastWest(), this.getTimeZone());
            var14.initialize();
            var9[var10] = var14.f2[0];
            System.out.println(var10 + ": " + var7[var10] + ", Time to calculate: " + var20[var10] + ", asc: " + EngUtil.dms(var9[var10]) + "double: " + var9[var10]);
        }

        return var9;
    }

    public double[] getDayDivisons(double startingPoint, int noOfdivisions, double dayDuration) {
        double[] var6 = new double[noOfdivisions + 1];
        double var7 = dayDuration / (double)noOfdivisions;
        double var9 = startingPoint;
        var6[0] = startingPoint;

        for(int startingPoint1 = 0; startingPoint1 < noOfdivisions; ++startingPoint1) {
            var9 += var7;
            var6[startingPoint1 + 1] = var9;
        }

        return var6;
    }
}
