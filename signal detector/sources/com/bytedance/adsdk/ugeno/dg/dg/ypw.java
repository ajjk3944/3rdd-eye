package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw extends xq implements com.bytedance.adsdk.ugeno.emc.ypw {
    private String gbl;

    public ypw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar;
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYpw;
        com.bytedance.adsdk.ugeno.emc.emc emcVarSz;
        Map<String, String> map = this.bw;
        if (map != null && map.size() > 0) {
            String str = this.bw.get("name");
            this.gbl = this.bw.get("state");
            if (!TextUtils.isEmpty(str) && (xqVarYpw = (xqVar = this.ypw).ypw(xqVar)) != null && (emcVarSz = xqVarYpw.msw(str).sz(str)) != null) {
                emcVarSz.emc(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw
    public void ypw() {
        com.bytedance.adsdk.ugeno.dg.gbl gblVar;
        if ((TextUtils.equals(this.gbl, "complete") || TextUtils.isEmpty(this.gbl)) && (gblVar = this.emc) != null) {
            gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw
    public void emc() {
        com.bytedance.adsdk.ugeno.dg.gbl gblVar;
        if ((TextUtils.equals(this.gbl, "start") || TextUtils.isEmpty(this.gbl)) && (gblVar = this.emc) != null) {
            gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
        }
    }
}
