package g1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements Parcelable, x, Set, RandomAccess, ok.e {
    public static final Parcelable.Creator<v> CREATOR = new p(3);

    /* renamed from: a, reason: collision with root package name */
    public b0 f24294a;

    public v() {
        a1.b bVar = a1.b.f154d;
        b0 b0Var = new b0(m.j().g(), bVar);
        if (m.f24259b.get() != null) {
            b0Var.f24300b = new b0(1, bVar);
        }
        this.f24294a = b0Var;
    }

    @Override // g1.x
    public final z a() {
        return this.f24294a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i4;
        x0.b bVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f24272b) {
                b0 b0Var = this.f24294a;
                nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                b0 b0Var2 = (b0) m.h(b0Var);
                i4 = b0Var2.f24206d;
                bVar = b0Var2.f24205c;
            }
            nk.k.b(bVar);
            a1.b bVarA = ((a1.b) bVar).a(obj);
            if (bVarA.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.f24294a;
            nk.k.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zC = r.c((b0) m.x(b0Var3, this, gVarJ), i4, bVarA);
            }
            m.o(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i4;
        x0.b bVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f24272b) {
                b0 b0Var = this.f24294a;
                nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                b0 b0Var2 = (b0) m.h(b0Var);
                i4 = b0Var2.f24206d;
                bVar = b0Var2.f24205c;
            }
            nk.k.b(bVar);
            a1.c cVar = new a1.c((a1.b) bVar);
            cVar.addAll(collection);
            a1.b bVarC = cVar.c();
            if (bVarC.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.f24294a;
            nk.k.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zC = r.c((b0) m.x(b0Var3, this, gVarJ), i4, bVarC);
            }
            m.o(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // g1.x
    public final /* synthetic */ z c(z zVar, z zVar2, z zVar3) {
        return null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        g gVarJ;
        b0 b0Var = this.f24294a;
        nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        synchronized (m.f24260c) {
            gVarJ = m.j();
            b0 b0Var2 = (b0) m.x(b0Var, this, gVarJ);
            synchronized (r.f24272b) {
                b0Var2.f24205c = a1.b.f154d;
                b0Var2.f24206d++;
            }
        }
        m.o(gVarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return r.i(this).f24205c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.i(this).f24205c.containsAll(collection);
    }

    @Override // g1.x
    public final void d(z zVar) {
        zVar.f24300b = this.f24294a;
        this.f24294a = (b0) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return r.i(this).f24205c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a0(this, r.i(this).f24205c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i4;
        x0.b bVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f24272b) {
                b0 b0Var = this.f24294a;
                nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                b0 b0Var2 = (b0) m.h(b0Var);
                i4 = b0Var2.f24206d;
                bVar = b0Var2.f24205c;
            }
            nk.k.b(bVar);
            a1.b bVarC = ((a1.b) bVar).c(obj);
            if (bVarC.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.f24294a;
            nk.k.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zC = r.c((b0) m.x(b0Var3, this, gVarJ), i4, bVarC);
            }
            m.o(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i4;
        x0.b bVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f24272b) {
                b0 b0Var = this.f24294a;
                nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                b0 b0Var2 = (b0) m.h(b0Var);
                i4 = b0Var2.f24206d;
                bVar = b0Var2.f24205c;
            }
            nk.k.b(bVar);
            a1.c cVar = new a1.c((a1.b) bVar);
            cVar.removeAll(collection);
            a1.b bVarC = cVar.c();
            if (bVarC.equals(bVar)) {
                return false;
            }
            b0 b0Var3 = this.f24294a;
            nk.k.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zC = r.c((b0) m.x(b0Var3, this, gVarJ), i4, bVarC);
            }
            m.o(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i4;
        x0.b bVar;
        boolean zRetainAll;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f24272b) {
                b0 b0Var = this.f24294a;
                nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                b0 b0Var2 = (b0) m.h(b0Var);
                i4 = b0Var2.f24206d;
                bVar = b0Var2.f24205c;
            }
            if (bVar == null) {
                throw new IllegalStateException("No set to mutate");
            }
            a1.c cVar = new a1.c((a1.b) bVar);
            zRetainAll = cVar.retainAll(zj.n.v0(collection));
            a1.b bVarC = cVar.c();
            if (bVarC.equals(bVar)) {
                break;
            }
            b0 b0Var3 = this.f24294a;
            nk.k.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zC = r.c((b0) m.x(b0Var3, this, gVarJ), i4, bVarC);
            }
            m.o(gVarJ, this);
        } while (!zC);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return r.i(this).f24205c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nk.j.a(this);
    }

    public final String toString() {
        b0 b0Var = this.f24294a;
        nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((b0) m.h(b0Var)).f24205c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x0.b bVar = r.i(this).f24205c;
        parcel.writeInt(size());
        Iterator it = bVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nk.j.b(this, objArr);
    }
}
