package y8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class o implements Collection, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f25190a;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f25191a;

        /* renamed from: b, reason: collision with root package name */
        public int f25192b;

        public a(long[] array) {
            kotlin.jvm.internal.p.e(array, "array");
            this.f25191a = array;
        }

        public long a() {
            int i10 = this.f25192b;
            long[] jArr = this.f25191a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f25192b));
            }
            this.f25192b = i10 + 1;
            return n.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25192b < this.f25191a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return n.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ o(long[] jArr) {
        this.f25190a = jArr;
    }

    public static final /* synthetic */ o c(long[] jArr) {
        return new o(jArr);
    }

    public static long[] d(int i10) {
        return e(new long[i10]);
    }

    public static long[] e(long[] storage) {
        kotlin.jvm.internal.p.e(storage, "storage");
        return storage;
    }

    public static boolean g(long[] jArr, long j10) {
        return z8.o.v(jArr, j10);
    }

    public static boolean h(long[] jArr, Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof n) || !z8.o.v(jArr, ((n) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(long[] jArr, Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.p.a(jArr, ((o) obj).A());
    }

    public static final long j(long[] jArr, int i10) {
        return n.b(jArr[i10]);
    }

    public static int u(long[] jArr) {
        return jArr.length;
    }

    public static int v(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean w(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator x(long[] jArr) {
        return new a(jArr);
    }

    public static final void y(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String z(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public final /* synthetic */ long[] A() {
        return this.f25190a;
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
        if (obj instanceof n) {
            return f(((n) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return h(this.f25190a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f25190a, obj);
    }

    public boolean f(long j10) {
        return g(this.f25190a, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f25190a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f25190a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f25190a);
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
        return u(this.f25190a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public String toString() {
        return z(this.f25190a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
