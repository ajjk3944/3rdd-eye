package nq;

import br.l;
import com.google.android.gms.internal.measurement.b4;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends mq.f implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f18492a;

    /* renamed from: d, reason: collision with root package name */
    public final int f18493d;

    /* renamed from: g, reason: collision with root package name */
    public int f18494g;

    /* renamed from: r, reason: collision with root package name */
    public final b f18495r;

    /* renamed from: x, reason: collision with root package name */
    public final c f18496x;

    public b(Object[] objArr, int i10, int i11, b bVar, c cVar) {
        l.e(objArr, "backing");
        l.e(cVar, "root");
        this.f18492a = objArr;
        this.f18493d = i10;
        this.f18494g = i11;
        this.f18495r = bVar;
        this.f18496x = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // mq.f
    public final int a() {
        g();
        return this.f18494g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        g();
        e(this.f18493d + this.f18494g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        j();
        g();
        int size = collection.size();
        d(this.f18493d + this.f18494g, collection, size);
        return size > 0;
    }

    @Override // mq.f
    public final Object b(int i10) {
        j();
        g();
        int i11 = this.f18494g;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return k(this.f18493d + i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        g();
        l(this.f18493d, this.f18494g);
    }

    public final void d(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        c cVar = this.f18496x;
        b bVar = this.f18495r;
        if (bVar != null) {
            bVar.d(i10, collection, i11);
        } else {
            c cVar2 = c.f18497r;
            cVar.d(i10, collection, i11);
        }
        this.f18492a = cVar.f18498a;
        this.f18494g += i11;
    }

    public final void e(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f18496x;
        b bVar = this.f18495r;
        if (bVar != null) {
            bVar.e(i10, obj);
        } else {
            c cVar2 = c.f18497r;
            cVar.e(i10, obj);
        }
        this.f18492a = cVar.f18498a;
        this.f18494g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f18492a;
            int i10 = this.f18494g;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.a(objArr[this.f18493d + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (((AbstractList) this.f18496x).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g();
        int i11 = this.f18494g;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return this.f18492a[this.f18493d + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f18492a;
        int i10 = this.f18494g;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f18493d + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f18494g; i10++) {
            if (l.a(this.f18492a[this.f18493d + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f18494g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f18496x.f18500g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object k(int i10) {
        Object objK;
        ((AbstractList) this).modCount++;
        b bVar = this.f18495r;
        if (bVar != null) {
            objK = bVar.k(i10);
        } else {
            c cVar = c.f18497r;
            objK = this.f18496x.k(i10);
        }
        this.f18494g--;
        return objK;
    }

    public final void l(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f18495r;
        if (bVar != null) {
            bVar.l(i10, i11);
        } else {
            c cVar = c.f18497r;
            this.f18496x.l(i10, i11);
        }
        this.f18494g -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i10 = this.f18494g - 1; i10 >= 0; i10--) {
            if (l.a(this.f18492a[this.f18493d + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m(int i10, int i11, Collection collection, boolean z10) {
        int iM;
        b bVar = this.f18495r;
        if (bVar != null) {
            iM = bVar.m(i10, i11, collection, z10);
        } else {
            c cVar = c.f18497r;
            iM = this.f18496x.m(i10, i11, collection, z10);
        }
        if (iM > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f18494g -= iM;
        return iM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        j();
        g();
        return m(this.f18493d, this.f18494g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        j();
        g();
        return m(this.f18493d, this.f18494g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        j();
        g();
        int i11 = this.f18494g;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f18492a;
        int i12 = this.f18493d;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        b4.h(i10, i11, this.f18494g);
        return new b(this.f18492a, this.f18493d + i10, i11 - i10, this, this.f18496x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        g();
        int length = objArr.length;
        int i10 = this.f18494g;
        int i11 = this.f18493d;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f18492a, i11, i10 + i11, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        mq.l.c0(0, i11, i10 + i11, this.f18492a, objArr);
        int i12 = this.f18494g;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return xu.l.b(this.f18492a, this.f18493d, this.f18494g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g();
        int i11 = this.f18494g;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        j();
        g();
        int i11 = this.f18494g;
        if (i10 >= 0 && i10 <= i11) {
            e(this.f18493d + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.e(collection, "elements");
        j();
        g();
        int i11 = this.f18494g;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            d(this.f18493d + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f18492a;
        int i10 = this.f18494g;
        int i11 = this.f18493d;
        return mq.l.h0(objArr, i11, i10 + i11);
    }
}
