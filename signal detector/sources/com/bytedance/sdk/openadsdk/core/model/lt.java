package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.mxo;

/* loaded from: classes.dex */
public class lt {
    private long bw;
    public boolean emc;
    private int gbl;
    private long msw;
    private long ru;
    private long sup;
    private int sz;
    private long uym;
    private long ycc;
    public long ypw;
    private long zz;
    private mxo xq = mxo.xq();
    private mxo dg = mxo.xq();

    public long bw() {
        return this.msw;
    }

    public long dg() {
        return this.uym;
    }

    public void emc(mxo mxoVar, mxo mxoVar2, int i, mxo mxoVar3) {
        this.bw = mxoVar.emc(this.xq);
        this.ycc = mxoVar2.emc(mxoVar);
        this.uym = i;
        this.msw = mxoVar3.emc(mxoVar2);
    }

    public int msw() {
        return this.gbl;
    }

    public synchronized int ru() {
        return this.sz;
    }

    public long uym() {
        return this.ru;
    }

    public long xq() {
        return this.ycc;
    }

    public long ycc() {
        return this.zz;
    }

    public void ypw(mxo mxoVar) {
        this.dg = mxoVar;
        this.zz = mxoVar.emc(this.xq);
    }

    public long zz() {
        return this.sup;
    }

    public long ypw() {
        return this.bw;
    }

    public void ypw(long j6) {
        this.sup = j6;
    }

    public void emc(mxo mxoVar) {
        this.xq = mxoVar;
    }

    public synchronized void ypw(int i) {
        this.sz = i;
    }

    public mxo emc() {
        return this.xq;
    }

    public void emc(long j6) {
        this.ru = j6;
    }

    public void emc(int i) {
        this.gbl = i;
    }
}
