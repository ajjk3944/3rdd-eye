package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class msw extends xq {
    private int gbl;
    private int sup;
    private int sz;

    public msw(Context context) {
        super(context);
        this.gbl = -1;
        this.sup = -1;
        this.sz = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[0]), -1);
            int iEmc2 = com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[1]), -1);
            int iEmc3 = com.bytedance.adsdk.ugeno.uym.xq.emc(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.bw;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                map2.put("fromIndex", Integer.valueOf(iEmc));
                map2.put("toIndex", Integer.valueOf(iEmc2));
                map2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(iEmc3));
                Iterator<ycc.emc> it = this.xq.ypw().iterator();
                while (it.hasNext()) {
                    it.next().ypw(map2);
                }
                this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
            } else {
                this.gbl = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("fromIndex"), -1);
                this.sup = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("toIndex"), -1);
                int iEmc4 = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE), -1);
                this.sz = iEmc4;
                if (iEmc == this.gbl && iEmc2 == this.sup && iEmc3 == iEmc4) {
                    this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
                }
            }
        }
        return false;
    }
}
