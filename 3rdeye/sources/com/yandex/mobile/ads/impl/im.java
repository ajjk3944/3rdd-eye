package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class im extends View {

    /* renamed from: a, reason: collision with root package name */
    private final float f28736a;

    /* renamed from: b, reason: collision with root package name */
    private final float f28737b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f28738c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f28739d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f28740e;

    /* renamed from: f, reason: collision with root package name */
    private float f28741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(Context context, j10 dimensionConverter) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f28736a = j10.a(context, 34.0f);
        float fA = j10.a(context, 3.0f);
        this.f28737b = fA;
        float fA2 = j10.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f28738c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f28739d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f28740e = paint3;
        this.f28741f = 40.0f;
        a();
    }

    private final void a() {
        this.f28739d.setColor(jh2.a(-65536, this.f28741f));
        this.f28738c.setColor(jh2.a(-1, this.f28741f));
        this.f28740e.setColor(jh2.a(-65536, this.f28741f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f28736a / f10;
        canvas.drawCircle(f11, f11, f11, this.f28738c);
        canvas.drawCircle(f11, f11, f11 - (this.f28737b / f10), this.f28739d);
        float f12 = this.f28736a / f10;
        canvas.drawText("!", f12, f12 - ((this.f28740e.ascent() + this.f28740e.descent()) / f10), this.f28740e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int i11 = (int) this.f28736a;
        setMeasuredDimension(i11, i11);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        this.f28741f = z10 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
