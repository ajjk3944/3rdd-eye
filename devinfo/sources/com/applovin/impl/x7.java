package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class x7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private String f6194a;

    /* renamed from: b, reason: collision with root package name */
    private String f6195b;

    private x7() {
    }

    public static x7 a(p8 p8Var, x7 x7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastSystemInfo", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastSystemInfo", th2);
                return null;
            }
        }
        if (!StringUtils.isValidString(x7Var.f6194a)) {
            String strD = p8Var.d();
            if (StringUtils.isValidString(strD)) {
                x7Var.f6194a = strD;
            }
        }
        if (!StringUtils.isValidString(x7Var.f6195b)) {
            String str = (String) p8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                x7Var.f6195b = str;
            }
        }
        return x7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        String str = this.f6194a;
        if (str == null ? x7Var.f6194a != null : !str.equals(x7Var.f6194a)) {
            return false;
        }
        String str2 = this.f6195b;
        String str3 = x7Var.f6195b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f6194a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6195b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastSystemInfo{name='");
        sb2.append(this.f6194a);
        sb2.append("', version='");
        return d.h.w(sb2, this.f6195b, "'}");
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        x7Var.f6194a = JsonUtils.getString(jSONObject, "name", null);
        x7Var.f6195b = JsonUtils.getString(jSONObject, "version", null);
        return x7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f6194a);
        JsonUtils.putString(jSONObject, "version", this.f6195b);
        return jSONObject;
    }
}
