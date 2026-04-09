package com.bytedance.sdk.component.fkw.yu.vt;

import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import d.h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        List<com.bytedance.sdk.component.fkw.yu.lh.lh> copyOnWriteArrayList;
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.yu.lh.lh>> map = lhVar.qbp.ouw;
        StringBuilder sbA = h.A("Step 2 look duplicate Request request image key is ", strRa, " result type is ");
        sbA.append(lhVar.tlj);
        sbA.append(" url is ");
        sbA.append(lhVar.ouw);
        ko.vt("PagImageRequest", sbA.toString());
        synchronized (map) {
            try {
                copyOnWriteArrayList = map.get(strRa);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    map.put(strRa, copyOnWriteArrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(lhVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            ko.vt("PagImageRequest", "Step 2-1 Hit duplicate request image key is " + strRa + " result type is " + lhVar.tlj + " url is " + lhVar.ouw);
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "check_duplicate";
    }
}
