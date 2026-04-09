package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* loaded from: classes.dex */
public class uym extends xq {
    public uym(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.bw;
            if (map == null || map.isEmpty() || iEmc == com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE), 0)) {
                this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
            }
        }
        return false;
    }
}
