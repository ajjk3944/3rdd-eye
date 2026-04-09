package com.bytedance.sdk.openadsdk.sba;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.zz;

/* loaded from: classes.dex */
class bw implements dg {
    private int dg;
    private dg emc;
    private int xq;
    private int ypw;

    public bw(dg dgVar, int i10, int i11, int i12) {
        this.emc = dgVar;
        this.ypw = i10;
        this.xq = i11;
        this.dg = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.dg
    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarEmc = this.emc.emc();
        emcVarEmc.emc(BuildConfig.VERSION_NAME);
        emcVarEmc.emc(this.ypw);
        emcVarEmc.ypw(this.xq);
        emcVarEmc.xq(this.dg);
        emcVarEmc.ycc(zz.ypw().uym());
        emcVarEmc.dg(qh.dg());
        return emcVarEmc;
    }
}
