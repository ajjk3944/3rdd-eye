package com.bytedance.sdk.component.xq.emc;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class emc {
    long bw;
    long dg;
    long emc = SystemClock.elapsedRealtime();
    long msw;
    long uym;
    long xq;
    long ycc;
    long ypw;

    public void bw() {
        this.ycc = SystemClock.elapsedRealtime();
    }

    public void cf() {
        this.ypw = SystemClock.elapsedRealtime();
    }

    public long dg() {
        return this.emc;
    }

    public void emc() {
        this.xq = SystemClock.elapsedRealtime();
    }

    public void gbl() {
        this.uym = SystemClock.elapsedRealtime();
    }

    public long msw() {
        return this.dg;
    }

    public long qh() {
        return this.ypw;
    }

    public long ru() {
        return this.uym;
    }

    public long sup() {
        return this.msw;
    }

    public void sz() {
        this.msw = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.emc + ", asyncCallExecTs=" + this.ypw + ", requestStartExecTs=" + this.xq + ", requestConnectStartTs=" + this.dg + ", requestConnectFinishTs=" + this.bw + ", reqCallServerStartTs=" + this.uym + ", reqCallServerFinishTs=" + this.msw + '}';
    }

    public long uym() {
        return this.xq;
    }

    public void xq() {
        this.bw = SystemClock.elapsedRealtime();
    }

    public long ycc() {
        return this.ycc;
    }

    public void ypw() {
        this.dg = SystemClock.elapsedRealtime();
    }

    public long zz() {
        return this.bw;
    }
}
