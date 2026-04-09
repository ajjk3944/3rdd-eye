package com.bytedance.sdk.openadsdk.sup.emc;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.emc.xq;
import com.bytedance.sdk.openadsdk.core.rtt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.sdk.component.emc.xq<JSONObject, JSONObject> {
    private final WeakReference<rtt> emc;

    public ypw(rtt rttVar) {
        this.emc = new WeakReference<>(rttVar);
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, final rtt rttVar) {
        cfVar.emc("interstitial_webview_close", new xq.ypw() { // from class: com.bytedance.sdk.openadsdk.sup.emc.ypw.1
            @Override // com.bytedance.sdk.component.emc.xq.ypw
            public com.bytedance.sdk.component.emc.xq emc() {
                return new ypw(rttVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.emc.xq
    public void emc(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.zz.ypw().aa();
        rtt rttVar = this.emc.get();
        if (rttVar == null) {
            xq();
        } else {
            rttVar.msw();
        }
    }
}
