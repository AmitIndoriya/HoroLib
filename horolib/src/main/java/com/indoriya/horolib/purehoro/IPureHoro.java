//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.purehoro;

public interface IPureHoro {
    int SUN = 1;
    int MOON = 2;
    int MARS = 3;
    int MERCURY = 4;
    int JUPITER = 5;
    int VENUS = 6;
    int SATURN = 7;

    StringBuffer balance(double var1);

    int CalcMangalDosh();

    double degreesInSign(double var1);

    double getAscendentLongitude();

    int getAscendentSign();

    int getAscendentSubLord();

    int getAshtakvargaBinduForSignAndPlanet(int var1, int var2);

    double getAyanamsa();

    double getBhavBeginForBhav(int var1);

    double getDayDuration();

    double getFortuna();

    int getGana();

    double getGmtAtBirth();

    int getHinduWeekday();

    int getIndianSunSign();

    double getIshtkaal();

    int getJulianDay();

    int getjvalue();

    int getKPAscendentNakshatraLord();

    int getKPAscendentSubLord();

    double getKPAyanamsaLongitude();

    int[] getKPBhavOccupants(int var1);

    int getKPBhavOwner(int var1);

    double getKPCuspLongitude(int var1);

    double getKPFortunaLongitude();

    int getKPMoonSubLord();

    int getKPNakshatraLord();

    double getKPPlanetLongitude(int var1);

    int[] getKPPlanetSignification(int var1);

    int[] getKPPlanetSignificator(int var1);

    int[] getKPPlnetsInPlanetNakshatra(int var1);

    int getLagna();

    double getLMTCorrection();

    double getLMTOfBirth();

    double getLongitudeOfPlanet(int var1);

    double getMidBhavForBhava(int var1);

    int getMoonSign();

    int getMoonSubLord();

    int getNadi();

    int getNakshatra();

    int getNakshatra(double var1);

    int getNakshatraForKPCusp(int var1);

    int getNakshatraForKPPlanet(int var1);

    int getNakshatraForPlanet(int var1);

    int getNakshatraLord();

    double getObliquity();

    int getPadaOfPlanet(int var1);

    int getPaksha();

    int getPanchadhaFriendshipOfPlanet(int var1);

    int getPaya();

    int getPermanentFriendshipOfPlanet(int var1);

    double getPlanetaryLongitude(int var1);

    int getPlanetaryPada(int var1);

    int getPlanetaryRasi(int var1);

    String getPlanetName(int var1);

    int[] getPositionForShodasvarg(int var1);

    int getPrastharashtakvargaTables(int var1, int var2, int var3);

    int getRashiForKPCusp(int var1);

    int getRashiForKPPlanet(int var1);

    int getRasi();

    int getRasiLord();

    int getShodashvargaSignForVargaAndPlanet(int var1, int var2);

    double getSiderealTime();

    int getSookshmaDasaForPlanet(int var1, int var2, int var3, int var4);

    int getSthiraAnatykarkaPlanet();

    int getSthiraAtmakarakaPlanet();

    int getSthiraBhatruPlanet();

    int getSthiraDarakarakaPlanet();

    int getSthiraGrathikarakaPlanet();

    int getSthiraMatruKarkaPlanet();

    int getSthiraPutrakarakaPlanet();

    int getSubLordForKPCusp(int var1);

    int getSubLordForKPPlanet(int var1);

    int getSubSubLordForKPCusp(int var1);

    int getSubSubLordForKPPlanet(int var1);

    double getSunRiseTime();

    double getSunSetTime();

    int getSunSign();

    int getSunSignLord();

    int getTemporaryFriendshipOfPlanet(int var1);

    int getTithi();

    double getTithiValue();

    int[] getTotalAshtakVargaValue();

    double getTropicalCuspalLongitude();

    double getTropicalPlanetLongitude(int var1);

    int getVarna();

    int getVasya();

    double getWarDaylightCorrection();

    int getYoga();

    double getYogaValue();

    int getYoni();

    void initialize() throws Exception;

    boolean isAccelerate(int var1);

    boolean isCombust(int var1);

    boolean isDeblited(int var1, int var2);

    boolean isExalted(int var1, int var2);

    boolean isInFriendSign(int var1, int var2);

    boolean isInLastQuarter(int var1);

    boolean isInNeutralSign(int var1, int var2);

    boolean isPlanetDirect(int var1);

    boolean isPlanetRetrograde(int var1);

    boolean isRetrograde(int var1);

    int returnMangalDoshPoints();
}
