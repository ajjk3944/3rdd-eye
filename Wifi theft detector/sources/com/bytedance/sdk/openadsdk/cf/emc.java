package com.bytedance.sdk.openadsdk.cf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public class emc extends View {
    private final Paint emc;
    private float xq;
    private float ypw;

    public emc(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.emc = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.xq;
        if (f10 > 0.0f) {
            float f11 = this.ypw;
            canvas.drawLine(0.0f, f11, f10, f11, this.emc);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.ypw = (1.0f * f10) / 2.0f;
        this.emc.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.xq = getWidth() * f10;
        invalidate();
    }
}
