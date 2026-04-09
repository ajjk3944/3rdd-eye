package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class ho1<E> extends zj0<E> {
    private static final Object[] i = null;

    /* renamed from: j, reason: collision with root package name */
    static final ho1<Object> f28311j;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f28312d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f28313e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f28314f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f28315g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f28316h;

    static {
        Object[] objArr = new Object[0];
        f28311j = new ho1<>(objArr, 0, objArr, 0, 0);
    }

    public ho1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f28312d = objArr;
        this.f28313e = i10;
        this.f28314f = objArr2;
        this.f28315g = i11;
        this.f28316h = i12;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f28312d, 0, objArr, i10, this.f28316h);
        return i10 + this.f28316h;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final Object[] c() {
        return this.f28312d;
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f28314f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = df0.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f28315g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int d() {
        return this.f28316h;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zj0
    public final xj0<E> g() {
        return xj0.b(this.f28316h, this.f28312d);
    }

    @Override // com.yandex.mobile.ads.impl.zj0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f28313e;
    }

    @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final v72<E> iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28316h;
    }
}
