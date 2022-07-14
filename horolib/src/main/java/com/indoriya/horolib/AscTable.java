//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.indoriya.horolib;


import com.indoriya.horolib.purehoro.PureHoro;

public class AscTable extends PureHoro {
    public AscTable() {
    }

    public void initialize() {
        this.ret = 0;
        this.ps = 0.0D;
        this.pt = 0.0D;
        this.z1 = 3.14159265359D;
        this.z2 = this.z1 / 180.0D;
        this.s1 = 99.99826D;
        this.lat = (double)this.latdeg + (double)this.latmt / 60.0D + (double)(this.latsec / 3600);
        if (this.latitudeType == 1) {
            this.lat = this.returnGeoCentricLat(this.lat);
        }

        if (this.ns == 'S' || this.ns == 's') {
            this.lat = -this.lat;
        }

        this.longt = (double)this.longdeg + (double)this.longmt / 60.0D + (double)(this.longsec / 3600);
        if (this.ew == 'W' || this.ew == 'w') {
            this.longt = -this.longt;
        }

        if (this.dst != 0) {
            this.setUserTime();
        }

        this.j = this.jd(this.d, this.m, this.y);
        this.julDay = this.j;
        this.h6 = ((double)this.h + (double)this.mt / 60.0D + (double)this.s / 3600.0D - (12.0D + (double)this.timeZone)) / 24.0D;
        this.b6 = ((double)(this.j - 694025) + this.h6) / 36525.0D;
        this.j = (this.j + 4) % 7;
        this.daylor = this.j;
        this.init();
        this.ayan();
        if (this.kpAyanamsaType == 0) {
            this.kpayannew((double)this.d, (double)this.m, (double)this.y);
        } else if (this.kpAyanamsaType == 1) {
            this.kpayan((double)this.d, (double)this.m, (double)this.y);
        } else {
            this.kpayankhu((double)this.d, (double)this.m, (double)this.y);
        }

        this.bhavInit();
    }

    public static void main(String[] args) {
    }
}
