package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum qh {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int dg;

    qh(int i10) {
        this.dg = i10;
    }

    public int emc() {
        return this.dg;
    }

    public static qh emc(int i10) {
        if (i10 == 0) {
            return NO_WRAP;
        }
        if (i10 == 1) {
            return WRAP;
        }
        if (i10 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static qh emc(String str) {
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
