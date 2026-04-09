package com.github.anastr.speedviewlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import c9.C2092m;
import java.util.Arrays;
import java.util.Iterator;
import k3.d;
import k3.e;
import kotlin.jvm.internal.l;
import l3.EnumC5281b;
import m3.AbstractC5321b;
import m3.h;
import n3.AbstractC5355a;
import p9.p;

/* compiled from: PointerSpeedometer.kt */
/* loaded from: classes.dex */
public class PointerSpeedometer extends e {

    /* renamed from: A0, reason: collision with root package name */
    public float f22380A0;

    /* renamed from: s0, reason: collision with root package name */
    public final Paint f22381s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f22382t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint f22383u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Paint f22384v0;

    /* renamed from: w0, reason: collision with root package name */
    public final RectF f22385w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f22386x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f22387y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f22388z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerSpeedometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        Paint paint = new Paint(1);
        this.f22381s0 = paint;
        Paint paint2 = new Paint(1);
        this.f22382t0 = paint2;
        this.f22383u0 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f22384v0 = paint3;
        this.f22385w0 = new RectF();
        this.f22386x0 = -1118482;
        this.f22387y0 = -1;
        this.f22388z0 = true;
        this.f22380A0 = j(12.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(-1);
        if (attributeSet == null) {
            paint2.setColor(this.f22387y0);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.f43348b, 0, 0);
        l.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…PointerSpeedometer, 0, 0)");
        this.f22386x0 = typedArrayObtainStyledAttributes.getColor(3, this.f22386x0);
        this.f22387y0 = typedArrayObtainStyledAttributes.getColor(2, this.f22387y0);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(0, paint3.getColor()));
        setCenterCircleRadius(typedArrayObtainStyledAttributes.getDimension(1, this.f22380A0));
        this.f22388z0 = typedArrayObtainStyledAttributes.getBoolean(4, this.f22388z0);
        typedArrayObtainStyledAttributes.recycle();
        paint2.setColor(this.f22387y0);
    }

    public final int getCenterCircleColor() {
        return this.f22384v0.getColor();
    }

    public final float getCenterCircleRadius() {
        return this.f22380A0;
    }

    public final int getPointerColor() {
        return this.f22387y0;
    }

    public final int getSpeedometerColor() {
        return this.f22386x0;
    }

    @Override // k3.c
    public final void i() {
        super.setSpeedometerWidth(j(10.0f));
        setTextColor(-1);
        setSpeedTextColor(-1);
        setUnitTextColor(-1);
        setSpeedTextSize(j(24.0f));
        setUnitTextSize(j(11.0f));
        setSpeedTextTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }

    @Override // k3.c
    public final void o() {
        Canvas canvas;
        CharSequence charSequenceInvoke;
        if (getSize() == 0) {
            canvas = new Canvas();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getSize(), getSize(), Bitmap.Config.ARGB_8888);
            l.e(bitmapCreateBitmap, "createBitmap(size, size, Bitmap.Config.ARGB_8888)");
            setBackgroundBitmap(bitmapCreateBitmap);
            canvas = new Canvas(getBackgroundBitmap());
            canvas.drawCircle(getSize() * 0.5f, getSize() * 0.5f, (getSize() * 0.5f) - getPadding(), this.f43354V);
            canvas.clipRect(0, 0, getSize(), getSize());
        }
        w();
        Path path = this.f43357b0;
        path.reset();
        path.moveTo(getSize() * 0.5f, this.f43359d0 + getPadding());
        path.lineTo(getSize() * 0.5f, this.f43359d0 + this.f43360e0 + getPadding());
        canvas.save();
        canvas.rotate(getStartDegree() + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
        float endDegree = getEndDegree() - getStartDegree();
        int i = this.f43358c0;
        float f10 = endDegree / (i + 1.0f);
        if (1 <= i) {
            int i10 = 1;
            while (true) {
                int i11 = i10 + 1;
                canvas.rotate(f10, getSize() * 0.5f, getSize() * 0.5f);
                canvas.drawPath(path, this.f43356a0);
                if (i10 == i) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        canvas.restore();
        if (getTickNumber() <= 0) {
            TextPaint textPaint = getTextPaint();
            int i12 = this.f43362g0 % 360;
            textPaint.setTextAlign(i12 <= 90 ? Paint.Align.RIGHT : i12 <= 180 ? Paint.Align.LEFT : i12 <= 270 ? Paint.Align.CENTER : Paint.Align.RIGHT);
            p<? super Integer, ? super Float, ? extends CharSequence> pVar = this.f43372q0;
            CharSequence charSequenceInvoke2 = pVar != null ? pVar.invoke(0, Float.valueOf(getMinSpeed())) : null;
            if (charSequenceInvoke2 == null) {
                charSequenceInvoke2 = String.format(getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(getMinSpeed())}, 1));
            }
            canvas.save();
            canvas.rotate(this.f43362g0 + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
            canvas.rotate(-(this.f43362g0 + 90.0f), ((getSizePa() * 0.5f) - getTextPaint().getTextSize()) + getPadding(), getTextPaint().getTextSize() + getPadding());
            canvas.drawText(charSequenceInvoke2.toString(), ((getSizePa() * 0.5f) - getTextPaint().getTextSize()) + getPadding(), getTextPaint().getTextSize() + getPadding(), getTextPaint());
            canvas.restore();
            TextPaint textPaint2 = getTextPaint();
            int i13 = this.f43363h0 % 360;
            textPaint2.setTextAlign(i13 <= 90 ? Paint.Align.RIGHT : i13 <= 180 ? Paint.Align.LEFT : i13 <= 270 ? Paint.Align.CENTER : Paint.Align.RIGHT);
            p<? super Integer, ? super Float, ? extends CharSequence> pVar2 = this.f43372q0;
            CharSequence charSequenceInvoke3 = pVar2 != null ? pVar2.invoke(1, Float.valueOf(getMaxSpeed())) : null;
            if (charSequenceInvoke3 == null) {
                charSequenceInvoke3 = String.format(getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(getMaxSpeed())}, 1));
            }
            canvas.save();
            canvas.rotate(this.f43363h0 + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
            canvas.rotate(-(this.f43363h0 + 90.0f), getTextPaint().getTextSize() + (getSizePa() * 0.5f) + getPadding(), getTextPaint().getTextSize() + getPadding());
            canvas.drawText(charSequenceInvoke3.toString(), getTextPaint().getTextSize() + (getSizePa() * 0.5f) + getPadding(), getTextPaint().getTextSize() + getPadding(), getTextPaint());
            canvas.restore();
            return;
        }
        if (this.f43368m0.isEmpty()) {
            return;
        }
        getTextPaint().setTextAlign(Paint.Align.LEFT);
        int i14 = this.f43363h0 - this.f43362g0;
        int i15 = 0;
        for (Object obj : this.f43368m0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                C2092m.a0();
                throw null;
            }
            float fFloatValue = (i14 * ((Number) obj).floatValue()) + this.f43362g0;
            canvas.save();
            float f11 = fFloatValue + 90.0f;
            canvas.rotate(f11, getSize() * 0.5f, getSize() * 0.5f);
            if (!this.f43369n0) {
                canvas.rotate(-f11, getSize() * 0.5f, getTickPadding() + getTextPaint().getTextSize() + getInitTickPadding() + getPadding());
            }
            if (getOnPrintTickLabel() != null) {
                p<Integer, Float, CharSequence> onPrintTickLabel = getOnPrintTickLabel();
                l.c(onPrintTickLabel);
                charSequenceInvoke = onPrintTickLabel.invoke(Integer.valueOf(i15), Float.valueOf(t(fFloatValue)));
            } else {
                charSequenceInvoke = null;
            }
            if (charSequenceInvoke == null) {
                charSequenceInvoke = String.format(getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(t(fFloatValue))}, 1));
            }
            canvas.translate(0.0f, getTickPadding() + getInitTickPadding() + getPadding());
            StaticLayout.Builder.obtain(charSequenceInvoke, 0, charSequenceInvoke.length(), getTextPaint(), getSize()).setAlignment(Layout.Alignment.ALIGN_CENTER).build().draw(canvas);
            canvas.restore();
            i15 = i16;
        }
    }

    @Override // k3.e, k3.c, android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        w();
        float speedometerWidth = getSpeedometerWidth();
        float fWidth = (float) (((speedometerWidth * 0.5f) * 360) / (r2.width() * 3.141592653589793d));
        canvas.drawArc(this.f22385w0, getStartDegree() + fWidth, (getEndDegree() - getStartDegree()) - (fWidth * 2.0f), false, this.f22381s0);
        if (this.f22388z0) {
            canvas.save();
            canvas.rotate(getDegree() + 90, getSize() * 0.5f, getSize() * 0.5f);
            canvas.drawCircle(getSize() * 0.5f, j(8.0f) + (getSpeedometerWidth() * 0.5f) + getPadding(), j(8.0f) + (getSpeedometerWidth() * 0.5f), this.f22383u0);
            canvas.drawCircle(getSize() * 0.5f, j(8.0f) + (getSpeedometerWidth() * 0.5f) + getPadding(), j(1.0f) + (getSpeedometerWidth() * 0.5f), this.f22382t0);
            canvas.restore();
        }
        k(canvas);
        canvas.save();
        canvas.translate((getFulcrumX() - 0.5f) * getSize(), (getFulcrumY() - 0.5f) * getSize());
        canvas.rotate(this.f43364i0 + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
        if (this.f43352T) {
            float fAbs = Math.abs(getPercentSpeed() - this.f43373r0) * 30.0f;
            this.f43373r0 = getPercentSpeed();
            float f10 = fAbs > 30.0f ? 30.0f : fAbs;
            SweepGradient sweepGradient = new SweepGradient(getSize() * 0.5f, getSize() * 0.5f, new int[]{this.f43353U, 16777215}, new float[]{0.0f, f10 / 360.0f});
            Paint paint = this.f43355W;
            paint.setShader(sweepGradient);
            AbstractC5321b<?> abstractC5321b = this.f43350R;
            paint.setStrokeWidth((abstractC5321b.d() > abstractC5321b.b() ? abstractC5321b.b() : abstractC5321b.d()) - this.f43350R.e());
            float strokeWidth = (paint.getStrokeWidth() * 0.5f) + this.f43350R.e();
            RectF rectF = new RectF(strokeWidth, strokeWidth, getSize() - strokeWidth, getSize() - strokeWidth);
            canvas.save();
            canvas.rotate(-90.0f, getSize() * 0.5f, getSize() * 0.5f);
            if (this.f43330m) {
                canvas.scale(1.0f, -1.0f, getSize() * 0.5f, getSize() * 0.5f);
            }
            canvas.drawArc(rectF, 0.0f, f10, false, paint);
            canvas.restore();
        }
        this.f43350R.a(canvas);
        canvas.restore();
        int centerCircleColor = getCenterCircleColor();
        Paint paint2 = this.f22384v0;
        paint2.setColor(Color.argb((int) (Color.alpha(centerCircleColor) * 0.5f), Color.red(centerCircleColor), Color.green(centerCircleColor), Color.blue(centerCircleColor)));
        canvas.drawCircle(getSize() * 0.5f, getSize() * 0.5f, j(6.0f) + this.f22380A0, paint2);
        paint2.setColor(centerCircleColor);
        canvas.drawCircle(getSize() * 0.5f, getSize() * 0.5f, this.f22380A0, paint2);
        Iterator<AbstractC5355a<?>> it = this.f43365j0.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            if (AbstractC5355a.b.CenterSpeedometer != null) {
                int[] iArr = e.b.f43374a;
                throw null;
            }
            getWidth();
            getHeight();
            int i = AbstractC5355a.c.f44277a;
            throw null;
        }
    }

    @Override // k3.e, k3.c, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        float fJ = j(8.0f) + (getSpeedometerWidth() * 0.5f) + getPadding();
        this.f22385w0.set(fJ, fJ, getSize() - fJ, getSize() - fJ);
        x();
        o();
    }

    @Override // k3.e
    public final void r() {
        setMarksNumber(8);
        setMarksPadding(j(12.0f) + getSpeedometerWidth());
        setTickPadding(j(10.0f) + getSpeedometerWidth());
        setMarkStyle(EnumC5281b.ROUND);
        setMarkHeight(j(5.0f));
        setMarkWidth(j(2.0f));
        Context context = getContext();
        l.e(context, "context");
        setIndicator(new h(context));
        AbstractC5321b<?> indicator = getIndicator();
        indicator.i(16.0f * indicator.f44061b);
        indicator.g(-1);
        setBackgroundCircleColor(-12006167);
    }

    public final void setCenterCircleColor(int i) {
        this.f22384v0.setColor(i);
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setCenterCircleRadius(float f10) {
        this.f22380A0 = f10;
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setPointerColor(int i) {
        this.f22387y0 = i;
        this.f22382t0.setColor(i);
        x();
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setSpeedometerColor(int i) {
        this.f22386x0 = i;
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void setWithPointer(boolean z10) {
        this.f22388z0 = z10;
        if (this.f43307E) {
            invalidate();
        }
    }

    public final void w() {
        float speedometerWidth = getSpeedometerWidth();
        Paint paint = this.f22381s0;
        paint.setStrokeWidth(speedometerWidth);
        int iArgb = Color.argb(150, Color.red(this.f22386x0), Color.green(this.f22386x0), Color.blue(this.f22386x0));
        int iArgb2 = Color.argb(220, Color.red(this.f22386x0), Color.green(this.f22386x0), Color.blue(this.f22386x0));
        int iArgb3 = Color.argb(70, Color.red(this.f22386x0), Color.green(this.f22386x0), Color.blue(this.f22386x0));
        int iArgb4 = Color.argb(15, Color.red(this.f22386x0), Color.green(this.f22386x0), Color.blue(this.f22386x0));
        float offsetSpeed = (getOffsetSpeed() * (getEndDegree() - getStartDegree())) / 360.0f;
        SweepGradient sweepGradient = new SweepGradient(getSize() * 0.5f, getSize() * 0.5f, new int[]{iArgb, iArgb2, this.f22386x0, iArgb3, iArgb4, iArgb}, new float[]{0.0f, offsetSpeed * 0.5f, offsetSpeed, offsetSpeed, 0.99f, 1.0f});
        Matrix matrix = new Matrix();
        matrix.postRotate(getStartDegree(), getSize() * 0.5f, getSize() * 0.5f);
        sweepGradient.setLocalMatrix(matrix);
        paint.setShader(sweepGradient);
    }

    public final void x() {
        this.f22383u0.setShader(new RadialGradient(getSize() * 0.5f, j(8.0f) + (getSpeedometerWidth() * 0.5f) + getPadding(), (getSpeedometerWidth() * 0.5f) + j(8.0f), new int[]{Color.argb(160, Color.red(this.f22387y0), Color.green(this.f22387y0), Color.blue(this.f22387y0)), Color.argb(10, Color.red(this.f22387y0), Color.green(this.f22387y0), Color.blue(this.f22387y0))}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
