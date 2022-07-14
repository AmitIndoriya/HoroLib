//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.varshfal;

import com.indoriya.horolib.dhoro.DesktopHoro;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.Util;

import java.util.Calendar;

public class Varshphala extends DesktopHoro {
    private int e;
    public final int venusDasa = 1461;
    public final int sunDasa = 438;
    public final int moonDasa = 730;
    public final int marsDasa = 511;
    public final int rahuDasa = 1314;
    public final int jupiterDasa = 1168;
    public final int saturnDasa = 1387;
    public final int mercuryDasa = 1241;
    public final int ketuDasa = 511;
    private int[] g = new int[]{1461, 438, 730, 511, 1314, 1168, 1387, 1241, 511};
    private String[] k = new String[]{"venus", "sun", " moon", "mars", " rahu", "jupiter", " saturn", "mercury", " ketu"};
    private int l;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private Calendar z = Calendar.getInstance();
    private int A;
    private int B;
    private String[] C;
    private String[] D;
    private String[] E;
    private int[] F;
    private double G;
    private String[] H;
    private String[] I;
    private String[] J;
    private double[] K;
    private double[] L;
    private double[] M;
    private double[] N;
    private double[] O;
    private double[] P;
    private double[] Q;
    private double[] R;
    private double[] S;
    private double[] T;

    public Varshphala() {
        Calendar.getInstance();
        this.C = new String[12];
        this.D = new String[12];
        this.E = new String[8];
        this.F = new int[]{10, 20, 30, 41, 51, 61, 71, 81};
        this.H = new String[8];
        this.I = new String[8];
        this.J = new String[8];
        this.K = new double[7];
        this.L = new double[7];
        this.M = new double[7];
        this.N = new double[7];
        this.O = new double[7];
        this.P = new double[7];
        this.Q = new double[7];
        this.R = new double[7];
        this.S = new double[7];
        this.T = new double[7];
    }

    public int[] calculateDasaSeries() {
        int[] var1 = new int[9];
        int var2 = 0;

        int var3;
        for(var3 = this.x; var3 <= 8; ++var3) {
            var1[var2] = var3;
            ++var2;
        }

        if (this.x != 0) {
            for(var3 = 0; var3 < this.x; ++var3) {
                var1[var2] = var3;
                ++var2;
            }
        }

        return var1;
    }

    protected double calculateDreakkanaPanchaVargiyaBala(int planetNumber, int sign) {
        double var3 = 0.0D;
        sign = this.returnLordOfDreakkana(this.plnt[planetNumber]);
        if (this.isInOwnDreskOrNava(planetNumber, sign)) {
            return 10.0D;
        } else {
            switch(this.returnVarshaphalNaisOrNavMatri(planetNumber, sign)) {
            case -2:
            case -1:
                var3 = 2.5D;
                break;
            case 0:
                var3 = 5.0D;
                break;
            case 1:
            case 2:
                var3 = 7.5D;
            }

            return var3;
        }
    }

    protected double calculateExaltationPanchaVargiyaBala(int plntNumber) {
        double[] var2 = new double[]{190.0D, 213.0D, 118.0D, 345.0D, 275.0D, 177.0D, 20.0D};
        double var3;
        if ((var3 = this.plnt[plntNumber] - var2[plntNumber - 1]) < 0.0D) {
            var3 = -var3;
        }

        if (var3 > 180.0D) {
            var3 = 360.0D - var3;
        }

        return (var3 /= 180.0D) * 20.0D;
    }

    protected double calculateHaddaPanchaVargiyaBala(int planetnumber, int sign) {
        return 0.0D;
    }

    public String[] calculateIstLevelMuddaVimshottari() {
        String[] var2 = new String[9];
        this.z.set(this.l, this.n - 1, this.o, this.p, this.q);
        int var3 = 0;

        int var1;
        int var4;
        int var5;
        int var6;
        String var7;
        for(var4 = this.x; var4 <= 8; ++var4) {
            var1 = this.g[var4];
            this.z.add(10, var1);
            var1 = this.z.get(1);
            var5 = this.z.get(2) + 1;
            var6 = this.z.get(5);
            var7 = Util.makelength(String.valueOf(var6), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var5), 2) + this.util.getSlashString() + var1;
            var2[var3] = var7;
            ++var3;
        }

