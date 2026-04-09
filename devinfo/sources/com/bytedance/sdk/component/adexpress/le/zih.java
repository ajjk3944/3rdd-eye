package com.bytedance.sdk.component.adexpress.le;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih extends View {
    private Paint fkw;

    /* renamed from: le, reason: collision with root package name */
    private RectF f7369le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7370lh;
    public ValueAnimator ouw;
    private float ra;
    public int vt;
    private Context yu;

    public zih(Context context) {
        super(context);
        this.vt = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.yu = context;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
        this.fkw.setStyle(Paint.Style.STROKE);
        this.fkw.setStrokeWidth(10.0f);
        this.fkw.setColor(Color.parseColor("#80FFFFFF"));
        this.f7369le = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7370lh) {
            return;
        }
        canvas.drawArc(this.f7369le, 270.0f, this.ra, false, this.fkw);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f7369le.set(5.0f, 5.0f, i4 - 5, i10 - 5);
    }

    public final void setDuration(int i4) {
        this.vt = i4;
    }
}
