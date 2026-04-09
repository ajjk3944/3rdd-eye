package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f14734a;

    /* renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    public static class C0257b {

        /* renamed from: a, reason: collision with root package name */
        static b f14735a = new b();
    }

    public static b a() {
        return C0257b.f14735a;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        Exception e10;
        if (this.f14734a == null) {
            this.f14734a = new HashMap<>();
        }
        if (this.f14734a.containsKey(str)) {
            return this.f14734a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("c_cb", 0);
                    jSONObject.put("t_disc", 0.95d);
                    jSONObject.put("u_disc", 0.95d);
                    jSONObject.put("max_ecppv_diff", 0);
                    jSONObject.put("max_cache_num", 20);
                    jSONObject.put("max_usage_limit", 10);
                    jSONObject.put("time_interval", 7200);
                    jSONArray2.put(jSONObject);
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e("CandidateController", e10.getMessage());
                    jSONArray = jSONArray2;
                    return a(str, jSONArray);
                }
            } catch (Exception e12) {
                jSONArray2 = jSONArray;
                e10 = e12;
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.f14734a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f14734a == null) {
            this.f14734a = new HashMap<>();
        }
        if (this.f14734a.containsKey(str)) {
            return this.f14734a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f14734a.put(str, dVar);
        return dVar;
    }
}
