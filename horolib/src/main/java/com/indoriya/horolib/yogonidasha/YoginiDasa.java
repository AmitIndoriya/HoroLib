//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.yogonidasha;

import com.indoriya.horolib.dhoro.DesktopHoro;
import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.UtilDesktop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

public class YoginiDasa {
    private String a = "0";
    protected UtilDesktop utilDesktop = new UtilDesktop();
    private int b;
    private int c;
    private int d;
    private String[] e = new String[24];
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private Calendar m = Calendar.getInstance();
    private String[] n = new String[8];
    private String[] o = new String[8];
    private int[] p = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    protected String yoginiMahaDasaString;

    public YoginiDasa() {
    }

    public String[] generate1stLevelYoginiDasa() {
        int var1 = this.l;
        Calendar var3 = Calendar.getInstance();
        int var2 = this.g;
        --var2;
        var3.set(this.f, var2, this.h);
        var3.add(1, this.i);
        var3.add(2, this.j);
        var3.add(5, this.k);

        for(int var4 = 0; var4 <= 23; ++var4) {
            if (var1 >= 7) {
                var2 = this.p[var1];
                var1 = 0;
            } else {
                var2 = this.p[var1];
                ++var1;
            }

            if (var4 != 0) {
                var3.add(1, var2);
            }

            this.b = var3.get(1);
            this.c = var3.get(2) + 1;
            this.d = var3.get(5);
            this.e[var4] = UtilDesktop.makelength(this.utilDesktop.ymd(this.b, this.c, this.d), 2);
        }

        return this.e;
    }

    public StringBuffer generate2ndLevelYoginiDasa(int no) {
        String var2 = " ";
        int var3 = no;
        if (no > 7 && no <= 15) {
            var3 = no - 8;
        }

        if (var3 > 15 && var3 <= 25) {
            var3 -= 16;
        }

        StringBuffer var4 = new StringBuffer();
        int var5;
        if ((var5 = this.l + var3) > 7) {
            var5 -= 8;
        }

        if (no == 0) {
            --this.g;
            this.m.set(this.f, this.g, this.h);
            this.m.add(1, this.i);
            this.m.add(2, this.j);
            this.m.add(5, this.k);
            var3 = -this.p[var5];
            this.m.add(1, var3);
        }

        String var19 = this.o[var5];
        int var6 = this.p[var5];
        var4.append(var19 + "   " + var6 + " " + Constants.getValue("YEARS_STRING_KEY") + "\n");
        double var11 = (double)this.p[var5] / 36.0D;

        for(int var7 = 0; var7 <= 7; ++var7) {
            if (var5 == 7) {
                var6 = this.p[var5];
                var19 = this.o[var5];
                var5 = 0;
            } else {
                var6 = this.p[var5];
                var19 = this.o[var5];
                ++var5;
            }

            double var13;
            var6 = (int)(var13 = var11 * (double)var6);
            double var17;
            int var8 = (int)(var17 = UtilDesktop.fract(var13) * 12.0D);
            int var9 = (int)(UtilDesktop.fract(var17) * 31.0D);
            this.m.add(1, var6);
            this.m.add(2, var8);
            this.m.add(5, var9);
            var6 = this.m.get(1);
            var8 = this.m.get(2) + 1;
            var9 = this.m.get(5);
            if (var7 == 0 && no == 0) {
                var2 = UtilDesktop.makelength(this.utilDesktop.ymd(var6, var8, var9), 2);
            }

            if (var7 == 0 && no == 0) {
                var4.append(this.utilDesktop.getDashString(13) + "\n");
                var4.append("   " + var2 + "\n");
                var4.append("   " + this.e[no] + "\n");
                var4.append(this.utilDesktop.getDashString(13) + "\n");
            }

            if (var7 == 0 && no != 0) {
                var4.append(this.utilDesktop.getDashString(13) + "\n");
                var4.append("   " + this.e[no - 1] + "\n");
                var4.append("   " + this.e[no] + "\n");
                var4.append(this.utilDesktop.getDashString(13) + "\n");
            }

            if (var7 == 7) {
                var4.append(UtilDesktop.makespace(var19, 2) + "  " + this.e[no] + "\n");
            } else {
                var4.append(UtilDesktop.makespace(var19, 2) + "  " + UtilDesktop.makespace(UtilDesktop.makelength(this.utilDesktop.ymd(var6, var8, var9), 2), 8) + "\n");
            }
        }

        return var4;
    }

