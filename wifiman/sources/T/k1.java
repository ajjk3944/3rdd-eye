package T;

import d0.AbstractC5280l;
import d0.InterfaceC5275g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class k1 extends AbstractC5280l implements InterfaceC3545n0, InterfaceC5275g {

    /* renamed from: b, reason: collision with root package name */
    private a f21097b;

    private static final class a extends androidx.compose.runtime.snapshots.n {

        /* renamed from: c, reason: collision with root package name */
        private int f21098c;

        public a(int i10) {
            this.f21098c = i10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f21098c = ((a) nVar).f21098c;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a(this.f21098c);
        }

        public final int i() {
            return this.f21098c;
        }

        public final void j(int i10) {
            this.f21098c = i10;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(int i10) {
            k1.this.l(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Yg.J.f24997a;
        }
    }

    public k1(int i10) {
        a aVar = new a(i10);
        if (androidx.compose.runtime.snapshots.g.f28632e.e()) {
            a aVar2 = new a(i10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f21097b = aVar;
    }

    @Override // T.InterfaceC3551q0
    public InterfaceC6835l b() {
        return new b();
    }

    @Override // d0.InterfaceC5275g
    public n1 d() {
        return o1.p();
    }

    @Override // T.InterfaceC3545n0, T.W
    public int e() {
        return ((a) androidx.compose.runtime.snapshots.j.X(this.f21097b, this)).i();
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f21097b = (a) nVar;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f21097b;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n j(androidx.compose.runtime.snapshots.n nVar, androidx.compose.runtime.snapshots.n nVar2, androidx.compose.runtime.snapshots.n nVar3) {
        AbstractC6492s.g(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        AbstractC6492s.g(nVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) nVar2).i() == ((a) nVar3).i()) {
            return nVar2;
        }
        return null;
    }

    @Override // T.InterfaceC3545n0
    public void l(int i10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f21097b);
        if (aVar.i() != i10) {
            a aVar2 = this.f21097b;
            androidx.compose.runtime.snapshots.j.J();
            synchronized (androidx.compose.runtime.snapshots.j.I()) {
                gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
                ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).j(i10);
                Yg.J j10 = Yg.J.f24997a;
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        }
    }

    @Override // T.InterfaceC3551q0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer f() {
        return Integer.valueOf(e());
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) androidx.compose.runtime.snapshots.j.F(this.f21097b)).i() + ")@" + hashCode();
    }
}
