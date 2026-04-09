package com.bytedance.sdk.component.bw.bw;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class xq extends emc {
    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        if (TextUtils.isEmpty(xqVar.ru())) {
            com.bytedance.sdk.component.bw.sup supVarYcc = xqVar.sba().ycc();
            xqVar.ypw(supVarYcc.emc(xqVar));
            xqVar.emc(supVarYcc.ypw(xqVar));
        }
        xqVar.emc(new uym());
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "generate_key";
    }
}
