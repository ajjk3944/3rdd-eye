package y8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class k implements Collection, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25180a;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f25181a;

        /* renamed from: b, reason: collision with root package name */
        public int f25182b;

        public a(byte[] array) {
            kotlin.jvm.internal.p.e(array, "array");
            this.f25181a = array;
        }

        public byte a() {
            int i10 = this.f25182b;
            byte[] bArr = this.f25181a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f25182b));
            }
            this.f25182b = i10 + 1;
            return j.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25182b < this.f25181a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return j.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ k(byte[] bArr) {
        this.f25180a = bArr;
    }

    public static final /* synthetic */ k c(byte[] bArr) {
        return new k(bArr);
    }

    public static byte[] d(int i10) {
        return e(new byte[i10]);
    }

    public static byte[] e(byte[] storage) {
        kotlin.jvm.internal.p.e(storage, "storage");
        return storage;
    }

    public static boolean g(byte[] bArr, byte b10) {
        return z8.o.s(bArr, b10);
    }

    public static boolean h(byte[] bArr, Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof j) || !z8.o.s(bArr, ((j) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(byte[] bArr, Object obj) {
        return (obj instanceof k) && kotlin.jvm.internal.p.a(bArr, ((k) obj).A());
    }

    public static final byte j(byte[] bArr, int i10) {
        return j.b(bArr[i10]);
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
        return this.f25180a;
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
        if (obj instanceof j) {
            return f(((j) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return h(this.f25180a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return i(this.f25180a, obj);
    }

    public boolean f(byte b10) {
        return g(this.f25180a, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f25180a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f25180a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return x(this.f25180a);
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
        return u(this.f25180a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public String toString() {
        return z(this.f25180a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
