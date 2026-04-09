package com.lefan.signal.ui.magnetic;

import F4.e;
import R2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class MagneticView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f18951C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f18952D;

    /* renamed from: a, reason: collision with root package name */
    public float f18953a;

    /* renamed from: b, reason: collision with root package name */
    public float f18954b;

    /* renamed from: c, reason: collision with root package name */
    public float f18955c;

    /* renamed from: d, reason: collision with root package name */
    public float f18956d;

    /* renamed from: e, reason: collision with root package name */
    public float f18957e;

    /* renamed from: f, reason: collision with root package name */
    public float f18958f;

    /* renamed from: g, reason: collision with root package name */
    public int f18959g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f18960h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f18961j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f18962k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f18963l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f18964m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f18965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagneticView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        this.f18960h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f18961j = paint4;
        Paint paint5 = new Paint();
        this.f18962k = paint5;
        Paint paint6 = new Paint();
        this.f18963l = paint6;
        Paint paint7 = new Paint();
        this.f18964m = paint7;
        Paint paint8 = new Paint();
        this.f18965n = paint8;
        Paint paint9 = new Paint();
        this.f18951C = paint9;
        this.f18952D = new int[]{0, 0, -16711936};
        paint.setColor(getContext().getColor(R.color.view_bg2));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint2.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        paint2.setColor(getContext().getColor(R.color.text_color));
        paint3.setAntiAlias(false);
        paint3.setStyle(style);
        paint3.setColor(getContext().getColor(R.color.text_color));
        paint3.setShadowLayer(16.0f, 0.0f, 10.0f, getContext().getColor(R.color.text_color));
        paint4.setStyle(style2);
        paint4.setColor(getContext().getColor(R.color.text_color));
        paint5.setColor(-3355444);
        paint5.setStrokeWidth(3.0f);
        paint6.setAntiAlias(true);
        paint6.setStyle(style);
        paint6.setColor(-7829368);
        paint7.setColor(-16776961);
        paint7.setStyle(style2);
        paint7.setAntiAlias(true);
        paint8.setStyle(style2);
        paint8.setTypeface(typeface);
        paint8.setTextAlign(align);
        paint8.setColor(getContext().getColor(R.color.text_color));
        paint9.setStyle(style2);
        paint9.setTextAlign(align);
        paint9.setColor(getContext().getColor(R.color.text_color));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = this.f18953a;
        float f5 = f2 > 520.0f ? 260.0f : f2 / 2;
        float f6 = this.f18954b;
        float f7 = this.f18956d;
        float f8 = this.f18955c;
        RectF rectF = new RectF(f6 - f7, f8 - f7, f6 + f7, f8 + f7);
        float f9 = this.f18954b;
        RadialGradient radialGradient = new RadialGradient(f9, f9, this.f18956d, this.f18952D, (float[]) null, Shader.TileMode.REPEAT);
        Paint paint = this.f18964m;
        paint.setShader(radialGradient);
        canvas.drawArc(rectF, 140.0f, f5, true, paint);
        canvas.drawArc(rectF, 140.0f, 260.0f, false, this.i);
        float f10 = this.f18954b;
        float f11 = this.f18957e;
        float f12 = this.f18955c;
        Canvas canvas2 = canvas;
        canvas2.drawArc(new RectF(f10 - f11, f12 - f11, f10 + f11, f12 + f11), 140.0f, 260.0f, false, this.f18963l);
        canvas2.save();
        canvas2.rotate(-130.0f, this.f18954b, this.f18955c);
        for (int i = 0; i < 131; i++) {
            int i3 = i % 10;
            Paint paint2 = this.f18962k;
            if (i3 == 0) {
                float f13 = this.f18954b;
                float f14 = this.f18955c - this.f18956d;
                float f15 = this.f18958f;
                canvas2.drawCircle(f13, (3 * f15) + f14, f15, this.f18961j);
                float f16 = this.f18954b;
                float f17 = this.f18955c - this.f18957e;
                canvas2.drawLine(f16, f17, f16, f17 - (this.f18958f * 4), paint2);
                Integer numValueOf = Integer.valueOf(i * 4);
                if (a.f3390d) {
                    Locale locale = e.f1457a;
                    str2 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                float f18 = this.f18954b;
                float f19 = this.f18955c;
                float f20 = this.f18957e;
                canvas2.drawText(str2, f18, (f19 - f20) - ((this.f18956d - f20) / 2), this.f18960h);
            } else if (i % 5 == 0) {
                float f21 = this.f18954b;
                float f22 = this.f18955c - this.f18957e;
                canvas2.drawLine(f21, f22, f21, f22 - (this.f18958f * 3), paint2);
                canvas2 = canvas;
            } else {
                float f23 = this.f18954b;
                float f24 = this.f18955c - this.f18957e;
                canvas2 = canvas;
                canvas2.drawLine(f23, f24, f23, f24 - (this.f18958f * 2), paint2);
            }
            canvas2.rotate(2.0f, this.f18954b, this.f18955c);
        }
        canvas2.restore();
        Float fValueOf = Float.valueOf(this.f18953a);
        if (a.f3390d) {
            Locale locale2 = e.f1457a;
            str = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        canvas2.drawText(str, this.f18954b, this.f18955c + (this.f18959g / 2), this.f18965n);
        canvas2.drawText("μT", this.f18954b, this.f18955c - ((this.f18959g * 3) / 2), this.f18951C);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int size = View.MeasureSpec.getSize(i);
        float f2 = size / 2;
        this.f18954b = f2;
        double d6 = size;
        float f5 = (float) ((2.4d * d6) / 5);
        this.f18956d = f5;
        this.f18955c = f2;
        this.f18958f = f5 / 60;
        float f6 = 10;
        this.f18957e = (6 * f5) / f6;
        this.f18960h.setTextSize((f5 * 1) / f6);
        float f7 = (this.f18956d * 30) / 100;
        Paint paint = this.f18965n;
        paint.setTextSize(f7);
        this.i.setStrokeWidth((float) (0.004d * d6));
        this.f18963l.setStrokeWidth((float) (0.0025d * d6));
        this.f18951C.setTextSize((float) (d6 * 0.05d));
        i.e(paint, "paint");
        Rect rect = new Rect();
        paint.getTextBounds("0", 0, 1, rect);
        this.f18959g = rect.height();
        setMeasuredDimension(i, (int) (this.f18956d * 1.75d));
    }

    public final void setSpeed(float f2) {
        if (f2 == this.f18953a) {
            return;
        }
        this.f18953a = f2;
        invalidate();
    }
}
