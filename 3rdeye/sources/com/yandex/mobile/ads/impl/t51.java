package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class t51 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f33448b = Color.parseColor("#eaeaea");

    /* renamed from: a, reason: collision with root package name */
    private final ImageView[] f33449a;

    public t51(ImageView... imageViews) {
        kotlin.jvm.internal.l.f(imageViews, "imageViews");
        this.f33449a = imageViews;
        b();
    }

    public final void a() {
        for (ImageView imageView : this.f33449a) {
            Drawable background = imageView.getBackground();
            kotlin.jvm.internal.l.d(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            ColorDrawable colorDrawable = (ColorDrawable) background;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", KotlinVersion.MAX_COMPONENT_VALUE, 0));
                kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
                objectAnimatorOfPropertyValuesHolder.setTarget(colorDrawable);
                objectAnimatorOfPropertyValuesHolder.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder.start();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, KotlinVersion.MAX_COMPONENT_VALUE));
                kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
                objectAnimatorOfPropertyValuesHolder2.setTarget(drawable);
                objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f33449a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f33448b);
                }
            }
        }
    }
}
