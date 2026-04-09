package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private final WeakReference<rtt> emc;

    public ycc(rtt rttVar) {
        this.emc = new WeakReference<>(rttVar);
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc("interactiveFinish", new ycc(rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<rtt> weakReference = this.emc;
        if (weakReference != null && weakReference.get() != null) {
            rtt rttVar = this.emc.get();
            rie rieVarDg = rttVar.dg();
            try {
                boolean z6 = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z6 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iQam = rieVarDg != null ? rieVarDg.qam() : 0;
                if (iOptInt >= 0 && iQam >= 0) {
                    iOptInt = Math.min(iOptInt, iQam);
                } else if (iOptInt < 0) {
                    iOptInt = iQam >= 0 ? iQam : 0;
                }
                if (z6) {
                    rttVar.xq(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e6) {
                com.bytedance.sdk.component.utils.ul.xq("InteractiveFinishMethod", e6.getMessage());
            }
        }
        return jSONObject2;
    }
}
