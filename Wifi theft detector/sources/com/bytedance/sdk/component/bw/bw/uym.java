package com.bytedance.sdk.component.bw.bw;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class uym extends emc {
    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        List<com.bytedance.sdk.component.bw.xq.xq> linkedList;
        String strSra = xqVar.sra();
        Map<String, List<com.bytedance.sdk.component.bw.xq.xq>> mapMsw = xqVar.sba().msw();
        synchronized (mapMsw) {
            try {
                linkedList = mapMsw.get(strSra);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(xqVar);
                mapMsw.put(strSra, linkedList);
                if (linkedList.size() <= 1) {
                    xqVar.emc(new dg());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "check_duplicate";
    }
}
