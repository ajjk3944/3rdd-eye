package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class zz {
    private static volatile Handler emc;

    public static Handler emc() {
        return com.bytedance.sdk.component.msw.emc.emc.emc().ypw();
    }

    public static Handler ypw() {
        if (emc == null) {
            synchronized (zz.class) {
                try {
                    if (emc == null) {
                        emc = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
