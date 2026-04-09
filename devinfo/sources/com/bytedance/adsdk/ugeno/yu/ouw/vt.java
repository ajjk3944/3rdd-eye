package com.bytedance.adsdk.ugeno.yu.ouw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements lh {
    private List<yu> ouw = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.yu.ouw.lh
    public final void ouw(yu yuVar) {
        this.ouw.add(yuVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.ouw.lh
    public final void ouw() {
        if (this.ouw.isEmpty()) {
            return;
        }
        Iterator<yu> it = this.ouw.iterator();
        while (it.hasNext()) {
            it.next().ouw();
        }
    }
}
