package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th extends Drawable {

    /* renamed from: lh, reason: collision with root package name */
    private int f7237lh;
    private Paint ouw;
    private int vt;
    private RectF yu;

    public th(int i4, int i10) {
        this.f7237lh = i4;
        this.vt = i10;
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setColor(0);
        this.ouw.setAntiAlias(true);
        this.ouw.setShadowLayer(i10, 0.0f, 0.0f, -16777216);
        this.ouw.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.yu;
        int i4 = this.f7237lh;
        canvas.drawRoundRect(rectF, i4, i4, this.ouw);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.ouw.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i4, int i10, int i11, int i12) {
        super.setBounds(i4, i10, i11, i12);
        int i13 = this.vt;
        this.yu = new RectF(i4 + i13, i10 + i13, i11 - i13, i12 - i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.ouw.setColorFilter(colorFilter);
    }
}
