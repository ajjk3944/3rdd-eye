package com.bytedance.sdk.openadsdk.core.gbl.bw.ypw;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dg.gbl;
import java.util.Map;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.dg.dg.xq {
    private boolean gbl;

    public emc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        Map<String, String> map = this.bw;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(obj.toString(), -1);
                if (this.bw.containsKey("remainingSeconds")) {
                    int iEmc2 = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("remainingSeconds"), -1);
                    if (iEmc >= 0 && iEmc2 >= 0 && iEmc == iEmc2 && !this.gbl) {
                        this.gbl = true;
                        gbl gblVar = this.emc;
                        if (gblVar != null) {
                            gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
