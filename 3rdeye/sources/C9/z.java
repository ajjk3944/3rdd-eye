package c9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MapWithDefault.kt */
/* loaded from: classes3.dex */
public final class z<K, V> implements InterfaceC2104y<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public final Map<K, V> f18587b;

    /* renamed from: c, reason: collision with root package name */
    public final p9.l<K, V> f18588c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Map<K, ? extends V> map, p9.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l.f(lVar, "default");
        this.f18587b = map;
        this.f18588c = lVar;
    }

    @Override // c9.InterfaceC2104y
    public final V b(K k10) {
        Map<K, V> map = this.f18587b;
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : this.f18588c.invoke(k10);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f18587b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f18587b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f18587b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f18587b.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f18587b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f18587b.hashCode();
    }

    @Override // c9.InterfaceC2104y
    public final Map<K, V> i() {
        return this.f18587b;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18587b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f18587b.keySet();
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18587b.size();
    }

    public final String toString() {
        return this.f18587b.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f18587b.values();
    }
}
