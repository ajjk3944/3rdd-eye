package com.bytedance.sdk.openadsdk.core.ypw;

import A.f;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.sba.dg;
import com.bytedance.sdk.openadsdk.sba.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public class emc implements sra.emc {
    private final sra.emc emc;
    private final boolean xq;
    private final AdSlot ypw;

    public emc(sra.emc emcVar, AdSlot adSlot, boolean z6) {
        this.emc = emcVar;
        this.ypw = adSlot;
        this.xq = z6;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra.emc
    public void emc(final int i, final String str) {
        AdSlot adSlot;
        if (this.emc != null) {
            if (iyl.ycc() || !((adSlot = this.ypw) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.sra.emc.emc("getads_callback_async", 0) != 1)) {
                this.emc.emc(i, str);
            } else {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        emc.this.emc.emc(i, str);
                    }
                });
            }
            if (!this.xq || this.ypw == null) {
                return;
            }
            xq.xq(new dg() { // from class: com.bytedance.sdk.openadsdk.core.ypw.emc.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("load_ad");
                    emcVarE.xq(emc.this.ypw.getCodeId());
                    emcVarE.dg(tp.xq(emc.this.ypw.getDurationSlotType()));
                    emcVarE.emc(BuildConfig.VERSION_NAME);
                    emcVarE.uym(tp.emc(emc.this.ypw).toString());
                    return emcVarE;
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
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("load_ad");
                    emcVarE.xq(emc.this.ypw.getCodeId());
                    emcVarE.dg(tp.xq(emc.this.ypw.getDurationSlotType()));
                    emcVarE.emc(BuildConfig.VERSION_NAME);
                    emcVarE.uym(tp.emc(emc.this.ypw).toString());
                    return emcVarE;
                }
            });
        }
    }
}
