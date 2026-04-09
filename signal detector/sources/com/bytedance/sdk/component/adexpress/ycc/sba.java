package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class sba extends View {
    private Paint bw;
    private ValueAnimator dg;
    private float emc;
    private float msw;
    private int ru;
    private float uym;
    private ValueAnimator xq;
    private long ycc;
    private float ypw;
    private Animator.AnimatorListener zz;

    public sba(Context context, int i) {
        super(context);
        this.ycc = 300L;
        this.uym = 0.0f;
        this.ru = i;
        emc();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.emc, this.ypw, this.uym, this.bw);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.emc = i / 2.0f;
        this.ypw = i3 / 2.0f;
        this.msw = (float) (Math.hypot(i, i3) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.zz = animatorListener;
    }

    public void xq() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.msw, 0.0f);
        this.dg = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ycc);
        this.dg.setInterpolator(new LinearInterpolator());
        this.dg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.sba.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                sba.this.uym = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sba.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.zz;
        if (animatorListener != null) {
            this.dg.addListener(animatorListener);
        }
        this.dg.start();
    }

    public void ypw() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.msw);
        this.xq = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ycc);
        this.xq.setInterpolator(new LinearInterpolator());
        this.xq.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.sba.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                sba.this.uym = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sba.this.invalidate();
            }
        });
        this.xq.start();
    }

    public void emc() {
        Paint paint = new Paint(1);
        this.bw = paint;
        paint.setStyle(Paint.Style.FILL);
        this.bw.setColor(this.ru);
    }
}
