package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    private static Handler ouw;
    private static HandlerThread vt;

    public static Handler ouw() {
        try {
            HandlerThread handlerThread = vt;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (ouw.class) {
                    try {
                        HandlerThread handlerThread2 = vt;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            vt = pno.ouw("csj_ev", 0);
                            ouw = new Handler(vt.getLooper());
                        }
                    } finally {
                    }
                }
            } else if (ouw == null) {
                synchronized (ouw.class) {
                    try {
                        if (ouw == null) {
                            ouw = new Handler(vt.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return ouw;
    }
}
