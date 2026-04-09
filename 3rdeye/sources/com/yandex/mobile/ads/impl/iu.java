package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class iu {
    public static hu a(Context context, View view, AttributeSet attributeSet, int i) {
        float dimensionPixelSize;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(view, "view");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalRoundImageView, i, 0);
            kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0.0f;
        }
        float f10 = dimensionPixelSize;
        return new hu(view, f10, f10, f10, f10);
    }
}
