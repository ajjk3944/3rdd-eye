package com.lefan.signal.ui.noise;

import R2.a;
import android.content.Context;
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
import com.bumptech.glide.e;
import com.lefan.signal.MyApplication;
import d5.AbstractC2283k;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class NoiseTrendView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Path f19015C;

    /* renamed from: D, reason: collision with root package name */
    public final String f19016D;

    /* renamed from: a, reason: collision with root package name */
    public float f19017a;

    /* renamed from: b, reason: collision with root package name */
    public int f19018b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19019c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19020d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19021e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19022f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19023g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19024h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19025j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19026k;

    /* renamed from: l, reason: collision with root package name */
    public final C2280h f19027l;

    /* renamed from: m, reason: collision with root package name */
    public final String f19028m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f19029n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoiseTrendView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19017a = 100.0f;
        this.f19018b = 80;
        this.f19021e = 80.0f;
        this.f19022f = 20.0f;
        Paint paint = new Paint();
        this.f19023g = paint;
        Paint paint2 = new Paint();
        this.f19024h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f19025j = paint4;
        Paint paint5 = new Paint();
        this.f19026k = paint5;
        this.f19027l = new C2280h();
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(2.0f);
        paint2.setPathEffect(new DashPathEffect(new float[]{8.0f, 10.0f}, 0.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(e.i(getContext(), 8));
        paint3.setFakeBoldText(true);
        paint3.setColor(getContext().getColor(R.color.text_color));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint4.setPathEffect(new CornerPathEffect(20.0f));
        paint4.setColor(Color.parseColor("#018786"));
        paint4.setStrokeWidth(5.0f);
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(2.0f);
        float fI = e.i(getContext(), 160);
        int color = paint4.getColor();
        int i = (int) 51.0f;
        i = i <= 0 ? 0 : i;
        int i3 = ((255 <= i ? 255 : i) << 24) + (color & 16777215);
        int color2 = paint4.getColor();
        int i6 = (int) 12.75f;
        i6 = i6 <= 0 ? 0 : i6;
        paint5.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fI, i3, ((255 > i6 ? i6 : 255) << 24) + (color2 & 16777215), Shader.TileMode.CLAMP));
        this.f19019c = e.l("0000", paint3) + 20.0f;
        this.f19020d = (20.0f * 2) + 360.0f + e.l("0", paint3);
        if (a.f3390d) {
            Locale locale = F4.e.f1457a;
            str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{0L}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{0L}, 1));
        }
        this.f19028m = str;
        this.f19029n = new Path();
        this.f19015C = new Path();
        this.f19016D = "dB";
    }

    public final void a(float f2) {
        Float fValueOf = Float.valueOf(f2);
        C2280h c2280h = this.f19027l;
        c2280h.addLast(fValueOf);
        if (c2280h.f19820c > this.f19018b + 1) {
            c2280h.removeFirst();
        }
        postInvalidate();
    }

    public final void b() {
        this.f19027l.clear();
        this.f19018b = 80;
        this.f19017a = 100.0f;
        boolean z6 = MyApplication.f18812d;
        postInvalidate();
    }

    public final void c(ArrayList arrayList) {
        i.e(arrayList, "steps");
        C2280h c2280h = this.f19027l;
        c2280h.clear();
        if (arrayList.size() > this.f19018b) {
            this.f19018b = arrayList.size();
        }
        c2280h.addAll(arrayList);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f2;
        int i;
        boolean z6;
        float f5;
        Paint paint;
        int i3;
        int i6;
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float f6 = this.f19022f;
        float f7 = width - f6;
        char c6 = 2;
        float f8 = 2;
        float f9 = this.f19019c;
        float f10 = f9 / f8;
        String str3 = this.f19016D;
        Paint paint2 = this.i;
        canvas.drawText(str3, f10, f6, paint2);
        float f11 = this.f19019c;
        float f12 = this.f19020d;
        float f13 = this.f19022f;
        Paint paint3 = this.f19023g;
        canvas.drawLine(f11, f12, f11, f13, paint3);
        float f14 = this.f19019c;
        float f15 = this.f19020d;
        canvas.drawLine(f14, f15, f7, f15, paint3);
        float f16 = this.f19020d;
        float f17 = f16 + f6;
        canvas.drawText("s", f9, 5.0f + f17, paint2);
        int i7 = 0;
        while (true) {
            f2 = this.f19021e;
            i = 5;
            char c7 = c6;
            z6 = true;
            if (i7 >= 5) {
                break;
            }
            float f18 = (f16 - (i7 * f2)) - (f2 / f8);
            int i8 = i7;
            canvas.drawLine(this.f19019c, f18, f7, f18, this.f19024h);
            Integer numValueOf = Integer.valueOf(i8 * 25);
            if (a.f3390d) {
                Locale locale = F4.e.f1457a;
                str2 = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
            } else {
                str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
            }
            i.e(paint2, "paint");
            paint2.getTextBounds(str2, 0, str2.length(), new Rect());
            canvas.drawText(str2, f10, f18 + (r5.height() / 2), paint2);
            i7 = i8 + 1;
            c6 = c7;
        }
        int i9 = this.f19018b;
        float width2 = ((getWidth() - f9) - f6) / i9;
        int i10 = i9;
        while (i10 > 0) {
            float f19 = (i10 * width2) + f9;
            if ((this.f19018b - i10) % 15 == 0) {
                f5 = f2;
                float f20 = this.f19020d;
                paint = paint2;
                i3 = i10;
                canvas.drawLine(f19, f20, f19, f20 - 10, paint);
                int i11 = this.f19018b;
                if (i11 != i3) {
                    Integer numValueOf2 = Integer.valueOf(i11 - i3);
                    if (a.f3390d) {
                        Locale locale2 = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    }
                    canvas.drawText(str, f19, f17 + 8.0f, paint);
                }
                i6 = 5;
            } else {
                f5 = f2;
                int i12 = i;
                paint = paint2;
                i3 = i10;
                float f21 = i12;
                i6 = i12;
                float f22 = this.f19020d;
                canvas.drawLine(f19, f22, f19, f22 - f21, paint);
            }
            i10 = i3 - 1;
            paint2 = paint;
            f2 = f5;
            i = i6;
        }
        float f23 = f2;
        Paint paint4 = paint2;
        float width3 = ((getWidth() - f9) - f6) / this.f19018b;
        ArrayList arrayList = new ArrayList(this.f19027l);
        Path path = this.f19029n;
        path.reset();
        Path path2 = this.f19015C;
        path2.reset();
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC2283k.O();
                throw null;
            }
            boolean z7 = z6;
            float f24 = (i14 * width3) + f9;
            float f25 = width3;
            float fFloatValue = (f16 - (((((Float) obj).floatValue() / this.f19017a) * f23) * 4)) - (f23 / f8);
            if (i14 == 0) {
                path.moveTo(f24, fFloatValue);
                path2.moveTo(f9, f16);
                path2.lineTo(f24, fFloatValue);
            } else if (i14 == arrayList.size() - 1) {
                path.lineTo(f24, fFloatValue);
                path2.lineTo(f24, fFloatValue);
                path2.lineTo(f24, f16);
                path2.close();
                canvas.drawText(this.f19028m, f24, f17 + 8.0f, paint4);
            } else {
                path.lineTo(f24, fFloatValue);
                path2.lineTo(f24, fFloatValue);
            }
            i14 = i15;
            z6 = z7;
            width3 = f25;
        }
        canvas.drawPath(path, this.f19025j);
        canvas.drawPath(path2, this.f19026k);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        setMeasuredDimension(i, (int) ((this.f19022f * 2) + this.f19020d));
    }
}
