package Yg;

import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class F implements Collection, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f24988a;

    private static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final long[] f24989a;

        /* renamed from: b, reason: collision with root package name */
        private int f24990b;

        public a(long[] array) {
            AbstractC6492s.i(array, "array");
            this.f24989a = array;
        }

        public long d() {
            int i10 = this.f24990b;
            long[] jArr = this.f24989a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f24990b));
            }
            this.f24990b = i10 + 1;
            return E.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24990b < this.f24989a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return E.a(d());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ F(long[] jArr) {
        this.f24988a = jArr;
    }

    public static final /* synthetic */ F b(long[] jArr) {
        return new F(jArr);
    }

    public static long[] e(int i10) {
        return f(new long[i10]);
    }

    public static long[] f(long[] storage) {
        AbstractC6492s.i(storage, "storage");
        return storage;
    }

    public static boolean i(long[] jArr, long j10) {
        return AbstractC3682n.T(jArr, j10);
    }

    public static boolean j(long[] jArr, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof E) || !AbstractC3682n.T(jArr, ((E) obj).j())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof F) && AbstractC6492s.d(jArr, ((F) obj).A());
    }

    public static final long q(long[] jArr, int i10) {
        return E.b(jArr[i10]);
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
        return this.f24988a;
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
        if (obj instanceof E) {
            return g(((E) obj).j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        return j(this.f24988a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f24988a, obj);
    }

    public boolean g(long j10) {
        return i(this.f24988a, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f24988a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f24988a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f24988a);
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
        return u(this.f24988a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return z(this.f24988a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        return AbstractC6484j.b(this, array);
    }
}
