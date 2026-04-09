package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class ypw extends GradientDrawable {
    protected Path emc;
    private final Paint ypw;

    public ypw() {
        this.emc = new Path();
        Paint paint = new Paint(1);
        this.ypw = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.emc;
        if (path == null || path.isEmpty()) {
            emc(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.ypw, 31);
        emc(canvas);
        this.ypw.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.emc, this.ypw);
        this.ypw.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void emc(Canvas canvas) {
        super.draw(canvas);
    }

    public void emc(int i, int i3, int i6, int i7) {
        this.emc.addRect(i, i3, i6, i7, Path.Direction.CW);
        invalidateSelf();
    }

    public ypw(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.emc = new Path();
        Paint paint = new Paint(1);
        this.ypw = paint;
        paint.setColor(-1);
    }
}
