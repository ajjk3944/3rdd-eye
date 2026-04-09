package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ww {

    /* renamed from: d, reason: collision with root package name */
    public String f18212d;

    /* renamed from: e, reason: collision with root package name */
    public String f18213e;

    /* renamed from: f, reason: collision with root package name */
    public long f18214f;
    public JSONObject g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18215h;
    public boolean j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18209a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18210b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18211c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18216i = new ArrayList();

    public ww(String str, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f18212d = "";
        this.f18215h = false;
        this.j = false;
        this.f18213e = str;
        this.f18214f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Tc)).booleanValue() && a()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.f18215h = false;
                za.i.h("App settings could not be fetched successfully.");
                return;
            }
            this.f18215h = true;
            this.f18212d = this.g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i4);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f18210b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f18211c.put(strOptString2, new xq(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray3.length(); i10++) {
                    this.f18209a.add(jSONArrayOptJSONArray3.optString(i10));
                }
            }
            if (((Boolean) va.s.f36163e.f36166c.a(sk.E7)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    this.f18216i.add(jSONArrayOptJSONArray.get(i11).toString());
                }
            }
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.Z6)).booleanValue() || (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e2) {
            za.i.i("Exception occurred while processing app setting json", e2);
            ua.j.C.f35265h.f("AppSettings.parseAppSettingsJson", e2);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.S4)).booleanValue()) {
            ua.j jVar = ua.j.C;
            qd0 qd0Var = jVar.f35265h.f19200i;
            if (qd0Var != null) {
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "cld_reset");
                rtVarA.u("cld_lut_ms", String.valueOf(this.f18214f));
                jVar.f35267k.getClass();
                rtVarA.u("event_timestamp", String.valueOf(System.currentTimeMillis()));
                rtVarA.u("cld_ttl_sec", String.valueOf(c()));
                rtVarA.v();
            }
        }
        this.f18209a.clear();
        this.f18210b.clear();
        this.f18211c.clear();
        this.f18212d = "";
        this.f18213e = "";
        this.g = null;
        this.f18215h = false;
        this.f18216i.clear();
        this.j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f18213e) || this.g == null) {
            return true;
        }
        long jC = c();
        ua.j.C.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC < 0) {
            return true;
        }
        long j = this.f18214f;
        return j <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j) <= jC;
    }

    public final long c() {
        pk pkVar = sk.Wc;
        va.s sVar = va.s.f36163e;
        long jLongValue = ((Long) sVar.f36166c.a(pkVar)).longValue();
        pk pkVar2 = sk.Vc;
        rk rkVar = sVar.f36166c;
        return (!((Boolean) rkVar.a(pkVar2)).booleanValue() || TextUtils.isEmpty(this.f18213e)) ? jLongValue : this.g.optLong("cache_ttl_sec", ((Long) rkVar.a(pkVar)).longValue());
    }
}
