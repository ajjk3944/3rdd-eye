package com.bytedance.adsdk.ypw.uym;

/* loaded from: classes.dex */
public class xq {
    private float emc;
    private float ypw;

    public xq(float f10, float f11) {
        this.emc = f10;
        this.ypw = f11;
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

    public void emc(float f10, float f11) {
        this.emc = f10;
        this.ypw = f11;
    }

    public boolean ypw(float f10, float f11) {
        return this.emc == f10 && this.ypw == f11;
    }

    public xq() {
        this(1.0f, 1.0f);
    }
}
