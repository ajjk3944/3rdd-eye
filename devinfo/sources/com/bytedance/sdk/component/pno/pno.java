package com.bytedance.sdk.component.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class pno implements Comparable<pno>, Runnable {
    private int ouw;
    private String vt;

    public pno(String str, int i4) {
        this.ouw = 0;
        this.ouw = i4 == 0 ? 5 : i4;
        this.vt = str;
    }

    public String getName() {
        return this.vt;
    }

    public int getPriority() {
        return this.ouw;
    }

    public void setPriority(int i4) {
        this.ouw = i4;
    }

    @Override // java.lang.Comparable
    public int compareTo(pno pnoVar) {
        if (getPriority() < pnoVar.getPriority()) {
            return 1;
        }
        return getPriority() >= pnoVar.getPriority() ? -1 : 0;
    }

    public pno(String str) {
        this.ouw = 5;
        this.vt = str;
    }
}
