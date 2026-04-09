package T;

import d0.AbstractC5280l;
import d0.InterfaceC5275g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class m1 extends AbstractC5280l implements InterfaceC5275g {

    /* renamed from: b, reason: collision with root package name */
    private final n1 f21173b;

    /* renamed from: c, reason: collision with root package name */
    private a f21174c;

    private static final class a extends androidx.compose.runtime.snapshots.n {

        /* renamed from: c, reason: collision with root package name */
        private Object f21175c;

        public a(Object obj) {
            this.f21175c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f21175c = ((a) nVar).f21175c;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a(this.f21175c);
        }

        public final Object i() {
            return this.f21175c;
        }

        public final void j(Object obj) {
            this.f21175c = obj;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(Object obj) {
            m1.this.setValue(obj);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Yg.J.f24997a;
        }
    }

    public m1(Object obj, n1 n1Var) {
        this.f21173b = n1Var;
        a aVar = new a(obj);
        if (androidx.compose.runtime.snapshots.g.f28632e.e()) {
            a aVar2 = new a(obj);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f21174c = aVar;
    }

    @Override // T.InterfaceC3551q0
    public InterfaceC6835l b() {
        return new b();
    }

    @Override // d0.InterfaceC5275g
    public n1 d() {
        return this.f21173b;
    }

    @Override // T.InterfaceC3551q0
    public Object f() {
        return getValue();
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f21174c = (a) nVar;
    }

    @Override // T.InterfaceC3551q0, T.z1
    public Object getValue() {
        return ((a) androidx.compose.runtime.snapshots.j.X(this.f21174c, this)).i();
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f21174c;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n j(androidx.compose.runtime.snapshots.n nVar, androidx.compose.runtime.snapshots.n nVar2, androidx.compose.runtime.snapshots.n nVar3) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) nVar;
        AbstractC6492s.g(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) nVar2;
        AbstractC6492s.g(nVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) nVar3;
        if (d().a(aVar2.i(), aVar3.i())) {
            return nVar2;
        }
        Object objB = d().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        androidx.compose.runtime.snapshots.n nVarD = aVar3.d();
        AbstractC6492s.g(nVarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) nVarD).j(objB);
        return nVarD;
    }

    @Override // T.InterfaceC3551q0
    public void setValue(Object obj) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f21174c);
        if (d().a(aVar.i(), obj)) {
            return;
        }
        a aVar2 = this.f21174c;
        androidx.compose.runtime.snapshots.j.J();
        synchronized (androidx.compose.runtime.snapshots.j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
            ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).j(obj);
            Yg.J j10 = Yg.J.f24997a;
        }
        androidx.compose.runtime.snapshots.j.Q(gVarC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) androidx.compose.runtime.snapshots.j.F(this.f21174c)).i() + ")@" + hashCode();
    }
}
