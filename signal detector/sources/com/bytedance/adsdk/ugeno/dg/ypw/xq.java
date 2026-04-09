package com.bytedance.adsdk.ugeno.dg.ypw;

import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.dg.ycc;

/* loaded from: classes.dex */
public class xq extends emc {
    private cf zz;

    public xq(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() {
        cf cfVarHxp = this.xq.hxp();
        this.zz = cfVarHxp;
        if (cfVarHxp != null) {
            cfVarHxp.emc(this.xq, this.uym, this.ypw);
        }
    }
}
