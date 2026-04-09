package com.bytedance.sdk.openadsdk.sup.emc;

import com.bytedance.sdk.openadsdk.core.rtt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private final rtt emc;

    public dg(rtt rttVar) {
        this.emc = rttVar;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, rtt rttVar) {
        cfVar.emc("expressAdViewStartZoom", new dg(rttVar));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) {
        this.emc.dg(jSONObject);
        return null;
    }
}
