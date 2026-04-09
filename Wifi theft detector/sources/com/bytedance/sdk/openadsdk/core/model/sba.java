package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class sba {
    private boolean bw;
    private double dg;
    private String emc;
    private int xq;
    private String ycc;
    private int ypw;

    public boolean bw() {
        return !TextUtils.isEmpty(this.emc) && this.ypw > 0 && this.xq > 0;
    }

    public double dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public String uym() {
        return this.ycc;
    }

    public int xq() {
        return this.xq;
    }

    public boolean ycc() {
        return this.bw;
    }

    public int ypw() {
        return this.ypw;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void ypw(int i10) {
        this.xq = i10;
    }

    public void emc(int i10) {
        this.ypw = i10;
    }

    public void ypw(String str) {
        this.ycc = str;
    }

    public void emc(boolean z10) {
        this.bw = z10;
    }
}
