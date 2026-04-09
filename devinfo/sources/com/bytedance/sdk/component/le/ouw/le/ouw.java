package com.bytedance.sdk.component.le.ouw.le;

import com.bytedance.sdk.component.le.ouw.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static volatile vt ouw;

    public static vt ouw() {
        if (ouw == null) {
            synchronized (vt.class) {
                try {
                    if (ouw == null) {
                        ouw = new lh(pno.vt().ouw, new le(pno.vt().ouw));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }
}
