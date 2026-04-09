package com.bytedance.adsdk.vt.lh;

import com.bytedance.adsdk.vt.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    private static final fkw ouw = new fkw();
    private final ko<String, com.bytedance.adsdk.vt.ra> vt = new ko<>();

    public static fkw ouw() {
        return ouw;
    }

    public final com.bytedance.adsdk.vt.ra ouw(String str) {
        if (str == null) {
            return null;
        }
        return this.vt.ouw((ko<String, com.bytedance.adsdk.vt.ra>) str);
    }

    public final void ouw(String str, com.bytedance.adsdk.vt.ra raVar) {
        if (str == null) {
            return;
        }
        this.vt.ouw(str, raVar);
    }
}
