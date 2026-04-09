package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends ouw {

    /* renamed from: cf, reason: collision with root package name */
    private final RectF f7089cf;

    /* renamed from: jg, reason: collision with root package name */
    private final Path f7090jg;
    private final fkw ko;
    private final float[] mwh;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> rn;
    private final Paint ryl;

    public pno(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f7089cf = new RectF();
        com.bytedance.adsdk.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.vt.ouw.ouw();
        this.ryl = ouwVar;
        this.mwh = new float[8];
        this.f7090jg = new Path();
        this.ko = fkwVar;
        ouwVar.setAlpha(0);
        ouwVar.setStyle(Paint.Style.FILL);
        ouwVar.setColor(fkwVar.ryl);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        super.ouw(rectF, matrix, z3);
        RectF rectF2 = this.f7089cf;
        fkw fkwVar = this.ko;
        rectF2.set(0.0f, 0.0f, fkwVar.tlj, fkwVar.f7070cf);
        this.ouw.mapRect(this.f7089cf);
        rectF.set(this.f7089cf);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i4) {
        super.vt(canvas, matrix, i4);
        int iAlpha = Color.alpha(this.ko.ryl);
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.fkw.fkw == null ? 100 : r1.le().intValue())) / 100.0f) * (i4 / 255.0f) * 255.0f);
        this.ryl.setAlpha(iIntValue);
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.rn;
        if (ouwVar != null) {
            this.ryl.setColorFilter(ouwVar.le());
        }
        if (iIntValue > 0) {
            float[] fArr = this.mwh;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fkw fkwVar = this.ko;
            int i10 = fkwVar.tlj;
            fArr[2] = i10;
            fArr[3] = 0.0f;
            fArr[4] = i10;
            int i11 = fkwVar.f7070cf;
            fArr[5] = i11;
            fArr[6] = 0.0f;
            fArr[7] = i11;
            matrix.mapPoints(fArr);
            this.f7090jg.reset();
            Path path = this.f7090jg;
            float[] fArr2 = this.mwh;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f7090jg;
            float[] fArr3 = this.mwh;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f7090jg;
            float[] fArr4 = this.mwh;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f7090jg;
            float[] fArr5 = this.mwh;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f7090jg;
            float[] fArr6 = this.mwh;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f7090jg.close();
            canvas.drawPath(this.f7090jg, this.ryl);
        }
    }
}
