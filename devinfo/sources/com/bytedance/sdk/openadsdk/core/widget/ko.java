package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko extends com.bytedance.sdk.openadsdk.core.le.pno {

    /* renamed from: lh, reason: collision with root package name */
    private int f8478lh;
    private Paint ouw;
    private RectF vt;

    public ko(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.vt;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.ouw);
        canvas.translate((this.vt.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.vt.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.f8478lh = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i11 = ((measuredHeight / 2) * 2) + measuredWidth;
        setMeasuredDimension(i11, measuredHeight);
        this.vt.set(0.0f, 0.0f, i11, measuredHeight);
    }

    private ko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ko(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
        this.f8478lh = 0;
        setTextColor(-1);
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ouw.setColor(Color.parseColor("#99333333"));
        this.ouw.setAntiAlias(true);
        this.ouw.setStrokeWidth(0.0f);
        this.vt = new RectF();
    }
}
