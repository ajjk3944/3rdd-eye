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
public final class B implements Collection, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24978a;

    private static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f24979a;

        /* renamed from: b, reason: collision with root package name */
        private int f24980b;

        public a(byte[] array) {
            AbstractC6492s.i(array, "array");
            this.f24979a = array;
        }

        public byte d() {
            int i10 = this.f24980b;
            byte[] bArr = this.f24979a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f24980b));
            }
            this.f24980b = i10 + 1;
            return A.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24980b < this.f24979a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.a(d());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ B(byte[] bArr) {
        this.f24978a = bArr;
    }

    public static final /* synthetic */ B b(byte[] bArr) {
        return new B(bArr);
    }

    public static byte[] e(int i10) {
        return f(new byte[i10]);
    }

    public static byte[] f(byte[] storage) {
        AbstractC6492s.i(storage, "storage");
        return storage;
    }

    public static boolean i(byte[] bArr, byte b10) {
        return AbstractC3682n.R(bArr, b10);
    }

    public static boolean j(byte[] bArr, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !AbstractC3682n.R(bArr, ((A) obj).h())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof B) && AbstractC6492s.d(bArr, ((B) obj).A());
    }

    public static final byte q(byte[] bArr, int i10) {
        return A.b(bArr[i10]);
    }

    public static int u(byte[] bArr) {
        return bArr.length;
    }

    public static int v(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean w(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator x(byte[] bArr) {
        return new a(bArr);
    }

    public static final void y(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String z(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public final /* synthetic */ byte[] A() {
        return this.f24978a;
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
        if (obj instanceof A) {
            return g(((A) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        return j(this.f24978a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f24978a, obj);
    }

    public boolean g(byte b10) {
        return i(this.f24978a, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f24978a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f24978a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f24978a);
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
        return u(this.f24978a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return z(this.f24978a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        return AbstractC6484j.b(this, array);
    }
}
