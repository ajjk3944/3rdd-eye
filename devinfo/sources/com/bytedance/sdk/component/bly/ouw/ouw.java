package com.bytedance.sdk.component.bly.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    private static volatile ouw vt;
    public volatile vt ouw;

    private ouw() {
    }

    public static ouw ouw() {
        if (vt == null) {
            synchronized (ouw.class) {
                try {
                    if (vt == null) {
                        vt = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }
}
