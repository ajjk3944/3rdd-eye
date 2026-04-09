package oe;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class n extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19355a;

    /* renamed from: d, reason: collision with root package name */
    public Collection f19356d;

    /* renamed from: g, reason: collision with root package name */
    public final n f19357g;

    /* renamed from: r, reason: collision with root package name */
    public final Collection f19358r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f19359x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q0 f19360y;

    public n(q0 q0Var, Object obj, List list, n nVar) {
        this.f19360y = q0Var;
        this.f19359x = q0Var;
        this.f19355a = obj;
        this.f19356d = list;
        this.f19357g = nVar;
        this.f19358r = nVar == null ? null : nVar.f19356d;
    }

    public final void a() {
        n nVar = this.f19357g;
        if (nVar != null) {
            nVar.a();
        } else {
            this.f19359x.f19369r.put(this.f19355a, this.f19356d);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f19356d.isEmpty();
        boolean zAdd = this.f19356d.add(obj);
        if (zAdd) {
            this.f19359x.f19370x++;
            if (zIsEmpty) {
                a();
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
        boolean zAddAll = this.f19356d.addAll(collection);
        if (zAddAll) {
            this.f19359x.f19370x += this.f19356d.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        n nVar = this.f19357g;
        if (nVar != null) {
            nVar.b();
            if (nVar.f19356d != this.f19358r) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f19356d.isEmpty() || (collection = (Collection) this.f19359x.f19369r.get(this.f19355a)) == null) {
                return;
            }
            this.f19356d = collection;
        }
    }

    public final void c() {
        n nVar = this.f19357g;
        if (nVar != null) {
            nVar.c();
        } else if (this.f19356d.isEmpty()) {
            this.f19359x.f19369r.remove(this.f19355a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f19356d.clear();
        this.f19359x.f19370x -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f19356d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f19356d.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f19356d.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        return ((List) this.f19356d).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f19356d.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f19356d).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new e(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f19356d).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f19356d.remove(obj);
        if (zRemove) {
            q0 q0Var = this.f19359x;
            q0Var.f19370x--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f19356d.removeAll(collection);
        if (zRemoveAll) {
            this.f19359x.f19370x += this.f19356d.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f19356d.retainAll(collection);
        if (zRetainAll) {
            this.f19359x.f19370x += this.f19356d.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        b();
        return ((List) this.f19356d).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f19356d.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        b();
        List listSubList = ((List) this.f19356d).subList(i10, i11);
        n nVar = this.f19357g;
        if (nVar == null) {
            nVar = this;
        }
        boolean z10 = listSubList instanceof RandomAccess;
        q0 q0Var = this.f19360y;
        Object obj = this.f19355a;
        return z10 ? new j(q0Var, obj, listSubList, nVar) : new n(q0Var, obj, listSubList, nVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f19356d.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        return new m(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        Object objRemove = ((List) this.f19356d).remove(i10);
        q0 q0Var = this.f19360y;
        q0Var.f19370x--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        boolean zIsEmpty = this.f19356d.isEmpty();
        ((List) this.f19356d).add(i10, obj);
        this.f19360y.f19370x++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f19356d).addAll(i10, collection);
        if (zAddAll) {
            this.f19360y.f19370x += this.f19356d.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
