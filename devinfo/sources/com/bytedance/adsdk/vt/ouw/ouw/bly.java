package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends ouw {
    private final com.bytedance.adsdk.vt.lh.vt.ra bly;

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> f7140cf;
    private final boolean fkw;

    /* renamed from: jg, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.zih f7141jg;

    /* renamed from: le, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f7142le;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> mwh;
    private final RectF pno;
    private final LongSparseArray<RadialGradient> ra;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ryl;
    private final int tlj;
    private final String yu;

    public bly(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.le leVar) {
        super(blyVar, ouwVar, leVar.pno.ouw(), leVar.bly.ouw(), leVar.tlj, leVar.yu, leVar.ra, leVar.f7114cf, leVar.ryl);
        this.f7142le = new LongSparseArray<>();
        this.ra = new LongSparseArray<>();
        this.pno = new RectF();
        this.yu = leVar.ouw;
        this.bly = leVar.vt;
        this.fkw = leVar.mwh;
        this.tlj = (int) (blyVar.ouw.ouw() / 32.0f);
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouwVarOuw = leVar.f7116lh.ouw();
        this.f7140cf = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = leVar.fkw.ouw();
        this.ryl = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw3 = leVar.f7115le.ouw();
        this.mwh = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
    }

    private int vt() {
        int iRound = Math.round(this.ryl.ra() * this.tlj);
        int iRound2 = Math.round(this.mwh.ra() * this.tlj);
        int iRound3 = Math.round(this.f7140cf.ra() * this.tlj);
        int i4 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i4 = i4 * 31 * iRound2;
        }
        return iRound3 != 0 ? i4 * 31 * iRound3 : i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        RadialGradient radialGradient;
        Shader radialGradient2;
        if (this.fkw) {
            return;
        }
        ouw(this.pno, matrix, false);
        if (this.bly == com.bytedance.adsdk.vt.lh.vt.ra.LINEAR) {
            long jVt = vt();
            radialGradient = this.f7142le.get(jVt);
            if (radialGradient == null) {
                PointF pointFLe = this.ryl.le();
                PointF pointFLe2 = this.mwh.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe = this.f7140cf.le();
                radialGradient2 = new LinearGradient(pointFLe.x, pointFLe.y, pointFLe2.x, pointFLe2.y, ouw(yuVarLe.vt), yuVarLe.ouw, Shader.TileMode.CLAMP);
                this.f7142le.put(jVt, radialGradient2);
                radialGradient = radialGradient2;
            }
        } else {
            long jVt2 = vt();
            radialGradient = this.ra.get(jVt2);
            if (radialGradient == null) {
                PointF pointFLe3 = this.ryl.le();
                PointF pointFLe4 = this.mwh.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe2 = this.f7140cf.le();
                int[] iArrOuw = ouw(yuVarLe2.vt);
                float[] fArr = yuVarLe2.ouw;
                radialGradient2 = new RadialGradient(pointFLe3.x, pointFLe3.y, (float) Math.hypot(pointFLe4.x - r9, pointFLe4.y - r10), iArrOuw, fArr, Shader.TileMode.CLAMP);
                this.ra.put(jVt2, radialGradient2);
                radialGradient = radialGradient2;
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.vt.setShader(radialGradient);
        super.ouw(canvas, matrix, i4);
    }

    private int[] ouw(int[] iArr) {
        if (this.f7141jg == null) {
            return iArr;
        }
        throw null;
    }
}
