package com.lefan.signal.ui.phone;

import R2.a;
import a.AbstractC0241a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
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
import java.util.NoSuchElementException;
import q5.i;

/* loaded from: classes.dex */
public final class PhoneTrendView extends View implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public float f19164C;

    /* renamed from: D, reason: collision with root package name */
    public float f19165D;

    /* renamed from: E, reason: collision with root package name */
    public float[] f19166E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f19167F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f19168G;

    /* renamed from: H, reason: collision with root package name */
    public final Path f19169H;

    /* renamed from: I, reason: collision with root package name */
    public final String f19170I;

    /* renamed from: J, reason: collision with root package name */
    public int f19171J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f19172K;

    /* renamed from: L, reason: collision with root package name */
    public String f19173L;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19174a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19175b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19176c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19177d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19178e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19179f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19180g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19181h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19182j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19183k;

    /* renamed from: l, reason: collision with root package name */
    public final C2280h f19184l;

    /* renamed from: m, reason: collision with root package name */
    public final String f19185m;

    /* renamed from: n, reason: collision with root package name */
    public float f19186n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneTrendView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19174a = new Handler(getContext().getMainLooper());
        this.f19175b = 80;
        this.f19178e = 80.0f;
        this.f19179f = 20.0f;
        Paint paint = new Paint();
        this.f19180g = paint;
        Paint paint2 = new Paint();
        this.f19181h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.f19182j = paint4;
        Paint paint5 = new Paint();
        this.f19183k = paint5;
        this.f19184l = new C2280h();
        this.f19185m = "dBm";
        this.f19186n = -113.0f;
        this.f19164C = -51.0f;
        this.f19165D = 62.0f;
        this.f19166E = AbstractC0241a.e("gsm");
        this.f19167F = new Paint();
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
        this.f19176c = e.l("0000", paint3) + 20.0f;
        this.f19177d = (20.0f * 2) + 360.0f + e.l("0", paint3);
        boolean z6 = MyApplication.f18812d;
        this.f19168G = new Path();
        this.f19169H = new Path();
        if (a.f3390d) {
            Locale locale = F4.e.f1457a;
            str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{0L}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{0L}, 1));
        }
        this.f19170I = str;
        this.f19171J = -120;
        this.f19172K = true;
        this.f19173L = "gsm";
    }

    public final void a(int i) {
        this.f19171J = i;
        if (i > this.f19164C || i < this.f19186n) {
            this.f19171J = (int) this.f19186n;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19174a.postDelayed(this, 1000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19174a.removeCallbacks(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        String str;
        int i;
        String str2;
        int i3;
        Canvas canvas2 = canvas;
        i.e(canvas2, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float f2 = this.f19179f;
        float f5 = width - f2;
        float f6 = this.f19176c;
        float f7 = f6 / 2;
        String str3 = this.f19185m;
        Paint paint2 = this.i;
        canvas2.drawText(str3, f7, f2, paint2);
        float f8 = this.f19176c;
        float f9 = this.f19177d;
        float f10 = this.f19179f;
        Paint paint3 = this.f19180g;
        canvas2.drawLine(f8, f9, f8, f10, paint3);
        float f11 = this.f19176c;
        float f12 = this.f19177d;
        canvas2.drawLine(f11, f12, f5, f12, paint3);
        float f13 = this.f19177d;
        float f14 = f13 + f2;
        canvas2.drawText("s", f6, 5.0f + f14, paint2);
        float f15 = this.f19178e;
        float f16 = f13 - (0.5f * f15);
        float[] fArr = this.f19166E;
        int length = fArr.length;
        int i6 = 2;
        float f17 = f16;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            float f18 = fArr[i7];
            int i9 = i8 + 1;
            float[] fArr2 = fArr;
            float f19 = f16 - ((((f18 - this.f19186n) / this.f19165D) * f15) * 4);
            RectF rectF = new RectF(f6, f19, f5, f17);
            int i10 = i7;
            int i11 = length;
            float f20 = f14;
            canvas2 = canvas;
            canvas2.drawLine(this.f19176c, f19, f5, f19, this.f19181h);
            Float fValueOf = Float.valueOf(f18);
            if (a.f3390d) {
                Locale locale = F4.e.f1457a;
                i = 0;
                str2 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                i = 0;
                str2 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
            i.e(paint2, "paint");
            paint2.getTextBounds(str2, i, str2.length(), new Rect());
            canvas2.drawText(str2, f7, (r5.height() / 2) + f19, paint2);
            if (i8 != 0) {
                Paint paint4 = this.f19167F;
                if (i8 != 1) {
                    i3 = i6;
                    if (i8 == i3) {
                        paint4.setColor(getContext().getColor(R.color.color_trend_2));
                    } else if (i8 == 3) {
                        paint4.setColor(getContext().getColor(R.color.color_trend_3));
                    } else if (i8 == 4) {
                        paint4.setColor(getContext().getColor(R.color.color_trend_4));
                    } else if (i8 == 5) {
                        paint4.setColor(getContext().getColor(R.color.color_trend_5));
                    }
                } else {
                    i3 = i6;
                    paint4.setColor(getContext().getColor(R.color.color_trend_1));
                }
                canvas2.drawRect(rectF, paint4);
            } else {
                i3 = i6;
            }
            i7 = i10 + 1;
            i6 = i3;
            i8 = i9;
            fArr = fArr2;
            f14 = f20;
            f17 = f19;
            length = i11;
        }
        float f21 = f14;
        float width2 = (getWidth() - f6) - f2;
        int i12 = this.f19175b;
        float f22 = i12;
        float f23 = width2 / f22;
        int i13 = i12;
        while (i13 > 0) {
            float f24 = (i13 * f23) + f6;
            int i14 = i12 - i13;
            if (i14 % 15 == 0) {
                float f25 = this.f19177d;
                paint = paint2;
                canvas2.drawLine(f24, f25, f24, f25 - 10, paint);
                if (i12 != i13) {
                    Integer numValueOf = Integer.valueOf(i14);
                    if (a.f3390d) {
                        Locale locale2 = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    canvas2.drawText(str, f24, f21 + 8.0f, paint);
                }
            } else {
                paint = paint2;
                float f26 = this.f19177d;
                canvas2.drawLine(f24, f26, f24, f26 - 5, paint);
            }
            i13--;
            paint2 = paint;
        }
        Paint paint5 = paint2;
        float width3 = ((getWidth() - f6) - f2) / f22;
        Path path = this.f19168G;
        path.reset();
        Path path2 = this.f19169H;
        path2.reset();
        ArrayList arrayList = new ArrayList(this.f19184l);
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            int i17 = i15 + 1;
            if (i15 < 0) {
                AbstractC2283k.O();
                throw null;
            }
            float f27 = width3;
            float f28 = (i15 * f27) + f6;
            ArrayList arrayList2 = arrayList;
            int i18 = size;
            float fIntValue = f16 - ((((((Integer) obj).intValue() - this.f19186n) / this.f19165D) * f15) * 4);
            if (i15 == 0) {
                path.moveTo(f28, fIntValue);
                path2.moveTo(f6, f13);
                path2.lineTo(f28, fIntValue);
            } else if (i15 == arrayList2.size() - 1) {
                path.lineTo(f28, fIntValue);
                path2.lineTo(f28, fIntValue);
                path2.lineTo(f28, f13);
                path2.close();
                canvas2.drawText(this.f19170I, f28, f21 + 8.0f, paint5);
            } else {
                path.lineTo(f28, fIntValue);
                path2.lineTo(f28, fIntValue);
            }
            i15 = i17;
            width3 = f27;
            arrayList = arrayList2;
            size = i18;
        }
        canvas2.drawPath(path, this.f19182j);
        canvas2.drawPath(path2, this.f19183k);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        setMeasuredDimension(i, (int) ((this.f19179f * 2) + this.f19177d));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f19172K;
        Handler handler = this.f19174a;
        if (!z6) {
            handler.postDelayed(this, 1000L);
            return;
        }
        Integer numValueOf = Integer.valueOf(this.f19171J);
        C2280h c2280h = this.f19184l;
        c2280h.addLast(numValueOf);
        if (c2280h.f19820c > this.f19175b + 1) {
            c2280h.removeFirst();
        }
        postInvalidate();
        handler.postDelayed(this, 1000L);
    }

    public final void setSignalType(String str) {
        i.e(str, "signalType");
        if (i.a(this.f19173L, str)) {
            return;
        }
        this.f19173L = str;
        float[] fArrE = AbstractC0241a.e(str);
        this.f19166E = fArrE;
        if (fArrE.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArrE[0];
        int i = 1;
        int length = fArrE.length - 1;
        if (1 <= length) {
            int i3 = 1;
            while (true) {
                fMin = Math.min(fMin, fArrE[i3]);
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f19186n = fMin;
        float[] fArr = this.f19166E;
        i.e(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        int length2 = fArr.length - 1;
        if (1 <= length2) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f19164C = fMax;
        this.f19165D = fMax - this.f19186n;
    }

    public final void setStart(boolean z6) {
        this.f19172K = z6;
    }
}
