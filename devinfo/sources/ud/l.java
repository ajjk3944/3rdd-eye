package ud;

import j$.util.Objects;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends d {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f35315c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f35316d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f35317e;

    public l(Object[] objArr, int i4, int i10) {
        this.f35315c = objArr;
        this.f35316d = i4;
        this.f35317e = i10;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t.e(i4, this.f35317e);
        Object obj = this.f35315c[(i4 * 2) + this.f35316d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35317e;
    }
}
