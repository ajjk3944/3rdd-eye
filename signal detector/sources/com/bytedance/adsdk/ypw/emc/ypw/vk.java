package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;

/* loaded from: classes.dex */
public class vk {
    private final float[] bw;
    private final Matrix dg;
    private final Matrix emc = new Matrix();
    private dg gbl;
    private emc<com.bytedance.adsdk.ypw.uym.xq, com.bytedance.adsdk.ypw.uym.xq> msw;
    private emc<?, Float> qh;
    private emc<Integer, Integer> ru;
    private dg sup;
    private emc<?, Float> sz;
    private emc<?, PointF> uym;
    private final Matrix xq;
    private emc<PointF, PointF> ycc;
    private final Matrix ypw;
    private emc<Float, Float> zz;

    public vk(com.bytedance.adsdk.ypw.xq.emc.sup supVar) {
        this.ycc = supVar.emc() == null ? null : supVar.emc().emc();
        this.uym = supVar.ypw() == null ? null : supVar.ypw().emc();
        this.msw = supVar.xq() == null ? null : supVar.xq().emc();
        this.zz = supVar.dg() == null ? null : supVar.dg().emc();
        dg dgVar = supVar.msw() == null ? null : (dg) supVar.msw().emc();
        this.gbl = dgVar;
        if (dgVar != null) {
            this.ypw = new Matrix();
            this.xq = new Matrix();
            this.dg = new Matrix();
            this.bw = new float[9];
        } else {
            this.ypw = null;
            this.xq = null;
            this.dg = null;
            this.bw = null;
        }
        this.sup = supVar.zz() == null ? null : (dg) supVar.zz().emc();
        if (supVar.bw() != null) {
            this.ru = supVar.bw().emc();
        }
        if (supVar.ycc() != null) {
            this.sz = supVar.ycc().emc();
        } else {
            this.sz = null;
        }
        if (supVar.uym() != null) {
            this.qh = supVar.uym().emc();
        } else {
            this.qh = null;
        }
    }

    private void bw() {
        for (int i = 0; i < 9; i++) {
            this.bw[i] = 0.0f;
        }
    }

