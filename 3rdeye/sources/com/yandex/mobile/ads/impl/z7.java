package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class z7 extends View {

    /* renamed from: a, reason: collision with root package name */
    private final kv f36226a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f36227b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f36228c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f36229d;

    /* renamed from: e, reason: collision with root package name */
    private int f36230e;

    /* renamed from: f, reason: collision with root package name */
    private int f36231f;

    /* renamed from: g, reason: collision with root package name */
    private int f36232g;

    /* renamed from: h, reason: collision with root package name */
    private float f36233h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z7(Context context) {
        this(context, null, 6, 0);
        kotlin.jvm.internal.l.f(context, "context");
    }

    private final void a() {
        this.f36227b.setColor(this.f36230e);
        this.f36228c.setColor(this.f36232g);
        this.f36229d.setColor(this.f36232g);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f36232g = this.f36226a.a() ? -7829368 : -1;
        a();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        float fMin = Math.min(getWidth(), getHeight());
        float f10 = fMin / 2.0f;
        canvas.drawCircle(f10, f10, f10, this.f36227b);
        float f11 = fMin / 5.0f;
        float f12 = f10 - f11;
        float f13 = f10 + f11;
        canvas.drawLine(f12, f12, f13, f13, this.f36228c);
        canvas.drawLine(f12, f13, f13, f12, this.f36228c);
        float f14 = this.f36233h;
        if (f14 > 0.0f) {
            this.f36229d.setStrokeWidth(f14);
            canvas.drawCircle(f10, f10, f10 - this.f36233h, this.f36229d);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        if (event.getAction() == 0) {
            a(v7.a());
            a();
            invalidate();
        } else if (1 == event.getAction()) {
            a(this.f36231f);
            a();
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f36231f = i;
        a(i);
        a();
        invalidate();
    }

    public final void setBorderWidth(float f10) {
        this.f36233h = f10;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        kotlin.jvm.internal.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        this.f36226a = new kv(context);
        this.f36230e = w7.a();
        this.f36231f = w7.a();
        this.f36232g = -1;
        this.f36233h = -1.0f;
        if (attributeSet == null || i == 0) {
            int iA = w7.a();
            this.f36231f = iA;
            a(iA);
        }
        Paint paint = new Paint(0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f36227b = paint;
        Paint paint2 = new Paint(0);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f36228c = paint2;
        Paint paint3 = new Paint(0);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        this.f36229d = paint3;
        a();
    }

    private final void a(int i) {
        int iA = jh2.a(i, 20.0f);
        this.f36230e = iA;
        float[] fArr = new float[3];
        Color.colorToHSV(iA, fArr);
        if (fArr[2] < 0.5f) {
            this.f36232g = this.f36226a.a() ? -7829368 : -1;
        } else {
            this.f36232g = -16777216;
        }
    }

    public /* synthetic */ z7(Context context, AttributeSet attributeSet, int i, int i10) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
