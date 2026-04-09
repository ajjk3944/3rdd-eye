package nq;

import br.l;
import com.google.android.gms.internal.measurement.b4;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends mq.f implements RandomAccess, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final c f18497r;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f18498a;

    /* renamed from: d, reason: collision with root package name */
    public int f18499d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18500g;

    static {
        c cVar = new c(0);
        cVar.f18500g = true;
        f18497r = cVar;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f18498a = new Object[i10];
    }

    @Override // mq.f
    public final int a() {
        return this.f18499d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i10 = this.f18499d;
        ((AbstractList) this).modCount++;
        j(i10, 1);
        this.f18498a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        g();
        int size = collection.size();
        d(this.f18499d, collection, size);
        return size > 0;
    }

    @Override // mq.f
    public final Object b(int i10) {
        g();
        int i11 = this.f18499d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return k(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        l(0, this.f18499d);
    }

    public final void d(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        j(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f18498a[i10 + i12] = it.next();
        }
    }

    public final void e(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        j(i10, 1);
        this.f18498a[i10] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f18498a;
            int i10 = this.f18499d;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (this.f18500g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f18499d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return this.f18498a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f18498a;
        int i10 = this.f18499d;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f18499d; i10++) {
            if (l.a(this.f18498a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f18499d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i10, int i11) {
        int i12 = this.f18499d + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f18498a;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            l.d(objArrCopyOf, "copyOf(...)");
            this.f18498a = objArrCopyOf;
        }
        Object[] objArr2 = this.f18498a;
        mq.l.c0(i10 + i11, i10, this.f18499d, objArr2, objArr2);
        this.f18499d += i11;
    }

    public final Object k(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f18498a;
        Object obj = objArr[i10];
        mq.l.c0(i10, i10 + 1, this.f18499d, objArr, objArr);
        Object[] objArr2 = this.f18498a;
        int i11 = this.f18499d - 1;
        l.e(objArr2, "<this>");
        objArr2[i11] = null;
        this.f18499d--;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f18498a;
        mq.l.c0(i10, i10 + i11, this.f18499d, objArr, objArr);
        Object[] objArr2 = this.f18498a;
        int i12 = this.f18499d;
        xu.l.Q(objArr2, i12 - i11, i12);
        this.f18499d -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f18499d - 1; i10 >= 0; i10--) {
            if (l.a(this.f18498a[i10], obj)) {
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
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f18498a[i14]) == z10) {
                Object[] objArr = this.f18498a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f18498a;
        mq.l.c0(i10 + i13, i11 + i10, this.f18499d, objArr2, objArr2);
        Object[] objArr3 = this.f18498a;
        int i16 = this.f18499d;
        xu.l.Q(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f18499d -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return m(0, this.f18499d, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        g();
        return m(0, this.f18499d, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g();
        int i11 = this.f18499d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f18498a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        b4.h(i10, i11, this.f18499d);
        return new b(this.f18498a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f18499d;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f18498a, 0, i10, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        mq.l.c0(0, 0, i10, this.f18498a, objArr);
        int i11 = this.f18499d;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return xu.l.b(this.f18498a, 0, this.f18499d, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f18499d;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.e(collection, "elements");
        g();
        int i11 = this.f18499d;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            d(i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g();
        int i11 = this.f18499d;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            j(i10, 1);
            this.f18498a[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return mq.l.h0(this.f18498a, 0, this.f18499d);
    }
}
