package com.bytedance.sdk.component.fkw.fkw;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw;
        String str = lhVar.f7456lh;
        lhVar.jqy.vt(lhVar.tc);
        Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = lhVar.jqy.ouw();
        if (collectionOuw != null) {
            Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
            while (it.hasNext()) {
                bArrOuw = it.next().ouw((com.bytedance.sdk.component.fkw.lh) str);
                if (bArrOuw != null) {
                    break;
                }
            }
            bArrOuw = null;
        } else {
            bArrOuw = null;
        }
        if (bArrOuw == null) {
            lhVar.ouw(new cf());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
            lhVar.jqy.ouw(lhVar.tc).ouw(str, bArrOuw);
        }
    }
}
