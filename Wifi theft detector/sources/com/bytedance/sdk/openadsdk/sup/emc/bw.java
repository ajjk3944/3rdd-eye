package com.bytedance.sdk.openadsdk.sup.emc;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject> {
    private JSONObject emc;

    public bw(JSONObject jSONObject) {
        this.emc = jSONObject;
    }

    public static void emc(com.bytedance.sdk.component.emc.cf cfVar, JSONObject jSONObject) {
        cfVar.emc("getData", new bw(jSONObject));
    }

    @Override // com.bytedance.sdk.component.emc.dg
    public JSONObject emc(String str, JSONObject jSONObject, com.bytedance.sdk.component.emc.bw bwVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(this.emc, jSONObject);
    }
}
