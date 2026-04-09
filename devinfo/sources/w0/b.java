package w0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nk.j;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements List, ok.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f36391a;

    public b(e eVar) {
        this.f36391a = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f36391a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f36391a;
        return eVar.f(eVar.f36399c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f36391a.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f36391a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f36391a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        f.a(i4, this);
        return this.f36391a.f36397a[i4];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f36391a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f36391a.f36399c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f36391a;
        Object[] objArr = eVar.f36397a;
        for (int i4 = eVar.f36399c - 1; i4 >= 0; i4--) {
            if (k.a(obj, objArr[i4])) {
                return i4;
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
        return this.f36391a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f36391a;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = eVar.f36399c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.k(it.next());
        }
        return i4 != eVar.f36399c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f36391a;
        int i4 = eVar.f36399c;
        for (int i10 = i4 - 1; -1 < i10; i10--) {
            if (!collection.contains(eVar.f36397a[i10])) {
                eVar.l(i10);
            }
        }
        return i4 != eVar.f36399c;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        f.a(i4, this);
        Object[] objArr = this.f36391a.f36397a;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f36391a.f36399c;
    }

    @Override // java.util.List
    public final List subList(int i4, int i10) {
        f.b(i4, i10, this);
        return new c(i4, i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        this.f36391a.a(i4, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return new d(i4, this);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        f.a(i4, this);
        return this.f36391a.l(i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        return this.f36391a.f(i4, collection);
    }
}
