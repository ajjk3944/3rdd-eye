package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class msw implements bw, gbl, emc.InterfaceC0106emc {

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.adsdk.ypw.emc.ypw.aa f9220aa;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> cf;
    private final com.bytedance.adsdk.ypw.xq.xq.emc dg;
    float emc;
    private final com.bytedance.adsdk.ypw.xq.ypw.uym gbl;
    private final Paint msw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> qh;
    private final List<sz> ru;
    private final com.bytedance.adsdk.ypw.zz sba;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> sup;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> sz;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> ul;
    private final Path uym;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> vk;
    private final boolean xq;
    private com.bytedance.adsdk.ypw.emc.ypw.xq ylm;
    private final String ypw;
    private final int yzg;
    private final RectF zz;
    private final LongSparseArray<LinearGradient> bw = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> ycc = new LongSparseArray<>();

    public msw(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.bw bwVar) {
        Path path = new Path();
        this.uym = path;
        this.msw = new com.bytedance.adsdk.ypw.emc.emc(1);
        this.zz = new RectF();
        this.ru = new ArrayList();
        this.emc = 0.0f;
        this.dg = emcVar;
        this.ypw = bwVar.emc();
        this.xq = bwVar.msw();
        this.sba = zzVar;
        this.gbl = bwVar.ypw();
        path.setFillType(bwVar.xq());
        this.yzg = (int) (uymVar.bw() / 32.0f);
        com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> emcVarEmc = bwVar.dg().emc();
        this.sup = emcVarEmc;
        emcVarEmc.emc(this);
        emcVar.emc(emcVarEmc);
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc2 = bwVar.bw().emc();
        this.sz = emcVarEmc2;
        emcVarEmc2.emc(this);
        emcVar.emc(emcVarEmc2);
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc3 = bwVar.ycc().emc();
        this.qh = emcVarEmc3;
        emcVarEmc3.emc(this);
        emcVar.emc(emcVarEmc3);
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc4 = bwVar.uym().emc();
        this.cf = emcVarEmc4;
        emcVarEmc4.emc(this);
        emcVar.emc(emcVarEmc4);
        if (emcVar.ru() != null) {
            com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc5 = emcVar.ru().emc().emc();
            this.ul = emcVarEmc5;
            emcVarEmc5.emc(this);
            emcVar.emc(this.ul);
        }
        if (emcVar.gbl() != null) {
            this.ylm = new com.bytedance.adsdk.ypw.emc.ypw.xq(this, emcVar, emcVar.gbl());
        }
    }

    private int dg() {
        int iRound = Math.round(this.qh.msw() * this.yzg);
        int iRound2 = Math.round(this.cf.msw() * this.yzg);
        int iRound3 = Math.round(this.sup.msw() * this.yzg);
        int i10 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private RadialGradient xq() {
        long jDg = dg();
        RadialGradient radialGradient = this.ycc.get(jDg);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFUym = this.qh.uym();
        PointF pointFUym2 = this.cf.uym();
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVarUym = this.sup.uym();
        int[] iArrEmc = emc(dgVarUym.ypw());
        float[] fArrEmc = dgVarUym.emc();
        float f10 = pointFUym.x;
        float f11 = pointFUym.y;
        float fHypot = (float) Math.hypot(pointFUym2.x - f10, pointFUym2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArrEmc, fArrEmc, Shader.TileMode.CLAMP);
        this.ycc.put(jDg, radialGradient2);
        return radialGradient2;
    }

    private LinearGradient ypw() {
        long jDg = dg();
        LinearGradient linearGradient = this.bw.get(jDg);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFUym = this.qh.uym();
        PointF pointFUym2 = this.cf.uym();
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVarUym = this.sup.uym();
        LinearGradient linearGradient2 = new LinearGradient(pointFUym.x, pointFUym.y, pointFUym2.x, pointFUym2.y, emc(dgVarUym.ypw()), dgVarUym.emc(), Shader.TileMode.CLAMP);
        this.bw.put(jDg, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        this.sba.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            xq xqVar = list2.get(i10);
            if (xqVar instanceof sz) {
                this.ru.add((sz) xqVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        Shader shaderXq;
        if (this.xq) {
            return;
        }
        com.bytedance.adsdk.ypw.bw.emc("GradientFillContent#draw");
        this.uym.reset();
        for (int i11 = 0; i11 < this.ru.size(); i11++) {
            this.uym.addPath(this.ru.get(i11).dg(), matrix);
        }
        this.uym.computeBounds(this.zz, false);
        if (this.gbl == com.bytedance.adsdk.ypw.xq.ypw.uym.LINEAR) {
            shaderXq = ypw();
        } else {
            shaderXq = xq();
        }
        shaderXq.setLocalMatrix(matrix);
        this.msw.setShader(shaderXq);
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.vk;
        if (emcVar != null) {
            this.msw.setColorFilter(emcVar.uym());
        }
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar2 = this.ul;
        if (emcVar2 != null) {
            float fFloatValue = emcVar2.uym().floatValue();
            if (fFloatValue == 0.0f) {
                this.msw.setMaskFilter(null);
            } else if (fFloatValue != this.emc) {
                this.msw.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.emc = fFloatValue;
        }
        com.bytedance.adsdk.ypw.emc.ypw.xq xqVar = this.ylm;
        if (xqVar != null) {
            xqVar.emc(this.msw);
        }
        this.msw.setAlpha(com.bytedance.adsdk.ypw.ycc.bw.emc((int) ((((i10 / 255.0f) * this.sz.uym().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.uym, this.msw);
        com.bytedance.adsdk.ypw.bw.ypw("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(RectF rectF, Matrix matrix, boolean z10) {
        this.uym.reset();
        for (int i10 = 0; i10 < this.ru.size(); i10++) {
            this.uym.addPath(this.ru.get(i10).dg(), matrix);
        }
        this.uym.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] emc(int[] iArr) {
        if (this.f9220aa == null) {
            return iArr;
        }
        throw null;
    }
}
