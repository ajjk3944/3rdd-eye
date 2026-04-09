package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum msw {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int dg;

    msw(int i) {
        this.dg = i;
    }

    public static msw emc(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }
}
