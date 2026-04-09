package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f23297h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f23298a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f23299b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f23300c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f23301d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f23302e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23303f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f23304g;

    /* compiled from: ConfigContainer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public JSONObject f23305a;

        /* renamed from: b, reason: collision with root package name */
        public Date f23306b;

        /* renamed from: c, reason: collision with root package name */
        public JSONArray f23307c;

        /* renamed from: d, reason: collision with root package name */
        public JSONObject f23308d;

        /* renamed from: e, reason: collision with root package name */
        public long f23309e;

        /* renamed from: f, reason: collision with root package name */
        public JSONArray f23310f;
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j4, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j4);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f23299b = jSONObject;
        this.f23300c = date;
        this.f23301d = jSONArray;
        this.f23302e = jSONObject2;
        this.f23303f = j4;
        this.f23304g = jSONArray2;
        this.f23298a = jSONObject3;
    }

    public static b a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static a c() {
        a aVar = new a();
        aVar.f23305a = new JSONObject();
        aVar.f23306b = f23297h;
        aVar.f23307c = new JSONArray();
        aVar.f23308d = new JSONObject();
        aVar.f23309e = 0L;
        aVar.f23310f = new JSONArray();
        return aVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f23304g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f23298a.toString().equals(((b) obj).f23298a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23298a.hashCode();
    }

    public final String toString() {
        return this.f23298a.toString();
    }
}
