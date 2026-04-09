package oe;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class d1 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f19314a;

    /* renamed from: d, reason: collision with root package name */
    public final ne.j f19315d;

    public d1(Set set, ne.j jVar) {
        this.f19314a = set;
        this.f19315d = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f19315d.apply(obj)) {
            return this.f19314a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f19315d.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f19314a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f19314a;
        boolean z10 = set instanceof RandomAccess;
        ne.j jVar = this.f19315d;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            jVar.getClass();
            while (it.hasNext()) {
                if (jVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        jVar.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!jVar.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        s.q(list, jVar, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        s.q(list, jVar, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f19314a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f19315d.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return s.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return s.k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f19314a.iterator();
        ne.j jVar = this.f19315d;
        ba.m.k(jVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (jVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f19314a.iterator();
        it.getClass();
        ne.j jVar = this.f19315d;
        jVar.getClass();
        return new l0(it, jVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f19314a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f19314a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f19315d.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f19314a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f19315d.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f19314a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f19315d.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return s.n(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return s.n(iterator()).toArray(objArr);
    }
}
