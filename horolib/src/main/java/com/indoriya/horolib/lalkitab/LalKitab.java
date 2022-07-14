//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.lalkitab;


import com.indoriya.horolib.enhoro.EngHoro;
import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.Util;

import java.util.Calendar;

public class LalKitab extends EngHoro {
    private String[] g = new String[12];
    private String[] k = new String[12];
    private String[] l = new String[12];
    public double[] plntkp = new double[12];
    public double[] f4 = new double[12];
    public static final int LalKitabKundli = 1;
    public static final int ChandraKundli = 2;
    public static final int VarshaphalaKundli = 3;
    public int vyear;
    public static final int SUN = 1;
    public static final int MOON = 2;
    public static final int MARS = 3;
    public static final int MERCURY = 4;
    public static final int JUPITER = 5;
    public static final int VENUS = 6;
    public static final int SATURN = 7;
    public static final int RAHU = 8;
    public static final int KETU = 9;
    public static final int URANUS = 10;
    public static final int NEPTUNE = 11;
    public static final int PLUTO = 12;
    public static int ii;
    public static int age = 0;
    public static int VYear = 0;
    public static int vYear = 0;
    public static int[] house = new int[12];
    public static int[] presenthouse = new int[12];
    public static boolean userVarsh = false;
    static int[][] e = new int[][]{{1, 9, 10, 3, 5, 2, 11, 7, 6, 12, 4, 8}, {4, 1, 12, 9, 3, 7, 5, 6, 2, 8, 10, 11}, {9, 4, 1, 2, 8, 3, 10, 5, 7, 11, 12, 6}, {3, 8, 4, 1, 10, 9, 6, 11, 5, 7, 2, 12}, {11, 3, 8, 4, 1, 5, 9, 2, 12, 6, 7, 10}, {5, 12, 3, 8, 4, 11, 2, 9, 1, 10, 6, 7}, {7, 6, 9, 5, 12, 4, 1, 10, 11, 2, 8, 3}, {2, 7, 6, 12, 9, 10, 3, 1, 8, 5, 11, 4}, {12, 2, 7, 6, 11, 1, 8, 4, 10, 3, 5, 9}, {10, 11, 2, 7, 6, 12, 4, 8, 3, 1, 9, 5}, {8, 5, 11, 10, 7, 6, 12, 3, 9, 4, 1, 2}, {6, 10, 5, 11, 2, 8, 7, 12, 4, 9, 3, 1}, {1, 5, 10, 8, 11, 6, 7, 2, 12, 3, 9, 4}, {4, 1, 3, 2, 5, 7, 8, 11, 6, 12, 10, 9}, {9, 4, 1, 6, 8, 5, 2, 7, 11, 10, 12, 3}, {3, 9, 4, 1, 12, 8, 6, 5, 2, 7, 11, 10}, {11, 3, 9, 4, 1, 10, 5, 6, 7, 8, 2, 12}, {5, 11, 6, 9, 4, 1, 12, 8, 10, 2, 3, 7}, {7, 10, 11, 3, 9, 4, 1, 12, 8, 5, 6, 2}, {2, 7, 5, 12, 3, 9, 10, 1, 4, 6, 8, 11}, {12, 2, 8, 5, 10, 3, 9, 4, 1, 11, 7, 6}, {10, 12, 2, 7, 6, 11, 3, 9, 5, 1, 4, 8}, {8, 6, 12, 10, 7, 2, 11, 3, 9, 4, 1, 5}, {6, 8, 7, 11, 2, 12, 4, 10, 3, 9, 5, 1}, {1, 6, 10, 3, 2, 8, 7, 4, 11, 5, 12, 9}, {4, 1, 3, 8, 6, 7, 2, 11, 12, 9, 5, 10}, {9, 4, 1, 5, 10, 11, 12, 7, 6, 8, 2, 3}, {3, 9, 4, 1, 11, 5, 6, 8, 7, 2, 10, 12}, {11, 3, 9, 4, 1, 6, 8, 2, 10, 12, 7, 5}, {5, 11, 8, 9, 4, 1, 3, 12, 2, 10, 6, 7}, {7, 5, 11, 12, 9, 4, 1, 10, 8, 6, 3, 2}, {2, 7, 5, 11, 3, 12, 10, 6, 4, 1, 9, 8}, {12, 2, 6, 10, 8, 3, 9, 1, 5, 7, 4, 11}, {10, 12, 2, 7, 5, 9, 11, 3, 1, 4, 8, 6}, {8, 10, 12, 6, 7, 2, 4, 5, 9, 3, 11, 1}, {6, 8, 7, 2, 12, 10, 5, 9, 3, 11, 1, 4}, {1, 3, 10, 6, 9, 12, 7, 5, 11, 2, 4, 8}, {4, 1, 3, 8, 6, 5, 2, 7, 12, 10, 11, 9}, {9, 4, 1, 12, 8, 2, 10, 11, 6, 3, 5, 7}, {3, 9, 4, 1, 11, 8, 6, 12, 2, 5, 7, 10}, {11, 7, 9, 4, 1, 6, 8, 2, 10, 12, 3, 5}, {5, 11, 8, 9, 12, 1, 3, 4, 7, 6, 10, 2}, {7, 5, 11, 2, 3, 4, 1, 10, 8, 9, 12, 6}, {2, 10, 5, 3, 4, 9, 12, 8, 1, 7, 6, 11}, {12, 2, 6, 5, 10, 7, 9, 1, 3, 11, 8, 4}, {10, 12, 2, 7, 5, 3, 11, 6, 4, 8, 9, 1}, {8, 6, 12, 10, 7, 11, 4, 9, 5, 1, 2, 3}, {6, 8, 7, 11, 2, 10, 5, 3, 9, 4, 1, 12}, {1, 7, 10, 6, 12, 2, 8, 4, 11, 9, 3, 5}, {4, 1, 8, 3, 6, 12, 5, 11, 2, 7, 10, 9}, {9, 4, 1, 2, 8, 3, 12, 6, 7, 10, 5, 11}, {3, 9, 4, 1, 11, 7, 2, 12, 5, 8, 6, 10}, {11, 10, 7, 4, 1, 6, 3, 9, 12, 5, 8, 2}, {5, 11, 3, 9, 4, 1, 6, 2, 10, 12, 7, 8}, {7, 5, 11, 8, 3, 9, 1, 10, 6, 4, 2, 12}, {2, 3, 5, 11, 9, 4, 10, 1, 8, 6, 12, 7}, {12, 2, 6, 5, 10, 8, 9, 7, 4, 11, 1, 3}, {10, 12, 2, 7, 5, 11, 4, 8, 3, 1, 9, 6}, {8, 6, 12, 10, 7, 5, 11, 3, 9, 2, 4, 1}, {6, 8, 9, 12, 2, 10, 7, 5, 1, 3, 11, 4}, {1, 11, 10, 6, 12, 2, 4, 7, 8, 9, 5, 3}, {4, 1, 6, 8, 3, 12, 2, 10, 9, 5, 7, 11}, {9, 4, 1, 2, 8, 6, 12, 11, 7, 3, 10, 5}, {3, 9, 4, 1, 6, 8, 7, 12, 5, 2, 11, 10}, {11, 2, 9, 4, 1, 5, 8, 3, 10, 12, 6, 7}, {5, 10, 3, 9, 2, 1, 6, 8, 11, 7, 12, 4}, {7, 5, 11, 3, 10, 4, 1, 9, 12, 6, 8, 2}, {2, 3, 5, 11, 9, 7, 10, 1, 6, 8, 4, 12}, {12, 8, 7, 5, 11, 3, 9, 4, 1, 10, 2, 6}, {10, 12, 2, 7, 5, 11, 3, 6, 4, 1, 9, 8}, {8, 6, 12, 10, 7, 9, 11, 5, 2, 4, 3, 1}, {6, 7, 8, 12, 4, 10, 5, 2, 3, 11, 1, 9}, {1, 4, 10, 6, 12, 11, 7, 8, 2, 5, 9, 3}, {4, 2, 3, 8, 6, 12, 1, 11, 7, 10, 5, 9}, {9, 10, 1, 3, 8, 6, 2, 7, 5, 4, 12, 11}, {3, 9, 6, 1, 2, 8, 5, 12, 11, 7, 10, 4}, {11, 3, 9, 4, 1, 2, 8, 10, 12, 6, 7, 5}, {5, 11, 4, 9, 7, 1, 6, 2, 10, 12, 3, 8}, {7, 5, 11, 2, 9, 4, 12, 6, 3, 1, 8, 10}, {2, 8, 5, 11, 4, 7, 10, 3, 1, 9, 6, 12}, {12, 1, 7, 5, 11, 10, 9, 4, 8, 3, 2, 6}, {10, 12, 2, 7, 5, 3, 4, 9, 6, 8, 11, 1}, {8, 6, 12, 10, 3, 5, 11, 1, 9, 2, 4, 7}, {6, 7, 8, 12, 10, 9, 3, 5, 4, 11, 1, 2}, {1, 3, 10, 6, 12, 2, 8, 11, 5, 4, 9, 7}, {4, 1, 8, 3, 6, 12, 11, 2, 7, 9, 10, 5}, {9, 4, 1, 7, 3, 8, 12, 5, 2, 6, 11, 10}, {3, 9, 4, 1, 8, 10, 2, 7, 12, 5, 6, 11}, {11, 10, 9, 4, 1, 6, 7, 12, 3, 8, 5, 2}, {5, 11, 6, 9, 4, 1, 3, 8, 10, 2, 7, 12}, {7, 5, 11, 2, 10, 4, 6, 9, 8, 3, 12, 1}, {2, 7, 5, 11, 9, 3, 10, 4, 1, 12, 8, 6}, {12, 8, 7, 5, 2, 11, 9, 1, 6, 10, 3, 4}, {10, 12, 2, 8, 11, 5, 4, 6, 9, 7, 1, 3}, {8, 6, 12, 10, 5, 7, 1, 3, 4, 11, 2, 9}, {6, 2, 3, 12, 7, 9, 5, 10, 11, 1, 4, 8}, {1, 9, 10, 6, 12, 2, 7, 5, 3, 4, 8, 11}, {4, 1, 6, 8, 10, 12, 11, 2, 9, 7, 3, 5}, {9, 4, 1, 2, 6, 8, 12, 11, 5, 3, 10, 7}, {3, 10, 8, 1, 5, 7, 6, 12, 2, 9, 11, 4}, {11, 3, 9, 4, 1, 6, 8, 10, 7, 5, 12, 2}, {5, 11, 3, 9, 4, 1, 2, 6, 8, 12, 7, 10}, {7, 5, 11, 3, 9, 4, 1, 8, 12, 10, 2, 6}, {2, 7, 5, 11, 3, 9, 10, 1, 6, 8, 4, 12}, {12, 2, 4, 5, 11, 3, 9, 7, 10, 6, 1, 8}, {10, 12, 2, 7, 8, 5, 3, 9, 4, 11, 6, 1}, {8, 6, 12, 10, 7, 11, 4, 3, 1, 2, 5, 9}, {6, 8, 7, 12, 2, 10, 5, 4, 11, 1, 9, 3}, {1, 9, 10, 6, 12, 2, 7, 11, 5, 3, 4, 8}, {4, 1, 6, 8, 10, 12, 3, 5, 7, 2, 11, 9}, {9, 4, 1, 2, 5, 8, 12, 10, 6, 7, 3, 11}, {3, 10, 8, 9, 11, 7, 4, 1, 2, 12, 6, 5}, {11, 3, 9, 4, 1, 6, 2, 7, 10, 5, 8, 12}, {5, 11, 3, 1, 4, 10, 6, 8, 12, 9, 7, 2}, {7, 5, 11, 3, 9, 4, 1, 12, 8, 10, 2, 6}, {2, 7, 5, 11, 3, 9, 10, 6, 4, 8, 12, 1}, {12, 2, 4, 5, 6, 1, 8, 9, 3, 11, 10, 7}, {10, 12, 2, 7, 8, 11, 9, 3, 1, 6, 5, 4}, {8, 6, 12, 10, 7, 5, 11, 2, 9, 4, 1, 3}, {6, 8, 7, 12, 2, 3, 5, 4, 11, 1, 9, 10}};
    public final int[] IstLevellalkitabDasaSeries = new int[]{6, 6, 3, 6, 2, 1, 3, 6, 2, 6, 6, 3, 6, 2, 1, 3, 6, 2, 6, 6, 3, 6, 2, 1, 3, 6, 2};
    private int[][] n = new int[][]{{5, 7, 8, 9, 10}, {6, 8, 9, 10, 11}, {7, 9, 10, 11, 12}, {8, 10, 11, 12, 1}, {9, 11, 12, 1, 2}, {10, 12, 1, 2, 3}, {11, 1, 2, 3, 4}, {12, 2, 3, 4, 5}, {1, 3, 4, 5, 6}, {2, 4, 5, 6, 7}, {3, 5, 6, 7, 8}, {4, 6, 7, 8, 9}};
    private int[][] o = new int[][]{{9, 7, 6, 5, 4}, {10, 8, 7, 6, 5, 1}, {11, 9, 8, 7, 6, 2}, {12, 10, 9, 8, 7}, {1, 11, 10, 9, 8}, {2, 12, 11, 10, 9}, {3, 1, 12, 11, 10}, {4, 2, 1, 12, 11}, {5, 3, 2, 1, 12}, {6, 4, 3, 2, 1}, {7, 5, 4, 3, 2}, {8, 6, 5, 4, 3}};

