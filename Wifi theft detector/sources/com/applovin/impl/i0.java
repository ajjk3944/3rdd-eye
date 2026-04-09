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
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;

/* loaded from: classes.dex */
public class i0 extends View {

    /* renamed from: w, reason: collision with root package name */
    private static final int f6172w = Color.rgb(66, 145, 241);

    /* renamed from: x, reason: collision with root package name */
    private static final int f6173x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f6174y = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f6175a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f6176b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f6177c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f6178d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f6179e;

    /* renamed from: f, reason: collision with root package name */
    private float f6180f;

    /* renamed from: g, reason: collision with root package name */
    private int f6181g;

    /* renamed from: h, reason: collision with root package name */
    private int f6182h;

    /* renamed from: i, reason: collision with root package name */
    private int f6183i;

    /* renamed from: j, reason: collision with root package name */
    private int f6184j;

    /* renamed from: k, reason: collision with root package name */
    private int f6185k;

    /* renamed from: l, reason: collision with root package name */
    private float f6186l;

    /* renamed from: m, reason: collision with root package name */
    private int f6187m;

    /* renamed from: n, reason: collision with root package name */
    private String f6188n;

    /* renamed from: o, reason: collision with root package name */
    private String f6189o;

    /* renamed from: p, reason: collision with root package name */
    private float f6190p;

    /* renamed from: q, reason: collision with root package name */
    private String f6191q;

    /* renamed from: r, reason: collision with root package name */
    private float f6192r;

    /* renamed from: s, reason: collision with root package name */
    private final float f6193s;

    /* renamed from: t, reason: collision with root package name */
    private final float f6194t;

    /* renamed from: u, reason: collision with root package name */
    private final float f6195u;

    /* renamed from: v, reason: collision with root package name */
    private final int f6196v;

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
        return (getProgress() / this.f6184j) * 360.0f;
    }

    public void a() {
        this.f6185k = f6172w;
        this.f6181g = f6173x;
        this.f6180f = this.f6194t;
        setMax(100);
        setProgress(0);
        this.f6186l = this.f6193s;
        this.f6187m = 0;
        this.f6190p = this.f6195u;
        this.f6182h = f6174y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f6177c = textPaint;
        textPaint.setColor(this.f6181g);
        this.f6177c.setTextSize(this.f6180f);
        this.f6177c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f6178d = textPaint2;
        textPaint2.setColor(this.f6182h);
        this.f6178d.setTextSize(this.f6190p);
        this.f6178d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f6175a = paint;
        paint.setColor(this.f6185k);
        this.f6175a.setStyle(Paint.Style.STROKE);
        this.f6175a.setAntiAlias(true);
        this.f6175a.setStrokeWidth(this.f6186l);
        Paint paint2 = new Paint();
        this.f6176b = paint2;
        paint2.setColor(this.f6187m);
        this.f6176b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f6185k;
    }

    public float getFinishedStrokeWidth() {
        return this.f6186l;
    }

    public int getInnerBackgroundColor() {
        return this.f6187m;
    }

    public String getInnerBottomText() {
        return this.f6191q;
    }

    public int getInnerBottomTextColor() {
        return this.f6182h;
    }

    public float getInnerBottomTextSize() {
        return this.f6190p;
    }

    public int getMax() {
        return this.f6184j;
    }

    public String getPrefixText() {
        return this.f6188n;
    }

    public int getProgress() {
        return this.f6183i;
    }

    public String getSuffixText() {
        return this.f6189o;
    }

    public int getTextColor() {
        return this.f6181g;
    }

    public float getTextSize() {
        return this.f6180f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f6186l;
        this.f6179e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f6186l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f6176b);
        canvas.drawArc(this.f6179e, 270.0f, -getProgressAngle(), false, this.f6175a);
        String str = this.f6188n + this.f6183i + this.f6189o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f6177c.measureText(str)) / 2.0f, (getWidth() - (this.f6177c.descent() + this.f6177c.ascent())) / 2.0f, this.f6177c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f6178d.setTextSize(this.f6190p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f6178d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f6192r) - ((this.f6177c.descent() + this.f6177c.ascent()) / 2.0f), this.f6178d);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f6192r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f6181g = bundle.getInt("text_color");
        this.f6180f = bundle.getFloat("text_size");
        this.f6190p = bundle.getFloat("inner_bottom_text_size");
        this.f6191q = bundle.getString("inner_bottom_text");
        this.f6182h = bundle.getInt("inner_bottom_text_color");
        this.f6185k = bundle.getInt("finished_stroke_color");
        this.f6186l = bundle.getFloat("finished_stroke_width");
        this.f6187m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
        this.f6188n = bundle.getString("prefix");
        this.f6189o = bundle.getString("suffix");
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
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f6185k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f6186l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f6187m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f6191q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f6182h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f6190p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f6184j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f6188n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f6183i = i10;
        if (i10 > getMax()) {
            this.f6183i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f6189o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f6181g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f6180f = f10;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6179e = new RectF();
        this.f6183i = 0;
        this.f6188n = "";
        this.f6189o = "";
        this.f6191q = "";
        this.f6194t = a.d(getResources(), 14.0f);
        this.f6196v = (int) a.c(getResources(), 100.0f);
        this.f6193s = a.c(getResources(), 4.0f);
        this.f6195u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f6196v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
