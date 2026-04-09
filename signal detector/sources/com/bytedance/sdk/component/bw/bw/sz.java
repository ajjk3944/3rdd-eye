package com.bytedance.sdk.component.bw.bw;

import com.bytedance.sdk.component.bw.vk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class sz<T> extends emc {
    private T emc;
    private boolean xq;
    private com.bytedance.sdk.component.bw.ycc ypw;

    public sz(T t6, com.bytedance.sdk.component.bw.ycc yccVar, boolean z6) {
        this.emc = t6;
        this.ypw = yccVar;
        this.xq = z6;
    }

    private Map<String, String> ypw() {
        com.bytedance.sdk.component.bw.ycc yccVar = this.ypw;
        if (yccVar != null) {
            return yccVar.bw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        String strSra = xqVar.sra();
        Map<String, List<com.bytedance.sdk.component.bw.xq.xq>> mapMsw = xqVar.sba().msw();
        List<com.bytedance.sdk.component.bw.xq.xq> list = mapMsw.get(strSra);
        if (list == null) {
            ypw(xqVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.bw.xq.xq> it = list.iterator();
                while (it.hasNext()) {
                    ypw(it.next());
                }
                list.clear();
                mapMsw.remove(strSra);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ypw(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        vk vkVarMsw = xqVar.msw();
        if (vkVarMsw != null) {
            vkVarMsw.emc(new com.bytedance.sdk.component.bw.xq.dg().emc(xqVar, this.emc, ypw(), this.xq));
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "success";
    }
}
