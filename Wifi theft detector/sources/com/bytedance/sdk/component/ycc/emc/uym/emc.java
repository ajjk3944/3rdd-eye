package com.bytedance.sdk.component.ycc.emc.uym;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.ycc.emc.bw;
import com.bytedance.sdk.component.ycc.emc.msw;

/* loaded from: classes.dex */
public class emc {
    private static volatile HandlerThread emc = null;
    private static int xq = 3000;
    private static volatile Handler ypw;

    static {
        xq();
    }

    public static Handler emc() {
        if (emc == null || !emc.isAlive()) {
            synchronized (emc.class) {
                try {
                    if (emc == null || !emc.isAlive()) {
                        xq();
                        ypw = new Handler(emc.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (ypw == null) {
            synchronized (emc.class) {
                try {
                    if (ypw == null) {
                        ypw = new Handler(emc.getLooper());
                    }
                } finally {
                }
            }
        }
        return ypw;
    }

    private static void xq() {
        HandlerThread handlerThreadEmc;
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk != null && (handlerThreadEmc = bwVarVk.emc("csj_ad_log", 10)) != null) {
            emc = handlerThreadEmc;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        emc = handlerThread;
        handlerThread.start();
    }

    public static int ypw() {
        if (xq <= 0) {
            xq = 3000;
        }
        return xq;
    }
}
