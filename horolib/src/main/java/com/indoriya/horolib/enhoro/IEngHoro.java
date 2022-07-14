//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.enhoro;

public interface IEngHoro {
    String CalcMangalDoshString();

    String getAscendentDms();

    String getAscendentNakshatraName();

    int getAscendentPada();

    String getAscendentRasiDms();

    String getSignNameForLongitude(double var1);

    String getSignLordNameForLongitude(double var1);

    String getNakshatraLordNameForLontitude(double var1);

    String getAscendentSignName();

    String getAscendentSubLordName();

    int getAshtakvargaBinduForSignAndPlanet(int var1, int var2);

    int[] getAspectToBhav();

    String[] getAspectValueToBhav();

    String getAyanamsaDms();

    String getBhavBeginForBhavDms(int var1);

    String getDayDurationHms();

    String getFortunaDms();

    String getGanaName();

    String getGmtAtBirthHms();

    String getHinduWeekdayName();

    String getWeekdayName();

    int[] getHouselord(int var1, int var2);

    String getIndianSunSignName();

    String getIshtkaalDms();

    String getJulianDayValue();

    String getKaranName();

    String getKPAscendentNakshatraLordName();

    String getKPAscendentSignLordName();

    String getKPAscendentSubLordName();

    String getKPAyanamsaLongitudeDms();

    int[] getKPBhavOccupants(int var1);

    int getKPBhavOwner(int var1);

    String getKPCuspLongitudeDms(int var1);

    String getKPDayLordName();

    String getKPFortunaLongitudeDms();

    String getKPMoonNakshatraLordName();

    String getKPMoonSignLordName();

    String getKPMoonSubLordName();

    String getKPPlanetLongitudeDms(int var1);

    int[] getKPPlnetsInPlanetNakshatra(int var1);

    String getLagnaLordName();

    String getLagnaSign();

    String getLMTCorrectionHms();

    String getLMTOfBirthHms();

    double getLongitudeOfPlanet(int var1);

    int getMarsInBhavForMoonChart();

    double getMidBhavForBhava(int var1);

    String getMoonSubLordName();

    String getNadiName();

    String getNakshatraLordName();

    String getNakshatraLordNameForKPCusp(int var1);

    String getNakshatraLordNameForKPPlanet(int var1);

    String getNakshatraName();

    String getNakshatraNameForPlanet(int var1);

    String getObliquityDms();

    int getPadaOfPlanet(int var1);

    String getPakshaName();

    String getPayaName();

    String getPlanetaryLongitudeDms(int var1);

    String getPlanetaryRasiDms(int var1);

    String getPlanetaryRasiName(int var1);

    String getPlanetaryRasiNameForShodashvargaDivision(int var1, int var2);

    int[] getPlanetAspectFromShodashvargaDivision(int var1, int var2);

    int[] getPlanetInBhav();

    int[] getPlanetInBhav(int var1);

    String getRashiNameForKPCusp(int var1);

    String getRashiNameForKPPlanet(int var1);

    String[] getRasiAndItsDegree(double var1);

    String[] getRasiAndRasilordAndItsDegree(double var1);

    String getRasiLordName();

    String getRasiName();

    int getRelationshipForShodashvargaDivision(int var1, int var2);

    int getShodashvargaSignForVargaAndPlanet(int var1, int var2);

    String getSiderealTimeHms();

    String getSubLordNameForKPCusp(int var1);

    String getSubLordNameForKPPlanet(int var1);

    String getSubSubLordNameForKPCusp(int var1);

    String getSubSubLordNameForKPPlanet(int var1);

    String getSubSubName(double var1);

    String getSunRiseTimeHms();

    String getSunSetTimeHms();

    int getSunSignLord();

    String getSunSignName();

    String getTithiName();

    String getTithiValueName();

    double getTropicalCuspalLongitude();

    double getTropicalPlanetLongitude(int var1);

    String getVarnaName();

    String getVasyaName();

    String getWarDaylightCorrectionHms();

    String getYoganame();

    String getYogaValueName();

    String getYoniName();

    void initializePlanetAspectToForShodashvargaDivision(int var1, int var2);

    boolean isMangalDosh();

    boolean isMangalDoshForMoonChart();

    void newMethod();
}
