package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f3979a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3980b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3981c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3982d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3983e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3984f;
    private final int g;

    /* renamed from: h, reason: collision with root package name */
    private final int f3985h;

    /* renamed from: i, reason: collision with root package name */
    private final float f3986i;
    private final float j;

    public d8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f3979a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f3980b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f3981c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f3982d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f3983e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f3984f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f3985h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f3986i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f3986i;
    }

    public long b() {
        return this.g;
    }

    public float c() {
        return this.j;
    }

    public long d() {
        return this.f3985h;
    }

    public int e() {
        return this.f3982d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d8 d8Var = (d8) obj;
            if (this.f3979a == d8Var.f3979a && this.f3980b == d8Var.f3980b && this.f3981c == d8Var.f3981c && this.f3982d == d8Var.f3982d && this.f3983e == d8Var.f3983e && this.f3984f == d8Var.f3984f && this.g == d8Var.g && this.f3985h == d8Var.f3985h && Float.compare(d8Var.f3986i, this.f3986i) == 0 && Float.compare(d8Var.j, this.j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f3980b;
    }

    public int g() {
        return this.f3981c;
    }

    public long h() {
        return this.f3984f;
    }

    public int hashCode() {
        int i4 = ((((((((((((((this.f3979a * 31) + this.f3980b) * 31) + this.f3981c) * 31) + this.f3982d) * 31) + (this.f3983e ? 1 : 0)) * 31) + this.f3984f) * 31) + this.g) * 31) + this.f3985h) * 31;
        float f10 = this.f3986i;
        int iFloatToIntBits = (i4 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f3979a;
    }

    public boolean j() {
        return this.f3983e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoButtonProperties{widthPercentOfScreen=");
        sb2.append(this.f3979a);
        sb2.append(", heightPercentOfScreen=");
        sb2.append(this.f3980b);
        sb2.append(", margin=");
        sb2.append(this.f3981c);
        sb2.append(", gravity=");
        sb2.append(this.f3982d);
        sb2.append(", tapToFade=");
        sb2.append(this.f3983e);
        sb2.append(", tapToFadeDurationMillis=");
        sb2.append(this.f3984f);
        sb2.append(", fadeInDurationMillis=");
        sb2.append(this.g);
        sb2.append(", fadeOutDurationMillis=");
        sb2.append(this.f3985h);
        sb2.append(", fadeInDelay=");
        sb2.append(this.f3986i);
        sb2.append(", fadeOutDelay=");
        return r5.c.k(sb2, this.j, '}');
    }
}
