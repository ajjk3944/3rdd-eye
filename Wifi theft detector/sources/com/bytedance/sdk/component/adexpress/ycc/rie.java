package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public class rie extends View {
    private static int xq = 50;
    private ObjectAnimator dg;
    private Paint emc;
    private int ypw;

    public rie(Context context) {
        this(context, null);
    }

    private void xq() {
        Paint paint = new Paint();
        this.emc = paint;
        paint.setAntiAlias(true);
        this.emc.setColor(Color.parseColor("#FFFFFFFF"));
        this.emc.setStyle(Paint.Style.STROKE);
        this.emc.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.dg = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.emc.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.ypw, this.emc);
    }

    public void ypw() {
        clearAnimation();
    }

    public rie(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public rie(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.ypw = 10;
        xq();
    }

    public void emc() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        xq = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.rie.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                rie.this.ypw = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                rie.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.rie.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                rie.this.dg.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                rie.this.setVisibility(0);
                rie.this.setAlpha(1.0f);
            }
        });
        valueAnimatorOfInt.start();
    }
}
