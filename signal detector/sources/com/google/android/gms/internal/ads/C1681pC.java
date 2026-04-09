package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1681pC extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16147a;

    /* renamed from: b, reason: collision with root package name */
    public final RA f16148b;

    public C1681pC(Set set, RA ra) {
        this.f16147a = set;
        this.f16148b = ra;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC0582Jp.m(this.f16148b.b(obj));
        return this.f16147a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC0582Jp.m(this.f16148b.b(it.next()));
        }
        return this.f16147a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f16147a;
        boolean z6 = set instanceof RandomAccess;
        RA ra = this.f16148b;
        if (!z6 || !(set instanceof List)) {
            Iterator it = set.iterator();
            ra.getClass();
            while (it.hasNext()) {
                if (ra.b(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        ra.getClass();
        int i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            if (!ra.b(obj)) {
                if (i3 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        C1476lN.E(list, ra, i, i3);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        C1476lN.E(list, ra, i, i3);
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
        Set set = this.f16147a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f16148b.b(obj);
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
        return C1476lN.F(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C1476lN.z(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f16147a.iterator();
        RA ra = this.f16148b;
        AbstractC0582Jp.j0(ra, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (ra.b(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f16147a.iterator();
        it.getClass();
        RA ra = this.f16148b;
        ra.getClass();
        return new UB(it, ra);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f16147a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f16147a.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f16148b.b(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f16147a.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f16148b.b(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f16147a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f16148b.b(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0582Jp.i((AbstractC1896tC) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0582Jp.i((AbstractC1896tC) iterator()).toArray(objArr);
    }
}
