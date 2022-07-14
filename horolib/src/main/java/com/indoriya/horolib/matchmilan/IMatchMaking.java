//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.matchmilan;


import com.indoriya.horolib.util.ProcessingErrorException;

public interface IMatchMaking {
    boolean calculateCompatibilityForMangalDosh(int var1, int var2);

    int calculateGana(double var1);

    int calculateGraha(int var1);

    int calculateNadi(double var1);

    int calculateNak(double var1);

    int[] CalculateTara(double var1, double var3);

    int calculateVarna(int var1);

    int calculateVashya(double var1) throws ProcessingErrorException;

    int calculateYoni(double var1);

    String getAreaOfLife(int var1);

    String getGana(double var1);

    String getGraha(int var1);

    int getMaximumBhakoot();

    int getMaximumGana();

    int getMaximumGrahaMaitri();

    int getMaximumNadi();

    int getMaximumTara();

    int getMaximumVarna();

    int getMaximumVashya();

    int getMaximumYoni();

    String getNadi(double var1);

    String[] getTara(double var1, double var3);

    double getTotal();

    String getVarna(int var1);

    String getVashya(double var1);

    String getYoni(double var1);

    void initializesArrayValues() throws Exception;

    int matchBhakutGuna(int var1, int var2);

    int matchGanaGuna(double var1, double var3);

    double matchGrahaMitraGuna(int var1, int var2);

    int matchNadiGuna(double var1, double var3);

    double matchTaraGuna(double var1, double var3);

    int matchVarnaGuna(int var1, int var2);

    double matchVashyaGuna(double var1, double var3) throws ProcessingErrorException;

    int matchYoniGuna(double var1, double var3);

    void setLanguageCode(String var1);
}
