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
public final class I implements Collection, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final short[] f24994a;

    private static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final short[] f24995a;

        /* renamed from: b, reason: collision with root package name */
        private int f24996b;

        public a(short[] array) {
            AbstractC6492s.i(array, "array");
            this.f24995a = array;
        }

        public short d() {
            int i10 = this.f24996b;
            short[] sArr = this.f24995a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f24996b));
            }
            this.f24996b = i10 + 1;
            return H.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24996b < this.f24995a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return H.a(d());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ I(short[] sArr) {
        this.f24994a = sArr;
    }

    public static final /* synthetic */ I b(short[] sArr) {
        return new I(sArr);
    }

    public static short[] e(int i10) {
        return f(new short[i10]);
    }

    public static short[] f(short[] storage) {
        AbstractC6492s.i(storage, "storage");
        return storage;
    }

    public static boolean i(short[] sArr, short s10) {
        return AbstractC3682n.V(sArr, s10);
    }

    public static boolean j(short[] sArr, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof H) || !AbstractC3682n.V(sArr, ((H) obj).h())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof I) && AbstractC6492s.d(sArr, ((I) obj).A());
    }

    public static final short q(short[] sArr, int i10) {
        return H.b(sArr[i10]);
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
        return this.f24994a;
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
        if (obj instanceof H) {
            return g(((H) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        return j(this.f24994a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f24994a, obj);
    }

    public boolean g(short s10) {
        return i(this.f24994a, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f24994a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f24994a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f24994a);
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
        return u(this.f24994a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return z(this.f24994a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        return AbstractC6484j.b(this, array);
    }
}
