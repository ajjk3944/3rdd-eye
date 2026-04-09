package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class cm3 extends AbstractCollection implements List {
    public final Object f;
    public Collection g;
    public final cm3 h;
    public final Collection i;
    public final /* synthetic */ pn3 j;
    public final /* synthetic */ pn3 k;

    public cm3(pn3 pn3Var, Object obj, List list, cm3 cm3Var) {
        this.k = pn3Var;
        this.j = pn3Var;
        this.f = obj;
        this.g = list;
        this.h = cm3Var;
        this.i = cm3Var == null ? null : cm3Var.g;
    }

    public final void a() {
        cm3 cm3Var = this.h;
        if (cm3Var != null) {
            cm3Var.a();
            if (cm3Var.g != this.i) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.g.isEmpty()) {
            Collection collection = (Collection) this.j.i.get(this.f);
            if (collection != null) {
                this.g = collection;
            }
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean zIsEmpty = this.g.isEmpty();
        ((List) this.g).add(i, obj);
        this.k.j++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.g).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.k.j += this.g.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    public final void b() {
        cm3 cm3Var = this.h;
        if (cm3Var != null) {
            cm3Var.b();
        } else if (this.g.isEmpty()) {
            this.j.i.remove(this.f);
        }
    }

    public final void c() {
        cm3 cm3Var = this.h;
        if (cm3Var != null) {
            cm3Var.c();
        } else {
            this.j.i.put(this.f, this.g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.g.clear();
        this.j.j -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.g.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.g.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.g).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.g.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.g).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new tl3(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.g).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new bm3(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = ((List) this.g).remove(i);
        pn3 pn3Var = this.k;
        pn3Var.j--;
        b();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.g.removeAll(collection);
        if (zRemoveAll) {
            this.j.j += this.g.size() - size;
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.g.retainAll(collection);
        if (zRetainAll) {
            this.j.j += this.g.size() - size;
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.g).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.g.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        a();
        List listSubList = ((List) this.g).subList(i, i2);
        cm3 cm3Var = this.h;
        if (cm3Var == null) {
            cm3Var = this;
        }
        pn3 pn3Var = this.k;
        pn3Var.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f;
        return z ? new yl3(pn3Var, obj, listSubList, cm3Var) : new cm3(pn3Var, obj, listSubList, cm3Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.g.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new bm3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean zRemove = this.g.remove(obj);
        if (zRemove) {
            pn3 pn3Var = this.j;
            pn3Var.j--;
            b();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean zIsEmpty = this.g.isEmpty();
        boolean zAdd = this.g.add(obj);
        if (zAdd) {
            this.j.j++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.g.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.j.j += this.g.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }
}
