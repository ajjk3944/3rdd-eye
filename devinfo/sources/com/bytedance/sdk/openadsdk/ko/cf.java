package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends View {

    /* renamed from: lh, reason: collision with root package name */
    private float f8558lh;
    private final Paint ouw;
    private float vt;

    public cf(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f8558lh;
        if (f10 > 0.0f) {
            float f11 = this.vt;
            canvas.drawLine(0.0f, f11, f10, f11, this.ouw);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        float f10 = i10;
        this.vt = (1.0f * f10) / 2.0f;
        this.ouw.setStrokeWidth(f10);
    }

    public final void setProgress(float f10) {
        this.f8558lh = getWidth() * f10;
        invalidate();
    }
}
