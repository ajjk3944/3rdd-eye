package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5828a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5830c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5831d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5832e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5833f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5834g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5835h;

    /* renamed from: i, reason: collision with root package name */
    private final float f5836i;

    /* renamed from: j, reason: collision with root package name */
    private final float f5837j;

    public d8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f5828a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f5829b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f5830c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f5831d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f5832e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f5833f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f5834g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f5835h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f5836i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f5837j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f5836i;
    }

    public long b() {
        return this.f5834g;
    }

    public float c() {
        return this.f5837j;
    }

    public long d() {
        return this.f5835h;
    }

    public int e() {
        return this.f5831d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d8 d8Var = (d8) obj;
            if (this.f5828a == d8Var.f5828a && this.f5829b == d8Var.f5829b && this.f5830c == d8Var.f5830c && this.f5831d == d8Var.f5831d && this.f5832e == d8Var.f5832e && this.f5833f == d8Var.f5833f && this.f5834g == d8Var.f5834g && this.f5835h == d8Var.f5835h && Float.compare(d8Var.f5836i, this.f5836i) == 0 && Float.compare(d8Var.f5837j, this.f5837j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f5829b;
    }

    public int g() {
        return this.f5830c;
    }

    public long h() {
        return this.f5833f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f5828a * 31) + this.f5829b) * 31) + this.f5830c) * 31) + this.f5831d) * 31) + (this.f5832e ? 1 : 0)) * 31) + this.f5833f) * 31) + this.f5834g) * 31) + this.f5835h) * 31;
        float f10 = this.f5836i;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f5837j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f5828a;
    }

    public boolean j() {
        return this.f5832e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f5828a + ", heightPercentOfScreen=" + this.f5829b + ", margin=" + this.f5830c + ", gravity=" + this.f5831d + ", tapToFade=" + this.f5832e + ", tapToFadeDurationMillis=" + this.f5833f + ", fadeInDurationMillis=" + this.f5834g + ", fadeOutDurationMillis=" + this.f5835h + ", fadeInDelay=" + this.f5836i + ", fadeOutDelay=" + this.f5837j + '}';
    }
}
