package z8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class d extends z8.b implements List, m9.a {

    @NotNull
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return d.maxArraySize;
        }

        public final boolean f(Collection c10, Collection other) {
            kotlin.jvm.internal.p.e(c10, "c");
            kotlin.jvm.internal.p.e(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.p.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c10) {
            kotlin.jvm.internal.p.e(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    public class b implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f25398a;

        public b() {
        }

        public final int a() {
            return this.f25398a;
        }

        public final void c(int i10) {
            this.f25398a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25398a < d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d dVar = d.this;
            int i10 = this.f25398a;
            this.f25398a = i10 + 1;
            return dVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c extends b implements ListIterator, m9.a {
        public c(int i10) {
            super();
            d.Companion.c(i10, d.this.size());
            c(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d dVar = d.this;
            c(a() - 1);
            return dVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: z8.d$d, reason: collision with other inner class name */
    public static final class C0510d extends d implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final d f25401a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25402b;

        /* renamed from: c, reason: collision with root package name */
        public int f25403c;

        public C0510d(d list, int i10, int i11) {
            kotlin.jvm.internal.p.e(list, "list");
            this.f25401a = list;
            this.f25402b = i10;
            d.Companion.d(i10, i11, list.size());
            this.f25403c = i11 - i10;
        }

        @Override // z8.d, java.util.List
        public Object get(int i10) {
            d.Companion.b(i10, this.f25403c);
            return this.f25401a.get(this.f25402b + i10);
        }

        @Override // z8.b
        public int getSize() {
            return this.f25403c;
        }
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.p.a(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<Object> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.p.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Object> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<Object> subList(int i10, int i11) {
        return new C0510d(this, i10, i11);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Object> listIterator(int i10) {
        return new c(i10);
    }
}
