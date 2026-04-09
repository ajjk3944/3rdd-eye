package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private String f8712a;

    /* renamed from: b, reason: collision with root package name */
    private String f8713b;

    /* renamed from: c, reason: collision with root package name */
    private String f8714c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8715d;

    /* renamed from: e, reason: collision with root package name */
    private long f8716e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f8717f = -1;

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
            y7Var.f8714c = strD;
            y7Var.f8712a = (String) p8Var.a().get("id");
            y7Var.f8713b = (String) p8Var.a().get(NotificationCompat.CATEGORY_EVENT);
            y7Var.f8715d = ((Boolean) kVar.a(x4.f8501j5)).booleanValue();
            if (s7Var != null) {
                y7Var.f8715d = JsonUtils.getBoolean(s7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(y7Var.f8715d)).booleanValue();
            }
            y7Var.f8717f = a(y7Var.b(), s7Var);
            String str = (String) p8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    y7Var.f8717f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return y7Var;
                }
                if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i10 = size - 1;
                    long j10 = 0;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else if (i11 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i12);
                            } else if (i11 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    y7Var.f8716e = j10;
                    y7Var.f8717f = -1;
                }
            }
            return y7Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th);
            }
            kVar.D().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.f8713b;
    }

    public String c() {
        return this.f8714c;
    }

    public boolean d() {
        return this.f8715d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f8716e != y7Var.f8716e || this.f8717f != y7Var.f8717f) {
            return false;
        }
        String str = this.f8712a;
        if (str == null ? y7Var.f8712a != null : !str.equals(y7Var.f8712a)) {
            return false;
        }
        String str2 = this.f8713b;
        if (str2 == null ? y7Var.f8713b == null : str2.equals(y7Var.f8713b)) {
            return this.f8714c.equals(y7Var.f8714c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8712a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8713b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f8714c.hashCode()) * 31;
        long j10 = this.f8716e;
        return ((iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f8717f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f8712a + "', event='" + this.f8713b + "', uriString='" + this.f8714c + "', offsetSeconds=" + this.f8716e + ", offsetPercent=" + this.f8717f + '}';
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f8716e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f8717f;
        return (z10 && z11) || ((i11 >= 0) && (i10 >= i11));
    }

    private static int a(String str, s7 s7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
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
        y7Var.f8714c = string;
        y7Var.f8712a = JsonUtils.getString(jSONObject, "identifier", "");
        y7Var.f8713b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        y7Var.f8716e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        y7Var.f8717f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return y7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f8712a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.f8713b);
        JsonUtils.putString(jSONObject, "uri_string", this.f8714c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f8716e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f8717f);
        return jSONObject;
    }
}
