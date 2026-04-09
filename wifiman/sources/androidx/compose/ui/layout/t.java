package androidx.compose.ui.layout;

import C0.E;
import E0.W;
import mh.InterfaceC6835l;
import p0.C7182c;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class t implements E {

    /* renamed from: a, reason: collision with root package name */
    private int f29061a;

    /* renamed from: b, reason: collision with root package name */
    private int f29062b;

    /* renamed from: c, reason: collision with root package name */
    private long f29063c = Y0.s.a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    private long f29064d = u.f29068b;

    /* renamed from: e, reason: collision with root package name */
    private long f29065e = Y0.n.f24536b.a();

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29066a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(t tVar) {
            if (tVar instanceof W) {
                ((W) tVar).k0(this.f29066a);
            }
        }

        public static /* synthetic */ void h(a aVar, t tVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.g(tVar, i10, i11, f10);
        }

        public static /* synthetic */ void j(a aVar, t tVar, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.i(tVar, j10, f10);
        }

        public static /* synthetic */ void l(a aVar, t tVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.k(tVar, i10, i11, f10);
        }

        public static /* synthetic */ void n(a aVar, t tVar, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m(tVar, j10, f10);
        }

        public static /* synthetic */ void p(a aVar, t tVar, int i10, int i11, float f10, InterfaceC6835l interfaceC6835l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC6835l = u.f29067a;
            }
            aVar.o(tVar, i10, i11, f11, interfaceC6835l);
        }

        public static /* synthetic */ void s(a aVar, t tVar, long j10, float f10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC6835l = u.f29067a;
            }
            aVar.q(tVar, j10, f11, interfaceC6835l);
        }

        public static /* synthetic */ void t(a aVar, t tVar, long j10, C7182c c7182c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.r(tVar, j10, c7182c, f10);
        }

        public static /* synthetic */ void v(a aVar, t tVar, int i10, int i11, float f10, InterfaceC6835l interfaceC6835l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC6835l = u.f29067a;
            }
            aVar.u(tVar, i10, i11, f11, interfaceC6835l);
        }

        public static /* synthetic */ void y(a aVar, t tVar, long j10, float f10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC6835l = u.f29067a;
            }
            aVar.w(tVar, j10, f11, interfaceC6835l);
        }

        public static /* synthetic */ void z(a aVar, t tVar, long j10, C7182c c7182c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.x(tVar, j10, c7182c, f10);
        }

        public final void A(InterfaceC6835l interfaceC6835l) {
            this.f29066a = true;
            interfaceC6835l.invoke(this);
            this.f29066a = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract Y0.t d();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int e();

        public final void g(t tVar, int i10, int i11, float f10) {
            long jA = Y0.o.a(i10, i11);
            f(tVar);
            tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, null);
        }

        public final void i(t tVar, long j10, float f10) {
            f(tVar);
            tVar.K0(Y0.n.l(j10, tVar.f29065e), f10, null);
        }

        public final void k(t tVar, int i10, int i11, float f10) {
            long jA = Y0.o.a(i10, i11);
            if (d() == Y0.t.Ltr || e() == 0) {
                f(tVar);
                tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, null);
            } else {
                long jA2 = Y0.o.a((e() - tVar.I0()) - Y0.n.h(jA), Y0.n.i(jA));
                f(tVar);
                tVar.K0(Y0.n.l(jA2, tVar.f29065e), f10, null);
            }
        }

        public final void m(t tVar, long j10, float f10) {
            if (d() == Y0.t.Ltr || e() == 0) {
                f(tVar);
                tVar.K0(Y0.n.l(j10, tVar.f29065e), f10, null);
            } else {
                long jA = Y0.o.a((e() - tVar.I0()) - Y0.n.h(j10), Y0.n.i(j10));
                f(tVar);
                tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, null);
            }
        }

        public final void o(t tVar, int i10, int i11, float f10, InterfaceC6835l interfaceC6835l) {
            long jA = Y0.o.a(i10, i11);
            if (d() == Y0.t.Ltr || e() == 0) {
                f(tVar);
                tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, interfaceC6835l);
            } else {
                long jA2 = Y0.o.a((e() - tVar.I0()) - Y0.n.h(jA), Y0.n.i(jA));
                f(tVar);
                tVar.K0(Y0.n.l(jA2, tVar.f29065e), f10, interfaceC6835l);
            }
        }

        public final void q(t tVar, long j10, float f10, InterfaceC6835l interfaceC6835l) {
            if (d() == Y0.t.Ltr || e() == 0) {
                f(tVar);
                tVar.K0(Y0.n.l(j10, tVar.f29065e), f10, interfaceC6835l);
            } else {
                long jA = Y0.o.a((e() - tVar.I0()) - Y0.n.h(j10), Y0.n.i(j10));
                f(tVar);
                tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, interfaceC6835l);
            }
        }

        public final void r(t tVar, long j10, C7182c c7182c, float f10) {
            if (d() == Y0.t.Ltr || e() == 0) {
                f(tVar);
                tVar.L0(Y0.n.l(j10, tVar.f29065e), f10, c7182c);
            } else {
                long jA = Y0.o.a((e() - tVar.I0()) - Y0.n.h(j10), Y0.n.i(j10));
                f(tVar);
                tVar.L0(Y0.n.l(jA, tVar.f29065e), f10, c7182c);
            }
        }

        public final void u(t tVar, int i10, int i11, float f10, InterfaceC6835l interfaceC6835l) {
            long jA = Y0.o.a(i10, i11);
            f(tVar);
            tVar.K0(Y0.n.l(jA, tVar.f29065e), f10, interfaceC6835l);
        }

        public final void w(t tVar, long j10, float f10, InterfaceC6835l interfaceC6835l) {
            f(tVar);
            tVar.K0(Y0.n.l(j10, tVar.f29065e), f10, interfaceC6835l);
        }

        public final void x(t tVar, long j10, C7182c c7182c, float f10) {
            f(tVar);
            tVar.L0(Y0.n.l(j10, tVar.f29065e), f10, c7182c);
        }
    }

    private final void J0() {
        this.f29061a = AbstractC7978m.k(Y0.r.g(this.f29063c), Y0.b.n(this.f29064d), Y0.b.l(this.f29064d));
        this.f29062b = AbstractC7978m.k(Y0.r.f(this.f29063c), Y0.b.m(this.f29064d), Y0.b.k(this.f29064d));
        this.f29065e = Y0.o.a((this.f29061a - Y0.r.g(this.f29063c)) / 2, (this.f29062b - Y0.r.f(this.f29063c)) / 2);
    }

    protected final long A0() {
        return this.f29065e;
    }

    public final int C0() {
        return this.f29062b;
    }

    public int D0() {
        return Y0.r.f(this.f29063c);
    }

    protected final long E0() {
        return this.f29063c;
    }

    public int G0() {
        return Y0.r.g(this.f29063c);
    }

    protected final long H0() {
        return this.f29064d;
    }

    public final int I0() {
        return this.f29061a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void K0(long j10, float f10, InterfaceC6835l interfaceC6835l);

    /* JADX INFO: Access modifiers changed from: protected */
    public void L0(long j10, float f10, C7182c c7182c) {
        K0(j10, f10, null);
    }

    protected final void Q0(long j10) {
        if (Y0.r.e(this.f29063c, j10)) {
            return;
        }
        this.f29063c = j10;
        J0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S0(long j10) {
        if (Y0.b.f(this.f29064d, j10)) {
            return;
        }
        this.f29064d = j10;
        J0();
    }
}
