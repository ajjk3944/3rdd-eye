package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.zih;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public static String ouw = "com.bytedance.openadsdk";
    public static String vt;

    static {
        vt = h.w(new StringBuilder("content://"), ouw, ".TTMultiProvider");
        if (zih.ouw() != null) {
            ouw = zih.ouw().getPackageName();
            vt = h.w(new StringBuilder("content://"), ouw, ".TTMultiProvider");
        }
    }
}
