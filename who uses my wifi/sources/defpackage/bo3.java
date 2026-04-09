package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class bo3 extends AbstractCollection implements Set {
    public final Set f;
    public final cl3 g;

    public bo3(Set set, cl3 cl3Var) {
        this.f = set;
        this.g = cl3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        zt0.D(this.g.c(obj));
        return this.f.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zt0.D(this.g.c(it.next()));
        }
        return this.f.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f;
        boolean z = set instanceof RandomAccess;
        cl3 cl3Var = this.g;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            cl3Var.getClass();
            while (it.hasNext()) {
                if (cl3Var.c(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        cl3Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!cl3Var.c(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        bd2.Q(list, cl3Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        bd2.Q(list, cl3Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.g.c(obj);
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
        return m54.U(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return m54.N(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f.iterator();
        cl3 cl3Var = this.g;
        zt0.d0(cl3Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (cl3Var.c(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f.iterator();
        it.getClass();
        cl3 cl3Var = this.g;
        cl3Var.getClass();
        return new gn3(it, cl3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.g.c(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.g.c(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.g.c(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return gi2.C((yq2) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return gi2.C((yq2) iterator()).toArray(objArr);
    }
}
