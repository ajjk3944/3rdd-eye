package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rv0 {

    /* renamed from: a, reason: collision with root package name */
    private final in2 f32786a;

    private rv0(in2 in2Var) {
        this.f32786a = in2Var;
    }

    public final void a() throws JSONException {
        yo0 yo0Var = yo0.f35940c;
        ko2.a(this.f32786a);
        JSONObject jSONObject = new JSONObject();
        vn2.a(jSONObject, "interactionType", yo0Var);
        this.f32786a.j().a("adUserInteraction", jSONObject);
    }

    public final void b() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("bufferFinish");
    }

    public final void c() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("bufferStart");
    }

    public final void d() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("complete");
    }

    public final void e() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("firstQuartile");
    }

    public final void f() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("midpoint");
    }

    public final void g() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("pause");
    }

    public final void h() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("resume");
    }

    public final void i() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("skipped");
    }

    public final void j() {
        ko2.a(this.f32786a);
        this.f32786a.j().a("thirdQuartile");
    }

    public static rv0 a(in2 in2Var) {
        if (in2Var.m()) {
            if (!in2Var.h()) {
                if (!in2Var.k()) {
                    if (in2Var.j().d() == null) {
                        rv0 rv0Var = new rv0(in2Var);
                        in2Var.j().a(rv0Var);
                        return rv0Var;
                    }
                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void a(float f10, float f11) throws JSONException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f11 >= 0.0f && f11 <= 1.0f) {
            ko2.a(this.f32786a);
            JSONObject jSONObject = new JSONObject();
            vn2.a(jSONObject, "duration", Float.valueOf(f10));
            vn2.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
            vn2.a(jSONObject, "deviceVolume", Float.valueOf(po2.a().d()));
            this.f32786a.j().a("start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    public final void a(float f10) throws JSONException {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            ko2.a(this.f32786a);
            JSONObject jSONObject = new JSONObject();
            vn2.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
            vn2.a(jSONObject, "deviceVolume", Float.valueOf(po2.a().d()));
            this.f32786a.j().a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
