package com.bytedance.sdk.openadsdk.component.ypw;

import A2.C0115c;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.uym;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sb;
import com.bytedance.sdk.openadsdk.core.model.xq;
import com.bytedance.sdk.openadsdk.core.msw;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.ul;
import com.bytedance.sdk.openadsdk.core.ylm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.utils.ypw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc emc;
    private final sra ypw = aa.xq();

    private emc() {
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void emc(final Context context, final AdSlot adSlot, final uym uymVar) {
        final mxo mxoVarYpw = mxo.ypw();
        if (ypw.emc()) {
            this.ypw.emc(adSlot, new sb(), 5, (ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.ypw.emc.1
                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i, String str) {
                    uymVar.onError(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, xq xqVar) {
                    emc.this.emc(emcVar, xqVar, context, adSlot, uymVar, mxoVarYpw);
                }
            });
        } else {
            this.ypw.emc(adSlot, new sb(), 5, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.ypw.emc.2
                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i, String str) {
                    uymVar.onError(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, xq xqVar) {
                    emc.this.emc(emcVar, xqVar, context, adSlot, uymVar, mxoVarYpw);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, xq xqVar, Context context, AdSlot adSlot, uym uymVar, mxo mxoVar) {
        if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
            List<rie> listDg = emcVar.dg();
            ArrayList arrayList = new ArrayList(listDg.size());
            for (rie rieVar : listDg) {
                if (rie.bw(rieVar) || (rieVar != null && rieVar.uw())) {
                    PAGNativeAd pAGNativeAdEmc = emc(context, rieVar, adSlot);
                    if (uymVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdEmc);
                    }
                }
                if (rie.bw(rieVar) && rieVar.iat() != null && rieVar.iat().f6586g != null) {
                    if (aa.dg().bw(String.valueOf(rieVar.tx())) && aa.dg().fu()) {
                        if (rieVar.iat() != null) {
                            rieVar.iat().f6593o = 1;
                        }
                        if (rieVar.rd() != null) {
                            rieVar.rd().f6593o = 1;
                        }
                        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(rieVar.zxw())).e(), rieVar);
                        ypwVarEmc.emc("material_meta", rieVar);
                        ypwVarEmc.emc("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, null);
                    }
                    IPBroadcastReceiver.ypw(context, rieVar);
                }
            }
            boolean z6 = uymVar instanceof PAGNativeAdLoadListener;
            if (z6 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(listDg.get(0), mxoVar.dg());
                }
                if (z6) {
                    ((PAGNativeAdLoadListener) uymVar).onAdLoaded(arrayList.get(0));
                }
                if (xqVar.bw() == null || xqVar.bw().isEmpty()) {
                    return;
                }
                xqVar.xq(4);
                xq.emc(xqVar);
                return;
            }
            uymVar.onError(-4, msw.emc(-4));
            xqVar.emc(-4);
            xqVar.xq(4);
            xq.emc(xqVar);
            return;
        }
        uymVar.onError(-3, msw.emc(-3));
        xqVar.emc(-3);
        xqVar.xq(4);
        xq.emc(xqVar);
    }

    private PAGNativeAd emc(Context context, rie rieVar, AdSlot adSlot) {
        if (rieVar.yid() != 2) {
            return new com.bytedance.sdk.openadsdk.emc.ypw.ypw(context, rieVar, 5, adSlot);
        }
        if (rieVar.iat() != null) {
            return new com.bytedance.sdk.openadsdk.emc.ypw.emc.ypw(context, rieVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.emc.ypw.emc.xq(context, rieVar, adSlot);
    }
}
