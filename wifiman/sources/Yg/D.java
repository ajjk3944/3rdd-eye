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
public final class D implements Collection, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f24983a;

    private static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f24984a;

        /* renamed from: b, reason: collision with root package name */
        private int f24985b;

        public a(int[] array) {
            AbstractC6492s.i(array, "array");
            this.f24984a = array;
        }

        public int d() {
            int i10 = this.f24985b;
            int[] iArr = this.f24984a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f24985b));
            }
            this.f24985b = i10 + 1;
            return C.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24985b < this.f24984a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C.a(d());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ D(int[] iArr) {
        this.f24983a = iArr;
    }

    public static final /* synthetic */ D b(int[] iArr) {
        return new D(iArr);
    }

    public static int[] e(int i10) {
        return f(new int[i10]);
    }

    public static int[] f(int[] storage) {
        AbstractC6492s.i(storage, "storage");
        return storage;
    }

    public static boolean i(int[] iArr, int i10) {
        return AbstractC3682n.S(iArr, i10);
    }

    public static boolean j(int[] iArr, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C) || !AbstractC3682n.S(iArr, ((C) obj).h())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof D) && AbstractC6492s.d(iArr, ((D) obj).A());
    }

    public static final int q(int[] iArr, int i10) {
        return C.b(iArr[i10]);
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
        return this.f24983a;
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
        if (obj instanceof C) {
            return g(((C) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        return j(this.f24983a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f24983a, obj);
    }

    public boolean g(int i10) {
        return i(this.f24983a, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f24983a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f24983a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f24983a);
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
        return u(this.f24983a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return z(this.f24983a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        return AbstractC6484j.b(this, array);
    }
}
