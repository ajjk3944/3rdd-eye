package y8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class m implements Collection, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f25185a;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f25186a;

        /* renamed from: b, reason: collision with root package name */
        public int f25187b;

        public a(int[] array) {
            kotlin.jvm.internal.p.e(array, "array");
            this.f25186a = array;
        }

        public int a() {
            int i10 = this.f25187b;
            int[] iArr = this.f25186a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f25187b));
            }
            this.f25187b = i10 + 1;
            return l.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25187b < this.f25186a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return l.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ m(int[] iArr) {
        this.f25185a = iArr;
    }

    public static final /* synthetic */ m c(int[] iArr) {
        return new m(iArr);
    }

    public static int[] d(int i10) {
        return e(new int[i10]);
    }

    public static int[] e(int[] storage) {
        kotlin.jvm.internal.p.e(storage, "storage");
        return storage;
    }

    public static boolean g(int[] iArr, int i10) {
        return z8.o.u(iArr, i10);
    }

    public static boolean h(int[] iArr, Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof l) || !z8.o.u(iArr, ((l) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(int[] iArr, Object obj) {
        return (obj instanceof m) && kotlin.jvm.internal.p.a(iArr, ((m) obj).A());
    }

    public static final int j(int[] iArr, int i10) {
        return l.b(iArr[i10]);
    }

    public static int u(int[] iArr) {
        return iArr.length;
    }

    public static int v(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean w(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator x(int[] iArr) {
        return new a(iArr);
    }

    public static final void y(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String z(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public final /* synthetic */ int[] A() {
        return this.f25185a;
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
        if (obj instanceof l) {
            return f(((l) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return h(this.f25185a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f25185a, obj);
    }

    public boolean f(int i10) {
        return g(this.f25185a, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f25185a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f25185a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f25185a);
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
        return u(this.f25185a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public String toString() {
        return z(this.f25185a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
