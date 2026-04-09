package com.bytedance.adsdk.vt.lh.ouw;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
abstract class jg<V, O> implements mwh<V, O> {
    final List<com.bytedance.adsdk.vt.ra.ouw<V>> ouw;

    public jg(List<com.bytedance.adsdk.vt.ra.ouw<V>> list) {
        this.ouw = list;
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public List<com.bytedance.adsdk.vt.ra.ouw<V>> lh() {
        return this.ouw;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.ouw.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.ouw.toArray()));
        }
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public boolean vt() {
        return this.ouw.isEmpty() || (this.ouw.size() == 1 && this.ouw.get(0).yu());
    }
}
