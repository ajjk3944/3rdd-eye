package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class emc extends ypw {
    private final Bitmap xq;
    private final Rect ypw = new Rect();
    private final Paint dg = new Paint(1);

    public emc(Bitmap bitmap, ypw ypwVar) {
        this.xq = bitmap;
        if (ypwVar != null) {
            this.emc = ypwVar.emc;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ypw
    public void emc(Canvas canvas) {
        canvas.drawBitmap(this.xq, this.ypw, getBounds(), this.dg);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.xq.getWidth();
        int height = this.xq.getHeight();
        this.ypw.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.ypw;
                int i = (width - iWidth) / 2;
                rect2.left = i;
                rect2.right = i + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.ypw;
                int i3 = (height - iHeight) / 2;
                rect3.top = i3;
                rect3.bottom = i3 + iHeight;
                return;
            }
            return;
        }
        float f2 = iHeight;
        float f5 = f2 * 1.0f;
        float f6 = height;
        float f7 = f5 / f6;
        float f8 = iWidth;
        float f9 = 1.0f * f8;
        float f10 = width;
        if (Math.max(f7, f9 / f10) > f7) {
            int i6 = (int) ((f5 / f8) * f10);
            Rect rect4 = this.ypw;
            int i7 = (height - i6) / 2;
            rect4.top = i7;
            rect4.bottom = i7 + i6;
            return;
        }
        int i8 = (int) ((f9 / f2) * f6);
        Rect rect5 = this.ypw;
        int i9 = (width - i8) / 2;
        rect5.left = i9;
        rect5.right = i9 + i8;
    }
}
