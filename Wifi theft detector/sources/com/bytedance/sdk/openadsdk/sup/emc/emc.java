package com.bytedance.sdk.openadsdk.sup.emc;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.emc.xq;
import com.bytedance.sdk.openadsdk.core.rtt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.component.emc.xq<JSONObject, JSONObject> {
    private final WeakReference<rtt> emc;

    public emc(rtt rttVar) {
        this.emc = new WeakReference<>(rttVar);
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, final rtt rttVar) {
        cfVar.emc("getNetworkData", new xq.ypw() { // from class: com.bytedance.sdk.openadsdk.sup.emc.emc.1
            @Override // com.bytedance.sdk.component.emc.xq.ypw
            public com.bytedance.sdk.component.emc.xq emc() {
                return new emc(rttVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.emc.xq
    public void emc(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        rtt rttVar = this.emc.get();
        if (rttVar == null) {
            xq();
        } else {
            rttVar.emc(jSONObject, new com.bytedance.sdk.openadsdk.sz.dg() { // from class: com.bytedance.sdk.openadsdk.sup.emc.emc.2
                @Override // com.bytedance.sdk.openadsdk.sz.dg
                public void emc(boolean z10, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z10) {
                            emc.this.emc((emc) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", rtt.emc(emcVar));
                            emc.this.emc((emc) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
