package com.lefan.signal.ui.speed;

import F4.e;
import H4.g;
import R2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;
import d5.AbstractC2282j;
import d5.AbstractC2283k;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class SpeedTrendView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Path f19312C;

    /* renamed from: D, reason: collision with root package name */
    public final Path f19313D;

    /* renamed from: E, reason: collision with root package name */
    public final String f19314E;

    /* renamed from: a, reason: collision with root package name */
    public float f19315a;

    /* renamed from: b, reason: collision with root package name */
    public float f19316b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19318d;

    /* renamed from: e, reason: collision with root package name */
    public float f19319e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19320f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19321g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19322h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19323j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19324k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19325l;

    /* renamed from: m, reason: collision with root package name */
    public final C2280h f19326m;

    /* renamed from: n, reason: collision with root package name */
    public String f19327n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedTrendView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19317c = 80.0f;
        this.f19318d = 80;
        this.f19319e = 260.0f;
        this.f19321g = 20.0f;
        Paint paint = new Paint();
        this.f19322h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.f19323j = paint3;
        Paint paint4 = new Paint();
        this.f19324k = paint4;
        Paint paint5 = new Paint();
        this.f19325l = paint5;
        this.f19326m = new C2280h();
        this.f19327n = "KM/H";
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(2.0f);
        paint2.setPathEffect(new DashPathEffect(new float[]{8.0f, 10.0f}, 0.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(getContext() == null ? 0 : (int) ((8 * r5.getResources().getDisplayMetrics().density) + 0.5f));
        paint3.setFakeBoldText(true);
        paint3.setColor(getContext().getColor(R.color.text_color));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint4.setPathEffect(new CornerPathEffect(20.0f));
        paint4.setColor(Color.parseColor("#FF018786"));
        paint4.setStrokeWidth(6.0f);
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(2.0f);
        Context context2 = getContext();
        float f2 = context2 == null ? 0 : (int) ((160 * context2.getResources().getDisplayMetrics().density) + 0.5f);
        int color = paint4.getColor();
        int i = (int) 51.0f;
        i = i <= 0 ? 0 : i;
        int i3 = ((255 <= i ? 255 : i) << 24) + (color & 16777215);
        int color2 = paint4.getColor();
        int i6 = (int) 12.75f;
        i6 = i6 <= 0 ? 0 : i6;
        paint5.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f2, i3, ((255 > i6 ? i6 : 255) << 24) + (color2 & 16777215), Shader.TileMode.CLAMP));
        boolean z6 = MyApplication.f18812d;
        this.f19312C = new Path();
        this.f19313D = new Path();
        if (a.f3390d) {
            Locale locale = e.f1457a;
            str = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{0}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{0}, 1));
        }
        this.f19314E = str;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1812b, 0, 0);
        this.f19319e = typedArrayObtainStyledAttributes.getFloat(0, 100.0f);
        this.f19320f = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas) {
        float width = getWidth() - this.f19315a;
        float f2 = this.f19321g;
        float f5 = (width - f2) / this.f19318d;
        Path path = this.f19312C;
        path.reset();
        Path path2 = this.f19313D;
        path2.reset();
        ArrayList arrayList = new ArrayList(this.f19326m);
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i6 = i + 1;
            if (i < 0) {
                AbstractC2283k.O();
                throw null;
            }
            Float f6 = (Float) obj;
            i.b(f6);
            float fFloatValue = f6.floatValue();
            String str = this.f19327n;
            if (i.a(str, "MPH")) {
                fFloatValue *= 0.621371f;
            } else if (i.a(str, "KN")) {
                fFloatValue /= 1.852f;
            }
            if (fFloatValue > this.f19319e) {
                this.f19319e = 20.0f + fFloatValue;
            }
            float f7 = (i * f5) + this.f19315a;
            float f8 = this.f19316b;
            float f9 = this.f19317c;
            float f10 = (f8 - (f9 / 2)) - (((fFloatValue / this.f19319e) * f9) * 4);
            if (i == 0) {
                path.moveTo(f7, f10);
                path2.moveTo(this.f19315a, this.f19316b);
                path2.lineTo(f7, f10);
            } else if (i == arrayList.size() - 1) {
                path.lineTo(f7, f10);
                path2.lineTo(f7, f10);
                path2.lineTo(f7, this.f19316b);
                path2.close();
                canvas.drawText(this.f19314E, f7, this.f19316b + f2 + 8.0f, this.f19323j);
            } else {
                path.lineTo(f7, f10);
                path2.lineTo(f7, f10);
            }
            i = i6;
        }
        canvas.drawPath(path, this.f19324k);
        canvas.drawPath(path2, this.f19325l);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint;
        String str;
        String str2;
        Canvas canvas2 = canvas;
        i.e(canvas2, "canvas");
        super.draw(canvas);
        float width = getWidth();
        float f2 = this.f19321g;
        float f5 = width - f2;
        String str3 = this.f19327n;
        float f6 = 2;
        float f7 = this.f19315a / f6;
        Paint paint2 = this.f19323j;
        canvas2.drawText(str3, f7, f2, paint2);
        float f8 = this.f19315a;
        float f9 = this.f19316b;
        Paint paint3 = this.f19322h;
        canvas2.drawLine(f8, (f2 * f6) + 6.0f, f8, f9, paint3);
        float f10 = this.f19315a;
        float f11 = this.f19316b;
        canvas2.drawLine(f10, f11, f5, f11, paint3);
        canvas2.drawText("s", this.f19315a, this.f19316b + f2 + 5.0f, paint2);
        for (int i = 0; i < 5; i++) {
            float f12 = this.f19316b;
            float f13 = i;
            float f14 = this.f19317c;
            float f15 = (f12 - (f14 * f13)) - (f14 / f6);
            canvas2.drawLine(this.f19315a, f15, f5, f15, this.i);
            float f16 = this.f19320f;
            if (f16 >= 0.0f) {
                Float fValueOf = Float.valueOf((this.f19319e * f13) / 4);
                if (a.f3390d) {
                    Locale locale = e.f1457a;
                    str2 = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                }
            } else if (i == 0) {
                Float fValueOf2 = Float.valueOf(f16);
                if (a.f3390d) {
                    Locale locale2 = e.f1457a;
                    str2 = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                }
            } else {
                Float fValueOf3 = Float.valueOf((this.f19319e * (i - 1)) / 3);
                if (a.f3390d) {
                    Locale locale3 = e.f1457a;
                    str2 = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                }
            }
            float f17 = this.f19315a / f6;
            i.e(paint2, "paint");
            paint2.getTextBounds(str2, 0, str2.length(), new Rect());
            canvas2.drawText(str2, f17, f15 + (r7.height() / 2), paint2);
        }
        float width2 = (getWidth() - this.f19315a) - f2;
        int i3 = this.f19318d;
        float f18 = width2 / i3;
        int i6 = i3;
        while (i6 > 0) {
            float f19 = this.f19315a + (i6 * f18);
            int i7 = i3 - i6;
            if (i7 % 15 == 0) {
                float f20 = this.f19316b;
                paint = paint2;
                canvas2.drawLine(f19, f20, f19, f20 - 10, paint);
                if (i3 != i6) {
                    Integer numValueOf = Integer.valueOf(i7);
                    if (a.f3390d) {
                        Locale locale4 = e.f1457a;
                        str = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    canvas2.drawText(str, f19, this.f19316b + f2 + 8.0f, paint);
                }
            } else {
                paint = paint2;
                float f21 = this.f19316b;
                canvas2.drawLine(f19, f21, f19, f21 - 5, paint);
            }
            i6--;
            canvas2 = canvas;
            paint2 = paint;
        }
        try {
            a(canvas);
        } catch (Throwable th) {
            a.d(th);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19326m.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        Paint paint = this.f19323j;
        i.e(paint, "paint");
        Rect rect = new Rect();
        paint.getTextBounds("0000", 0, 4, rect);
        float fWidth = rect.width();
        float f2 = this.f19321g;
        this.f19315a = fWidth + f2;
        float f5 = this.f19317c * 4.5f;
        i.e(paint, "paint");
        paint.getTextBounds("0", 0, 1, new Rect());
        float fWidth2 = (3 * f2) + f5 + r0.width();
        this.f19316b = fWidth2;
        setMeasuredDimension(i, (int) ((f2 * 2) + fWidth2));
    }

    public final void setSpeed(float f2) {
        Float fValueOf = Float.valueOf(f2);
        C2280h c2280h = this.f19326m;
        c2280h.addLast(fValueOf);
        if (c2280h.f19820c > this.f19318d + 1) {
            c2280h.removeFirst();
        }
        postInvalidate();
    }

    public final void setUnit(String str) {
        float fFloatValue;
        i.e(str, "string");
        if (str.equals(this.f19327n)) {
            return;
        }
        this.f19327n = str;
        boolean zA = i.a(str, "MPH");
        C2280h c2280h = this.f19326m;
        if (zA) {
            Float fB0 = AbstractC2282j.b0(c2280h);
            fFloatValue = (fB0 != null ? fB0.floatValue() : 200.0f) * 0.621371f;
        } else if (i.a(str, "KN")) {
            Float fB02 = AbstractC2282j.b0(c2280h);
            fFloatValue = (fB02 != null ? fB02.floatValue() : 120.0f) / 1.852f;
        } else {
            Float fB03 = AbstractC2282j.b0(c2280h);
            fFloatValue = fB03 != null ? fB03.floatValue() : 300.0f;
        }
        this.f19319e = fFloatValue + 20.0f;
        postInvalidate();
    }
}
