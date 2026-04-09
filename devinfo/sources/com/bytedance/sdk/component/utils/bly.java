package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly {
    private static volatile Handler ouw;

    public static Handler ouw() {
        return com.bytedance.sdk.component.pno.ouw.ouw.ouw().vt();
    }

    public static Handler vt() {
        if (ouw == null) {
            synchronized (bly.class) {
                try {
                    if (ouw == null) {
                        ouw = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }
}
