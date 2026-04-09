package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ed2 {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();

    public ed2(String str, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) tw1.e.c.a(mz1.uc)).booleanValue() && a()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.h = false;
                gi2.i0("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(strOptString2, new r62(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) tw1.e.c.a(mz1.j7)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) tw1.e.c.a(mz1.F6)).booleanValue() || (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            gi2.q0(5);
            hg4.C.h.d("AppSettings.parseAppSettingsJson", e);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) tw1.e.c.a(mz1.B4)).booleanValue()) {
            hg4 hg4Var = hg4.C;
            mv2 mv2Var = hg4Var.h.i;
            if (mv2Var != null) {
                lv2 lv2VarA = mv2Var.a();
                lv2VarA.k("action", "cld_reset");
                lv2VarA.k("cld_lut_ms", String.valueOf(this.f));
                hg4Var.k.getClass();
                lv2VarA.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
                lv2VarA.k("cld_ttl_sec", String.valueOf(c()));
                lv2VarA.m();
            }
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = "";
        this.e = "";
        this.g = null;
        this.h = false;
        this.i.clear();
        this.j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.e) || this.g == null) {
            return true;
        }
        long jC = c();
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC < 0) {
            return true;
        }
        long j = this.f;
        return j <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j) <= jC;
    }

    public final long c() {
        iz1 iz1Var = mz1.xc;
        tw1 tw1Var = tw1.e;
        long jLongValue = ((Long) tw1Var.c.a(iz1Var)).longValue();
        iz1 iz1Var2 = mz1.wc;
        kz1 kz1Var = tw1Var.c;
        return (!((Boolean) kz1Var.a(iz1Var2)).booleanValue() || TextUtils.isEmpty(this.e)) ? jLongValue : this.g.optLong("cache_ttl_sec", ((Long) kz1Var.a(iz1Var)).longValue());
    }
}
