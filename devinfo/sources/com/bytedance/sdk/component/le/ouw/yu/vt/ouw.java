package com.bytedance.sdk.component.le.ouw.yu.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public int ouw;
    public int vt;

    public ouw(int i4) {
        if (100 < i4) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.ouw = i4;
        this.vt = 100;
    }

    public static ouw ouw() {
        return new ouw(1);
    }
}
