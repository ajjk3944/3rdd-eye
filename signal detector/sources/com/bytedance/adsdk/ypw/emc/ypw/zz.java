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
        T t6;
        T t7;
        T t8 = this.ypw;
        boolean z6 = (t8 == 0 || (t7 = this.emc) == 0 || !((PointF) t7).equals(((PointF) t8).x, ((PointF) t8).y)) ? false : true;
        T t9 = this.emc;
        if (t9 == 0 || (t6 = this.ypw) == 0 || z6) {
            return;
        }
        com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar = this.gbl;
        this.ru = com.bytedance.adsdk.ypw.ycc.ycc.emc((PointF) t9, (PointF) t6, emcVar.msw, emcVar.zz);
    }

    public Path ypw() {
        return this.ru;
    }
}
