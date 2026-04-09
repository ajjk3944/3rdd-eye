package d9;

import N7.H7;
import c9.AbstractC2082c;
import c9.AbstractC2084e;
import c9.C2088i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import q9.InterfaceC5499a;

/* compiled from: ListBuilder.kt */
/* renamed from: d9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4284b<E> extends AbstractC2084e<E> implements RandomAccess, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final C4284b f37535e;

    /* renamed from: b, reason: collision with root package name */
    public E[] f37536b;

    /* renamed from: c, reason: collision with root package name */
    public int f37537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37538d;

    /* compiled from: ListBuilder.kt */
    /* renamed from: d9.b$a */
    public static final class a<E> extends AbstractC2084e<E> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public E[] f37539b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37540c;

        /* renamed from: d, reason: collision with root package name */
        public int f37541d;

        /* renamed from: e, reason: collision with root package name */
        public final a<E> f37542e;

        /* renamed from: f, reason: collision with root package name */
        public final C4284b<E> f37543f;

        /* compiled from: ListBuilder.kt */
        /* renamed from: d9.b$a$a, reason: collision with other inner class name */
        public static final class C0441a<E> implements ListIterator<E>, InterfaceC5499a {

            /* renamed from: b, reason: collision with root package name */
            public final a<E> f37544b;

            /* renamed from: c, reason: collision with root package name */
            public int f37545c;

            /* renamed from: d, reason: collision with root package name */
            public int f37546d = -1;

            /* renamed from: e, reason: collision with root package name */
            public int f37547e;

            public C0441a(a<E> aVar, int i) {
                this.f37544b = aVar;
                this.f37545c = i;
                this.f37547e = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f37544b.f37543f).modCount != this.f37547e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e4) {
                a();
                int i = this.f37545c;
                this.f37545c = i + 1;
                a<E> aVar = this.f37544b;
                aVar.add(i, e4);
                this.f37546d = -1;
                this.f37547e = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f37545c < this.f37544b.f37541d;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f37545c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i = this.f37545c;
                a<E> aVar = this.f37544b;
                if (i >= aVar.f37541d) {
                    throw new NoSuchElementException();
                }
                this.f37545c = i + 1;
                this.f37546d = i;
                return aVar.f37539b[aVar.f37540c + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f37545c;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i = this.f37545c;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i - 1;
                this.f37545c = i10;
                this.f37546d = i10;
                a<E> aVar = this.f37544b;
                return aVar.f37539b[aVar.f37540c + i10];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f37545c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.f37546d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a<E> aVar = this.f37544b;
                aVar.d(i);
                this.f37545c = this.f37546d;
                this.f37546d = -1;
                this.f37547e = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e4) {
                a();
                int i = this.f37546d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f37544b.set(i, e4);
            }
        }

        public a(E[] backing, int i, int i10, a<E> aVar, C4284b<E> root) {
            l.f(backing, "backing");
            l.f(root, "root");
            this.f37539b = backing;
            this.f37540c = i;
            this.f37541d = i10;
            this.f37542e = aVar;
            this.f37543f = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e4) {
            j();
            h();
            g(this.f37540c + this.f37541d, e4);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> elements) {
            l.f(elements, "elements");
            j();
            h();
            int size = elements.size();
            f(this.f37540c + this.f37541d, elements, size);
            return size > 0;
        }

        @Override // c9.AbstractC2084e
        public final int c() {
            h();
            return this.f37541d;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            j();
            h();
            l(this.f37540c, this.f37541d);
        }

        @Override // c9.AbstractC2084e
        public final E d(int i) {
            j();
            h();
            int i10 = this.f37541d;
            if (i < 0 || i >= i10) {
                throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
            }
            return k(this.f37540c + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            h();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return com.google.gson.internal.c.b(this.f37539b, this.f37540c, this.f37541d, (List) obj);
            }
            return false;
        }

        public final void f(int i, Collection<? extends E> collection, int i10) {
            ((AbstractList) this).modCount++;
            C4284b<E> c4284b = this.f37543f;
            a<E> aVar = this.f37542e;
            if (aVar != null) {
                aVar.f(i, collection, i10);
            } else {
                C4284b c4284b2 = C4284b.f37535e;
                c4284b.f(i, collection, i10);
            }
            this.f37539b = c4284b.f37536b;
            this.f37541d += i10;
        }

        public final void g(int i, E e4) {
            ((AbstractList) this).modCount++;
            C4284b<E> c4284b = this.f37543f;
            a<E> aVar = this.f37542e;
            if (aVar != null) {
                aVar.g(i, e4);
            } else {
                C4284b c4284b2 = C4284b.f37535e;
                c4284b.g(i, e4);
            }
            this.f37539b = c4284b.f37536b;
            this.f37541d++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            h();
            int i10 = this.f37541d;
            if (i < 0 || i >= i10) {
                throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
            }
            return this.f37539b[this.f37540c + i];
        }

        public final void h() {
            if (((AbstractList) this.f37543f).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            h();
            E[] eArr = this.f37539b;
            int i = this.f37541d;
            int iHashCode = 1;
            for (int i10 = 0; i10 < i; i10++) {
                E e4 = eArr[this.f37540c + i10];
                iHashCode = (iHashCode * 31) + (e4 != null ? e4.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            h();
            for (int i = 0; i < this.f37541d; i++) {
                if (l.b(this.f37539b[this.f37540c + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            h();
            return this.f37541d == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void j() {
            if (this.f37543f.f37538d) {
                throw new UnsupportedOperationException();
            }
        }

        public final E k(int i) {
            E eK;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f37542e;
            if (aVar != null) {
                eK = aVar.k(i);
            } else {
                C4284b c4284b = C4284b.f37535e;
                eK = this.f37543f.k(i);
            }
            this.f37541d--;
            return eK;
        }

        public final void l(int i, int i10) {
            if (i10 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f37542e;
            if (aVar != null) {
                aVar.l(i, i10);
            } else {
                C4284b c4284b = C4284b.f37535e;
                this.f37543f.l(i, i10);
            }
            this.f37541d -= i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            for (int i = this.f37541d - 1; i >= 0; i--) {
                if (l.b(this.f37539b[this.f37540c + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final int m(int i, int i10, Collection<? extends E> collection, boolean z10) {
            int iM;
            a<E> aVar = this.f37542e;
            if (aVar != null) {
                iM = aVar.m(i, i10, collection, z10);
            } else {
                C4284b c4284b = C4284b.f37535e;
                iM = this.f37543f.m(i, i10, collection, z10);
            }
            if (iM > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f37541d -= iM;
            return iM;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            j();
            h();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                d(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<? extends Object> elements) {
            l.f(elements, "elements");
            j();
            h();
            return m(this.f37540c, this.f37541d, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<? extends Object> elements) {
            l.f(elements, "elements");
            j();
            h();
            return m(this.f37540c, this.f37541d, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e4) {
            j();
            h();
            int i10 = this.f37541d;
            if (i < 0 || i >= i10) {
                throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
            }
            E[] eArr = this.f37539b;
            int i11 = this.f37540c;
            E e10 = eArr[i11 + i];
            eArr[i11 + i] = e4;
            return e10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i10) {
            AbstractC2082c.a.a(i, i10, this.f37541d);
            return new a(this.f37539b, this.f37540c + i, i10 - i, this, this.f37543f);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            l.f(array, "array");
            h();
            int length = array.length;
            int i = this.f37541d;
            int i10 = this.f37540c;
            if (length < i) {
                T[] tArr = (T[]) Arrays.copyOfRange(this.f37539b, i10, i + i10, array.getClass());
                l.e(tArr, "copyOfRange(...)");
                return tArr;
            }
            C2088i.e(this.f37539b, 0, array, i10, i + i10);
            int i11 = this.f37541d;
            if (i11 < array.length) {
                array[i11] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            h();
            return com.google.gson.internal.c.c(this.f37539b, this.f37540c, this.f37541d, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            h();
            int i10 = this.f37541d;
            if (i < 0 || i > i10) {
                throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
            }
            return new C0441a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e4) {
            j();
            h();
            int i10 = this.f37541d;
            if (i >= 0 && i <= i10) {
                g(this.f37540c + i, e4);
                return;
            }
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> elements) {
            l.f(elements, "elements");
            j();
            h();
            int i10 = this.f37541d;
            if (i >= 0 && i <= i10) {
                int size = elements.size();
                f(this.f37540c + i, elements, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            h();
            E[] eArr = this.f37539b;
            int i = this.f37541d;
            int i10 = this.f37540c;
            return C2088i.g(eArr, i10, i + i10);
        }
    }

    /* compiled from: ListBuilder.kt */
    /* renamed from: d9.b$b, reason: collision with other inner class name */
    public static final class C0442b<E> implements ListIterator<E>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final C4284b<E> f37548b;

        /* renamed from: c, reason: collision with root package name */
        public int f37549c;

        /* renamed from: d, reason: collision with root package name */
        public int f37550d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f37551e;

        public C0442b(C4284b<E> c4284b, int i) {
            this.f37548b = c4284b;
            this.f37549c = i;
            this.f37551e = ((AbstractList) c4284b).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f37548b).modCount != this.f37551e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e4) {
            a();
            int i = this.f37549c;
            this.f37549c = i + 1;
            C4284b<E> c4284b = this.f37548b;
            c4284b.add(i, e4);
            this.f37550d = -1;
            this.f37551e = ((AbstractList) c4284b).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f37549c < this.f37548b.f37537c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f37549c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i = this.f37549c;
            C4284b<E> c4284b = this.f37548b;
            if (i >= c4284b.f37537c) {
                throw new NoSuchElementException();
            }
            this.f37549c = i + 1;
            this.f37550d = i;
            return c4284b.f37536b[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f37549c;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i = this.f37549c;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i10 = i - 1;
            this.f37549c = i10;
            this.f37550d = i10;
            return this.f37548b.f37536b[i10];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f37549c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.f37550d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            C4284b<E> c4284b = this.f37548b;
            c4284b.d(i);
            this.f37549c = this.f37550d;
            this.f37550d = -1;
            this.f37551e = ((AbstractList) c4284b).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e4) {
            a();
            int i = this.f37550d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f37548b.set(i, e4);
        }
    }

    static {
        C4284b c4284b = new C4284b(0);
        c4284b.f37538d = true;
        f37535e = c4284b;
    }

    public C4284b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f37536b = (E[]) new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        h();
        int i = this.f37537c;
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.f37536b[i] = e4;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        l.f(elements, "elements");
        h();
        int size = elements.size();
        f(this.f37537c, elements, size);
        return size > 0;
    }

    @Override // c9.AbstractC2084e
    public final int c() {
        return this.f37537c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        l(0, this.f37537c);
    }

    @Override // c9.AbstractC2084e
    public final E d(int i) {
        h();
        int i10 = this.f37537c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        return k(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (com.google.gson.internal.c.b(this.f37536b, 0, this.f37537c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection<? extends E> collection, int i10) {
        ((AbstractList) this).modCount++;
        j(i, i10);
        Iterator<? extends E> it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37536b[i + i11] = it.next();
        }
    }

    public final void g(int i, E e4) {
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.f37536b[i] = e4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i10 = this.f37537c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        return this.f37536b[i];
    }

    public final void h() {
        if (this.f37538d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f37536b;
        int i = this.f37537c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            E e4 = eArr[i10];
            iHashCode = (iHashCode * 31) + (e4 != null ? e4.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f37537c; i++) {
            if (l.b(this.f37536b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f37537c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i10) {
        int i11 = this.f37537c + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f37536b;
        if (i11 > eArr.length) {
            int length = eArr.length;
            int i12 = length + (length >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i12);
            l.e(eArr2, "copyOf(...)");
            this.f37536b = eArr2;
        }
        E[] eArr3 = this.f37536b;
        C2088i.e(eArr3, i + i10, eArr3, i, this.f37537c);
        this.f37537c += i10;
    }

    public final E k(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f37536b;
        E e4 = eArr[i];
        C2088i.e(eArr, i, eArr, i + 1, this.f37537c);
        E[] eArr2 = this.f37536b;
        int i10 = this.f37537c - 1;
        l.f(eArr2, "<this>");
        eArr2[i10] = null;
        this.f37537c--;
        return e4;
    }

    public final void l(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f37536b;
        C2088i.e(eArr, i, eArr, i + i10, this.f37537c);
        E[] eArr2 = this.f37536b;
        int i11 = this.f37537c;
        com.google.gson.internal.c.w(eArr2, i11 - i10, i11);
        this.f37537c -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f37537c - 1; i >= 0; i--) {
            if (l.b(this.f37536b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final int m(int i, int i10, Collection<? extends E> collection, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i + i11;
            if (collection.contains(this.f37536b[i13]) == z10) {
                E[] eArr = this.f37536b;
                i11++;
                eArr[i12 + i] = eArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        E[] eArr2 = this.f37536b;
        C2088i.e(eArr2, i + i12, eArr2, i10 + i, this.f37537c);
        E[] eArr3 = this.f37536b;
        int i15 = this.f37537c;
        com.google.gson.internal.c.w(eArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f37537c -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        h();
        return m(0, this.f37537c, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        h();
        return m(0, this.f37537c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e4) {
        h();
        int i10 = this.f37537c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        E[] eArr = this.f37536b;
        E e10 = eArr[i];
        eArr[i] = e4;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i10) {
        AbstractC2082c.a.a(i, i10, this.f37537c);
        return new a(this.f37536b, i, i10 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        l.f(array, "array");
        int length = array.length;
        int i = this.f37537c;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f37536b, 0, i, array.getClass());
            l.e(tArr, "copyOfRange(...)");
            return tArr;
        }
        C2088i.e(this.f37536b, 0, array, 0, i);
        int i10 = this.f37537c;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.google.gson.internal.c.c(this.f37536b, 0, this.f37537c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i10 = this.f37537c;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        return new C0442b(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        l.f(elements, "elements");
        h();
        int i10 = this.f37537c;
        if (i >= 0 && i <= i10) {
            int size = elements.size();
            f(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e4) {
        h();
        int i10 = this.f37537c;
        if (i >= 0 && i <= i10) {
            ((AbstractList) this).modCount++;
            j(i, 1);
            this.f37536b[i] = e4;
            return;
        }
        throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return C2088i.g(this.f37536b, 0, this.f37537c);
    }
}
