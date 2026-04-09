package com.bytedance.sdk.component.ra.lh;

import android.util.Log;
import com.bytedance.sdk.component.utils.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private static boolean ouw = false;
    private static int vt = 4;

    public static boolean ouw() {
        return ouw;
    }

    public static void ouw(String str, String str2) {
        if (ouw && str2 != null && vt <= 4) {
            Log.i(ko.fkw(str), str2);
        }
    }

    public static void ouw(String str) {
        if (!ouw || vt > 2) {
            return;
        }
        Log.v(ko.fkw("NetLog"), str);
    }
}
