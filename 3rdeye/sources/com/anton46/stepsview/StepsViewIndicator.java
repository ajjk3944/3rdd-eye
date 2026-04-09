package com.anton46.stepsview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import w2.C5718a;

/* loaded from: classes.dex */
public class StepsViewIndicator extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f18732b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f18733c;

    /* renamed from: d, reason: collision with root package name */
    public int f18734d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18735e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18736f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18737g;

    /* renamed from: h, reason: collision with root package name */
    public int f18738h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f18739j;

    /* renamed from: k, reason: collision with root package name */
    public float f18740k;

    /* renamed from: l, reason: collision with root package name */
    public float f18741l;

    /* renamed from: m, reason: collision with root package name */
    public float f18742m;

    /* renamed from: n, reason: collision with root package name */
    public float f18743n;

    /* renamed from: o, reason: collision with root package name */
    public float f18744o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f18745p;

    /* renamed from: q, reason: collision with root package name */
    public int f18746q;

    /* renamed from: r, reason: collision with root package name */
    public a f18747r;

    public interface a {
    }

    public StepsViewIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18732b = new Paint();
        this.f18733c = new Paint();
        this.f18734d = 2;
        this.f18738h = -256;
        this.i = -16777216;
        this.f18745p = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5718a.f47322a);
        this.f18734d = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f18735e = 20.0f;
        this.f18736f = 28.0f;
        this.f18737g = 50.0f;
    }

    public List<Float> getThumbContainerXPosition() {
        return this.f18745p;
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            ((StepsView) this.f18747r).b();
            this.f18732b.setAntiAlias(true);
            this.f18732b.setColor(this.i);
            Paint paint = this.f18732b;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f18732b.setStrokeWidth(2.0f);
            this.f18733c.setAntiAlias(true);
            this.f18733c.setColor(this.f18738h);
            this.f18733c.setStyle(style);
            this.f18733c.setStrokeWidth(2.0f);
            int i = 0;
            int i10 = 0;
            while (i10 < this.f18745p.size()) {
                canvas.drawCircle(((Float) this.f18745p.get(i10)).floatValue(), this.f18739j, this.f18736f, i10 <= this.f18746q ? this.f18733c : this.f18732b);
                i10++;
            }
            Paint paint2 = this.f18732b;
            Paint.Style style2 = Paint.Style.FILL;
            paint2.setStyle(style2);
            this.f18733c.setStyle(style2);
            int i11 = 0;
            while (i11 < this.f18745p.size() - 1) {
                int i12 = i11 + 1;
                Canvas canvas2 = canvas;
                canvas2.drawRect(((Float) this.f18745p.get(i11)).floatValue(), this.f18741l, ((Float) this.f18745p.get(i12)).floatValue(), this.f18743n, i11 < this.f18746q ? this.f18733c : this.f18732b);
                canvas = canvas2;
                i11 = i12;
            }
            Canvas canvas3 = canvas;
            while (i < this.f18745p.size()) {
                float fFloatValue = ((Float) this.f18745p.get(i)).floatValue();
                canvas3.drawCircle(fFloatValue, this.f18739j, this.f18736f, i <= this.f18746q ? this.f18733c : this.f18732b);
                if (i == this.f18746q) {
                    Paint paint3 = this.f18733c;
                    int i13 = this.f18738h;
                    paint3.setColor(Color.argb(Math.round(Color.alpha(i13) * 0.2f), Color.red(i13), Color.green(i13), Color.blue(i13)));
                    canvas3.drawCircle(fFloatValue, this.f18739j, this.f18736f * 1.8f, this.f18733c);
                }
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i10) {
        try {
            setMeasuredDimension(View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200, View.MeasureSpec.getMode(i10) != 0 ? Math.min(120, View.MeasureSpec.getSize(i10)) : 120);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        float height = getHeight() * 0.5f;
        this.f18739j = height;
        this.f18740k = this.f18737g;
        this.f18741l = height - (this.f18735e / 2.0f);
        this.f18742m = getWidth() - this.f18737g;
        this.f18743n = (getHeight() + this.f18735e) * 0.5f;
        float f10 = this.f18742m;
        float f11 = this.f18740k;
        this.f18744o = (f10 - f11) / (this.f18734d - 1);
        ArrayList arrayList = this.f18745p;
        arrayList.add(Float.valueOf(f11));
        for (int i13 = 1; i13 < this.f18734d - 1; i13++) {
            arrayList.add(Float.valueOf((i13 * this.f18744o) + this.f18740k));
        }
        arrayList.add(Float.valueOf(this.f18742m));
        ((StepsView) this.f18747r).b();
    }

    public void setBarColor(int i) {
        this.i = i;
    }

    public void setCompletedPosition(int i) {
        this.f18746q = i;
    }

    public void setDrawListener(a aVar) {
        this.f18747r = aVar;
    }

    public void setProgressColor(int i) {
        this.f18738h = i;
    }

    public void setStepSize(int i) {
        this.f18734d = i;
        invalidate();
    }
}