        if (this.x != 0) {
            for(var4 = 0; var4 < this.x; ++var4) {
                var1 = this.g[var4];
                this.z.add(10, var1);
                var1 = this.z.get(1);
                var5 = this.z.get(2) + 1;
                var6 = this.z.get(5);
                var7 = Util.makelength(String.valueOf(var6), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var5), 2) + this.util.getSlashString() + var1;
                var2[var3] = var7;
                ++var3;
            }
        }

        return var2;
    }

    public String[] calculateIstLevelMuddaYoginiDasa() {
        String[] var1 = new String[8];
        int var3;
        if ((var3 = (this.e + this.v + 3) % 8) == 0) {
            var3 = 8;
        }

        this.z.set(this.l, this.n - 1, this.o);
        int var4 = 0;

        int var2;
        int var5;
        int var6;
        int var7;
        String var8;
        for(var5 = var3; var5 <= 8; ++var5) {
            this.H[var4] = this.I[var5 - 1];
            this.J[var4] = this.E[var5 - 1];
            var2 = this.F[var5 - 1];
            this.z.add(5, var2);
            var2 = this.z.get(1);
            var6 = this.z.get(2) + 1;
            var7 = this.z.get(5);
            var8 = Util.makelength(String.valueOf(var7), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var6), 2) + this.util.getSlashString() + var2;
            var1[var4] = var8;
            ++var4;
        }

        if (var3 != 1) {
            for(var5 = 1; var5 < var3; ++var5) {
                this.H[var4] = this.I[var5 - 1];
                this.J[var4] = this.E[var5 - 1];
                var2 = this.F[var5 - 1];
                this.z.add(5, var2);
                var2 = this.z.get(1);
                var6 = this.z.get(2) + 1;
                var7 = this.z.get(5);
                var8 = Util.makelength(String.valueOf(var7), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var6), 2) + this.util.getSlashString() + var2;
                var1[var4] = var8;
                ++var4;
            }
        }

        return var1;
    }

    public long calculateJdForVarshphal() {
        int var1 = this.m;
        int var2 = this.y + this.e;
        if (this.m < 3) {
            var1 += 12;
            --var2;
        }

        int var3 = var2 / 100;
        float var7;
        var1 = (int)(var7 = 30.6F * (float)(var1 + 1));
        return (long)(var2 * 365 + var2 / 4 + var1 + 2 - var3 + var3 / 4 + this.d);
    }

    public void calculateMuntha() {
        this.w = (this.t + this.e) % 12;
        if (this.w == 0) {
            this.w = 12;
        }

        this.B = (this.e + 1) % 12;
        if (this.B == 0) {
            this.B = 12;
        }

    }

    protected double calculateNavmsaPanchaVargiyaBala(int planetNumber, int sign) {
        double var5 = 0.0D;
        sign = this.returnLordOfNavamsa(this.plnt[planetNumber]);
        if (this.isInOwnDreskOrNava(planetNumber, sign)) {
            return 5.0D;
        } else {
            switch(this.returnVarshaphalNaisOrNavMatri(planetNumber, sign)) {
            case -2:
            case -1:
                var5 = 1.25D;
                break;
            case 0:
                var5 = 2.5D;
                break;
            case 1:
            case 2:
                var5 = 3.75D;
            }

            return var5;
        }
    }

    public void calculateOpeningDasa() {
        int var1 = this.e;
        this.x = Math.abs(var1 + this.v - 2) % 9;
    }

    protected double calculateSignPanchaVargiyaBala(int planetNumber, int sign) {
        if (this.isInOwnSign(planetNumber, sign)) {
            return 30.0D;
        } else if (this.isInFriendSign(planetNumber, sign)) {
            return 22.5D;
        } else if (this.isInNeutralSign(planetNumber, sign)) {
            return 15.0D;
        } else {
            return this.isInAnimicalSign(planetNumber, sign) ? 7.5D : 0.0D;
        }
    }

    public String getBirthAscendentLord() {
        return this.raslrd[this.t - 1];
    }

    public int getBirthAscendentSign() {
        return this.t;
    }

    public String getBirthAscendentSignName() {
        return this.ras[this.t - 1];
    }

    public double getConstantForYears(int varYear) {
        return (double)varYear * 1.256365740740741D;
    }

    public static double db(int day, int hour, int minute, int second) {
        return (double)day + (double)hour / 24.0D + (double)minute / 1440.0D + (double)second / 86400.0D;
    }

    public String getDinRatriPati() {
        int[] var1;
        int var2 = (var1 = this.getPositionForShodasvarg(0))[1];
        int var11 = var1[2];
        Integer.parseInt(this.getHourOfBirth());
        Integer.parseInt(this.getMinuteOfBirth());
        Integer.parseInt(this.getSecondOfBirth());
        double var5 = this.getVarshparveshTime();
        double var7 = this.getSunRiseTime();
        double var9 = this.getSunSetTime();
        String var12;
        if (var5 >= var7 && var5 < var9) {
            var12 = this.raslrd[var2 - 1];
        } else {
            var12 = this.raslrd[var11 - 1];
        }

        return var12;
    }

    public double getDreakkanaPanchaVargiyaBala(int planetNumber) {
        return this.R[planetNumber - 1];
    }

    public double getExaltationPanchaVargiyaBala(int planetNumber) {
        return this.P[planetNumber - 1];
    }

    public double getHaddaBala(int planetNumber) {
        return this.Q[planetNumber];
    }

    public double getHaddaPanchaVargiyaBala(int planetNumber) {
        return this.Q[planetNumber - 1];
    }

    public double getHarshaBala(int plntNumber) {
        return this.K[plntNumber] + this.L[plntNumber] + this.M[plntNumber] + this.N[plntNumber];
    }

    public double getHarshaBalaType1(int plntNumber) {
        return this.K[plntNumber - 1];
    }

    public double getHarshaBalaType2(int plntNumber) {
        return this.L[plntNumber - 1];
    }

    public double getHarshaBalaType3(int plntNumber) {
        return this.M[plntNumber - 1];
    }

    public double getHarshaBalaType4(int plntNumber) {
        return this.N[plntNumber - 1];
    }

    public int getMuntha() {
        return this.w;
    }

    public int getMunthaInBhav() {
        if (this.w - this.u < 0) {
            this.A = this.w - this.u + 12 + 1;
        } else {
            this.A = this.w - this.u + 1;
        }

        return this.A;
    }

    public int getMunthaInBhavForBirthChart() {
        return this.B;
    }

    public String getMunthaName() {
        return this.ras[this.w - 1];
    }

    public String getMunthesh() {
        return this.raslrd[this.w - 1];
    }

    public double getNavmsaPanchaVargiyaBala(int planetNumber) {
        return this.S[planetNumber - 1];
    }

    public String getOpeningDasaName() {
        return this.k[this.x];
    }

    public double getPanchaVargiyaBala(int planetNumber) {
        return this.T[planetNumber];
    }

    protected int getPlntHouse(int plntNumber) {
        if ((plntNumber = this.varga[plntNumber][0] - this.varga[0][0]) < 0) {
            plntNumber += 12;
        }

        ++plntNumber;
        return plntNumber;
    }

    public double[] getSahamvalue() {
        int var1 = this.getAscendentSign();
        int[] var2 = this.getPositionForShodasvarg(0);
        Saham var3;
        (var3 = new Saham()).create(var1, var2, this.f2[0], this.plnt, this.f2, this.getVarshparveshTime(), this.getSunRiseTime(), this.getSunSetTime());
        var3.initializeSaham();
        return var3.getSaham();
    }

    public double getSignPanchaVargiyaBala(int planetNumber) {
        return this.O[planetNumber - 1];
    }

    public double getTotalPanchaVargiyaBala(int planetNumber) {
        return this.T[planetNumber];
    }

    public String getTriRashiPati() {
        double var2 = this.getVarshparveshTime();
        double var4 = this.getSunRiseTime();
        double var6 = this.getSunSetTime();
        String var1;
        if (var2 >= var4 && var2 < var6) {
            var1 = this.C[this.getAscendentSign() - 1];
        } else {
            var1 = this.D[this.getAscendentSign() - 1];
        }

        return var1;
    }

    protected double getUserBirthDayInRealNumber() {
        return Double.valueOf(this.getHourOfBirth()) + Double.valueOf(this.getMinuteOfBirth()) / 60.0D + Double.valueOf(this.getSecondOfBirth()) / 3600.0D;
    }

    public String getVarshAscendentLord() {
        return this.raslrd[this.u - 1];
    }

    public int getVarshAscendentSign() {
        return this.u;
    }

    public String getVarshAscendentSignName() {
        return this.ras[this.u - 1];
    }

    public String getVarshparveshDate() {
        return Util.makelength(String.valueOf(this.o), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(this.n), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(this.l), 2);
    }

    public double getVarshparveshTime() {
        return this.G;
    }

    public String getVarshparveshTimeHms() {
        return this.util.hms(this.G);
    }

    public int[] getVarshphal(int varYear, long vj) {
        new StringBuffer();
        double var4;
        Util.getDHMS(var4 = this.getConstantForYears(varYear));
        double var6 = Util.makeDHMStoDouble(this.j, this.h, this.mt, this.s);
        int var10002;
        int[] var12;
        if ((var12 = Util.getDHMS(var4 + var6))[3] >= 60) {
            var10002 = var12[2]++;
            var12[3] %= 60;
        }

        if (var12[2] >= 60) {
            var10002 = var12[1]++;
            var12[2] %= 60;
        }

        if (var12[1] >= 24) {
            var10002 = var12[0]++;
            var12[1] %= 24;
        }

        if (var12[0] >= 7) {
            var12[0] %= 7;
        }

        vj = (vj + 4L) % 7L;
        if (var12[0] >= 7) {
            var12[0] %= 7;
        }

        long var10;
        if ((long)var12[0] < vj) {
            var10 = (long)(var12[0] + 7) - vj;
        } else {
            var10 = (long)var12[0] - vj;
        }

        if (var10 > 3L) {
            var10 -= 7L;
        }

        this.o = (int)((long)this.d + var10);
        this.p = var12[1];
        this.q = var12[2];
        this.r = var12[3];
        this.l = this.y + varYear;
        this.n = this.m;
        return new int[]{this.l, this.n, this.o, this.p, this.q, this.r};
    }

    public int[] getVarshPravesh(int varYear, long vj) {
        double var4 = this.getConstantForYears(varYear);
        double var6 = Util.makeDHMStoDouble(this.j, this.h, this.mt, this.s);
        int var10002;
        int[] var13;
        if ((var13 = Util.getDHMS(var4 + var6))[3] >= 60) {
            var10002 = var13[2]++;
            var13[3] %= 60;
        }

        if (var13[2] >= 60) {
            var10002 = var13[1]++;
            var13[2] %= 60;
        }

        if (var13[1] >= 24) {
            var10002 = var13[0]++;
            var13[1] %= 24;
        }

        if (var13[0] >= 7) {
            var13[0] %= 7;
        }

        vj = (vj + 4L) % 7L;
        if (var13[0] >= 7) {
            var13[0] %= 7;
        }

        long var10;
        if ((long)var13[0] < vj) {
            var10 = (long)(var13[0] + 7) - vj;
        } else {
            var10 = (long)var13[0] - vj;
        }

        if (var10 > 3L) {
            var10 -= 7L;
        }

        Calendar vj1;
        (vj1 = Calendar.getInstance()).set(this.y, this.m - 1, this.d, 0, 0);
        vj1.add(5, (int)var10);
        vj1.add(1, varYear);
        this.o = vj1.get(5);
        this.p = var13[1];
        this.q = var13[2];
        this.r = var13[3];
        this.l = vj1.get(1);
        this.n = vj1.get(2) + 1;
        return new int[]{this.l, this.n, this.o, this.p, this.q, this.r};
    }

    public int getVarshphalYear() {
        return this.e;
    }

    public double getVimsopakBala(int planetNumber) {
        return this.T[planetNumber] / 4.0D;
    }

    public String[] getYoginiLordName() {
        return this.J;
    }

    public String[] getYoginiName() {
        return this.H;
    }

    public void initialize() throws Exception {
        super.initialize();
        this.initializesArrayValues();
    }

    public void initializeForBirthTime() throws Exception {
        this.setBirthAscendentSign();
        this.setBirthNakshatraNo();
    }

    public void initializeForVarshphala() throws Exception {
        this.setCompanyAddLine1(this.getCompanyAddLine1());
        this.setName(this.getName());
        this.setPlace(this.getPlace());
        this.setTimeZone(this.getTimeZone());
        this.setMaleFemale(this.getMaleFemale());
        this.setSecondOfBirth(String.valueOf(this.r));
        this.setMinuteOfBirth(String.valueOf(this.q));
        this.setHourOfBirth(String.valueOf(this.p));
        this.setDayOfBirth(String.valueOf(this.o));
        this.setMonthOfBirth(String.valueOf(this.n));
        this.setYearOfBirth(String.valueOf(this.l));
        this.setDegreeOfLattitude(this.getDegreeOfLattitude());
        this.setDegreeOfLongitude(this.getDegreeOfLongitude());
        this.setSecondOfLattitude(this.getSecondOfLattitude());
        this.setSecondOfLongitude(this.getSecondOfLongitude());
        this.setMinuteOfLongitude(this.getMinuteOfLongitude());
        this.setMinuteOfLattitude(this.getMinuteOfLattitude());
        this.setEastWest(this.getEastWest());
        this.setNorthSouth(this.getNorthSouth());
        this.setDST(this.getDST());
        this.initialize();
        this.setVarshAscendentSign();
        this.setVarshparveshTime();
    }

    public void initializesArrayValues() throws Exception {
        super.initializesArrayValues();
        Constants.getValues("DAY_TRIRASHIPATI", this.C);
        Constants.getValues("NIGHT_TRIRASHIPATI", this.D);
        Constants.getValues("LORD_OF_YOGINI", this.E);
        Constants.getValues("YOGINI_NAME_IN_FULL_VALUES", this.I);
    }

    public boolean isBirthInDay() {
        double var1 = this.getUserBirthDayInRealNumber();
        double var3 = this.getSunRiseTime();
        double var5 = this.getSunSetTime();
        return var3 < var1 && var1 < var5;
    }

    protected boolean isInOwnDreskOrNava(int planetNumber, int lord) {
        return planetNumber == lord;
    }

    protected boolean isInOwnHouse(int houseNumber, int plntNumber) {
        boolean var3 = false;
        switch(plntNumber) {
        case 1:
            if (houseNumber == 1 || houseNumber == 9 || houseNumber == 10) {
                var3 = true;
            }

            return var3;
        case 2:
            if (houseNumber != 4) {
                return var3;
            }
            break;
        case 3:
            if (houseNumber == 3 || houseNumber == 6) {
                var3 = true;
            }

            return var3;
        case 4:
            if (houseNumber == 4 || houseNumber == 10) {
                var3 = true;
            }

            return var3;
        case 5:
            if (houseNumber == 2 || houseNumber == 5 || houseNumber == 9 || houseNumber == 10 || houseNumber == 11) {
                var3 = true;
            }

            return var3;
        case 6:
            if (houseNumber != 7) {
                return var3;
            }
            break;
        case 7:
            if (houseNumber != 6 && houseNumber != 8 && houseNumber != 10 && houseNumber != 12) {
                return var3;
            }
            break;
        default:
            return var3;
        }

        var3 = true;
        return var3;
    }

    public static void main(String[] args) {
        try {
            (new Constants()).setConstPath(System.getProperty("user.dir"));
            Varshphala args1;
            (args1 = new Varshphala()).setCompanyName("CSL SOFTWARE LTD., G-4A, Green Park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("agra");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("00");
            args1.setHourOfBirth("00");
            args1.setDayOfBirth("15");
            args1.setMonthOfBirth("08");
            args1.setYearOfBirth("1947");
            args1.setDegreeOfLattitude("28");
            args1.setDegreeOfLongitude("77");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("13");
            args1.setMinuteOfLattitude("39");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setDST("0");
            args1.initialize();
            args1.setVarshphalYear(62);
            long var3 = args1.calculateJdForVarshphal();
            int[] var1 = args1.getVarshphal(args1.getVarshphalYear(), var3);

            int var2;
            for(var2 = 0; var2 < 6; ++var2) {
                System.out.println("kkkkk" + var1[var2]);
            }

            String[] var10 = args1.calculateIstLevelMuddaYoginiDasa();

            for(int var8 = 0; var8 < 8; ++var8) {
                System.out.println("Yoginidasha" + var10[var8]);
            }

            String[] var9 = args1.getYoginiName();

            for(var2 = 0; var2 < 8; ++var2) {
                System.out.println("YoginiName" + var9[var2]);
            }

            var10 = args1.getYoginiLordName();

            for(int args2 = 0; args2 < 8; ++args2) {
                System.out.println("YoginiName" + var10[args2]);
            }

        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    protected double returnHarshaBalaType1(int plntNumber) {
        double var3 = 0.0D;
        int var2 = this.getPlntHouse(plntNumber);
        switch(plntNumber) {
        case 1:
            if (var2 == 9) {
                var3 = 5.0D;
            }
            break;
        case 2:
            if (var2 == 3) {
                var3 = 5.0D;
            }
            break;
        case 3:
            if (var2 == 6) {
                var3 = 5.0D;
            }
            break;
        case 4:
            if (var2 == 1) {
                var3 = 5.0D;
            }
            break;
        case 5:
            if (var2 == 11) {
                var3 = 5.0D;
            } else {
                var3 = 0.0D;
            }
            break;
        case 6:
            if (var2 == 5) {
                var3 = 5.0D;
            }
            break;
        case 7:
            if (var2 == 12) {
                var3 = 5.0D;
            }
        }

        return var3;
    }

    protected double returnHarshaBalaType2(int plntNumber) {
        double var6 = 0.0D;
        int var2 = this.varga[plntNumber][0];
        boolean var8 = this.isExalted(plntNumber, var2);
        int var3 = this.getPlntHouse(plntNumber);
        if (plntNumber == 7) {
            System.out.println("houseNumber for saturn   ->7");
        }

        boolean var9 = this.isInOwnHouse(var3, plntNumber);
        switch(plntNumber) {
        case 1:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 2:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 3:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 4:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 5:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 6:
            if (var8 || var9) {
                var6 = 5.0D;
            }
            break;
        case 7:
            if (var8 || var9) {
                var6 = 5.0D;
                System.out.println("points for saturn   ->5.0");
            }
        }

        return var6;
    }

    protected double returnHarshaBalaType3(int plntNumber) {
        double var2 = 0.0D;
        switch(this.getPlntHouse(plntNumber)) {
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
            if (plntNumber != 2 && plntNumber != 4 && plntNumber != 6 && plntNumber != 7) {
                var2 = 0.0D;
            } else {
                var2 = 5.0D;
            }
            break;
        case 4:
        case 5:
        case 6:
        case 10:
            if (plntNumber != 1 && plntNumber != 3 && plntNumber != 5) {
                var2 = 0.0D;
            } else {
                var2 = 5.0D;
            }
        }

        return var2;
    }

    protected double returnHarshaBalaType4(int plntNumber) {
        double var3 = 0.0D;
        boolean var2 = this.isBirthInDay();
        switch(plntNumber) {
        case 1:
            if (var2) {
                var3 = 5.0D;
            }
            break;
        case 2:
            if (!var2) {
                var3 = 5.0D;
            }
            break;
        case 3:
            if (var2) {
                var3 = 5.0D;
            }
            break;
        case 4:
            if (!var2) {
                var3 = 5.0D;
            }
            break;
        case 5:
            if (var2) {
                var3 = 5.0D;
            }
            break;
        case 6:
            if (!var2) {
                var3 = 5.0D;
            }
            break;
        case 7:
            if (!var2) {
                var3 = 5.0D;
            }
        }

        return var3;
    }

    protected int returnLordOfDreakkana(double degOfPlnt) {
        int degOfPlnt1 = (int)(degOfPlnt / 10.0D);
        return (degOfPlnt1 = 3 + degOfPlnt1 * 5) % 7;
    }

    protected int returnLordOfNavamsa(double degOfPlnt) {
        int degOfPlnt1 = (int)(degOfPlnt / 3.3333333333D);
        return (degOfPlnt1 = 3 + degOfPlnt1 * 5) % 7;
    }

    protected int returnVarshaphalBhavaMatri(int planetRasi, int rasiOfLordPlanet) {
        byte var3 = 0;
        if ((planetRasi = rasiOfLordPlanet - planetRasi) < 0) {
            planetRasi += 12;
        }

        ++planetRasi;
        switch(planetRasi) {
        case 1:
        case 4:
        case 7:
        case 10:
            var3 = -1;
            break;
        case 2:
        case 6:
        case 8:
        case 12:
            var3 = 0;
            break;
        case 3:
        case 5:
        case 9:
        case 11:
            var3 = 1;
        }

        return var3;
    }

    protected int returnVarshaphalNaisOrNavMatri(int planetNumber, int lord) {
        byte var3 = 0;
        switch(planetNumber) {
        case 1:
            if (lord != 2 && lord != 3 && lord != 5) {
                if (lord == 6 || lord == 7) {
                    var3 = -1;
                    return var3;
                }
            } else {
                var3 = 1;
            }

            return var3;
        case 2:
            if (lord == 1 || lord == 4) {
                var3 = 1;
            }

            return var3;
        case 3:
            if (lord != 2 && lord != 1 && lord != 5) {
                if (lord != 4) {
                    return var3;
                }
                break;
            }

            var3 = 1;
            return var3;
        case 4:
            if (lord == 6 || lord == 1) {
                var3 = 1;
                return var3;
            }

            if (lord != 2) {
                return var3;
            }
            break;
        case 5:
            if (lord != 2 && lord != 1 && lord != 3) {
                if (lord == 6 || lord == 4) {
                    var3 = -1;
                    return var3;
                }
            } else {
                var3 = 1;
            }

            return var3;
        case 6:
            if (lord != 4 && lord != 7) {
                if (lord == 2 || lord == 1) {
                    var3 = -1;
                }

                return var3;
            }

            var3 = 1;
            return var3;
        case 7:
            if (lord == 6 || lord == 4) {
                var3 = 1;
            } else if (lord == 2 || lord == 1 || lord == 3) {
                break;
            }

            return var3;
        default:
            return var3;
        }

        var3 = -1;
        return var3;
    }

    public void setBirthAscendentSign() {
        this.t = this.getAscendentSign();
    }

    public void setBirthNakshatraNo() {
        this.v = this.getNakshatra() + 1;
    }

    public void setHarshaBala() {
        for(int var1 = 1; var1 <= 7; ++var1) {
            this.K[var1 - 1] = this.returnHarshaBalaType1(var1);
            this.L[var1 - 1] = this.returnHarshaBalaType2(var1);
            this.M[var1 - 1] = this.returnHarshaBalaType3(var1);
            this.N[var1 - 1] = this.returnHarshaBalaType4(var1);
        }

    }

    protected void setPanchaVargiyaBala() {
        for(this.i = 1; this.i <= 7; ++this.i) {
            this.O[this.i - 1] = this.calculateSignPanchaVargiyaBala(this.i, this.varga[this.i][0]);
            this.P[this.i - 1] = this.calculateExaltationPanchaVargiyaBala(this.i);
            this.Q[this.i - 1] = this.calculateHaddaPanchaVargiyaBala(this.i, this.varga[this.i][0]);
            this.R[this.i - 1] = this.calculateDreakkanaPanchaVargiyaBala(this.i, this.varga[this.i][0]);
            this.S[this.i - 1] = this.calculateNavmsaPanchaVargiyaBala(this.i, this.varga[this.i][0]);
            this.T[this.i - 1] = this.O[this.i - 1] + this.P[this.i - 1] + this.Q[this.i - 1] + this.R[this.i - 1] + this.S[this.i - 1];
        }

    }

    public void setVarshAscendentSign() {
        this.u = this.getAscendentSign();
    }

    public void setVarshparveshTime() {
        this.G = Util.makeDHMStoDouble(this.p, this.q, this.r);
    }

    public void setVarshphalYear(int varYear) {
        this.e = varYear;
    }
}
