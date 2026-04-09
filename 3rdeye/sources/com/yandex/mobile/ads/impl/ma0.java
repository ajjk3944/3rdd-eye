package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class ma0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f30317d = Color.parseColor("#66000000");

    /* renamed from: e, reason: collision with root package name */
    private static final int f30318e = Color.parseColor("#00000000");

    /* renamed from: f, reason: collision with root package name */
    private static final int f30319f = Color.parseColor("#7f7f7f");

    /* renamed from: a, reason: collision with root package name */
    private final Context f30320a;

    /* renamed from: b, reason: collision with root package name */
    private final kt f30321b;

    /* renamed from: c, reason: collision with root package name */
    private final na0 f30322c;

    public ma0(Context context, kt nativeAdAssets, na0 feedbackAppearanceResolver) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(feedbackAppearanceResolver, "feedbackAppearanceResolver");
        this.f30320a = context;
        this.f30321b = nativeAdAssets;
        this.f30322c = feedbackAppearanceResolver;
    }

    public final void a(ImageView feedbackView, FrameLayout feedbackContainer, int i) {
        kotlin.jvm.internal.l.f(feedbackView, "feedbackView");
        kotlin.jvm.internal.l.f(feedbackContainer, "feedbackContainer");
        if (!this.f30322c.a()) {
            int i10 = f30319f;
            Drawable drawable = C5848a.getDrawable(this.f30320a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
            if (drawable != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
            feedbackView.setImageDrawable(drawable);
            feedbackContainer.setPadding(0, 0, 0, 0);
            feedbackContainer.setBackground(null);
            feedbackContainer.setVisibility(0);
            return;
        }
        if (this.f30321b.i() != null) {
            int i11 = f30319f;
            Drawable drawable2 = C5848a.getDrawable(this.f30320a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
            if (drawable2 != null) {
                drawable2.setColorFilter(porterDuffColorFilter2);
            }
            feedbackView.setImageDrawable(drawable2);
            feedbackContainer.setPadding(0, 0, 0, 0);
            feedbackContainer.setBackground(null);
            feedbackContainer.setVisibility(8);
            return;
        }
        if (this.f30321b.h() != null) {
            Drawable drawable3 = C5848a.getDrawable(this.f30320a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            if (drawable3 != null) {
                drawable3.setColorFilter(porterDuffColorFilter3);
            }
            feedbackView.setImageDrawable(drawable3);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f30317d, f30318e});
            feedbackContainer.setPadding(0, 0, 0, i);
            feedbackContainer.setBackground(gradientDrawable);
            feedbackContainer.setVisibility(0);
        }
    }
}
