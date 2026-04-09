package com.bytedance.sdk.component.emc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class aa<K, V> {
    private final Map<K, V> emc = new HashMap();
    private final Map<V, Set<K>> ypw = new HashMap();

    public void emc(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.emc.containsKey(k10)) {
                ypw(k10);
            }
        }
        Set<K> hashSet = this.ypw.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.ypw.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.emc.put(it.next(), v10);
        }
    }

    public void ypw(K k10) {
        Set<K> set;
        V vRemove = this.emc.remove(k10);
        if (vRemove == null || (set = this.ypw.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.ypw.remove(vRemove);
        }
    }

    public V emc(K k10) {
        return this.emc.get(k10);
    }

    public void emc() {
        this.emc.clear();
        this.ypw.clear();
    }
}
