package Zg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;
import org.snmp4j.mp.MPv3;

/* renamed from: Zg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3672d extends AbstractC3670b implements List, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25361a = new a(null);

    /* renamed from: Zg.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return MPv3.MAX_MESSAGE_ID;
            }
            return 2147483639;
        }

        public final boolean f(Collection c10, Collection other) {
            AbstractC6492s.i(c10, "c");
            AbstractC6492s.i(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!AbstractC6492s.d(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c10) {
            AbstractC6492s.i(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* renamed from: Zg.d$b */
    private class b implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f25362a;

        public b() {
        }

        protected final int d() {
            return this.f25362a;
        }

        protected final void e(int i10) {
            this.f25362a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25362a < AbstractC3672d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC3672d abstractC3672d = AbstractC3672d.this;
            int i10 = this.f25362a;
            this.f25362a = i10 + 1;
            return abstractC3672d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: Zg.d$c */
    private class c extends b implements ListIterator, InterfaceC6944a {
        public c(int i10) {
            super();
            AbstractC3672d.f25361a.c(i10, AbstractC3672d.this.size());
            e(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return d() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return d();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC3672d abstractC3672d = AbstractC3672d.this;
            e(d() - 1);
            return abstractC3672d.get(d());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return d() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: Zg.d$d, reason: collision with other inner class name */
    private static final class C0976d extends AbstractC3672d implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3672d f25365b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25366c;

        /* renamed from: d, reason: collision with root package name */
        private int f25367d;

        public C0976d(AbstractC3672d list, int i10, int i11) {
            AbstractC6492s.i(list, "list");
            this.f25365b = list;
            this.f25366c = i10;
            AbstractC3672d.f25361a.d(i10, i11, list.size());
            this.f25367d = i11 - i10;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public Object get(int i10) {
            AbstractC3672d.f25361a.b(i10, this.f25367d);
            return this.f25365b.get(this.f25366c + i10);
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return this.f25367d;
        }
    }

    protected AbstractC3672d() {
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f25361a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f25361a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (AbstractC6492s.d(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC6492s.d(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new C0976d(this, i10, i11);
    }

    public ListIterator listIterator(int i10) {
        return new c(i10);
    }
}
