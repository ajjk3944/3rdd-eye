package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5882a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5883b;

    private v7(String str, String str2) {
        this.f5882a = str;
        this.f5883b = str2;
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
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastJavaScriptResource", th2);
            return null;
        }
    }

    public String b() {
        return this.f5882a;
    }

    public String c() {
        return this.f5883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            v7 v7Var = (v7) obj;
            String str = this.f5882a;
            if (str == null ? v7Var.f5882a != null : !str.equals(v7Var.f5882a)) {
                return false;
            }
            String str2 = this.f5883b;
            String str3 = v7Var.f5883b;
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
        String str = this.f5882a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5883b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.f5882a);
        sb2.append("', javascriptResourceUrl='");
        return d.h.w(sb2, this.f5883b, "'}");
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new v7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f5882a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f5883b);
        return jSONObject;
    }
}
