package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum qh {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int dg;

    qh(int i) {
        this.dg = i;
    }

    public int emc() {
        return this.dg;
    }

    public static qh emc(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
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
