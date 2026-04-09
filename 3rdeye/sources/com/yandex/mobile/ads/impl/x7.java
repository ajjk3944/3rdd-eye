package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes3.dex */
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static final GradientDrawable f35211a;

    /* renamed from: b, reason: collision with root package name */
    public static final ColorDrawable f35212b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f35211a = gradientDrawable;
        f35212b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
