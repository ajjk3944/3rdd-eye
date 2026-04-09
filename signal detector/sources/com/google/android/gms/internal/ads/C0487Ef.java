package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487Ef {

    /* renamed from: d, reason: collision with root package name */
    public String f7975d;

    /* renamed from: e, reason: collision with root package name */
    public String f7976e;

    /* renamed from: f, reason: collision with root package name */
    public long f7977f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f7978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7979h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7980j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7972a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7973b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7974c = new HashMap();
    public final ArrayList i = new ArrayList();

    public C0487Ef(String str, long j6) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f7975d = "";
        this.f7979h = false;
        this.f7980j = false;
        this.f7976e = str;
        this.f7977f = j6;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f7978g = new JSONObject(str);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Rc)).booleanValue() && a()) {
                return;
            }
            if (this.f7978g.optInt("status", -1) != 1) {
                this.f7979h = false;
                u2.k.h("App settings could not be fetched successfully.");
                return;
            }
            this.f7979h = true;
            this.f7975d = this.f7978g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f7978g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f7973b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f7974c.put(strOptString2, new C0552Ic(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f7978g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    this.f7972a.add(jSONArrayOptJSONArray3.optString(i3));
                }
            }
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.E7)).booleanValue() && (jSONObjectOptJSONObject2 = this.f7978g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                    this.i.add(jSONArrayOptJSONArray.get(i6).toString());
                }
            }
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Z6)).booleanValue() || (jSONObjectOptJSONObject = this.f7978g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f7980j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e6) {
            u2.k.i("Exception occurred while processing app setting json", e6);
            p2.j.f22785C.f22795h.f("AppSettings.parseAppSettingsJson", e6);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8670S4)).booleanValue()) {
            p2.j jVar = p2.j.f22785C;
            C0784Vn c0784Vn = jVar.f22795h.i;
            if (c0784Vn != null) {
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "cld_reset");
                c0697QlA.r("cld_lut_ms", String.valueOf(this.f7977f));
                jVar.f22797k.getClass();
                c0697QlA.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
                c0697QlA.r("cld_ttl_sec", String.valueOf(c()));
                c0697QlA.s();
            }
        }
        this.f7972a.clear();
        this.f7973b.clear();
        this.f7974c.clear();
        this.f7975d = "";
        this.f7976e = "";
        this.f7978g = null;
        this.f7979h = false;
        this.i.clear();
        this.f7980j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f7976e) || this.f7978g == null) {
            return true;
        }
        long jC = c();
        p2.j.f22785C.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC < 0) {
            return true;
        }
        long j6 = this.f7977f;
        return j6 <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j6) <= jC;
    }

    public final long c() {
        E9 e9 = H9.Uc;
        C2841s c2841s = C2841s.f23267e;
        long jLongValue = ((Long) c2841s.f23270c.a(e9)).longValue();
        E9 e92 = H9.Tc;
        G9 g9 = c2841s.f23270c;
        return (!((Boolean) g9.a(e92)).booleanValue() || TextUtils.isEmpty(this.f7976e)) ? jLongValue : this.f7978g.optLong("cache_ttl_sec", ((Long) g9.a(e9)).longValue());
    }
}
