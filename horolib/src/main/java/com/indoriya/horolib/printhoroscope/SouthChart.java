//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.printhoroscope;


import com.indoriya.horolib.dhoro.DesktopHoro;
import com.indoriya.horolib.util.Constants;

public class SouthChart extends Chart {
    private String a = "&nbsp;";
    private String b = "<IMG src=\"images/line.jpg\" width=28>";
    private String c = "<IMG height=18 src=\"images/line_v.jpg\">";
    private int d;
    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = -1;
    public static final int NUMBER_OF_ELEMENTS = 13;
    private int e;
    private int f;
    private String[] g = new String[]{"Sun", "Mon", "Mar", "Mer", "Jup", "Ven", "Sat", "Rah", "Ket", "Ura", "Nep", "Plu", "Lag", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private Coordinate[] h = new Coordinate[24];
    public int[] position = new int[24];

    public SouthChart() {
    }

    public Coordinate getBaseCoordinateOfHouse(int planetNo, int houseOfElement) {
        Coordinate var3 = new Coordinate();
        switch(houseOfElement) {
        case 1:
        case 2:
        case 3:
            var3.row = 0;
            var3.col = 5 * houseOfElement;
            break;
        case 4:
        case 5:
        case 6:
            var3.row = (houseOfElement - 3) * 5;
            var3.col = 15;
            break;
        case 7:
        case 8:
        case 9:
            var3.row = 15;
            var3.col = 15 - 5 * (houseOfElement - 6);
            break;
        case 10:
        case 11:
        case 12:
            var3.row = 15 - 5 * (houseOfElement - 9);
            var3.col = 0;
        }

        var3.row += planetNo / 4;
        var3.col += planetNo % 4;
        return var3;
    }

    public String getContentForCell(int col) {
        String var2 = "&nbsp;";
        if (this.e <= 4 || this.e >= 14 || col <= 4 || col >= 14) {
            if ((this.e + 1) % 5 == 0) {
                var2 = this.b;
            }

            if ((col + 1) % 5 == 0) {
                var2 = this.c;
            }
        }

        for(int var3 = 0; var3 < 13; ++var3) {
            if (this.e == this.h[var3].row && col == this.h[var3].col) {
                var2 = "<IMG height=18 src=\"images/" + this.g[var3] + ".gif\" width=28>";
            }
        }

        return var2;
    }

    public void initialize() {
        int var2 = this.position[12];

        int var1;
        int var3;
        for(var3 = 0; var3 < 12; ++var3) {
            var1 = this.position[var3];
            this.position[var3] = var1 - var2 + 1;
            if (this.position[var3] <= 0) {
                int[] var10000 = this.position;
                var10000[var3] += 12;
            }
        }

        this.position[12] = this.d;

        for(var3 = 0; var3 < 13; ++var3) {
            var1 = this.position[var3];
            this.h[var3] = this.getBaseCoordinateOfHouse(var3, var1);
        }

    }

    public static void main(String[] args) {
        (new Constants()).setConstPath("D:\\Program Files\\Varahamihira");
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
            SouthChart var2;
            (var2 = new SouthChart()).setBhavPositionForPlanets(args2);
            var2.setBhavPositionForRashi(var1 + 1);
            System.out.println(var2.printChart());
            System.in.read();
        } catch (Exception var3) {
            System.out.println(var3);
        }
    }

    public StringBuffer printChart() {
        this.initialize();
        StringBuffer var1;
        (var1 = new StringBuffer()).append("<TABLE align=center bgColor=white border=1 borderColor=dodgerblue cellPadding=0 cellSpacing=0 height=290 width=450>\n");
        var1.append("<TR>\n");
        var1.append("<TD>\n");
        var1.append("<TABLE bgColor=#ffffff border=0 borderColor=darkgray cellPadding=0 cellSpacing=0 height=288 width=448>\n");
        var1.append("<TBODY>\n");

        for(this.e = 0; this.e < 19; ++this.e) {
            var1.append("<TR>\n");

            for(this.f = 0; this.f < 19; ++this.f) {
                this.a = this.getContentForCell(this.f);
                var1.append("<TD align=middle>" + this.a + "</TD>\n");
            }

            var1.append("</TR>\n");
        }

        var1.append("</TBODY></TABLE></TD></TR></TABLE>\n");
        return var1;
    }

    public void setBhavPositionForPlanets(int[] planetInBhav) {
        for(int var2 = 0; var2 <= 11; ++var2) {
            this.position[var2] = planetInBhav[var2];
        }

    }

    public void setBhavPositionForRashi(int lagna) {
        this.d = lagna;
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

    public void setRashiPositionForPlanets(int[] planetRashi) {
        for(int var2 = 0; var2 <= 11; ++var2) {
            this.position[var2] = planetRashi[var2];
        }

    }
}
