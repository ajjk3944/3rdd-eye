package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class zz extends com.bytedance.adsdk.ypw.uym.emc<PointF> {
    private final com.bytedance.adsdk.ypw.uym.emc<PointF> gbl;
    private Path ru;

    public zz(com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar) {
        super(uymVar, emcVar.emc, emcVar.ypw, emcVar.xq, emcVar.dg, emcVar.bw, emcVar.ycc, emcVar.uym);
        this.gbl = emcVar;
        emc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void emc() {
        T t10;
        T t11;
        T t12 = this.ypw;
        boolean z10 = (t12 == 0 || (t11 = this.emc) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.emc;
        if (t13 == 0 || (t10 = this.ypw) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar = this.gbl;
        this.ru = com.bytedance.adsdk.ypw.ycc.ycc.emc((PointF) t13, (PointF) t10, emcVar.msw, emcVar.zz);
    }

    public Path ypw() {
        return this.ru;
    }
}
