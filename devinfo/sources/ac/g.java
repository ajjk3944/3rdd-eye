package ac;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final g f314e = new g(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f315c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f316d;

    public g(Object[] objArr, int i4) {
        this.f315c = objArr;
        this.f316d = i4;
    }

    @Override // ac.b
    public final Object[] a() {
        return this.f315c;
    }

    @Override // ac.b
    public final int c() {
        return 0;
    }

    @Override // ac.b
    public final int d() {
        return this.f316d;
    }

    @Override // ac.f, ac.b
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f315c;
        int i4 = this.f316d;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        jm.a.D(i4, this.f316d);
        Object obj = this.f315c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f316d;
    }
}
