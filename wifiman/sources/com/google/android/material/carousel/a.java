package com.google.android.material.carousel;

import z1.AbstractC8707a;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f37201a;

    /* renamed from: b, reason: collision with root package name */
    float f37202b;

    /* renamed from: c, reason: collision with root package name */
    int f37203c;

    /* renamed from: d, reason: collision with root package name */
    int f37204d;

    /* renamed from: e, reason: collision with root package name */
    float f37205e;

    /* renamed from: f, reason: collision with root package name */
    float f37206f;

    /* renamed from: g, reason: collision with root package name */
    final int f37207g;

    /* renamed from: h, reason: collision with root package name */
    final float f37208h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f37201a = i10;
        this.f37202b = AbstractC8707a.a(f10, f11, f12);
        this.f37203c = i11;
        this.f37205e = f13;
        this.f37204d = i12;
        this.f37206f = f14;
        this.f37207g = i13;
        d(f15, f11, f12, f14);
        this.f37208h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f37206f) * this.f37201a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar2 = new a(i10, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f37208h < aVar.f37208h) {
                        if (aVar2.f37208h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                i12++;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f37203c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f37202b;
            this.f37202b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f37202b;
            this.f37202b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f37203c;
        float f17 = i11 > 0 ? this.f37202b : 0.0f;
        this.f37202b = f17;
        float fA = a(f10, i11, f17, this.f37204d, this.f37207g);
        this.f37206f = fA;
        float f18 = (this.f37202b + fA) / 2.0f;
        this.f37205e = f18;
        int i12 = this.f37204d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f37207g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f37205e -= fMin / this.f37204d;
            this.f37206f += fMin / this.f37207g;
        } else {
            this.f37205e += fMin / this.f37204d;
            this.f37206f -= fMin / this.f37207g;
        }
    }

    private float f() {
        return (this.f37206f * this.f37207g) + (this.f37205e * this.f37204d) + (this.f37202b * this.f37203c);
    }

    private boolean g() {
        int i10 = this.f37207g;
        if (i10 <= 0 || this.f37203c <= 0 || this.f37204d <= 0) {
            return i10 <= 0 || this.f37203c <= 0 || this.f37206f > this.f37202b;
        }
        float f10 = this.f37206f;
        float f11 = this.f37205e;
        return f10 > f11 && f11 > this.f37202b;
    }

    int e() {
        return this.f37203c + this.f37204d + this.f37207g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f37201a + ", smallCount=" + this.f37203c + ", smallSize=" + this.f37202b + ", mediumCount=" + this.f37204d + ", mediumSize=" + this.f37205e + ", largeCount=" + this.f37207g + ", largeSize=" + this.f37206f + ", cost=" + this.f37208h + "]";
    }
}
