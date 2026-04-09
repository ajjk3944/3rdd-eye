package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt extends GradientDrawable {
    protected Path ouw;
    private final Paint vt;

    public vt() {
        this.ouw = new Path();
        Paint paint = new Paint(1);
        this.vt = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.ouw;
        if (path == null || path.isEmpty()) {
            ouw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.vt, 31);
        ouw(canvas);
        this.vt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.ouw, this.vt);
        this.vt.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void ouw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void ouw(int i4, int i10, int i11, int i12) {
        this.ouw.addRect(i4, i10, i11, i12, Path.Direction.CW);
        invalidateSelf();
    }

    public vt(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.ouw = new Path();
        Paint paint = new Paint(1);
        this.vt = paint;
        paint.setColor(-1);
    }
}
