package com.lefan.signal.ui.wifi;

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
public final class WifiSignalView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final String f19479C;

    /* renamed from: a, reason: collision with root package name */
    public final float f19480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19481b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19482c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19483d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19484e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19485f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19486g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19487h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19488j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19489k;

    /* renamed from: l, reason: collision with root package name */
    public final C2280h f19490l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f19491m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f19492n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiSignalView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19480a = 100.0f;
        this.f19481b = 80;
        this.f19484e = 80.0f;
        this.f19485f = 20.0f;
        Paint paint = new Paint();
        this.f19486g = paint;
        Paint paint2 = new Paint();
        this.f19487h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f19488j = paint4;
        Paint paint5 = new Paint();
        this.f19489k = paint5;
        this.f19490l = new C2280h();
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
        paint4.setColor(Color.parseColor("#FF018786"));
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
        this.f19482c = e.l("0000", paint3) + 20.0f;
        this.f19483d = (20.0f * 2) + 360.0f + e.l("0", paint3);
        boolean z6 = MyApplication.f18812d;
        this.f19491m = new Path();
        this.f19492n = new Path();
        if (a.f3390d) {
            Locale locale = F4.e.f1457a;
            str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{0L}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{0L}, 1));
        }
        this.f19479C = str;
    }

    public final void a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C2280h c2280h = this.f19490l;
        c2280h.addLast(numValueOf);
        if (c2280h.f19820c > this.f19481b + 1) {
            c2280h.removeFirst();
        }
        postInvalidate();
    }

    public final void b(Canvas canvas) {
        float width = getWidth();
        float f2 = this.f19482c;
        float f5 = this.f19485f;
        float f6 = ((width - f2) - f5) / this.f19481b;
        Path path = this.f19491m;
        path.reset();
        Path path2 = this.f19492n;
        path2.reset();
        ArrayList arrayList = new ArrayList(this.f19490l);
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
            float f7 = (i * f6) + f2;
            float f8 = this.f19484e;
            float f9 = f6;
            float f10 = this.f19483d;
            float f11 = f5;
            float fIntValue = (f10 - (4.5f * f8)) - (((((Integer) obj).intValue() / this.f19480a) * f8) * 4.0f);
            if (i == 0) {
                path.moveTo(f7, fIntValue);
                path2.moveTo(f2, f10);
                path2.lineTo(f7, fIntValue);
            } else if (i == arrayList.size() - 1) {
                path.lineTo(f7, fIntValue);
                path2.lineTo(f7, fIntValue);
                path2.lineTo(f7, f10);
                path2.close();
                canvas.drawText(this.f19479C, f7, f10 + f11 + 8.0f, this.i);
            } else {
                path.lineTo(f7, fIntValue);
                path2.lineTo(f7, fIntValue);
            }
            i = i6;
            f6 = f9;
            f5 = f11;
        }
        canvas.drawPath(path, this.f19488j);
        canvas.drawPath(path2, this.f19489k);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        int i3;
        String str;
        String str2;
        Canvas canvas2 = canvas;
        i.e(canvas2, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float f2 = this.f19485f;
        float f5 = width - f2;
        char c6 = 2;
        float f6 = 2;
        float f7 = this.f19482c;
        float f8 = f7 / f6;
        Paint paint2 = this.i;
        canvas2.drawText("dBm", f8, f2, paint2);
        float f9 = this.f19482c;
        float f10 = this.f19483d;
        float f11 = this.f19485f;
        Paint paint3 = this.f19486g;
        canvas2.drawLine(f9, f10, f9, f11, paint3);
        float f12 = this.f19482c;
        float f13 = this.f19483d;
        canvas2.drawLine(f12, f13, f5, f13, paint3);
        float f14 = this.f19483d;
        float f15 = f14 + f2;
        canvas2.drawText("s", f7, 5.0f + f15, paint2);
        int i6 = 0;
        while (true) {
            i = 5;
            if (i6 >= 5) {
                break;
            }
            float f16 = this.f19484e;
            float f17 = (f14 - (i6 * f16)) - (f16 / f6);
            int i7 = i6;
            char c7 = c6;
            canvas2.drawLine(this.f19482c, f17, f5, f17, this.f19487h);
            Integer numValueOf = Integer.valueOf((i7 - 4) * 25);
            if (a.f3390d) {
                Locale locale = F4.e.f1457a;
                str2 = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
            } else {
                str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
            }
            i.e(paint2, "paint");
            paint2.getTextBounds(str2, 0, str2.length(), new Rect());
            canvas2.drawText(str2, f8, (r6.height() / 2) + f17, paint2);
            i6 = i7 + 1;
            c6 = c7;
        }
        float width2 = (getWidth() - f7) - f2;
        int i8 = this.f19481b;
        float f18 = width2 / i8;
        int i9 = i8;
        while (i9 > 0) {
            float f19 = (i9 * f18) + f7;
            int i10 = i8 - i9;
            if (i10 % 15 == 0) {
                float f20 = this.f19483d;
                Paint paint4 = paint2;
                i3 = i;
                paint = paint4;
                canvas2.drawLine(f19, f20, f19, f20 - 10, paint);
                if (i8 != i9) {
                    Integer numValueOf2 = Integer.valueOf(i10);
                    if (a.f3390d) {
                        Locale locale2 = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    }
                    canvas2.drawText(str, f19, 8.0f + f15, paint);
                }
            } else {
                paint = paint2;
                i3 = i;
                float f21 = this.f19483d;
                canvas2.drawLine(f19, f21, f19, f21 - i3, paint);
            }
            i9--;
            canvas2 = canvas;
            i = i3;
            paint2 = paint;
        }
        try {
            b(canvas);
        } catch (Throwable th) {
            a.d(th);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        setMeasuredDimension(i, (int) ((this.f19485f * 2) + this.f19483d));
    }
}
