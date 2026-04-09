package com.bytedance.sdk.openadsdk.rn.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw implements lh {
    private static volatile fkw ouw;

    private fkw() {
    }

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.rn.vt vtVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.rn.vt vtVar, boolean z3) {
    }

    public static fkw ouw() {
        if (ouw == null) {
            synchronized (fkw.class) {
                try {
                    if (ouw == null) {
                        ouw = new fkw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }
}
