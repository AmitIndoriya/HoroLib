//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib.lalkitab;

public class UtilLalkitab {
    private int[][] a = new int[][]{{1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1}, {1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1}, {0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1}, {0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1}};

    public UtilLalkitab() {
    }

    public int getMaleficBenafic(int grahaNo, int khanaNo) {
        return this.a[grahaNo - 1][khanaNo - 1];
    }

    public int getVarshaphalHousePosition(int khanaNo, int age) {
        return LalKitab.e[age][khanaNo];
    }
}
