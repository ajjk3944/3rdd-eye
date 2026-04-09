package ud;

import j$.util.Objects;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final h f35306e = new h(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f35307c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f35308d;

    public h(Object[] objArr, int i4) {
        this.f35307c = objArr;
        this.f35308d = i4;
    }

    @Override // ud.d, ud.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f35307c;
        int i4 = this.f35308d;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // ud.a
    public final Object[] c() {
        return this.f35307c;
    }

    @Override // ud.a
    public final int d() {
        return this.f35308d;
    }

    @Override // ud.a
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t.e(i4, this.f35308d);
        Object obj = this.f35307c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35308d;
    }
}
