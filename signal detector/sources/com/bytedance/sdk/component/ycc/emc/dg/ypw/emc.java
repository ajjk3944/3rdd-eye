package com.bytedance.sdk.component.ycc.emc.dg.ypw;

/* loaded from: classes.dex */
public class emc {
    private int emc;
    private int ypw;

    public emc(int i, int i3, long j6) {
        if (i3 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.emc = i;
        this.ypw = i3;
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
