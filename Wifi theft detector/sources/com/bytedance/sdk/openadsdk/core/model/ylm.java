package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes.dex */
public class ylm {
    private long emc = 10000;
    private long ypw = 10000;
    private long xq = 10;
    private long dg = 20;
    private String bw = "";

    public String bw() {
        return this.bw;
    }

    public long dg() {
        return this.dg;
    }

    public long emc() {
        return this.emc;
    }

    public long xq() {
        return this.xq;
    }

    public long ypw() {
        return this.ypw;
    }

    public void dg(long j10) {
        if (j10 < 0) {
            this.dg = 20L;
        } else {
            this.dg = j10;
        }
    }

    public void emc(long j10) {
        if (j10 <= 0) {
            this.emc = 10L;
        } else {
            this.emc = j10;
        }
    }

    public void xq(long j10) {
        if (j10 <= 0) {
            this.xq = 10L;
        } else {
            this.xq = j10;
        }
    }

    public void ypw(long j10) {
        if (j10 < 0) {
            this.ypw = 20L;
        } else {
            this.ypw = j10;
        }
    }

    public void emc(String str) {
        this.bw = str;
    }
}