    public LalKitab() {
    }

    public int[] aamHaalatPlanetForKhanaFrom(int khanaNo) {
        khanaNo = this.o[khanaNo - 1][1];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] aamHaalatPlanetForKhanaTo(int khanaNo) {
        khanaNo = this.n[khanaNo - 1][1];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[][] achanakChotPlanetForKhanaFrom(int khanaNo) {
        int[][] var2 = new int[3][9];
        int[] var4 = new int[9];
        int[] var5 = new int[9];
        int[] var3;
        int var8;
        if (Util.isKhanaBhavaKendra(khanaNo)) {
            int var6 = khanaNo + 2;
            int var7 = khanaNo + 6;
            khanaNo += 10;
            if (var6 > 12) {
                var6 -= 12;
            }

            if (var7 > 12) {
                var7 -= 12;
            }

            if (khanaNo > 12) {
                khanaNo -= 12;
            }

            for(var8 = 1; var8 <= 9; ++var8) {
                var3 = this.PlanetsInKhana(var6);
                var4 = this.PlanetsInKhana(var7);
                var5 = this.PlanetsInKhana(khanaNo);
                var2[0][var8 - 1] = var3[var8 - 1];
                var2[1][var8 - 1] = var4[var8 - 1];
                var2[2][var8 - 1] = var5[var8 - 1];
            }
        } else {
            for(var8 = 1; var8 <= 9; ++var8) {
                int var9;
                if (khanaNo != 2 && khanaNo != 5 && khanaNo != 8 && khanaNo != 11) {
                    var9 = khanaNo - 2;
                } else {
                    var9 = khanaNo + 2;
                }

                if (var9 > 12) {
                    var9 -= 12;
                }

                var3 = this.PlanetsInKhana(var9);
                var2[0][var8 - 1] = var3[var8 - 1];
                var2[1][var8 - 1] = var4[var8 - 1];
                var2[2][var8 - 1] = var5[var8 - 1];
            }
        }

        return var2;
    }

    public int[][] achanakChotPlanetForKhanaTo(int khanaNo) {
        int[][] var2 = new int[3][9];
        int[] var4 = new int[9];
        int[] var5 = new int[9];
        int[] var3;
        int var8;
        if (Util.isKhanaBhavaKendra(khanaNo)) {
            int var6 = khanaNo + 2;
            int var7 = khanaNo + 6;
            khanaNo += 10;
            if (var6 > 12) {
                var6 -= 12;
            }

            if (var7 > 12) {
                var7 -= 12;
            }

            if (khanaNo > 12) {
                khanaNo -= 12;
            }

            for(var8 = 1; var8 <= 9; ++var8) {
                var3 = this.PlanetsInKhana(var6);
                var4 = this.PlanetsInKhana(var7);
                var5 = this.PlanetsInKhana(khanaNo);
                var2[0][var8 - 1] = var3[var8 - 1];
                var2[1][var8 - 1] = var4[var8 - 1];
                var2[2][var8 - 1] = var5[var8 - 1];
            }
        } else {
            for(var8 = 1; var8 <= 9; ++var8) {
                int var9;
                if (khanaNo != 2 && khanaNo != 5 && khanaNo != 8 && khanaNo != 11) {
                    var9 = khanaNo - 2;
                } else {
                    var9 = khanaNo + 2;
                }

                if (var9 > 12) {
                    var9 -= 12;
                }

                var3 = this.PlanetsInKhana(var9);
                var2[0][var8 - 1] = var3[var8 - 1];
                var2[1][var8 - 1] = var4[var8 - 1];
                var2[2][var8 - 1] = var5[var8 - 1];
            }
        }

        return var2;
    }

    public int[] bahamMadadPlanetForKhanaFrom(int khanaNo) {
        khanaNo = this.o[khanaNo - 1][0];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] bahamMadadPlanetForKhanaTo(int khanaNo) {
        khanaNo = this.n[khanaNo - 1][0];
        return this.PlanetsInKhana(khanaNo);
    }

    private static boolean a(int var0, int var1) {
        return (new int[][]{{9, 1, 1, 0, 1, -1, -1}, {1, 9, 0, 1, 0, 0, 0}, {1, 1, 9, -1, 1, 0, 0}, {1, -1, 0, 9, 0, 1, 0}, {1, 1, 1, -1, 9, -1, 0}, {-1, -1, 0, 1, 0, 9, 1}, {-1, -1, -1, 1, 0, 1, 9}})[var0][var1] == -1;
    }

    public int[] dhokhaPlanetForKhanaFrom(int khanaNo) {
        khanaNo = this.o[khanaNo - 1][4];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] dhokhaPlanetForKhanaTo(int khanaNo) {
        khanaNo = this.n[khanaNo - 1][4];
        return this.PlanetsInKhana(khanaNo);
    }

    public String[] getDeb() {
        return this.Deb;
    }

    public String getDeb(int khanaNo) {
        return this.Deb[khanaNo - 1];
    }

    public String[] getExal() {
        return this.Exal;
    }

    public String getExal(int khanaNo) {
        return this.Exal[khanaNo - 1];
    }

    public int getHouseDistance(int planetsHouse, int aspect) {
        if ((planetsHouse = (planetsHouse + aspect - 1) % 12) == 0) {
            planetsHouse = 12;
        }

        return planetsHouse;
    }

    public String[] getIstLevelLalKitabDasa() {
        String[] var1 = new String[28];
        Calendar var2;
        (var2 = Calendar.getInstance()).set(this.y, this.m - 1, this.d);
        int var3 = var2.get(1);
        int var4 = var2.get(2) + 1;
        int var5 = var2.get(5);
        String var8 = Util.makelength(String.valueOf(var5), 2) + this.utilDesktop.getSlashString() + Util.makelength(String.valueOf(var4), 2) + this.utilDesktop.getSlashString() + var3;
        var1[0] = var8;
        int var6 = 1;

        for(int var7 = 0; var6 <= 27; ++var6) {
            var2.add(1, this.IstLevellalkitabDasaSeries[var7]);
            var3 = var2.get(1);
            var4 = var2.get(2) + 1;
            var5 = var2.get(5);
            var8 = Util.makelength(String.valueOf(var5), 2) + this.utilDesktop.getSlashString() + Util.makelength(String.valueOf(var4), 2) + this.utilDesktop.getSlashString() + var3;
            var1[var6] = var8;
            ++var7;
        }

        return var1;
    }

    public String[] getKhanaNo() {
        return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    }

    public String[] getKismatJagaanewaala() {
        return this.g;
    }

    public int getlalkitabVarshaphalTableElement(int age, int khana) {
        return e[age - 1][khana - 1];
    }

    public String[] getMaalik() {
        return this.k;
    }

    public String[] getPakkaGhar() {
        return this.l;
    }

    public String getPlanetaryRashiNameForLalkitab(int planetNo) {
        planetNo = house[planetNo - 1];
        String var2 = "";

        try {
            var2 = this.ras[planetNo - 1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPlanetaryRasiNameForShodashvargaDivision   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public int getPlanetaryRashiForLalkitab(int planetNo) {
        return house[planetNo - 1];
    }

    public String getPlanetaryRashiNameForLalkitabVarshphal(int planetNo) {
        planetNo = presenthouse[planetNo - 1];
        String var2 = "";

        try {
            var2 = this.ras[planetNo - 1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPlanetaryRasiNameForShodashvargaDivision   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public int getPlanetaryRashiForLalkitabVarshphal(int planetNo) {
        return presenthouse[planetNo - 1];
    }

    public int[] getPlanetInBhav(int typeOfKundli) {
        int var3;
        for(var3 = 0; var3 < 12; ++var3) {
            int var2;
            if ((var2 = this.varga[var3 + 1][0] - this.varga[0][0]) < 0) {
                var2 += 12;
            }

            ++var2;
            house[var3] = var2;
        }

        if (typeOfKundli == 1) {
            return house;
        } else {
            if (typeOfKundli == 2) {
                for(var3 = 0; var3 < 12; ++var3) {
                    if (house[var3] - 3 <= 0) {
                        house[var3] = house[var3] - 3 + 12;
                    } else {
                        house[var3] -= 3;
                    }
                }
            }

            return house;
        }
    }

    public int[] getPlanetInBhavForVarshaphala(int typeOfKundli) {
        int var2 = this.getVarshphalYear() - this.getYearOfBirth() + 1;

        for(ii = 0; ii < 12; ++ii) {
            presenthouse[ii] = e[var2 - 1][house[ii] - 1];
        }

        if (typeOfKundli == 1) {
            return presenthouse;
        } else {
            if (typeOfKundli == 2) {
                for(typeOfKundli = 0; typeOfKundli < 12; ++typeOfKundli) {
                    if (presenthouse[typeOfKundli] - 3 <= 0) {
                        presenthouse[typeOfKundli] = presenthouse[typeOfKundli] - 3 + 12;
                    } else {
                        presenthouse[typeOfKundli] -= 3;
                    }
                }
            }

            return presenthouse;
        }
    }

    public int getRelationship(int planetNumber) {
        int var2 = house[planetNumber - 1];
        if (this.isExalted(planetNumber, var2)) {
            return 1;
        } else if (this.isDeblited(planetNumber, var2)) {
            return 2;
        } else if (this.isInOwnSign(planetNumber, var2)) {
            return 3;
        } else if (this.isInFriendSign(planetNumber, var2)) {
            return 4;
        } else if (this.isInAnimicalSign(planetNumber, var2)) {
            return 5;
        } else {
            return this.isInNeutralSign(planetNumber, var2) ? 6 : 0;
        }
    }

    public int getRelationship(int planetNumber, int[] house) {
        int house1 = house[planetNumber - 1];
        if (this.isExalted(planetNumber, house1)) {
            return 1;
        } else if (this.isDeblited(planetNumber, house1)) {
            return 2;
        } else if (this.isInOwnSign(planetNumber, house1)) {
            return 3;
        } else if (this.isInFriendSign(planetNumber, house1)) {
            return 4;
        } else if (this.isInAnimicalSign(planetNumber, house1)) {
            return 5;
        } else {
            return this.isInNeutralSign(planetNumber, house1) ? 6 : 0;
        }
    }

    public int getRelationshipForVarshphal(int planetNumber, int[] house) {
        presenthouse = house;
        int house1 = house[planetNumber - 1];
        if (this.isExalted(planetNumber, house1)) {
            return 1;
        } else if (this.isDeblited(planetNumber, house1)) {
            return 2;
        } else if (this.isInOwnSign(planetNumber, house1)) {
            return 3;
        } else if (this.isInFriendSign(planetNumber, house1)) {
            return 4;
        } else if (this.isInAnimicalSign(planetNumber, house1)) {
            return 5;
        } else {
            return this.isInNeutralSign(planetNumber, house1) ? 6 : 0;
        }
    }

    public String[] getSecondLevelLalKitabDasa() {
        String[] var1 = new String[81];
        Calendar var2;
        (var2 = Calendar.getInstance()).set(this.y, this.m - 1, this.d);
        int var7 = 0;

        for(int var8 = 0; var7 <= 26; ++var7) {
            int var6 = this.IstLevellalkitabDasaSeries[var7];

            for(int var9 = 0; var9 <= 2; ++var9) {
                int var3 = var6 * 12;
                var2.add(2, var3 / 3);
                var3 = var2.get(1);
                int var4 = var2.get(2) + 1;
                int var5 = var2.get(5);
                String var10 = Util.makelength(String.valueOf(var5), 2) + this.utilDesktop.getSlashString() + Util.makelength(String.valueOf(var4), 2) + this.utilDesktop.getSlashString() + var3;
                var1[var8] = var10;
                ++var8;
            }
        }

        return var1;
    }

    public StringBuffer getTevaStatus() {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("DharmiTeva:");
        var1.append((house[5] == house[7] ? "YES" : "NO") + "\n");
        var1.append("NaabaligTeva:");
        var1.append(this.isNabaligTeva() + "\n");
        var1.append("AndhaaTeva:");
        var1.append(this.isAndhaaTeva() + "\n");
        var1.append("RaatandhTeva:");
        var1.append(this.isRataandhTeva());
        return var1;
    }

    public StringBuffer getTevaStatusForVarYear() {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("DharmiTeva:");
        var1.append((presenthouse[5] == presenthouse[7] ? "YES" : "NO") + "\n");
        var1.append("NaabaligTeva:");
        var1.append(this.isNabaligTevaForVarYear() + "\n");
        var1.append("AndhaaTeva:");
        var1.append(this.isAndhaaTevaForVarYear() + "\n");
        var1.append("RaatandhTeva:");
        var1.append(this.isRataandhTevaForVarYear());
        return var1;
    }

    public int getVarshphalYear() {
        return this.vyear;
    }

    public void initializesArrayValuesOfLalKitab() {
        Constants.getValues("MAALIK_VALUES", this.k);
        Constants.getValues("KISMAT_VALUES", this.g);
        Constants.getValues("PAKKA_GHAR_VALUES", this.l);
    }

    public String isAndhaaTeva() {
        int var2 = 0;
        int[] var3 = new int[9];
        String var5 = "NO";

        int var1;
        for(var1 = 0; var1 < 9; ++var1) {
            if (house[var1] == 10) {
                var3[var2] = var1;
                ++var2;
            }
        }

        if (var2 <= 1) {
            return "NO";
        } else {
            for(var1 = 0; var1 < var2; ++var1) {
                for(int var4 = var1 + 1; var4 < var2; ++var4) {
                    if (a(var3[var1], var3[var4])) {
                        var5 = "YES";
                        break;
                    }

                    var5 = "NO";
                }
            }

            return var5;
        }
    }

    public String isAndhaaTevaForVarYear() {
        int var2 = 0;
        int[] var3 = new int[9];
        String var5 = "NO";

        int var1;
        for(var1 = 0; var1 < 9; ++var1) {
            if (presenthouse[var1] == 10) {
                var3[var2] = var1;
                ++var2;
            }
        }

        if (var2 <= 1) {
            return "NO";
        } else {
            for(var1 = 0; var1 < var2; ++var1) {
                for(int var4 = var1 + 1; var4 < var2; ++var4) {
                    if (a(var3[var1], var3[var4])) {
                        var5 = "YES";
                        break;
                    }

                    var5 = "NO";
                }
            }

            return var5;
        }
    }

    public String isDharmi(int planetNo) {
        switch(planetNo) {
        case 7:
            if (house[6] == 11 || house[6] == house[4]) {
                return "Yes";
            }
            break;
        case 8:
            if (house[7] == 4 || house[7] == house[1]) {
                return "Yes";
            }
            break;
        case 9:
            if (house[8] == 4 || house[8] == house[1]) {
                return "yes";
            }
        }

        return "No";
    }

    public String isDharmiForVarshYear(int planetNo) {
        switch(planetNo) {
        case 7:
            if (presenthouse[6] == 11 || presenthouse[6] == presenthouse[4]) {
                return "Yes";
            }
            break;
        case 8:
            if (presenthouse[7] == 4 || presenthouse[7] == presenthouse[1]) {
                return "Yes";
            }
            break;
        case 9:
            if (presenthouse[8] == 4 || presenthouse[8] == presenthouse[1]) {
                return "yes";
            }
        }

        return "No";
    }

    public String isInPakkaGhar(int planetNo) {
        switch(planetNo) {
        case 1:
            if (house[planetNo - 1] == 1) {
                return "Yes";
            }
            break;
        case 2:
            if (house[planetNo - 1] == 4) {
                return "Yes";
            }
            break;
        case 3:
            if (house[planetNo - 1] != 3 && house[planetNo] != 8) {
                break;
            }

            return "yes";
        case 4:
            if (house[planetNo - 1] != 6 && house[planetNo] != 7) {
                break;
            }

            return "Yes";
        case 5:
            if (house[planetNo - 1] == 2 || house[planetNo] == 5 || house[planetNo] == 9 || house[planetNo] == 12) {
                return "Yes";
            }
            break;
        case 6:
            if (house[planetNo - 1] == 7) {
                return "Yes";
            }
            break;
        case 7:
            if (house[planetNo - 1] == 10 || house[planetNo] == 11) {
                return "Yes";
            }
        }

        return "No";
    }

    public String isInPakkaGharForVarshYear(int planetNo) {
        switch(planetNo) {
        case 1:
            if (presenthouse[planetNo - 1] == 1) {
                return "Yes";
            }
            break;
        case 2:
            if (presenthouse[planetNo - 1] == 4) {
                return "Yes";
            }
            break;
        case 3:
            if (presenthouse[planetNo - 1] != 3 && presenthouse[planetNo] != 8) {
                break;
            }

            return "yes";
        case 4:
            if (presenthouse[planetNo - 1] != 6 && presenthouse[planetNo] != 7) {
                break;
            }

            return "Yes";
        case 5:
            if (presenthouse[planetNo - 1] == 2 || presenthouse[planetNo] == 5 || presenthouse[planetNo] == 9 || presenthouse[planetNo] == 12) {
                return "Yes";
            }
            break;
        case 6:
            if (presenthouse[planetNo - 1] == 7) {
                return "Yes";
            }
            break;
        case 7:
            if (presenthouse[planetNo - 1] == 10 || presenthouse[planetNo] == 11) {
                return "Yes";
            }
        }

        return "No";
    }

    public String isNabaligTeva() {
        boolean var2 = false;

        int var1;
        for(var1 = 1; var1 <= 6; ++var1) {
            if (house[var1] == 1 || house[var1] == 4 || house[var1] == 7 || house[var1] == 10) {
                if (var1 != 4) {
                    return "NO";
                }

                var2 = true;
                break;
            }
        }

        if (var2) {
            int var3 = house[var1];

            for(var1 = 1; var1 <= 9; ++var1) {
                if (house[var1] == var3) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public String isNabaligTevaForVarYear() {
        boolean var2 = false;

        int var1;
        for(var1 = 1; var1 <= 6; ++var1) {
            if (presenthouse[var1] == 1 || presenthouse[var1] == 4 || presenthouse[var1] == 7 || presenthouse[var1] == 10) {
                if (var1 != 4) {
                    return "NO";
                }

                var2 = true;
                break;
            }
        }

        if (var2) {
            int var3 = house[var1];

            for(var1 = 1; var1 <= 9; ++var1) {
                if (presenthouse[var1] == var3) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public boolean isOfDaughterSisterDebt() {
        boolean var1 = false;
        if (house[1] == 3 || house[1] == 6) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfFatherDebt() {
        boolean var1 = false;
        if ((house[5] == 2 || house[5] == 5 || house[5] == 9 || house[5] == 12) && (house[3] == 2 || house[3] == 5 || house[3] == 9 || house[3] == 12) && (house[7] == 2 || house[7] == 5 || house[7] == 9 || house[7] == 12)) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfJalimanaDebt() {
        boolean var1 = false;
        if ((house[0] == 10 || house[0] == 11) && (house[1] == 10 || house[1] == 11) && (house[2] == 10 || house[2] == 11)) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfMangalDebt() {
        return house[3] == 1 && house[8] == 8;
    }

    public boolean isOfMothresDebt() {
        return house[8] == 4;
    }

    public boolean isOfNaturalDebt() {
        boolean var1 = false;
        if (house[1] == 6 && house[2] == 6) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfOwnDebt() {
        int[] var1 = this.isPapiGraha();
        return house[5] == 5 || var1[0] - 1 == 5 || var1[1] - 1 == 5 || var1[2] - 1 == 5;
    }

    public boolean isOfPaidaHiNaHuaDebt() {
        boolean var1 = false;
        if (house[0] == 12 && house[5] == 12 && house[2] == 12) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfRelativesDebt() {
        boolean var1 = false;
        if ((house[3] == 1 || house[3] == 8) && (house[8] == 1 || house[8] == 8)) {
            var1 = true;
        }

        return var1;
    }

    public boolean isOfSisterDebt() {
        return house[1] == 3 || house[1] == 6;
    }

    public boolean isOfWifesDebt() {
        boolean var1 = false;
        if ((house[0] == 2 || house[0] == 7) && (house[7] == 2 || house[7] == 7) && (house[1] == 2 || house[1] == 7)) {
            var1 = true;
        }

        return var1;
    }

    public int[] isPapiGraha() {
        return new int[]{8, 9, 7};
    }

    public boolean isPlanetAspectingSomeOtherPlanet(int planetNo) {
        int var3 = house[planetNo];
        int var2 = this.getHouseDistance(var3, 7);

        int var4;
        for(var4 = 0; var4 < 9; ++var4) {
            if (house[var4] == var2) {
                return true;
            }
        }

        switch(planetNo) {
        case 3:
            var2 = this.getHouseDistance(var3, 4);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 8);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }
        case 4:
        case 6:
        default:
            break;
        case 5:
            var2 = this.getHouseDistance(var3, 5);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 9);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }

            return false;
        case 7:
            var2 = this.getHouseDistance(var3, 3);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 10);

            for(var4 = 0; var4 < 9; ++var4) {
                if (house[var4] == var2) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isPlanetAspectingSomeOtherPlanetForVarYear(int planetNo) {
        int var3 = presenthouse[planetNo];
        int var2 = this.getHouseDistance(var3, 7);

        int var4;
        for(var4 = 0; var4 < 9; ++var4) {
            if (presenthouse[var4] == var2) {
                return true;
            }
        }

        switch(planetNo) {
        case 3:
            var2 = this.getHouseDistance(var3, 4);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 8);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }
        case 4:
        case 6:
        default:
            break;
        case 5:
            var2 = this.getHouseDistance(var3, 5);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 9);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }

            return false;
        case 7:
            var2 = this.getHouseDistance(var3, 3);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }

            var2 = this.getHouseDistance(var3, 10);

            for(var4 = 0; var4 < 9; ++var4) {
                if (presenthouse[var4] == var2) {
                    return true;
                }
            }
        }

        return false;
    }

    public int isPlanetInKhana(int planetNo, int khanaNo) {
        return house[planetNo - 1];
    }

    public boolean isPlanetKismatJagganewala(int planetNo) {
        boolean var2 = false;
        switch(planetNo) {
        case 1:
            if (house[planetNo - 1] == 5) {
                var2 = true;
            }
            break;
        case 2:
            if (house[planetNo - 1] == 4 || house[planetNo - 1] == 2 || house[planetNo - 1] == 8) {
                var2 = true;
            }
            break;
        case 3:
            if (house[planetNo - 1] == 1) {
                var2 = true;
            }
            break;
        case 4:
            if (house[planetNo - 1] == 3) {
                var2 = true;
            }
            break;
        case 5:
            if (house[planetNo - 1] == 11) {
                var2 = true;
            }
            break;
        case 6:
            if (house[planetNo - 1] == 7) {
                var2 = true;
            }
            break;
        case 7:
            if (house[planetNo - 1] == 10 || house[planetNo] == 9) {
                var2 = true;
            }
            break;
        case 8:
            if (house[planetNo - 1] == 12) {
                var2 = true;
            }
            break;
        case 9:
            if (house[planetNo - 1] == 6) {
                var2 = true;
            }
        }

        return var2;
    }

    public boolean isPlanetKismatJagganewalaForVarshphala(int planetNo) {
        boolean var2 = false;
        switch(planetNo) {
        case 1:
            if (presenthouse[planetNo - 1] == 5) {
                var2 = true;
            }
            break;
        case 2:
            if (presenthouse[planetNo - 1] == 2 || presenthouse[planetNo - 1] == 4 || presenthouse[planetNo - 1] == 8) {
                var2 = true;
            }
            break;
        case 3:
            if (presenthouse[planetNo - 1] == 1) {
                var2 = true;
            }
            break;
        case 4:
            if (presenthouse[planetNo - 1] == 3) {
                var2 = true;
            }
            break;
        case 5:
            if (presenthouse[planetNo - 1] == 11) {
                var2 = true;
            }
            break;
        case 6:
            if (presenthouse[planetNo - 1] == 7) {
                var2 = true;
            }
            break;
        case 7:
            if (presenthouse[planetNo - 1] == 10 || presenthouse[planetNo] == 9) {
                var2 = true;
            }
            break;
        case 8:
            if (presenthouse[planetNo - 1] == 12) {
                var2 = true;
            }
            break;
        case 9:
            if (presenthouse[planetNo - 1] == 6) {
                var2 = true;
            }
        }

        return var2;
    }

    public boolean isPlanetSoya(int planetNo) {
        if ((planetNo = house[planetNo - 1] + 6) > 12) {
            planetNo -= 12;
        }

        boolean var2 = true;

        for(int var3 = 0; var3 <= 8; ++var3) {
            if (house[var3] == planetNo) {
                var2 = false;
                break;
            }

            var2 = true;
        }

        return var2;
    }

    public boolean isPlanetSoyaForVarshphal(int planetNo) {
        if ((planetNo = presenthouse[planetNo - 1] + 6) > 12) {
            planetNo -= 12;
        }

        boolean var2 = true;

        for(int var3 = 0; var3 <= 8; ++var3) {
            if (presenthouse[var3] == planetNo) {
                var2 = false;
                break;
            }

            var2 = true;
        }

        return var2;
    }

    public String isRataandhTeva() {
        return house[5] == 4 && house[7] == 7 ? "YES" : "NO";
    }

    public String isRataandhTevaForVarYear() {
        return presenthouse[5] == 4 && presenthouse[7] == 7 ? "YES" : "NO";
    }

    public StringBuffer lalkitabHouseDetail() {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("\tLALKITAB HOUSE DETAILS\n");
        var1.append("\t-----------------------\n");
        var1.append("Khana\t");
        var1.append("Maalik\t");
        var1.append("Pakka\t\t");
        var1.append("Kismat\n");
        var1.append("No\t\t\t\t");
        var1.append("Ghar\t");
        var1.append("Jagaanewala\n");
        String[] var2 = this.getKhanaNo();
        String[] var3 = this.getMaalik();
        String[] var4 = this.getPakkaGhar();
        String[] var5 = this.getKismatJagaanewaala();

        for(int var6 = 0; var6 < 12; ++var6) {
            if (var6 != 5 && var6 != 6 && var6 != 7 && var6 != 11) {
                var1.append(var2[var6] + "\t\t" + var3[var6] + "\t\t" + var4[var6] + "\t\t" + "\t" + var5[var6]);
            } else {
                var1.append(var2[var6] + "\t\t" + var3[var6] + "\t\t" + var4[var6] + "\t\t" + var5[var6]);
            }

            var1.append("\n");
        }

        return var1;
    }

    public StringBuffer lalkitabHousePosition() {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("LALKITAB HOUSEPOSITION\n");
        var1.append("-------------------------\n");
        var1.append("Khana\tSoya\tExalt\tDeblt\n");
        String[] var2 = this.getKhanaNo();
        String[] var3 = this.getDeb();
        String[] var4 = this.getExal();

        for(ii = 0; ii < 12; ++ii) {
            if (var4[ii].length() > 4) {
                if (ii != 3 && ii != 5 && ii != 9 && ii != 10) {
                    var1.append(var2[ii] + "\t\t" + "Yes\t" + var4[ii] + "\t" + var3[ii] + "\n");
                } else {
                    var1.append(var2[ii] + "\t\t" + "--\t" + var4[ii] + "\t" + var3[ii] + "\n");
                }
            } else if (ii != 3 && ii != 5 && ii != 9 && ii != 10) {
                var1.append(var2[ii] + "\t\t" + "Yes\t" + "\t" + var4[ii] + "\t\t" + var3[ii] + "\n");
            } else {
                var1.append(var2[ii] + "\t\t" + "--\t" + var4[ii] + "\t\t" + var3[ii] + "\n");
            }
        }

        return var1;
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath("C:\\Projects");
        LalKitab args1 = new LalKitab();

        try {
            args1.setCompanyName("CSL SOFTWARE LTD., G-4A, Green Park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("agra");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("23");
            args1.setHourOfBirth("18");
            args1.setDayOfBirth("11");
            args1.setMonthOfBirth("04");
            args1.setYearOfBirth("1979");
            args1.setDegreeOfLattitude("27");
            args1.setDegreeOfLongitude("78");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("00");
            args1.setMinuteOfLattitude("09");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setDST("0");
            args1.setVarshphalYear("2003");
            args1.initialize();
            args1.getPlanetInBhavForVarshaphala(1);
        } catch (Exception var1) {
            System.out.println(var1);
        }
    }

    public int[][] mushtarkadeewarPlanetForKhanaFrom(int khanaNo) {
        int[][] var2 = new int[2][9];
        int[] var4 = new int[9];
        int[] var3;
        int var6;
        if (Util.isKhanaBhavaKendra(khanaNo)) {
            int var5 = khanaNo + 9;
            khanaNo += 11;
            if (var5 > 12) {
                var5 -= 12;
            }

            if (khanaNo > 12) {
                khanaNo -= 12;
            }

            for(var6 = 1; var6 <= 9; ++var6) {
                var3 = this.PlanetsInKhana(var5);
                var4 = this.PlanetsInKhana(khanaNo);
                var2[0][var6 - 1] = var3[var6 - 1];
                var2[1][var6 - 1] = var4[var6 - 1];
            }
        } else {
            for(var6 = 1; var6 <= 9; ++var6) {
                var3 = this.PlanetsInKhana(khanaNo - 1);
                var2[0][var6 - 1] = var3[var6 - 1];
                var2[1][var6 - 1] = var4[var6 - 1];
            }
        }

        return var2;
    }

    public int[][] mushtarkadeewarPlanetForKhanaTo(int khanaNo) {
        int[][] var2 = new int[2][9];
        int[] var4 = new int[9];
        int[] var3;
        int var6;
        if (Util.isKhanaBhavaKendra(khanaNo)) {
            int var5 = khanaNo + 1;
            khanaNo += 3;
            if (var5 > 12) {
                var5 -= 12;
            }

            if (khanaNo > 12) {
                khanaNo -= 12;
            }

            for(var6 = 1; var6 <= 9; ++var6) {
                var3 = this.PlanetsInKhana(var5);
                var4 = this.PlanetsInKhana(khanaNo);
                var2[0][var6 - 1] = var3[var6 - 1];
                var2[1][var6 - 1] = var4[var6 - 1];
            }
        } else {
            for(var6 = 1; var6 <= 9; ++var6) {
                if (khanaNo == 12) {
                    khanaNo -= 12;
                }

                var3 = this.PlanetsInKhana(khanaNo + 1);
                var2[0][var6 - 1] = var3[var6 - 1];
                var2[1][var6 - 1] = var4[var6 - 1];
            }
        }

        return var2;
    }

    public int[] nichPlanetForKhanaFrom(int khanaNo) {
        khanaNo = this.o[khanaNo - 1][3];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] nichPlanetForKhanaTo(int khanaNo) {
        khanaNo = this.n[khanaNo - 1][3];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] PlanetForKhana(int khanaNo) {
        khanaNo = this.n[khanaNo][1];
        return this.PlanetsInKhana(khanaNo);
    }

    public int PlanetInKhana(int planetNo) {
        return house[planetNo - 1];
    }

    public int[] PlanetsInKhana(int khanaNo) {
        int[] var2 = new int[9];
        int var3 = 1;

        for(int var4 = 0; var3 <= 12; ++var3) {
            if (this.PlanetInKhana(var3) == khanaNo) {
                var2[var4] = var3;
            }

            ++var4;
        }

        return var2;
    }

    public void setVarshphalYear(String vyear) {
        this.vyear = Integer.parseInt(vyear);
    }

    public int[] takraoBuniyadPlanetForKhanaFrom(int khanaNo) {
        khanaNo = this.o[khanaNo - 1][2];
        return this.PlanetsInKhana(khanaNo);
    }

    public int[] takraoBuniyadPlanetForKhanaTo(int khanaNo) {
        khanaNo = this.n[khanaNo - 1][2];
        return this.PlanetsInKhana(khanaNo);
    }

    public void vargaAndHouseInitialization() {
        this.getPlanetInBhav(1);
    }

    public void vargaAndHouseInitializationForVarshaphala() {
        this.getPlanetInBhavForVarshaphala(1);
    }
}
