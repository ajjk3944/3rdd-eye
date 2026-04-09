package com.lefan.signal.ui.speed;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import q5.i;

/* loaded from: classes.dex */
public final class CompassView2 extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f19284a;

    /* renamed from: b, reason: collision with root package name */
    public float f19285b;

    /* renamed from: c, reason: collision with root package name */
    public float f19286c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19287d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19288e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19289f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19290g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19291h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19292j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19293k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f19294l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassView2(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19284a = 200.0f;
        String[] stringArray = getResources().getStringArray(R.array.directions);
        i.d(stringArray, "getStringArray(...)");
        this.f19287d = stringArray;
        this.f19288e = 40.0f;
        this.f19289f = (float) (40.0f * 0.87d);
        Paint paint = new Paint();
        this.f19290g = paint;
        Paint paint2 = new Paint();
        this.f19291h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f19292j = paint4;
        Paint paint5 = new Paint();
        this.f19293k = paint5;
        Paint.Style style = Paint.Style.FILL;
        paint4.setStyle(style);
        paint4.setColor(-65536);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3.0f);
        paint.setColor(getContext().getColor(R.color.text_color));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(-3355444);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(4.0f);
        paint3.setColor(-65536);
        paint5.setTextSize(40.0f);
        paint5.setStyle(style);
        paint5.setColor(getContext().getColor(R.color.text_color));
        paint5.setTypeface(Typeface.DEFAULT_BOLD);
        this.f19294l = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        char c6;
        Paint paint;
        int i3;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f19294l;
        path.reset();
        float f2 = this.f19285b;
        float f5 = this.f19289f;
        path.moveTo(f2, f5);
        float f6 = this.f19285b;
        char c7 = 2;
        float f7 = this.f19288e / 2;
        float f8 = 0.0f;
        path.lineTo(f6 + f7, 0.0f);
        path.lineTo(this.f19285b - f7, 0.0f);
        path.close();
        canvas.drawPath(path, this.f19292j);
        float f9 = this.f19285b;
        canvas.drawLine(f9, this.f19289f, f9, this.f19284a, this.i);
        float width = getWidth();
        float f10 = this.f19289f;
        float f11 = this.f19289f;
        Paint paint2 = this.f19290g;
        canvas.drawLine(0.0f, f10, width, f11, paint2);
        Paint paint3 = paint2;
        canvas.drawLine(0.0f, this.f19284a, getWidth(), this.f19284a, this.f19291h);
        int width2 = getWidth() / 15;
        float f12 = this.f19286c;
        float f13 = 112;
        float f14 = f12 - f13;
        if (f14 < 0.0f) {
            f14 = (360 + f12) - f13;
        }
        float f15 = 15;
        float f16 = f14 % f15;
        float f17 = (f16 > ((float) 7) ? ((-f14) % f15) * width2 : width2 * f16) / f15;
        float f18 = f14 - f16;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            float f19 = (width2 * i7) + f17;
            float f20 = f18 + (15 * i7);
            if (f20 >= 360.0f) {
                f20 -= 360;
            }
            if (f20 % f15 != f8) {
                i = i6;
                c6 = c7;
                paint = paint3;
                i3 = i7;
                float f21 = this.f19289f;
                canvas.drawLine(f19, f21, f19, f21 + 20.0f, paint);
            } else if (f20 % 45 == f8) {
                float f22 = this.f19289f;
                Paint paint4 = paint3;
                i3 = i7;
                c6 = c7;
                i = i6;
                canvas.drawLine(f19, f22, f19, 40.0f + f22, paint4);
                String str = this.f19287d[((int) ((f20 + 22.0d) / 45.0d)) % 8];
                i.b(str);
                Rect rect = new Rect();
                int length = str.length();
                Paint paint5 = this.f19293k;
                paint5.getTextBounds(str, i, length, rect);
                canvas.drawText(str, f19 - (rect.width() / 2), 110.0f + f5, paint5);
                paint = paint4;
            } else {
                i = i6;
                c6 = c7;
                paint = paint3;
                i3 = i7;
                float f23 = this.f19289f;
                canvas.drawLine(f19, f23, f19, f23 + 20.0f, paint);
            }
            if (i3 == 15) {
                return;
            }
            i7 = i3 + 1;
            paint3 = paint;
            i6 = i;
            c7 = c6;
            f8 = 0.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        this.f19285b = View.MeasureSpec.getSize(i) / 2;
        setMeasuredDimension(i, (int) this.f19284a);
    }

    public final void setDirection(float f2) {
        if (this.f19286c == f2) {
            return;
        }
        this.f19286c = f2;
        invalidate();
    }
}
