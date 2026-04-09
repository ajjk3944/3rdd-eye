package E0;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import nh.InterfaceC6944a;

/* renamed from: E0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2642u implements List, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    private int f3983d;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f3980a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private long[] f3981b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    private int f3982c = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3984e = true;

    /* renamed from: E0.u$b */
    private final class b implements List, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final int f3989a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3990b;

        public b(int i10, int i11) {
            this.f3989a = i10;
            this.f3990b = i11;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(e.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof e.c) {
                return b((e.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.c get(int i10) {
            Object obj = C2642u.this.f3980a[i10 + this.f3989a];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        public int f() {
            return this.f3990b - this.f3989a;
        }

        public int g(e.c cVar) {
            int i10 = this.f3989a;
            int i11 = this.f3990b;
            if (i10 > i11) {
                return -1;
            }
            while (!AbstractC6492s.d(C2642u.this.f3980a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f3989a;
        }

        public int i(e.c cVar) {
            int i10 = this.f3990b;
            int i11 = this.f3989a;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC6492s.d(C2642u.this.f3980a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f3989a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof e.c) {
                return g((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C2642u c2642u = C2642u.this;
            int i10 = this.f3989a;
            return c2642u.new a(i10, i10, this.f3990b);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof e.c) {
                return i((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C2642u c2642u = C2642u.this;
            int i10 = this.f3989a;
            return c2642u.new a(i10, i10, this.f3990b);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C2642u c2642u = C2642u.this;
            int i12 = this.f3989a;
            return c2642u.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC6484j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            C2642u c2642u = C2642u.this;
            int i11 = this.f3989a;
            return c2642u.new a(i10 + i11, i11, this.f3990b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC6484j.b(this, objArr);
        }
    }

    private final void C() {
        int i10 = this.f3982c + 1;
        int iN = AbstractC3689v.n(this);
        if (i10 <= iN) {
            while (true) {
                this.f3980a[i10] = null;
                if (i10 == iN) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f3983d = this.f3982c + 1;
    }

    private final void j() {
        int i10 = this.f3982c;
        Object[] objArr = this.f3980a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f3980a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f3981b, length);
            AbstractC6492s.h(jArrCopyOf, "copyOf(this, newSize)");
            this.f3981b = jArrCopyOf;
        }
    }

    private final long k() {
        long jA = AbstractC2643v.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f3982c + 1;
        int iN = AbstractC3689v.n(this);
        if (i10 <= iN) {
            while (true) {
                long jB = AbstractC2639q.b(this.f3981b[i10]);
                if (AbstractC2639q.a(jB, jA) < 0) {
                    jA = jB;
                }
                if (AbstractC2639q.c(jA) < 0.0f && AbstractC2639q.d(jA)) {
                    return jA;
                }
                if (i10 == iN) {
                    break;
                }
                i10++;
            }
        }
        return jA;
    }

    public int A(e.c cVar) {
        for (int iN = AbstractC3689v.n(this); -1 < iN; iN--) {
            if (AbstractC6492s.d(this.f3980a[iN], cVar)) {
                return iN;
            }
        }
        return -1;
    }

    public final void D(e.c cVar, float f10, boolean z10, InterfaceC6824a interfaceC6824a) {
        if (this.f3982c == AbstractC3689v.n(this)) {
            x(cVar, f10, z10, interfaceC6824a);
            if (this.f3982c + 1 == AbstractC3689v.n(this)) {
                C();
                return;
            }
            return;
        }
        long jK = k();
        int i10 = this.f3982c;
        this.f3982c = AbstractC3689v.n(this);
        x(cVar, f10, z10, interfaceC6824a);
        if (this.f3982c + 1 < AbstractC3689v.n(this) && AbstractC2639q.a(jK, k()) > 0) {
            int i11 = this.f3982c + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f3980a;
            AbstractC3682n.m(objArr, objArr, i12, i11, size());
            long[] jArr = this.f3981b;
            AbstractC3682n.l(jArr, jArr, i12, i11, size());
            this.f3982c = ((size() + i10) - this.f3982c) - 1;
        }
        C();
        this.f3982c = i10;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f3982c = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3982c = -1;
        C();
        this.f3984e = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e.c) {
            return i((e.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean i(e.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e.c) {
            return y((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e.c) {
            return A((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.c get(int i10) {
        Object obj = this.f3980a[i10];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) obj;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s() {
        return this.f3984e;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return u();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public int u() {
        return this.f3983d;
    }

    public final boolean v() {
        long jK = k();
        return AbstractC2639q.c(jK) < 0.0f && AbstractC2639q.d(jK);
    }

    public final void w(e.c cVar, boolean z10, InterfaceC6824a interfaceC6824a) {
        x(cVar, -1.0f, z10, interfaceC6824a);
        AbstractC2624c0 abstractC2624c0C2 = cVar.c2();
        if (abstractC2624c0C2 == null || abstractC2624c0C2.o3()) {
            return;
        }
        this.f3984e = false;
    }

    public final void x(e.c cVar, float f10, boolean z10, InterfaceC6824a interfaceC6824a) {
        int i10 = this.f3982c;
        this.f3982c = i10 + 1;
        j();
        Object[] objArr = this.f3980a;
        int i11 = this.f3982c;
        objArr[i11] = cVar;
        this.f3981b[i11] = AbstractC2643v.a(f10, z10);
        C();
        interfaceC6824a.invoke();
        this.f3982c = i10;
    }

    public int y(e.c cVar) {
        int iN = AbstractC3689v.n(this);
        if (iN < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC6492s.d(this.f3980a[i10], cVar)) {
            if (i10 == iN) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean z(float f10, boolean z10) {
        if (this.f3982c == AbstractC3689v.n(this)) {
            return true;
        }
        return AbstractC2639q.a(k(), AbstractC2643v.a(f10, z10)) > 0;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }

    /* renamed from: E0.u$a */
    private final class a implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f3985a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3986b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3987c;

        public a(int i10, int i11, int i12) {
            this.f3985a = i10;
            this.f3986b = i11;
            this.f3987c = i12;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public e.c next() {
            Object[] objArr = C2642u.this.f3980a;
            int i10 = this.f3985a;
            this.f3985a = i10 + 1;
            Object obj = objArr[i10];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.c previous() {
            Object[] objArr = C2642u.this.f3980a;
            int i10 = this.f3985a - 1;
            this.f3985a = i10;
            Object obj = objArr[i10];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f3985a < this.f3987c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f3985a > this.f3986b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f3985a - this.f3986b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f3985a - this.f3986b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C2642u c2642u, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c2642u.size() : i12);
        }
    }
}
