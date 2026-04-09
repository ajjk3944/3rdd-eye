package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu extends ouw {

    /* renamed from: cf, reason: collision with root package name */
    private final Paint f7096cf;

    /* renamed from: jg, reason: collision with root package name */
    private final Rect f7097jg;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ko;
    private final Rect mwh;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Bitmap, Bitmap> rn;
    protected final com.bytedance.adsdk.vt.tlj ryl;

    public yu(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f7096cf = new com.bytedance.adsdk.vt.ouw.ouw(3);
        this.mwh = new Rect();
        this.f7097jg = new Rect();
        this.ryl = blyVar.yu(fkwVar.ra);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        super.ouw(rectF, matrix, z3);
        if (this.ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            com.bytedance.adsdk.vt.tlj tljVar = this.ryl;
            rectF.set(0.0f, 0.0f, tljVar.ouw * fOuw, tljVar.vt * fOuw);
            this.ouw.mapRect(rectF);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public void vt(Canvas canvas, Matrix matrix, int i4) {
        Bitmap bitmapOuw;
        super.vt(canvas, matrix, i4);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Bitmap, Bitmap> ouwVar = this.rn;
        if (ouwVar == null || (bitmapOuw = ouwVar.le()) == null) {
            String str = this.f7085lh.ra;
            com.bytedance.adsdk.vt.vt.vt vtVarPno = this.vt.pno();
            bitmapOuw = vtVarPno != null ? vtVarPno.ouw(str) : null;
            if (bitmapOuw == null) {
                com.bytedance.adsdk.vt.tlj tljVar = this.ryl;
                bitmapOuw = tljVar != null ? tljVar.f7211cf : null;
            }
        }
        if (bitmapOuw == null || bitmapOuw.isRecycled() || this.ryl == null) {
            return;
        }
        float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
        this.f7096cf.setAlpha(i4);
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar2 = this.ko;
        if (ouwVar2 != null) {
            this.f7096cf.setColorFilter(ouwVar2.le());
        }
        canvas.save();
        canvas.concat(matrix);
        this.mwh.set(0, 0, bitmapOuw.getWidth(), bitmapOuw.getHeight());
        if (this.vt.vm) {
            Rect rect = this.f7097jg;
            com.bytedance.adsdk.vt.tlj tljVar2 = this.ryl;
            rect.set(0, 0, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
        } else {
            this.f7097jg.set(0, 0, (int) (bitmapOuw.getWidth() * fOuw), (int) (bitmapOuw.getHeight() * fOuw));
        }
        canvas.drawBitmap(bitmapOuw, this.mwh, this.f7097jg, this.f7096cf);
        canvas.restore();
    }
}
