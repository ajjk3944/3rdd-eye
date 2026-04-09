package com.bytedance.sdk.openadsdk.ee.emc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.msw;

/* loaded from: classes.dex */
public class emc {
    private static Handler emc;
    private static HandlerThread ypw;

    public static Handler emc() {
        try {
            HandlerThread handlerThread = ypw;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (emc.class) {
                    try {
                        HandlerThread handlerThread2 = ypw;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            ypw = msw.emc("csj_ev");
                            emc = new Handler(ypw.getLooper());
                        }
                    } finally {
                    }
                }
            } else if (emc == null) {
                synchronized (emc.class) {
                    try {
                        if (emc == null) {
                            emc = new Handler(ypw.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return emc;
    }
}
