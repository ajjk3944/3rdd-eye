package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class qh extends com.bytedance.sdk.openadsdk.core.ycc.dg {
    private Paint emc;
    private RectF ypw;

    public qh(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        Paint paint = new Paint();
        this.emc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.emc.setColor(Color.parseColor("#99333333"));
        this.emc.setAntiAlias(true);
        this.emc.setStrokeWidth(0.0f);
        this.ypw = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.ypw;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.emc);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.dg, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.ypw.right == getMeasuredWidth() && this.ypw.bottom == getMeasuredHeight()) {
            return;
        }
        this.ypw.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
