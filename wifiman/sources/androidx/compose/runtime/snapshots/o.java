package androidx.compose.runtime.snapshots;

import T.B0;
import Zg.Q;
import d0.AbstractC5276h;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.L;
import nh.InterfaceC6944a;
import nh.InterfaceC6947d;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
final class o implements List, InterfaceC6947d {

    /* renamed from: a, reason: collision with root package name */
    private final k f28711a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28712b;

    /* renamed from: c, reason: collision with root package name */
    private int f28713c;

    /* renamed from: d, reason: collision with root package name */
    private int f28714d;

    public static final class a implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f28715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f28716b;

        a(L l10, o oVar) {
            this.f28715a = l10;
            this.f28716b = oVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            AbstractC5276h.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            AbstractC5276h.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            AbstractC5276h.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28715a.f51687a < this.f28716b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28715a.f51687a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i10 = this.f28715a.f51687a + 1;
            AbstractC5276h.g(i10, this.f28716b.size());
            this.f28715a.f51687a = i10;
            return this.f28716b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28715a.f51687a + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f28715a.f51687a;
            AbstractC5276h.g(i10, this.f28716b.size());
            this.f28715a.f51687a = i10 - 1;
            return this.f28716b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f28715a.f51687a;
        }
    }

    public o(k kVar, int i10, int i11) {
        this.f28711a = kVar;
        this.f28712b = i10;
        this.f28713c = kVar.f();
        this.f28714d = i11 - i10;
    }

    private final void f() {
        if (this.f28711a.f() != this.f28713c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        f();
        this.f28711a.add(this.f28712b + size(), obj);
        this.f28714d = size() + 1;
        this.f28713c = this.f28711a.f();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        f();
        boolean zAddAll = this.f28711a.addAll(i10 + this.f28712b, collection);
        if (zAddAll) {
            this.f28714d = size() + collection.size();
            this.f28713c = this.f28711a.f();
        }
        return zAddAll;
    }

    public int b() {
        return this.f28714d;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            k kVar = this.f28711a;
            int i10 = this.f28712b;
            kVar.s(i10, size() + i10);
            this.f28714d = 0;
            this.f28713c = this.f28711a.f();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Object e(int i10) {
        f();
        Object objRemove = this.f28711a.remove(this.f28712b + i10);
        this.f28714d = size() - 1;
        this.f28713c = this.f28711a.f();
        return objRemove;
    }

    @Override // java.util.List
    public Object get(int i10) {
        f();
        AbstractC5276h.g(i10, size());
        return this.f28711a.get(this.f28712b + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        f();
        int i10 = this.f28712b;
        Iterator it = AbstractC7978m.s(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            if (AbstractC6492s.d(obj, this.f28711a.get(iD))) {
                return iD - this.f28712b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        f();
        int size = this.f28712b + size();
        do {
            size--;
            if (size < this.f28712b) {
                return -1;
            }
        } while (!AbstractC6492s.d(obj, this.f28711a.get(size)));
        return size - this.f28712b;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return e(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        f();
        k kVar = this.f28711a;
        int i10 = this.f28712b;
        int iU = kVar.u(collection, i10, size() + i10);
        if (iU > 0) {
            this.f28713c = this.f28711a.f();
            this.f28714d = size() - iU;
        }
        return iU > 0;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        AbstractC5276h.g(i10, size());
        f();
        Object obj2 = this.f28711a.set(i10 + this.f28712b, obj);
        this.f28713c = this.f28711a.f();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            B0.a("fromIndex or toIndex are out of bounds");
        }
        f();
        k kVar = this.f28711a;
        int i12 = this.f28712b;
        return new o(kVar, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        f();
        L l10 = new L();
        l10.f51687a = i10 - 1;
        return new a(l10, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        f();
        this.f28711a.add(this.f28712b + i10, obj);
        this.f28714d = size() + 1;
        this.f28713c = this.f28711a.f();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
