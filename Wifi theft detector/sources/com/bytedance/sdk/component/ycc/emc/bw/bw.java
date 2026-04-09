package com.bytedance.sdk.component.ycc.emc.bw;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class bw implements Comparable<bw>, Runnable {
    private String xq;
    private int emc = 5;
    private String ypw = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public bw(String str) {
        this.xq = str;
    }

    public void emc(int i10) {
        this.emc = i10;
    }

    public int emc() {
        return this.emc;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(bw bwVar) {
        if (emc() < bwVar.emc()) {
            return 1;
        }
        return emc() >= bwVar.emc() ? -1 : 0;
    }
}
