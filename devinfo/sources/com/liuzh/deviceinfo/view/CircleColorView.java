package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CircleColorView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f21308a;

    /* renamed from: b, reason: collision with root package name */
    public int f21309b;

    /* renamed from: c, reason: collision with root package name */
    public int f21310c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f21311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        k.e(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f21311d = paint;
        setColor(-7829368);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        canvas.drawCircle(this.f21309b, this.f21308a, this.f21310c, this.f21311d);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f21309b = i4 / 2;
        this.f21308a = i10 / 2;
        this.f21310c = Math.min(i4, i10) / 2;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        setColor(i4);
    }

    public final void setColor(int i4) {
        this.f21311d.setColor(i4);
        invalidate();
    }
}
