package com.bytedance.sdk.component.adexpress.ouw.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    static com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw;

    public static synchronized com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw() {
        return ouw;
    }

    public static void vt() {
        lh.vt(yu.le(), ouw(), "temp_pkg_info.json");
        ouw = null;
    }

    public static synchronized void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar) {
        if (ouwVar != null) {
            if (ouwVar.vt()) {
                ouw = ouwVar;
            }
        }
    }
}
