package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum mwh {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    final int yu;

    mwh(int i4) {
        this.yu = i4;
    }

    public static mwh ouw(int i4) {
        if (i4 == 0) {
            return NO_WRAP;
        }
        if (i4 == 1) {
            return WRAP;
        }
        if (i4 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }

    public static mwh ouw(String str) {
        str.getClass();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
