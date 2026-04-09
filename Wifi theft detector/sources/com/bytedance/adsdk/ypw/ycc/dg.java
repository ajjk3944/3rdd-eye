package com.bytedance.adsdk.ypw.ycc;

/* loaded from: classes.dex */
public class dg {
    private float emc;
    private int ypw;

    public void emc(float f10) {
        float f11 = this.emc + f10;
        this.emc = f11;
        int i10 = this.ypw + 1;
        this.ypw = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.emc = f11 / 2.0f;
            this.ypw = i10 / 2;
        }
    }
}
