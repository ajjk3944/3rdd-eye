package com.bytedance.sdk.component.msw.xq;

/* loaded from: classes.dex */
public abstract class ypw implements Comparable<ypw>, Runnable {
    private long bw;
    private long dg;
    private int emc;
    private Runnable xq;
    private long ycc;
    private String ypw;

    public ypw(String str) {
        this.emc = 5;
        this.ypw = str;
    }

    public long bw() {
        return this.ycc;
    }

    public long dg() {
        return this.bw;
    }

    public void emc(int i10) {
        this.emc = i10;
    }

    public long xq() {
        return this.dg;
    }

    public Runnable ycc() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }

    public int emc() {
        return this.emc;
    }

    public void xq(long j10) {
        this.ycc = j10;
    }

    public void ypw(long j10) {
        this.bw = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(ypw ypwVar) {
        if (emc() < ypwVar.emc()) {
            return 1;
        }
        return emc() >= ypwVar.emc() ? -1 : 0;
    }

    public ypw(int i10, String str) {
        this.emc = i10;
        this.ypw = str;
    }

    public void emc(long j10) {
        this.dg = j10;
    }

    public ypw(String str, Runnable runnable) {
        this.emc = 5;
        this.ypw = str;
        this.xq = runnable;
    }
}
