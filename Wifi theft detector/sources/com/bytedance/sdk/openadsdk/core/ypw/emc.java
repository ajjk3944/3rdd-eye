package com.bytedance.sdk.openadsdk.core.ypw;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.sba.dg;
import com.bytedance.sdk.openadsdk.sba.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.vungle.ads.internal.b;

/* loaded from: classes.dex */
public class emc implements sra.emc {
    private final sra.emc emc;
    private final boolean xq;
    private final AdSlot ypw;

    public emc(sra.emc emcVar, AdSlot adSlot, boolean z10) {
        this.emc = emcVar;
        this.ypw = adSlot;
        this.xq = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra.emc
    public void emc(final int i10, final String str) {
        AdSlot adSlot;
        if (this.emc != null) {
            if (iyl.ycc() || !((adSlot = this.ypw) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.sra.emc.emc("getads_callback_async", 0) != 1)) {
                this.emc.emc(i10, str);
            } else {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        emc.this.emc.emc(i10, str);
                    }
                });
            }
            if (!this.xq || this.ypw == null) {
                return;
            }
            xq.xq(new dg() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    emcVar.ypw(b.LOAD_AD);
                    emcVar.xq(emc.this.ypw.getCodeId());
                    emcVar.dg(tp.xq(emc.this.ypw.getDurationSlotType()));
                    emcVar.emc(BuildConfig.VERSION_NAME);
                    emcVar.uym(tp.emc(emc.this.ypw).toString());
                    return emcVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra.emc
    public void emc(final com.bytedance.sdk.openadsdk.core.model.emc emcVar, final com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
        AdSlot adSlot;
        if (this.emc != null) {
            if (!iyl.ycc() && ((adSlot = this.ypw) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.sra.emc.emc("getads_callback_async", 0) != 1)) {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        emc.this.emc.emc(emcVar, xqVar);
                    }
                });
            } else {
                this.emc.emc(emcVar, xqVar);
            }
            if (!this.xq || this.ypw == null) {
                return;
            }
            xq.ypw(new dg() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.4
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar2 = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    emcVar2.ypw(b.LOAD_AD);
                    emcVar2.xq(emc.this.ypw.getCodeId());
                    emcVar2.dg(tp.xq(emc.this.ypw.getDurationSlotType()));
                    emcVar2.emc(BuildConfig.VERSION_NAME);
                    emcVar2.uym(tp.emc(emc.this.ypw).toString());
                    return emcVar2;
                }
            });
        }
    }
}
