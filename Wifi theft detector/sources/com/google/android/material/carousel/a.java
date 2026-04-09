package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.b;
import j4.d;

/* loaded from: classes2.dex */
public abstract class a {
    public static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    public static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    public static b c(Context context, float f10, int i10, r4.a aVar) {
        float f11;
        float f12;
        float fMin = Math.min(f(context) + f10, aVar.f24164f);
        float f13 = fMin / 2.0f;
        float f14 = 0.0f - f13;
        float fB = b(0.0f, aVar.f24160b, aVar.f24161c);
        float fJ = j(0.0f, a(fB, aVar.f24160b, (int) Math.floor(aVar.f24161c / 2.0f)), aVar.f24160b, aVar.f24161c);
        float fB2 = b(fJ, aVar.f24163e, aVar.f24162d);
        float fJ2 = j(fJ, a(fB2, aVar.f24163e, (int) Math.floor(aVar.f24162d / 2.0f)), aVar.f24163e, aVar.f24162d);
        float fB3 = b(fJ2, aVar.f24164f, aVar.f24165g);
        float fJ3 = j(fJ2, a(fB3, aVar.f24164f, aVar.f24165g), aVar.f24164f, aVar.f24165g);
        float fB4 = b(fJ3, aVar.f24163e, aVar.f24162d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f24163e, (int) Math.ceil(aVar.f24162d / 2.0f)), aVar.f24163e, aVar.f24162d), aVar.f24160b, aVar.f24161c);
        float f15 = i10 + f13;
        float fB6 = CarouselStrategy.b(fMin, aVar.f24164f, f10);
        float fB7 = CarouselStrategy.b(aVar.f24160b, aVar.f24164f, f10);
        float fB8 = CarouselStrategy.b(aVar.f24163e, aVar.f24164f, f10);
        b.C0204b c0204bA = new b.C0204b(aVar.f24164f, i10).a(f14, fB6, fMin);
        if (aVar.f24161c > 0) {
            f11 = 2.0f;
            f12 = fB6;
            c0204bA.g(fB, fB7, aVar.f24160b, (int) Math.floor(r7 / 2.0f));
        } else {
            f11 = 2.0f;
            f12 = fB6;
        }
        if (aVar.f24162d > 0) {
            c0204bA.g(fB2, fB8, aVar.f24163e, (int) Math.floor(r4 / f11));
        }
        c0204bA.h(fB3, 0.0f, aVar.f24164f, aVar.f24165g, true);
        if (aVar.f24162d > 0) {
            c0204bA.g(fB4, fB8, aVar.f24163e, (int) Math.ceil(r4 / f11));
        }
        if (aVar.f24161c > 0) {
            c0204bA.g(fB5, fB7, aVar.f24160b, (int) Math.ceil(r0 / f11));
        }
        c0204bA.a(f15, f12, fMin);
        return c0204bA.i();
    }

    public static b d(Context context, float f10, int i10, r4.a aVar, int i11) {
        return i11 == 1 ? c(context, f10, i10, aVar) : e(context, f10, i10, aVar);
    }

    public static b e(Context context, float f10, int i10, r4.a aVar) {
        float fMin = Math.min(f(context) + f10, aVar.f24164f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, aVar.f24164f, aVar.f24165g);
        float fJ = j(0.0f, a(fB, aVar.f24164f, aVar.f24165g), aVar.f24164f, aVar.f24165g);
        float fB2 = b(fJ, aVar.f24163e, aVar.f24162d);
        float fB3 = b(j(fJ, fB2, aVar.f24163e, aVar.f24162d), aVar.f24160b, aVar.f24161c);
        float f13 = i10 + f11;
        float fB4 = CarouselStrategy.b(fMin, aVar.f24164f, f10);
        float fB5 = CarouselStrategy.b(aVar.f24160b, aVar.f24164f, f10);
        float fB6 = CarouselStrategy.b(aVar.f24163e, aVar.f24164f, f10);
        b.C0204b c0204bH = new b.C0204b(aVar.f24164f, i10).a(f12, fB4, fMin).h(fB, 0.0f, aVar.f24164f, aVar.f24165g, true);
        if (aVar.f24162d > 0) {
            c0204bH.b(fB2, fB6, aVar.f24163e);
        }
        int i11 = aVar.f24161c;
        if (i11 > 0) {
            c0204bH.g(fB3, fB5, aVar.f24160b, i11);
        }
        c0204bH.a(f13, fB4, fMin);
        return c0204bH.i();
    }

    public static float f(Context context) {
        return context.getResources().getDimension(d.m3_carousel_gone_size);
    }

    public static float g(Context context) {
        return context.getResources().getDimension(d.m3_carousel_small_item_size_max);
    }

    public static float h(Context context) {
        return context.getResources().getDimension(d.m3_carousel_small_item_size_min);
    }

    public static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
