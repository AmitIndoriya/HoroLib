//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.dhoro;

import com.indoriya.horolib.enhoro.EngHoro;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.Util;
import com.indoriya.horolib.util.UtilDesktop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DesktopHoro extends EngHoro implements IDesktopHoro {
    private String[] e = new String[10];
    private Date g = new Date();
    private SimpleDateFormat k = new SimpleDateFormat("yyyy");
    private int l;
    private int n;
    private Calendar o = Calendar.getInstance();
    private String[] p = new String[8];
    private String[] q = new String[7];
    private String[] r = new String[7];
    private String[] t = new String[8];
    private int u;
    private int v;
    public final int DAY = 0;
    public final int NIGHT = 1;
    private String[] w = new String[16];
    private double[] x = new double[16];
    private String[] z = new String[7];
    private String[] A = new String[7];
    private String[] B = new String[12];
    private String[] C = new String[12];
    private int[] D = new int[12];
    private int[] E = new int[12];
    protected String hourString;
    protected String yearsString;
    protected String hrString;
    protected String entTimeString;
    protected String dayString;
    protected String nightString;
    protected String exitTimeString;
    protected String planetString;
    protected String dayLrdString;
    protected String rahuKaalString;
    protected String amString;
    protected String pmString;
    protected String toString;
    protected String[][][] pratayentarDasa = new String[9][9][9];
    protected String[][] anterDasa = new String[9][9];
    protected String[] mahaDasa = new String[9];
    protected String[] Jaagrat = new String[3];
    protected String[] Baladi = new String[5];
    protected String[] Deepta = new String[10];
    protected String[] karaka = new String[7];

    public DesktopHoro() {
        this.l = Integer.parseInt(this.k.format(this.g));
        this.n = this.l + 11;
    }

    public StringBuffer asp_chalit() {
        double[] var1 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var2 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var3 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double[] var4 = new double[12];
        boolean var8 = false;
        StringBuffer var11 = new StringBuffer();

        int var7;
        for(var7 = 0; var7 < 12; ++var7) {
            var4[var7] = -1.0D;
        }

        var11.append("\t\t\t\t A S P E C T S   O N   B H A V A - M A D H Y A\n");
        var11.append("\t\t\t\t " + this.utilDesktop.getDashString(45) + "\n");
        var11.append("\t        " + this.utilDesktop.getDashString(27) + "ASPECTED BHAVA-MADHYA" + this.utilDesktop.getDashString(22) + "\n");
        var11.append("\t        ");

        int var5;
        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(this.bhavanum[var5] + "     ");
        }

        var11.append("\n");
        var11.append("\t       ");

        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(" " + UtilDesktop.makespace(String.valueOf((int)this.f2[var5]), 3) + "  ");
        }

        var11.append("\n");
        var11.append("\t       ");

        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(" " + UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.f2[var5]) * 60.0D)), 3) + "  ");
        }

        var11.append("\n        \t" + this.utilDesktop.getDashString(71) + "\n");
        var11.append("\t ");

        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(this.graha[var5] + " ");

            for(int var6 = 1; var6 < 13; ++var6) {
                double var9;
                if ((var9 = this.f2[var6 - 1] - this.plnt[var5]) < 0.0D) {
                    var11.append("   " + this.utilDesktop.getDashString(2) + " ");
                } else {
                    for(var7 = 0; var7 < 10; ++var7) {
                        if (this.between(var9, var1[var7], var2[var7])) {
                            var11.append("  " + this.e[var7]);
                            var4[var6 - 1] = (var2[var7] - Math.abs(var1[var7] - var9)) * var3[var7] / var2[var7];
                            var8 = true;
                        }
                    }

                    if (!var8) {
                        var11.append("   " + this.utilDesktop.getDashString(2) + " ");
                    }

                    var8 = false;
                }
            }

            var11.append("\n\t");
            var11.append((int)this.plnt[var5] + this.utilDesktop.getDotString() + (int)(UtilDesktop.fract(this.plnt[var5]) * 60.0D));

            for(var7 = 0; var7 < 12; ++var7) {
                if (var4[var7] > 0.0D) {
                    var11.append("  " + (double)Math.round(var4[var7] * 100.0D) / 100.0D);
                } else {
                    var11.append("      ");
                }
            }

            for(var7 = 0; var7 < 12; ++var7) {
                var4[var7] = -1.0D;
            }

            var11.append("\n\t");
        }

        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        var11.append("\t1. Following aspects and values have been taken for computation :\n\n");
        var11.append("\t   Abbr-Aspect        Degree  Orb  Weight   Abbr-Aspect   Degree  Orb   Weight\n");
        var11.append("\t   CONJ-CONJUNCTION       0   15    10   OPPN-OPPOSITION    180\t  15     10 \n");
        var11.append("\t   TRIN-TRINE\t        120    6    3    SQUR-SQUARE\t     90    6      3 \n");
        var11.append("\t   SEXT-SEXTILE\t         60    6    3    SSQU-SEMI SQUARE    45    1      1 \n");
        var11.append("\t   NONL-NONILE\t         40    1    1    QUIN-QUINLILE\t     72\t   1      1 \n");
        var11.append("\t   SQQD-SESQUIQUADRATE  135    1    1    QCUN-QUINCUNC      150    1      1\n\n");
        var11.append("\t2. The table specifies the aspect if it exists and the weight. Weight has been\n");
        var11.append("\t   taken varying as a COS factor of displacement from the point of aspect.\n\n");
        var11.append("\t3. Bhava-madhya degrees of the Chalit chart have been taken as the cusp degree\n");
        var11.append("\t   to compute the aspect.\n\n");
        var11.append("\t4. The table shows aspects applied by planets to bhava-madhya.\n");
        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        return var11;
    }

    public StringBuffer asp_kpcusp() {
        double[] var1 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var2 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var3 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double[] var4 = new double[12];
        boolean var8 = false;
        StringBuffer var11 = new StringBuffer();

        int var7;
        for(var7 = 0; var7 < 12; ++var7) {
            var4[var7] = -1.0D;
        }

        var11.append("\t\t\t\t   A S P E C T S   O N   K. P. C U S P\n");
        var11.append("\t\t\t\t " + this.utilDesktop.getDashString(45) + "\n");
        var11.append("\t      " + this.utilDesktop.getDashString(30) + "ASPECTED CUSP" + this.utilDesktop.getDashString(27) + "\n");
        var11.append("\t       ");

        int var5;
        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(this.bhavanum[var5] + "     ");
        }

        var11.append("\n");
        var11.append("\t      ");

        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(" " + UtilDesktop.makespace(String.valueOf((int)this.f4[var5]), 3) + "  ");
        }

        var11.append("\n");
        var11.append("\t      ");

        for(var5 = 0; var5 < 12; ++var5) {
            var11.append(" " + UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.f4[var5]) * 60.0D)), 3) + "  ");
        }

        var11.append("\t\n          " + this.utilDesktop.getDashString(71) + "\n");
        var11.append("\t ");

        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(this.graha[var5] + "   ");

            for(int var6 = 1; var6 < 13; ++var6) {
                double var9;
                if ((var9 = this.f4[var6 - 1] - this.plnt[var5]) < 0.0D) {
                    var11.append(" " + this.utilDesktop.getDashString(2) + "   ");
                } else {
                    for(var7 = 0; var7 < 10; ++var7) {
                        if (this.between(var9, var1[var7], var2[var7])) {
                            var11.append(this.e[var7] + "  ");
                            var4[var6 - 1] = (var2[var7] - Math.abs(var1[var7] - var9)) * var3[var7] / var2[var7];
                            var8 = true;
                        }
                    }

                    if (!var8) {
                        var11.append(" " + this.utilDesktop.getDashString(2) + "   ");
                    }

                    var8 = false;
                }
            }

            var11.append("\n\t");
            var11.append((int)this.plnt[var5] + this.utilDesktop.getDotString() + (int)(UtilDesktop.fract(this.plnt[var5]) * 60.0D));

            for(var7 = 0; var7 < 12; ++var7) {
                if (var4[var7] > 0.0D) {
                    var11.append(" " + (double)Math.round(var4[var7] * 100.0D) / 100.0D + " ");
                } else {
                    var11.append("      ");
                }
            }

            for(var7 = 0; var7 < 12; ++var7) {
                var4[var7] = -1.0D;
            }

            var11.append("\n\t");
        }

        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        var11.append("\t1. Following aspects and values have been taken for computation :\n\n");
        var11.append("\t   Abbr-Aspect       Degree   Orb  Weight  Abbr-Aspect   Degree  Orb  Weight\n");
        var11.append("\t   CONJ-CONJUNCTION      0     15    10   OPPN-OPPOSITION   180   15    10\n");
        var11.append("\t   TRIN-TRINE          120      6     3   SQUR-SQUARE\t     90\t   6     3\n");
        var11.append("\t   SEXT-SEXTILE\t        60      6     3   SSQU-SEMI SQUARE   45    1 \t 1\n");
        var11.append("\t   NONL-NONILE\t        40      1     1   QUIN-QUINLILE      72    1     1\n");
        var11.append("\t   SQQD-SESQUIQUADRATE 135      1     1   QCUN-QUINCUNC     150    1     1\n\n");
        var11.append("\t2. The table specifies the aspect if it exists and the weight. Weight has been\n");
        var11.append("\t   taken varying as a COS factor of displacement from the point of aspect.\n\n");
        var11.append("\t3. Cusp degree used in K.P. System have been taken as the cusp degree\n");
        var11.append("\t   to compute the aspect.\n\n");
        var11.append("\t4. The table shows aspects applied by planets to K. P. Cusp.\n");
        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        return var11;
    }

    public StringBuffer asp_planet() {
        double[] var1 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var2 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var3 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double[] var4 = new double[12];
        boolean var8 = false;
        StringBuffer var11 = new StringBuffer();

        int var7;
        for(var7 = 0; var7 < 12; ++var7) {
            var4[var7] = -1.0D;
        }

        var11.append("\t\t\t\t      A S P E C T S   O N   P L A N E T S\n");
        var11.append("\t\t\t\t " + this.utilDesktop.getDashString(45) + "\n");
        var11.append("\t      " + this.utilDesktop.getDashString(32) + "ASPECTED PLANET" + this.utilDesktop.getDashString(25) + "\n");
        var11.append("\t       ");

        int var5;
        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(this.graha[var5] + "  ");
        }

        var11.append("\n");
        var11.append("\t       ");

        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(UtilDesktop.makespace(String.valueOf((int)this.plnt[var5]), 3) + "   ");
        }

        var11.append("\n");
        var11.append("\t       ");

        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.plnt[var5]) * 60.0D)), 3) + "   ");
        }

        var11.append("\n        \t" + this.utilDesktop.getDashString(71) + "\n");
        var11.append("\t ");

        for(var5 = 1; var5 < 13; ++var5) {
            var11.append(this.graha[var5] + "  ");

            for(int var6 = 1; var6 < 13; ++var6) {
                if (var5 == var6) {
                    var11.append(" " + this.utilDesktop.getDashString(2) + "   ");
                } else {
                    double var9;
                    if ((var9 = this.plnt[var6] - this.plnt[var5]) < 0.0D) {
                        var11.append(" " + this.utilDesktop.getDashString(2) + "   ");
                    } else {
                        for(var7 = 0; var7 < 10; ++var7) {
                            if (this.between(var9, var1[var7], var2[var7])) {
                                var11.append(this.e[var7] + "  ");
                                var4[var6 - 1] = (var2[var7] - Math.abs(var1[var7] - var9)) * var3[var7] / var2[var7];
                                var8 = true;
                            }
                        }

                        if (!var8) {
                            var11.append(" " + this.utilDesktop.getDashString(2) + "   ");
                        }

                        var8 = false;
                    }
                }
            }

            var11.append("\n\t");
            var11.append((int)this.plnt[var5] + this.utilDesktop.getDotString() + (int)(UtilDesktop.fract(this.plnt[var5]) * 60.0D));

            for(var7 = 0; var7 < 12; ++var7) {
                if (var4[var7] > 0.0D) {
                    var11.append(" " + (double)Math.round(var4[var7] * 100.0D) / 100.0D + " ");
                } else {
                    var11.append("      ");
                }
            }

            for(var7 = 0; var7 < 12; ++var7) {
                var4[var7] = -1.0D;
            }

            var11.append("\n\t");
        }

        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        var11.append("\t1. Following aspects and values have been taken for computation :\n\n");
        var11.append("\t   Abbr-Aspect\t    Degree  Orb  Weight   Abbr-Aspect\tDegree\tOrb     Weight \t\n");
        var11.append("\t   CONJ-CONJUNCTION      0   15\t  10   OPPN-OPPOSITION\t   180\t 15\t   10\n");
        var11.append("\t   TRIN-TRINE\t       120    6\t   3   SQUR-SQUARE          90\t  6\t    3\n");
        var11.append("\t   SEXT-SEXTILE\t        60    6\t   3   SSQU-SEMI SQUARE     45\t  1\t    1\n");
        var11.append("\t   NONL-NONILE\t        40    1\t   1   QUIN-QUINLILE\t    72\t  1\t    1\n");
        var11.append("\t   SQQD-SESQUIQUADRATE 135    1\t   1   QCUN-QUINCUNC\t   150\t  1\t    1\n\n");
        var11.append("\t2. The table specifies the aspect if it exists and the weight. Weight has been\n");
        var11.append("\t   taken varying as a COS factor of displacement from the point of aspect.\n\n");
        var11.append("\t3. The two lines below the planet names on top and the vallues below the planet\n");
        var11.append("\t   names on left hand side give the degree & minute of the respective planet.\n\n");
        var11.append("\t4. For applying aspect see left to top & for seperating aspect see top to left\n");
        var11.append("\n\t" + this.utilDesktop.getDashString(79) + "\n");
        return var11;
    }

    public String[] calcBaladi() {
        String[] var3 = new String[7];

        for(int var4 = 0; var4 < 7; ++var4) {
            int var1;
            int var2 = (var1 = (int)this.plnt[var4 + 1]) / 30;
            ++var2;
            var1 = (var1 %= 30) / 6;
            if (var2 % 2 == 0) {
                var1 = 4 - var1;
            }

            switch(var1) {
            case 0:
                var3[var4] = this.Baladi[0];
                break;
            case 1:
                var3[var4] = this.Baladi[1];
                break;
            case 2:
                var3[var4] = this.Baladi[2];
                break;
            case 3:
                var3[var4] = this.Baladi[3];
                break;
            case 4:
                var3[var4] = this.Baladi[4];
            }
        }

        return var3;
    }

    public String[] calcChara() {
        double[] var1 = new double[7];

        int var4;
        for(var4 = 1; var4 < 8; ++var4) {
            var1[var4 - 1] = this.degreesInSign(this.plnt[var4]);
        }

        int var5;
        for(var4 = 0; var4 < 7; ++var4) {
            for(var5 = var4 + 1; var5 < 7; ++var5) {
                if (var1[var4] < var1[var5]) {
                    double var2 = var1[var5];
                    var1[var5] = var1[var4];
                    var1[var4] = var2;
                }
            }
        }

        for(var4 = 0; var4 < 7; ++var4) {
            for(var5 = 1; var5 < 8; ++var5) {
                if (var1[var4] == this.degreesInSign(this.plnt[var5])) {
                    this.r[var4] = this.graha[var5];
                }
            }
        }

        return this.r;
    }

    public String[] calcDeepta() {
        String[] var1 = new String[7];

        for(int var2 = 1; var2 < 8; ++var2) {
            if (!this.isInNeutralSign(var2, this.varga[var2 + 1][0])) {
                if (this.isExalted(var2, this.varga[var2 + 1][0])) {
                    var1[var2 - 1] = this.Deepta[1];
                    continue;
                }

                if (this.isDeblited(var2, this.varga[var2 + 1][0])) {
                    var1[var2 - 1] = this.Deepta[2];
                    continue;
                }

                if (this.isInOwnSign(var2, this.varga[var2 + 1][0])) {
                    var1[var2 - 1] = this.Deepta[3];
                    continue;
                }

                if (this.isInFriendSign(var2, this.varga[var2 + 1][0])) {
                    var1[var2 - 1] = this.Deepta[4];
                    continue;
                }

                if (this.isInAnimicalSign(var2, this.varga[var2 + 1][0])) {
                    var1[var2 - 1] = this.Deepta[5];
                    continue;
                }
            }

            var1[var2 - 1] = this.Deepta[0];
        }

        return var1;
    }

    public double calcEndHoraTime(int dayOrNight) {
        double var2 = 0.0D;
        switch(dayOrNight) {
        case 0:
            var2 = (this.getSunSetTime() - this.getSunRiseTime()) / 12.0D;
            break;
        case 1:
            var2 = (24.0D - this.getSunSetTime() + this.getSunRiseTime()) / 12.0D;
        }

        return var2;
    }

    public void calcHoraDayTimeAndDayLordValue() {
        double var1 = this.calcEndHoraTime(0);
        this.o.set(this.getYearOfBirth(), this.getMonthOfBirth() - 1, this.getDayOfBirth());
        this.o.setTime(this.o.getTime());
        int var3 = this.o.get(7) - 1;
        double[] var4 = new double[12];

        int var5;
        for(var5 = 0; var5 < 12; ++var5) {
            if (var5 < 11) {
                var4[var5] = this.getSunRiseTime() + (double)(var5 + 1) * var1;
            } else {
                var4[var5] = this.getSunSetTime();
            }

            this.D[var5] = (var3 + var5 * 5) % 7;
        }

        for(var5 = 0; var5 < 12; ++var5) {
            this.B[var5] = this.utilDesktop.dms(var4[var5]);
        }

    }

    public void calcHoraNightTimeAndDayLordValue() {
        double var1 = this.calcEndHoraTime(1);
        this.o.set(this.getYearOfBirth(), this.getMonthOfBirth() - 1, this.getDayOfBirth());
        this.o.setTime(this.o.getTime());
        int var3 = this.o.get(7) - 1;
        double[] var4 = new double[12];

        for(this.i = 0; this.i < 12; ++this.i) {
            if (this.i < 11) {
                var4[this.i] = this.getSunSetTime() + (double)(this.i + 1) * var1;
            } else {
                var4[this.i] = this.getSunRiseTime();
            }

            if (var4[this.i] >= 24.0D) {
                int var10001 = this.i;
                var4[var10001] -= 24.0D;
            }

            this.E[this.i] = (var3 + ((this.i + 1) * 5 - 1)) % 7;
        }

        for(int var5 = 0; var5 < 12; ++var5) {
            this.C[var5] = this.utilDesktop.dms(var4[var5]);
        }

    }

    public String[] calcJaagrat() {
        String[] var3 = new String[7];

        for(int var4 = 0; var4 < 7; ++var4) {
            int var1;
            int var2 = (var1 = (int)this.plnt[var4 + 1]) / 30;
            ++var2;
            var1 = (var1 %= 30) / 10;
            if (var2 % 2 == 0) {
                var1 = 2 - var1;
            }

            switch(var1) {
            case 0:
                var3[var4] = this.Jaagrat[0];
                break;
            case 1:
                var3[var4] = this.Jaagrat[1];
                break;
            case 2:
                var3[var4] = this.Jaagrat[2];
            }
        }

        return var3;
    }

    public int calculateBhavNo(int planetRasi, int lagnaRasi) {
        if (planetRasi == 0) {
            planetRasi = 12;
        }

        if ((planetRasi = planetRasi - lagnaRasi + 1) <= 0) {
            planetRasi += 12;
        }

        if (planetRasi > 12) {
            planetRasi -= 12;
        }

        return planetRasi;
    }

    public String getAnterDasa(int i, int j, int k) {
        return this.pratayentarDasa[i][j][k];
    }

    public StringBuffer getBalanceOfDasa() {
        return this.balance(this.plnt[2]);
    }

    public String getBalanceOfDasaString() {
        return this.balance(this.plnt[2]).toString();
    }

    public int[] getBhavaForPrediction(double plnt) {
        int[] var5 = new int[5];
        int[] var6 = new int[5];
        int[] var7 = new int[5];
        int var3;
        int var4 = (var3 = (int)(this.f2[0] / 30.0D)) + 1;
        var5[1] = var4 - 12 * (var4 / 12);
        double var9;
        byte var12;
        if ((var9 = 30.0D * UtilDesktop.fract(this.f2[0] / 30.0D)) >= 0.0D && var9 < 10.0D) {
            var12 = 1;
        } else if (var9 >= 10.0D && var9 < 20.0D) {
            var12 = 5;
        } else {
            var12 = 9;
        }

        var4 = var3 + var12;
        var5[2] = var4 - 12 * (var4 / 12);
        var4 = (int)(this.f2[0] * 7.0D / 30.0D + 1.0D);
        var5[3] = var4 - 12 * (var4 / 12);
        var4 = (int)(this.f2[0] * 9.0D / 30.0D + 1.0D);
        var5[4] = var4 - 12 * (var4 / 12);
        var4 = (var3 = (int)(plnt / 30.0D)) + 1;
        var6[1] = var4 - 12 * (var4 / 12);
        if ((var9 = 30.0D * UtilDesktop.fract(plnt / 30.0D)) >= 0.0D && var9 < 10.0D) {
            var12 = 1;
        } else if (var9 >= 10.0D && var9 < 20.0D) {
            var12 = 5;
        } else {
            var12 = 9;
        }

        var4 = var3 + var12;
        var6[2] = var4 - 12 * (var4 / 12);
        var4 = (int)(plnt * 7.0D / 30.0D + 1.0D);
        var6[3] = var4 - 12 * (var4 / 12);
        var4 = (int)(plnt * 9.0D / 30.0D + 1.0D);
        var6[4] = var4 - 12 * (var4 / 12);

        for(int plnt1 = 1; plnt1 <= 4; ++plnt1) {
            var7[plnt1] = this.calculateBhavNo(var6[plnt1], var5[plnt1]);
        }

        return var7;
    }

    public String[] getBhavValueForBhavMadhya(int bhavNo) {
        String[] var2;
        (var2 = new String[2])[0] = UtilDesktop.makespace(String.valueOf((int)this.f2[bhavNo - 1]), 3);
        var2[1] = UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.f2[bhavNo - 1]) * 60.0D)), 3);
        return var2;
    }

    public String[] getBhavValueForKPCusp(int bhavNo) {
        String[] var2;
        (var2 = new String[2])[0] = UtilDesktop.makespace(String.valueOf((int)this.f4[bhavNo - 1]), 3);
        var2[1] = UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.f4[bhavNo - 1]) * 60.0D)), 3);
        return var2;
    }

    public String[] getBhavValueForPlanets(int planetNo) {
        String[] var2;
        (var2 = new String[2])[0] = UtilDesktop.makespace(String.valueOf((int)this.plnt[planetNo]), 3);
        var2[1] = UtilDesktop.makespace(String.valueOf((int)(UtilDesktop.fract(this.plnt[this.i]) * 60.0D)), 3);
        return var2;
    }

    public String getBhuktiDasa(int i, int j) {
        return this.anterDasa[i][j];
    }

    public String[] getCharaGrahaForkaraka() {
        return this.r;
    }

    public String[] getChogadiaDayName() {
        String[] var1 = new String[8];
        int var2 = 0;

        int var3;
        for(var3 = this.u; var3 < 7; ++var2) {
            var1[var2] = this.z[var3];
            ++var3;
        }

        for(var3 = 0; var3 <= this.u; ++var3) {
            var1[var2] = this.z[var3];
            ++var2;
        }

        return var1;
    }

    public String[] getChogadiaNightName() {
        String[] var1 = new String[8];
        int var2 = 0;

        int var3;
        for(var3 = this.v; var3 < 7; ++var2) {
            var1[var2] = this.A[var3];
            ++var3;
        }

        for(var3 = 0; var3 <= this.v; ++var3) {
            var1[var2] = this.A[var3];
            ++var2;
        }

        return var1;
    }

    public String[] getChoghadiaDayTime() {
        double var1 = (this.getSunSetTime() - this.getSunRiseTime()) / 8.0D;
        double[] var3 = new double[8];
        String[] var4 = new String[8];

        int var5;
        for(var5 = 0; var5 < 8; ++var5) {
            var3[var5] = this.getSunRiseTime() + (double)var5 * var1;
            if (var3[var5] >= 24.0D) {
                var3[var5] -= 24.0D;
            }
        }

        for(var5 = 0; var5 < 8; ++var5) {
            var4[var5] = this.utilDesktop.hms(var3[var5]);
        }

        return var4;
    }

    public String[] getChoghadiaNightTime() {
        double var1 = (24.0D - this.getSunSetTime() + this.getSunRiseTime()) / 8.0D;
        double[] var3 = new double[8];
        String[] var4 = new String[8];

        int var5;
        for(var5 = 0; var5 < 8; ++var5) {
            var3[var5] = this.getSunSetTime() + (double)var5 * var1;
            if (var3[var5] >= 24.0D) {
                var3[var5] -= 24.0D;
            }
        }

        for(var5 = 0; var5 < 8; ++var5) {
            var4[var5] = this.utilDesktop.hms(var3[var5]);
        }

        return var4;
    }

    public String[] getDayForRahu() {
        return this.p;
    }

    public String[] getDayHoraTime() {
        return this.B;
    }

    public String[] getDayLordNameForRahukaal() {
        return this.t;
    }

    public String[] getDayLrdForHora() {
        String[] var1 = new String[12];

        for(int var2 = 0; var2 < 12; ++var2) {
            var1[var2] = this.daylrd[this.D[var2]];
        }

        return var1;
    }

    public String[] getNightLrdForHora() {
        String[] var1 = new String[12];

        for(int var2 = 0; var2 < 12; ++var2) {
            var1[var2] = this.daylrd[this.E[var2]];
        }

        return var1;
    }

    public String[] getGrahaForAvastha() {
        String[] var1 = new String[7];

        for(int var2 = 0; var2 < 7; ++var2) {
            var1[var2] = this.graha[var2 + 1];
        }

        return var1;
    }

    public String[] getkaraka() {
        return this.karaka;
    }

    public String getMahaDasa(int i) {
        return this.mahaDasa[i];
    }

    public String[] getNightHoraTime() {
        return this.C;
    }

    public int getNoCorrespondingToMahaDasa(String mahaDasa) {
        int var2 = -1;

        for(int var3 = 0; var3 < this.x9.length; ++var3) {
            if (mahaDasa.equals(this.x9[var3])) {
                var2 = var3;
            }
        }

        return (int)this.y1[var2];
    }

    public String getPlanetToBhavMadhyaAspect(int planetNo, int bhavNo) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        String var5 = " -- ";
        double var6;
        if ((var6 = this.f2[bhavNo - 1] - this.plnt[planetNo]) >= 0.0D) {
            for(planetNo = 0; planetNo < 10; ++planetNo) {
                if (this.between(var6, var3[planetNo], var4[planetNo])) {
                    var5 = this.e[planetNo];
                }
            }
        }

        return var5;
    }

    public String getPlanetToBhavMadhyaWeight(int planetNo, int bhavNo) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var5 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double var6 = 0.0D;
        String var8 = "    ";
        double var9;
        if ((var9 = this.f2[bhavNo - 1] - this.plnt[planetNo]) >= 0.0D) {
            for(planetNo = 0; planetNo < 10; ++planetNo) {
                if (this.between(var9, var3[planetNo], var4[planetNo])) {
                    var6 = (double)Math.round((var4[planetNo] - Math.abs(var3[planetNo] - var9)) * var5[planetNo] / var4[planetNo] * 100.0D) / 100.0D;
                }
            }
        }

        if (var6 != 0.0D) {
            var8 = String.valueOf(var6);
        }

        return var8;
    }

    public String getPlanetToKPCuspAspect(int planetNo, int cuspNo) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        String var5 = " -- ";
        double var6;
        if ((var6 = this.f4[cuspNo - 1] - this.plnt[planetNo]) >= 0.0D) {
            for(planetNo = 0; planetNo < 10; ++planetNo) {
                if (this.between(var6, var3[planetNo], var4[planetNo])) {
                    var5 = this.e[planetNo];
                }
            }
        }

        return var5;
    }

    public String getPlanetToKPCuspAspectWeight(int planetNo, int cuspNo) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var5 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double var6 = 0.0D;
        String var8 = "    ";
        double var9;
        if ((var9 = this.f4[cuspNo - 1] - this.plnt[planetNo]) >= 0.0D) {
            for(planetNo = 0; planetNo < 10; ++planetNo) {
                if (this.between(var9, var3[planetNo], var4[planetNo])) {
                    var6 = (double)Math.round((var4[planetNo] - Math.abs(var3[planetNo] - var9)) * var5[planetNo] / var4[planetNo] * 100.0D) / 100.0D;
                }
            }
        }

        if (var6 != 0.0D) {
            var8 = String.valueOf(var6);
        }

        return var8;
    }

    public String getPlanetToPlanetAspect(int planetNo1, int planetNo2) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        String var5 = " -- ";
        double var6 = this.plnt[planetNo2] - this.plnt[planetNo1];
        if (planetNo1 != planetNo2 && var6 >= 0.0D) {
            for(planetNo1 = 0; planetNo1 < 10; ++planetNo1) {
                if (this.between(var6, var3[planetNo1], var4[planetNo1])) {
                    var5 = this.e[planetNo1];
                }
            }
        }

        return var5;
    }

    public String getPlanetToPlanetAspectWeight(int planetNo1, int planetNo2) {
        double[] var3 = new double[]{0.0D, 120.0D, 60.0D, 40.0D, 135.0D, 180.0D, 90.0D, 45.0D, 72.0D, 150.0D};
        double[] var4 = new double[]{15.0D, 6.0D, 6.0D, 1.0D, 1.0D, 15.0D, 6.0D, 1.0D, 1.0D, 1.0D};
        double[] var5 = new double[]{10.0D, 3.0D, 3.0D, 1.0D, 1.0D, 10.0D, 3.0D, 1.0D, 1.0D, 1.0D};
        double var6 = 0.0D;
        String var8 = "    ";
        double var9 = this.plnt[planetNo2] - this.plnt[planetNo1];
        if (planetNo1 != planetNo2 && var9 >= 0.0D) {
            for(planetNo1 = 0; planetNo1 < 10; ++planetNo1) {
                if (this.between(var9, var3[planetNo1], var4[planetNo1])) {
                    var6 = (double)Math.round((var4[planetNo1] - Math.abs(var3[planetNo1] - var9)) * var5[planetNo1] / var4[planetNo1] * 100.0D) / 100.0D;
                }
            }
        }

        if (var6 != 0.0D) {
            var8 = String.valueOf(var6);
        }

        return var8;
    }

    public String getPlanetWeight(int planetNo) {
        return (int)this.plnt[planetNo] + this.utilDesktop.getDotString() + (int)(UtilDesktop.fract(this.plnt[planetNo]) * 60.0D);
    }

    public String[] getRahukaalTime() {
        return this.w;
    }

    public String[] getSthirGrahaForkaraka() {
        return this.q;
    }

    public String getVimsottariDasaFourLevelString() {
        return this.getVimsottariDasaFourLevel().toString();
    }

    public String getVimsottariDasaThreeLevelString() {
        return this.getVimsottariDasaThreeLevel().toString();
    }

    public String getVimsottariDasaTwoLevelString() {
        return this.getVimsottariDasaTwoLevel().toString();
    }

    public StringBuffer getVimsottariDasaFourLevel() {
        double var1;
        int var3 = (int)(var1 = (double)this.getDayOfBirth());
        double var4;
        int var6 = (int)(var4 = (double)this.getMonthOfBirth());
        int var7 = 0;
        double var9 = (double)this.getYearOfBirth();
        new StringBuffer();
        String var8 = this.utilDesktop.ymd((int)var9, var6, var3);
        double var13 = this.plnt[2];
        double var15 = UtilDesktop.fract(var13 = 9.0D * UtilDesktop.fract(var13 / 120.0D));
        int var43 = (int)var13;
        double var17 = var15 * this.y1[var43];
        double var19 = (var1 = var9 + var4 / 12.0D + var1 / 360.0D) + 75.0D;
        double var21 = var4 = var1 - var17;
        double var11 = var4;
        StringBuffer var25 = new StringBuffer();
        this.line = 20;

        for(this.c = var43; this.c <= var43 + 8; ++this.c) {
            if (this.c > 8) {
                this.c -= 9;
            }

            for(int var14 = 0; var14 <= 8; ++var14) {
                int var16;
                if ((var16 = this.c + var14) > 8) {
                    var16 -= 9;
                }

                var21 += this.y1[this.c] * this.y1[var16] / 120.0D;
                int var26 = (int)(12.0D * UtilDesktop.fract(var21));

                for(int var44 = 0; var44 <= 8; ++var44) {
                    int var45;
                    if ((var45 = var16 + var44) > 8) {
                        var45 -= 9;
                    }

                    int var18 = (int)(var4 += this.y1[this.c] * this.y1[var16] * this.y1[var45] / 14400.0D);
                    int var23 = (int)(12.0D * UtilDesktop.fract(var4));
                    double var35;
                    int var42 = (int)(((var35 = 30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var4)) + 1.0D) - (double)((int)var35)) * 24.0D);
                    int var24 = (int)var35;
                    if (var23 == 0) {
                        --var18;
                        var23 = 12;
                    } else if (var23 == 2 && var24 > 28) {
                        var24 -= 28;
                        var23 = 3;
                    }

                    String var2 = this.utilDesktop.ymd(var18, var23, var24);
                    int var27 = var18;

                    for(int var28 = 0; var28 <= 8; ++var28) {
                        int var29;
                        if ((var29 = var45 + var28) > 8) {
                            var29 -= 9;
                        }

                        var11 += this.y1[this.c] * this.y1[var16] * this.y1[var45] * this.y1[var29] / 1728000.0D;
                        if (var21 >= var9 && ((int)var21 != (int)var9 || var26 >= var6) && var4 >= (double)this.l && var4 <= (double)this.n) {
                            if (var28 == 0) {
                                if ((double)var27 <= var9 && var23 < var6) {
                                    continue;
                                }

                                var25.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(17) + "\n");
                                var25.append(this.x9[this.c] + " " + this.utilDesktop.getDashString(2) + " " + this.x9[var16] + " " + this.utilDesktop.getDashString(2) + " " + this.x9[var45] + "\n");
                                var25.append(this.utilDesktop.getDashString(18) + "\n");
                                var25.append(var8 + "   " + UtilDesktop.makespace(var7, 2) + " " + this.hourString + "\n");
                                var25.append(var2 + "   " + UtilDesktop.makespace(var42, 2) + " " + this.hourString + "\n");
                                var25.append(this.utilDesktop.getDashString(18));
                                var25.append("\n");
                            }

                            var18 = (int)var11;
                            var23 = (int)(12.0D * UtilDesktop.fract(var11));
                            double var40;
                            var7 = (int)(((var40 = 30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var11)) + 1.0D) - (double)((int)var40)) * 24.0D);
                            var24 = (int)var40;
                            if (var23 == 0) {
                                --var18;
                                var23 = 12;
                            } else if (var23 == 2 && var24 > 28) {
                                var24 -= 28;
                                var23 = 3;
                            }

                            var8 = this.utilDesktop.ymd(var18, var23, var24);
                            if ((double)var18 > var9) {
                                var25.append(this.x9[var29] + " " + var8 + " " + UtilDesktop.makespace(var7, 2) + " " + this.hrString + "\n");
                            } else if ((double)var18 < var9) {
                                var25.append(this.x9[var29] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                            } else if ((double)var18 == var9 && var23 > var6) {
                                var25.append(this.x9[var29] + " " + var8 + " " + UtilDesktop.makespace(var7, 2) + " " + this.hrString + "\n");
                            } else if (var23 == var6) {
                                if (var24 < var3) {
                                    var25.append(this.x9[var29] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                                } else {
                                    var25.append(this.x9[var29] + " " + var8 + " " + UtilDesktop.makespace(var7, 2) + " " + this.hrString + "\n");
                                }
                            } else {
                                var25.append(this.x9[var29] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                            }
                        }
                    }
                }
            }

            var25.append("\n");
            if (var4 > var19) {
                break;
            }
        }

        return var25;
    }

    public StringBuffer getVimsottariDasaThreeLevel() {
        int var1 = -1;
        int var2 = -1;
        double var4;
        int var6 = (int)(var4 = (double)this.getDayOfBirth());
        double var7;
        int var9 = (int)(var7 = (double)this.getMonthOfBirth());
        double var10 = (double)this.getYearOfBirth();
        new StringBuffer();
        String var22 = this.utilDesktop.ymd((int)var10, var9, var6);
        double var12 = this.plnt[2];
        double var14 = UtilDesktop.fract(var12 = 9.0D * UtilDesktop.fract(var12 / 120.0D));
        int var27 = (int)var12;
        double var16 = var14 * this.y1[var27];
        double var18 = (var4 = var10 + var7 / 12.0D + var4 / 360.0D) + 75.0D;
        double var20 = var7 = var4 - var16;
        StringBuffer var24 = new StringBuffer();
        this.line = 20;

        for(this.c = var27; this.c <= var27 + 8; ++this.c) {
            ++var1;
            if (this.c > 8) {
                this.c -= 9;
            }

            for(int var5 = 0; var5 <= 8; ++var5) {
                ++var2;
                int var3 = 0;
                int var28;
                if ((var28 = this.c + var5) > 8) {
                    var28 -= 9;
                }

                int var29 = (int)(var20 += this.y1[this.c] * this.y1[var28] / 120.0D);
                int var17;
                int var25 = var17 = (int)(12.0D * UtilDesktop.fract(var20));
                int var23 = (int)(30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var20)) + 1.0D);
                if (var17 == 0) {
                    --var29;
                    var17 = 12;
                } else if (var17 == 2 && var23 > 28) {
                    var23 -= 28;
                    var17 = 3;
                }

                String var26 = this.utilDesktop.ymd(var29, var17, var23);

                for(int var13 = 0; var13 <= 8; ++var13) {
                    int var15;
                    if ((var15 = var28 + var13) > 8) {
                        var15 -= 9;
                    }

                    var7 += this.y1[this.c] * this.y1[var28] * this.y1[var15] / 14400.0D;
                    if (var20 >= var10 && ((int)var20 != (int)var10 || (double)var25 >= var7)) {
                        if (var13 == 0) {
                            var24.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(11) + "\n");
                            var24.append(this.x9[this.c] + " " + this.utilDesktop.getDashString(2) + "  " + this.x9[var28] + "\n");
                            var24.append(this.utilDesktop.getDashString(12) + "\n");
                            var24.append("  " + var22 + "\n");
                            var24.append("  " + var26 + "\n");
                            var24.append(this.utilDesktop.getDashString(12));
                            var24.append("\n");
                        }

                        var29 = (int)var7;
                        var17 = (int)(12.0D * UtilDesktop.fract(var7));
                        var23 = (int)(30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var7)) + 1.0D);
                        if (var17 == 0) {
                            --var29;
                            var17 = 12;
                        } else if (var17 == 2 && var23 > 28) {
                            var23 -= 28;
                            var17 = 3;
                        }

                        var22 = this.utilDesktop.ymd(var29, var17, var23);
                        if ((double)var29 > var10) {
                            var24.append(this.x9[var15] + " " + var22 + "\n");
                            this.pratayentarDasa[var1][var2][var3] = this.x9[var15] + " " + var22;
                        } else if ((double)var29 < var10) {
                            var24.append(this.x9[var15] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                        } else if ((double)var29 == var10 && var17 > var9) {
                            var24.append(this.x9[var15] + " " + var22 + "\n");
                            this.pratayentarDasa[var1][var2][var3] = this.x9[var15] + " " + var22;
                        } else if (var17 == var9) {
                            if (var23 < var6) {
                                var24.append(this.x9[var15] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                            } else {
                                var24.append(this.x9[var15] + " " + var22 + "\n");
                                this.pratayentarDasa[var1][var2][var3] = this.x9[var15] + " " + var22;
                            }
                        } else {
                            var24.append(this.x9[var15] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                        }

                        ++var3;
                    }
                }
            }

            var24.append("\n");
            if (var7 > var18) {
                break;
            }

            var2 = -1;
        }

        return var24;
    }

    public StringBuffer getVimsottariDasaTwoLevel() {
        double var1 = (double)this.getDayOfBirth();
        double var3 = (double)this.getMonthOfBirth();
        double var5 = (double)this.getYearOfBirth();
        int var7 = 0;
        int var8 = 0;
        new StringBuffer();
        String var9 = this.utilDesktop.ymd((int)var5, (int)var3, (int)var1);
        double var10 = this.plnt[2];
        double var12 = UtilDesktop.fract(var10 = 9.0D * UtilDesktop.fract(var10 / 120.0D));
        int var11 = (int)var10;
        double var14 = var12 * this.y1[var11];
        double var16 = (var1 = var5 + var3 / 12.0D + var1 / 360.0D) + 75.0D;
        double var18 = var3 = var1 - var14;
        double var31 = var3;
        StringBuffer var15 = new StringBuffer();
        this.line = 20;

        for(this.c = var11; this.c <= var11 + 8; ++this.c) {
            if (this.c > 8) {
                this.c -= 9;
            }

            int var33 = (int)(var31 += this.y1[this.c]);
            int var2 = (int)(12.0D * UtilDesktop.fract(var31));
            int var38 = (int)(30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var31)) + 1.0D);
            if (var2 == 0) {
                --var33;
                var2 = 12;
            } else if (var2 == 2 && var38 > 28) {
                var38 -= 28;
                var2 = 3;
            }

            String var36 = this.utilDesktop.ymd(var33, var2, var38);

            for(int var37 = 0; var37 <= 8; ++var37) {
                int var13;
                if ((var13 = this.c + var37) > 8) {
                    var13 -= 9;
                }

                var33 = (int)(var18 += this.y1[this.c] * this.y1[var13] / 120.0D);
                var2 = (int)(12.0D * UtilDesktop.fract(var18));
                var38 = (int)(30.0D * UtilDesktop.fract(12.0D * UtilDesktop.fract(var18)) + 1.0D);
                if (var2 == 0) {
                    --var33;
                    var2 = 12;
                } else if (var2 == 2 && var38 > 28) {
                    var38 -= 28;
                    var2 = 3;
                }

                String var35 = this.utilDesktop.ymd(var33, var2, var38);
                if ((var38 = var13 + var37) > 8) {
                    var38 -= 9;
                }

                var3 += this.y1[this.c] * this.y1[var13] * this.y1[var38] / 14400.0D;
                if (var37 == 0) {
                    var15.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(12) + "\n");
                    var15.append(this.x9[this.c] + " " + this.utilDesktop.getDashString(1) + this.getYearsCorrespondingToMahaDasa(this.x9[this.c]) + " " + this.yearsString + "\n");
                    var15.append(this.utilDesktop.getDashString(13) + "\n");
                    var15.append("  " + var9 + "\n");
                    var15.append("  " + var36 + "\n");
                    var15.append(this.utilDesktop.getDashString(13));
                    var15.append("\n");
                    String var34 = this.x9[this.c] + "  " + var36;
                    if (var7 < 9) {
                        this.mahaDasa[var7] = var34;
                    }

                    ++var7;
                    var8 = 0;
                    var9 = var36;
                }

                if (var18 < var5) {
                    var15.append(this.x9[var13] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00\n");
                    if (var7 < 9) {
                        this.anterDasa[var7][var8] = this.x9[var13] + " 00" + this.utilDesktop.getSlashString() + "00" + this.utilDesktop.getSlashString() + "00";
                    }

                    ++var8;
                } else {
                    var15.append(this.x9[var13] + " " + var35 + "\n");
                    if (var7 < 9) {
                        this.anterDasa[var7][var8] = this.x9[var13] + " " + var35;
                    }

                    ++var8;
                }

                ++this.line;
            }

            var15.append("\n");
            if (var3 > var16) {
                break;
            }
        }

        return var15;
    }

    public int getYearsCorrespondingToMahaDasa(String mahaDasa) {
        int var2 = -1;

        for(int var3 = 0; var3 < this.x9.length; ++var3) {
            if (mahaDasa.equals(this.x9[var3])) {
                var2 = var3;
            }
        }

        return (int)this.y1[var2];
    }

    public StringBuffer horoprn() {
        StringBuffer var1 = new StringBuffer();
        int var4 = 0;
        double var17 = 0.0D;
        int[] var8 = new int[12];
        int var5 = (int)(this.f4[0] / 30.0D + 1.0D);

        int var2;
        for(var2 = 0; var2 < 12; ++var2) {
            double var11 = this.plntkp[var2];

            int var3;
            for(var3 = 0; var3 < 12; ++var3) {
                double var13 = this.f4[var3];
                double var15 = this.f4[var3 >= 11 ? var3 - 11 : var3 + 1];
                if (var13 > var15) {
                    var17 = var15;
                    var15 += 360.0D;
                }

                if (var17 != 0.0D && var11 < var17) {
                    var11 += 360.0D;
                    var17 = 0.0D;
                }

                if (var11 >= var13 && var11 < var15) {
                    var4 = var3 + 1;
                    break;
                }
            }

            var3 = var8[var4 - 1]++;
            var3 += (var4 - 1) * 13;
            int var6 = Constants.x144[var3];
            var3 = Constants.y144[var3];
            this.replstr(Constants.horo[var3 - 1], var6, this.graha[var2 + 1]);
            var3 = var2 * 13 + 12;
            var6 = Constants .x144[var3];
            var3 = Constants.y144[var3];
            int var7;
            if ((var7 = var5 + var2) > 12) {
                var7 -= 12;
            }

            String var19 = var7 + "   ";
            this.replstr(Constants.horo[var3 - 1], var6, var19);
        }

        for(var2 = 0; var2 < 31; ++var2) {
            var1.append(Constants.horo[var2] + "\n");
        }

        var1.append("\t\t     KP CHART\n");
        return var1;
    }

    public void initialize() throws Exception {
        super.initialize();
        this.initializesArrayValues();
    }

    public void initializeChoghadiaStartDayAndNight() {
        switch(this.j % 7) {
        case 0:
            this.u = 0;
            this.v = 0;
            return;
        case 1:
            this.u = 3;
            this.v = 2;
            return;
        case 2:
            this.u = 6;
            this.v = 4;
            return;
        case 3:
            this.u = 2;
            this.v = 6;
            return;
        case 4:
            this.u = 5;
            this.v = 1;
            return;
        case 5:
            this.u = 1;
            this.v = 3;
            return;
        case 6:
            this.u = 4;
            this.v = 5;
        default:
        }
    }

    public void initializesArrayValues() throws Exception {
        super.initializesArrayValues();
        Constants.getValues("ASPECT_VALUES", this.e);
        Constants.getValues("DAY_CHOGHADIA_VALUES", this.z);
        Constants.getValues("NIGHT_CHOGHADIA_VALUES", this.A);
        Constants.getValues("JAAGRAT_VALUES", this.Jaagrat);
        Constants.getValues("BALADI_VALUES", this.Baladi);
        Constants.getValues("DEEPTA_VALUES", this.Deepta);
        Constants.getValues("KARAKA_VALUES", this.karaka);
        this.hrString = Constants.getValue("HR_STRING_KEY");
        this.hourString = Constants.getValue("HOUR_STRING_KEY");
        this.yearsString = Constants.getValue("YEARS_STRING_KEY");
        this.entTimeString = Constants.getValue("ENT_TIME_STRING_KEY");
        this.dayString = Constants.getValue("DAY_STRING_KEY");
        this.nightString = Constants.getValue("NIGHT_STRING_KEY");
        this.exitTimeString = Constants.getValue("EXIT_TIME_STRING_KEY");
        this.planetString = Constants.getValue("PLANET_STRING_KEY");
        this.dayLrdString = Constants.getValue("DAY_LORD_STRING_KEY");
        this.rahuKaalString = Constants.getValue("RAHUKAAL_STRING_KEY");
        this.amString = Constants.getValue("AM_STRING_KEY");
        this.pmString = Constants.getValue("PM_STRING_KEY");
        this.toString = Constants.getValue("TO_STRING_KEY");
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));

        try {
            DesktopHoro args1;
            (args1 = new DesktopHoro()).setCompanyName("CSL SOFTWARE LTD., G-4A, Green park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("agra");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("23");
            args1.setHourOfBirth("18");
            args1.setDayOfBirth("22");
            args1.setMonthOfBirth("6");
            args1.setYearOfBirth("2012");
            args1.setDegreeOfLattitude("27");
            args1.setDegreeOfLongitude("78");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("19");
            args1.setMinuteOfLattitude("27");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setLanguageCode("0");
            args1.setDST("0");
            args1.setAyanamsaType(1);
            args1.setLanguageCode("0");
            args1.initialize();
            System.out.println(args1.calcChara()[0]);
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public StringBuffer printAvastha() {
        String[] var1 = this.calcJaagrat();
        String[] var2 = this.calcBaladi();
        String[] var3 = this.calcDeepta();
        StringBuffer var4;
        (var4 = new StringBuffer()).append(this.utilDesktop.getDasaEndsTerminator() + "----------------------------------------\n");
        var4.append(this.utilDesktop.getDasaEndsTerminator() + " Planet" + "  Jaagrat" + "  Baladi" + "   Deepta" + "\n");
        var4.append(this.utilDesktop.getDasaEndsTerminator() + "----------------------------------------\n");

        for(int var5 = 0; var5 < 7; ++var5) {
            var4.append(this.utilDesktop.getDasaEndsTerminator() + UtilDesktop.makespace(this.graha[var5 + 1], 6) + UtilDesktop.makespace(var1[var5], 10) + UtilDesktop.makespace(var2[var5], 8) + UtilDesktop.makespace(var3[var5], 10) + "\n");
        }

        var4.append(this.utilDesktop.getDasaEndsTerminator() + "----------------------------------------\n");
        return var4;
    }

    public StringBuffer printChogadia() {
        String[] var1 = this.getChogadiaDayName();
        String[] var2 = this.getChogadiaNightName();
        String[] var3 = this.getChoghadiaDayTime();
        String[] var4 = this.getChoghadiaNightTime();
        StringBuffer var5;
        (var5 = new StringBuffer()).append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(42) + "\n");
        var5.append(this.utilDesktop.getDasaEndsTerminator() + this.entTimeString + "      " + this.dayString + "       " + this.entTimeString + "    " + this.nightString + "\n");
        var5.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(42) + "\n");

        for(int var6 = 0; var6 < 8; ++var6) {
            var5.append(this.utilDesktop.getDasaEndsTerminator() + var3[var6] + " ");
            var5.append(" " + UtilDesktop.makespace(var1[var6], 8) + " ");
            var5.append(" " + UtilDesktop.makespace(var4[var6], 10) + " ");
            var5.append("  " + UtilDesktop.makespace(var2[var6], 2) + " ");
            var5.append("\n");
        }

        var5.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(42) + "\n");
        return var5;
    }

    public void printChoghadiaTime(double riseORset, double diff) {
    }

    public StringBuffer printHora() {
        this.calcHoraDayTimeAndDayLordValue();
        this.calcHoraNightTimeAndDayLordValue();
        StringBuffer var1;
        (var1 = new StringBuffer()).append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(38) + "\n");
        var1.append(this.utilDesktop.getDasaEndsTerminator() + this.exitTimeString + "   " + this.planetString + "    " + this.exitTimeString + "   " + this.planetString + "\n");
        var1.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(38) + "\n");

        int var2;
        for(var2 = 0; var2 < 12; ++var2) {
            var1.append(this.utilDesktop.getDasaEndsTerminator() + this.B[var2] + "   " + this.daylrd[this.D[var2]] + "\n");
        }

        var1.append("\n\n");

        for(var2 = 0; var2 < 12; ++var2) {
            var1.append(this.utilDesktop.getDasaEndsTerminator() + this.C[var2] + "   " + this.daylrd[this.E[var2]] + "\n");
        }

        return var1;
    }

    public StringBuffer printKaraka() {
        String[] var1 = this.calcChara();
        StringBuffer var2 = new StringBuffer();
        String var3 = "null";
        var2.append(this.utilDesktop.getDasaEndsTerminator() + "-------------------------\n");
        var2.append(this.utilDesktop.getDasaEndsTerminator() + "  Karaka" + "  Sthir" + "  Chara" + "\n");
        var2.append(this.utilDesktop.getDasaEndsTerminator() + "-------------------------\n");

        for(int var4 = 0; var4 < 7; ++var4) {
            switch(var4) {
            case 0:
                var3 = this.graha[1];
                break;
            case 1:
                var3 = this.graha[4];
                break;
            case 2:
                var3 = this.graha[3];
                break;
            case 3:
                var3 = this.graha[2];
                break;
            case 4:
                var3 = this.graha[5];
                break;
            case 5:
                var3 = this.graha[7];
                break;
            case 6:
                var3 = this.graha[6];
            }

            this.q[var4] = var3;
            if (var3.length() == 3) {
                var2.append(this.utilDesktop.getDasaEndsTerminator() + "  " + this.karaka[var4] + "  " + UtilDesktop.makespace(var3, 2) + "   " + var1[var4] + "\n");
            } else {
                var2.append(this.utilDesktop.getDasaEndsTerminator() + "  " + this.karaka[var4] + "  " + var3 + "  " + var1[var4] + "\n");
            }
        }

        return var2;
    }

    public StringBuffer printRahuKaal1() throws Exception {
        Calendar var1 = Calendar.getInstance();
        int var4 = this.getDayOfBirth();
        int var5 = this.getMonthOfBirth();
        int var6 = this.getYearOfBirth();
        this.p[0] = Util.makelength(String.valueOf(this.getDayOfBirth()), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(this.getMonthOfBirth()), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(this.getYearOfBirth()), 2);
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;

        for(int var10 = 0; var7 < 8; ++var10) {
            this.t[var9] = this.getKPDayLordName();
            int var11 = this.j % 7;
            if (var7 == 0) {
                var1.set(var6, var5 - 1, var4);
            } else {
                var1.add(5, 1);
                int var2 = var1.get(1);
                int var3 = var1.get(2) + 1;
                var11 = var1.get(5);
                this.p[var10] = Util.makelength(String.valueOf(var11), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var3), 2) + this.util.getSlashString() + Util.makelength(String.valueOf(var2), 2);
                this.setYearOfBirth(String.valueOf(var2));
                this.setMonthOfBirth(String.valueOf(var3));
                this.setDayOfBirth(String.valueOf(var11));
                this.initialize();
                this.t[var9] = this.getKPDayLordName();
                var11 = this.j % 7;
            }

            double var12 = (this.getSunSetTime() - this.getSunRiseTime()) / 8.0D;
            switch(var11) {
            case 0:
                this.x[var8] = this.getSunRiseTime() + var12 * 7.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 8.0D;
                break;
            case 1:
                this.x[var8] = this.getSunRiseTime() + var12 * 1.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 2.0D;
                break;
            case 2:
                this.x[var8] = this.getSunRiseTime() + var12 * 6.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 7.0D;
                break;
            case 3:
                this.x[var8] = this.getSunRiseTime() + var12 * 4.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 5.0D;
                break;
            case 4:
                this.x[var8] = this.getSunRiseTime() + var12 * 5.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 6.0D;
                break;
            case 5:
                this.x[var8] = this.getSunRiseTime() + var12 * 3.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 4.0D;
                break;
            case 6:
                this.x[var8] = this.getSunRiseTime() + var12 * 2.0D;
                ++var8;
                this.x[var8] = this.getSunRiseTime() + var12 * 3.0D;
            }

            ++var7;
            ++var8;
            ++var9;
        }

        StringBuffer var13;
        (var13 = new StringBuffer()).append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(42) + "\n");
        var13.append(this.utilDesktop.getDasaEndsTerminator() + this.dayString + "  " + this.dayLrdString + "         " + this.rahuKaalString + "\n");
        var13.append(this.utilDesktop.getDasaEndsTerminator() + this.utilDesktop.getDashString(42) + "\n");
        var8 = 0;

        for(var9 = 0; var8 < 16; ++var9) {
            var13.append(this.utilDesktop.getDasaEndsTerminator() + UtilDesktop.makelength(String.valueOf(this.p[var9]), 2) + " ");
            var13.append("  " + this.t[var9] + " ");
            this.w[var8] = this.utilDesktop.hms(this.x[var8]);
            ++var8;
            this.w[var8] = this.utilDesktop.hms(this.x[var8]);
            ++var8;
        }

        this.setYearOfBirth(String.valueOf(var6));
        this.setMonthOfBirth(String.valueOf(var5));
        this.setDayOfBirth(String.valueOf(var4));
        this.initialize();
        return var13;
    }

    public void setFromYearForSookshmadasa(int fromYear) {
        this.l = fromYear;
        this.n = this.l + 11;
    }

    public void setTillYearForSookshmadasa(int tillYear) {
        this.n = tillYear;
    }
}
