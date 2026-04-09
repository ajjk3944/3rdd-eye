package T;

import d0.AbstractC5280l;
import d0.InterfaceC5275g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class j1 extends AbstractC5280l implements InterfaceC3543m0, InterfaceC5275g {

    /* renamed from: b, reason: collision with root package name */
    private a f21094b;

    private static final class a extends androidx.compose.runtime.snapshots.n {

        /* renamed from: c, reason: collision with root package name */
        private float f21095c;

        public a(float f10) {
            this.f21095c = f10;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f21095c = ((a) nVar).f21095c;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a(this.f21095c);
        }

        public final float i() {
            return this.f21095c;
        }

        public final void j(float f10) {
            this.f21095c = f10;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(float f10) {
            j1.this.k(f10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Yg.J.f24997a;
        }
    }

    public j1(float f10) {
        a aVar = new a(f10);
        if (androidx.compose.runtime.snapshots.g.f28632e.e()) {
            a aVar2 = new a(f10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f21094b = aVar;
    }

    @Override // T.InterfaceC3551q0
    public InterfaceC6835l b() {
        return new b();
    }

    @Override // T.InterfaceC3543m0, T.P
    public float c() {
        return ((a) androidx.compose.runtime.snapshots.j.X(this.f21094b, this)).i();
    }

    @Override // d0.InterfaceC5275g
    public n1 d() {
        return o1.p();
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f21094b = (a) nVar;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f21094b;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n j(androidx.compose.runtime.snapshots.n nVar, androidx.compose.runtime.snapshots.n nVar2, androidx.compose.runtime.snapshots.n nVar3) {
        AbstractC6492s.g(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        AbstractC6492s.g(nVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) nVar2).i() == ((a) nVar3).i()) {
            return nVar2;
        }
        return null;
    }

    @Override // T.InterfaceC3543m0
    public void k(float f10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f21094b);
        if (aVar.i() == f10) {
            return;
        }
        a aVar2 = this.f21094b;
        androidx.compose.runtime.snapshots.j.J();
        synchronized (androidx.compose.runtime.snapshots.j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
            ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).j(f10);
            Yg.J j10 = Yg.J.f24997a;
        }
        androidx.compose.runtime.snapshots.j.Q(gVarC, this);
    }

    @Override // T.InterfaceC3551q0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(c());
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) androidx.compose.runtime.snapshots.j.F(this.f21094b)).i() + ")@" + hashCode();
    }
}
