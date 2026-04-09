package com.bytedance.sdk.openadsdk.core.gbl.ypw.dg;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.dg.gbl;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.dg.dg.xq {
    private float gbl;

    public ypw(Context context) {
        super(context);
        this.gbl = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                gbl gblVar = this.emc;
                if (gblVar != null) {
                    gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
                }
                return true;
            }
            this.gbl = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("rate"), 100);
            float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fEmc + " mTargetProgress=" + this.gbl);
            if (fEmc >= this.gbl) {
                gbl gblVar2 = this.emc;
                if (gblVar2 != null) {
                    gblVar2.emc(this.ypw, this.ycc, this.xq.ypw());
                }
                return true;
            }
        }
        return false;
    }
}
