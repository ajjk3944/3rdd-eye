package com.bytedance.sdk.component.ypw.emc.emc.emc;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.sup;

/* loaded from: classes.dex */
public class dg extends gbl {
    public ycc msw;
    public emc zz;

    public dg(gbl.emc emcVar) {
        super(emcVar);
        ycc yccVar = new ycc();
        this.msw = yccVar;
        this.zz = new emc(yccVar.ypw());
    }

    @Override // com.bytedance.sdk.component.ypw.emc.gbl
    public com.bytedance.sdk.component.ypw.emc.dg emc() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.gbl
    public com.bytedance.sdk.component.ypw.emc.ypw emc(sup supVar) {
        supVar.emc(this);
        if (supVar.ypw() == null || supVar.ypw().emc() == null || TextUtils.isEmpty(supVar.ypw().emc().toString())) {
            return null;
        }
        if (emc.emc == null || !emc.emc.ypw() || !this.zz.bw() || "setting".equals(supVar.ycc())) {
            ypw ypwVar = new ypw(supVar, this.msw);
            this.msw.xq().add(ypwVar);
            return ypwVar;
        }
        ypw ypwVar2 = new ypw(supVar, this.zz);
        this.zz.xq().add(ypwVar2);
        return ypwVar2;
    }
}
