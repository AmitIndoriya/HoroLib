//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.dhoro;

public interface IDesktopHoro {
    int SUNDAY = 0;
    int MONDAY = 1;
    int TUESDAY = 2;
    int WEDNESDAY = 3;
    int THURSDAY = 4;
    int FRIDAY = 5;
    int SATURDAY = 6;

    StringBuffer asp_chalit();

    StringBuffer asp_kpcusp();

    StringBuffer asp_planet();

    String[] calcBaladi();

    String[] calcChara();

    String[] calcDeepta();

    double calcEndHoraTime(int var1);

    void calcHoraDayTimeAndDayLordValue();

    void calcHoraNightTimeAndDayLordValue();

    String[] calcJaagrat();

    int calculateBhavNo(int var1, int var2);

    String getAnterDasa(int var1, int var2, int var3);

    StringBuffer getBalanceOfDasa();

    int[] getBhavaForPrediction(double var1);

    String[] getBhavValueForBhavMadhya(int var1);

    String[] getBhavValueForKPCusp(int var1);

    String[] getBhavValueForPlanets(int var1);

    String getBhuktiDasa(int var1, int var2);

    String[] getCharaGrahaForkaraka();

    String[] getChogadiaDayName();

    String[] getChogadiaNightName();

    String[] getChoghadiaDayTime();

    String[] getChoghadiaNightTime();

    String[] getDayForRahu();

    String[] getDayHoraTime();

    String[] getDayLordNameForRahukaal();

    String[] getDayLrdForHora();

    String[] getNightLrdForHora();

    String[] getGrahaForAvastha();

    String[] getkaraka();

    String getMahaDasa(int var1);

    String[] getNightHoraTime();

    int getNoCorrespondingToMahaDasa(String var1);

    String getPlanetToBhavMadhyaAspect(int var1, int var2);

    String getPlanetToBhavMadhyaWeight(int var1, int var2);

    String getPlanetToKPCuspAspect(int var1, int var2);

    String getPlanetToKPCuspAspectWeight(int var1, int var2);

    String getPlanetToPlanetAspect(int var1, int var2);

    String getPlanetToPlanetAspectWeight(int var1, int var2);

    String getPlanetWeight(int var1);

    String[] getRahukaalTime();

    String[] getSthirGrahaForkaraka();

    String getVimsottariDasaFourLevelString();

    String getVimsottariDasaThreeLevelString();

    String getVimsottariDasaTwoLevelString();

    StringBuffer getVimsottariDasaFourLevel();

    StringBuffer getVimsottariDasaThreeLevel();

    StringBuffer getVimsottariDasaTwoLevel();

    int getYearsCorrespondingToMahaDasa(String var1);

    StringBuffer horoprn();

    void initialize() throws Exception;

    void initializeChoghadiaStartDayAndNight();

    void initializesArrayValues() throws Exception;

    StringBuffer printAvastha();

    StringBuffer printChogadia();

    void printChoghadiaTime(double var1, double var3);

    StringBuffer printHora();

    StringBuffer printKaraka();

    StringBuffer printRahuKaal1() throws Exception;

    void setFromYearForSookshmadasa(int var1);

    void setTillYearForSookshmadasa(int var1);
}
