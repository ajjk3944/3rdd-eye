package ak;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nk.k;
import t6.i0;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends zj.g implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f431b;

    /* renamed from: c, reason: collision with root package name */
    public int f432c;

    /* renamed from: d, reason: collision with root package name */
    public final b f433d;

    /* renamed from: e, reason: collision with root package name */
    public final c f434e;

    public b(Object[] objArr, int i4, int i10, b bVar, c cVar) {
        k.e(objArr, "backing");
        k.e(cVar, "root");
        this.f430a = objArr;
        this.f431b = i4;
        this.f432c = i10;
        this.f433d = bVar;
        this.f434e = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // zj.g
    public final int a() {
        i();
        return this.f432c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        i();
        g(this.f431b + this.f432c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.e(collection, "elements");
        j();
        i();
        int size = collection.size();
        f(this.f431b + this.f432c, collection, size);
        return size > 0;
    }

    @Override // zj.g
    public final Object c(int i4) {
        j();
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.a(i4, i10);
        return k(this.f431b + i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i();
        l(this.f431b, this.f432c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f430a;
            int i4 = this.f432c;
            if (i4 == list.size()) {
                for (int i10 = 0; i10 < i4; i10++) {
                    if (k.a(objArr[this.f431b + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i4, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        c cVar = this.f434e;
        b bVar = this.f433d;
        if (bVar != null) {
            bVar.f(i4, collection, i10);
        } else {
            c cVar2 = c.f435d;
            cVar.f(i4, collection, i10);
        }
        this.f430a = cVar.f436a;
        this.f432c += i10;
    }

    public final void g(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f434e;
        b bVar = this.f433d;
        if (bVar != null) {
            bVar.g(i4, obj);
        } else {
            c cVar2 = c.f435d;
            cVar.g(i4, obj);
        }
        this.f430a = cVar.f436a;
        this.f432c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.a(i4, i10);
        return this.f430a[this.f431b + i4];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        Object[] objArr = this.f430a;
        int i4 = this.f432c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[this.f431b + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (((AbstractList) this.f434e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i4 = 0; i4 < this.f432c; i4++) {
            if (k.a(this.f430a[this.f431b + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        return this.f432c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f434e.f438c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object k(int i4) {
        Object objK;
        ((AbstractList) this).modCount++;
        b bVar = this.f433d;
        if (bVar != null) {
            objK = bVar.k(i4);
        } else {
            c cVar = c.f435d;
            objK = this.f434e.k(i4);
        }
        this.f432c--;
        return objK;
    }

    public final void l(int i4, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f433d;
        if (bVar != null) {
            bVar.l(i4, i10);
        } else {
            c cVar = c.f435d;
            this.f434e.l(i4, i10);
        }
        this.f432c -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i4 = this.f432c - 1; i4 >= 0; i4--) {
            if (k.a(this.f430a[this.f431b + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m(int i4, int i10, Collection collection, boolean z3) {
        int iM;
        b bVar = this.f433d;
        if (bVar != null) {
            iM = bVar.m(i4, i10, collection, z3);
        } else {
            c cVar = c.f435d;
            iM = this.f434e.m(i4, i10, collection, z3);
        }
        if (iM > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f432c -= iM;
        return iM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k.e(collection, "elements");
        j();
        i();
        return m(this.f431b, this.f432c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.e(collection, "elements");
        j();
        i();
        return m(this.f431b, this.f432c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        j();
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.a(i4, i10);
        Object[] objArr = this.f430a;
        int i11 = this.f431b + i4;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i10) {
        zj.b bVar = zj.e.Companion;
        int i11 = this.f432c;
        bVar.getClass();
        zj.b.c(i4, i10, i11);
        return new b(this.f430a, this.f431b + i4, i10 - i4, this, this.f434e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.e(objArr, "array");
        i();
        int length = objArr.length;
        int i4 = this.f432c;
        int i10 = this.f431b;
        if (length < i4) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f430a, i10, i4 + i10, objArr.getClass());
            k.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        m.N(0, i10, i4 + i10, this.f430a, objArr);
        int i11 = this.f432c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return i0.a(this.f430a, this.f431b, this.f432c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.b(i4, i10);
        return new a(this, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        j();
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.b(i4, i10);
        g(this.f431b + i4, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        k.e(collection, "elements");
        j();
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f432c;
        bVar.getClass();
        zj.b.b(i4, i10);
        int size = collection.size();
        f(this.f431b + i4, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.f430a;
        int i4 = this.f432c;
        int i10 = this.f431b;
        return m.T(objArr, i10, i4 + i10);
    }
}
