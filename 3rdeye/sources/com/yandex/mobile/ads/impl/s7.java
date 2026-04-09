package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes3.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f32884a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* renamed from: b, reason: collision with root package name */
    private static final LayerDrawable f32885b;

    static {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{r7.c(), r7.c()});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f32885b = layerDrawable;
    }

    public static LayerDrawable a() {
        return f32885b;
    }
}
