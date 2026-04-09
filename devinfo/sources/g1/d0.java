package g1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import u0.j1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements List, ok.c {

    /* renamed from: a, reason: collision with root package name */
    public final q f24220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24221b;

    /* renamed from: c, reason: collision with root package name */
    public int f24222c;

    /* renamed from: d, reason: collision with root package name */
    public int f24223d;

    public d0(q qVar, int i4, int i10) {
        this.f24220a = qVar;
        this.f24221b = i4;
        this.f24222c = r.j(qVar);
        this.f24223d = i10 - i4;
    }

    public final void a() {
        if (r.j(this.f24220a) != this.f24222c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i4 = this.f24221b + this.f24223d;
        q qVar = this.f24220a;
        qVar.add(i4, obj);
        this.f24223d++;
        this.f24222c = r.j(qVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f24223d, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f24223d > 0) {
            a();
            int i4 = this.f24223d;
            int i10 = this.f24221b;
            q qVar = this.f24220a;
            qVar.f(i10, i4 + i10);
            this.f24223d = 0;
            this.f24222c = r.j(qVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
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

    @Override // java.util.List
    public final Object get(int i4) {
        a();
        r.a(i4, this.f24223d);
        return this.f24220a.get(this.f24221b + i4);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i4 = this.f24223d;
        int i10 = this.f24221b;
        Iterator it = ci.b.E(i10, i4 + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((sk.c) it).nextInt();
            if (nk.k.a(obj, this.f24220a.get(iNextInt))) {
                return iNextInt - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f24223d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i4 = this.f24223d;
        int i10 = this.f24221b;
        for (int i11 = (i4 + i10) - 1; i11 >= i10; i11--) {
            if (nk.k.a(obj, this.f24220a.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i4;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        a();
        q qVar = this.f24220a;
        int i10 = this.f24221b;
        int i11 = this.f24223d + i10;
        int size = qVar.size();
        do {
            synchronized (r.f24271a) {
                w wVar = qVar.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.e eVarF = bVar.f();
            eVarF.subList(i10, i11).retainAll(collection);
            y0.b bVarD = eVarF.d();
            if (nk.k.a(bVarD, bVar)) {
                break;
            }
            w wVar3 = qVar.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, qVar, gVarJ), i4, bVarD, true);
            }
            m.o(gVarJ, qVar);
        } while (!zB);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f24222c = r.j(this.f24220a);
            this.f24223d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        r.a(i4, this.f24223d);
        a();
        int i10 = i4 + this.f24221b;
        q qVar = this.f24220a;
        Object obj2 = qVar.set(i10, obj);
        this.f24222c = r.j(qVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f24223d;
    }

    @Override // java.util.List
    public final List subList(int i4, int i10) {
        if (!(i4 >= 0 && i4 <= i10 && i10 <= this.f24223d)) {
            j1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i11 = this.f24221b;
        return new d0(this.f24220a, i4 + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nk.j.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        a();
        nk.s sVar = new nk.s();
        sVar.f29984a = i4 - 1;
        return new c0(sVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nk.j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        a();
        int i10 = i4 + this.f24221b;
        q qVar = this.f24220a;
        boolean zAddAll = qVar.addAll(i10, collection);
        if (zAddAll) {
            this.f24223d = collection.size() + this.f24223d;
            this.f24222c = r.j(qVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        a();
        int i10 = this.f24221b + i4;
        q qVar = this.f24220a;
        Object objRemove = qVar.remove(i10);
        this.f24223d--;
        this.f24222c = r.j(qVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        a();
        int i10 = this.f24221b + i4;
        q qVar = this.f24220a;
        qVar.add(i10, obj);
        this.f24223d++;
        this.f24222c = r.j(qVar);
    }
}
