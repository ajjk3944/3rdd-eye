package c9;

import N7.H7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import q9.InterfaceC5499a;

/* compiled from: AbstractList.kt */
/* renamed from: c9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2082c<E> extends AbstractC2080a<E> implements List<E> {

    /* compiled from: AbstractList.kt */
    /* renamed from: c9.c$a */
    public static final class a {
        public static void a(int i, int i10, int i11) {
            if (i < 0 || i10 > i11) {
                StringBuilder sbI = androidx.work.s.i("fromIndex: ", i, ", toIndex: ", i10, ", size: ");
                sbI.append(i11);
                throw new IndexOutOfBoundsException(sbI.toString());
            }
            if (i > i10) {
                throw new IllegalArgumentException(H7.n(i, i10, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: c9.c$b */
    public class b implements Iterator<E>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public int f18563b;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18563b < AbstractC2082c.this.c();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f18563b;
            this.f18563b = i + 1;
            return AbstractC2082c.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: c9.c$c, reason: collision with other inner class name */
    public class C0299c extends AbstractC2082c<E>.b implements ListIterator<E> {
        public C0299c(int i) {
            super();
            int iC = AbstractC2082c.this.c();
            if (i < 0 || i > iC) {
                throw new IndexOutOfBoundsException(H7.n(i, iC, "index: ", ", size: "));
            }
            this.f18563b = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f18563b > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f18563b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.f18563b - 1;
            this.f18563b = i;
            return AbstractC2082c.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f18563b - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: c9.c$d */
    public static final class d<E> extends AbstractC2082c<E> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2082c<E> f18566b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18567c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18568d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC2082c<? extends E> abstractC2082c, int i, int i10) {
            this.f18566b = abstractC2082c;
            this.f18567c = i;
            a.a(i, i10, abstractC2082c.c());
            this.f18568d = i10 - i;
        }

        @Override // c9.AbstractC2080a
        public final int c() {
            return this.f18568d;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i10 = this.f18568d;
            if (i < 0 || i >= i10) {
                throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
            }
            return this.f18566b.get(this.f18567c + i);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        kotlin.jvm.internal.l.f(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l.b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(E e4) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.b(it.next(), e4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e4) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l.b(listIterator.previous(), e4)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new C0299c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i10) {
        return new d(this, i, i10);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new C0299c(i);
    }
}
