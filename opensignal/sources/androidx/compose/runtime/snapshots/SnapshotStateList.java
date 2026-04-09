package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import ar.k;
import cr.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import n0.g1;
import r0.c;
import r0.i;
import x0.a;
import x0.f;
import x0.l;
import x0.o;
import x0.p;
import x0.s;
import x0.t;
import x0.v;
import x0.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lx0/t;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, t, List<T>, RandomAccess, b {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public s f1119a;

    public SnapshotStateList(c cVar) {
        f fVarK = l.k();
        s sVar = new s(fVarK.g(), cVar);
        if (!(fVarK instanceof a)) {
            sVar.f24752b = new s(1, cVar);
        }
        this.f1119a = sVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarC = cVar.c(obj);
            if (cVarC.equals(cVar)) {
                return false;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i10, cVarC, true);
            }
            l.n(fVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i10, final Collection collection) {
        return p.g(this, new k() { // from class: x0.n
            @Override // ar.k
            public final Object a(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i10, collection));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f fVarK;
        s sVar = this.f1119a;
        br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (l.f24717c) {
            fVarK = l.k();
            s sVar2 = (s) l.w(sVar, this, fVarK);
            synchronized (p.f24727a) {
                sVar2.f24747c = i.f21133d;
                sVar2.f24748d++;
                sVar2.f24749e++;
            }
        }
        l.n(fVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return p.e(this).f24747c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return p.e(this).f24747c.containsAll(collection);
    }

    @Override // x0.t
    public final void d(v vVar) {
        vVar.f24752b = this.f1119a;
        this.f1119a = (s) vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // x0.t
    public final v e() {
        return this.f1119a;
    }

    public final void g(int i10, int i11) {
        int i12;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i12 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            r0.f fVarE = cVar.e();
            fVarE.subList(i10, i11).clear();
            c cVarC = fVarE.c();
            if (br.l.a(cVarC, cVar)) {
                return;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i12, cVarC, true);
            }
            l.n(fVarK, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return p.e(this).f24747c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return p.e(this).f24747c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return p.e(this).f24747c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return p.e(this).f24747c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new nq.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        c cVar;
        f fVarK;
        boolean zB;
        Object obj = get(i10);
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i11 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarJ = cVar.j(i10);
            if (cVarJ.equals(cVar)) {
                break;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i11, cVarJ, true);
            }
            l.n(fVarK, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarG = cVar.g(new r0.b(0, collection));
            if (br.l.a(cVarG, cVar)) {
                return false;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i10, cVarG, true);
            }
            l.n(fVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p.g(this, new r0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        c cVar;
        f fVarK;
        boolean zB;
        Object obj2 = get(i10);
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i11 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarK = cVar.k(i10, obj);
            if (cVarK.equals(cVar)) {
                break;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i11, cVarK, false);
            }
            l.n(fVarK, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return p.e(this).f24747c.a();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            g1.a("fromIndex or toIndex are out of bounds");
        }
        return new w(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return br.l.m(this);
    }

    public final String toString() {
        s sVar = this.f1119a;
        br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((s) l.i(sVar)).f24747c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        c cVar = p.e(this).f24747c;
        int iA = cVar.a();
        parcel.writeInt(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            parcel.writeValue(cVar.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarD = cVar.d(collection);
            if (br.l.a(cVarD, cVar)) {
                return false;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i10, cVarD, true);
            }
            l.n(fVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new nq.a(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return br.l.n(this, objArr);
    }

    public SnapshotStateList() {
        this(i.f21133d);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i11 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            c cVarB = cVar.b(i10, obj);
            if (cVarB.equals(cVar)) {
                return;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i11, cVarB, true);
            }
            l.n(fVarK, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        c cVar;
        f fVarK;
        boolean zB;
        do {
            synchronized (p.f24727a) {
                s sVar = this.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            c cVarJ = iIndexOf != -1 ? cVar.j(iIndexOf) : cVar;
            if (cVarJ.equals(cVar)) {
                return false;
            }
            s sVar3 = this.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = p.b((s) l.w(sVar3, this, fVarK), i10, cVarJ, true);
            }
            l.n(fVarK, this);
        } while (!zB);
        return true;
    }
}
