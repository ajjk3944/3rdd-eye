package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546mm extends C1600nm {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f15651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15652c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15653d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15654e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15655f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15656g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f15657h;

    public C1546mm(Qt qt, JSONObject jSONObject) {
        super(qt);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectJ = a4.p.J(jSONObject, strArr);
        this.f15651b = jSONObjectJ == null ? null : jSONObjectJ.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectJ2 = a4.p.J(jSONObject, strArr2);
        this.f15652c = jSONObjectJ2 == null ? false : jSONObjectJ2.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectJ3 = a4.p.J(jSONObject, strArr3);
        this.f15653d = jSONObjectJ3 == null ? false : jSONObjectJ3.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectJ4 = a4.p.J(jSONObject, strArr4);
        this.f15654e = jSONObjectJ4 == null ? false : jSONObjectJ4.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectJ5 = a4.p.J(jSONObject, strArr5);
        this.f15656g = jSONObjectJ5 != null ? jSONObjectJ5.optString(strArr5[0], "") : "";
        this.f15655f = jSONObject.optJSONObject("overlay") != null;
        this.f15657h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final boolean a() {
        return this.f15655f;
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final boolean b() {
        return this.f15652c;
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final boolean c() {
        return this.f15654e;
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final boolean d() {
        return this.f15653d;
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final String e() {
        return this.f15656g;
    }

    @Override // com.google.android.gms.internal.ads.C1600nm
    public final C1014cu f() {
        JSONObject jSONObject = this.f15657h;
        return jSONObject != null ? new C1014cu(0, jSONObject) : this.f15813a.f10752V;
    }
}
