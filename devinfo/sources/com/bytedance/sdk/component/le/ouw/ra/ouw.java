package com.bytedance.sdk.component.le.ouw.ra;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.le.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static int f7556lh = 3000;
    private static volatile HandlerThread ouw;
    private static volatile Handler vt;

    static {
        lh();
    }

    private static void lh() {
        HandlerThread handlerThreadYu;
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && (handlerThreadYu = fkwVar.yu("csj_ad_log")) != null) {
            ouw = handlerThreadYu;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        ouw = handlerThread;
        handlerThread.start();
    }

    public static Handler ouw() {
        if (ouw == null || !ouw.isAlive()) {
            synchronized (ouw.class) {
                try {
                    if (ouw == null || !ouw.isAlive()) {
                        lh();
                        vt = new Handler(ouw.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (vt == null) {
            synchronized (ouw.class) {
                try {
                    if (vt == null) {
                        vt = new Handler(ouw.getLooper());
                    }
                } finally {
                }
            }
        }
        return vt;
    }

    public static int vt() {
        if (f7556lh <= 0) {
            f7556lh = 3000;
        }
        return f7556lh;
    }
}
