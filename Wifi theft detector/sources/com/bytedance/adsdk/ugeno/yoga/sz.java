package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum sz {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int dg;

    sz(int i10) {
        this.dg = i10;
    }

    public int emc() {
        return this.dg;
    }

    public static sz emc(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static sz emc(String str) {
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
