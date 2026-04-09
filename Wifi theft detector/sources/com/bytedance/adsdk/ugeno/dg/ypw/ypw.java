package com.bytedance.adsdk.ugeno.dg.ypw;

import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ypw extends emc {
    private List<com.bytedance.adsdk.ugeno.dg.emc.dg> zz;

    public ypw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
        this.zz = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() {
        com.bytedance.adsdk.ugeno.dg.emc.xq xqVarEmc;
        Map<String, String> map = this.ycc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.ycc.get("name");
        com.bytedance.adsdk.ugeno.dg.emc.emc emcVarRa = this.xq.ra();
        if (emcVarRa == null || (xqVarEmc = emcVarRa.emc(str)) == null) {
            return;
        }
        xqVarEmc.emc(str);
    }
}
