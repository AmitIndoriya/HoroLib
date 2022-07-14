//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.StringTokenizer;

public class Constants {
    public static Properties properties = new Properties();
    public static String path;
    public static InputStream inputStream;
    public static String dataSourceName = "smsastro";
    public static final String dayChoghadia = "DAY_CHOGHADIA_VALUES";
    public static final String nightChoghadia = "NIGHT_CHOGHADIA_VALUES";
    public static final String aspect = "ASPECT_VALUES";
    public static final String ras1 = "RAS1_VALUES";
    public static final String yoginiNameInFull = "YOGINI_NAME_IN_FULL_VALUES";
    public static final String yogini = "YOGINI_VALUES";
    public static final String yoginiLord = "LORD_OF_YOGINI";
    public static final String day = "DAY_VALUES";
    public static final String daylrd = "DAYLRD_VALUES";
    public static final String ras = "RAS_VALUES";
    public static final String raslrd = "RASLRD_VALUES";
    public static final String naklrd = "NAKLRD_VALUES";
    public static final String tit = "TIT_VALUES";
    public static final String nak = "NAK_VALUES";
    public static final String yog = "YOG_VALUES";
    public static final String x1 = "X1_VALUES";
    public static final String graha = "GRAHA_VALUES";
    public static final String bhavanum = "BHAVANUM_VALUES";
    public static final String Karan = "KARAN_VALUES";
    public static final String paksha = "PAKSHA_VALUES";
    public static final String Jaagrat = "JAAGRAT_VALUES";
    public static final String Baladi = "BALADI_VALUES";
    public static final String Deepta = "DEEPTA_VALUES";
    public static final String karaka = "KARAKA_VALUES";
    public static final String dayrashipati = "DAY_TRIRASHIPATI";
    public static final String nightrashipati = "NIGHT_TRIRASHIPATI";
    public static final int punyaSaham = 0;
    public static final int educationSaham = 1;
    public static final int popularitySaham = 2;
    public static final int friendsSaham = 3;
    public static final int fatherSaham = 4;
    public static final int motherSaham = 5;
    public static final int lifeSaham = 6;
    public static final int karmaSaham = 7;
    public static final int deathSaham = 8;
    public static final int foreignTravelsSaham = 9;
    public static final int wealthSaham = 10;
    public static final int adulterySaham = 11;
    public static final int diseaseSaham = 12;
    public static final int anyaKarmaSaham = 13;
    public static final int tradeSaham = 14;
    public static final int karyaSiddhiSaham = 15;
    public static final int marriageSaham = 16;
    public static final int progenySaham = 17;
    public static final int loveSaham = 18;
    public static final int businessSaham = 19;
    public static final int enemiesSaham = 20;
    public static final int imprisonmentSaham = 21;
    public static final int financialGainsSaham = 22;
    public static final String div = "DIV_VALUES";
    public static final String[] divnum = new String[]{" 1", " 2", " 3", " 4", " 7", " 9", "10", "12", "16", "20", "27", "24", "13", "40", "45", "60"};
    public static final int[] y144 = new int[]{4, 5, 6, 7, 7, 7, 9, 9, 9, 11, 11, 13, 14, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 5, 6, 7, 8, 9, 10, 11, 12, 13, 7, 8, 10, 9, 12, 13, 14, 14, 16, 16, 16, 18, 18, 18, 19, 20, 16, 19, 20, 21, 22, 23, 24, 25, 26, 27, 21, 22, 24, 23, 26, 27, 27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 25, 19, 21, 21, 23, 23, 23, 25, 25, 25, 26, 27, 28, 18, 26, 27, 27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 25, 19, 20, 21, 22, 23, 24, 25, 26, 27, 21, 22, 24, 23, 12, 13, 14, 14, 16, 16, 16, 18, 18, 18, 19, 20, 16, 7, 8, 10, 5, 6, 7, 8, 9, 10, 11, 12, 13, 9, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7};
    public static final int[] x144 = new int[]{28, 25, 30, 22, 28, 34, 19, 25, 37, 24, 30, 27, 29, 5, 10, 15, 7, 13, 19, 8, 14, 19, 11, 16, 13, 15, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 8, 8, 13, 13, 13, 10, 16, 7, 13, 19, 8, 14, 20, 16, 12, 25, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 8, 8, 12, 13, 11, 16, 8, 14, 19, 7, 13, 19, 5, 10, 15, 15, 27, 24, 30, 21, 28, 35, 22, 28, 34, 30, 25, 28, 29, 41, 39, 44, 36, 42, 47, 35, 41, 47, 33, 38, 43, 43, 53, 53, 53, 53, 53, 53, 53, 53, 53, 48, 48, 48, 46, 41, 41, 38, 44, 37, 43, 49, 36, 42, 48, 44, 40, 33, 48, 48, 48, 53, 53, 53, 53, 53, 53, 53, 53, 53, 46, 33, 38, 43, 35, 41, 47, 36, 42, 47, 39, 44, 41, 43};
    public static char[][] horo = new char[][]{"**********************************************************".toCharArray(), "**                          **                          **".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*             **              LAGN        **             *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "**                          **                          **".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*             **                          **             *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "**                          **                          **".toCharArray(), "**********************************************************".toCharArray()};
    public static char[][] horo1 = new char[][]{"**********************************************************".toCharArray(), "**                          **                          **".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*             **              LAGN        **             *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "**                          **                          **".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*             **                          **             *".toCharArray(), "*            *  *                        *  *            *".toCharArray(), "*          *      *                    *      *          *".toCharArray(), "*        *          *                *          *        *".toCharArray(), "*      *              *            *              *      *".toCharArray(), "*    *                  *        *                  *    *".toCharArray(), "*  *                      *    *                      *  *".toCharArray(), "**                          **                          **".toCharArray(), "**********************************************************".toCharArray()};
    public static final String kismat = "KISMAT_VALUES";
    public static final String maalik = "MAALIK_VALUES";
    public static final String pakkaGhar = "PAKKA_GHAR_VALUES";
    public static final String mangalDosh = "MANGALDOSH_VALUES";
    public static final String varna = "VARNA_VALUES";
    public static final String yoni = "YONI_VALUES";
    public static final String gana = "GANA_VALUES";
    public static final int[][] igana = new int[][]{{1, 5, 7, 8, 13, 15, 17, 22, 27}, {3, 9, 10, 14, 16, 18, 19, 23, 24}, {2, 4, 6, 11, 12, 20, 21, 25, 26}};
    public static final String vasya = "VASYA_VALUES";
    public static final String vashya = "VASHYA_VALUES";
    public static final String nadi = "NADI_VALUES";
    public static final String arrNadi = "ARRNADI_VALUES";
    public static final String tara = "TARA_VALUES";
    public static final String x9 = "X9_VALUES";
    public static final String areaOfLife = "AREAOFLIFE_VALUES";
    public static final char[] rlp = "364214635775".toCharArray();
    public static final String paya = "PAYA_VALUES";
    public static final String Deb = "DEB_VALUES";
    public static final String Exal = "EXAL_VALUES";
    public static final int noOfAspects = 6;
    public static final String aspects = "ASPECTS_VALUES";
    public static final String planetNameVim = "PLANETNAMEVIM_VALUES";
    public static final String planetName = "PLANETNAME_VALUES";
    public static final int HEALTH_BHAVA = 1;
    public static final int FINANCE_BHAVA = 2;
    public static final int FAMILY_BHAVA = 2;
    public static final int ROMANCE_BHAVA = 5;
    public static final int MARRIED_LIFE_BHAVA = 7;
    public static final int PROFESSION_BHAVA = 10;
    public static final int MISC_BHAVA = 11;
    public static final int[] aspectBhava = new int[]{1, 2, 2, 5, 7, 10, 11};
    public static final int HEALTH = 1;
    public static final int FINANCE = 2;
    public static final int FAMILY = 3;
    public static final int ROMANCE = 4;
    public static final int MARRIED_LIFE = 5;
    public static final int PROFESSION = 6;
    public static final int MISC = 7;
    public static final int ENGLISH = 1;
    public static final int HINDI = 2;
    public static final int FOREIGN = 3;
    public static final int SUN = 1;
    public static final int MOON = 2;
    public static final int MARS = 3;
    public static final int MERCURY = 4;
    public static final int JUPITER = 5;
    public static final int VENUS = 6;
    public static final int SATURN = 7;
    public static final int RAHU = 8;
    public static final int KETU = 9;
    public static final int URANUS = 10;
    public static final int NEPTUNE = 11;
    public static final int PLUTO = 12;
    public static final int NEUTRAL = 0;
    public static final int FRIEND = 1;
    public static final int INTIMATE = 2;
    public static final int ENEMY = -1;
    public static final int BITTER = -2;
    public static final int WORST = 1;
    public static final int BAD = 2;
    public static final int MODERATE_BAD = 3;
    public static final int MODERATE_GOOD = 4;
    public static final int GOOD = 5;
    public static final int BEST = 6;
    public static final String outcomes = "OUTCOMES_VALUES";
    public static final int FIRST_HOUSE = 5;
    public static final int SECOND_HOUSE = 6;
    public static final int THIRD_HOUSE = 4;
    public static final int FOURTH_HOUSE = 5;
    public static final int FIFTH_HOUSE = 6;
    public static final int SIXTH_HOUSE = 2;
    public static final int SEVENTH_HOUSE = 4;
    public static final int EIGHTH_HOUSE = 1;
    public static final int NINTH_HOUSE = 6;
    public static final int TENTH_HOUSE = 5;
    public static final int ELEVENTH_HOUSE = 6;
    public static final int TWELTH_HOUSE = 1;
    public static final int[] houseResult = new int[]{5, 6, 4, 5, 6, 2, 4, 1, 6, 5, 6, 1};
    public static final int HOURLY = 0;
    public static final int WEEKLY = 2;
    public static final int FORTNIGHTLY = 3;
    public static final int DAILY = 1;
    public static final int ANNUALLY = 5;
    public static final int MONTHLY = 4;
    public static final int DAILY_ON_NAK = 7;
    public static final int SubBase = 1;
    public static final int NakBase = 2;
    public static final int STAR_RATING = 1;
    public static final int NUMBER_RATING = 2;
    public static final int hourlyPrediction = 1;
    public static final int dailyPrediction = 2;
    public static final int weaklyPrediction = 3;
    public static final int fortnightlyPrediction = 4;
    public static final int monthlyPrediction = 5;
    public static final int annuallyPrediction = 6;
    public static final int ARIES = 1;
    public static final int TAURAS = 2;
    public static final int GEMINI = 3;
    public static final int CANCER = 4;
    public static final int LEO = 5;
    public static final int VIRGO = 6;
    public static final int LIBRA = 7;
    public static final int SCORPIO = 8;
    public static final int SAGITTARIUS = 9;
    public static final int CAPRICORN = 10;
    public static final int AQUARIUS = 11;
    public static final int PISCES = 12;
    public static final int Lahiri = 0;
    public static final int Krishnamurti = 1;
    public static final int Raman = 2;
    public final String arrGana = "ARRGANA_VALUES";
    public final String GrahaName = "GRAHANAME_VALUES";
    public static String ProcessingErrorMessage = "There is some error in processing ";
    public static String DefaultErrorMessage = "Entered Parameters not sufficient to process your query.";
    public static final String ayan = "AYAN_KEY";
    public static final String YrString = "YR_STRING_KEY";
    public static final String YearsString = "YEARS_STRING_KEY";
    public static final String hrString = "HR_STRING_KEY";
    public static final String hourString = "HOUR_STRING_KEY";
    public static final String entTimeString = "ENT_TIME_STRING_KEY";
    public static final String dayString = "DAY_STRING_KEY";
    public static final String nightString = "NIGHT_STRING_KEY";
    public static final String exitTimeString = "EXIT_TIME_STRING_KEY";
    public static final String planetString = "PLANET_STRING_KEY";
    public static final String dayLrdString = "DAY_LORD_STRING_KEY";
    public static final String rahuKaalString = "RAHUKAAL_STRING_KEY";
    public static final String amString = "AM_STRING_KEY";
    public static final String pmString = "PM_STRING_KEY";
    public static final String toString = "TO_STRING_KEY";
    public static final String yoginiMahaDasaString = "YOGINI_MAHA_DASA_STRING_KEY";

    public Constants() {
    }

    public static String getValue(String keyName) {
        return properties.getProperty(keyName);
    }

    public static String[] getValues(String keyName, String[] values) {
        keyName = properties.getProperty(keyName);
        int var2 = 0;

        for(StringTokenizer keyName1 = new StringTokenizer(keyName, "ÿ"); keyName1.hasMoreTokens(); ++var2) {
            values[var2] = keyName1.nextToken().trim();
        }

        return values;
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.equals(" ");
    }

    public static void LoadPropertiesOld(String language) throws FileNotFoundException, IOException {
        new BufferedReader(new InputStreamReader(System.in));
        if (language.equals("0")) {
            language = path + "\\Properties\\ConstantsEnglish.properties";
            if (!isWindows()) {
                language = path + "/Properties/ConstantsEnglish.properties";
            }
        } else {
            language = path + "\\Properties\\ConstantsHindi.properties";
            if (!isWindows()) {
                language = path + "/Properties/ConstantsHindi.properties";
            }
        }

        FileInputStream language1;
        try {
            language1 = new FileInputStream(language);
        } catch (FileNotFoundException var2) {
            CSystem.out(CSystem.ERRO_R, "Methos Name : LoadProperties  Class Name : Constants");
            CSystem.out(CSystem.ERRO_R, "FileNotFoundException  : " + var2.toString());
            throw new FileNotFoundException(var2.toString());
        }

        try {
            properties.load(language1);
            language1.close();
        } catch (IOException var1) {
            CSystem.out(CSystem.ERRO_R, "Methos Name : LoadProperties  Class Name : Constants");
            CSystem.out(CSystem.ERRO_R, "IOException  : " + var1.toString());
            throw new IOException(var1.toString());
        }
    }

    public static void LoadProperties(String language) throws FileNotFoundException, IOException {
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                inputStream.close();
            } else {
                LoadPropertiesOld(language);
            }
        } catch (IOException var1) {
            CSystem.out(CSystem.ERRO_R, "Methos Name : LoadProperties  Class Name : Constants");
            CSystem.out(CSystem.ERRO_R, "IOException  : " + var1.toString());
            throw new IOException(var1.toString());
        }
    }

    public void setConstPath(String constPath) {
        path = constPath;
        CSystem.out(CSystem.INFO, "set Path = " + constPath);
    }

    public void setInputStream(InputStream is) {
        inputStream = is;
        CSystem.out(CSystem.INFO, "set fis = " + is);
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
    }
}
