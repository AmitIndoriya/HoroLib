//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.chardasha;


import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.UtilDesktop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;

public class CharDasa {
    private String a = "0";
    protected UtilDesktop utilDesktop = new UtilDesktop();
    private static int b;
    private static int c;
    private int d;
    private int e;
    private int f;
    private int[][] g = new int[13][7];
    private int h;
    private int[] i = new int[12];
    private int[] j = new int[12];
    private String[] k = new String[12];
    private String[] l = new String[12];
    private String[] m = new String[12];
    private GregorianCalendar n = new GregorianCalendar();
    public String[] ras1 = new String[12];
    protected String YrString;
    protected String YearsString;

    public CharDasa() {
    }

    public int[] dasa() {
        int var3 = -1;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var8 = 0;
        b = this.g[0][0];
        int var9 = this.g[3][0];
        int var10 = this.g[7][0];
        int var11 = this.g[8][0];
        int var12 = this.g[9][0];

        int var1;
        int var2;
        for(var1 = 0; var1 < 12; ++var1) {
            for(var2 = 1; var2 < 10; ++var2) {
                if (b == this.g[var2][0]) {
                    if (var9 == this.g[var2][0] && this.g[var2][0] == this.g[var2][0]) {
                        ++var6;
                    }

                    if (var12 == this.g[var2][0] && this.g[var2][0] == this.g[var2][0]) {
                        ++var5;
                    }

                    if (var10 == this.g[var2][0] && this.g[var2][0] == this.g[var2][0]) {
                        ++var4;
                    }

                    if (var11 == this.g[var2][0] && this.g[var2][0] == this.g[var2][0]) {
                        ++var3;
                    }
                }
            }

            if (++b > 12) {
                b = 1;
            }
        }

        for(var1 = 0; var1 < 12; ++var1) {
            var2 = this.returnRashiLord(b);
            var2 = this.g[var2][0];
            int var7;
            switch(b) {
            case 1:
                if ((var8 = var2 - b) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 2:
                if ((var8 = var2 - b) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 3:
                if ((var8 = var2 - b) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 4:
                if ((var8 = b - var2) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 5:
                if ((var8 = b - var2) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 6:
                if ((var8 = b - var2) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 7:
                if ((var8 = var2 - b) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 8:
                var7 = var12 - b;
                if (var5 > var6) {
                    var8 = var7;
                } else {
                    var8 = var2 - b;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                if (var7 < 0) {
                    var7 += 12;
                }

                if (var8 != var7) {
                    if (var8 == 0 && var7 == 0) {
                        var8 += 12;
                    } else if (var8 == 0 && var7 != 0) {
                        var8 = var7;
                    } else if (var7 == 0 && var8 != 0) {
                    }
                }

                if (++b > 12) {
                    b = 1;
                }
                break;
            case 9:
                if ((var8 = var2 - b) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 10:
                if ((var8 = b - var2) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
                break;
            case 11:
                var8 = var2 - b;
                var7 = b - var11;
                if (var8 < 0) {
                    var8 += 12;
                }

                if (var7 < 0) {
                    var7 += 12;
                }

                if (var7 > var8) {
                    var8 = var7;
                }

                if (var3 == var4) {
                    var8 = var7;
                }

                if (var3 > var4) {
                    var8 = var7;
                } else if (var4 > var3) {
                    var8 = b - var2;
                }

                if (var7 < 0) {
                    var7 += 12;
                }

                if (var8 != var7) {
                    if (var8 == 0 && var7 == 0) {
                        var8 += 12;
                    } else if (var8 == 0 && var7 != 0) {
                        var8 = var7;
                    } else if (var7 == 0 && var8 != 0) {
                    }
                }

                if (++b > 12) {
                    b = 1;
                }
                break;
            case 12:
                if ((var8 = b - var2) == 0) {
                    var8 += 12;
                }

                if (var8 < 0) {
                    var8 += 12;
                }

                var8 = var8;
                if (++b > 12) {
                    b = 1;
                }
            }

            this.i[var1] = var8;
        }

        return this.i;
    }

    public String[] generateSeriesForRashi(int rashiNo) {
        int var2 = 0;

        int var3;
        for(var3 = 0; var3 < 12; ++var3) {
            if (this.k[rashiNo] == this.ras1[var3]) {
                var2 = var3 + 1;
            }
        }

        var3 = var2 + 8;
        if (var3 >= 12) {
            var3 -= 12;
        }

        if (var3 != 1 && var3 != 2 && var3 != 3 && var3 != 7 && var3 != 8 && var3 != 9) {
            return this.getSeriesRashiName1For2Level(var2);
        } else {
            return this.getSeriesRashiNameFor2Level(var2);
        }
    }

    public String[] getDasaSpanForRashi1Level() {
        String[] var1 = new String[12];
        int[] var2 = this.j;
        int var3 = this.f;
        int var4 = this.e;
        int var5 = this.d;

        for(int var6 = 0; var6 < 12; ++var6) {
            String var7 = this.utilDesktop.ymd(var3, var4, var5);
            var3 += var2[var6];
            String var8 = this.utilDesktop.ymd(var3, var4, var5);
            var1[var6] = var7 + " " + this.utilDesktop.getDotString() + " " + var8;
        }

        return var1;
    }

    public String[] getDasaSpanForRashi2level(int no) {
        if (no == 0) {
            this.n.set(this.f, this.e - 1, this.d);
        }

        String[] var5 = new String[12];
        int var4 = this.j[no];

        for(int var6 = 0; var6 < 12; ++var6) {
            no = this.n.get(5);
            int var2 = this.n.get(2) + 1;
            int var3 = this.n.get(1);
            String var7 = this.utilDesktop.ymd(var3, var2, no);
            this.n.add(2, var4);
            no = this.n.get(5);
            var2 = this.n.get(2) + 1;
            var3 = this.n.get(1);
            String no1 = this.utilDesktop.ymd(var3, var2, no);
            no1 = var7 + " " + this.utilDesktop.getDotString() + " " + no1;
            var5[var6] = no1;
        }

        return var5;
    }

    public StringBuffer getFormatted1LevelOutput() {
        String[] var1 = this.getDasaSpanForRashi1Level();
        StringBuffer var2 = new StringBuffer();

        for(int var3 = 0; var3 < 12; ++var3) {
            if (var3 == 6) {
                var2.append(this.utilDesktop.getDasaEndsTerminator() + "\n");
            }

            var2.append(this.k[var3].trim() + " " + UtilDesktop.makelength(String.valueOf(this.j[var3]), 2) + " " + this.YrString + " " + var1[var3] + "\n");
            ++var3;
            if (var3 == 3 || var3 == 9) {
                var2.append(this.utilDesktop.getDasaEndsTerminator() + "\n");
            }

            var2.append(this.k[var3].trim() + " " + UtilDesktop.makelength(String.valueOf(this.j[var3]), 2) + " " + this.YrString + " " + var1[var3] + "\n");
        }

        return var2;
    }

    public String getFormatted1LevelOutputString() {
        return this.getFormatted1LevelOutput().toString();
    }

    public StringBuffer getFormatted2LevelOutput(int no) {
        String[] var2 = this.getDasaSpanForRashi2level(no);
        String[] var3 = this.generateSeriesForRashi(no);
        StringBuffer var4;
        (var4 = new StringBuffer()).append(this.utilDesktop.getDashString(24) + "\n");
        var4.append("       " + this.k[no].trim() + " " + this.j[no] + " " + this.YearsString + "\n");
        var4.append(this.utilDesktop.getDashString(24) + "\n");

        for(no = 0; no < 12; ++no) {
            var4.append(var3[no].trim() + " " + var2[no] + "\n");
        }

        var4.append("\n");
        return var4;
    }

    public String getFormatted2LevelOutputString(int no) {
        return this.getFormatted2LevelOutput(no).toString();
    }

    public int[] getPlanetsStringDasaValue() {
        if (b != 1 && b != 5 && b != 6 && b != 7 && b != 11 && b != 12) {
            int[] var2 = this.i;
            CharDasa var1 = this;
            c = 0;

            for(int var3 = 0; var3 < 12; ++var3) {
                if (c < 0) {
                    c += 12;
                }

                c %= 12;
                var1.j[var3] = var2[c];
                --c;
            }

            return var1.j;
        } else {
            return this.getSeriesValue(this.i);
        }
    }

    public String[] getSeriesRashiName() {
        int var2 = b;

        for(int var1 = 0; var1 < 12; ++var1) {
            var2 %= 12;
            this.k[var1] = this.ras1[var2];
            ++var2;
        }

        return this.k;
    }

    public String[] getSeriesRashiName1() {
        c = b;

        for(int var1 = 0; var1 < 12; ++var1) {
            if ((c %= 12) < 0) {
                c += 12;
            }

            this.k[var1] = this.ras1[c];
            --c;
        }

        return this.k;
    }

    public String[] getSeriesRashiName1For2Level(int rashiNo) {
        c = rashiNo - 2;

        for(rashiNo = 0; rashiNo < 12; ++rashiNo) {
            if ((c %= 12) < 0) {
                c += 12;
            }

            this.m[rashiNo] = this.ras1[c];
            --c;
        }

        return this.m;
    }

    public String[] getSeriesRashiNameFor2Level(int rashiNo) {
        int var2 = rashiNo;

        for(rashiNo = 0; rashiNo < 12; ++rashiNo) {
            var2 %= 12;
            this.l[rashiNo] = this.ras1[var2];
            ++var2;
        }

        return this.l;
    }

    public int[] getSeriesValue(int[] test1) {
        for(int var2 = 0; var2 < 12; ++var2) {
            this.j[var2] = test1[var2];
        }

        return this.j;
    }

    public String[] getStringDasaRashi() {
        if (b == 0) {
            ++b;
        }

        int var1;
        if ((var1 = --b + 8) >= 12) {
            var1 -= 12;
        }

        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 6 && var1 != 7 && var1 != 8 ? this.getSeriesRashiName1() : this.getSeriesRashiName();
    }

    public int getTotalCharDasa() {
        for(int var1 = 0; var1 < 12; ++var1) {
            this.h += this.i[var1];
        }

        return this.h;
    }

    public int[][] getVargaForDasa(int[][] var) {
        return this.g = var;
    }

    public void initializesArrayValues() {
        try {
            Constants.LoadProperties(this.a);
        } catch (FileNotFoundException var2) {
            CSystem.out(CSystem.ERRO_R, var2.getMessage());
        } catch (IOException var3) {
            CSystem.out(CSystem.ERRO_R, var3.getMessage());
        }

        Constants.getValues("RAS1_VALUES", this.ras1);
        this.YrString = Constants.getValue("YR_STRING_KEY");
        this.YearsString = Constants.getValue("YEARS_STRING_KEY");
    }

    public int returnRashiLord(int rashi) {
        switch(rashi) {
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

    public void setUserBirthTimeDetails(int day, int month, int year) {
        this.f = year;
        this.e = month;
        this.d = day;
    }
}
