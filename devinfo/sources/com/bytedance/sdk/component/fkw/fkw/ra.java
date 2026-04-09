package com.bytedance.sdk.component.fkw.fkw;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        List<com.bytedance.sdk.component.fkw.lh.lh> linkedList;
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.lh.lh>> map = lhVar.jqy.ouw;
        synchronized (map) {
            try {
                linkedList = map.get(strRa);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(lhVar);
                map.put(strRa, linkedList);
                if (linkedList.size() <= 1) {
                    lhVar.ouw(new yu());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "check_duplicate";
    }
}
