package com.bytedance.sdk.component.bw.bw;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ycc extends emc {
    private byte[] ypw(com.bytedance.sdk.component.bw.xq.xq xqVar, String str) {
        com.bytedance.sdk.component.bw.xq xqVarXq = xqVar.sba().xq(xqVar.yzg());
        if (xqVarXq == null) {
            return null;
        }
        return xqVarXq.emc((com.bytedance.sdk.component.bw.xq) str);
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        String strZz = xqVar.zz();
        byte[] bArrEmc = (xqVar.ul() || xqVar.yzg().zz()) ? emc(xqVar, strZz) : ypw(xqVar, strZz);
        if (bArrEmc == null) {
            xqVar.emc(new gbl());
        } else {
            xqVar.emc(new ypw(bArrEmc, null));
            xqVar.sba().ypw(xqVar.yzg()).emc(strZz, bArrEmc);
        }
    }

    private byte[] emc(com.bytedance.sdk.component.bw.xq.xq xqVar, String str) {
        xqVar.sba().xq(xqVar.yzg());
        Collection<com.bytedance.sdk.component.bw.xq> collectionXq = xqVar.sba().xq();
        if (collectionXq == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.bw.xq> it = collectionXq.iterator();
        while (it.hasNext()) {
            byte[] bArrEmc = it.next().emc((com.bytedance.sdk.component.bw.xq) str);
            if (bArrEmc != null) {
                return bArrEmc;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "disk_cache";
    }
}
