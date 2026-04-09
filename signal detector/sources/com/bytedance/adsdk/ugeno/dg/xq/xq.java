package com.bytedance.adsdk.ugeno.dg.xq;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.dg.ycc;

/* loaded from: classes.dex */
public class xq extends com.bytedance.adsdk.ugeno.dg.ypw.emc {
    public xq(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.xq;
        if (xqVar == null || (xqVarYpw = xqVar.ypw(xqVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYcc = xqVarYpw.ycc("SwiperView");
        if (xqVarYcc instanceof com.bytedance.adsdk.ugeno.ypw) {
            ((com.bytedance.adsdk.ugeno.ypw) xqVarYcc).dg();
        }
    }
}
