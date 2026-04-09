package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final bs f8659lh;

    public yu(bs bsVar) {
        this.f8659lh = bsVar;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f8659lh;
        if (jSONObject2 == null) {
            return null;
        }
        int iOptInt = jSONObject2.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            jgVar.fkw = dOptDouble;
            jgVar.f7392le = dOptDouble2;
            jgVar.f7390cf = dOptDouble3;
            jgVar.ryl = dOptDouble4;
        }
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f8104cf;
        if (koVar == null) {
            return null;
        }
        koVar.ouw(iOptInt, jgVar);
        return null;
    }
}
