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
        this.sz = 1000;
        setBackgroundColor(0);
        emc();
    }

    private void ypw(Canvas canvas) {
        Paint paint = this.emc;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.ycc;
        float f11 = this.uym;
        canvas.drawRoundRect(0.0f, 0.0f, width, f10, f11, f11, this.emc);
        float width2 = (getWidth() * this.qh) / this.zz;
        this.ypw.setStyle(style);
        if (!TextUtils.equals(this.ru, "line_reverse")) {
            float f12 = this.ycc;
            float f13 = this.uym;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f12, f13, f13, this.ypw);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.ycc;
            float f15 = this.uym;
            canvas.drawRoundRect(width3, 0.0f, width4, f14, f15, f15, this.ypw);
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
    public void onMeasure(int i10, int i11) {
        dg dgVar = this.gbl;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i10, i11);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i10, i11);
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

    public void setAnimationDuration(int i10) {
        this.sz = i10;
        this.sup.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.zz = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.zz);
        this.msw = iMin;
        if (iMin < 0) {
            this.msw = 0;
        }
        ValueAnimator valueAnimator = this.sup;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.sup.setFloatValues(this.qh, this.msw);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.qh + " progress=" + i10);
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

    public emc ypw(int i10) {
        this.emc.setColor(i10);
        return this;
    }

    public emc ypw(float f10) {
        this.uym = f10;
        return this;
    }

    private void emc(Canvas canvas) {
        float f10;
        int i10;
        float f11 = this.ycc / 2.0f;
        this.xq.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.emc;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.emc.setStrokeWidth(this.ycc);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.emc);
        if (TextUtils.equals(this.ru, "ring_reverse")) {
            f10 = this.qh * (-360.0f);
            i10 = this.zz;
        } else {
            f10 = this.qh * 360.0f;
            i10 = this.zz;
        }
        float f12 = f10 / i10;
        this.ypw.setStyle(style);
        this.ypw.setStrokeWidth(this.ycc);
        if (this.uym <= 0.0f) {
            this.ypw.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.ypw.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.xq, -90.0f, f12, false, this.ypw);
    }

    public emc emc(int i10) {
        this.ypw.setColor(i10);
        return this;
    }

    public emc emc(float f10) {
        this.ycc = f10;
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
