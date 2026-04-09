package com.bykv.vk.openvk.emc.emc.emc.xq;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;
import u2.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f8955a;

    /* renamed from: b, reason: collision with root package name */
    public int f8956b;

    /* renamed from: c, reason: collision with root package name */
    public long f8957c;

    /* renamed from: d, reason: collision with root package name */
    public double f8958d;

    /* renamed from: e, reason: collision with root package name */
    public String f8959e;

    /* renamed from: f, reason: collision with root package name */
    public String f8960f;

    /* renamed from: g, reason: collision with root package name */
    public String f8961g;

    /* renamed from: h, reason: collision with root package name */
    public String f8962h;

    /* renamed from: i, reason: collision with root package name */
    public String f8963i;

    /* renamed from: j, reason: collision with root package name */
    public String f8964j;

    /* renamed from: k, reason: collision with root package name */
    public double f8965k;

    /* renamed from: l, reason: collision with root package name */
    public int f8966l;

    /* renamed from: m, reason: collision with root package name */
    public int f8967m;

    /* renamed from: n, reason: collision with root package name */
    public float f8968n = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f8969o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f8970p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f8971q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f8972r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f8973s = 307200;

    /* renamed from: t, reason: collision with root package name */
    public int f8974t = 1;

    public int A() {
        return this.f8971q;
    }

    public int B() {
        return this.f8956b;
    }

    public void C(int i10) {
        this.f8956b = i10;
    }

    public void D(String str) {
        this.f8961g = str;
    }

    public double E() {
        return this.f8958d;
    }

    public void F(int i10) {
        this.f8971q = i10;
    }

    public void G(String str) {
        this.f8964j = str;
    }

    public boolean H() {
        return this.f8971q == 0;
    }

    public int I() {
        return this.f8955a;
    }

    public void J(int i10) {
        this.f8955a = i10;
    }

    public void K(String str) {
        this.f8960f = str;
    }

    public int L() {
        return this.f8969o;
    }

    public String M() {
        return this.f8959e;
    }

    public void N(int i10) {
        this.f8970p = i10;
    }

    public int a() {
        return this.f8972r;
    }

    public long b() {
        return this.f8957c;
    }

    public void c(int i10) {
        this.f8973s = i10;
    }

    public void d(String str) {
        this.f8963i = str;
    }

    public int e() {
        if (this.f8973s < 0) {
            this.f8973s = 307200;
        }
        long j10 = this.f8973s;
        long j11 = this.f8957c;
        if (j10 > j11) {
            this.f8973s = (int) j11;
        }
        return this.f8973s;
    }

    public int f() {
        return this.f8967m;
    }

    public void g(int i10) {
        this.f8967m = i10;
    }

    public void h(String str) {
        this.f8962h = str;
    }

    public int i() {
        return this.f8966l;
    }

    public void j(double d10) {
        this.f8958d = d10;
    }

    public void k(int i10) {
        this.f8966l = i10;
    }

    public void l(long j10) {
        this.f8957c = j10;
    }

    public void m(String str) {
        this.f8959e = str;
    }

    public String n() {
        return this.f8961g;
    }

    public float o() {
        return this.f8968n;
    }

    public void p(int i10) {
        this.f8969o = i10;
    }

    public String q() {
        if (TextUtils.isEmpty(this.f8964j)) {
            this.f8964j = e.a(this.f8961g);
        }
        return this.f8964j;
    }

    public String r() {
        return this.f8960f;
    }

    public void s(int i10) {
        this.f8974t = Math.min(4, Math.max(1, i10));
    }

    public JSONObject t() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", I());
            jSONObject.put("cover_url", r());
            jSONObject.put("cover_width", B());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, v());
            jSONObject.put("file_hash", q());
            jSONObject.put("resolution", M());
            jSONObject.put("size", b());
            jSONObject.put("video_duration", E());
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, n());
            jSONObject.put("playable_download_url", w());
            jSONObject.put("if_playable_loading_show", L());
            jSONObject.put("remove_loading_page_type", x());
            jSONObject.put("fallback_endcard_judge", i());
            jSONObject.put("video_preload_size", e());
            jSONObject.put("reward_video_cached_type", A());
            jSONObject.put("execute_cached_type", a());
            jSONObject.put("endcard_render", f());
            jSONObject.put("replay_time", u());
            jSONObject.put("play_speed_ratio", o());
            if (y() > 0.0d) {
                jSONObject.put("start", y());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int u() {
        return this.f8974t;
    }

    public String v() {
        return this.f8962h;
    }

    public String w() {
        return this.f8963i;
    }

    public int x() {
        return this.f8970p;
    }

    public double y() {
        return this.f8965k;
    }

    public void z(int i10) {
        this.f8972r = i10;
    }
}
