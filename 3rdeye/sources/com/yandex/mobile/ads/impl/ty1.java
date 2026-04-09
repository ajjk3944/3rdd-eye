package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class ty1<E> extends zj0<E> {

    /* renamed from: d, reason: collision with root package name */
    final transient E f33812d;

    public ty1(E e4) {
        this.f33812d = (E) pj1.a(e4);
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.f33812d;
        return i + 1;
    }

    @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0
    public final xj0<E> b() {
        return xj0.a(this.f33812d);
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33812d.equals(obj);
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zj0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33812d.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final v72<E> iterator() {
        return new yp0(this.f33812d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f33812d.toString() + ']';
    }
}
