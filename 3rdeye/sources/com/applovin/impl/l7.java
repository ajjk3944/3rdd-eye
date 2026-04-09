package com.applovin.impl;

import N7.H7;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private String f20112a;

    /* renamed from: b, reason: collision with root package name */
    private String f20113b;

    /* renamed from: c, reason: collision with root package name */
    private String f20114c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20115d;

    /* renamed from: e, reason: collision with root package name */
    private long f20116e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f20117f = -1;

    private l7() {
    }

    public static l7 a(c8 c8Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = c8Var.d();
            if (TextUtils.isEmpty(strD)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            l7 l7Var = new l7();
            l7Var.f20114c = strD;
            l7Var.f20112a = (String) c8Var.a().get(FacebookMediationAdapter.KEY_ID);
            l7Var.f20113b = (String) c8Var.a().get("event");
            l7Var.f20115d = ((Boolean) kVar.a(l4.f19776K4)).booleanValue();
            if (f7Var != null) {
                l7Var.f20115d = JsonUtils.getBoolean(f7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(l7Var.f20115d)).booleanValue();
            }
            l7Var.f20117f = a(l7Var.b(), f7Var);
            String str = (String) c8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    l7Var.f20117f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return l7Var;
                }
                if (strTrim.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) && (size = (listExplode = CollectionUtils.explode(strTrim, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)).size()) > 0) {
                    int i = size - 1;
                    long j4 = 0;
                    for (int i10 = i; i10 >= 0; i10--) {
                        String str2 = listExplode.get(i10);
                        if (StringUtils.isNumeric(str2)) {
                            int i11 = Integer.parseInt(str2);
                            if (i10 == i) {
                                seconds = i11;
                            } else if (i10 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i11);
                            } else if (i10 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i11);
                            }
                            j4 += seconds;
                        }
                    }
                    l7Var.f20116e = j4;
                    l7Var.f20117f = -1;
                }
            }
            return l7Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th);
            }
            kVar.E().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.f20113b;
    }

    public String c() {
        return this.f20114c;
    }

    public boolean d() {
        return this.f20115d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        if (this.f20116e != l7Var.f20116e || this.f20117f != l7Var.f20117f) {
            return false;
        }
        String str = this.f20112a;
        if (str == null ? l7Var.f20112a != null : !str.equals(l7Var.f20112a)) {
            return false;
        }
        String str2 = this.f20113b;
        if (str2 == null ? l7Var.f20113b == null : str2.equals(l7Var.f20113b)) {
            return this.f20114c.equals(l7Var.f20114c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20112a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20113b;
        int iN = B4.g.n((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f20114c);
        long j4 = this.f20116e;
        return ((iN + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f20117f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastTracker{identifier='");
        sb.append(this.f20112a);
        sb.append("', event='");
        sb.append(this.f20113b);
        sb.append("', uriString='");
        sb.append(this.f20114c);
        sb.append("', offsetSeconds=");
        sb.append(this.f20116e);
        sb.append(", offsetPercent=");
        return H7.p(sb, this.f20117f, '}');
    }

    public boolean a(long j4, int i) {
        long j10 = this.f20116e;
        boolean z10 = j10 >= 0;
        boolean z11 = j4 >= j10;
        int i10 = this.f20117f;
        return (z10 && z11) || ((i10 >= 0) && (i >= i10));
    }

    private static int a(String str, f7 f7Var) {
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
        if (f7Var != null) {
            return f7Var.g();
        }
        return 95;
    }

    public static l7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        l7 l7Var = new l7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        l7Var.f20114c = string;
        l7Var.f20112a = JsonUtils.getString(jSONObject, "identifier", "");
        l7Var.f20113b = JsonUtils.getString(jSONObject, "event", "");
        l7Var.f20116e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        l7Var.f20117f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return l7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f20112a);
        JsonUtils.putString(jSONObject, "event", this.f20113b);
        JsonUtils.putString(jSONObject, "uri_string", this.f20114c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f20116e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f20117f);
        return jSONObject;
    }
}
