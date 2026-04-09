package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum fkw {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    final int fkw;

    fkw(int i4) {
        this.fkw = i4;
    }

    public static fkw ouw(int i4) {
        if (i4 == 0) {
            return COLUMN;
        }
        if (i4 == 1) {
            return COLUMN_REVERSE;
        }
        if (i4 == 2) {
            return ROW;
        }
        if (i4 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }

    public static fkw ouw(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
