package V;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;
import nh.InterfaceC6947d;

/* loaded from: classes.dex */
public final class b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22937d = 8;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f22938a;

    /* renamed from: b, reason: collision with root package name */
    private List f22939b;

    /* renamed from: c, reason: collision with root package name */
    private int f22940c;

    private static final class a implements List, InterfaceC6947d {

        /* renamed from: a, reason: collision with root package name */
        private final b f22941a;

        public a(b bVar) {
            this.f22941a = bVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f22941a.b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f22941a.d(i10, collection);
        }

        public int b() {
            return this.f22941a.o();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f22941a.h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f22941a.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f22941a.j(collection);
        }

        public Object e(int i10) {
            V.c.c(this, i10);
            return this.f22941a.z(i10);
        }

        @Override // java.util.List
        public Object get(int i10) {
            V.c.c(this, i10);
            return this.f22941a.m()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f22941a.q(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f22941a.s();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f22941a.w(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return e(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f22941a.y(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f22941a.B(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            V.c.c(this, i10);
            return this.f22941a.C(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            V.c.d(this, i10, i11);
            return new C0838b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC6484j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f22941a.a(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f22941a.f(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f22941a.x(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC6484j.b(this, objArr);
        }
    }

    /* renamed from: V.b$b, reason: collision with other inner class name */
    private static final class C0838b implements List, InterfaceC6947d {

        /* renamed from: a, reason: collision with root package name */
        private final List f22942a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22943b;

        /* renamed from: c, reason: collision with root package name */
        private int f22944c;

        public C0838b(List list, int i10, int i11) {
            this.f22942a = list;
            this.f22943b = i10;
            this.f22944c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f22942a;
            int i10 = this.f22944c;
            this.f22944c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f22942a.addAll(i10 + this.f22943b, collection);
            this.f22944c += collection.size();
            return collection.size() > 0;
        }

        public int b() {
            return this.f22944c - this.f22943b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f22944c - 1;
            int i11 = this.f22943b;
            if (i11 <= i10) {
                while (true) {
                    this.f22942a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f22944c = this.f22943b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f22944c;
            for (int i11 = this.f22943b; i11 < i10; i11++) {
                if (AbstractC6492s.d(this.f22942a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public Object e(int i10) {
            V.c.c(this, i10);
            this.f22944c--;
            return this.f22942a.remove(i10 + this.f22943b);
        }

        @Override // java.util.List
        public Object get(int i10) {
            V.c.c(this, i10);
            return this.f22942a.get(i10 + this.f22943b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f22944c;
            for (int i11 = this.f22943b; i11 < i10; i11++) {
                if (AbstractC6492s.d(this.f22942a.get(i11), obj)) {
                    return i11 - this.f22943b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f22944c == this.f22943b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f22944c - 1;
            int i11 = this.f22943b;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC6492s.d(this.f22942a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f22943b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return e(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f22944c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f22944c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f22944c;
            int i11 = i10 - 1;
            int i12 = this.f22943b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f22942a.get(i11))) {
                        this.f22942a.remove(i11);
                        this.f22944c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f22944c;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            V.c.c(this, i10);
            return this.f22942a.set(i10 + this.f22943b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            V.c.d(this, i10, i11);
            return new C0838b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC6484j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f22942a.add(i10 + this.f22943b, obj);
            this.f22944c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f22944c;
            for (int i11 = this.f22943b; i11 < i10; i11++) {
                if (AbstractC6492s.d(this.f22942a.get(i11), obj)) {
                    this.f22942a.remove(i11);
                    this.f22944c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC6484j.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f22942a.addAll(this.f22944c, collection);
            this.f22944c += collection.size();
            return collection.size() > 0;
        }
    }

    private static final class c implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final List f22945a;

        /* renamed from: b, reason: collision with root package name */
        private int f22946b;

        public c(List list, int i10) {
            this.f22945a = list;
            this.f22946b = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f22945a.add(this.f22946b, obj);
            this.f22946b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f22946b < this.f22945a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f22946b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f22945a;
            int i10 = this.f22946b;
            this.f22946b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f22946b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f22946b - 1;
            this.f22946b = i10;
            return this.f22945a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f22946b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f22946b - 1;
            this.f22946b = i10;
            this.f22945a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f22945a.set(this.f22946b, obj);
        }
    }

    public b(Object[] objArr, int i10) {
        this.f22938a = objArr;
        this.f22940c = i10;
    }

    public final void A(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f22940c;
            if (i11 < i12) {
                Object[] objArr = this.f22938a;
                AbstractC3682n.m(objArr, objArr, i10, i11, i12);
            }
            int i13 = this.f22940c - (i11 - i10);
            int iO = o() - 1;
            if (i13 <= iO) {
                int i14 = i13;
                while (true) {
                    this.f22938a[i14] = null;
                    if (i14 == iO) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f22940c = i13;
        }
    }

    public final boolean B(Collection collection) {
        int i10 = this.f22940c;
        for (int iO = o() - 1; -1 < iO; iO--) {
            if (!collection.contains(m()[iO])) {
                z(iO);
            }
        }
        return i10 != this.f22940c;
    }

    public final Object C(int i10, Object obj) {
        Object[] objArr = this.f22938a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void D(int i10) {
        this.f22940c = i10;
    }

    public final void F(Comparator comparator) {
        AbstractC3682n.J(this.f22938a, comparator, 0, this.f22940c);
    }

    public final void a(int i10, Object obj) {
        k(this.f22940c + 1);
        Object[] objArr = this.f22938a;
        int i11 = this.f22940c;
        if (i10 != i11) {
            AbstractC3682n.m(objArr, objArr, i10 + 1, i10, i11);
        }
        objArr[i10] = obj;
        this.f22940c++;
    }

    public final boolean b(Object obj) {
        k(this.f22940c + 1);
        Object[] objArr = this.f22938a;
        int i10 = this.f22940c;
        objArr[i10] = obj;
        this.f22940c = i10 + 1;
        return true;
    }

    public final boolean c(int i10, b bVar) {
        if (bVar.s()) {
            return false;
        }
        k(this.f22940c + bVar.f22940c);
        Object[] objArr = this.f22938a;
        int i11 = this.f22940c;
        if (i10 != i11) {
            AbstractC3682n.m(objArr, objArr, bVar.f22940c + i10, i10, i11);
        }
        AbstractC3682n.m(bVar.f22938a, objArr, i10, 0, bVar.f22940c);
        this.f22940c += bVar.f22940c;
        return true;
    }

    public final boolean d(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        k(this.f22940c + collection.size());
        Object[] objArr = this.f22938a;
        if (i10 != this.f22940c) {
            AbstractC3682n.m(objArr, objArr, collection.size() + i10, i10, this.f22940c);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC3689v.v();
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f22940c += collection.size();
        return true;
    }

    public final boolean e(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        k(this.f22940c + list.size());
        Object[] objArr = this.f22938a;
        if (i10 != this.f22940c) {
            AbstractC3682n.m(objArr, objArr, list.size() + i10, i10, this.f22940c);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = list.get(i11);
        }
        this.f22940c += list.size();
        return true;
    }

    public final boolean f(Collection collection) {
        return d(this.f22940c, collection);
    }

    public final List g() {
        List list = this.f22939b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f22939b = aVar;
        return aVar;
    }

    public final void h() {
        Object[] objArr = this.f22938a;
        int iO = o();
        while (true) {
            iO--;
            if (-1 >= iO) {
                this.f22940c = 0;
                return;
            }
            objArr[iO] = null;
        }
    }

    public final boolean i(Object obj) {
        int iO = o() - 1;
        if (iO >= 0) {
            for (int i10 = 0; !AbstractC6492s.d(m()[i10], obj); i10++) {
                if (i10 != iO) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i10) {
        Object[] objArr = this.f22938a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f22938a = objArrCopyOf;
        }
    }

    public final Object l() {
        if (s()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return m()[0];
    }

    public final Object[] m() {
        return this.f22938a;
    }

    public final int o() {
        return this.f22940c;
    }

    public final int q(Object obj) {
        int i10 = this.f22940c;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f22938a;
        int i11 = 0;
        while (!AbstractC6492s.d(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean s() {
        return this.f22940c == 0;
    }

    public final boolean u() {
        return this.f22940c != 0;
    }

    public final Object v() {
        if (s()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return m()[o() - 1];
    }

    public final int w(Object obj) {
        int i10 = this.f22940c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f22938a;
        while (!AbstractC6492s.d(obj, objArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean x(Object obj) {
        int iQ = q(obj);
        if (iQ < 0) {
            return false;
        }
        z(iQ);
        return true;
    }

    public final boolean y(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f22940c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        return i10 != this.f22940c;
    }

    public final Object z(int i10) {
        Object[] objArr = this.f22938a;
        Object obj = objArr[i10];
        if (i10 != o() - 1) {
            AbstractC3682n.m(objArr, objArr, i10, i10 + 1, this.f22940c);
        }
        int i11 = this.f22940c - 1;
        this.f22940c = i11;
        objArr[i11] = null;
        return obj;
    }
}
