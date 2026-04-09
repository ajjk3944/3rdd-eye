package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends vt {

    /* renamed from: lh, reason: collision with root package name */
    private final Bitmap f7236lh;
    private final Rect vt = new Rect();
    private final Paint yu = new Paint(1);

    public ouw(Bitmap bitmap, vt vtVar) {
        this.f7236lh = bitmap;
        if (vtVar != null) {
            this.ouw = vtVar.ouw;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.f7236lh.getWidth();
        int height = this.f7236lh.getHeight();
        this.vt.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.vt;
                int i4 = (width - iWidth) / 2;
                rect2.left = i4;
                rect2.right = i4 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.vt;
                int i10 = (height - iHeight) / 2;
                rect3.top = i10;
                rect3.bottom = i10 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i11 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.vt;
            int i12 = (height - i11) / 2;
            rect4.top = i12;
            rect4.bottom = i12 + i11;
            return;
        }
        int i13 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.vt;
        int i14 = (width - i13) / 2;
        rect5.left = i14;
        rect5.right = i14 + i13;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vt
    public final void ouw(Canvas canvas) {
        canvas.drawBitmap(this.f7236lh, this.vt, getBounds(), this.yu);
    }
}
