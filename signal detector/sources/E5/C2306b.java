package e5;

import d5.AbstractC2277e;
import d5.AbstractC2281i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2306b extends AbstractC2277e implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19947b;

    /* renamed from: c, reason: collision with root package name */
    public int f19948c;

    /* renamed from: d, reason: collision with root package name */
    public final C2306b f19949d;

    /* renamed from: e, reason: collision with root package name */
    public final C2307c f19950e;

    public C2306b(Object[] objArr, int i, int i3, C2306b c2306b, C2307c c2307c) {
        q5.i.e(objArr, "backing");
        q5.i.e(c2307c, "root");
        this.f19946a = objArr;
        this.f19947b = i;
        this.f19948c = i3;
        this.f19949d = c2306b;
        this.f19950e = c2307c;
        ((AbstractList) this).modCount = ((AbstractList) c2307c).modCount;
    }

    @Override // d5.AbstractC2277e
    public final int a() {
        f();
        return this.f19948c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f19947b + this.f19948c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        q5.i.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f19947b + this.f19948c, collection, size);
        return size > 0;
    }

    @Override // d5.AbstractC2277e
    public final Object b(int i) {
        g();
        f();
        int i3 = this.f19948c;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return h(this.f19947b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f19947b, this.f19948c);
    }

    public final void d(int i, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        C2307c c2307c = this.f19950e;
        C2306b c2306b = this.f19949d;
        if (c2306b != null) {
            c2306b.d(i, collection, i3);
        } else {
            C2307c c2307c2 = C2307c.f19951d;
            c2307c.d(i, collection, i3);
        }
        this.f19946a = c2307c.f19952a;
        this.f19948c += i3;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C2307c c2307c = this.f19950e;
        C2306b c2306b = this.f19949d;
        if (c2306b != null) {
            c2306b.e(i, obj);
        } else {
            C2307c c2307c2 = C2307c.f19951d;
            c2307c.e(i, obj);
        }
        this.f19946a = c2307c.f19952a;
        this.f19948c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f19946a;
            int i = this.f19948c;
            if (i == list.size()) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (q5.i.a(objArr[this.f19947b + i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.f19950e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f19950e.f19954c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i3 = this.f19948c;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return this.f19946a[this.f19947b + i];
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        C2306b c2306b = this.f19949d;
        if (c2306b != null) {
            objH = c2306b.h(i);
        } else {
            C2307c c2307c = C2307c.f19951d;
            objH = this.f19950e.h(i);
        }
        this.f19948c--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f19946a;
        int i = this.f19948c;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f19947b + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        C2306b c2306b = this.f19949d;
        if (c2306b != null) {
            c2306b.i(i, i3);
        } else {
            C2307c c2307c = C2307c.f19951d;
            this.f19950e.i(i, i3);
        }
        this.f19948c -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f19948c; i++) {
            if (q5.i.a(this.f19946a[this.f19947b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f19948c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i3, Collection collection, boolean z6) {
        int iJ;
        C2306b c2306b = this.f19949d;
        if (c2306b != null) {
            iJ = c2306b.j(i, i3, collection, z6);
        } else {
            C2307c c2307c = C2307c.f19951d;
            iJ = this.f19950e.j(i, i3, collection, z6);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f19948c -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f19948c - 1; i >= 0; i--) {
            if (q5.i.a(this.f19946a[this.f19947b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        q5.i.e(collection, "elements");
        g();
        f();
        return j(this.f19947b, this.f19948c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        q5.i.e(collection, "elements");
        g();
        f();
        return j(this.f19947b, this.f19948c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i3 = this.f19948c;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        Object[] objArr = this.f19946a;
        int i6 = this.f19947b;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i3) {
        T2.g.c(i, i3, this.f19948c);
        return new C2306b(this.f19946a, this.f19947b + i, i3 - i, this, this.f19950e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        q5.i.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f19948c;
        int i3 = this.f19947b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19946a, i3, i + i3, objArr.getClass());
            q5.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC2281i.S(0, i3, i + i3, this.f19946a, objArr);
        int i6 = this.f19948c;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return I5.b.b(this.f19946a, this.f19947b, this.f19948c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i3 = this.f19948c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return new C2305a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i3 = this.f19948c;
        if (i >= 0 && i <= i3) {
            e(this.f19947b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        q5.i.e(collection, "elements");
        g();
        f();
        int i3 = this.f19948c;
        if (i >= 0 && i <= i3) {
            int size = collection.size();
            d(this.f19947b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f19946a;
        int i = this.f19948c;
        int i3 = this.f19947b;
        return AbstractC2281i.U(objArr, i3, i + i3);
    }
}
