package Q;

import E0.AbstractC2631i;
import E0.AbstractC2635m;
import E0.InterfaceC2630h;
import E0.InterfaceC2632j;
import E0.h0;
import E0.i0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
final class g extends AbstractC2635m implements InterfaceC2630h, h0 {

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC8556k f18799p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f18800q;

    /* renamed from: r, reason: collision with root package name */
    private final float f18801r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6739y0 f18802s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC2632j f18803t;

    static final class a implements InterfaceC6739y0 {
        a() {
        }

        @Override // m0.InterfaceC6739y0
        public final long a() {
            long jA = g.this.f18802s.a();
            if (jA != 16) {
                return jA;
            }
            m mVar = (m) AbstractC2631i.a(g.this, o.a());
            return (mVar == null || mVar.a() == 16) ? ((C6733v0) AbstractC2631i.a(g.this, f.a())).u() : mVar.a();
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P.g invoke() {
            P.g gVarB;
            m mVar = (m) AbstractC2631i.a(g.this, o.a());
            return (mVar == null || (gVarB = mVar.b()) == null) ? n.f18842a.a() : gVarB;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        public final void a() {
            if (((m) AbstractC2631i.a(g.this, o.a())) == null) {
                g.this.O2();
            } else if (g.this.f18803t == null) {
                g.this.N2();
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public /* synthetic */ g(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8556k, z10, f10, interfaceC6739y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2() {
        this.f18803t = D2(P.p.c(this.f18799p, this.f18800q, this.f18801r, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2() {
        InterfaceC2632j interfaceC2632j = this.f18803t;
        if (interfaceC2632j != null) {
            G2(interfaceC2632j);
        }
    }

    private final void P2() {
        i0.a(this, new c());
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        P2();
    }

    @Override // E0.h0
    public void q1() {
        P2();
    }

    private g(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0) {
        this.f18799p = interfaceC8556k;
        this.f18800q = z10;
        this.f18801r = f10;
        this.f18802s = interfaceC6739y0;
    }
}
