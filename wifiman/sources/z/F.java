package z;

import T.InterfaceC3551q0;
import T.t1;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class F implements C0.x, D0.d, D0.j {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f66791a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f66792b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f66793c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f66794a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f66796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar, int i10, int i11) {
            super(1);
            this.f66794a = tVar;
            this.f66795b = i10;
            this.f66796c = i11;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f66794a, this.f66795b, this.f66796c, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public F(f0 f0Var) {
        this.f66791a = f0Var;
        this.f66792b = t1.d(f0Var, null, 2, null);
        this.f66793c = t1.d(f0Var, null, 2, null);
    }

    private final f0 a() {
        return (f0) this.f66793c.getValue();
    }

    private final f0 c() {
        return (f0) this.f66792b.getValue();
    }

    private final void e(f0 f0Var) {
        this.f66793c.setValue(f0Var);
    }

    private final void f(f0 f0Var) {
        this.f66792b.setValue(f0Var);
    }

    @Override // D0.d
    public void Z0(D0.k kVar) {
        f0 f0Var = (f0) kVar.z(i0.b());
        f(h0.g(this.f66791a, f0Var));
        e(h0.h(f0Var, this.f66791a));
    }

    @Override // C0.x
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        int iD = c().d(mVar, mVar.getLayoutDirection());
        int iC = c().c(mVar);
        int iA = c().a(mVar, mVar.getLayoutDirection()) + iD;
        int iB = c().b(mVar) + iC;
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.n(j10, -iA, -iB));
        return androidx.compose.ui.layout.m.x0(mVar, Y0.c.i(j10, tVarT.I0() + iA), Y0.c.h(j10, tVarT.C0() + iB), null, new a(tVarT, iD, iC), 4, null);
    }

    @Override // D0.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f0 getValue() {
        return a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return AbstractC6492s.d(((F) obj).f66791a, this.f66791a);
        }
        return false;
    }

    @Override // D0.j
    public D0.l getKey() {
        return i0.b();
    }

    public int hashCode() {
        return this.f66791a.hashCode();
    }
}
