package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends View {
    private float bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f8160cf;
    private Paint fkw;

    /* renamed from: jg, reason: collision with root package name */
    private float f8161jg;

    /* renamed from: le, reason: collision with root package name */
    private RectF f8162le;

    /* renamed from: lh, reason: collision with root package name */
    yu f8163lh;
    private int mwh;
    public float ouw;
    private int pno;
    private int ra;
    private ValueAnimator ryl;
    private int tlj;
    public String vt;
    private Paint yu;

    public ouw(Context context) {
        super(context);
        this.ra = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813");
        this.pno = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)");
        this.bly = 3.0f;
        this.ouw = 0.0f;
        this.tlj = 0;
        this.f8160cf = 100;
        this.vt = "line";
        this.mwh = 1000;
        setBackgroundColor(0);
        Paint paint = new Paint(1);
        this.yu = paint;
        paint.setColor(this.pno);
        Paint paint2 = this.yu;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.fkw = paint3;
        paint3.setColor(this.ra);
        this.fkw.setStyle(style);
        this.f8162le = new RectF();
        this.f8161jg = this.tlj;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.ryl = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mwh);
        this.ryl.setInterpolator(new LinearInterpolator());
        this.ryl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ouw.this.f8161jg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ouw.this.invalidate();
            }
        });
    }

    public int getMaxProgress() {
        return this.f8160cf;
    }

    public int getProgress() {
        return this.tlj;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.ryl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        int i4;
        super.onDraw(canvas);
        if (TextUtils.equals(this.vt, "ring") || TextUtils.equals(this.vt, "ring_reverse")) {
            float f11 = this.bly / 2.0f;
            this.f8162le.set(f11, f11, getWidth() - f11, getHeight() - f11);
            Paint paint = this.yu;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.yu.setStrokeWidth(this.bly);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.yu);
            if (TextUtils.equals(this.vt, "ring_reverse")) {
                f10 = this.f8161jg * (-360.0f);
                i4 = this.f8160cf;
            } else {
                f10 = this.f8161jg * 360.0f;
                i4 = this.f8160cf;
            }
            float f12 = f10 / i4;
            this.fkw.setStyle(style);
            this.fkw.setStrokeWidth(this.bly);
            if (this.ouw <= 0.0f) {
                this.fkw.setStrokeCap(Paint.Cap.SQUARE);
            } else {
                this.fkw.setStrokeCap(Paint.Cap.ROUND);
            }
            canvas.drawArc(this.f8162le, -90.0f, f12, false, this.fkw);
            return;
        }
        Paint paint2 = this.yu;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        float width = getWidth();
        float f13 = this.bly;
        float f14 = this.ouw;
        canvas.drawRoundRect(0.0f, 0.0f, width, f13, f14, f14, this.yu);
        float width2 = (getWidth() * this.f8161jg) / this.f8160cf;
        this.fkw.setStyle(style2);
        if (!TextUtils.equals(this.vt, "line_reverse")) {
            float f15 = this.bly;
            float f16 = this.ouw;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f15, f16, f16, this.fkw);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f17 = this.bly;
            float f18 = this.ouw;
            canvas.drawRoundRect(width3, 0.0f, width4, f17, f18, f18, this.fkw);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i10) {
        yu yuVar = this.f8163lh;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i4, i10);
        }
        if (TextUtils.equals(this.vt, "ring") || TextUtils.equals(this.vt, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.bly);
        }
        yu yuVar2 = this.f8163lh;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    public void setAnimationDuration(int i4) {
        this.mwh = i4;
        this.ryl.setDuration(i4);
    }

    public void setMaxProgress(int i4) {
        this.f8160cf = i4;
        invalidate();
    }

    public void setProgress(int i4) {
        int iMin = Math.min(i4, this.f8160cf);
        this.tlj = iMin;
        if (iMin < 0) {
            this.tlj = 0;
        }
        ValueAnimator valueAnimator = this.ryl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ryl.setFloatValues(this.f8161jg, this.tlj);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.f8161jg + " progress=" + i4);
            this.ryl.start();
        }
    }

    public final ouw vt(int i4) {
        this.yu.setColor(i4);
        return this;
    }

    public final ouw ouw(int i4) {
        this.fkw.setColor(i4);
        return this;
    }

    public final ouw ouw(float f10) {
        this.bly = f10;
        invalidate();
        return this;
    }
}
