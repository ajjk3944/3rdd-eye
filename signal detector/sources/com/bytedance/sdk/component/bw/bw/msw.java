package com.bytedance.sdk.component.bw.bw;

import com.bytedance.sdk.component.bw.vk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class msw extends emc {
    private Throwable emc;
    private String xq;
    private int ypw;

    public msw(int i, String str, Throwable th) {
        this.ypw = i;
        this.xq = str;
        this.emc = th;
    }

    private void ypw(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        vk vkVarMsw = xqVar.msw();
        if (vkVarMsw != null) {
            vkVarMsw.emc(this.ypw, this.xq, this.emc);
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        xqVar.emc(new com.bytedance.sdk.component.bw.xq.emc(this.ypw, this.xq, this.emc));
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

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "failed";
    }
}
