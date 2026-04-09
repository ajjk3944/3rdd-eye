package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i0 extends View {

    /* renamed from: w, reason: collision with root package name */
    private static final int f4245w = Color.rgb(66, 145, 241);

    /* renamed from: x, reason: collision with root package name */
    private static final int f4246x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f4247y = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f4248a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f4249b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f4250c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f4251d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f4252e;

    /* renamed from: f, reason: collision with root package name */
    private float f4253f;
    private int g;

    /* renamed from: h, reason: collision with root package name */
    private int f4254h;

    /* renamed from: i, reason: collision with root package name */
    private int f4255i;
    private int j;

    /* renamed from: k, reason: collision with root package name */
    private int f4256k;

    /* renamed from: l, reason: collision with root package name */
    private float f4257l;

    /* renamed from: m, reason: collision with root package name */
    private int f4258m;

    /* renamed from: n, reason: collision with root package name */
    private String f4259n;

    /* renamed from: o, reason: collision with root package name */
    private String f4260o;

    /* renamed from: p, reason: collision with root package name */
    private float f4261p;

    /* renamed from: q, reason: collision with root package name */
    private String f4262q;

    /* renamed from: r, reason: collision with root package name */
    private float f4263r;

    /* renamed from: s, reason: collision with root package name */
    private final float f4264s;

    /* renamed from: t, reason: collision with root package name */
    private final float f4265t;

    /* renamed from: u, reason: collision with root package name */
    private final float f4266u;

    /* renamed from: v, reason: collision with root package name */
    private final int f4267v;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.j) * 360.0f;
    }

    public void a() {
        this.f4256k = f4245w;
        this.g = f4246x;
        this.f4253f = this.f4265t;
        setMax(100);
        setProgress(0);
        this.f4257l = this.f4264s;
        this.f4258m = 0;
        this.f4261p = this.f4266u;
        this.f4254h = f4247y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f4250c = textPaint;
        textPaint.setColor(this.g);
        this.f4250c.setTextSize(this.f4253f);
        this.f4250c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f4251d = textPaint2;
        textPaint2.setColor(this.f4254h);
        this.f4251d.setTextSize(this.f4261p);
        this.f4251d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f4248a = paint;
        paint.setColor(this.f4256k);
        this.f4248a.setStyle(Paint.Style.STROKE);
        this.f4248a.setAntiAlias(true);
        this.f4248a.setStrokeWidth(this.f4257l);
        Paint paint2 = new Paint();
        this.f4249b = paint2;
        paint2.setColor(this.f4258m);
        this.f4249b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f4256k;
    }

    public float getFinishedStrokeWidth() {
        return this.f4257l;
    }

    public int getInnerBackgroundColor() {
        return this.f4258m;
    }

    public String getInnerBottomText() {
        return this.f4262q;
    }

    public int getInnerBottomTextColor() {
        return this.f4254h;
    }

    public float getInnerBottomTextSize() {
        return this.f4261p;
    }

    public int getMax() {
        return this.j;
    }

    public String getPrefixText() {
        return this.f4259n;
    }

    public int getProgress() {
        return this.f4255i;
    }

    public String getSuffixText() {
        return this.f4260o;
    }

    public int getTextColor() {
        return this.g;
    }

    public float getTextSize() {
        return this.f4253f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f4257l;
        this.f4252e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f4257l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f4249b);
        canvas.drawArc(this.f4252e, 270.0f, -getProgressAngle(), false, this.f4248a);
        String str = this.f4259n + this.f4255i + this.f4260o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f4250c.measureText(str)) / 2.0f, (getWidth() - (this.f4250c.ascent() + this.f4250c.descent())) / 2.0f, this.f4250c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f4251d.setTextSize(this.f4261p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f4251d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f4263r) - ((this.f4250c.ascent() + this.f4250c.descent()) / 2.0f), this.f4251d);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i10) {
        setMeasuredDimension(a(i4), a(i10));
        this.f4263r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.g = bundle.getInt("text_color");
        this.f4253f = bundle.getFloat("text_size");
        this.f4261p = bundle.getFloat("inner_bottom_text_size");
        this.f4262q = bundle.getString("inner_bottom_text");
        this.f4254h = bundle.getInt("inner_bottom_text_color");
        this.f4256k = bundle.getInt("finished_stroke_color");
        this.f4257l = bundle.getFloat("finished_stroke_width");
        this.f4258m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f4259n = bundle.getString("prefix");
        this.f4260o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i4) {
        this.f4256k = i4;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f4257l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i4) {
        this.f4258m = i4;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f4262q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i4) {
        this.f4254h = i4;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f4261p = f10;
        invalidate();
    }

    public void setMax(int i4) {
        if (i4 > 0) {
            this.j = i4;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f4259n = str;
        invalidate();
    }

    public void setProgress(int i4) {
        this.f4255i = i4;
        if (i4 > getMax()) {
            this.f4255i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f4260o = str;
        invalidate();
    }

    public void setTextColor(int i4) {
        this.g = i4;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f4253f = f10;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4252e = new RectF();
        this.f4255i = 0;
        this.f4259n = "";
        this.f4260o = "";
        this.f4262q = "";
        this.f4265t = a.d(getResources(), 14.0f);
        this.f4267v = (int) a.c(getResources(), 100.0f);
        this.f4264s = a.c(getResources(), 4.0f);
        this.f4266u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        int i10 = this.f4267v;
        return mode == Integer.MIN_VALUE ? Math.min(i10, size) : i10;
    }
}
