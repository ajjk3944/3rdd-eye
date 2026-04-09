package com.bytedance.adsdk.ugeno.dg.xq;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.dg.ycc;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.dg.ypw.emc {
    public ypw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() throws Resources.NotFoundException {
        if (this.xq == null) {
            return;
        }
        int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(this.ycc.get("position"), 0);
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.xq;
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw = xqVar.ypw(xqVar);
        if (xqVarYpw == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYcc = xqVarYpw.ycc("SwiperView");
        if (xqVarYcc instanceof com.bytedance.adsdk.ugeno.ypw) {
            ((com.bytedance.adsdk.ugeno.ypw) xqVarYcc).emc(iEmc);
        }
    }
}
