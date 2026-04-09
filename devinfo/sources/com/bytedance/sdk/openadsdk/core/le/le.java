package com.bytedance.sdk.openadsdk.core.le;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends FrameLayout {
    private Drawable fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f8192le;

    /* renamed from: lh, reason: collision with root package name */
    private Drawable f8193lh;
    private int ouw;
    private boolean pno;
    private ValueAnimator ra;
    private int vt;
    private Drawable yu;

    public le(Context context) {
        super(context);
        this.ouw = 100;
    }

    private void ouw() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.ra = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.ra.setRepeatCount(-1);
        this.ra.setInterpolator(new LinearInterpolator());
        this.ra.setRepeatMode(1);
        this.ra.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.le.le.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                le.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.ra.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8192le = true;
        if (this.fkw != null) {
            ouw();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8192le = false;
        ValueAnimator valueAnimator = this.ra;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ra.removeAllUpdateListeners();
            this.ra = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (i4 != 0) {
            ValueAnimator valueAnimator = this.ra;
            if (valueAnimator == null || this.pno) {
                return;
            }
            this.pno = true;
            valueAnimator.pause();
            return;
        }
        if (this.pno) {
            this.pno = false;
            ValueAnimator valueAnimator2 = this.ra;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                ouw();
            }
        }
    }

    public final void setIndeterminateDrawable(Drawable drawable) {
        this.fkw = drawable;
        setProgressDrawable(drawable);
        if (this.f8192le && this.ra == null) {
            ouw();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    public final void setMax(int i4) {
        this.ouw = i4;
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i10, int i11, int i12) {
        setPaddingRelative(i4, i10, i11, i12);
    }

    public final void setProgress(int i4) {
        this.vt = i4;
        Drawable drawable = this.f8193lh;
        if (drawable != null) {
            drawable.setLevel((int) ((i4 * 10000.0f) / this.ouw));
        }
    }

    public final void setProgressDrawable(Drawable drawable) {
        this.yu = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.yu;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                Drawable drawable3 = ((LayerDrawable) this.yu).getDrawable(i4);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f8193lh = drawable3;
                }
            }
        }
        Drawable drawable4 = this.yu;
        if (drawable4 instanceof RotateDrawable) {
            this.f8193lh = drawable4;
        }
    }

    public le(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.Widget.ProgressBar.Horizontal);
        this.ouw = 100;
    }
}
