package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.sup;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class cf implements com.bytedance.sdk.openadsdk.oem.emc {
    private static final cf emc = new cf();
    private static boolean xq;
    private static com.bytedance.sdk.openadsdk.component.reward.emc.emc ypw;

    public static void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        com.bytedance.sdk.openadsdk.core.model.sf sfVarAu = emcVar.ypw.au();
        if (sfVarAu != null) {
            if (sfVarAu.uym() || sfVarAu.msw()) {
                ypw = emcVar;
                IPBroadcastReceiver iPBroadcastReceiverEmc = IPBroadcastReceiver.emc(emcVar.vw, emcVar.ypw);
                if (iPBroadcastReceiverEmc != null) {
                    iPBroadcastReceiverEmc.emc(emc);
                }
            }
        }
    }

    public static void ypw() {
        xq = true;
    }

    public static void emc() {
        if (ypw == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverEmc = IPBroadcastReceiver.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), ypw.ypw);
        if (iPBroadcastReceiverEmc != null) {
            iPBroadcastReceiverEmc.emc();
        }
        ypw = null;
        xq = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.emc
    public void emc(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.ycc yccVarMjd;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = ypw;
        if (emcVar == null || (yccVarMjd = emcVar.ypw.mjd()) == null) {
            return;
        }
        String strXq = yccVarMjd.xq();
        if (TextUtils.isEmpty(strXq) || !strXq.equals(str)) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.cf.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                if (cf.ypw == null || (i11 = i10) <= 0 || i11 > 5) {
                    return;
                }
                boolean z10 = true;
                boolean z11 = i11 == 1;
                if (cf.xq) {
                    cf.ypw.tp.hj();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.dg.xq.emc(CampaignEx.JSON_NATIVE_VIDEO_CLICK, cf.ypw.ypw, new sup.emc().emc(), cf.ypw.bw, true, (Map<String, Object>) map, 1);
                } else {
                    z10 = z11;
                }
                if (z10) {
                    cf.emc();
                }
            }
        });
    }
}
