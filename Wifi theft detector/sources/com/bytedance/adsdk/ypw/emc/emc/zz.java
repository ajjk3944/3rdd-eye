package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* loaded from: classes.dex */
public class zz extends emc {
    private final boolean bw;
    private final String dg;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> gbl;
    private final RectF msw;
    private com.bytedance.adsdk.ypw.emc.ypw.aa qh;
    private final int ru;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> sup;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> sz;
    private final LongSparseArray<RadialGradient> uym;
    private final LongSparseArray<LinearGradient> ycc;
    private final com.bytedance.adsdk.ypw.xq.ypw.uym zz;

    public zz(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.ycc yccVar) {
        super(zzVar, emcVar, yccVar.msw().emc(), yccVar.zz().emc(), yccVar.sup(), yccVar.dg(), yccVar.uym(), yccVar.ru(), yccVar.gbl());
        this.ycc = new LongSparseArray<>();
        this.uym = new LongSparseArray<>();
        this.msw = new RectF();
        this.dg = yccVar.emc();
        this.zz = yccVar.ypw();
        this.bw = yccVar.sz();
        this.ru = (int) (zzVar.db().bw() / 32.0f);
        com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> emcVarEmc = yccVar.xq().emc();
        this.gbl = emcVarEmc;
        emcVarEmc.emc(this);
        emcVar.emc(emcVarEmc);
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc2 = yccVar.bw().emc();
        this.sup = emcVarEmc2;
        emcVarEmc2.emc(this);
        emcVar.emc(emcVarEmc2);
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc3 = yccVar.ycc().emc();
        this.sz = emcVarEmc3;
        emcVarEmc3.emc(this);
        emcVar.emc(emcVarEmc3);
    }

    private int dg() {
        int iRound = Math.round(this.sup.msw() * this.ru);
        int iRound2 = Math.round(this.sz.msw() * this.ru);
        int iRound3 = Math.round(this.gbl.msw() * this.ru);
        int i10 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private RadialGradient xq() {
        long jDg = dg();
        RadialGradient radialGradient = this.uym.get(jDg);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFUym = this.sup.uym();
        PointF pointFUym2 = this.sz.uym();
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVarUym = this.gbl.uym();
        int[] iArrEmc = emc(dgVarUym.ypw());
        float[] fArrEmc = dgVarUym.emc();
        RadialGradient radialGradient2 = new RadialGradient(pointFUym.x, pointFUym.y, (float) Math.hypot(pointFUym2.x - r7, pointFUym2.y - r8), iArrEmc, fArrEmc, Shader.TileMode.CLAMP);
        this.uym.put(jDg, radialGradient2);
        return radialGradient2;
    }

    private LinearGradient ypw() {
        long jDg = dg();
        LinearGradient linearGradient = this.ycc.get(jDg);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFUym = this.sup.uym();
        PointF pointFUym2 = this.sz.uym();
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVarUym = this.gbl.uym();
        LinearGradient linearGradient2 = new LinearGradient(pointFUym.x, pointFUym.y, pointFUym2.x, pointFUym2.y, emc(dgVarUym.ypw()), dgVarUym.emc(), Shader.TileMode.CLAMP);
        this.ycc.put(jDg, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        if (this.bw) {
            return;
        }
        emc(this.msw, matrix, false);
        Shader shaderYpw = this.zz == com.bytedance.adsdk.ypw.xq.ypw.uym.LINEAR ? ypw() : xq();
        shaderYpw.setLocalMatrix(matrix);
        this.ypw.setShader(shaderYpw);
        super.emc(canvas, matrix, i10);
    }

    private int[] emc(int[] iArr) {
        if (this.qh == null) {
            return iArr;
        }
        throw null;
    }
}
