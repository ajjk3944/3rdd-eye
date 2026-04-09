package com.bytedance.adsdk.ypw.ycc;

/* loaded from: classes.dex */
public class dg {
    private float emc;
    private int ypw;

    public void emc(float f2) {
        float f5 = this.emc + f2;
        this.emc = f5;
        int i = this.ypw + 1;
        this.ypw = i;
        if (i == Integer.MAX_VALUE) {
            this.emc = f5 / 2.0f;
            this.ypw = i / 2;
        }
    }
}
