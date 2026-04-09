package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f20814a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20815b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20816c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20817d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20818e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20819f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20820g;

    /* renamed from: h, reason: collision with root package name */
    private final int f20821h;
    private final float i;

    /* renamed from: j, reason: collision with root package name */
    private final float f20822j;

    public q7(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f20814a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f20815b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f20816c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f20817d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f20818e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f20819f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f20820g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f20821h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f20822j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.i;
    }

    public long b() {
        return this.f20820g;
    }

    public float c() {
        return this.f20822j;
    }

    public long d() {
        return this.f20821h;
    }

    public int e() {
        return this.f20817d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q7 q7Var = (q7) obj;
            if (this.f20814a == q7Var.f20814a && this.f20815b == q7Var.f20815b && this.f20816c == q7Var.f20816c && this.f20817d == q7Var.f20817d && this.f20818e == q7Var.f20818e && this.f20819f == q7Var.f20819f && this.f20820g == q7Var.f20820g && this.f20821h == q7Var.f20821h && Float.compare(q7Var.i, this.i) == 0 && Float.compare(q7Var.f20822j, this.f20822j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f20815b;
    }

    public int g() {
        return this.f20816c;
    }

    public long h() {
        return this.f20819f;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f20814a * 31) + this.f20815b) * 31) + this.f20816c) * 31) + this.f20817d) * 31) + (this.f20818e ? 1 : 0)) * 31) + this.f20819f) * 31) + this.f20820g) * 31) + this.f20821h) * 31;
        float f10 = this.i;
        int iFloatToIntBits = (i + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f20822j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f20814a;
    }

    public boolean j() {
        return this.f20818e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f20814a + ", heightPercentOfScreen=" + this.f20815b + ", margin=" + this.f20816c + ", gravity=" + this.f20817d + ", tapToFade=" + this.f20818e + ", tapToFadeDurationMillis=" + this.f20819f + ", fadeInDurationMillis=" + this.f20820g + ", fadeOutDurationMillis=" + this.f20821h + ", fadeInDelay=" + this.i + ", fadeOutDelay=" + this.f20822j + '}';
    }
}
