package com.bytedance.sdk.component.ycc.emc.dg.ypw;

/* loaded from: classes.dex */
public class emc {
    private int emc;
    private int ypw;

    public emc(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.emc = i10;
        this.ypw = i11;
    }

    public static emc bw() {
        return new emc(3, 100, 172800000L);
    }

    public static emc dg() {
        return new emc(1, 100, -1L);
    }

    public static emc xq() {
        return new emc(1, 100, 172800000L);
    }

    public int emc() {
        return this.emc;
    }

    public int ypw() {
        return this.ypw;
    }
}
