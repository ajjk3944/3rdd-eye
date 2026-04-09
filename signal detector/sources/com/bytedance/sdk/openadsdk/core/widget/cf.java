package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class cf extends com.bytedance.sdk.openadsdk.core.ycc.msw {
    private Paint emc;
    private int xq;
    private RectF ypw;

    public cf(Context context) {
        this(context, null);
    }

    private void emc() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.emc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.emc.setColor(Color.parseColor("#99333333"));
        this.emc.setAntiAlias(true);
        this.emc.setStrokeWidth(0.0f);
        this.ypw = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.ypw;
        float f2 = rectF.bottom;
        canvas.drawRoundRect(rectF, f2 / 2.0f, f2 / 2.0f, this.emc);
        canvas.translate((this.ypw.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.msw, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.ypw.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.xq = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i6 = ((measuredHeight / 2) * 2) + measuredWidth;
        setMeasuredDimension(i6, measuredHeight);
        this.ypw.set(0.0f, 0.0f, i6, measuredHeight);
    }

    public cf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xq = 0;
        emc();
    }
}
