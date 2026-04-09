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
        int i10 = this.ycc;
        canvas.drawRoundRect(rectF, i10, i10, this.bw);
        RectF rectF2 = this.xq;
        int i11 = this.ycc;
        canvas.drawRoundRect(rectF2, i11, i11, this.dg);
        int i12 = this.emc;
        int i13 = this.ypw;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.uym);
        int i14 = this.emc;
        int i15 = this.ypw;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.uym);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.emc = i10;
        this.ypw = i11;
        RectF rectF = this.xq;
        int i14 = this.msw;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.bw.setStyle(Paint.Style.FILL);
        this.bw.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.uym.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.uym.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.ycc = i10;
    }

    public void setStrokeColor(int i10) {
        this.dg.setStyle(Paint.Style.STROKE);
        this.dg.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.dg.setStrokeWidth(i10);
        this.msw = i10;
    }
}
