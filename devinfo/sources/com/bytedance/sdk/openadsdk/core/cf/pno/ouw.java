package com.bytedance.sdk.openadsdk.core.cf.pno;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public String fkw;

    /* renamed from: lh, reason: collision with root package name */
    public String f8158lh;
    public String ouw;
    public String vt;
    public String yu;

    public final JSONObject ouw(ouw ouwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.ouw);
            jSONObject.put("md5", this.vt);
            jSONObject.put("url", this.f8158lh);
            if (ouwVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FacebookMediationAdapter.KEY_ID, ouwVar.ouw);
                jSONObject2.put("md5", ouwVar.vt);
                jSONObject2.put("url", ouwVar.f8158lh);
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
