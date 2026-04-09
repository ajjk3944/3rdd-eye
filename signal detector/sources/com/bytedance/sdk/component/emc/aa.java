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

    public void emc(Set<K> set, V v6) {
        for (K k6 : set) {
            if (this.emc.containsKey(k6)) {
                ypw(k6);
            }
        }
        Set<K> hashSet = this.ypw.get(v6);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.ypw.put(v6, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.emc.put(it.next(), v6);
        }
    }

    public void ypw(K k6) {
        Set<K> set;
        V vRemove = this.emc.remove(k6);
        if (vRemove == null || (set = this.ypw.get(vRemove)) == null) {
            return;
        }
        set.remove(k6);
        if (set.isEmpty()) {
            this.ypw.remove(vRemove);
        }
    }

    public V emc(K k6) {
        return this.emc.get(k6);
    }

    public void emc() {
        this.emc.clear();
        this.ypw.clear();
    }
}
