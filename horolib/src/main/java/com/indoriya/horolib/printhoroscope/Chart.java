//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.printhoroscope;

public abstract class Chart {
    public Chart() {
    }

    public abstract StringBuffer printChart();

    public abstract void setBhavPositionForPlanets(int[] var1);

    public abstract void setBhavPositionForRashi(int var1);

    public abstract void setRashiPositionForPlanets(int[] var1);

    public Chart getChart(int chartType) {
        return (Chart)(chartType == 1 ? new SouthChart() : new NorthChart());
    }
}
