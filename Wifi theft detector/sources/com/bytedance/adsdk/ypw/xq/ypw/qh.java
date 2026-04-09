package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class qh {
    private final List<com.bytedance.adsdk.ypw.xq.emc> emc;
    private boolean xq;
    private PointF ypw;

    public qh(PointF pointF, boolean z10, List<com.bytedance.adsdk.ypw.xq.emc> list) {
        this.ypw = pointF;
        this.xq = z10;
        this.emc = new ArrayList(list);
    }

    public void emc(float f10, float f11) {
        if (this.ypw == null) {
            this.ypw = new PointF();
        }
        this.ypw.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.emc.size() + "closed=" + this.xq + '}';
    }

    public List<com.bytedance.adsdk.ypw.xq.emc> xq() {
        return this.emc;
    }

    public boolean ypw() {
        return this.xq;
    }

    public PointF emc() {
        return this.ypw;
    }

    public qh() {
        this.emc = new ArrayList();
    }

    public void emc(boolean z10) {
        this.xq = z10;
    }

    public void emc(qh qhVar, qh qhVar2, float f10) {
        if (this.ypw == null) {
            this.ypw = new PointF();
        }
        this.xq = qhVar.ypw() || qhVar2.ypw();
        if (qhVar.xq().size() != qhVar2.xq().size()) {
            qhVar.xq().size();
            qhVar2.xq().size();
        }
        int iMin = Math.min(qhVar.xq().size(), qhVar2.xq().size());
        if (this.emc.size() < iMin) {
            for (int size = this.emc.size(); size < iMin; size++) {
                this.emc.add(new com.bytedance.adsdk.ypw.xq.emc());
            }
        } else if (this.emc.size() > iMin) {
            for (int size2 = this.emc.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.ypw.xq.emc> list = this.emc;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFEmc = qhVar.emc();
        PointF pointFEmc2 = qhVar2.emc();
        emc(com.bytedance.adsdk.ypw.ycc.bw.emc(pointFEmc.x, pointFEmc2.x, f10), com.bytedance.adsdk.ypw.ycc.bw.emc(pointFEmc.y, pointFEmc2.y, f10));
        for (int size3 = this.emc.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.ypw.xq.emc emcVar = qhVar.xq().get(size3);
            com.bytedance.adsdk.ypw.xq.emc emcVar2 = qhVar2.xq().get(size3);
            PointF pointFEmc3 = emcVar.emc();
            PointF pointFYpw = emcVar.ypw();
            PointF pointFXq = emcVar.xq();
            PointF pointFEmc4 = emcVar2.emc();
            PointF pointFYpw2 = emcVar2.ypw();
            PointF pointFXq2 = emcVar2.xq();
            this.emc.get(size3).emc(com.bytedance.adsdk.ypw.ycc.bw.emc(pointFEmc3.x, pointFEmc4.x, f10), com.bytedance.adsdk.ypw.ycc.bw.emc(pointFEmc3.y, pointFEmc4.y, f10));
            this.emc.get(size3).ypw(com.bytedance.adsdk.ypw.ycc.bw.emc(pointFYpw.x, pointFYpw2.x, f10), com.bytedance.adsdk.ypw.ycc.bw.emc(pointFYpw.y, pointFYpw2.y, f10));
            this.emc.get(size3).xq(com.bytedance.adsdk.ypw.ycc.bw.emc(pointFXq.x, pointFXq2.x, f10), com.bytedance.adsdk.ypw.ycc.bw.emc(pointFXq.y, pointFXq2.y, f10));
        }
    }
}
