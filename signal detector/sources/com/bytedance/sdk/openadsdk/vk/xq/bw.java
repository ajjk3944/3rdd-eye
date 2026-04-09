package com.bytedance.sdk.openadsdk.vk.xq;

/* loaded from: classes.dex */
class bw implements xq {
    private static volatile bw emc;

    private bw() {
    }

    @Override // com.bytedance.sdk.openadsdk.vk.xq.xq
    public void emc(com.bytedance.sdk.openadsdk.vk.ypw ypwVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.vk.xq.xq
    public void emc(com.bytedance.sdk.openadsdk.vk.ypw ypwVar, boolean z6) {
    }

    public static bw emc() {
        if (emc == null) {
            synchronized (bw.class) {
                try {
                    if (emc == null) {
                        emc = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
