package com.bytedance.sdk.openadsdk.sba.dg;

/* loaded from: classes.dex */
public class emc {
    public static long emc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean emc(long j6) {
        return j6 - (j6 % 86400000) == emc();
    }
}
