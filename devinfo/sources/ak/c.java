package ak;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nk.k;
import t6.i0;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends zj.g implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f435d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f436a;

    /* renamed from: b, reason: collision with root package name */
    public int f437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f438c;

    static {
        c cVar = new c(0);
        cVar.f438c = true;
        f435d = cVar;
    }

    public c(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f436a = new Object[i4];
    }

    @Override // zj.g
    public final int a() {
        return this.f437b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i4 = this.f437b;
        ((AbstractList) this).modCount++;
        j(i4, 1);
        this.f436a[i4] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.e(collection, "elements");
        i();
        int size = collection.size();
        f(this.f437b, collection, size);
        return size > 0;
    }

    @Override // zj.g
    public final Object c(int i4) {
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.a(i4, i10);
        return k(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        l(0, this.f437b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f436a;
            int i4 = this.f437b;
            if (i4 == list.size()) {
                for (int i10 = 0; i10 < i4; i10++) {
                    if (k.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i4, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        j(i4, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f436a[i4 + i11] = it.next();
        }
    }

    public final void g(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        j(i4, 1);
        this.f436a[i4] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.a(i4, i10);
        return this.f436a[i4];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f436a;
        int i4 = this.f437b;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.f438c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.f437b; i4++) {
            if (k.a(this.f436a[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f437b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i4, int i10) {
        int i11 = this.f437b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f436a;
        if (i11 > objArr.length) {
            zj.b bVar = zj.e.Companion;
            int length = objArr.length;
            bVar.getClass();
            int iD = zj.b.d(length, i11);
            Object[] objArr2 = this.f436a;
            k.e(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iD);
            k.d(objArrCopyOf, "copyOf(...)");
            this.f436a = objArrCopyOf;
        }
        Object[] objArr3 = this.f436a;
        m.N(i4 + i10, i4, this.f437b, objArr3, objArr3);
        this.f437b += i10;
    }

    public final Object k(int i4) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f436a;
        Object obj = objArr[i4];
        m.N(i4, i4 + 1, this.f437b, objArr, objArr);
        Object[] objArr2 = this.f436a;
        int i10 = this.f437b - 1;
        k.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f437b--;
        return obj;
    }

    public final void l(int i4, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f436a;
        m.N(i4, i4 + i10, this.f437b, objArr, objArr);
        Object[] objArr2 = this.f436a;
        int i11 = this.f437b;
        i0.u(objArr2, i11 - i10, i11);
        this.f437b -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i4 = this.f437b - 1; i4 >= 0; i4--) {
            if (k.a(this.f436a[i4], obj)) {
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
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i4 + i11;
            if (collection.contains(this.f436a[i13]) == z3) {
                Object[] objArr = this.f436a;
                i11++;
                objArr[i12 + i4] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f436a;
        m.N(i4 + i12, i10 + i4, this.f437b, objArr2, objArr2);
        Object[] objArr3 = this.f436a;
        int i15 = this.f437b;
        i0.u(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f437b -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        i();
        return m(0, this.f437b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.e(collection, "elements");
        i();
        return m(0, this.f437b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.a(i4, i10);
        Object[] objArr = this.f436a;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i10) {
        zj.b bVar = zj.e.Companion;
        int i11 = this.f437b;
        bVar.getClass();
        zj.b.c(i4, i10, i11);
        return new b(this.f436a, i4, i10 - i4, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f437b;
        if (length < i4) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f436a, 0, i4, objArr.getClass());
            k.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        m.N(0, 0, i4, this.f436a, objArr);
        int i10 = this.f437b;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return i0.a(this.f436a, 0, this.f437b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.b(i4, i10);
        return new a(this, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        k.e(collection, "elements");
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.b(i4, i10);
        int size = collection.size();
        f(i4, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        i();
        zj.b bVar = zj.e.Companion;
        int i10 = this.f437b;
        bVar.getClass();
        zj.b.b(i4, i10);
        ((AbstractList) this).modCount++;
        j(i4, 1);
        this.f436a[i4] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return m.T(this.f436a, 0, this.f437b);
    }
}
