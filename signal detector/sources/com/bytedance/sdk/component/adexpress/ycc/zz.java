package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class zz extends View {
    private Paint bw;
    private Paint dg;
    private int emc;
    private int msw;
    private Paint uym;
    private final RectF xq;
    private int ycc;
    private int ypw;

    public zz(Context context) {
        super(context);
        this.xq = new RectF();
        emc();
    }

    private void emc() {
        Paint paint = new Paint();
        this.dg = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.uym = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.bw = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.xq;
        int i = this.ycc;
        canvas.drawRoundRect(rectF, i, i, this.bw);
        RectF rectF2 = this.xq;
        int i3 = this.ycc;
        canvas.drawRoundRect(rectF2, i3, i3, this.dg);
        int i6 = this.emc;
        int i7 = this.ypw;
        canvas.drawLine(i6 * 0.3f, i7 * 0.3f, i6 * 0.7f, i7 * 0.7f, this.uym);
        int i8 = this.emc;
        int i9 = this.ypw;
        canvas.drawLine(i8 * 0.7f, i9 * 0.3f, i8 * 0.3f, i9 * 0.7f, this.uym);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.emc = i;
        this.ypw = i3;
        RectF rectF = this.xq;
        int i8 = this.msw;
        rectF.set(i8, i8, i - i8, i3 - i8);
    }

    public void setBgColor(int i) {
        this.bw.setStyle(Paint.Style.FILL);
        this.bw.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.uym.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.uym.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.ycc = i;
    }

    public void setStrokeColor(int i) {
        this.dg.setStyle(Paint.Style.STROKE);
        this.dg.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.dg.setStrokeWidth(i);
        this.msw = i;
    }
}
