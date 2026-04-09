package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import com.bytedance.sdk.component.le.ouw.pno;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    public static String ouw = "com.bytedance.openadsdk";
    public static String vt;

    static {
        vt = h.w(new StringBuilder("content://"), ouw, ".TTMultiProvider");
        if (pno.vt().ouw != null) {
            ouw = pno.vt().ouw.getPackageName();
            vt = h.w(new StringBuilder("content://"), ouw, ".TTMultiProvider");
        }
    }
}
