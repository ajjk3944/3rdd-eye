package e5;

import d5.AbstractC2277e;
import d5.AbstractC2281i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2307c extends AbstractC2277e implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C2307c f19951d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19952a;

    /* renamed from: b, reason: collision with root package name */
    public int f19953b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19954c;

    static {
        C2307c c2307c = new C2307c(0);
        c2307c.f19954c = true;
        f19951d = c2307c;
    }

    public C2307c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f19952a = new Object[i];
    }

    @Override // d5.AbstractC2277e
    public final int a() {
        return this.f19953b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f19953b;
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f19952a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        q5.i.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f19953b, collection, size);
        return size > 0;
    }

    @Override // d5.AbstractC2277e
    public final Object b(int i) {
        f();
        int i3 = this.f19953b;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return h(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f19953b);
    }

    public final void d(int i, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        g(i, i3);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i3; i6++) {
            this.f19952a[i + i6] = it.next();
        }
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f19952a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f19952a;
            int i = this.f19953b;
            if (i == list.size()) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (q5.i.a(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f19954c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i3) {
        int i6 = this.f19953b + i3;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f19952a;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i7);
            q5.i.d(objArrCopyOf, "copyOf(...)");
            this.f19952a = objArrCopyOf;
        }
        Object[] objArr2 = this.f19952a;
        AbstractC2281i.S(i + i3, i, this.f19953b, objArr2, objArr2);
        this.f19953b += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i3 = this.f19953b;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return this.f19952a[i];
    }

    public final Object h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f19952a;
        Object obj = objArr[i];
        AbstractC2281i.S(i, i + 1, this.f19953b, objArr, objArr);
        Object[] objArr2 = this.f19952a;
        int i3 = this.f19953b - 1;
        q5.i.e(objArr2, "<this>");
        objArr2[i3] = null;
        this.f19953b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f19952a;
        int i = this.f19953b;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f19952a;
        AbstractC2281i.S(i, i + i3, this.f19953b, objArr, objArr);
        Object[] objArr2 = this.f19952a;
        int i6 = this.f19953b;
        I5.b.w(objArr2, i6 - i3, i6);
        this.f19953b -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f19953b; i++) {
            if (q5.i.a(this.f19952a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f19953b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i3, Collection collection, boolean z6) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = i + i6;
            if (collection.contains(this.f19952a[i8]) == z6) {
                Object[] objArr = this.f19952a;
                i6++;
                objArr[i7 + i] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i3 - i7;
        Object[] objArr2 = this.f19952a;
        AbstractC2281i.S(i + i7, i3 + i, this.f19953b, objArr2, objArr2);
        Object[] objArr3 = this.f19952a;
        int i10 = this.f19953b;
        I5.b.w(objArr3, i10 - i9, i10);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f19953b -= i9;
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f19953b - 1; i >= 0; i--) {
            if (q5.i.a(this.f19952a[i], obj)) {
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
        f();
        return j(0, this.f19953b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        q5.i.e(collection, "elements");
        f();
        return j(0, this.f19953b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        int i3 = this.f19953b;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        Object[] objArr = this.f19952a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i3) {
        T2.g.c(i, i3, this.f19953b);
        return new C2306b(this.f19952a, i, i3 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        q5.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f19953b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19952a, 0, i, objArr.getClass());
            q5.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC2281i.S(0, 0, i, this.f19952a, objArr);
        int i3 = this.f19953b;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return I5.b.b(this.f19952a, 0, this.f19953b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i3 = this.f19953b;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return new C2305a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        q5.i.e(collection, "elements");
        f();
        int i3 = this.f19953b;
        if (i >= 0 && i <= i3) {
            int size = collection.size();
            d(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        int i3 = this.f19953b;
        if (i >= 0 && i <= i3) {
            ((AbstractList) this).modCount++;
            g(i, 1);
            this.f19952a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC2281i.U(this.f19952a, 0, this.f19953b);
    }
}
