package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private String f19660a;

    /* renamed from: b, reason: collision with root package name */
    private String f19661b;

    private k7() {
    }

    public static k7 a(c8 c8Var, k7 k7Var, com.applovin.impl.sdk.k kVar) {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (k7Var == null) {
            try {
                k7Var = new k7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                kVar.E().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(k7Var.f19660a)) {
            String strD = c8Var.d();
            if (StringUtils.isValidString(strD)) {
                k7Var.f19660a = strD;
            }
        }
        if (!StringUtils.isValidString(k7Var.f19661b)) {
            String str = (String) c8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                k7Var.f19661b = str;
            }
        }
        return k7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        String str = this.f19660a;
        if (str == null ? k7Var.f19660a != null : !str.equals(k7Var.f19660a)) {
            return false;
        }
        String str2 = this.f19661b;
        String str3 = k7Var.f19661b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f19660a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19661b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastSystemInfo{name='");
        sb.append(this.f19660a);
        sb.append("', version='");
        return B4.f.c(sb, this.f19661b, "'}");
    }

    public static k7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        k7 k7Var = new k7();
        k7Var.f19660a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
        k7Var.f19661b = JsonUtils.getString(jSONObject, "version", null);
        return k7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, this.f19660a);
        JsonUtils.putString(jSONObject, "version", this.f19661b);
        return jSONObject;
    }
}
