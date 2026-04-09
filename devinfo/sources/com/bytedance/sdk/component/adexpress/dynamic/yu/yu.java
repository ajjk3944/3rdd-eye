package com.bytedance.sdk.component.adexpress.dynamic.yu;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* renamed from: lh, reason: collision with root package name */
    public String f7313lh;
    public List<ouw> ouw;
    public String vt;
    public String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int ouw;
        public JSONObject vt;
    }

    public static yu ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        yu yuVar = new yu();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    ouw ouwVar = new ouw();
                    ouwVar.ouw = jSONObjectOptJSONObject.optInt(FacebookMediationAdapter.KEY_ID);
                    ouwVar.vt = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(ouwVar);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        yuVar.ouw = arrayList;
        yuVar.vt = jSONObject.optString("diff_data");
        yuVar.f7313lh = jSONObject.optString("style_diff");
        yuVar.yu = jSONObject.optString("tag_diff");
        return yuVar;
    }
}
