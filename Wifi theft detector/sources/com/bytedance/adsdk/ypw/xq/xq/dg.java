package com.bytedance.adsdk.ypw.xq.xq;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class dg extends emc {
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> gbl;
    private final Paint msw;
    private final Rect ru;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Bitmap, Bitmap> sup;
    protected final com.bytedance.adsdk.ypw.ru uym;
    private final Rect zz;

    public dg(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar) {
        super(zzVar, bwVar);
        this.msw = new com.bytedance.adsdk.ypw.emc.emc(3);
        this.zz = new Rect();
        this.ru = new Rect();
        this.uym = zzVar.ycc(bwVar.uym());
    }

    private Bitmap sup() {
        Bitmap bitmapUym;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Bitmap, Bitmap> emcVar = this.sup;
        if (emcVar != null && (bitmapUym = emcVar.uym()) != null) {
            return bitmapUym;
        }
        Bitmap bitmapBw = this.ypw.bw(this.xq.uym());
        if (bitmapBw != null) {
            return bitmapBw;
        }
        com.bytedance.adsdk.ypw.ru ruVar = this.uym;
        if (ruVar != null) {
            return ruVar.gbl();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        super.emc(rectF, matrix, z10);
        if (this.uym != null) {
            float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
            rectF.set(0.0f, 0.0f, this.uym.emc() * fEmc, this.uym.ypw() * fEmc);
            this.emc.mapRect(rectF);
        }
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        super.ypw(canvas, matrix, i10);
        Bitmap bitmapSup = sup();
        if (bitmapSup == null || bitmapSup.isRecycled() || this.uym == null) {
            return;
        }
        float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
        this.msw.setAlpha(i10);
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.gbl;
        if (emcVar != null) {
            this.msw.setColorFilter(emcVar.uym());
        }
        canvas.save();
        canvas.concat(matrix);
        this.zz.set(0, 0, bitmapSup.getWidth(), bitmapSup.getHeight());
        if (this.ypw.bw()) {
            this.ru.set(0, 0, (int) (this.uym.emc() * fEmc), (int) (this.uym.ypw() * fEmc));
        } else {
            this.ru.set(0, 0, (int) (bitmapSup.getWidth() * fEmc), (int) (bitmapSup.getHeight() * fEmc));
        }
        canvas.drawBitmap(bitmapSup, this.zz, this.ru, this.msw);
        canvas.restore();
    }
}
