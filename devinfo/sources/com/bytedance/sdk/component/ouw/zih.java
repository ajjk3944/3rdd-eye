package com.bytedance.sdk.component.ouw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih<K, V> {
    final Map<K, V> ouw = new HashMap();
    final Map<V, Set<K>> vt = new HashMap();

    public final void ouw() {
        this.ouw.clear();
        this.vt.clear();
    }
}
