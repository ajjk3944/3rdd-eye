package com.bytedance.sdk.component.bw.dg.xq.emc;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class xq<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> emc = new LinkedHashMap<>(0, 0.75f, true);
    private int ypw;

    public xq(int i) {
        this.ypw = i;
    }

    public synchronized V emc(K k6) {
        V v6 = null;
        if (k6 == null) {
            return null;
        }
        if (this.ypw <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.emc.get(k6);
        if (softReference != null) {
            v6 = softReference.get();
            if (v6 != null) {
                return v6;
            }
            this.emc.remove(k6);
        }
        return v6;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.ypw), Integer.valueOf(this.emc.size()));
    }

    public synchronized void emc(K k6, V v6) {
        if (this.ypw <= 0) {
            return;
        }
        if (k6 == null || v6 == null) {
            return;
        }
        this.emc.put(k6, new SoftReference<>(v6));
        int size = this.emc.size();
        int i = this.ypw;
        if (size > i) {
            emc((int) (i * 0.7d));
        }
    }

    public synchronized void emc(int i) {
        int size = this.emc.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.emc.entrySet().iterator();
            for (int i3 = 0; i3 < size; i3++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.emc.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
