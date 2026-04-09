package x;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements ok.e, Set, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f36900a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f36901b;

    public h0(f0 f0Var) {
        this.f36900a = f0Var;
        this.f36901b = f0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f36901b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        nk.k.e(collection, "elements");
        f0 f0Var = this.f36901b;
        int i4 = f0Var.f36885d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0Var.j(it.next());
        }
        return i4 != f0Var.f36885d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f36901b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f36900a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        nk.k.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f36900a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return nk.k.a(this.f36900a, ((h0) obj).f36900a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f36900a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f36900a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a1.d(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f36901b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        nk.k.e(collection, "elements");
        f0 f0Var = this.f36901b;
        f0Var.getClass();
        int i4 = f0Var.f36885d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0Var.i(it.next());
        }
        return i4 != f0Var.f36885d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z3;
        nk.k.e(collection, "elements");
        f0 f0Var = this.f36901b;
        f0Var.getClass();
        Object[] objArr = f0Var.f36883b;
        int i4 = f0Var.f36885d;
        long[] jArr = f0Var.f36882a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!zj.n.Z(collection, objArr[i13])) {
                                f0Var.m(i13);
                            }
                        }
                        j >>= 8;
                    }
                    z3 = false;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    z3 = false;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        } else {
            z3 = false;
        }
        if (i4 != f0Var.f36885d) {
            return true;
        }
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f36900a.f36885d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nk.j.a(this);
    }

    public final String toString() {
        return this.f36900a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        nk.k.e(objArr, "array");
        return nk.j.b(this, objArr);
    }
}
