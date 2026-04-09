package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.yu.ouw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private bs f8655lh;

    public rn(bs bsVar) {
        this.f8655lh = bsVar;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        final JSONObject jSONObject2 = jSONObject;
        com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "SendLogV3Method, params is:", jSONObject2);
        final bs bsVar = this.f8655lh;
        if (jSONObject2 == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.bs.3
            final /* synthetic */ JSONObject ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str2, final JSONObject jSONObject22) {
                super(str2);
                jSONObject = jSONObject22;
            }

            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong("value");
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", bs.this.pno);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger sendLogV3, extJson is:", jSONObjectOptJSONObject);
                    ouw.C0120ouw c0120ouw = new ouw.C0120ouw(System.currentTimeMillis(), bs.this.bly);
                    c0120ouw.yu = strOptString;
                    c0120ouw.vt = strOptString2;
                    c0120ouw.f8836lh = strOptString3;
                    c0120ouw.ra = String.valueOf(jOptLong);
                    c0120ouw.pno = String.valueOf(jOptLong2);
                    c0120ouw.ouw(jSONObjectOptJSONObject).ouw((com.bytedance.sdk.openadsdk.yu.vt.ouw) null);
                }
            }
        });
        return null;
    }
}
