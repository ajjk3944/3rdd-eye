package com.bytedance.sdk.component.bw.bw;

/* loaded from: classes.dex */
public class dg extends emc {
    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        com.bytedance.sdk.component.bw.ypw ypwVarYzg = xqVar.yzg();
        if (ypwVarYzg != null) {
            if (ypwVarYzg.bw()) {
                xqVar.emc(new ru());
                return;
            } else if (ypwVarYzg.uym()) {
                xqVar.emc(new ycc());
                return;
            }
        }
        xqVar.emc(new gbl());
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "cache_policy";
    }
}
