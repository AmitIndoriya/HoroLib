//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.horo;

import java.util.Enumeration;

public interface IHoro {
    int akshvedamsa(double var1);

    double getAsc();

    void calculateAvakadha();

    void calculateSigBhav();

    int chaturtamsa(double var1);

    Enumeration getAllTimeZones();

    int getAyanamsaType();

    String getCompanyAddLine1();

    String getCompanyName();

    int getDayOfBirth();

    String getDegreeOfLattitude();

    String getDegreeOfLongitude();

    int getDrekkana(double var1);

    String getDST();

    int getDstWRTTimeZone(String var1);

    String getEastWest();

    int getHoroscopeStyle();

    String getHourOfBirth();

    double getJupitor();

    int getKaran();

    double getKetu();

    int getKPAyanamsaType();

    int getKPHorarySeed();

    String getLanguageCode();

    int getLatitudeType();

    String getMaleFemale();

    double getMars();

    double getMercury();

    String getMinuteOfBirth();

    String getMinuteOfLattitude();

    String getMinuteOfLongitude();

    int getMonthOfBirth();

    double getMoon();

    String getName();

    double getNeptune();

    String getNorthSouth();

    String getPlace();

    double getPluto();

    double getRahu();

    double getSaturn();

    double[] getPlanetaryDegree();

    String getSecondOfBirth();

    String getSecondOfLattitude();

    String getSecondOfLongitude();

    double getSun();

    String getTimeZone();

    double getUranus();

    int[][] getVarga();

    double getVenus();

    int getYearOfBirth();

    void initialize() throws Exception;

    void initializesArrayValues() throws Exception;

    boolean isDifferentDst();

    int jd(int var1, int var2, int var3);

    int khavedamsa(double var1);

    char[] replstr(char[] var1, int var2, String var3);

    String rnss(double var1);

    void saptavg();

    /** @deprecated */
    void setAyanamsaType(int var1);

    void setAyan(int var1);

    int getAyan();

    void setCompanyAddLine1(String var1);

    void setCompanyName(String var1);

    void setCustomizedAyanamsa(String var1);

    void setDayOfBirth(String var1) throws NumberFormatException, NullPointerException;

    void setDegreeOfLattitude(String var1) throws NumberFormatException, NullPointerException;

    void setDegreeOfLongitude(String var1) throws NumberFormatException, NullPointerException;

    void setDST(String var1) throws NumberFormatException, NullPointerException;

    void setEastWest(String var1) throws NumberFormatException, NullPointerException;

    void setHinduWeekday();

    void setHoroscopeStyle(int var1);

    void setHourOfBirth(String var1) throws NumberFormatException, NullPointerException;

    /** @deprecated */
    void setKPAyanamsaType(int var1);

    void setKPHorarySeed(int var1);

    void setLanguageCode(String var1);

    void setLatitudeType(int var1);

    void setMaleFemale(String var1);

    void setMinuteOfBirth(String var1) throws NumberFormatException, NullPointerException;

    void setMinuteOfLattitude(String var1) throws NumberFormatException, NullPointerException;

    void setMinuteOfLongitude(String var1) throws NumberFormatException, NullPointerException;

    void setMonthOfBirth(String var1) throws NumberFormatException, NullPointerException;

    void setName(String var1);

    void setNorthSouth(String var1) throws NullPointerException;

    void setPlace(String var1);

    void setSecondOfBirth(String var1) throws NumberFormatException, NullPointerException;

    void setSecondOfLattitude(String var1) throws NumberFormatException, NullPointerException;

    void setSecondOfLongitude(String var1) throws NumberFormatException, NullPointerException;

    void setTimeZone(String var1) throws NumberFormatException, NullPointerException;

    void setYearOfBirth(String var1) throws NumberFormatException;

    int siddhamsa(double var1);

    int vimshamsa(double var1);

    String toString();

    double getLatitude();

    double getLongitude();
}
