package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19540b;

    private i7(String str, String str2) {
        this.f19539a = str;
        this.f19540b = str2;
    }

    public static i7 a(c8 c8Var, com.applovin.impl.sdk.k kVar) {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new i7((String) c8Var.a().get("apiFramework"), c8Var.d());
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            kVar.E().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.f19539a;
    }

    public String c() {
        return this.f19540b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i7 i7Var = (i7) obj;
            String str = this.f19539a;
            if (str == null ? i7Var.f19539a != null : !str.equals(i7Var.f19539a)) {
                return false;
            }
            String str2 = this.f19540b;
            String str3 = i7Var.f19540b;
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
        String str = this.f19539a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19540b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb.append(this.f19539a);
        sb.append("', javascriptResourceUrl='");
        return B4.f.c(sb, this.f19540b, "'}");
    }

    public static i7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new i7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f19539a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f19540b);
        return jSONObject;
    }
}
