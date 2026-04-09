package p0;

import br.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class b implements List, cr.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f20224a;

    public b(e eVar) {
        this.f20224a = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f20224a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f20224a;
        return eVar.e(eVar.f20232g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f20224a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20224a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f20224a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f20224a.f20230a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f20224a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f20224a.f20232g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f20224a;
        Object[] objArr = eVar.f20230a;
        for (int i10 = eVar.f20232g - 1; i10 >= 0; i10--) {
            if (l.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f20224a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f20224a;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = eVar.f20232g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.j(it.next());
        }
        return i10 != eVar.f20232g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f20224a;
        int i10 = eVar.f20232g;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(eVar.f20230a[i11])) {
                eVar.k(i11);
            }
        }
        return i10 != eVar.f20232g;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        Object[] objArr = this.f20224a.f20230a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f20224a.f20232g;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(i10, i11, this);
        return new c(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return l.m(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f20224a.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        return this.f20224a.k(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.n(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f20224a.e(i10, collection);
    }
}
