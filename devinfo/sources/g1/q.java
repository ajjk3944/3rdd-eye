package g1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import u0.j1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements Parcelable, x, List, RandomAccess, ok.c {
    public static final Parcelable.Creator<q> CREATOR = new p(0);

    /* renamed from: a, reason: collision with root package name */
    public w f24270a;

    public q(y0.b bVar) {
        g gVarJ = m.j();
        w wVar = new w(gVarJ.g(), bVar);
        if (!(gVarJ instanceof b)) {
            wVar.f24300b = new w(1, bVar);
        }
        this.f24270a = wVar;
    }

    @Override // g1.x
    public final z a() {
        return this.f24270a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i4;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarC = bVar.c(obj);
            if (bVarC.equals(bVar)) {
                return false;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i4, bVarC, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        return r.l(this, new b7.j(i4, collection, 3));
    }

    @Override // g1.x
    public final /* synthetic */ z c(z zVar, z zVar2, z zVar3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarJ;
        w wVar = this.f24270a;
        nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (m.f24260c) {
            gVarJ = m.j();
            w wVar2 = (w) m.x(wVar, this, gVarJ);
            synchronized (r.f24271a) {
                wVar2.f24295c = y0.h.f37308b;
                wVar2.f24296d++;
                wVar2.f24297e++;
            }
        }
        m.o(gVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return r.h(this).f24295c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.h(this).f24295c.containsAll(collection);
    }

    @Override // g1.x
    public final void d(z zVar) {
        zVar.f24300b = this.f24270a;
        this.f24270a = (w) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(int i4, int i10) {
        int i11;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i11 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.e eVarF = bVar.f();
            eVarF.subList(i4, i10).clear();
            y0.b bVarD = eVarF.d();
            if (nk.k.a(bVarD, bVar)) {
                return;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i11, bVarD, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return r.h(this).f24295c.get(i4);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return r.h(this).f24295c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return r.h(this).f24295c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return r.h(this).f24295c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ak.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        int i10;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        Object obj = get(i4);
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i10 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarI = bVar.i(i4);
            if (bVarI.equals(bVar)) {
                break;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i10, bVarI, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i4;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarG = bVar.g(new o(1, collection));
            if (nk.k.a(bVarG, bVar)) {
                return false;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i4, bVarG, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return r.l(this, new o(0, collection));
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        int i10;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        Object obj2 = get(i4);
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i10 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarJ = bVar.j(i4, obj);
            if (bVarJ.equals(bVar)) {
                break;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i10, bVarJ, false);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return r.h(this).f24295c.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i10) {
        if (!(i4 >= 0 && i4 <= i10 && i10 <= size())) {
            j1.a("fromIndex or toIndex are out of bounds");
        }
        return new d0(this, i4, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nk.j.a(this);
    }

    public final String toString() {
        w wVar = this.f24270a;
        nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((w) m.h(wVar)).f24295c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        y0.b bVar = r.h(this).f24295c;
        int size = bVar.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeValue(bVar.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i4;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarD = bVar.d(collection);
            if (nk.k.a(bVarD, bVar)) {
                return false;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i4, bVarD, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return new ak.a(this, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nk.j.b(this, objArr);
    }

    public q() {
        this(y0.h.f37308b);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i10 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.b bVarA = bVar.a(i4, obj);
            if (bVarA.equals(bVar)) {
                return;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i10, bVarA, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i4;
        y0.b bVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f24271a) {
                w wVar = this.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            int iIndexOf = bVar.indexOf(obj);
            y0.b bVarI = iIndexOf != -1 ? bVar.i(iIndexOf) : bVar;
            if (bVarI.equals(bVar)) {
                return false;
            }
            w wVar3 = this.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = r.b((w) m.x(wVar3, this, gVarJ), i4, bVarI, true);
            }
            m.o(gVarJ, this);
        } while (!zB);
        return true;
    }
}
