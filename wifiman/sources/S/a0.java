package s;

import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class a0 extends e.c implements E0.B {

    /* renamed from: n, reason: collision with root package name */
    private androidx.compose.foundation.o f60725n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f60726o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f60727p;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f60729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f60730c;

        /* renamed from: s.a0$a$a, reason: collision with other inner class name */
        static final class C2127a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f60731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f60732b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f60733c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2127a(androidx.compose.ui.layout.t tVar, int i10, int i11) {
                super(1);
                this.f60731a = tVar;
                this.f60732b = i10;
                this.f60733c = i11;
            }

            public final void a(t.a aVar) {
                t.a.p(aVar, this.f60731a, this.f60732b, this.f60733c, 0.0f, null, 12, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f60729b = i10;
            this.f60730c = tVar;
        }

        public final void a(t.a aVar) {
            int iK = AbstractC7978m.k(a0.this.D2().m(), 0, this.f60729b);
            int i10 = a0.this.E2() ? iK - this.f60729b : -iK;
            aVar.A(new C2127a(this.f60730c, a0.this.F2() ? 0 : i10, a0.this.F2() ? i10 : 0));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public a0(androidx.compose.foundation.o oVar, boolean z10, boolean z11) {
        this.f60725n = oVar;
        this.f60726o = z10;
        this.f60727p = z11;
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f60727p ? interfaceC2534n.S(MPv3.MAX_MESSAGE_ID) : interfaceC2534n.S(i10);
    }

    public final androidx.compose.foundation.o D2() {
        return this.f60725n;
    }

    public final boolean E2() {
        return this.f60726o;
    }

    public final boolean F2() {
        return this.f60727p;
    }

    public final void G2(boolean z10) {
        this.f60726o = z10;
    }

    public final void H2(androidx.compose.foundation.o oVar) {
        this.f60725n = oVar;
    }

    public final void I2(boolean z10) {
        this.f60727p = z10;
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        AbstractC7849j.a(j10, this.f60727p ? w.q.Vertical : w.q.Horizontal);
        boolean z10 = this.f60727p;
        int iL = MPv3.MAX_MESSAGE_ID;
        int iK = z10 ? Integer.MAX_VALUE : Y0.b.k(j10);
        if (this.f60727p) {
            iL = Y0.b.l(j10);
        }
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.b.d(j10, 0, iL, 0, iK, 5, null));
        int iG = AbstractC7978m.g(tVarT.I0(), Y0.b.l(j10));
        int iG2 = AbstractC7978m.g(tVarT.C0(), Y0.b.k(j10));
        int iC0 = tVarT.C0() - iG2;
        int iI0 = tVarT.I0() - iG;
        if (!this.f60727p) {
            iC0 = iI0;
        }
        this.f60725n.n(iC0);
        this.f60725n.p(this.f60727p ? iG2 : iG);
        return androidx.compose.ui.layout.m.x0(mVar, iG, iG2, null, new a(iC0, tVarT), 4, null);
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f60727p ? interfaceC2534n.s0(i10) : interfaceC2534n.s0(MPv3.MAX_MESSAGE_ID);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f60727p ? interfaceC2534n.R(MPv3.MAX_MESSAGE_ID) : interfaceC2534n.R(i10);
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f60727p ? interfaceC2534n.s(i10) : interfaceC2534n.s(MPv3.MAX_MESSAGE_ID);
    }
}
