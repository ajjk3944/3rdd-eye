package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ha0 extends ia0 {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f11790b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11791c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11792d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11793e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11794f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f11795h;

    public ha0(wp0 wp0Var, JSONObject jSONObject) {
        super(wp0Var);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectG = pd.b.G(jSONObject, strArr);
        this.f11790b = jSONObjectG == null ? null : jSONObjectG.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectG2 = pd.b.G(jSONObject, strArr2);
        this.f11791c = jSONObjectG2 == null ? false : jSONObjectG2.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectG3 = pd.b.G(jSONObject, strArr3);
        this.f11792d = jSONObjectG3 == null ? false : jSONObjectG3.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectG4 = pd.b.G(jSONObject, strArr4);
        this.f11793e = jSONObjectG4 == null ? false : jSONObjectG4.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectG5 = pd.b.G(jSONObject, strArr5);
        this.g = jSONObjectG5 != null ? jSONObjectG5.optString(strArr5[0], "") : "";
        this.f11794f = jSONObject.optJSONObject("overlay") != null;
        this.f11795h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final boolean a() {
        return this.f11794f;
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final boolean b() {
        return this.f11791c;
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final boolean c() {
        return this.f11793e;
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final boolean d() {
        return this.f11792d;
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final String e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final iq0 f() {
        JSONObject jSONObject = this.f11795h;
        return jSONObject != null ? new iq0(jSONObject) : this.f12183a.V;
    }
}
