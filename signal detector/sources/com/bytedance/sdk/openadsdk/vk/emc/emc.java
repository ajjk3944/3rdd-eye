package com.bytedance.sdk.openadsdk.vk.emc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public class emc {
    int aa;
    float bw;
    String cf;
    float dg;
    String emc;
    float gbl;
    float msw;
    int qh;
    int ru;
    float sup;
    float sz;
    float uym;
    float vk;
    float xq;
    int ycc;
    int ypw;
    float zz;
    int sba = -1;
    String yzg = "";

    /* renamed from: com.bytedance.sdk.openadsdk.vk.emc.emc$emc, reason: collision with other inner class name */
    public static class C0102emc {
        emc emc = new emc();

        public C0102emc bw(float f2) {
            this.emc.bw(f2);
            return this;
        }

        public C0102emc dg(float f2) {
            this.emc.dg(f2);
            return this;
        }

        public C0102emc emc(String str) {
            this.emc.ypw(str);
            return this;
        }

        public C0102emc msw(float f2) {
            this.emc.msw(f2);
            return this;
        }

        public C0102emc ru(float f2) {
            this.emc.ru(f2);
            return this;
        }

        public C0102emc uym(float f2) {
            this.emc.uym(f2);
            return this;
        }

        public C0102emc xq(float f2) {
            this.emc.xq(f2);
            return this;
        }

        public C0102emc ycc(float f2) {
            this.emc.ycc(f2);
            return this;
        }

        public C0102emc ypw(float f2) {
            this.emc.ypw(f2);
            return this;
        }

        public C0102emc zz(float f2) {
            this.emc.zz(f2);
            return this;
        }

        public C0102emc emc(int i) {
            this.emc.ypw(i);
            return this;
        }

        public C0102emc xq(int i) {
            this.emc.ycc(i);
            return this;
        }

        public C0102emc ypw(int i) {
            this.emc.bw(i);
            return this;
        }

        public C0102emc emc(float f2) {
            this.emc.emc(f2);
            return this;
        }

        public C0102emc ypw(String str) {
            this.emc.xq(str);
            return this;
        }

        public emc emc() {
            return this.emc;
        }
    }

    public String aa() {
        return this.cf;
    }

    public float bw() {
        return this.xq;
    }

    public BigDecimal cf() {
        return new BigDecimal(this.sz).setScale(3, RoundingMode.HALF_UP);
    }

    public int dg() {
        return this.ypw;
    }

    public int emc() {
        return this.sba;
    }

    public float gbl() {
        return this.zz;
    }

    public int msw() {
        return this.ycc;
    }

    public float qh() {
        return this.sup;
    }

    public float ru() {
        return this.msw;
    }

    public float sba() {
        return this.vk;
    }

    public int sup() {
        return this.ru;
    }

    public float sz() {
        return this.gbl;
    }

    public float uym() {
        return this.bw;
    }

    public int vk() {
        return this.qh;
    }

    public String xq() {
        return this.emc;
    }

    public float ycc() {
        return this.dg;
    }

    public String ypw() {
        return this.yzg;
    }

    public int yzg() {
        return this.aa;
    }

    public float zz() {
        return this.uym;
    }

    public void bw(float f2) {
        this.msw = f2;
    }

    public void dg(float f2) {
        this.uym = f2;
    }

    public void emc(int i) {
        this.sba = i;
    }

    public void msw(float f2) {
        this.sup = f2;
    }

    public void ru(float f2) {
        this.vk = f2;
    }

    public void uym(float f2) {
        this.gbl = f2;
    }

    public void xq(float f2) {
        this.bw = f2;
    }

    public void ycc(float f2) {
        this.zz = f2;
    }

    public void ypw(String str) {
        this.emc = str;
    }

    public void zz(float f2) {
        this.sz = f2;
    }

    public void bw(int i) {
        this.qh = i;
    }

    public void dg(int i) {
        this.ru = i;
    }

    public void emc(String str) {
        this.yzg = str;
    }

    public void xq(int i) {
        this.ycc = i;
    }

    public void ycc(int i) {
        this.aa = i;
    }

    public void ypw(int i) {
        this.ypw = i;
    }

    public void emc(float f2) {
        this.xq = f2;
    }

    public void xq(String str) {
        this.cf = str;
    }

    public void ypw(float f2) {
        this.dg = f2;
    }
}
