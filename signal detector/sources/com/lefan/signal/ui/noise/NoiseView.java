package com.lefan.signal.ui.noise;

import A3.C0133b;
import F4.e;
import R2.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class NoiseView extends View {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f19030D = 0;

    /* renamed from: C, reason: collision with root package name */
    public final Path f19031C;

    /* renamed from: a, reason: collision with root package name */
    public float f19032a;

    /* renamed from: b, reason: collision with root package name */
    public float f19033b;

    /* renamed from: c, reason: collision with root package name */
    public float f19034c;

    /* renamed from: d, reason: collision with root package name */
    public float f19035d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f19036e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f19037f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19038g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19039h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19040j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19041k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19042l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f19043m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f19044n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoiseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        this.f19036e = paint;
        Paint paint2 = new Paint();
        this.f19037f = paint2;
        Paint paint3 = new Paint();
        this.f19038g = paint3;
        Paint paint4 = new Paint();
        Paint paint5 = new Paint();
        this.f19039h = paint5;
        Paint paint6 = new Paint();
        this.i = paint6;
        Paint paint7 = new Paint();
        this.f19040j = paint7;
        Paint paint8 = new Paint();
        this.f19041k = paint8;
        Paint paint9 = new Paint();
        this.f19042l = paint9;
        this.f19043m = new int[]{-16711936, -256, -65536};
        this.f19044n = new float[]{0.0f, 0.3f, 0.7f};
        paint2.setAntiAlias(true);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint4.setColor(-7829368);
        paint4.setStrokeWidth(3.0f);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint5.setColor(-16711936);
        paint5.setAntiAlias(true);
        paint6.setColor(getContext().getColor(R.color.white));
        paint7.setColor(-3355444);
        paint8.setColor(getContext().getColor(R.color.text_color));
        paint8.setTextAlign(align);
        paint8.setTypeface(typeface);
        paint9.setColor(getContext().getColor(R.color.text_color));
        paint9.setTextAlign(align);
        paint9.setTypeface(typeface);
        this.f19031C = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        SweepGradient sweepGradient = new SweepGradient(this.f19033b, this.f19035d, this.f19043m, this.f19044n);
        Paint paint = this.f19036e;
        paint.setShader(sweepGradient);
        float f2 = this.f19033b;
        float f5 = this.f19035d;
        float f6 = f2 - f5;
        float f7 = f2 + f5;
        RectF rectF = new RectF(f6, f6, f7, f7);
        canvas.save();
        float f8 = this.f19033b;
        canvas.rotate(140.0f, f8, f8);
        canvas.drawArc(rectF, 0.0f, 260.0f, false, paint);
        canvas.restore();
        canvas.save();
        float f9 = this.f19033b;
        canvas.rotate(-130.0f, f9, f9);
        for (int i = 0; i < 101; i++) {
            int i3 = i % 5;
            Paint paint2 = this.f19037f;
            if (i3 != 0) {
                float f10 = this.f19033b;
                float f11 = f10 - this.f19035d;
                float f12 = this.f19034c;
                canvas.drawLine(f10, ((2 * f12) + f11) - 10.0f, f10, ((f12 * 3) + f11) - 10.0f, paint2);
            } else if (i % 10 == 0) {
                float f13 = this.f19033b;
                float f14 = f13 - this.f19035d;
                float f15 = this.f19034c;
                canvas.drawLine(f13, ((2 * f15) + f14) - 10.0f, f13, ((f15 * 4) + f14) - 10.0f, paint2);
                Integer numValueOf = Integer.valueOf(i);
                if (a.f3390d) {
                    Locale locale = e.f1457a;
                    str2 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                float f16 = this.f19033b;
                canvas.drawText(str2, f16, ((this.f19034c * 6) + (f16 - this.f19035d)) - 10.0f, this.f19038g);
            } else {
                float f17 = this.f19033b;
                float f18 = f17 - this.f19035d;
                float f19 = this.f19034c;
                canvas.drawLine(f17, ((2 * f19) + f18) - 10.0f, f17, ((f19 * 3.5f) + f18) - 10.0f, paint2);
            }
            float f20 = this.f19033b;
            canvas.rotate(2.6f, f20, f20);
        }
        canvas.restore();
        float f21 = this.f19033b;
        canvas.drawCircle(f21, f21, this.f19034c * 4, this.f19040j);
        float f22 = this.f19033b;
        canvas.drawText("dB", f22, (this.f19034c * 12) + (f22 - this.f19035d), this.f19041k);
        Float fValueOf = Float.valueOf(this.f19032a);
        if (a.f3390d) {
            Locale locale2 = e.f1457a;
            str = String.format(e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        float f23 = this.f19033b;
        canvas.drawText(str, f23, (this.f19034c * 14) + f23, this.f19042l);
        float f24 = this.f19033b;
        LinearGradient linearGradient = new LinearGradient(f24, (f24 - this.f19035d) - 20.0f, f24, f24, this.f19043m, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint3 = this.f19039h;
        paint3.setShader(linearGradient);
        float f25 = this.f19032a;
        float f26 = f25 <= 100.0f ? ((f25 / 100.0f) * 260.0f) - 130.0f : 130.0f;
        canvas.save();
        float f27 = this.f19033b;
        canvas.rotate(f26, f27, f27);
        Path path = this.f19031C;
        path.reset();
        float f28 = this.f19033b;
        path.moveTo(f28, (f28 - this.f19035d) + this.f19034c);
        float f29 = this.f19033b;
        path.lineTo(f29 - this.f19034c, f29);
        float f30 = this.f19033b;
        path.lineTo(f30, (this.f19034c * 2) + f30);
        float f31 = this.f19033b;
        path.lineTo(this.f19034c + f31, f31);
        canvas.drawPath(path, paint3);
        canvas.restore();
        float f32 = this.f19033b;
        canvas.drawCircle(f32, f32, this.f19034c / 3, this.i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        float f2 = 2;
        this.f19033b = size / f2;
        float f5 = size / 50;
        this.f19034c = f5;
        this.f19035d = (size * 2.2f) / 5;
        this.f19036e.setStrokeWidth(f5 * f2);
        this.f19038g.setTextSize(this.f19034c * f2);
        this.f19041k.setTextSize(this.f19034c * 3);
        this.f19042l.setTextSize(this.f19034c * 4);
        setMeasuredDimension(i, (int) (this.f19035d * f2));
    }

    public final void setMdb(float f2) {
        float f5 = this.f19032a;
        if (f5 == f2) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f2);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new C0133b(5, this));
        valueAnimatorOfFloat.start();
    }
}
