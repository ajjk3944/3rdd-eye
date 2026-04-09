package com.yandex.mobile.ads.impl;

import N7.B8;

/* loaded from: classes3.dex */
public final class o10 {

    /* renamed from: g, reason: collision with root package name */
    private static final o10 f31122g = new o10(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f31123a;

    /* renamed from: b, reason: collision with root package name */
    private final float f31124b;

    /* renamed from: c, reason: collision with root package name */
    private final float f31125c;

    /* renamed from: d, reason: collision with root package name */
    private final float f31126d;

    /* renamed from: e, reason: collision with root package name */
    private final float f31127e;

    /* renamed from: f, reason: collision with root package name */
    private final float f31128f;

    public o10(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f31123a = f10;
        this.f31124b = f11;
        this.f31125c = f12;
        this.f31126d = f13;
        this.f31127e = f14;
        this.f31128f = f15;
    }

    public final float b() {
        return this.f31126d;
    }

    public final float c() {
        return this.f31128f;
    }

    public final float d() {
        return this.f31127e;
    }

    public final float e() {
        return this.f31123a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return Float.compare(this.f31123a, o10Var.f31123a) == 0 && Float.compare(this.f31124b, o10Var.f31124b) == 0 && Float.compare(this.f31125c, o10Var.f31125c) == 0 && Float.compare(this.f31126d, o10Var.f31126d) == 0 && Float.compare(this.f31127e, o10Var.f31127e) == 0 && Float.compare(this.f31128f, o10Var.f31128f) == 0;
    }

    public final float f() {
        return this.f31125c;
    }

    public final float g() {
        return this.f31124b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f31128f) + B8.g(this.f31127e, B8.g(this.f31126d, B8.g(this.f31125c, B8.g(this.f31124b, Float.floatToIntBits(this.f31123a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f31123a + ", top=" + this.f31124b + ", right=" + this.f31125c + ", bottom=" + this.f31126d + ", cutoutTop=" + this.f31127e + ", cutoutBottom=" + this.f31128f + ")";
    }
}
