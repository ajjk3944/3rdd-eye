package com.google.android.material.bottomappbar;

import g5.g;

/* loaded from: classes2.dex */
public class d extends g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float f9989a;

    /* renamed from: b, reason: collision with root package name */
    public float f9990b;

    /* renamed from: c, reason: collision with root package name */
    public float f9991c;

    /* renamed from: d, reason: collision with root package name */
    public float f9992d;

    /* renamed from: e, reason: collision with root package name */
    public float f9993e;

    /* renamed from: f, reason: collision with root package name */
    public float f9994f = -1.0f;

    public d(float f10, float f11, float f12) {
        this.f9990b = f10;
        this.f9989a = f11;
        k(f12);
        this.f9993e = 0.0f;
    }

    @Override // g5.g
    public void b(float f10, float f11, float f12, com.google.android.material.shape.c cVar) {
        float f13;
        float f14;
        float f15 = this.f9991c;
        if (f15 == 0.0f) {
            cVar.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f9990b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f9989a;
        float f18 = f11 + this.f9993e;
        float f19 = (this.f9992d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            cVar.m(f10, 0.0f);
            return;
        }
        float f20 = this.f9994f;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        cVar.m(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        cVar.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            cVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f9990b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            cVar.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f9990b;
            cVar.m(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f9990b;
            cVar.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        cVar.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        cVar.m(f10, 0.0f);
    }

    public float c() {
        return this.f9992d;
    }

    public float e() {
        return this.f9994f;
    }

    public float f() {
        return this.f9990b;
    }

    public float g() {
        return this.f9989a;
    }

    public float i() {
        return this.f9991c;
    }

    public float j() {
        return this.f9993e;
    }

    public void k(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f9992d = f10;
    }

    public void l(float f10) {
        this.f9994f = f10;
    }

    public void m(float f10) {
        this.f9990b = f10;
    }

    public void n(float f10) {
        this.f9989a = f10;
    }

    public void o(float f10) {
        this.f9991c = f10;
    }

    public void p(float f10) {
        this.f9993e = f10;
    }
}
