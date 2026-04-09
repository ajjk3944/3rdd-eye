package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;

/* loaded from: classes.dex */
public class cf implements gbl, sz, emc.InterfaceC0106emc {
    private final com.bytedance.adsdk.ypw.zz bw;
    private final boolean dg;
    private boolean gbl;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> msw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, PointF> uym;
    private final String xq;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, PointF> ycc;
    private final Path emc = new Path();
    private final RectF ypw = new RectF();
    private final ypw zz = new ypw();
    private com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> ru = null;

    public cf(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.gbl gblVar) {
        this.xq = gblVar.emc();
        this.dg = gblVar.bw();
        this.bw = zzVar;
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc = gblVar.dg().emc();
        this.ycc = emcVarEmc;
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc2 = gblVar.xq().emc();
        this.uym = emcVarEmc2;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc3 = gblVar.ypw().emc();
        this.msw = emcVarEmc3;
        emcVar.emc(emcVarEmc);
        emcVar.emc(emcVarEmc2);
        emcVar.emc(emcVarEmc3);
        emcVarEmc.emc(this);
        emcVarEmc2.emc(this);
        emcVarEmc3.emc(this);
    }

    private void ypw() {
        this.gbl = false;
        this.bw.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVar;
        if (this.gbl) {
            return this.emc;
        }
        this.emc.reset();
        if (this.dg) {
            this.gbl = true;
            return this.emc;
        }
        PointF pointFUym = this.uym.uym();
        float f10 = pointFUym.x / 2.0f;
        float f11 = pointFUym.y / 2.0f;
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar2 = this.msw;
        float fZz = emcVar2 == null ? 0.0f : ((com.bytedance.adsdk.ypw.emc.ypw.dg) emcVar2).zz();
        if (fZz == 0.0f && (emcVar = this.ru) != null) {
            fZz = Math.min(emcVar.uym().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fZz > fMin) {
            fZz = fMin;
        }
        PointF pointFUym2 = this.ycc.uym();
        this.emc.moveTo(pointFUym2.x + f10, (pointFUym2.y - f11) + fZz);
        this.emc.lineTo(pointFUym2.x + f10, (pointFUym2.y + f11) - fZz);
        if (fZz > 0.0f) {
            RectF rectF = this.ypw;
            float f12 = pointFUym2.x;
            float f13 = fZz * 2.0f;
            float f14 = pointFUym2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.emc.arcTo(this.ypw, 0.0f, 90.0f, false);
        }
        this.emc.lineTo((pointFUym2.x - f10) + fZz, pointFUym2.y + f11);
        if (fZz > 0.0f) {
            RectF rectF2 = this.ypw;
            float f15 = pointFUym2.x;
            float f16 = pointFUym2.y;
            float f17 = fZz * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.emc.arcTo(this.ypw, 90.0f, 90.0f, false);
        }
        this.emc.lineTo(pointFUym2.x - f10, (pointFUym2.y - f11) + fZz);
        if (fZz > 0.0f) {
            RectF rectF3 = this.ypw;
            float f18 = pointFUym2.x;
            float f19 = pointFUym2.y;
            float f20 = fZz * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.emc.arcTo(this.ypw, 180.0f, 90.0f, false);
        }
        this.emc.lineTo((pointFUym2.x + f10) - fZz, pointFUym2.y - f11);
        if (fZz > 0.0f) {
            RectF rectF4 = this.ypw;
            float f21 = pointFUym2.x;
            float f22 = fZz * 2.0f;
            float f23 = pointFUym2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.emc.arcTo(this.ypw, 270.0f, 90.0f, false);
        }
        this.emc.close();
        this.zz.emc(this.emc);
        this.gbl = true;
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        ypw();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r5, java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.ypw.emc.emc.xq r0 = (com.bytedance.adsdk.ypw.emc.emc.xq) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.ypw.emc.emc.ylm
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.ypw.emc.emc.ylm r1 = (com.bytedance.adsdk.ypw.emc.emc.ylm) r1
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r2 = r1.ypw()
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r3 = com.bytedance.adsdk.ypw.xq.ypw.yzg.emc.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.bytedance.adsdk.ypw.emc.emc.ypw r0 = r4.zz
            r0.emc(r1)
            r1.emc(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.ypw.emc.emc.aa
            if (r1 == 0) goto L31
            com.bytedance.adsdk.ypw.emc.emc.aa r0 = (com.bytedance.adsdk.ypw.emc.emc.aa) r0
            com.bytedance.adsdk.ypw.emc.ypw.emc r0 = r0.ypw()
            r4.ru = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.emc.emc.cf.emc(java.util.List, java.util.List):void");
    }
}
