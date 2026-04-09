package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    public ArrayList<ouw> ouw;
    private yu vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.ryl.yu f8226lh;
        public final String ouw;
        public final String vt;
        public Set<com.bytedance.sdk.openadsdk.core.ryl.tlj> yu;

        public ouw(JSONObject jSONObject) {
            this.ouw = jSONObject.optString("vast_url");
            this.vt = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.yu();
                this.f8226lh = yuVar;
                yuVar.ouw(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.yu = com.bytedance.sdk.openadsdk.core.ryl.tlj.ouw(jSONArrayOptJSONArray);
            }
        }

        public final JSONObject ouw() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.ouw);
            jSONObject.put("vast_content", this.vt);
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = this.f8226lh;
            if (yuVar != null) {
                jSONObject.put("videoTrackers", yuVar.vt());
            }
            if (this.yu != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ryl.tlj tljVar : this.yu) {
                    if (tljVar != null) {
                        jSONArray.put(tljVar.ouw());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }
    }

    public fkw(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            ouw ouwVar = new ouw(jSONArray.optJSONObject(i4));
            if (this.ouw == null) {
                this.ouw = new ArrayList<>();
            }
            this.ouw.add(ouwVar);
        }
    }

    public final JSONArray ouw() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<ouw> arrayList = this.ouw;
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ouw ouwVar = arrayList.get(i4);
                    i4++;
                    jSONArray.put(ouwVar.ouw());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public final yu vt() {
        if (this.vt == null) {
            this.vt = new yu();
            ArrayList<ouw> arrayList = this.ouw;
            if (arrayList != null) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ouw ouwVar = arrayList.get(i4);
                    i4++;
                    ouw ouwVar2 = ouwVar;
                    com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = ouwVar2.f8226lh;
                    Set<com.bytedance.sdk.openadsdk.core.ryl.tlj> set = ouwVar2.yu;
                    if (yuVar != null) {
                        this.vt.ouw.ouw(yuVar);
                    }
                    if (set != null) {
                        this.vt.vt.addAll(set);
                    }
                }
            }
        }
        return this.vt;
    }
}
