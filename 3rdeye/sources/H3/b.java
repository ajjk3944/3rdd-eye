package h3;

import m0.C5308a;
import m0.C5316i;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends C5308a<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public int f38196h;

    @Override // m0.C5316i, java.util.Map
    public final void clear() {
        this.f38196h = 0;
        super.clear();
    }

    @Override // m0.C5316i
    public final void h(C5316i<? extends K, ? extends V> c5316i) {
        this.f38196h = 0;
        super.h(c5316i);
    }

    @Override // m0.C5316i, java.util.Map
    public final int hashCode() {
        if (this.f38196h == 0) {
            this.f38196h = super.hashCode();
        }
        return this.f38196h;
    }

    @Override // m0.C5316i
    public final V j(int i) {
        this.f38196h = 0;
        return (V) super.j(i);
    }

    @Override // m0.C5316i
    public final V k(int i, V v10) {
        this.f38196h = 0;
        return (V) super.k(i, v10);
    }

    @Override // m0.C5316i, java.util.Map
    public final V put(K k10, V v10) {
        this.f38196h = 0;
        return (V) super.put(k10, v10);
    }
}
