package com.bytedance.sdk.component.bw.bw;

/* loaded from: classes.dex */
public class sup extends emc {
    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        byte[] bArrEmc = xqVar.sba().ypw(xqVar.yzg()).emc(xqVar.zz());
        if (bArrEmc == null) {
            xqVar.emc(new ycc());
        } else {
            xqVar.emc(new ypw(bArrEmc, null));
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "raw_cache";
    }
}
