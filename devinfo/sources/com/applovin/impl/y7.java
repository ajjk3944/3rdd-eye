package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private String f6254a;

    /* renamed from: b, reason: collision with root package name */
    private String f6255b;

    /* renamed from: c, reason: collision with root package name */
    private String f6256c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6257d;

    /* renamed from: e, reason: collision with root package name */
    private long f6258e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f6259f = -1;

    private y7() {
    }

    public static y7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (TextUtils.isEmpty(strD)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            y7 y7Var = new y7();
            y7Var.f6256c = strD;
            y7Var.f6254a = (String) p8Var.a().get(FacebookMediationAdapter.KEY_ID);
            y7Var.f6255b = (String) p8Var.a().get("event");
            y7Var.f6257d = ((Boolean) kVar.a(x4.f6066j5)).booleanValue();
            if (s7Var != null) {
                y7Var.f6257d = JsonUtils.getBoolean(s7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(y7Var.f6257d)).booleanValue();
            }
            y7Var.f6259f = a(y7Var.b(), s7Var);
            String str = (String) p8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    y7Var.f6259f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return y7Var;
                }
                if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i4 = size - 1;
                    long j = 0;
                    for (int i10 = i4; i10 >= 0; i10--) {
                        String str2 = listExplode.get(i10);
                        if (StringUtils.isNumeric(str2)) {
                            int i11 = Integer.parseInt(str2);
                            if (i10 == i4) {
                                seconds = i11;
                            } else if (i10 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i11);
                            } else if (i10 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i11);
                            }
                            j += seconds;
                        }
                    }
                    y7Var.f6258e = j;
                    y7Var.f6259f = -1;
                }
            }
            return y7Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastTracker", th2);
            return null;
        }
    }

    public String b() {
        return this.f6255b;
    }

    public String c() {
        return this.f6256c;
    }

    public boolean d() {
        return this.f6257d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f6258e != y7Var.f6258e || this.f6259f != y7Var.f6259f) {
            return false;
        }
        String str = this.f6254a;
        if (str == null ? y7Var.f6254a != null : !str.equals(y7Var.f6254a)) {
            return false;
        }
        String str2 = this.f6255b;
        if (str2 == null ? y7Var.f6255b == null : str2.equals(y7Var.f6255b)) {
            return this.f6256c.equals(y7Var.f6256c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6254a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6255b;
        int iM = je.u.m((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f6256c);
        long j = this.f6258e;
        return ((iM + ((int) (j ^ (j >>> 32)))) * 31) + this.f6259f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastTracker{identifier='");
        sb2.append(this.f6254a);
        sb2.append("', event='");
        sb2.append(this.f6255b);
        sb2.append("', uriString='");
        sb2.append(this.f6256c);
        sb2.append("', offsetSeconds=");
        sb2.append(this.f6258e);
        sb2.append(", offsetPercent=");
        return d.h.u(sb2, this.f6259f, '}');
    }

    public boolean a(long j, int i4) {
        long j8 = this.f6258e;
        boolean z3 = j8 >= 0;
        boolean z10 = j >= j8;
        int i10 = this.f6259f;
        return (z3 && z10) || ((i10 >= 0) && (i4 >= i10));
    }

    private static int a(String str, s7 s7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (s7Var != null) {
            return s7Var.g();
        }
        return 95;
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        y7 y7Var = new y7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        y7Var.f6256c = string;
        y7Var.f6254a = JsonUtils.getString(jSONObject, "identifier", "");
        y7Var.f6255b = JsonUtils.getString(jSONObject, "event", "");
        y7Var.f6258e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        y7Var.f6259f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return y7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f6254a);
        JsonUtils.putString(jSONObject, "event", this.f6255b);
        JsonUtils.putString(jSONObject, "uri_string", this.f6256c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f6258e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f6259f);
        return jSONObject;
    }
}
