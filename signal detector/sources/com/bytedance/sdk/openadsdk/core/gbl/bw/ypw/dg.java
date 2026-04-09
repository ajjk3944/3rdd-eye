package com.bytedance.sdk.openadsdk.core.gbl.bw.ypw;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dg.gbl;
import java.util.Map;

/* loaded from: classes.dex */
public class dg extends com.bytedance.adsdk.ugeno.dg.dg.xq {
    private boolean gbl;

    public dg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        Map<String, String> map = this.bw;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.gbl = false;
        }
        if (this.bw.containsKey("percent")) {
            float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("percent"), -1.0f);
            if (fEmc >= 0.0f && jLongValue >= (fEmc / 100.0f) * jLongValue2 && !this.gbl) {
                this.gbl = true;
                gbl gblVar = this.emc;
                if (gblVar != null) {
                    gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("interval"), -1) && !this.gbl) {
            this.gbl = true;
            gbl gblVar2 = this.emc;
            if (gblVar2 != null) {
                gblVar2.emc(this.ypw, this.ycc, this.xq.ypw());
            }
        }
        return true;
    }
}
