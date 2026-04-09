package com.bytedance.sdk.component.bw.dg.xq.emc;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class xq<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> emc = new LinkedHashMap<>(0, 0.75f, true);
    private int ypw;

    public xq(int i10) {
        this.ypw = i10;
    }

    public synchronized V emc(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.ypw <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.emc.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.emc.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.ypw), Integer.valueOf(this.emc.size()));
    }

    public synchronized void emc(K k10, V v10) {
        if (this.ypw <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.emc.put(k10, new SoftReference<>(v10));
        int size = this.emc.size();
        int i10 = this.ypw;
        if (size > i10) {
            emc((int) (i10 * 0.7d));
        }
    }

    public synchronized void emc(int i10) {
        int size = this.emc.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.emc.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
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
