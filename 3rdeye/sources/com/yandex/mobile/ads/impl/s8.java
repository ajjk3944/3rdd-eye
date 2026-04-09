package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class s8 {

    /* renamed from: a, reason: collision with root package name */
    private wn2 f32890a;

    /* renamed from: b, reason: collision with root package name */
    private C4079b3 f32891b;

    /* renamed from: c, reason: collision with root package name */
    private rv0 f32892c;

    /* renamed from: d, reason: collision with root package name */
    private int f32893d;

    /* renamed from: e, reason: collision with root package name */
    private long f32894e;

    public s8() {
        g();
        this.f32890a = new wn2(null);
    }

    public void a() {
    }

    public void b() {
        this.f32890a.clear();
    }

    public final C4079b3 c() {
        return this.f32891b;
    }

    public final rv0 d() {
        return this.f32892c;
    }

    public final void e() {
        jo2.a(this.f32890a.get());
    }

    public final void f() {
        jo2.b(this.f32890a.get());
    }

    public final void g() {
        this.f32894e = System.nanoTime();
        this.f32893d = 1;
    }

    public final void a(float f10) {
        jo2.a(this.f32890a.get(), f10);
    }

    public final void b(String str, long j4) {
        if (j4 < this.f32894e || this.f32893d == 3) {
            return;
        }
        this.f32893d = 3;
        jo2.a(this.f32890a.get(), str);
    }

    public final void a(WebView webView) {
        this.f32890a = new wn2(webView);
    }

    public final void a(C4079b3 c4079b3) {
        this.f32891b = c4079b3;
    }

    public final void a(o8 o8Var) {
        jo2.a(this.f32890a.get(), o8Var.d());
    }

    public final void a(rv0 rv0Var) {
        this.f32892c = rv0Var;
    }

    public void a(in2 in2Var, p8 p8Var) {
        a(in2Var, p8Var, null);
    }

    public final void a(in2 in2Var, p8 p8Var, JSONObject jSONObject) throws JSONException {
        String strI = in2Var.i();
        JSONObject jSONObject2 = new JSONObject();
        vn2.a(jSONObject2, "environment", "app");
        vn2.a(jSONObject2, "adSessionType", p8Var.a());
        vn2.a(jSONObject2, "deviceInfo", ln2.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        vn2.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        vn2.a(jSONObject3, "partnerName", p8Var.f().b());
        vn2.a(jSONObject3, "partnerVersion", p8Var.f().c());
        vn2.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        vn2.a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        vn2.a(jSONObject4, "appId", eo2.a().b().getApplicationContext().getPackageName());
        vn2.a(jSONObject2, "app", jSONObject4);
        if (p8Var.b() != null) {
            vn2.a(jSONObject2, "contentUrl", p8Var.b());
        }
        if (p8Var.c() != null) {
            vn2.a(jSONObject2, "customReferenceData", p8Var.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (ra2 ra2Var : p8Var.g()) {
            vn2.a(jSONObject5, ra2Var.b(), ra2Var.c());
        }
        jo2.a(this.f32890a.get(), strI, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(String str) {
        jo2.a(this.f32890a.get(), str, (JSONObject) null);
    }

    public final void a(String str, long j4) {
        if (j4 >= this.f32894e) {
            this.f32893d = 2;
            jo2.a(this.f32890a.get(), str);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        jo2.a(this.f32890a.get(), str, jSONObject);
    }

    public final void a(JSONObject jSONObject) {
        jo2.b(this.f32890a.get(), jSONObject);
    }

    public final void a(boolean z10) {
        if (this.f32890a.get() != null) {
            jo2.b(this.f32890a.get(), z10 ? "foregrounded" : "backgrounded");
        }
    }
}
