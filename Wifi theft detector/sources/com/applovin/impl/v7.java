package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8288a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8289b;

    private v7(String str, String str2) {
        this.f8288a = str;
        this.f8289b = str2;
    }

    public static v7 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new v7((String) p8Var.a().get("apiFramework"), p8Var.d());
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            kVar.D().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.f8288a;
    }

    public String c() {
        return this.f8289b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            v7 v7Var = (v7) obj;
            String str = this.f8288a;
            if (str == null ? v7Var.f8288a != null : !str.equals(v7Var.f8288a)) {
                return false;
            }
            String str2 = this.f8289b;
            String str3 = v7Var.f8289b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8288a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8289b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f8288a + "', javascriptResourceUrl='" + this.f8289b + "'}";
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new v7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f8288a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f8289b);
        return jSONObject;
    }
}
