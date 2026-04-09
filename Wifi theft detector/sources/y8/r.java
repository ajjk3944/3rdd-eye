package y8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class r implements Collection, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f25196a;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final short[] f25197a;

        /* renamed from: b, reason: collision with root package name */
        public int f25198b;

        public a(short[] array) {
            kotlin.jvm.internal.p.e(array, "array");
            this.f25197a = array;
        }

        public short a() {
            int i10 = this.f25198b;
            short[] sArr = this.f25197a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f25198b));
            }
            this.f25198b = i10 + 1;
            return q.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25198b < this.f25197a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return q.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ r(short[] sArr) {
        this.f25196a = sArr;
    }

    public static final /* synthetic */ r c(short[] sArr) {
        return new r(sArr);
    }

    public static short[] d(int i10) {
        return e(new short[i10]);
    }

    public static short[] e(short[] storage) {
        kotlin.jvm.internal.p.e(storage, "storage");
        return storage;
    }

    public static boolean g(short[] sArr, short s10) {
        return z8.o.x(sArr, s10);
    }

    public static boolean h(short[] sArr, Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof q) || !z8.o.x(sArr, ((q) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(short[] sArr, Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.p.a(sArr, ((r) obj).A());
    }

    public static final short j(short[] sArr, int i10) {
        return q.b(sArr[i10]);
    }

    public static int u(short[] sArr) {
        return sArr.length;
    }

    public static int v(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean w(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator x(short[] sArr) {
        return new a(sArr);
    }

    public static final void y(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String z(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public final /* synthetic */ short[] A() {
        return this.f25196a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q) {
            return f(((q) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return h(this.f25196a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f25196a, obj);
    }

    public boolean f(short s10) {
        return g(this.f25196a, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f25196a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f25196a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f25196a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int size() {
        return u(this.f25196a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public String toString() {
        return z(this.f25196a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
