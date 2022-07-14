//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.maitri;

public class Maitri {
    private int[] a = new int[13];
    private int[][] b = new int[][]{{3, 1, 1, 0, 1, -1, -1}, {1, 3, 0, 1, 0, 0, 0}, {1, 1, 3, -1, 1, 0, 0}, {1, -1, 0, 3, 0, 1, 0}, {1, 1, 1, -1, 3, -1, 0}, {-1, -1, 0, 1, 0, 3, 1}, {-1, -1, -1, 1, 0, 1, 3}};

    public Maitri() {
    }

    public int getNaisargikMatri(int planetNo1, int planetNo2) {
        return this.b[planetNo1 - 1][planetNo2 - 1];
    }

    public int getPanchadaMatri(int planetNo1, int planetNo2) {
        return this.getNaisargikMatri(planetNo1, planetNo2) + this.getTatkalikMatri(planetNo1, planetNo2);
    }

    public int[] getPositionForlagnaKundli(int[] varga) {
        this.a = varga;
        return this.a;
    }

    public int getTatkalikMatri(int planetNo1, int planetNo2) {
        if (planetNo1 == planetNo2) {
            return 3;
        } else {
            int var3 = this.a[0];
            if ((planetNo1 = this.a[planetNo1] - (var3 - 1)) <= 0) {
                planetNo1 += 12;
            }

            if ((planetNo2 = this.a[planetNo2] - (var3 - 1)) <= 0) {
                planetNo2 += 12;
            }

            if ((planetNo1 -= planetNo2) < 0) {
                planetNo1 = -planetNo1;
            }

            return ++planetNo1 != 2 && planetNo1 != 3 && planetNo1 != 4 && planetNo1 != 10 && planetNo1 != 11 && planetNo1 != 12 ? -1 : 1;
        }
    }
}
