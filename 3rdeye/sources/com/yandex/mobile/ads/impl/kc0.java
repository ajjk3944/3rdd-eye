package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* loaded from: classes3.dex */
final class kc0 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f29594a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f29595b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final u42<float[]> f29596c = new u42<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f29597d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public final void b(long j4, float[] fArr) {
        this.f29596c.a(fArr, j4);
    }

    public final void a(long j4, float[] fArr) {
        float[] fArrB = this.f29596c.b(j4);
        if (fArrB == null) {
            return;
        }
        float[] fArr2 = this.f29595b;
        float f10 = fArrB[0];
        float f11 = -fArrB[1];
        float f12 = -fArrB[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f29597d) {
            a(this.f29594a, this.f29595b);
            this.f29597d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f29594a, 0, this.f29595b, 0);
    }

    public final void a() {
        this.f29596c.a();
        this.f29597d = false;
    }
}
