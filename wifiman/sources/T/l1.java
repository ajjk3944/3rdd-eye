package T;

import d0.AbstractC5280l;
import d0.InterfaceC5275g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class l1 extends AbstractC5280l implements InterfaceC3547o0, InterfaceC5275g {

    /* renamed from: b, reason: collision with root package name */
    private a f21109b;

    private static final class a extends androidx.compose.runtime.snapshots.n {

        /* renamed from: c, reason: collision with root package name */
        private long f21110c;

        public a(long j10) {
            this.f21110c = j10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f21110c = ((a) nVar).f21110c;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a(this.f21110c);
        }

        public final long i() {
            return this.f21110c;
        }

        public final void j(long j10) {
            this.f21110c = j10;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(long j10) {
            l1.this.m(j10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Yg.J.f24997a;
        }
    }

    public l1(long j10) {
        a aVar = new a(j10);
        if (androidx.compose.runtime.snapshots.g.f28632e.e()) {
            a aVar2 = new a(j10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f21109b = aVar;
    }

    @Override // T.InterfaceC3547o0, T.InterfaceC3527f0
    public long a() {
        return ((a) androidx.compose.runtime.snapshots.j.X(this.f21109b, this)).i();
    }

    @Override // T.InterfaceC3551q0
    public InterfaceC6835l b() {
        return new b();
    }

    @Override // d0.InterfaceC5275g
    public n1 d() {
        return o1.p();
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f21109b = (a) nVar;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f21109b;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n j(androidx.compose.runtime.snapshots.n nVar, androidx.compose.runtime.snapshots.n nVar2, androidx.compose.runtime.snapshots.n nVar3) {
        AbstractC6492s.g(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        AbstractC6492s.g(nVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) nVar2).i() == ((a) nVar3).i()) {
            return nVar2;
        }
        return null;
    }

    @Override // T.InterfaceC3547o0
    public void m(long j10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f21109b);
        if (aVar.i() != j10) {
            a aVar2 = this.f21109b;
            androidx.compose.runtime.snapshots.j.J();
            synchronized (androidx.compose.runtime.snapshots.j.I()) {
                gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
                ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).j(j10);
                Yg.J j11 = Yg.J.f24997a;
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        }
    }

    @Override // T.InterfaceC3551q0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long f() {
        return Long.valueOf(a());
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) androidx.compose.runtime.snapshots.j.F(this.f21109b)).i() + ")@" + hashCode();
    }
}
