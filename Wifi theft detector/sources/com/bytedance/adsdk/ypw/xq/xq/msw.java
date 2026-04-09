package com.bytedance.adsdk.ypw.xq.xq;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class msw extends emc {
    private final bw gbl;
    private final Paint msw;
    private final Path ru;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> sup;
    private final RectF uym;
    private final float[] zz;

    public msw(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar) {
        super(zzVar, bwVar);
        this.uym = new RectF();
        com.bytedance.adsdk.ypw.emc.emc emcVar = new com.bytedance.adsdk.ypw.emc.emc();
        this.msw = emcVar;
        this.zz = new float[8];
        this.ru = new Path();
        this.gbl = bwVar;
        emcVar.setAlpha(0);
        emcVar.setStyle(Paint.Style.FILL);
        emcVar.setColor(bwVar.vk());
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        super.emc(rectF, matrix, z10);
        this.uym.set(0.0f, 0.0f, this.gbl.sba(), this.gbl.aa());
        this.emc.mapRect(this.uym);
        rectF.set(this.uym);
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        super.ypw(canvas, matrix, i10);
        int iAlpha = Color.alpha(this.gbl.vk());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.dg.emc() == null ? 100 : this.dg.emc().uym().intValue())) / 100.0f) * 255.0f);
        this.msw.setAlpha(iIntValue);
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.sup;
        if (emcVar != null) {
            this.msw.setColorFilter(emcVar.uym());
        }
        if (iIntValue > 0) {
            float[] fArr = this.zz;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.gbl.sba();
            float[] fArr2 = this.zz;
            fArr2[3] = 0.0f;
            fArr2[4] = this.gbl.sba();
            this.zz[5] = this.gbl.aa();
            float[] fArr3 = this.zz;
            fArr3[6] = 0.0f;
            fArr3[7] = this.gbl.aa();
            matrix.mapPoints(this.zz);
            this.ru.reset();
            Path path = this.ru;
            float[] fArr4 = this.zz;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.ru;
            float[] fArr5 = this.zz;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.ru;
            float[] fArr6 = this.zz;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.ru;
            float[] fArr7 = this.zz;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.ru;
            float[] fArr8 = this.zz;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.ru.close();
            canvas.drawPath(this.ru, this.msw);
        }
    }
}
