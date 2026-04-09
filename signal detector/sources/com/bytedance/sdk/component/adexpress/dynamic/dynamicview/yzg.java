package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class yzg extends Drawable {
    private RectF dg;
    private Paint emc;
    private int xq;
    private int ypw;

    public yzg(int i, int i3) {
        this.xq = i;
        this.ypw = i3;
        Paint paint = new Paint();
        this.emc = paint;
        paint.setColor(0);
        this.emc.setAntiAlias(true);
        this.emc.setShadowLayer(i3, 0.0f, 0.0f, -16777216);
        this.emc.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.dg;
        int i = this.xq;
        canvas.drawRoundRect(rectF, i, i, this.emc);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.emc.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i3, int i6, int i7) {
        super.setBounds(i, i3, i6, i7);
        int i8 = this.ypw;
        this.dg = new RectF(i + i8, i3 + i8, i6 - i8, i7 - i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.emc.setColorFilter(colorFilter);
    }
}
