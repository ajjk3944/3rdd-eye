package com.bytedance.sdk.component.fkw.yu.lh.ouw;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> ouw = new LinkedHashMap<>(0, 0.75f, true);
    private int vt;

    public lh(int i4) {
        this.vt = i4;
    }

    public final synchronized V ouw(K k2) {
        V v10 = null;
        if (k2 == null) {
            return null;
        }
        if (this.vt <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.ouw.get(k2);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.ouw.remove(k2);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.vt), Integer.valueOf(this.ouw.size()));
    }

    public final synchronized void ouw(K k2, V v10) {
        if (this.vt <= 0) {
            return;
        }
        if (k2 == null || v10 == null) {
            return;
        }
        this.ouw.put(k2, new SoftReference<>(v10));
        int size = this.ouw.size();
        int i4 = this.vt;
        if (size > i4) {
            ouw((int) (i4 * 0.7d));
        }
    }

    private synchronized void ouw(int i4) {
        int size = this.ouw.size() - i4;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.ouw.entrySet().iterator();
            for (int i10 = 0; i10 < size; i10++) {
                it.next();
                it.remove();
            }
        }
        if (i4 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.ouw.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
