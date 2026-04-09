package com.bytedance.sdk.openadsdk.dg.emc;

import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
class zz implements com.bytedance.sdk.openadsdk.vk.xq.xq {
    public static final zz emc = new zz();

    private zz() {
    }

    @Override // com.bytedance.sdk.openadsdk.vk.xq.xq
    public void emc(com.bytedance.sdk.openadsdk.vk.ypw ypwVar) {
        emc(ypwVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.vk.xq.xq
    public void emc(final com.bytedance.sdk.openadsdk.vk.ypw ypwVar, final boolean z6) {
        emc(new com.bytedance.sdk.component.msw.msw("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.dg.emc.zz.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.vk.emc.xq xqVarEmc = ypwVar.emc();
                    if (xqVarEmc == null) {
                        return;
                    }
                    com.bytedance.sdk.component.ycc.emc.dg.emc.emc emcVar = new com.bytedance.sdk.component.ycc.emc.dg.emc.emc(db.emc(), xqVarEmc.emc());
                    emcVar.xq((byte) 0);
                    emcVar.ypw(z6 ? (byte) 2 : (byte) 3);
                    emcVar.emc((byte) 1);
                    if (com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
                        ypw.emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq());
                    }
                    com.bytedance.sdk.component.ycc.emc.ypw.emc(emcVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void emc(com.bytedance.sdk.component.msw.msw mswVar) {
        if (mswVar == null) {
            return;
        }
        if (!iyl.uym()) {
            iyl.ypw(mswVar, 5);
        } else {
            mswVar.run();
        }
    }
}
