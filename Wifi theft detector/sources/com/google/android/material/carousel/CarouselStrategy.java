package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class CarouselStrategy {

    /* renamed from: a, reason: collision with root package name */
    public float f10156a;

    /* renamed from: b, reason: collision with root package name */
    public float f10157b;

    public enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f10157b;
    }

    public float d() {
        return this.f10156a;
    }

    public StrategyType e() {
        return StrategyType.CONTAINED;
    }

    public void f(Context context) {
        float fH = this.f10156a;
        if (fH <= 0.0f) {
            fH = a.h(context);
        }
        this.f10156a = fH;
        float fG = this.f10157b;
        if (fG <= 0.0f) {
            fG = a.g(context);
        }
        this.f10157b = fG;
    }

    public abstract b g(r4.b bVar, View view);

    public abstract boolean h(r4.b bVar, int i10);
}
