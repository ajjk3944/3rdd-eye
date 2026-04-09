package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.jn1;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class ColorizedRatingView extends jn1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23660a = Color.parseColor("#FFF4C900");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(Context context) {
        super(context);
        l.f(context, "context");
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                l.c(drawable2);
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    drawable2.setColorFilter(new BlendModeColorFilter(-3355444, BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                l.c(drawable3);
                int i10 = f23660a;
                if (i >= 29) {
                    drawable3.setColorFilter(new BlendModeColorFilter(i10, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                l.c(drawable4);
                if (i >= 29) {
                    drawable4.setColorFilter(new BlendModeColorFilter(i10, BlendMode.SRC_ATOP));
                } else {
                    drawable4.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorizedRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
