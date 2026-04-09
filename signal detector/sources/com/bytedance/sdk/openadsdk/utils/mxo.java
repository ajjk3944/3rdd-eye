package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class mxo {
    public long emc;
    private long ypw;

    private mxo(boolean z6) {
        if (z6) {
            bw();
        }
    }

    public static mxo xq() {
        return new mxo(false);
    }

    public static mxo ypw() {
        return new mxo(true);
    }

    public void bw() {
        this.emc = System.currentTimeMillis();
        this.ypw = SystemClock.elapsedRealtime();
    }

    public long dg() {
        return SystemClock.elapsedRealtime() - this.ypw;
    }

    public long emc() {
        return this.ypw;
    }

    public String toString() {
        return String.valueOf(this.emc);
    }

    public boolean ycc() {
        return this.ypw > 0;
    }

    public long emc(mxo mxoVar) {
        return Math.abs(mxoVar.ypw - this.ypw);
    }
}
