package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d41 extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10319a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f10320b;

    /* renamed from: c, reason: collision with root package name */
    public final d41 f10321c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f10322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p51 f10323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p51 f10324f;

    public d41(p51 p51Var, Object obj, List list, d41 d41Var) {
        this.f10324f = p51Var;
        this.f10323e = p51Var;
        this.f10319a = obj;
        this.f10320b = list;
        this.f10321c = d41Var;
        this.f10322d = d41Var == null ? null : d41Var.f10320b;
    }

    public final void a() {
        d41 d41Var = this.f10321c;
        if (d41Var != null) {
            d41Var.a();
            if (d41Var.f10320b != this.f10322d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f10320b.isEmpty()) {
            Collection collection = (Collection) this.f10323e.f14901d.get(this.f10319a);
            if (collection != null) {
                this.f10320b = collection;
            }
        }
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        a();
        boolean zIsEmpty = this.f10320b.isEmpty();
        ((List) this.f10320b).add(i4, obj);
        this.f10324f.f14902e++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f10320b).addAll(i4, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f10324f.f14902e += this.f10320b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    public final void c() {
        d41 d41Var = this.f10321c;
        if (d41Var != null) {
            d41Var.c();
        } else if (this.f10320b.isEmpty()) {
            this.f10323e.f14901d.remove(this.f10319a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f10320b.clear();
        this.f10323e.f14902e -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.f10320b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.f10320b.containsAll(collection);
    }

    public final void d() {
        d41 d41Var = this.f10321c;
        if (d41Var != null) {
            d41Var.d();
        } else {
            this.f10323e.f14901d.put(this.f10319a, this.f10320b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f10320b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        a();
        return ((List) this.f10320b).get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.f10320b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f10320b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new u31(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f10320b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new c41(this);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        a();
        Object objRemove = ((List) this.f10320b).remove(i4);
        p51 p51Var = this.f10324f;
        p51Var.f14902e--;
        c();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f10320b.removeAll(collection);
        if (zRemoveAll) {
            this.f10323e.f14902e += this.f10320b.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f10320b.retainAll(collection);
        if (zRetainAll) {
            this.f10323e.f14902e += this.f10320b.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        a();
        return ((List) this.f10320b).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.f10320b.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i10) {
        a();
        List listSubList = ((List) this.f10320b).subList(i4, i10);
        d41 d41Var = this.f10321c;
        if (d41Var == null) {
            d41Var = this;
        }
        p51 p51Var = this.f10324f;
        p51Var.getClass();
        boolean z3 = listSubList instanceof RandomAccess;
        Object obj = this.f10319a;
        return z3 ? new z31(p51Var, obj, listSubList, d41Var) : new d41(p51Var, obj, listSubList, d41Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f10320b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        a();
        return new c41(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean zRemove = this.f10320b.remove(obj);
        if (zRemove) {
            p51 p51Var = this.f10323e;
            p51Var.f14902e--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean zIsEmpty = this.f10320b.isEmpty();
        boolean zAdd = this.f10320b.add(obj);
        if (zAdd) {
            this.f10323e.f14902e++;
            if (zIsEmpty) {
                d();
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
        boolean zAddAll = this.f10320b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f10323e.f14902e += this.f10320b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }
}
