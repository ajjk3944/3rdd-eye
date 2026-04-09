package com.bytedance.adsdk.ugeno.dg.ypw;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.Map;

/* loaded from: classes.dex */
public class dg extends emc {
    public dg(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        super(xqVar, str, emcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void emc() {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar;
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw;
        com.bytedance.adsdk.ugeno.emc.emc emcVarSz;
        Map<String, String> map = this.ycc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.ycc.get("name");
        if (TextUtils.isEmpty(str) || (xqVarYpw = (xqVar = this.xq).ypw(xqVar)) == null || (emcVarSz = xqVarYpw.msw(str).sz(str)) == null) {
            return;
        }
        emcVarSz.ypw();
        emcVarSz.emc(new com.bytedance.adsdk.ugeno.emc.ypw() { // from class: com.bytedance.adsdk.ugeno.dg.ypw.dg.1
            @Override // com.bytedance.adsdk.ugeno.emc.ypw
            public void emc() {
            }

            @Override // com.bytedance.adsdk.ugeno.emc.ypw
            public void ypw() {
                dg.this.xq();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.dg.ypw.emc
    public void ypw() {
    }
}
