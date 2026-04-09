package androidx.compose.runtime.snapshots;

import T.B0;
import W.e;
import Yg.J;
import d0.AbstractC5276h;
import d0.InterfaceC5279k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import nh.InterfaceC6947d;

/* loaded from: classes.dex */
public final class k implements InterfaceC5279k, List, RandomAccess, InterfaceC6947d {

    /* renamed from: a, reason: collision with root package name */
    private n f28671a;

    public static final class a extends n {

        /* renamed from: c, reason: collision with root package name */
        private W.e f28672c;

        /* renamed from: d, reason: collision with root package name */
        private int f28673d;

        /* renamed from: e, reason: collision with root package name */
        private int f28674e;

        public a(W.e eVar) {
            this.f28672c = eVar;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n nVar) {
            synchronized (AbstractC5276h.f45708a) {
                AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f28672c = ((a) nVar).f28672c;
                this.f28673d = ((a) nVar).f28673d;
                this.f28674e = ((a) nVar).f28674e;
                J j10 = J.f24997a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.f28672c);
        }

        public final W.e i() {
            return this.f28672c;
        }

        public final int j() {
            return this.f28673d;
        }

        public final int k() {
            return this.f28674e;
        }

        public final void l(W.e eVar) {
            this.f28672c = eVar;
        }

        public final void m(int i10) {
            this.f28673d = i10;
        }

        public final void n(int i10) {
            this.f28674e = i10;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f28676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Collection collection) {
            super(1);
            this.f28675a = i10;
            this.f28676b = collection;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.addAll(this.f28675a, this.f28676b));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f28677a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Collection collection) {
            super(1);
            this.f28677a = collection;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.retainAll(this.f28677a));
        }
    }

    public k() {
        W.e eVarA = W.a.a();
        a aVar = new a(eVarA);
        if (g.f28632e.e()) {
            a aVar2 = new a(eVarA);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f28671a = aVar;
    }

    private final boolean k(InterfaceC6835l interfaceC6835l) {
        int iJ;
        W.e eVarI;
        Object objInvoke;
        g gVarC;
        boolean z10;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            e.a aVarC = eVarI.c();
            objInvoke = interfaceC6835l.invoke(aVarC);
            W.e eVarA = aVarC.a();
            if (AbstractC6492s.d(eVarA, eVarI)) {
                break;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarA);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int iJ;
        W.e eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarAdd = eVarI.add(obj);
            z10 = false;
            if (AbstractC6492s.d(eVarAdd, eVarI)) {
                return false;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        return k(new b(i10, collection));
    }

    public final a b() {
        n nVarI = i();
        AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) j.X((a) nVarI, this);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        g gVarC;
        n nVarI = i();
        AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) nVarI;
        j.J();
        synchronized (j.I()) {
            gVarC = g.f28632e.c();
            a aVar2 = (a) j.h0(aVar, this, gVarC);
            synchronized (AbstractC5276h.f45708a) {
                aVar2.l(W.a.a());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        j.Q(gVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return b().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return b().i().containsAll(collection);
    }

    public int e() {
        return b().i().size();
    }

    public final int f() {
        n nVarI = i();
        AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) j.F((a) nVarI)).k();
    }

    @Override // d0.InterfaceC5279k
    public void g(n nVar) {
        nVar.g(i());
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f28671a = (a) nVar;
    }

    @Override // java.util.List
    public Object get(int i10) {
        return b().i().get(i10);
    }

    @Override // d0.InterfaceC5279k
    public n i() {
        return this.f28671a;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return b().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return b().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return b().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new m(this, 0);
    }

    public Object q(int i10) {
        int iJ;
        W.e eVarI;
        g gVarC;
        boolean z10;
        Object obj = get(i10);
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarF0 = eVarI.f0(i10);
            if (AbstractC6492s.d(eVarF0, eVarI)) {
                break;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarF0);
                        z10 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return obj;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return q(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int iJ;
        W.e eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarRemoveAll = eVarI.removeAll(collection);
            z10 = false;
            if (AbstractC6492s.d(eVarRemoveAll, eVarI)) {
                return false;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemoveAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return k(new c(collection));
    }

    public final void s(int i10, int i11) {
        int iJ;
        W.e eVarI;
        g gVarC;
        boolean z10;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            e.a aVarC = eVarI.c();
            aVarC.subList(i10, i11).clear();
            W.e eVarA = aVarC.a();
            if (AbstractC6492s.d(eVarA, eVarI)) {
                return;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarA);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        int iJ;
        W.e eVarI;
        g gVarC;
        boolean z10;
        Object obj2 = get(i10);
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVar = eVarI.set(i10, obj);
            if (AbstractC6492s.d(eVar, eVarI)) {
                break;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVar);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            B0.a("fromIndex or toIndex are out of bounds");
        }
        return new o(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        n nVarI = i();
        AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) j.F((a) nVarI)).i() + ")@" + hashCode();
    }

    public final int u(Collection collection, int i10, int i11) {
        int iJ;
        W.e eVarI;
        g gVarC;
        boolean z10;
        int size = size();
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            e.a aVarC = eVarI.c();
            aVarC.subList(i10, i11).retainAll(collection);
            W.e eVarA = aVarC.a();
            if (AbstractC6492s.d(eVarA, eVarI)) {
                break;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarA);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        int iJ;
        W.e eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarAddAll = eVarI.addAll(collection);
            z10 = false;
            if (AbstractC6492s.d(eVarAddAll, eVarI)) {
                return false;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAddAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new m(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iJ;
        W.e eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarRemove = eVarI.remove(obj);
            z10 = false;
            if (AbstractC6492s.d(eVarRemove, eVarI)) {
                return false;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        int iJ;
        W.e eVarI;
        g gVarC;
        boolean z10;
        do {
            synchronized (AbstractC5276h.f45708a) {
                n nVarI = i();
                AbstractC6492s.g(nVarI, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) nVarI);
                iJ = aVar.j();
                eVarI = aVar.i();
                J j10 = J.f24997a;
            }
            AbstractC6492s.f(eVarI);
            W.e eVarAdd = eVarI.add(i10, obj);
            if (AbstractC6492s.d(eVarAdd, eVarI)) {
                return;
            }
            n nVarI2 = i();
            AbstractC6492s.g(nVarI2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) nVarI2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.f28632e.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (AbstractC5276h.f45708a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        z10 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
    }
}
