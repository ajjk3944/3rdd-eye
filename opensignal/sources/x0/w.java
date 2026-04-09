package x0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import mq.c0;
import n0.g1;

/* loaded from: classes.dex */
public final class w implements List, cr.b {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f24753a;

    /* renamed from: d, reason: collision with root package name */
    public final int f24754d;

    /* renamed from: g, reason: collision with root package name */
    public int f24755g;

    /* renamed from: r, reason: collision with root package name */
    public int f24756r;

    public w(SnapshotStateList snapshotStateList, int i10, int i11) {
        this.f24753a = snapshotStateList;
        this.f24754d = i10;
        this.f24755g = p.f(snapshotStateList);
        this.f24756r = i11 - i10;
    }

    public final void a() {
        if (p.f(this.f24753a) != this.f24755g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i10 = this.f24754d + this.f24756r;
        SnapshotStateList snapshotStateList = this.f24753a;
        snapshotStateList.add(i10, obj);
        this.f24756r++;
        this.f24755g = p.f(snapshotStateList);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f24756r, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f24756r > 0) {
            a();
            int i10 = this.f24756r;
            int i11 = this.f24754d;
            SnapshotStateList snapshotStateList = this.f24753a;
            snapshotStateList.g(i11, i10 + i11);
            this.f24756r = 0;
            this.f24755g = p.f(snapshotStateList);
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
    public final Object get(int i10) {
        a();
        p.a(i10, this.f24756r);
        return this.f24753a.get(this.f24754d + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i10 = this.f24756r;
        int i11 = this.f24754d;
        Iterator it = vc.e.T(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((hr.c) it).nextInt();
            if (br.l.a(obj, this.f24753a.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f24756r == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i10 = this.f24756r;
        int i11 = this.f24754d;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (br.l.a(obj, this.f24753a.get(i12))) {
                return i12 - i11;
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
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        r0.c cVar;
        f fVarK;
        boolean zB;
        a();
        SnapshotStateList snapshotStateList = this.f24753a;
        int i11 = this.f24754d;
        int i12 = this.f24756r + i11;
        int size = snapshotStateList.size();
        do {
            synchronized (p.f24727a) {
                s sVar = snapshotStateList.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            r0.f fVarE = cVar.e();
            fVarE.subList(i11, i12).retainAll(collection);
            r0.c cVarC = fVarE.c();
            if (br.l.a(cVarC, cVar)) {
                break;
            }
            s sVar3 = snapshotStateList.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, snapshotStateList, fVarK), i10, cVarC, true);
            }
            l.n(fVarK, snapshotStateList);
        } while (!zB);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f24755g = p.f(this.f24753a);
            this.f24756r -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        p.a(i10, this.f24756r);
        a();
        int i11 = i10 + this.f24754d;
        SnapshotStateList snapshotStateList = this.f24753a;
        Object obj2 = snapshotStateList.set(i11, obj);
        this.f24755g = p.f(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f24756r;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f24756r)) {
            g1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i12 = this.f24754d;
        return new w(this.f24753a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return br.l.m(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        a();
        br.u uVar = new br.u();
        uVar.f2915a = i10 - 1;
        return new c0(uVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return br.l.n(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        int i11 = i10 + this.f24754d;
        SnapshotStateList snapshotStateList = this.f24753a;
        boolean zAddAll = snapshotStateList.addAll(i11, collection);
        if (zAddAll) {
            this.f24756r = collection.size() + this.f24756r;
            this.f24755g = p.f(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        a();
        int i11 = this.f24754d + i10;
        SnapshotStateList snapshotStateList = this.f24753a;
        Object objRemove = snapshotStateList.remove(i11);
        this.f24756r--;
        this.f24755g = p.f(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        a();
        int i11 = this.f24754d + i10;
        SnapshotStateList snapshotStateList = this.f24753a;
        snapshotStateList.add(i11, obj);
        this.f24756r++;
        this.f24755g = p.f(snapshotStateList);
    }
}
