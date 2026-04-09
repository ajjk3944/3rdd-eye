package N;

import E0.AbstractC2631i;
import E0.AbstractC2635m;
import E0.InterfaceC2630h;
import E0.InterfaceC2632j;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
final class C extends AbstractC2635m implements InterfaceC2630h, E0.h0 {

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC8556k f13553p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13554q;

    /* renamed from: r, reason: collision with root package name */
    private final float f13555r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6739y0 f13556s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC2632j f13557t;

    static final class a implements InterfaceC6739y0 {
        a() {
        }

        @Override // m0.InterfaceC6739y0
        public final long a() {
            long jA = C.this.f13556s.a();
            if (jA != 16) {
                return jA;
            }
            C3356y0 c3356y0 = (C3356y0) AbstractC2631i.a(C.this, A0.d());
            return (c3356y0 == null || c3356y0.a() == 16) ? C3358z0.f14867a.b(((C6733v0) AbstractC2631i.a(C.this, AbstractC3345t.a())).u(), ((C3332m) AbstractC2631i.a(C.this, AbstractC3334n.d())).o()) : c3356y0.a();
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
            C3356y0 c3356y0 = (C3356y0) AbstractC2631i.a(C.this, A0.d());
            return (c3356y0 == null || (gVarB = c3356y0.b()) == null) ? C3358z0.f14867a.a(((C6733v0) AbstractC2631i.a(C.this, AbstractC3345t.a())).u(), ((C3332m) AbstractC2631i.a(C.this, AbstractC3334n.d())).o()) : gVarB;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        public final void a() {
            if (((C3356y0) AbstractC2631i.a(C.this, A0.d())) == null) {
                C.this.O2();
            } else if (C.this.f13557t == null) {
                C.this.N2();
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ C(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8556k, z10, f10, interfaceC6739y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2() {
        this.f13557t = D2(P.p.c(this.f13553p, this.f13554q, this.f13555r, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2() {
        InterfaceC2632j interfaceC2632j = this.f13557t;
        if (interfaceC2632j != null) {
            G2(interfaceC2632j);
        }
    }

    private final void P2() {
        E0.i0.a(this, new c());
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        P2();
    }

    @Override // E0.h0
    public void q1() {
        P2();
    }

    private C(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0) {
        this.f13553p = interfaceC8556k;
        this.f13554q = z10;
        this.f13555r = f10;
        this.f13556s = interfaceC6739y0;
    }
}
