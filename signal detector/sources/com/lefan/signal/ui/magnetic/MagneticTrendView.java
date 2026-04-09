package com.lefan.signal.ui.magnetic;

import F4.e;
import H4.g;
import R2.a;
import android.annotation.SuppressLint;
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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import d5.AbstractC2283k;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class MagneticTrendView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Path f18936C;

    /* renamed from: D, reason: collision with root package name */
    public final Path f18937D;

    /* renamed from: a, reason: collision with root package name */
    public float f18938a;

    /* renamed from: b, reason: collision with root package name */
    public float f18939b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18941d;

    /* renamed from: e, reason: collision with root package name */
    public float f18942e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18943f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18944g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f18945h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f18946j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f18947k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f18948l;

    /* renamed from: m, reason: collision with root package name */
    public final C2280h f18949m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18950n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public MagneticTrendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f18940c = 80.0f;
        this.f18941d = TTAdConstant.MATE_VALID;
        this.f18942e = 100.0f;
        this.f18944g = 20.0f;
        Paint paint = new Paint();
        this.f18945h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.f18946j = paint3;
        Paint paint4 = new Paint();
        this.f18947k = paint4;
        Paint paint5 = new Paint();
        this.f18948l = paint5;
        this.f18949m = new C2280h();
        this.f18950n = "μT";
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(2.0f);
        paint2.setPathEffect(new DashPathEffect(new float[]{8.0f, 10.0f}, 0.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(getContext() == null ? 0 : (int) ((8 * r6.getResources().getDisplayMetrics().density) + 0.5f));
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
        this.f18936C = new Path();
        this.f18937D = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1812b, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(2);
        if (string != null) {
            this.f18950n = string;
        }
        this.f18942e = typedArrayObtainStyledAttributes.getFloat(0, 100.0f);
        this.f18943f = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f2;
        boolean z6;
        String str;
        i.e(canvas, "canvas");
        super.draw(canvas);
        float width = getWidth();
        float f5 = this.f18944g;
        float f6 = width - f5;
        float f7 = this.f18938a;
        String str2 = this.f18950n;
        i.e(str2, "text");
        Paint paint = this.f18946j;
        i.e(paint, "paint");
        int i = 0;
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        float fWidth = f7 - (r3.width() / 2);
        float f8 = 2;
        float f9 = f5 * f8;
        canvas.drawText(str2, fWidth, f9 - 10.0f, paint);
        float f10 = this.f18938a;
        float f11 = this.f18939b;
        Paint paint2 = this.f18945h;
        canvas.drawLine(f10, f9 + 6.0f, f10, f11, paint2);
        float f12 = this.f18938a;
        float f13 = this.f18939b;
        canvas.drawLine(f12, f13, f6, f13, paint2);
        int i3 = 0;
        while (true) {
            f2 = this.f18940c;
            z6 = true;
            if (i3 >= 5) {
                break;
            }
            float f14 = i3;
            float f15 = (this.f18939b - (f2 * f14)) - (f2 / f8);
            canvas.drawLine(this.f18938a, f15, f6, f15, this.i);
            float f16 = this.f18943f;
            if (f16 >= 0.0f) {
                Float fValueOf = Float.valueOf((this.f18942e * f14) / 4);
                if (a.f3390d) {
                    Locale locale = e.f1457a;
                    str = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                }
            } else if (i3 == 0) {
                Float fValueOf2 = Float.valueOf(f16);
                if (a.f3390d) {
                    Locale locale2 = e.f1457a;
                    str = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                }
            } else {
                Float fValueOf3 = Float.valueOf((this.f18942e * (i3 - 1)) / 3);
                if (a.f3390d) {
                    Locale locale3 = e.f1457a;
                    str = String.format(e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                }
            }
            float f17 = this.f18938a / f8;
            paint.getTextBounds(str, 0, str.length(), new Rect());
            canvas.drawText(str, f17, f15 + (r6.height() / 2), paint);
            i3++;
        }
        ArrayList arrayList = new ArrayList(this.f18949m);
        float width2 = ((getWidth() - this.f18938a) - f5) / this.f18941d;
        Path path = this.f18936C;
        path.reset();
        Path path2 = this.f18937D;
        path2.reset();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i7 = i + 1;
            if (i < 0) {
                AbstractC2283k.O();
                throw null;
            }
            boolean z7 = z6;
            float f18 = (i * width2) + this.f18938a;
            float f19 = f2;
            float fFloatValue = (this.f18939b - (f2 / f8)) - (((((Float) obj).floatValue() / this.f18942e) * f2) * 4);
            if (i == 0) {
                path.moveTo(f18, fFloatValue);
                path2.moveTo(this.f18938a, this.f18939b);
                path2.lineTo(f18, fFloatValue);
            } else if (i == arrayList.size() - 1) {
                path.lineTo(f18, fFloatValue);
                path2.lineTo(f18, fFloatValue);
                path2.lineTo(f18, this.f18939b);
                path2.close();
            } else {
                path.lineTo(f18, fFloatValue);
                path2.lineTo(f18, fFloatValue);
            }
            i = i7;
            z6 = z7;
            f2 = f19;
        }
        canvas.drawPath(path, this.f18947k);
        canvas.drawPath(path2, this.f18948l);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        Paint paint = this.f18946j;
        i.e(paint, "paint");
        Rect rect = new Rect();
        paint.getTextBounds("0000", 0, 4, rect);
        float fWidth = rect.width();
        float f2 = this.f18944g;
        this.f18938a = fWidth + f2;
        float f5 = this.f18940c * 4.5f;
        i.e(paint, "paint");
        paint.getTextBounds("0", 0, 1, new Rect());
        float fWidth2 = (3 * f2) + f5 + r0.width();
        this.f18939b = fWidth2;
        setMeasuredDimension(i, (int) (fWidth2 + f2));
    }
}
