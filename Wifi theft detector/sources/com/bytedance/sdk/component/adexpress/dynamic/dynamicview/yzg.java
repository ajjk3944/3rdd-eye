package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class yzg extends Drawable {
    private RectF dg;
    private Paint emc;
    private int xq;
    private int ypw;

    public yzg(int i10, int i11) {
        this.xq = i10;
        this.ypw = i11;
        Paint paint = new Paint();
        this.emc = paint;
        paint.setColor(0);
        this.emc.setAntiAlias(true);
        this.emc.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.emc.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.dg;
        int i10 = this.xq;
        canvas.drawRoundRect(rectF, i10, i10, this.emc);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.emc.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.ypw;
        this.dg = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.emc.setColorFilter(colorFilter);
    }
}
