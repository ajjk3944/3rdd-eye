package com.liuzh.deviceinfo.view.circleprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.liuzh.deviceinfo.utilities.d;
import zf.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ArcProgress extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f21368a;

    /* renamed from: b, reason: collision with root package name */
    public TextPaint f21369b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f21370c;

    /* renamed from: d, reason: collision with root package name */
    public float f21371d;

    /* renamed from: e, reason: collision with root package name */
    public float f21372e;

    /* renamed from: f, reason: collision with root package name */
    public float f21373f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public float f21374h;

    /* renamed from: i, reason: collision with root package name */
    public int f21375i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f21376k;

    /* renamed from: l, reason: collision with root package name */
    public int f21377l;

    /* renamed from: m, reason: collision with root package name */
    public int f21378m;

    /* renamed from: n, reason: collision with root package name */
    public float f21379n;

    /* renamed from: o, reason: collision with root package name */
    public String f21380o;

    /* renamed from: p, reason: collision with root package name */
    public float f21381p;

    /* renamed from: q, reason: collision with root package name */
    public float f21382q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21383r;

    /* renamed from: s, reason: collision with root package name */
    public final int f21384s;

    public ArcProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21370c = new RectF();
        this.j = 0;
        this.f21380o = "%";
        int iRgb = Color.rgb(72, 106, 176);
        this.f21383r = iRgb;
        int iRgb2 = Color.rgb(66, 145, 241);
        d.q(18.0f, getResources().getDisplayMetrics());
        this.f21384s = d.p(100.0f, getResources().getDisplayMetrics());
        float fQ = d.q(40.0f, getResources().getDisplayMetrics());
        float fQ2 = d.q(15.0f, getResources().getDisplayMetrics());
        float fP = d.p(4.0f, getResources().getDisplayMetrics());
        float fQ3 = d.q(10.0f, getResources().getDisplayMetrics());
        float fP2 = d.p(4.0f, getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f38273a, 0, 0);
        this.f21377l = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.f21378m = typedArrayObtainStyledAttributes.getColor(12, iRgb);
        this.f21375i = typedArrayObtainStyledAttributes.getColor(10, iRgb2);
        this.f21374h = typedArrayObtainStyledAttributes.getDimension(11, fQ);
        this.f21379n = typedArrayObtainStyledAttributes.getFloat(0, 288.0f);
        setMax(typedArrayObtainStyledAttributes.getInt(4, 100));
        setProgress(typedArrayObtainStyledAttributes.getInt(5, 0));
        this.f21371d = typedArrayObtainStyledAttributes.getDimension(6, fP2);
        this.f21372e = typedArrayObtainStyledAttributes.getDimension(9, fQ2);
        this.f21380o = TextUtils.isEmpty(typedArrayObtainStyledAttributes.getString(7)) ? "%" : typedArrayObtainStyledAttributes.getString(7);
        this.f21381p = typedArrayObtainStyledAttributes.getDimension(8, fP);
        this.f21373f = typedArrayObtainStyledAttributes.getDimension(2, fQ3);
        this.g = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        TextPaint textPaint = new TextPaint();
        this.f21369b = textPaint;
        textPaint.setColor(this.f21375i);
        this.f21369b.setTextSize(this.f21374h);
        this.f21369b.setAntiAlias(true);
        Paint paint = new Paint();
        this.f21368a = paint;
        paint.setColor(this.f21383r);
        this.f21368a.setAntiAlias(true);
        this.f21368a.setStrokeWidth(this.f21371d);
        this.f21368a.setStyle(Paint.Style.STROKE);
        this.f21368a.setStrokeCap(Paint.Cap.ROUND);
    }

    public float getArcAngle() {
        return this.f21379n;
    }

    public String getBottomText() {
        return this.g;
    }

    public float getBottomTextSize() {
        return this.f21373f;
    }

    public int getFinishedStrokeColor() {
        return this.f21377l;
    }

    public int getMax() {
        return this.f21376k;
    }

    public int getProgress() {
        return this.j;
    }

    public float getStrokeWidth() {
        return this.f21371d;
    }

    public String getSuffixText() {
        return this.f21380o;
    }

    public float getSuffixTextPadding() {
        return this.f21381p;
    }

    public float getSuffixTextSize() {
        return this.f21372e;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return this.f21384s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return this.f21384s;
    }

    public int getTextColor() {
        return this.f21375i;
    }

    public float getTextSize() {
        return this.f21374h;
    }

    public int getUnfinishedStrokeColor() {
        return this.f21378m;
    }

    @Override // android.view.View
    public final void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 270.0f - (this.f21379n / 2.0f);
        float max = (this.j / getMax()) * this.f21379n;
        float f11 = this.j == 0 ? 0.01f : f10;
        this.f21368a.setColor(this.f21378m);
        float f12 = this.f21379n;
        Paint paint = this.f21368a;
        RectF rectF = this.f21370c;
        canvas.drawArc(rectF, f10, f12, false, paint);
        this.f21368a.setColor(this.f21377l);
        canvas.drawArc(rectF, f11, max, false, this.f21368a);
        String strValueOf = String.valueOf(getProgress());
        if (!TextUtils.isEmpty(strValueOf)) {
            this.f21369b.setColor(this.f21375i);
            this.f21369b.setTextSize(this.f21374h);
            float fAscent = this.f21369b.ascent() + this.f21369b.descent();
            float height = (getHeight() - fAscent) / 2.0f;
            canvas.drawText(strValueOf, (getWidth() - this.f21369b.measureText(strValueOf)) / 2.0f, height, this.f21369b);
            this.f21369b.setTextSize(this.f21372e);
            canvas.drawText(this.f21380o, this.f21369b.measureText(strValueOf) + (getWidth() / 2.0f) + this.f21381p, (height + fAscent) - (this.f21369b.ascent() + this.f21369b.descent()), this.f21369b);
        }
        if (this.f21382q == 0.0f) {
            this.f21382q = (getWidth() / 2.0f) * ((float) (1.0d - Math.cos((((360.0f - this.f21379n) / 2.0f) / 180.0f) * 3.141592653589793d)));
        }
        if (TextUtils.isEmpty(getBottomText())) {
            return;
        }
        this.f21369b.setTextSize(this.f21373f);
        canvas.drawText(getBottomText(), (getWidth() - this.f21369b.measureText(getBottomText())) / 2.0f, (getHeight() - this.f21382q) - ((this.f21369b.ascent() + this.f21369b.descent()) / 2.0f), this.f21369b);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(i4, i10);
        int size = View.MeasureSpec.getSize(i4);
        float f10 = this.f21371d;
        float f11 = size;
        this.f21370c.set(f10 / 2.0f, f10 / 2.0f, f11 - (f10 / 2.0f), View.MeasureSpec.getSize(i10) - (this.f21371d / 2.0f));
        this.f21382q = (f11 / 2.0f) * ((float) (1.0d - Math.cos((((360.0f - this.f21379n) / 2.0f) / 180.0f) * 3.141592653589793d)));
    }

    public void setArcAngle(float f10) {
        this.f21379n = f10;
        invalidate();
    }

    public void setBottomText(String str) {
        this.g = str;
        invalidate();
    }

    public void setBottomTextSize(float f10) {
        this.f21373f = f10;
        invalidate();
    }

    public void setFinishedStrokeColor(int i4) {
        this.f21377l = i4;
        invalidate();
    }

    public void setMax(int i4) {
        if (i4 > 0) {
            this.f21376k = i4;
            invalidate();
        }
    }

    public void setProgress(int i4) {
        this.j = i4;
        if (i4 > getMax()) {
            this.j %= getMax();
        }
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f21371d = f10;
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f21380o = str;
        invalidate();
    }

    public void setSuffixTextPadding(float f10) {
        this.f21381p = f10;
        invalidate();
    }

    public void setSuffixTextSize(float f10) {
        this.f21372e = f10;
        invalidate();
    }

    public void setTextColor(int i4) {
        this.f21375i = i4;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f21374h = f10;
        invalidate();
    }

    public void setUnfinishedStrokeColor(int i4) {
        this.f21378m = i4;
        invalidate();
    }
}
