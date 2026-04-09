package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sf;

/* loaded from: classes.dex */
public class ypw {
    public static void emc(final rie rieVar, final boolean z6, final boolean z7) {
        com.bytedance.sdk.openadsdk.core.qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                rie rieVar2 = rieVar;
                if (rieVar2 == null || rieVar2.wh()) {
                    return;
                }
                try {
                    Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
                    AdSlot adSlotVaf = rieVar.vaf();
                    if (adSlotVaf != null) {
                        boolean zYpw = com.bytedance.sdk.openadsdk.utils.ypw.ypw();
                        if (zYpw) {
                            if (z7) {
                                aa.emc(contextEmc).emc(adSlotVaf.getCodeId(), rieVar);
                            } else {
                                uym.emc(contextEmc).emc(adSlotVaf.getCodeId(), rieVar);
                            }
                        } else if (z7) {
                            vk.emc(contextEmc).emc(adSlotVaf.getCodeId(), rieVar);
                        } else {
                            ycc.emc(contextEmc).emc(adSlotVaf.getCodeId(), rieVar);
                        }
                        if (z6) {
                            if (zYpw) {
                                if (z7) {
                                    aa.emc(contextEmc).emc(adSlotVaf);
                                    return;
                                } else {
                                    uym.emc(contextEmc).emc(adSlotVaf);
                                    return;
                                }
                            }
                            if (z7) {
                                vk.emc(contextEmc).emc(adSlotVaf);
                            } else {
                                ycc.emc(contextEmc).emc(adSlotVaf);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean emc(final com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        com.bytedance.sdk.openadsdk.activity.ypw ypwVarWo;
        int iLt = 0;
        if (emcVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
        if (mswVar == null || mswVar.wo() == null) {
            ypwVarWo = null;
        } else {
            ypwVarWo = emcVar.pe.wo();
            if (ypwVarWo != null) {
                iLt = ypwVarWo.lt();
            }
        }
        boolean zEmc = iyl.emc(emcVar.mxo, emcVar.ypw, emcVar.bw, emcVar.dg ? 7 : 5, iLt);
        if (zEmc) {
            if (emcVar.ypw != null) {
                sf.emc().emc(emcVar.ypw, new sf.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ypw.2
                    @Override // com.bytedance.sdk.openadsdk.core.sf.ypw
                    public void emc() {
                        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar;
                        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = emcVar;
                        if (emcVar2 == null || (ypwVar = emcVar2.tp) == null) {
                            return;
                        }
                        ypwVar.hj();
                    }
                });
            }
            if (ypwVarWo != null && ypwVarWo.ee()) {
                ypwVarWo.sf();
            }
        }
        return zEmc;
    }
}
