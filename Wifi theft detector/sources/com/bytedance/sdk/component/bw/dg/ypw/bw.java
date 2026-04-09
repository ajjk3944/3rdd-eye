package com.bytedance.sdk.component.bw.dg.ypw;

import com.bytedance.sdk.component.bw.yzg;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class bw implements ycc {
    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, yzg yzgVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        List<com.bytedance.sdk.component.bw.dg.xq.xq> copyOnWriteArrayList;
        String strUl = xqVar.ul();
        Map<String, List<com.bytedance.sdk.component.bw.dg.xq.xq>> mapZz = xqVar.aa().zz();
        xqVar.sup();
        xqVar.emc();
        synchronized (mapZz) {
            try {
                copyOnWriteArrayList = mapZz.get(strUl);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapZz.put(strUl, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(xqVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            xqVar.sup();
            xqVar.emc();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public String emc() {
        return "check_duplicate";
    }
}
