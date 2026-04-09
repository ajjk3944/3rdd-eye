package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class aa extends View {
    private ValueAnimator bw;
    private float dg;
    private Context emc;
    private boolean uym;
    private RectF xq;
    private int ycc;
    private Paint ypw;

    public aa(Context context) {
        super(context);
        this.ycc = 1500;
        this.emc = context;
        Paint paint = new Paint();
        this.ypw = paint;
        paint.setAntiAlias(true);
        this.ypw.setStyle(Paint.Style.STROKE);
        this.ypw.setStrokeWidth(10.0f);
        this.ypw.setColor(Color.parseColor("#80FFFFFF"));
        this.xq = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.uym) {
            return;
        }
        canvas.drawArc(this.xq, 270.0f, this.dg, false, this.ypw);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.xq.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.ycc = i10;
    }

    public void xq() {
        this.uym = true;
        invalidate();
    }

    public void ypw() {
        ValueAnimator valueAnimator = this.bw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void emc() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.bw = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ycc);
        this.bw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.aa.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                aa.this.dg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.this.requestLayout();
            }
        });
        this.bw.start();
    }
}
