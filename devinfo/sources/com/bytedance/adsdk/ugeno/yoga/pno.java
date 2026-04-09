package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum pno {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int yu;

    pno(int i4) {
        this.yu = i4;
    }

    public static pno ouw(int i4) {
        if (i4 == 0) {
            return UNDEFINED;
        }
        if (i4 == 1) {
            return EXACTLY;
        }
        if (i4 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }
}
