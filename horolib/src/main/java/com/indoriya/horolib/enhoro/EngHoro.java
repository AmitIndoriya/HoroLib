//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.enhoro;


import com.indoriya.horolib.purehoro.PureHoro;
import com.indoriya.horolib.util.CSystem;
import com.indoriya.horolib.util.Constants;
import com.indoriya.horolib.util.Util;

public class EngHoro extends PureHoro implements IEngHoro {
    private int[] e = new int[7];
    private String[] g = new String[7];

    public EngHoro() {
    }

    public String CalcMangalDoshString() {
        int var1 = this.CalcMangalDosh();
        String var2 = "";

        try {
            var2 = this.mangalDosh[var1 - 1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :CalcMangalDoshString   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getAscendentDms() {
        return this.util.dms(this.f2[0] % 30.0D);
    }

    public String getAscendentNakshatraName() {
        String var1 = "";

        try {
            var1 = this.nak[this.getNakshatra(this.f2[0])];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getAscendentNakshatraName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public int getAscendentPada() {
        return (int)(4.0D * Util.fract(this.f2[0] * 3.0D / 40.0D) + 1.0D);
    }

    public String getAscendentRasiDms() {
        return this.util.dms(this.f2[0] % 30.0D);
    }

    public String getSignNameForLongitude(double longitude) {
        String var3 = "";

        try {
            var3 = this.ras[(int)(longitude / 30.0D)];
        } catch (NullPointerException var4) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSignNameForLongitude   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var4.toString());
        }

        return var3;
    }

    public String getSignLordNameForLongitude(double longitude) {
        int longitude1 = (int)(longitude / 30.0D);
        String var2 = "";

        try {
            var2 = this.raslrd[longitude1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSignLordNameForLongitude   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getNakshatraLordNameForLontitude(double longitude) {
        String var3 = "";

        try {
            var3 = this.naklrd[(int)(longitude * 0.075D) % 9];
        } catch (NullPointerException var4) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraLordNameForLontitude   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var4.toString());
        }

        return var3;
    }

    public String getAscendentSignName() {
        String var1 = "";

        try {
            var1 = this.ras[this.getAscendentSign() - 1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getAscendentSignName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getAscendentSubLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getAscendentSubLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getAscendentSubLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public int getAshtakvargaBinduForSignAndPlanet(int planetNo, int signNo) {
        return this.ashtakArray[planetNo][signNo];
    }

    public int[] getAspectToBhav() {
        return this.e;
    }

    public String[] getAspectValueToBhav() {
        return this.g;
    }

    public String getAyanamsaDms() {
        return this.util.dms(this.getAyanamsa());
    }

    public String getBhavBeginForBhavDms(int bhavNo) {
        return this.util.dms(this.f3[bhavNo - 1]);
    }

    public String getDayDurationHms() {
        return this.util.hms(this.getDayDuration());
    }

    public String getFortunaDms() {
        return this.util.dms(this.getFortuna());
    }

    public String getGanaName() {
        String var1 = "";

        try {
            var1 = this.gana[this.getGana()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getGanaName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getGmtAtBirthHms() {
        double var1;
        String var3;
        if ((var1 = this.birthTime - (double)this.timeZone) < 0.0D) {
            var1 += 24.0D;
            var3 = "-" + this.util.hms(var1);
        } else {
            var3 = this.util.hms(var1);
        }

        return var3;
    }

    public String getHinduWeekdayName() {
        String var1 = "";

        try {
            var1 = this.day[this.getHinduWeekday()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getHinduWeekdayName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getWeekdayName() {
        String var1 = "";

        try {
            int var2;
            if ((var2 = this.getJulianDay() % 7 + 1) >= 7) {
                var2 -= 7;
            }

            var1 = this.day[var2];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getWeekdayName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public int[] getHouselord(int planetNo, int shodashvargaType) {
        shodashvargaType = this.getPositionForShodasvarg(shodashvargaType)[0];
        switch(planetNo) {
        case 1:
            if ((planetNo = 5 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            shodashvargaType = 0;
            break;
        case 2:
            if ((planetNo = 4 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            shodashvargaType = 0;
            break;
        case 3:
            if ((planetNo = 1 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            if ((shodashvargaType = 8 - shodashvargaType + 1) <= 0) {
                shodashvargaType += 12;
            }
            break;
        case 4:
            if ((planetNo = 3 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            if ((shodashvargaType = 6 - shodashvargaType + 1) <= 0) {
                shodashvargaType += 12;
            }
            break;
        case 5:
            if ((planetNo = 9 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            if ((shodashvargaType = 12 - shodashvargaType + 1) <= 0) {
                shodashvargaType += 12;
            }
            break;
        case 6:
            if ((planetNo = 2 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            if ((shodashvargaType = 7 - shodashvargaType + 1) <= 0) {
                shodashvargaType += 12;
            }
            break;
        case 7:
            if ((planetNo = 10 - shodashvargaType + 1) <= 0) {
                planetNo += 12;
            }

            if ((shodashvargaType = 11 - shodashvargaType + 1) <= 0) {
                shodashvargaType += 12;
            }
            break;
        default:
            planetNo = 0;
            shodashvargaType = 0;
        }

        return new int[]{planetNo, shodashvargaType};
    }

    public String getIndianSunSignName() {
        String var1 = "";

        try {
            var1 = this.ras[this.getIndianSunSign()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getIndianSunSignName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getIshtkaalDms() {
        return this.util.dms(this.getIshtkaal());
    }

    public String getJulianDayValue() {
        return String.valueOf(this.getJulianDay());
    }

    public String getKaranName() {
        String var1 = "";

        try {
            var1 = this.Karan[this.getKaran()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKaranName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getKPAscendentNakshatraLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getKPAscendentNakshatraLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPAscendentNakshatraName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getKPAscendentSignLordName() {
        int var1 = (int)(this.f4[0] / 30.0D);
        String var2 = "";

        try {
            var2 = this.raslrd[var1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPAscendentSubLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getKPAscendentSubLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getKPAscendentSubLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPAscendentSubLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getKPAyanamsaLongitudeDms() {
        return this.util.dms(this.kpaya);
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

    public String getKPCuspLongitudeDms(int cuspNo) {
        return this.util.dms(this.getKPCuspLongitude(cuspNo));
    }

    public String getKPDayLordName() {
        String var1 = "";

        try {
            var1 = this.daylrd[this.vedicDay];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPDayLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getKPFortunaLongitudeDms() {
        return this.util.dms(this.getKPFortunaLongitude());
    }

    public String getKPMoonNakshatraLordName() {
        int var1 = (int)(this.plntkp[1] * 0.075D % 9.0D);
        String var2 = "";

        try {
            var2 = this.naklrd[var1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPMoonNakshatraLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getKPMoonSignLordName() {
        int var1 = (int)(this.plntkp[1] / 30.0D);
        String var2 = "";

        try {
            var2 = this.raslrd[var1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPMoonSignLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getKPMoonSubLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getKPMoonSubLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getKPMoonSubLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getKPPlanetLongitudeDms(int planetNo) {
        return this.util.dms(this.getKPPlanetLongitude(planetNo));
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

    public String getLagnaLordName() {
        String var1 = "";

        try {
            var1 = this.raslrd[this.getLagna()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getLagnaLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getLagnaSign() {
        String var1 = "";

        try {
            var1 = this.ras[this.getLagna()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getLagnaSign   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getLMTCorrectionHms() {
        return this.util.hms(this.getLMTCorrection());
    }

    public String getLMTOfBirthHms() {
        return this.util.hms(this.getLMTOfBirth());
    }

    public double getLongitudeOfPlanet(int planetNo) {
        return this.plnt[planetNo - 1];
    }

    public int getMarsInBhavForMoonChart() {
        int var1 = this.getPlanetaryRasi(3);
        int var2 = this.getPlanetaryRasi(2);
        if ((var1 -= var2) < 0) {
            var1 += 12;
        }

        ++var1;
        return var1;
    }

    public double getMidBhavForBhava(int bhavNo) {
        return this.f2[bhavNo - 1];
    }

    public String getMoonSubLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getMoonSubLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getMoonSubLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getNadiName() {
        String var1 = "";

        try {
            var1 = this.nadi[this.getNadi()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNadiName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getNakshatraLordName() {
        String var1 = "";

        try {
            var1 = this.naklrd[this.getNakshatraLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraLordNameForKPCusp   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getNakshatraLordNameForKPCusp(int cuspNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getNakshatraForKPCusp(cuspNo) % 9];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraLordNameForKPCusp   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getNakshatraLordNameForKPPlanet(int planetNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getNakshatraForKPPlanet(planetNo) % 9];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraLordNameForKPPlanet   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getNakshatraName() {
        String var1 = "";

        try {
            var1 = this.nak[this.getNakshatra()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getNakshatraNameForPlanet(int planetNo) {
        String var2 = "";

        try {
            var2 = this.nak[this.getNakshatraForPlanet(planetNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getNakshatraNameForPlanet   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getObliquityDms() {
        return this.util.dms(this.getObliquity());
    }

    public int getPadaOfPlanet(int planetNo) {
        return (int)(4.0D * Util.fract(this.plnt[planetNo] * 3.0D / 40.0D) + 1.0D);
    }

    public String getPakshaName() {
        String var1 = "";

        try {
            var1 = this.paksha[this.getPaksha()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPakshaName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getPayaName() {
        String var1 = "";

        try {
            var1 = this.paya[this.getPaya()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPayaName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getPlanetaryLongitudeDms(int planetNo) {
        return this.util.dms(this.getPlanetaryLongitude(planetNo));
    }

    public String getPlanetaryRasiDms(int planetNo) {
        return this.util.dms(this.getPlanetaryLongitude(planetNo) % 30.0D);
    }

    public String getPlanetaryRasiName(int planetNo) {
        String var2 = "";

        try {
            var2 = this.ras[this.getPlanetaryRasi(planetNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPlanetaryRasiName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getPlanetaryRasiNameForShodashvargaDivision(int planetNo, int shodashvargaDivision) {
        planetNo = this.getPositionForShodasvarg(shodashvargaDivision)[planetNo];
        String shodashvargaDivision1 = "";

        try {
            shodashvargaDivision1 = this.ras[planetNo - 1];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getPlanetaryRasiNameForShodashvargaDivision   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return shodashvargaDivision1;
    }

    public int[] getPlanetAspectFromShodashvargaDivision(int planetNo, int shodashvargaDivision) {
        int var3 = this.getPlanetInBhav(shodashvargaDivision)[planetNo - 1];
        int[] var5 = new int[9];

        for(int var7 = 1; var7 <= 9; ++var7) {
            if (var7 != planetNo) {
                this.initializePlanetAspectToForShodashvargaDivision(var7, shodashvargaDivision);
                int[] var4 = this.getAspectToBhav();
                String[] var6 = this.getAspectValueToBhav();

                for(int var8 = 0; var8 < 7; ++var8) {
                    if (var6[var8].equalsIgnoreCase("1")) {
                        if (var4[var8] == var3) {
                            var5[var7 - 1] = 1;
                            break;
                        }

                        var5[var7 - 1] = 0;
                    }
                }
            } else {
                var5[var7 - 1] = 0;
            }
        }

        return var5;
    }

    public int[] getPlanetInBhav() {
        int[] var1 = new int[12];
        int[] var2 = this.getPositionForShodasvarg(0);

        for(int var3 = 1; var3 <= 12; ++var3) {
            var1[var3 - 1] = var2[var3] - var2[0] + 1;
            if (var1[var3 - 1] <= 0) {
                var1[var3 - 1] += 12;
            }
        }

        return var1;
    }

    public int[] getPlanetInBhav(int shodashvargaType) {
        int[] var2 = new int[12];
        int[] shodashvargaType1 = this.getPositionForShodasvarg(shodashvargaType);

        for(int var3 = 1; var3 <= 12; ++var3) {
            var2[var3 - 1] = shodashvargaType1[var3] - shodashvargaType1[0] + 1;
            if (var2[var3 - 1] <= 0) {
                var2[var3 - 1] += 12;
            }
        }

        return var2;
    }

    public String getRashiNameForKPCusp(int cusp) {
        String var2 = "";

        try {
            var2 = this.raslrd[this.getRashiForKPCusp(cusp)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getRashiNameForKPCusp   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getRashiNameForKPPlanet(int planetNo) {
        String var2 = "";

        try {
            var2 = this.raslrd[this.getRashiForKPPlanet(planetNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getRashiNameForKPPlanet   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String[] getRasiAndItsDegree(double totaldeg) {
        double var3 = totaldeg % 30.0D;
        int totaldeg1 = (int)totaldeg / 30;
        return new String[]{this.ras[totaldeg1], this.util.hms(var3)};
    }

    public String[] getRasiAndRasilordAndItsDegree(double totaldeg) {
        double var3 = totaldeg % 30.0D;
        int totaldeg1 = (int)totaldeg / 30;
        return new String[]{this.ras[totaldeg1], this.util.hms(var3), this.raslrd[totaldeg1]};
    }

    public String getRasiLordName() {
        String var1 = "";

        try {
            var1 = this.raslrd[this.getRasiLord()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getRasiLordName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getRasiName() {
        String var1 = "";

        try {
            var1 = this.ras[this.getRasi()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getRasiName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public int getRelationshipForShodashvargaDivision(int planetNumber, int shodashvargaDivision) {
        shodashvargaDivision = this.getPositionForShodasvarg(shodashvargaDivision)[planetNumber];
        if (this.isExalted(planetNumber, shodashvargaDivision)) {
            return 1;
        } else if (this.isDeblited(planetNumber, shodashvargaDivision)) {
            return 2;
        } else if (this.isInOwnSign(planetNumber, shodashvargaDivision)) {
            return 3;
        } else if (this.isInFriendSign(planetNumber, shodashvargaDivision)) {
            return 4;
        } else if (this.isInAnimicalSign(planetNumber, shodashvargaDivision)) {
            return 5;
        } else {
            return this.isInNeutralSign(planetNumber, shodashvargaDivision) ? 6 : 0;
        }
    }

    public int getShodashvargaSignForVargaAndPlanet(int vargaNo, int planetNo) {
        return this.varga[vargaNo][planetNo];
    }

    public String getSiderealTimeHms() {
        return this.util.hms(this.getSiderealTime());
    }

    public String getSubLordNameForKPCusp(int cuspNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getSubLordForKPCusp(cuspNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSubLordNameForKPCusp   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getSubLordNameForKPPlanet(int planetNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getSubLordForKPPlanet(planetNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSubLordNameForKPPlanet   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getSubSubLordNameForKPCusp(int cuspNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getSubSubLordForKPCusp(cuspNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSubSubLordNameForKPCusp   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getSubSubLordNameForKPPlanet(int planetNo) {
        String var2 = "";

        try {
            var2 = this.naklrd[this.getSubSubLordForKPPlanet(planetNo)];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSubSubLordNameForKPPlanet   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var2;
    }

    public String getSubSubName(double d) {
        String var3 = "";

        try {
            var3 = this.naklrd[Util.getSubSub(d)];
        } catch (NullPointerException var4) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSubSubName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var4.toString());
        }

        return var3;
    }

    public String getSunRiseTimeHms() {
        return this.util.hms(this.getSunRiseTime());
    }

    public String getSunSetTimeHms() {
        return this.util.hms(this.getSunSetTime());
    }

    public int getSunSignLord() {
        double var1;
        if ((var1 = this.plnt[1] + this.plnt[0]) >= 360.0D) {
            var1 -= 360.0D;
        }

        int var3;
        return var3 = (int)(var1 / 30.0D);
    }

    public String getSunSignName() {
        String var1 = "";

        try {
            var1 = this.ras[this.getSunSign()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getSunSignName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getTithiName() {
        String var1 = "";

        try {
            var1 = this.tit[this.getTithi()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getTithiName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getTithiValueName() {
        return Util.makespace(String.valueOf(this.getTithiValue()), 5);
    }

    public double getTropicalCuspalLongitude() {
        return this.sidtime;
    }

    public double getTropicalPlanetLongitude(int planetNo) {
        return this.sidtime;
    }

    public String getVarnaName() {
        String var1 = "";

        try {
            var1 = this.varna[this.getVarna()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getVarnaName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getVasyaName() {
        String var1 = "";

        try {
            var1 = this.vasya[this.getVasya()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getVasyaName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getWarDaylightCorrectionHms() {
        return this.util.hms(this.getWarDaylightCorrection());
    }

    public String getYoganame() {
        String var1 = "";

        try {
            var1 = this.yog[this.getYoga()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getYoganame   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public String getYogaValueName() {
        return Util.makespace(String.valueOf(this.getYogaValue()), 5);
    }

    public String getYoniName() {
        String var1 = "";

        try {
            var1 = this.yoni[this.getYoni()];
        } catch (NullPointerException var3) {
            CSystem.out(CSystem.ERRO_R, "Method Name :getYoniName   Class Name : EngHoro");
            CSystem.out(CSystem.ERRO_R, var3.toString());
        }

        return var1;
    }

    public void initializePlanetAspectToForShodashvargaDivision(int planetNo, int shodashvargaDivision) {
        shodashvargaDivision = this.getPlanetInBhav(shodashvargaDivision)[planetNo - 1];
        int var4 = 1;

        for(int var5 = 0; var4 <= 12; ++var4) {
            if (var4 != 1 && var4 != 2 && var4 != 6 && var4 != 11 && var4 != 12) {
                int var3;
                if ((var3 = shodashvargaDivision + var4 - 1) > 12) {
                    var3 -= 12;
                }

                this.e[var5] = var3;
                ++var5;
            } else {
                System.out.println("nothing");
            }
        }

        for(var4 = 0; var4 < 7; ++var4) {
            if (var4 == 0 || var4 == 6) {
                this.g[var4] = "1/4";
            }

            if (var4 == 1 || var4 == 4) {
                this.g[var4] = "3/4";
            }

            if (var4 == 2 || var4 == 5) {
                this.g[var4] = "2/4";
            }

            if (var4 == 3) {
                this.g[var4] = "1";
            }
        }

        if (planetNo == 3) {
            this.g[1] = "1";
            this.g[4] = "1";
        }

        if (planetNo == 5 || planetNo == 8 || planetNo == 9) {
            this.g[2] = "1";
            this.g[5] = "1";
        }

        if (planetNo == 7) {
            this.g[0] = "1";
            this.g[6] = "1";
        }

    }

    public boolean isMangalDosh() {
        int var1 = this.getLagna();
        int var2 = this.getPlanetaryRasi(3);
        boolean var3 = false;
        if ((var1 = var2 - var1) < 0) {
            var1 += 12;
        }

        ++var1;
        if (var1 == 1 || var1 == 4 || var1 == 7 || var1 == 8 || var1 == 12) {
            var3 = true;
        }

        return var3;
    }

    public boolean isMangalDoshForMoonChart() {
        this.getLagna();
        int var1 = this.getPlanetaryRasi(3);
        int var2 = this.getPlanetaryRasi(2);
        boolean var3 = false;
        if ((var1 -= var2) < 0) {
            var1 += 12;
        }

        ++var1;
        if (var1 == 1 || var1 == 4 || var1 == 7 || var1 == 8 || var1 == 12) {
            var3 = true;
        }

        return var3;
    }

    public static void main(String[] args) {
        (new Constants()).setConstPath(System.getProperty("user.dir"));
        EngHoro args1 = new EngHoro();

        try {
            args1.setCompanyName("CSL SOFTWARE LTD., G-4A, Green Park Extn., New Delhi-110 016");
            args1.setCompanyAddLine1("Phone:011-6867329, 9811356741, E-Mail: info@astrocamp.com http://www.astrocamp.com");
            args1.setName("punit");
            args1.setPlace("delhi");
            args1.setTimeZone("5.5");
            args1.setMaleFemale("M");
            args1.setSecondOfBirth("00");
            args1.setMinuteOfBirth("28");
            args1.setHourOfBirth("7");
            args1.setDayOfBirth("4");
            args1.setMonthOfBirth("10");
            args1.setYearOfBirth("1982");
            args1.setDegreeOfLattitude("16");
            args1.setDegreeOfLongitude("80");
            args1.setSecondOfLattitude("00");
            args1.setSecondOfLongitude("00");
            args1.setMinuteOfLongitude("50");
            args1.setMinuteOfLattitude("46");
            args1.setEastWest("E");
            args1.setNorthSouth("N");
            args1.setDST("0");
            args1.setHoroscopeStyle(0);
            args1.setAyan(0);
            args1.initialize();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        System.out.println("Nakshatra Name:" + args1.getNakshatraName());
    }

    public void newMethod() {
    }
}
