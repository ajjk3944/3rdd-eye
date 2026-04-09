package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class b02 {
    public static final float a(xz1 xz1Var, RectF view, RectF image) {
        kotlin.jvm.internal.l.f(xz1Var, "<this>");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(image, "image");
        float fHeight = view.height();
        float fWidth = view.width();
        float fHeight2 = image.height();
        float fWidth2 = image.width();
        if (fHeight == 0.0f || fWidth == 0.0f || fHeight2 == 0.0f || fWidth2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float fMin = Math.min(1.0f, fWidth2 / fHeight2 > fWidth / fHeight ? fHeight / fHeight2 : fWidth / fWidth2);
        if (fWidth < ((int) (xz1Var.c() * fMin)) || fHeight < ((int) (xz1Var.b() * fMin))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(fHeight - (xz1Var.b() * fMin)) + Math.abs(fWidth - (xz1Var.c() * fMin));
    }
}
