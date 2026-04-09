package com.bytedance.sdk.openadsdk.core.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pd {
    public JSONObject fkw;

    /* renamed from: le, reason: collision with root package name */
    public ouw f8254le;

    /* renamed from: lh, reason: collision with root package name */
    public String f8255lh;
    public String ouw;
    public String vt;
    public String yu;

    public static pd ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pd pdVar = new pd();
        pdVar.ouw = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        pdVar.yu = jSONObject.optString("data");
        pdVar.f8255lh = jSONObject.optString("url");
        pdVar.vt = jSONObject.optString("md5");
        pdVar.fkw = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            pdVar.f8254le = ouw.ouw(jSONObjectOptJSONObject);
        }
        return pdVar;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public JSONArray f8256lh;
        public JSONArray ouw;
        public JSONArray vt;

        public static ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONArrayOptJSONArray;
            ouwVar.vt = jSONObject.optJSONArray("fetch");
            ouwVar.f8256lh = jSONObject.optJSONArray("script");
            return ouwVar;
        }

        public final JSONObject ouw() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.ouw);
                jSONObject.put("fetch", this.vt);
                jSONObject.put("script", this.f8256lh);
                return jSONObject;
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.ko.fkw("PreloadModel", e2.getMessage());
                return jSONObject;
            }
        }
    }

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.ouw);
            jSONObject.put("md5", this.vt);
            jSONObject.put("url", this.f8255lh);
            jSONObject.put("data", this.yu);
            jSONObject.put("custom_components", this.fkw);
            ouw ouwVar = this.f8254le;
            if (ouwVar != null) {
                jSONObject.put("preload", ouwVar.ouw());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
