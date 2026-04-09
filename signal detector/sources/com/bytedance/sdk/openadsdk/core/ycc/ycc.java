package com.bytedance.sdk.openadsdk.core.ycc;

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

/* loaded from: classes.dex */
public class ycc extends FrameLayout {
    private Drawable bw;
    private Drawable dg;
    private int emc;
    private boolean msw;
    private ValueAnimator uym;
    private Drawable xq;
    private boolean ycc;
    private int ypw;

    public ycc(Context context) {
        super(context);
        this.emc = 100;
    }

    private void emc() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.uym = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.uym.setRepeatCount(-1);
        this.uym.setInterpolator(new LinearInterpolator());
        this.uym.setRepeatMode(1);
        this.uym.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ycc.ycc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ycc.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.uym.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ycc = true;
        if (this.bw != null) {
            emc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ycc = false;
        ValueAnimator valueAnimator = this.uym;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.uym.removeAllUpdateListeners();
            this.uym = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ValueAnimator valueAnimator = this.uym;
            if (valueAnimator == null || this.msw) {
                return;
            }
            this.msw = true;
            valueAnimator.pause();
            return;
        }
        if (this.msw) {
            this.msw = false;
            ValueAnimator valueAnimator2 = this.uym;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                emc();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.bw = drawable;
        setProgressDrawable(drawable);
        if (this.ycc && this.uym == null) {
            emc();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.emc(this, layoutParams));
    }

    public void setMax(int i) {
        this.emc = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(i, i3, i6, i7);
    }

    public void setProgress(int i) {
        this.ypw = i;
        Drawable drawable = this.xq;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.emc));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.dg = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.dg;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.dg).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.xq = drawable3;
                }
            }
        }
        Drawable drawable4 = this.dg;
        if (drawable4 instanceof RotateDrawable) {
            this.xq = drawable4;
        }
    }

    public ycc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.emc = 100;
    }
}