    public String generate2ndLevelYoginiDasaString(int no) {
        return this.generate2ndLevelYoginiDasa(no).toString();
    }

    public String getNameYogini(double moon) {
        int moon1 = this.returnBirthPlanetOfyogini(moon);
        return this.n[moon1];
    }

    public void initializesArrayValues() {
        try {
            Constants.LoadProperties(this.a);
        } catch (FileNotFoundException var2) {
            CSystem.out(CSystem.ERRO_R, var2.getMessage());
        } catch (IOException var3) {
            CSystem.out(CSystem.ERRO_R, var3.getMessage());
        }

        Constants.getValues("YOGINI_NAME_IN_FULL_VALUES", this.n);
        Constants.getValues("YOGINI_VALUES", this.o);
        this.yoginiMahaDasaString = Constants.getValue("YOGINI_MAHA_DASA_STRING_KEY");
    }

    public static void main(String[] args) {
        try {
            (new Constants()).setConstPath("C:\\Projects");
            DesktopHoro args1;
            (args1 = new DesktopHoro()).setCompanyName("CSL SOFTWARE LTD., G-4A, Green ark Extn., New Delhi-110 016");
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
            args1.setDegreeOfLattitude("28");
            args1.setDegreeOfLongitude("77");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("13");
            args1.setMinuteOfLattitude("39");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setLanguageCode("0");
            args1.setDST("0");
            double var3 = args1.getPlanetaryLongitude(2);
            int var1 = args1.getYearOfBirth();
            int var2 = args1.getMonthOfBirth();
            int args2 = args1.getDayOfBirth();
            YoginiDasa var5;
            (var5 = new YoginiDasa()).initializesArrayValues();
            var5.setUserBirthTime(args2, var2, var1);
            System.out.println("LLLL" + var5.getNameYogini(var3));
            int[] args3 = var5.restDasaOfYogini(var3);

            for(var1 = 0; var1 <= 2; ++var1) {
                System.out.println(args3[var1]);
            }

            String[] var10 = var5.generate1stLevelYoginiDasa();

            for(args2 = 0; args2 <= 23; ++args2) {
                System.out.println(var10[args2]);
            }

            for(args2 = 0; args2 <= 23; ++args2) {
                System.out.println(var5.generate2ndLevelYoginiDasa(args2));
            }

        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int[] restDasaOfYogini(double moon) {
        int[] var3 = new int[3];
        int var4 = (int)(moon / 13.3333D);
        ++var4;
        double var5 = (double)var4 * 13.3333D - moon;
        this.l = this.returnBirthPlanetOfyogini(moon);
        double var7 = var5 * (double)this.p[this.l] / 13.333D;
        this.i = (int)var7;
        var3[0] = this.i;
        double var9 = UtilDesktop.fract(var7) * 12.0D;
        this.j = (int)var9;
        var3[1] = this.j;
        this.k = (int)(UtilDesktop.fract(var9) * 31.0D);
        var3[2] = this.k;
        return var3;
    }

    public int returnBirthPlanetOfyogini(double planetdeg) {
        byte var3 = 0;
        int planetdeg1;
        switch(planetdeg1 = (int)(planetdeg / 13.3333D)) {
        case 0:
        case 8:
        case 16:
        case 24:
            var3 = 3;
            break;
        case 1:
        case 9:
        case 17:
        case 25:
            var3 = 4;
            break;
        case 2:
        case 10:
        case 18:
        case 26:
            var3 = 5;
            break;
        case 3:
        case 11:
        case 19:
            var3 = 6;
            break;
        case 4:
        case 12:
        case 20:
            var3 = 7;
            break;
        case 5:
        case 13:
        case 21:
            var3 = 0;
            break;
        case 6:
        case 14:
        case 22:
            var3 = 1;
            break;
        case 7:
        case 15:
        case 23:
            var3 = 2;
        }

        return var3;
    }

    public int returnRasiLord(int rasi) {
        switch(rasi) {
        case 1:
        case 8:
            return 3;
        case 2:
        case 7:
            return 6;
        case 3:
        case 6:
            return 4;
        case 4:
            return 2;
        case 5:
            return 1;
        case 9:
        case 12:
            return 5;
        case 10:
        case 11:
            return 7;
        default:
            return -1;
        }
    }

    public void setLanguageCode(String langCode) {
        this.a = langCode;
        this.utilDesktop.setLanguageCode(langCode);
    }

    public void setUserBirthTime(int day, int month, int year) {
        this.h = day;
        this.g = month;
        this.f = year;
    }
}
