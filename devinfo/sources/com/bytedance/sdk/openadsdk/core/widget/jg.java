package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class jg extends com.bytedance.sdk.openadsdk.core.le.yu {
    private Paint ouw;
    private RectF vt;

    public jg(Context context) {
        super(context);
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ouw.setColor(Color.parseColor("#99333333"));
        this.ouw.setAntiAlias(true);
        this.ouw.setStrokeWidth(0.0f);
        this.vt = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.vt;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.ouw);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (this.vt.right == getMeasuredWidth() && this.vt.bottom == getMeasuredHeight()) {
            return;
        }
        this.vt.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
