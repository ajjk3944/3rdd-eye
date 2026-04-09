package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum le {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    final int ra;

    le(int i4) {
        this.ra = i4;
    }

    public static le ouw(int i4) {
        if (i4 == 0) {
            return FLEX_START;
        }
        if (i4 == 1) {
            return CENTER;
        }
        if (i4 == 2) {
            return FLEX_END;
        }
        if (i4 == 3) {
            return SPACE_BETWEEN;
        }
        if (i4 == 4) {
            return SPACE_AROUND;
        }
        if (i4 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }

    public static le ouw(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
