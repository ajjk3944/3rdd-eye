package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1787rB extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16479a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f16480b;

    /* renamed from: c, reason: collision with root package name */
    public final C1787rB f16481c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f16482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0978cC f16483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0978cC f16484f;

    public C1787rB(C0978cC c0978cC, Object obj, List list, C1787rB c1787rB) {
        this.f16484f = c0978cC;
        this.f16483e = c0978cC;
        this.f16479a = obj;
        this.f16480b = list;
        this.f16481c = c1787rB;
        this.f16482d = c1787rB == null ? null : c1787rB.f16480b;
    }

    public final void a() {
        C1787rB c1787rB = this.f16481c;
        if (c1787rB != null) {
            c1787rB.a();
            if (c1787rB.f16480b != this.f16482d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f16480b.isEmpty()) {
            Collection collection = (Collection) this.f16483e.f13540d.get(this.f16479a);
            if (collection != null) {
                this.f16480b = collection;
            }
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean zIsEmpty = this.f16480b.isEmpty();
        ((List) this.f16480b).add(i, obj);
        this.f16484f.f13541e++;
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
        boolean zAddAll = ((List) this.f16480b).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f16484f.f13541e += this.f16480b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    public final void b() {
        C1787rB c1787rB = this.f16481c;
        if (c1787rB != null) {
            c1787rB.b();
        } else if (this.f16480b.isEmpty()) {
            this.f16483e.f13540d.remove(this.f16479a);
        }
    }

    public final void c() {
        C1787rB c1787rB = this.f16481c;
        if (c1787rB != null) {
            c1787rB.c();
        } else {
            this.f16483e.f13540d.put(this.f16479a, this.f16480b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f16480b.clear();
        this.f16483e.f13541e -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.f16480b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.f16480b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f16480b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.f16480b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.f16480b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f16480b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new C1304iB(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f16480b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new C1734qB(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = ((List) this.f16480b).remove(i);
        C0978cC c0978cC = this.f16484f;
        c0978cC.f13541e--;
        b();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f16480b.removeAll(collection);
        if (zRemoveAll) {
            this.f16483e.f13541e += this.f16480b.size() - size;
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f16480b.retainAll(collection);
        if (zRetainAll) {
            this.f16483e.f13541e += this.f16480b.size() - size;
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.f16480b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.f16480b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        a();
        List listSubList = ((List) this.f16480b).subList(i, i3);
        C1787rB c1787rB = this.f16481c;
        if (c1787rB == null) {
            c1787rB = this;
        }
        C0978cC c0978cC = this.f16484f;
        c0978cC.getClass();
        boolean z6 = listSubList instanceof RandomAccess;
        Object obj = this.f16479a;
        return z6 ? new C1572nB(c0978cC, obj, listSubList, c1787rB) : new C1787rB(c0978cC, obj, listSubList, c1787rB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f16480b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new C1734qB(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean zRemove = this.f16480b.remove(obj);
        if (zRemove) {
            C0978cC c0978cC = this.f16483e;
            c0978cC.f13541e--;
            b();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean zIsEmpty = this.f16480b.isEmpty();
        boolean zAdd = this.f16480b.add(obj);
        if (zAdd) {
            this.f16483e.f13541e++;
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
        boolean zAddAll = this.f16480b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f16483e.f13541e += this.f16480b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }
}
