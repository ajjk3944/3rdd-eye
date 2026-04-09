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
        float f2 = this.xq;
        if (f2 > 0.0f) {
            float f5 = this.ypw;
            canvas.drawLine(0.0f, f5, f2, f5, this.emc);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        float f2 = i3;
        this.ypw = (1.0f * f2) / 2.0f;
        this.emc.setStrokeWidth(f2);
    }

    public void setProgress(float f2) {
        this.xq = getWidth() * f2;
        invalidate();
    }
}
