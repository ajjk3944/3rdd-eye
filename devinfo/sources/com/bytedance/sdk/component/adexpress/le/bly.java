package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends View {
    private Paint fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7321le;

    /* renamed from: lh, reason: collision with root package name */
    private final RectF f7322lh;
    private int ouw;
    private int pno;
    private Paint ra;
    private int vt;
    private Paint yu;

    public bly(Context context) {
        super(context);
        this.f7322lh = new RectF();
        Paint paint = new Paint();
        this.yu = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ra = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.fkw = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f7322lh;
        int i4 = this.f7321le;
        canvas.drawRoundRect(rectF, i4, i4, this.fkw);
        RectF rectF2 = this.f7322lh;
        int i10 = this.f7321le;
        canvas.drawRoundRect(rectF2, i10, i10, this.yu);
        int i11 = this.ouw;
        int i12 = this.vt;
        canvas.drawLine(i11 * 0.3f, i12 * 0.3f, i11 * 0.7f, i12 * 0.7f, this.ra);
        int i13 = this.ouw;
        int i14 = this.vt;
        canvas.drawLine(i13 * 0.7f, i14 * 0.3f, i13 * 0.3f, i14 * 0.7f, this.ra);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.ouw = i4;
        this.vt = i10;
        RectF rectF = this.f7322lh;
        int i13 = this.pno;
        rectF.set(i13, i13, i4 - i13, i10 - i13);
    }

    public final void setBgColor(int i4) {
        this.fkw.setStyle(Paint.Style.FILL);
        this.fkw.setColor(i4);
    }

    public final void setDislikeColor(int i4) {
        this.ra.setColor(i4);
    }

    public final void setDislikeWidth(int i4) {
        this.ra.setStrokeWidth(i4);
    }

    public final void setRadius(int i4) {
        this.f7321le = i4;
    }

    public final void setStrokeColor(int i4) {
        this.yu.setStyle(Paint.Style.STROKE);
        this.yu.setColor(i4);
    }

    public final void setStrokeWidth(int i4) {
        this.yu.setStrokeWidth(i4);
        this.pno = i4;
    }
}
