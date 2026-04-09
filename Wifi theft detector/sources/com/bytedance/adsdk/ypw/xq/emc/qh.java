package com.bytedance.adsdk.ypw.xq.emc;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class qh<V, O> implements sz<V, O> {
    final List<com.bytedance.adsdk.ypw.uym.emc<V>> emc;

    public qh(List<com.bytedance.adsdk.ypw.uym.emc<V>> list) {
        this.emc = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.emc.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.emc.toArray()));
        }
        return sb.toString();
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public List<com.bytedance.adsdk.ypw.uym.emc<V>> xq() {
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public boolean ypw() {
        return this.emc.isEmpty() || (this.emc.size() == 1 && this.emc.get(0).bw());
    }
}
