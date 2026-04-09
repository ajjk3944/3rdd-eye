package com.bytedance.sdk.openadsdk.component.vt;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.ra;
import com.bytedance.sdk.openadsdk.core.model.lh;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.ouw.vt.pno;
import com.bytedance.sdk.openadsdk.ouw.vt.vt;
import com.bytedance.sdk.openadsdk.utils.fak;
import java.util.ArrayList;
import java.util.List;
import w8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    private static volatile ouw vt;
    public final vpp ouw = zih.lh();

    private ouw() {
    }

    public static ouw ouw() {
        if (vt == null) {
            synchronized (ouw.class) {
                try {
                    if (vt == null) {
                        vt = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public static /* synthetic */ void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, lh lhVar, Context context, AdSlot adSlot, ra raVar, fak fakVar) {
        pno lhVar2;
        c cVar;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list2 = ouwVar.yu;
            ArrayList arrayList = new ArrayList(list2.size());
            for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar : list2) {
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar) || (vppVar != null && vppVar.tc())) {
                    if (vppVar.rn() != 2) {
                        lhVar2 = new vt(context, vppVar, adSlot);
                    } else if (vppVar.f8309sd != null) {
                        lhVar2 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt(context, vppVar, adSlot);
                    } else {
                        lhVar2 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh(context, vppVar, adSlot);
                    }
                    if (raVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(lhVar2);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar) && (cVar = vppVar.f8309sd) != null && cVar.g != null) {
                    int iFqk = vppVar.fqk();
                    zih.yu();
                    if (cf.yu(String.valueOf(iFqk)) && zih.yu().od()) {
                        c cVar2 = vppVar.f8309sd;
                        if (cVar2 != null) {
                            cVar2.f6585o = 1;
                        }
                        c cVar3 = vppVar.euf;
                        if (cVar3 != null) {
                            cVar3.f6585o = 1;
                        }
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).E(), vppVar);
                        vtVarOuw.ouw("material_meta", vppVar);
                        vtVarOuw.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, (a) null);
                    }
                    IPBroadcastReceiver.vt(context, vppVar);
                }
            }
            boolean z3 = raVar instanceof PAGNativeAdLoadListener;
            if (z3 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(list2.get(0), fakVar.lh());
                }
                if (z3) {
                    ((PAGNativeAdLoadListener) raVar).onAdLoaded(arrayList.get(0));
                }
                ArrayList<Integer> arrayList2 = lhVar.yu;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    return;
                }
                lhVar.ra = 4;
                lh.ouw(lhVar);
                return;
            }
            raVar.onError(-4, com.bytedance.sdk.openadsdk.core.pno.ouw(-4));
            lhVar.vt = -4;
            lhVar.ra = 4;
            lh.ouw(lhVar);
            return;
        }
        raVar.onError(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
        lhVar.vt = -3;
        lhVar.ra = 4;
        lh.ouw(lhVar);
    }
}
