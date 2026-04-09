package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* loaded from: classes3.dex */
final class fo1<E> extends xj0<E> {

    /* renamed from: g, reason: collision with root package name */
    static final xj0<Object> f27413g = new fo1(0, new Object[0]);

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f27414e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f27415f;

    public fo1(int i, Object[] objArr) {
        this.f27414e = objArr;
        this.f27415f = i;
    }

    @Override // com.yandex.mobile.ads.impl.xj0, com.yandex.mobile.ads.impl.vj0
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.f27414e, 0, objArr, i, this.f27415f);
        return i + this.f27415f;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final Object[] c() {
        return this.f27414e;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int d() {
        return this.f27415f;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        pj1.a(i, this.f27415f);
        E e4 = (E) this.f27414e[i];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27415f;
    }
}
