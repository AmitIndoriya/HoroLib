//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.printhoroscope;

import com.indoriya.horolib.dhoro.DesktopHoro;
import com.indoriya.horolib.util.Constants;

public class NorthChart extends Chart {
    private int[] a = new int[]{1, 8, 9, 16};
    private int[] b = new int[]{1, -1, 1, -1};
    private String c = "&nbsp;";
    private String d = "<IMG height=18 src=\"images/dn1.gif\" width=28>";
    private String e = "<IMG height=18 src=\"images/up1.gif\" width=28>";
    public static final int DOWN = 1;
    public static final int UP = -1;
    private int f;
    private int g;
    private String[] h = new String[]{"Sun", "Mon", "Mar", "Mer", "Jup", "Ven", "Sat", "Rah", "Ket", "Ura", "Nep", "Plu", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private Coordinate[] i = new Coordinate[24];
    private int[] j = new int[12];
    public int[] position = new int[24];
    public int[][] x144 = new int[][]{{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}, {2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7}, {7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9}, {10, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15}, {14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16}, {11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13}, {14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16}, {10, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 15}, {7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9}, {2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7}, {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}};
    public int[][] y144 = new int[][]{{7, 8, 9, 10, 7, 8, 9, 10, 7, 8, 9, 10}, {2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 4, 5}, {1, 1, 2, 1, 2, 3, 1, 2, 3, 1, 2, 1}, {3, 4, 5, 6, 3, 4, 5, 6, 3, 4, 5, 6}, {1, 1, 2, 1, 2, 3, 1, 2, 3, 1, 2, 1}, {4, 5, 3, 4, 5, 6, 2, 3, 4, 5, 6, 7}, {7, 8, 9, 10, 7, 8, 9, 10, 7, 8, 9, 10}, {12, 13, 11, 12, 13, 14, 10, 11, 12, 13, 14, 15}, {16, 15, 16, 14, 15, 16, 14, 15, 16, 15, 16, 16}, {11, 12, 13, 14, 11, 12, 13, 14, 11, 12, 13, 14}, {16, 15, 16, 14, 15, 16, 14, 15, 16, 15, 16, 16}, {10, 11, 12, 13, 14, 15, 11, 12, 13, 14, 12, 13}};

    public NorthChart() {
    }

    public void adjustLocationValues() {
        if (this.f == 7) {
            this.b[1] = 1;
            this.b[2] = -1;
        }

        for(int var1 = 0; var1 < 4; ++var1) {
            if (this.f != 7 || var1 != 1 && var1 != 2) {
                int[] var10000 = this.a;
                var10000[var1] += this.b[var1];
            }
        }

    }

    public String getContentForCell(int col) {
        String var2 = "&nbsp;";

        int var3;
        for(var3 = 0; var3 < 4; ++var3) {
            if (col == this.a[var3]) {
                if (this.b[var3] != -1) {
                    var2 = this.d;
                    break;
                }

                var2 = this.e;
            }
        }

        for(var3 = 0; var3 < this.h.length; ++var3) {
            if (this.f + 1 == this.i[var3].row && col == this.i[var3].col) {
                var2 = "<IMG height=18 src=\"images/" + this.h[var3] + ".gif\" width=28>";
            }
        }

        return var2;
    }

    public Coordinate getNextCoordinateInHouse(int houseOfElement) {
        Coordinate var2 = new Coordinate();
        int var3 = this.j[houseOfElement - 1];
        var2.row = this.x144[houseOfElement - 1][var3];
        var2.col = this.y144[houseOfElement - 1][var3];
        int var10002 = this.j[houseOfElement - 1]++;
        return var2;
    }

    public void initialize() {
        for(int var1 = 0; var1 < this.h.length; ++var1) {
            int var2 = this.position[var1];
            this.i[var1] = this.getNextCoordinateInHouse(var2);
        }

    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));
        DesktopHoro args1 = new DesktopHoro();

        try {
            args1.setCompanyName("CSL SOFTWARE LTD., G-4A, Green park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("agra");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("33");
            args1.setHourOfBirth("9");
            args1.setDayOfBirth("11");
            args1.setMonthOfBirth("03");
            args1.setYearOfBirth("1986");
            args1.setDegreeOfLattitude("27");
            args1.setDegreeOfLongitude("78");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("00");
            args1.setMinuteOfLattitude("09");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setLanguageCode("0");
            args1.setDST("0");
            args1.initialize();
            int var1 = args1.getLagna();
            int[] args2 = args1.getPlanetInBhav();
            NorthChart var2;
            (var2 = new NorthChart()).setBhavPositionForPlanets(args2);
            var2.setBhavPositionForRashi(var1 + 1);
            System.out.println(var2.printChart());
        } catch (Exception var3) {
            System.out.println(var3);
        }
    }

    public StringBuffer printChart() {
        this.initialize();
        StringBuffer var1;
        (var1 = new StringBuffer()).append("<TABLE align=center bgColor=white border=1 borderColor=dodgerblue cellPadding=0 cellSpacing=0 height=290 width=450>\n");
        var1.append("<TBODY> <TR><TD>\n");
        var1.append("<TABLE bgColor=#ffffff border=0 borderColor=darkgray cellPadding=0 cellSpacing=0 height=288 width=448>\n");

        for(this.f = 0; this.f < 16; ++this.f) {
            var1.append("<TR>\n");

            for(this.g = 0; this.g < 16; ++this.g) {
                this.c = this.getContentForCell(this.g + 1);
                var1.append("<TD align=middle>" + this.c + "</TD>\n");
            }

            var1.append("</TR>\n");
            this.adjustLocationValues();
        }

        var1.append("</TABLE>\n");
        var1.append("</TD></TR></TBODY>\n");
        var1.append("</TABLE>\n");
        return var1;
    }

    public void setBhavPositionForPlanets(int[] planetInBhav) {
        for(int var2 = 0; var2 <= 11; ++var2) {
            this.position[var2] = planetInBhav[var2];
        }

    }

    public void setBhavPositionForRashi(int lagna) {
        int var2 = 0;
        if (lagna == 1) {
            var2 = 1;
        } else {
            for(lagna = lagna; lagna <= 12; ++lagna) {
                ++var2;
            }

            ++var2;
        }

        for(lagna = 12; lagna <= 23; ++lagna) {
            if (var2 > 12) {
                var2 -= 12;
            }

            this.position[lagna] = var2++;
        }

    }

    public void setRashiPositionForPlanets(int[] planetInBhav) {
    }
}
