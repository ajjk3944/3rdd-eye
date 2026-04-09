package com.bytedance.sdk.openadsdk.core.gbl.ypw.dg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes.dex */
public class emc extends View {
    private int bw;
    private int dg;
    private Paint emc;
    private dg gbl;
    private int msw;
    private float qh;
    private String ru;
    private ValueAnimator sup;
    private int sz;
    private float uym;
    private RectF xq;
    private float ycc;
    private Paint ypw;
    private int zz;

    public emc(Context context) {
        super(context);
        this.dg = com.bytedance.adsdk.ugeno.uym.emc.emc("#FFD813");
        this.bw = com.bytedance.adsdk.ugeno.uym.emc.emc("rgba(0, 0, 0, 0.5)");
        this.ycc = 3.0f;
        this.uym = 0.0f;
        this.msw = 0;
        this.zz = 100;
        this.ru = "line";
        this.sz = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        setBackgroundColor(0);
        emc();
    }

    private void ypw(Canvas canvas) {
        Paint paint = this.emc;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f2 = this.ycc;
        float f5 = this.uym;
        canvas.drawRoundRect(0.0f, 0.0f, width, f2, f5, f5, this.emc);
        float width2 = (getWidth() * this.qh) / this.zz;
        this.ypw.setStyle(style);
        if (!TextUtils.equals(this.ru, "line_reverse")) {
            float f6 = this.ycc;
            float f7 = this.uym;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f6, f7, f7, this.ypw);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f8 = this.ycc;
            float f9 = this.uym;
            canvas.drawRoundRect(width3, 0.0f, width4, f8, f9, f9, this.ypw);
        }
    }

    public int getMaxProgress() {
        return this.zz;
    }

    public int getProgress() {
        return this.msw;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.sup;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.ru, "ring") || TextUtils.equals(this.ru, "ring_reverse")) {
            emc(canvas);
        } else {
            ypw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.gbl;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i, i3);
        }
        if (TextUtils.equals(this.ru, "ring") || TextUtils.equals(this.ru, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.ycc);
        }
        dg dgVar2 = this.gbl;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    public void setAnimationDuration(int i) {
        this.sz = i;
        this.sup.setDuration(i);
    }

    public void setMaxProgress(int i) {
        this.zz = i;
        invalidate();
    }

    public void setProgress(int i) {
        int iMin = Math.min(i, this.zz);
        this.msw = iMin;
        if (iMin < 0) {
            this.msw = 0;
        }
        ValueAnimator valueAnimator = this.sup;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.sup.setFloatValues(this.qh, this.msw);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.qh + " progress=" + i);
            this.sup.start();
        }
    }

    private void emc() {
        Paint paint = new Paint(1);
        this.emc = paint;
        paint.setColor(this.bw);
        Paint paint2 = this.emc;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.ypw = paint3;
        paint3.setColor(this.dg);
        this.ypw.setStyle(style);
        this.xq = new RectF();
        this.qh = this.msw;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.sup = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.sz);
        this.sup.setInterpolator(new LinearInterpolator());
        this.sup.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                emc.this.qh = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emc.this.invalidate();
            }
        });
    }

    public emc ypw(int i) {
        this.emc.setColor(i);
        return this;
    }

    public emc ypw(float f2) {
        this.uym = f2;
        return this;
    }

    private void emc(Canvas canvas) {
        float f2;
        int i;
        float f5 = this.ycc / 2.0f;
        this.xq.set(f5, f5, getWidth() - f5, getHeight() - f5);
        Paint paint = this.emc;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.emc.setStrokeWidth(this.ycc);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f5, this.emc);
        if (TextUtils.equals(this.ru, "ring_reverse")) {
            f2 = this.qh * (-360.0f);
            i = this.zz;
        } else {
            f2 = this.qh * 360.0f;
            i = this.zz;
        }
        float f6 = f2 / i;
        this.ypw.setStyle(style);
        this.ypw.setStrokeWidth(this.ycc);
        if (this.uym <= 0.0f) {
            this.ypw.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.ypw.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.xq, -90.0f, f6, false, this.ypw);
    }

    public emc emc(int i) {
        this.ypw.setColor(i);
        return this;
    }

    public emc emc(float f2) {
        this.ycc = f2;
        invalidate();
        return this;
    }

    public emc emc(String str) {
        this.ru = str;
        return this;
    }

    public void emc(dg dgVar) {
        this.gbl = dgVar;
    }
}
