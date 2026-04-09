package ah;

import Zg.AbstractC3672d;
import Zg.AbstractC3676h;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
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
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;
import nh.InterfaceC6947d;

/* renamed from: ah.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3852b extends AbstractC3676h implements List, RandomAccess, Serializable, InterfaceC6947d {

    /* renamed from: d, reason: collision with root package name */
    private static final C1016b f26271d = new C1016b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C3852b f26272e;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f26273a;

    /* renamed from: b, reason: collision with root package name */
    private int f26274b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26275c;

    /* renamed from: ah.b$a */
    public static final class a extends AbstractC3676h implements List, RandomAccess, Serializable, InterfaceC6947d {

        /* renamed from: a, reason: collision with root package name */
        private Object[] f26276a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26277b;

        /* renamed from: c, reason: collision with root package name */
        private int f26278c;

        /* renamed from: d, reason: collision with root package name */
        private final a f26279d;

        /* renamed from: e, reason: collision with root package name */
        private final C3852b f26280e;

        /* renamed from: ah.b$a$a, reason: collision with other inner class name */
        private static final class C1015a implements ListIterator, InterfaceC6944a {

            /* renamed from: a, reason: collision with root package name */
            private final a f26281a;

            /* renamed from: b, reason: collision with root package name */
            private int f26282b;

            /* renamed from: c, reason: collision with root package name */
            private int f26283c;

            /* renamed from: d, reason: collision with root package name */
            private int f26284d;

            public C1015a(a list, int i10) {
                AbstractC6492s.i(list, "list");
                this.f26281a = list;
                this.f26282b = i10;
                this.f26283c = -1;
                this.f26284d = ((AbstractList) list).modCount;
            }

            private final void d() {
                if (((AbstractList) this.f26281a.f26280e).modCount != this.f26284d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                d();
                a aVar = this.f26281a;
                int i10 = this.f26282b;
                this.f26282b = i10 + 1;
                aVar.add(i10, obj);
                this.f26283c = -1;
                this.f26284d = ((AbstractList) this.f26281a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f26282b < this.f26281a.f26278c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f26282b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                d();
                if (this.f26282b >= this.f26281a.f26278c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f26282b;
                this.f26282b = i10 + 1;
                this.f26283c = i10;
                return this.f26281a.f26276a[this.f26281a.f26277b + this.f26283c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f26282b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                d();
                int i10 = this.f26282b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f26282b = i11;
                this.f26283c = i11;
                return this.f26281a.f26276a[this.f26281a.f26277b + this.f26283c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f26282b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                d();
                int i10 = this.f26283c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f26281a.remove(i10);
                this.f26282b = this.f26283c;
                this.f26283c = -1;
                this.f26284d = ((AbstractList) this.f26281a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                d();
                int i10 = this.f26283c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f26281a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, C3852b root) {
            AbstractC6492s.i(backing, "backing");
            AbstractC6492s.i(root, "root");
            this.f26276a = backing;
            this.f26277b = i10;
            this.f26278c = i11;
            this.f26279d = aVar;
            this.f26280e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final boolean K0(List list) {
            return AbstractC3853c.h(this.f26276a, this.f26277b, this.f26278c, list);
        }

        private final boolean M0() {
            return this.f26280e.f26275c;
        }

        private final void N0() {
            ((AbstractList) this).modCount++;
        }

        private final void S(int i10, Collection collection, int i11) {
            N0();
            a aVar = this.f26279d;
            if (aVar != null) {
                aVar.S(i10, collection, i11);
            } else {
                this.f26280e.K0(i10, collection, i11);
            }
            this.f26276a = this.f26280e.f26273a;
            this.f26278c += i11;
        }

        private final void T(int i10, Object obj) {
            N0();
            a aVar = this.f26279d;
            if (aVar != null) {
                aVar.T(i10, obj);
            } else {
                this.f26280e.M0(i10, obj);
            }
            this.f26276a = this.f26280e.f26273a;
            this.f26278c++;
        }

        private final Object U0(int i10) {
            N0();
            a aVar = this.f26279d;
            this.f26278c--;
            return aVar != null ? aVar.U0(i10) : this.f26280e.a1(i10);
        }

        private final void V0(int i10, int i11) {
            if (i11 > 0) {
                N0();
            }
            a aVar = this.f26279d;
            if (aVar != null) {
                aVar.V0(i10, i11);
            } else {
                this.f26280e.b1(i10, i11);
            }
            this.f26278c -= i11;
        }

        private final int W0(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f26279d;
            int iW0 = aVar != null ? aVar.W0(i10, i11, collection, z10) : this.f26280e.c1(i10, i11, collection, z10);
            if (iW0 > 0) {
                N0();
            }
            this.f26278c -= iW0;
            return iW0;
        }

        private final void b0() {
            if (((AbstractList) this.f26280e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void q0() {
            if (M0()) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            q0();
            b0();
            T(this.f26277b + this.f26278c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            q0();
            b0();
            int size = elements.size();
            S(this.f26277b + this.f26278c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            q0();
            b0();
            V0(this.f26277b, this.f26278c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            b0();
            return obj == this || ((obj instanceof List) && K0((List) obj));
        }

        @Override // Zg.AbstractC3676h
        public int g() {
            b0();
            return this.f26278c;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            b0();
            AbstractC3672d.f25361a.b(i10, this.f26278c);
            return this.f26276a[this.f26277b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            b0();
            return AbstractC3853c.i(this.f26276a, this.f26277b, this.f26278c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            b0();
            for (int i10 = 0; i10 < this.f26278c; i10++) {
                if (AbstractC6492s.d(this.f26276a[this.f26277b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            b0();
            return this.f26278c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // Zg.AbstractC3676h
        public Object j(int i10) {
            q0();
            b0();
            AbstractC3672d.f25361a.b(i10, this.f26278c);
            return U0(this.f26277b + i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            b0();
            for (int i10 = this.f26278c - 1; i10 >= 0; i10--) {
                if (AbstractC6492s.d(this.f26276a[this.f26277b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            q0();
            b0();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            q0();
            b0();
            return W0(this.f26277b, this.f26278c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            q0();
            b0();
            return W0(this.f26277b, this.f26278c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            q0();
            b0();
            AbstractC3672d.f25361a.b(i10, this.f26278c);
            Object[] objArr = this.f26276a;
            int i11 = this.f26277b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC3672d.f25361a.d(i10, i11, this.f26278c);
            return new a(this.f26276a, this.f26277b + i10, i11 - i10, this, this.f26280e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC6492s.i(array, "array");
            b0();
            int length = array.length;
            int i10 = this.f26278c;
            if (length >= i10) {
                Object[] objArr = this.f26276a;
                int i11 = this.f26277b;
                AbstractC3682n.m(objArr, array, 0, i11, i10 + i11);
                return AbstractC3689v.g(this.f26278c, array);
            }
            Object[] objArr2 = this.f26276a;
            int i12 = this.f26277b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC6492s.h(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            b0();
            return AbstractC3853c.j(this.f26276a, this.f26277b, this.f26278c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            b0();
            AbstractC3672d.f25361a.c(i10, this.f26278c);
            return new C1015a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            q0();
            b0();
            AbstractC3672d.f25361a.c(i10, this.f26278c);
            T(this.f26277b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC6492s.i(elements, "elements");
            q0();
            b0();
            AbstractC3672d.f25361a.c(i10, this.f26278c);
            int size = elements.size();
            S(this.f26277b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            b0();
            Object[] objArr = this.f26276a;
            int i10 = this.f26277b;
            return AbstractC3682n.s(objArr, i10, this.f26278c + i10);
        }
    }

    /* renamed from: ah.b$b, reason: collision with other inner class name */
    private static final class C1016b {
        public /* synthetic */ C1016b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1016b() {
        }
    }

    /* renamed from: ah.b$c */
    private static final class c implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final C3852b f26285a;

        /* renamed from: b, reason: collision with root package name */
        private int f26286b;

        /* renamed from: c, reason: collision with root package name */
        private int f26287c;

        /* renamed from: d, reason: collision with root package name */
        private int f26288d;

        public c(C3852b list, int i10) {
            AbstractC6492s.i(list, "list");
            this.f26285a = list;
            this.f26286b = i10;
            this.f26287c = -1;
            this.f26288d = ((AbstractList) list).modCount;
        }

        private final void d() {
            if (((AbstractList) this.f26285a).modCount != this.f26288d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            d();
            C3852b c3852b = this.f26285a;
            int i10 = this.f26286b;
            this.f26286b = i10 + 1;
            c3852b.add(i10, obj);
            this.f26287c = -1;
            this.f26288d = ((AbstractList) this.f26285a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f26286b < this.f26285a.f26274b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26286b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            d();
            if (this.f26286b >= this.f26285a.f26274b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f26286b;
            this.f26286b = i10 + 1;
            this.f26287c = i10;
            return this.f26285a.f26273a[this.f26287c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26286b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            d();
            int i10 = this.f26286b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f26286b = i11;
            this.f26287c = i11;
            return this.f26285a.f26273a[this.f26287c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26286b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            d();
            int i10 = this.f26287c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f26285a.remove(i10);
            this.f26286b = this.f26287c;
            this.f26287c = -1;
            this.f26288d = ((AbstractList) this.f26285a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            d();
            int i10 = this.f26287c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f26285a.set(i10, obj);
        }
    }

    static {
        C3852b c3852b = new C3852b(0);
        c3852b.f26275c = true;
        f26272e = c3852b;
    }

    public C3852b(int i10) {
        this.f26273a = AbstractC3853c.d(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(int i10, Collection collection, int i11) {
        Z0();
        Y0(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f26273a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(int i10, Object obj) {
        Z0();
        Y0(i10, 1);
        this.f26273a[i10] = obj;
    }

    private final void U0() {
        if (this.f26275c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean V0(List list) {
        return AbstractC3853c.h(this.f26273a, 0, this.f26274b, list);
    }

    private final void W0(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f26273a;
        if (i10 > objArr.length) {
            this.f26273a = AbstractC3853c.e(this.f26273a, AbstractC3672d.f25361a.e(objArr.length, i10));
        }
    }

    private final void X0(int i10) {
        W0(this.f26274b + i10);
    }

    private final void Y0(int i10, int i11) {
        X0(i11);
        Object[] objArr = this.f26273a;
        AbstractC3682n.m(objArr, objArr, i10 + i11, i10, this.f26274b);
        this.f26274b += i11;
    }

    private final void Z0() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a1(int i10) {
        Z0();
        Object[] objArr = this.f26273a;
        Object obj = objArr[i10];
        AbstractC3682n.m(objArr, objArr, i10, i10 + 1, this.f26274b);
        AbstractC3853c.f(this.f26273a, this.f26274b - 1);
        this.f26274b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(int i10, int i11) {
        if (i11 > 0) {
            Z0();
        }
        Object[] objArr = this.f26273a;
        AbstractC3682n.m(objArr, objArr, i10, i10 + i11, this.f26274b);
        Object[] objArr2 = this.f26273a;
        int i12 = this.f26274b;
        AbstractC3853c.g(objArr2, i12 - i11, i12);
        this.f26274b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c1(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f26273a[i14]) == z10) {
                Object[] objArr = this.f26273a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f26273a;
        AbstractC3682n.m(objArr2, objArr2, i10 + i13, i11 + i10, this.f26274b);
        Object[] objArr3 = this.f26273a;
        int i16 = this.f26274b;
        AbstractC3853c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            Z0();
        }
        this.f26274b -= i15;
        return i15;
    }

    public final List N0() {
        U0();
        this.f26275c = true;
        return this.f26274b > 0 ? this : f26272e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        U0();
        M0(this.f26274b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        U0();
        int size = elements.size();
        K0(this.f26274b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        U0();
        b1(0, this.f26274b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && V0((List) obj));
    }

    @Override // Zg.AbstractC3676h
    public int g() {
        return this.f26274b;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3672d.f25361a.b(i10, this.f26274b);
        return this.f26273a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC3853c.i(this.f26273a, 0, this.f26274b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f26274b; i10++) {
            if (AbstractC6492s.d(this.f26273a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f26274b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // Zg.AbstractC3676h
    public Object j(int i10) {
        U0();
        AbstractC3672d.f25361a.b(i10, this.f26274b);
        return a1(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f26274b - 1; i10 >= 0; i10--) {
            if (AbstractC6492s.d(this.f26273a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        U0();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        U0();
        return c1(0, this.f26274b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        U0();
        return c1(0, this.f26274b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        U0();
        AbstractC3672d.f25361a.b(i10, this.f26274b);
        Object[] objArr = this.f26273a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC3672d.f25361a.d(i10, i11, this.f26274b);
        return new a(this.f26273a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        int length = array.length;
        int i10 = this.f26274b;
        if (length >= i10) {
            AbstractC3682n.m(this.f26273a, array, 0, 0, i10);
            return AbstractC3689v.g(this.f26274b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f26273a, 0, i10, array.getClass());
        AbstractC6492s.h(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC3853c.j(this.f26273a, 0, this.f26274b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC3672d.f25361a.c(i10, this.f26274b);
        return new c(this, i10);
    }

    public /* synthetic */ C3852b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        U0();
        AbstractC3672d.f25361a.c(i10, this.f26274b);
        M0(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        U0();
        AbstractC3672d.f25361a.c(i10, this.f26274b);
        int size = elements.size();
        K0(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC3682n.s(this.f26273a, 0, this.f26274b);
    }
}