    public Matrix dg() {
        PointF pointFUym;
        PointF pointFUym2;
        this.emc.reset();
        emc<?, PointF> emcVar = this.uym;
        if (emcVar != null && (pointFUym2 = emcVar.uym()) != null) {
            float f2 = pointFUym2.x;
            if (f2 != 0.0f || pointFUym2.y != 0.0f) {
                this.emc.preTranslate(f2, pointFUym2.y);
            }
        }
        emc<Float, Float> emcVar2 = this.zz;
        if (emcVar2 != null) {
            float fFloatValue = emcVar2 instanceof aa ? emcVar2.uym().floatValue() : ((dg) emcVar2).zz();
            if (fFloatValue != 0.0f) {
                this.emc.preRotate(fFloatValue);
            }
        }
        if (this.gbl != null) {
            float fCos = this.sup == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.zz()) + 90.0f));
            float fSin = this.sup == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.zz()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.zz()));
            bw();
            float[] fArr = this.bw;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.ypw.setValues(fArr);
            bw();
            float[] fArr2 = this.bw;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.xq.setValues(fArr2);
            bw();
            float[] fArr3 = this.bw;
            fArr3[0] = fCos;
            fArr3[1] = f5;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.dg.setValues(fArr3);
            this.xq.preConcat(this.ypw);
            this.dg.preConcat(this.xq);
            this.emc.preConcat(this.dg);
        }
        emc<com.bytedance.adsdk.ypw.uym.xq, com.bytedance.adsdk.ypw.uym.xq> emcVar3 = this.msw;
        if (emcVar3 != null) {
            com.bytedance.adsdk.ypw.uym.xq xqVarUym = emcVar3.uym();
            if (xqVarUym.emc() != 1.0f || xqVarUym.ypw() != 1.0f) {
                this.emc.preScale(xqVarUym.emc(), xqVarUym.ypw());
            }
        }
        emc<PointF, PointF> emcVar4 = this.ycc;
        if (emcVar4 != null && (((pointFUym = emcVar4.uym()) != null && pointFUym.x != 0.0f) || pointFUym.y != 0.0f)) {
            this.emc.preTranslate(-pointFUym.x, -pointFUym.y);
        }
        return this.emc;
    }

    public void emc(com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        emcVar.emc(this.ru);
        emcVar.emc(this.sz);
        emcVar.emc(this.qh);
        emcVar.emc(this.ycc);
        emcVar.emc(this.uym);
        emcVar.emc(this.msw);
        emcVar.emc(this.zz);
        emcVar.emc(this.gbl);
        emcVar.emc(this.sup);
    }

    public emc<?, Float> xq() {
        return this.qh;
    }

    public emc<?, Float> ypw() {
        return this.sz;
    }

    public Matrix ypw(float f2) {
        emc<?, PointF> emcVar = this.uym;
        PointF pointFUym = emcVar == null ? null : emcVar.uym();
        emc<com.bytedance.adsdk.ypw.uym.xq, com.bytedance.adsdk.ypw.uym.xq> emcVar2 = this.msw;
        com.bytedance.adsdk.ypw.uym.xq xqVarUym = emcVar2 == null ? null : emcVar2.uym();
        this.emc.reset();
        if (pointFUym != null) {
            this.emc.preTranslate(pointFUym.x * f2, pointFUym.y * f2);
        }
        if (xqVarUym != null) {
            double d6 = f2;
            this.emc.preScale((float) Math.pow(xqVarUym.emc(), d6), (float) Math.pow(xqVarUym.ypw(), d6));
        }
        emc<Float, Float> emcVar3 = this.zz;
        if (emcVar3 != null) {
            float fFloatValue = emcVar3.uym().floatValue();
            emc<PointF, PointF> emcVar4 = this.ycc;
            PointF pointFUym2 = emcVar4 != null ? emcVar4.uym() : null;
            this.emc.preRotate(fFloatValue * f2, pointFUym2 == null ? 0.0f : pointFUym2.x, pointFUym2 != null ? pointFUym2.y : 0.0f);
        }
        return this.emc;
    }

    public void emc(emc.InterfaceC0021emc interfaceC0021emc) {
        emc<Integer, Integer> emcVar = this.ru;
        if (emcVar != null) {
            emcVar.emc(interfaceC0021emc);
        }
        emc<?, Float> emcVar2 = this.sz;
        if (emcVar2 != null) {
            emcVar2.emc(interfaceC0021emc);
        }
        emc<?, Float> emcVar3 = this.qh;
        if (emcVar3 != null) {
            emcVar3.emc(interfaceC0021emc);
        }
        emc<PointF, PointF> emcVar4 = this.ycc;
        if (emcVar4 != null) {
            emcVar4.emc(interfaceC0021emc);
        }
        emc<?, PointF> emcVar5 = this.uym;
        if (emcVar5 != null) {
            emcVar5.emc(interfaceC0021emc);
        }
        emc<com.bytedance.adsdk.ypw.uym.xq, com.bytedance.adsdk.ypw.uym.xq> emcVar6 = this.msw;
        if (emcVar6 != null) {
            emcVar6.emc(interfaceC0021emc);
        }
        emc<Float, Float> emcVar7 = this.zz;
        if (emcVar7 != null) {
            emcVar7.emc(interfaceC0021emc);
        }
        dg dgVar = this.gbl;
        if (dgVar != null) {
            dgVar.emc(interfaceC0021emc);
        }
        dg dgVar2 = this.sup;
        if (dgVar2 != null) {
            dgVar2.emc(interfaceC0021emc);
        }
    }

    public void emc(float f2) {
        emc<Integer, Integer> emcVar = this.ru;
        if (emcVar != null) {
            emcVar.emc(f2);
        }
        emc<?, Float> emcVar2 = this.sz;
        if (emcVar2 != null) {
            emcVar2.emc(f2);
        }
        emc<?, Float> emcVar3 = this.qh;
        if (emcVar3 != null) {
            emcVar3.emc(f2);
        }
        emc<PointF, PointF> emcVar4 = this.ycc;
        if (emcVar4 != null) {
            emcVar4.emc(f2);
        }
        emc<?, PointF> emcVar5 = this.uym;
        if (emcVar5 != null) {
            emcVar5.emc(f2);
        }
        emc<com.bytedance.adsdk.ypw.uym.xq, com.bytedance.adsdk.ypw.uym.xq> emcVar6 = this.msw;
        if (emcVar6 != null) {
            emcVar6.emc(f2);
        }
        emc<Float, Float> emcVar7 = this.zz;
        if (emcVar7 != null) {
            emcVar7.emc(f2);
        }
        dg dgVar = this.gbl;
        if (dgVar != null) {
            dgVar.emc(f2);
        }
        dg dgVar2 = this.sup;
        if (dgVar2 != null) {
            dgVar2.emc(f2);
        }
    }

    public emc<?, Integer> emc() {
        return this.ru;
    }
}
