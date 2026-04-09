package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {

    /* renamed from: lh, reason: collision with root package name */
    public int f8261lh;
    public String ouw;
    public String vt;

    public final JSONObject ouw() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.ouw);
            jSONObject.put("ft", this.f8261lh);
            jSONObject.put("fu", this.vt);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
