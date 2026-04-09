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

/* renamed from: com.applovin.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2116e0 extends View {

    /* renamed from: w, reason: collision with root package name */
    private static final int f19240w = Color.rgb(66, 145, 241);

    /* renamed from: x, reason: collision with root package name */
    private static final int f19241x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f19242y = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f19243a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f19244b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f19245c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f19246d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f19247e;

    /* renamed from: f, reason: collision with root package name */
    private float f19248f;

    /* renamed from: g, reason: collision with root package name */
    private int f19249g;

    /* renamed from: h, reason: collision with root package name */
    private int f19250h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f19251j;

    /* renamed from: k, reason: collision with root package name */
    private int f19252k;

    /* renamed from: l, reason: collision with root package name */
    private float f19253l;

    /* renamed from: m, reason: collision with root package name */
    private int f19254m;

    /* renamed from: n, reason: collision with root package name */
    private String f19255n;

    /* renamed from: o, reason: collision with root package name */
    private String f19256o;

    /* renamed from: p, reason: collision with root package name */
    private float f19257p;

    /* renamed from: q, reason: collision with root package name */
    private String f19258q;

    /* renamed from: r, reason: collision with root package name */
    private float f19259r;

    /* renamed from: s, reason: collision with root package name */
    private final float f19260s;

    /* renamed from: t, reason: collision with root package name */
    private final float f19261t;

    /* renamed from: u, reason: collision with root package name */
    private final float f19262u;

    /* renamed from: v, reason: collision with root package name */
    private final int f19263v;

    /* renamed from: com.applovin.impl.e0$a */
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

    public C2116e0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f19251j) * 360.0f;
    }

    public void a() {
        this.f19252k = f19240w;
        this.f19249g = f19241x;
        this.f19248f = this.f19261t;
        setMax(100);
        setProgress(0);
        this.f19253l = this.f19260s;
        this.f19254m = 0;
        this.f19257p = this.f19262u;
        this.f19250h = f19242y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f19245c = textPaint;
        textPaint.setColor(this.f19249g);
        this.f19245c.setTextSize(this.f19248f);
        this.f19245c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f19246d = textPaint2;
        textPaint2.setColor(this.f19250h);
        this.f19246d.setTextSize(this.f19257p);
        this.f19246d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f19243a = paint;
        paint.setColor(this.f19252k);
        this.f19243a.setStyle(Paint.Style.STROKE);
        this.f19243a.setAntiAlias(true);
        this.f19243a.setStrokeWidth(this.f19253l);
        Paint paint2 = new Paint();
        this.f19244b = paint2;
        paint2.setColor(this.f19254m);
        this.f19244b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f19252k;
    }

    public float getFinishedStrokeWidth() {
        return this.f19253l;
    }

    public int getInnerBackgroundColor() {
        return this.f19254m;
    }

    public String getInnerBottomText() {
        return this.f19258q;
    }

    public int getInnerBottomTextColor() {
        return this.f19250h;
    }

    public float getInnerBottomTextSize() {
        return this.f19257p;
    }

    public int getMax() {
        return this.f19251j;
    }

    public String getPrefixText() {
        return this.f19255n;
    }

    public int getProgress() {
        return this.i;
    }

    public String getSuffixText() {
        return this.f19256o;
    }

    public int getTextColor() {
        return this.f19249g;
    }

    public float getTextSize() {
        return this.f19248f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f19253l;
        this.f19247e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f19253l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f19244b);
        canvas.drawArc(this.f19247e, 270.0f, -getProgressAngle(), false, this.f19243a);
        String str = this.f19255n + this.i + this.f19256o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f19245c.measureText(str)) / 2.0f, (getWidth() - (this.f19245c.ascent() + this.f19245c.descent())) / 2.0f, this.f19245c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f19246d.setTextSize(this.f19257p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f19246d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f19259r) - ((this.f19245c.ascent() + this.f19245c.descent()) / 2.0f), this.f19246d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        setMeasuredDimension(a(i), a(i10));
        this.f19259r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f19249g = bundle.getInt("text_color");
        this.f19248f = bundle.getFloat("text_size");
        this.f19257p = bundle.getFloat("inner_bottom_text_size");
        this.f19258q = bundle.getString("inner_bottom_text");
        this.f19250h = bundle.getInt("inner_bottom_text_color");
        this.f19252k = bundle.getInt("finished_stroke_color");
        this.f19253l = bundle.getFloat("finished_stroke_width");
        this.f19254m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f19255n = bundle.getString("prefix");
        this.f19256o = bundle.getString("suffix");
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

    public void setFinishedStrokeColor(int i) {
        this.f19252k = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f19253l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f19254m = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f19258q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f19250h = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f19257p = f10;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f19251j = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f19255n = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.i = i;
        if (i > getMax()) {
            this.i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f19256o = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f19249g = i;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f19248f = f10;
        invalidate();
    }

    public C2116e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2116e0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19247e = new RectF();
        this.i = 0;
        this.f19255n = "";
        this.f19256o = "";
        this.f19258q = "";
        this.f19261t = a.d(getResources(), 14.0f);
        this.f19263v = (int) a.c(getResources(), 100.0f);
        this.f19260s = a.c(getResources(), 4.0f);
        this.f19262u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i10 = this.f19263v;
        return mode == Integer.MIN_VALUE ? Math.min(i10, size) : i10;
    }
}
