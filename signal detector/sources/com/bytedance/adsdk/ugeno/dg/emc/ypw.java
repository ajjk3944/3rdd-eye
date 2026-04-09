package com.bytedance.adsdk.ugeno.dg.emc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ypw implements xq {
    private List<dg> emc = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.dg.emc.xq
    public void emc(dg dgVar) {
        this.emc.add(dgVar);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.emc.xq
    public void emc(String str) {
        if (this.emc.isEmpty()) {
            return;
        }
        Iterator<dg> it = this.emc.iterator();
        while (it.hasNext()) {
            it.next().emc(str);
        }
    }
}
