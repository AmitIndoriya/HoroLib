//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class HoroDatabase {
    public HoroDatabase() {
    }

    public static void createRecord(Hashtable hashtable) throws ProcessingErrorException {
        Connection var1 = null;
        Statement var2 = null;
        String var3 = (String)hashtable.get("MOBILE_NUMBER");
        String var4 = (String)hashtable.get("DATE");
        String var5 = (String)hashtable.get("TIME");
        String hashtable1 = (String)hashtable.get("MESSAGE");

        try {
            int hashtable2 = (var2 = (var1 = getConnection()).createStatement()).executeUpdate("INSERT INTO InitialInformation VALUES('" + var3 + "','" + var4 + "','" + var5 + "','" + hashtable1 + "')");
            System.out.println("Number Of Rows Updated = " + hashtable2);
        } catch (SQLException var11) {
            System.out.println("Exception is : " + var11);
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        } finally {
            try {
                var2.close();
                var1.close();
            } catch (SQLException var10) {
                System.out.println("Exception is : " + var10);
                throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
            }
        }

    }

    public static Connection getConnection() {
        Connection var0 = null;

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            var0 = DriverManager.getConnection(Constants.dataSourceName);
        } catch (Exception var2) {
            System.out.println("Class Not found " + var2);
        }

        return var0;
    }

    public static ResultSet retrieveBirthInfoFromRegistration(String mobileNumber) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT DateOfBirth, TimeOfBirth, LatDeg, LongDeg, LatMin, LongMin, LongEW, LatNS FROM Registration AS R, City_Master AS CM WHERE MobileNumber='" + mobileNumber + "' AND (R.CityId = CM.CityId)");
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveBirthInfoFromUserData(String userId) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT  day,month,year,hr,min,sec,city  from  user_data1  WHERE userid='" + userId + "'");
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveCommand() throws ProcessingErrorException {
        Connection var0 = getConnection();

        try {
            return var0.createStatement().executeQuery("SELECT Command FROM Command");
        } catch (SQLException var1) {
            System.out.println("Exception :" + var1);
            var1.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveCommandIdFromCommand(String command) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT COMMANDID FROM Command WHERE command='" + command + "'");
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveCommandTypeFromCommand(String command) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT COMMANDTYPE FROM Command WHERE command='" + command + "'");
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveDegreeMinuteAndDirectionFromTimeZone(String city, String distt) throws ProcessingErrorException {
        Connection var2 = getConnection();

        try {
            return var2.createStatement().executeQuery("SELECT LatDeg,LongDeg,LatMin,LongMin,LongEW,LatNS FROM City_Master where place ='" + city + "'AND district = '" + distt + "'");
        } catch (SQLException var3) {
            System.out.println("Exception :" + var3);
            var3.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveMethodNameAndPassingValueAndClassNameFromCommand(String command) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT MethodName,PassingValue,ClassName FROM Command WHERE Command ='" + command + "'");
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveParaMeterIdTypeValidAndReqFromCommandValid(int commandId) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT PARAMETERID,TYPEOFVALIDATION,REQUIRED FROM CommandValidation WHERE commandId=" + commandId);
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static ResultSet retrieveParaMeterIdTypeValidFromCommandValid(int commandId) throws ProcessingErrorException {
        Connection var1 = getConnection();

        try {
            return var1.createStatement().executeQuery("SELECT PARAMETERID,TYPEOFVALIDATION FROM CommandValidation WHERE commandId=" + commandId);
        } catch (SQLException var2) {
            System.out.println("Exception :" + var2);
            var2.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        }
    }

    public static void userRegistration(String mobileNumber, String message, String registrationType) throws ProcessingErrorException {
        Connection var3 = null;
        Statement var4 = null;
        StringTokenizer message1;
        (message1 = new StringTokenizer(message)).nextToken();
        String var5 = message1.nextToken();
        String var6 = message1.nextToken();
        String var7 = message1.nextToken();
        String var8 = "";
        if (message1.hasMoreTokens()) {
            var8 = message1.nextToken();
        }

        try {
            ResultSet message2;
            (message2 = (var4 = (var3 = getConnection()).createStatement()).executeQuery("SELECT CityId From City_Master where Place = '" + var7 + "' AND  district = '" + var8 + "'")).next();
            int message3 = message2.getInt(1);
            var4.executeUpdate("INSERT INTO Registration(MobileNumber, DateOfBirth, TimeOfBirth,RegistrationType, CityId) VALUES('" + mobileNumber + "','" + var5 + "','" + var6 + "','" + registrationType + "'," + message3 + ")");
        } catch (SQLException var14) {
            System.out.println("Exception is : " + var14);
            var14.printStackTrace();
            throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
        } finally {
            try {
                var4.close();
                var3.close();
            } catch (SQLException var13) {
                System.out.println("Exception is : " + var13);
                throw new ProcessingErrorException(Constants.ProcessingErrorMessage);
            }
        }

    }
}
