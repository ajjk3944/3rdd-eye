package com.bytedance.sdk.component.ypw.emc.emc.emc;

import com.bytedance.sdk.component.ypw.emc.msw;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import java.util.List;

/* loaded from: classes.dex */
public class xq implements msw.emc {
    List<com.bytedance.sdk.component.ypw.emc.msw> emc;
    int xq = 0;
    sup ypw;

    public xq(List<com.bytedance.sdk.component.ypw.emc.msw> list, sup supVar) {
        this.emc = list;
        this.ypw = supVar;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.msw.emc
    public sup emc() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.msw.emc
    public qh emc(sup supVar) {
        this.ypw = supVar;
        int i = this.xq + 1;
        this.xq = i;
        if (i >= this.emc.size()) {
            return null;
        }
        return this.emc.get(this.xq).emc(this);
    }
}
