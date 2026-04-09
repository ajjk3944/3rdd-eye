package com.lefan.signal.ui.other;

import F4.e;
import R2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class HumidityView2 extends View {

    /* renamed from: C, reason: collision with root package name */
    public int f19080C;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19081a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19082b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19083c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f19084d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f19085e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f19086f;

    /* renamed from: g, reason: collision with root package name */
    public float f19087g;

    /* renamed from: h, reason: collision with root package name */
    public float f19088h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f19089j;

    /* renamed from: k, reason: collision with root package name */
    public float f19090k;

    /* renamed from: l, reason: collision with root package name */
    public RectF f19091l;

    /* renamed from: m, reason: collision with root package name */
    public float f19092m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19093n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HumidityView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        this.f19081a = paint;
        Paint paint2 = new Paint();
        this.f19082b = paint2;
        Paint paint3 = new Paint();
        this.f19083c = paint3;
        Paint paint4 = new Paint();
        this.f19084d = paint4;
        Paint paint5 = new Paint();
        this.f19085e = paint5;
        Paint paint6 = new Paint();
        this.f19086f = paint6;
        paint.setColor(-3355444);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(3.0f);
        paint4.setColor(-16776961);
        paint4.setAntiAlias(true);
        paint4.setTypeface(typeface);
        paint4.setTextAlign(align);
        paint5.setTypeface(typeface);
        paint5.setTextAlign(align);
        paint5.setAntiAlias(true);
        paint5.setColor(Color.parseColor("#4060ff"));
        paint6.setStyle(style);
        paint6.setAntiAlias(true);
        paint6.setXfermode(new PorterDuffXfermode(mode));
        paint6.setStrokeCap(cap);
        paint6.setColor(Color.parseColor("#4060ff"));
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
        this.f19093n = true;
        this.f19080C = 100;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f19091l;
        if (rectF != null) {
            canvas.drawArc(rectF, 160.0f, 220.0f, false, this.f19081a);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        canvas2.save();
        canvas2.rotate(-110.0f, this.f19088h, this.i);
        for (int i = 0; i < 101; i++) {
            int i3 = i % 10;
            Paint paint = this.f19082b;
            if (i3 == 0) {
                float f2 = this.f19088h;
                float f5 = this.f19092m;
                canvas2.drawLine(f2, f5, f2, f5 - (this.f19090k * 4), paint);
                Integer numValueOf = Integer.valueOf((this.f19080C * i) / 100);
                if (a.f3390d) {
                    Locale locale = e.f1457a;
                    str2 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                canvas2.drawText(str2, this.f19088h, this.f19092m - (this.f19090k * 6), this.f19083c);
            } else {
                float f6 = this.f19088h;
                float f7 = this.f19092m;
                canvas2.drawLine(f6, f7, f6, f7 - (this.f19090k * 2), paint);
            }
            canvas2.rotate(2.2f, this.f19088h, this.i);
        }
        canvas2.restore();
        float f8 = this.f19087g;
        float f9 = this.f19080C;
        float f10 = f8 > f9 ? 140.0f : (f8 / f9) * 220.0f;
        if (this.f19093n) {
            Float fValueOf = Float.valueOf(f8);
            if (a.f3390d) {
                Locale locale2 = e.f1457a;
                str = String.format(e.b(), "%.2f%%", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.2f%%", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
        } else {
            Float fValueOf2 = Float.valueOf(f8);
            if (a.f3390d) {
                Locale locale3 = e.f1457a;
                str = String.format(e.b(), "%.0fg/m³", Arrays.copyOf(new Object[]{fValueOf2}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.0fg/m³", Arrays.copyOf(new Object[]{fValueOf2}, 1));
            }
        }
        canvas2.drawText(str, this.f19088h, this.i, this.f19085e);
        RectF rectF2 = this.f19091l;
        if (rectF2 != null) {
            canvas2.drawArc(rectF2, 160.0f, f10, false, this.f19086f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        this.f19089j = (7 * size) / 20;
        float f2 = size / 2;
        this.f19088h = f2;
        this.i = f2;
        float f5 = size / 30;
        Paint paint = this.f19081a;
        paint.setStrokeWidth(f5);
        this.f19086f.setStrokeWidth(f5);
        float f6 = size / 120;
        this.f19090k = f6;
        this.f19083c.setTextSize(f6 * 5);
        this.f19084d.setTextSize(this.f19090k * 8);
        this.f19085e.setTextSize(this.f19090k * 10);
        float f7 = this.f19088h;
        float f8 = this.f19089j;
        float f9 = this.i;
        this.f19091l = new RectF(f7 - f8, f9 - f8, f7 + f8, f9 + f8);
        this.f19092m = (this.i - this.f19089j) - paint.getStrokeWidth();
        setMeasuredDimension(i, (int) (i * 0.75d));
    }

    public final void setHumidity(float f2) {
        if (this.f19087g == f2) {
            return;
        }
        this.f19087g = f2;
        postInvalidate();
    }

    public final void setUnitPercent(boolean z6) {
        this.f19093n = z6;
        this.f19080C = z6 ? 100 : 3000;
        postInvalidate();
    }
}
