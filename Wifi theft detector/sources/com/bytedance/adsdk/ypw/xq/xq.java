package com.bytedance.adsdk.ypw.xq;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public class xq {
    private Typeface bw;
    private final float dg;
    private final String emc;
    private final String xq;
    private final String ypw;

    public xq(String str, String str2, String str3, float f10) {
        this.emc = str;
        this.ypw = str2;
        this.xq = str3;
        this.dg = f10;
    }

    public Typeface dg() {
        return this.bw;
    }

    public String emc() {
        return this.emc;
    }

    public String xq() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }

    public void emc(Typeface typeface) {
        this.bw = typeface;
    }
}
