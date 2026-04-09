package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko implements com.bytedance.sdk.openadsdk.oem.ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static boolean f8698lh;
    private static final ko ouw = new ko();
    private static com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.jae jaeVar = ouwVar.vt.oiz;
        if (jaeVar != null) {
            if (jaeVar.ouw() || jaeVar.vt()) {
                vt = ouwVar;
                IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(ouwVar.hun, ouwVar.vt);
                if (iPBroadcastReceiverOuw != null) {
                    iPBroadcastReceiverOuw.vt = ouw;
                }
            }
        }
    }

    public static void vt() {
        f8698lh = true;
    }

    public static void ouw() {
        if (vt == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), vt.vt);
        if (iPBroadcastReceiverOuw != null) {
            iPBroadcastReceiverOuw.vt = null;
        }
        vt = null;
        f8698lh = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.ouw
    public final void ouw(String str, final int i4) {
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = vt;
        if (ouwVar == null || (leVar = ouwVar.vt.wp) == null) {
            return;
        }
        String str2 = leVar.f8244lh;
        if (TextUtils.isEmpty(str2) || !str2.equals(str)) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ko.1
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                if (ko.vt == null || (i10 = i4) <= 0 || i10 > 5) {
                    return;
                }
                boolean z3 = true;
                boolean z10 = i10 == 1;
                if (ko.f8698lh) {
                    ko.vt.fqk.kn();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", ko.vt.vt, new cf.ouw().ouw(), ko.vt.fkw, true, (Map<String, Object>) map, 1);
                } else {
                    z3 = z10;
                }
                if (z3) {
                    ko.ouw();
                }
            }
        });
    }
}
