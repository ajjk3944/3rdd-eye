package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum ryl {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    public final int yu;

    ryl(int i4) {
        this.yu = i4;
    }

    public static ryl ouw(int i4) {
        if (i4 == 0) {
            return STATIC;
        }
        if (i4 == 1) {
            return RELATIVE;
        }
        if (i4 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }

    public static ryl ouw(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
