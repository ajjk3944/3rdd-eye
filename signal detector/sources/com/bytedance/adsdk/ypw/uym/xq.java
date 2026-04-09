package com.bytedance.adsdk.ypw.uym;

/* loaded from: classes.dex */
public class xq {
    private float emc;
    private float ypw;

    public xq(float f2, float f5) {
        this.emc = f2;
        this.ypw = f5;
    }

    public float emc() {
        return this.emc;
    }

    public String toString() {
        return emc() + "x" + ypw();
    }

    public float ypw() {
        return this.ypw;
    }

    public void emc(float f2, float f5) {
        this.emc = f2;
        this.ypw = f5;
    }

    public boolean ypw(float f2, float f5) {
        return this.emc == f2 && this.ypw == f5;
    }

    public xq() {
        this(1.0f, 1.0f);
    }
}
