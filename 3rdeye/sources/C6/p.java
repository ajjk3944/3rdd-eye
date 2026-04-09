package C6;

import b9.C1992A;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: SynchronizedWeakHashMap.kt */
/* loaded from: classes.dex */
public final class p<K, N> extends WeakHashMap<K, N> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f958b = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        synchronized (this.f958b) {
            super.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, N>> entrySet() {
        Set<Map.Entry<K, N>> setEntrySet;
        synchronized (this.f958b) {
            setEntrySet = super.entrySet();
        }
        kotlin.jvm.internal.l.e(setEntrySet, "synchronized(lock) { super.entries }");
        return setEntrySet;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final N get(Object obj) {
        N n9;
        synchronized (this.f958b) {
            n9 = (N) super.get(obj);
        }
        return n9;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> setKeySet;
        synchronized (this.f958b) {
            setKeySet = super.keySet();
        }
        kotlin.jvm.internal.l.e(setKeySet, "synchronized(lock) { super.keys }");
        return setKeySet;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final N put(K key, N value) {
        N n9;
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(value, "value");
        synchronized (this.f958b) {
            n9 = (N) super.put(key, value);
        }
        return n9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends N> from) {
        kotlin.jvm.internal.l.f(from, "from");
        synchronized (this.f958b) {
            super.putAll(from);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final N remove(Object obj) {
        N n9;
        synchronized (this.f958b) {
            n9 = (N) super.remove(obj);
        }
        return n9;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Collection<N> values() {
        Collection<N> collectionValues;
        synchronized (this.f958b) {
            collectionValues = super.values();
        }
        kotlin.jvm.internal.l.e(collectionValues, "synchronized(lock) { super.values }");
        return collectionValues;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.f958b) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }
}
