package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class ul extends emc {
    private final String bw;
    private final com.bytedance.adsdk.ypw.xq.xq.emc dg;
    private com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> msw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> uym;
    private final boolean ycc;

    public ul(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.sba sbaVar) {
        super(zzVar, emcVar, sbaVar.uym().emc(), sbaVar.msw().emc(), sbaVar.zz(), sbaVar.xq(), sbaVar.dg(), sbaVar.bw(), sbaVar.ycc());
        this.dg = emcVar;
        this.bw = sbaVar.emc();
        this.ycc = sbaVar.ru();
        com.bytedance.adsdk.ypw.emc.ypw.emc<Integer, Integer> emcVarEmc = sbaVar.ypw().emc();
        this.uym = emcVarEmc;
        emcVarEmc.emc(this);
        emcVar.emc(emcVarEmc);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.emc, com.bytedance.adsdk.ypw.emc.emc.bw
    public void emc(Canvas canvas, Matrix matrix, int i10) {
        if (this.ycc) {
            return;
        }
        this.ypw.setColor(((com.bytedance.adsdk.ypw.emc.ypw.ypw) this.uym).zz());
        com.bytedance.adsdk.ypw.emc.ypw.emc<ColorFilter, ColorFilter> emcVar = this.msw;
        if (emcVar != null) {
            this.ypw.setColorFilter(emcVar.uym());
        }
        super.emc(canvas, matrix, i10);
    }
}
