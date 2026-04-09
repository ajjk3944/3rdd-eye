package com.lefan.signal.ui.speed;

import A3.C0133b;
import F4.e;
import R2.a;
import android.animation.ValueAnimator;
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
public final class SpeedView extends View {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f19328G = 0;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f19329C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f19330D;

    /* renamed from: E, reason: collision with root package name */
    public String f19331E;

    /* renamed from: F, reason: collision with root package name */
    public float f19332F;

    /* renamed from: a, reason: collision with root package name */
    public float f19333a;

    /* renamed from: b, reason: collision with root package name */
    public float f19334b;

    /* renamed from: c, reason: collision with root package name */
    public float f19335c;

    /* renamed from: d, reason: collision with root package name */
    public float f19336d;

    /* renamed from: e, reason: collision with root package name */
    public float f19337e;

    /* renamed from: f, reason: collision with root package name */
    public float f19338f;

    /* renamed from: g, reason: collision with root package name */
    public int f19339g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19340h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19341j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19342k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19343l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f19344m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19345n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        this.f19340h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f19341j = paint4;
        Paint paint5 = new Paint();
        this.f19342k = paint5;
        Paint paint6 = new Paint();
        this.f19343l = paint6;
        Paint paint7 = new Paint();
        this.f19344m = paint7;
        Paint paint8 = new Paint();
        this.f19345n = paint8;
        Paint paint9 = new Paint();
        this.f19329C = paint9;
        this.f19330D = new int[]{0, 0, -16711936};
        this.f19331E = "KM/H";
        this.f19332F = 300.0f;
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
        paint9.setTypeface(typeface);
        paint9.setTextAlign(align);
        paint9.setColor(getContext().getColor(R.color.text_color));
        String str = this.f19331E;
        int iHashCode = str.hashCode();
        if (iHashCode == 2403) {
            if (str.equals("KN")) {
                this.f19332F = 120.0f;
            }
        } else if (iHashCode == 76549) {
            if (str.equals("MPH")) {
                this.f19332F = 200.0f;
            }
        } else if (iHashCode == 2309851 && str.equals("KM/H")) {
            this.f19332F = 300.0f;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = this.f19333a;
        float f5 = this.f19332F;
        float f6 = f2 <= f5 ? (f2 * 260.0f) / f5 : 260.0f;
        float f7 = this.f19334b;
        float f8 = this.f19336d;
        float f9 = this.f19335c;
        RectF rectF = new RectF(f7 - f8, f9 - f8, f7 + f8, f9 + f8);
        float f10 = this.f19334b;
        RadialGradient radialGradient = new RadialGradient(f10, f10, this.f19336d, this.f19330D, (float[]) null, Shader.TileMode.REPEAT);
        Paint paint = this.f19344m;
        paint.setShader(radialGradient);
        canvas.drawArc(rectF, 140.0f, f6, true, paint);
        canvas.drawArc(rectF, 140.0f, 260.0f, false, this.i);
        float f11 = this.f19334b;
        float f12 = this.f19337e;
        float f13 = this.f19335c;
        Canvas canvas2 = canvas;
        canvas2.drawArc(new RectF(f11 - f12, f13 - f12, f11 + f12, f13 + f12), 140.0f, 260.0f, false, this.f19343l);
        canvas2.save();
        canvas2.rotate(-130.0f, this.f19334b, this.f19335c);
        float f14 = 2;
        int i = (int) (this.f19332F / f14);
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                int i6 = i3 % (i.a(this.f19331E, "KN") ? 5 : 10);
                Paint paint2 = this.f19342k;
                if (i6 == 0) {
                    float f15 = this.f19334b;
                    float f16 = this.f19335c - this.f19336d;
                    float f17 = this.f19338f;
                    canvas2.drawCircle(f15, (3 * f17) + f16, f17, this.f19341j);
                    float f18 = this.f19334b;
                    float f19 = this.f19335c - this.f19337e;
                    canvas2.drawLine(f18, f19, f18, f19 - (this.f19338f * 4), paint2);
                    Integer numValueOf = Integer.valueOf(i3 * 2);
                    if (a.f3390d) {
                        Locale locale = e.f1457a;
                        str2 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    float f20 = this.f19334b;
                    float f21 = this.f19335c;
                    float f22 = this.f19337e;
                    canvas2.drawText(str2, f20, (f21 - f22) - ((this.f19336d - f22) / f14), this.f19340h);
                } else if (i3 % 5 == 0) {
                    float f23 = this.f19334b;
                    float f24 = this.f19335c - this.f19337e;
                    canvas2.drawLine(f23, f24, f23, f24 - (this.f19338f * 3), paint2);
                    canvas2 = canvas;
                } else {
                    float f25 = this.f19334b;
                    float f26 = this.f19335c - this.f19337e;
                    canvas2 = canvas;
                    canvas2.drawLine(f25, f26, f25, f26 - (this.f19338f * f14), paint2);
                }
                canvas2.rotate(520.0f / this.f19332F, this.f19334b, this.f19335c);
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        canvas2.restore();
        Float fValueOf = Float.valueOf(this.f19333a);
        if (a.f3390d) {
            Locale locale2 = e.f1457a;
            str = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        canvas2.drawText(str, this.f19334b, this.f19335c + (this.f19339g / 3), this.f19345n);
        canvas2.drawText(this.f19331E, this.f19334b, this.f19335c + ((this.f19339g * 3) / 2), this.f19329C);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int size = View.MeasureSpec.getSize(i);
        float f2 = size / 2;
        this.f19334b = f2;
        double d6 = size;
        float f5 = (float) ((2.4d * d6) / 5);
        this.f19336d = f5;
        this.f19335c = f2;
        this.f19338f = f5 / 60;
        float f6 = 10;
        this.f19337e = (6 * f5) / f6;
        this.f19340h.setTextSize((f5 * 1) / f6);
        float f7 = (this.f19336d * 30) / 100;
        Paint paint = this.f19345n;
        paint.setTextSize(f7);
        this.i.setStrokeWidth((float) (0.005d * d6));
        this.f19343l.setStrokeWidth((float) (0.0025d * d6));
        this.f19329C.setTextSize((float) (d6 * 0.05d));
        i.e(paint, "paint");
        Rect rect = new Rect();
        paint.getTextBounds("0", 0, 1, rect);
        this.f19339g = rect.height();
        setMeasuredDimension(i, (int) (this.f19336d * 1.75d));
    }

    public final void setSpeed(float f2) {
        String str = this.f19331E;
        if (i.a(str, "MPH")) {
            f2 *= 0.621371f;
        } else if (i.a(str, "KN")) {
            f2 /= 1.852f;
        }
        float f5 = this.f19333a;
        if (f2 == f5) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f2);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new C0133b(7, this));
        valueAnimatorOfFloat.start();
    }

    public final void setUnit(String str) {
        i.e(str, "string");
        if (i.a(this.f19331E, str)) {
            return;
        }
        this.f19331E = str;
        int iHashCode = str.hashCode();
        if (iHashCode != 2403) {
            if (iHashCode != 76549) {
                if (iHashCode == 2309851 && str.equals("KM/H")) {
                    this.f19332F = 300.0f;
                }
            } else if (str.equals("MPH")) {
                this.f19332F = 200.0f;
            }
        } else if (str.equals("KN")) {
            this.f19332F = 120.0f;
        }
        postInvalidate();
    }
}
