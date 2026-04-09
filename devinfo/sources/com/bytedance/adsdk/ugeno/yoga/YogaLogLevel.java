package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@com.bytedance.adsdk.ugeno.yoga.ouw.ouw
/* loaded from: classes.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int ra;

    YogaLogLevel(int i4) {
        this.ra = i4;
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    public static YogaLogLevel fromInt(int i4) {
        if (i4 == 0) {
            return ERROR;
        }
        if (i4 == 1) {
            return WARN;
        }
        if (i4 == 2) {
            return INFO;
        }
        if (i4 == 3) {
            return DEBUG;
        }
        if (i4 == 4) {
            return VERBOSE;
        }
        if (i4 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i4)));
    }
}
