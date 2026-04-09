package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public class msw {
    private static HandlerThread emc;

    public static void emc(HandlerThread handlerThread) {
        emc = handlerThread;
    }

    public static HandlerThread emc(String str) {
        return emc(str, 0);
    }

    public static HandlerThread emc(String str, int i) {
        if (com.bytedance.sdk.component.msw.zz.dg) {
            return emc;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.msw.1
                boolean emc = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.emc) {
                        return;
                    }
                    this.emc = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            ul.emc("HandlerThreadUtils", "new handlerThread error", th);
            return emc;
        }
    }
}
