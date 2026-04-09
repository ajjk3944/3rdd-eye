package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class dg extends xq implements com.bytedance.adsdk.ugeno.dg.emc.dg {
    private com.bytedance.adsdk.ugeno.dg.emc.xq gbl;

    public dg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        com.bytedance.adsdk.ugeno.dg.emc.emc emcVarRa = this.ypw.ra();
        if (emcVarRa == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.dg.emc.xq xqVarEmc = emcVarRa.emc(this.ycc);
        this.gbl = xqVarEmc;
        if (xqVarEmc != null) {
            xqVarEmc.emc(this);
            return false;
        }
        emcVarRa.emc(this.ycc, new com.bytedance.adsdk.ugeno.dg.emc.ypw());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.dg.emc.dg
    public void emc(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
    }
}
