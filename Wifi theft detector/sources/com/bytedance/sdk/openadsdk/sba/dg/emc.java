package com.bytedance.sdk.openadsdk.sba.dg;

import com.vungle.ads.internal.signals.SignalManager;

/* loaded from: classes.dex */
public class emc {
    public static long emc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }

    public static boolean emc(long j10) {
        return j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) == emc();
    }
}
