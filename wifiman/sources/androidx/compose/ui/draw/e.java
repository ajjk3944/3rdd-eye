package androidx.compose.ui.draw;

import C0.D;
import C0.InterfaceC2528h;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import C0.T;
import E0.B;
import E0.r;
import Y0.n;
import Y0.s;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.AbstractC6735w0;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import r0.AbstractC7554d;

/* loaded from: classes.dex */
final class e extends e.c implements B, r {

    /* renamed from: n, reason: collision with root package name */
    private AbstractC7554d f28762n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28763o;

    /* renamed from: p, reason: collision with root package name */
    private f0.c f28764p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC2528h f28765q;

    /* renamed from: r, reason: collision with root package name */
    private float f28766r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC6735w0 f28767s;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f28768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(1);
            this.f28768a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.l(aVar, this.f28768a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public e(AbstractC7554d abstractC7554d, boolean z10, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0) {
        this.f28762n = abstractC7554d;
        this.f28763o = z10;
        this.f28764p = cVar;
        this.f28765q = interfaceC2528h;
        this.f28766r = f10;
        this.f28767s = abstractC6735w0;
    }

    private final long D2(long j10) {
        if (!G2()) {
            return j10;
        }
        long jA = AbstractC6538n.a(!I2(this.f28762n.l()) ? C6537m.i(j10) : C6537m.i(this.f28762n.l()), !H2(this.f28762n.l()) ? C6537m.g(j10) : C6537m.g(this.f28762n.l()));
        return (C6537m.i(j10) == 0.0f || C6537m.g(j10) == 0.0f) ? C6537m.f52356b.b() : T.b(jA, this.f28765q.a(jA, j10));
    }

    private final boolean G2() {
        return this.f28763o && this.f28762n.l() != 9205357640488583168L;
    }

    private final boolean H2(long j10) {
        if (!C6537m.f(j10, C6537m.f52356b.a())) {
            float fG = C6537m.g(j10);
            if (!Float.isInfinite(fG) && !Float.isNaN(fG)) {
                return true;
            }
        }
        return false;
    }

    private final boolean I2(long j10) {
        if (!C6537m.f(j10, C6537m.f52356b.a())) {
            float fI = C6537m.i(j10);
            if (!Float.isInfinite(fI) && !Float.isNaN(fI)) {
                return true;
            }
        }
        return false;
    }

    private final long J2(long j10) {
        boolean z10 = false;
        boolean z11 = Y0.b.h(j10) && Y0.b.g(j10);
        if (Y0.b.j(j10) && Y0.b.i(j10)) {
            z10 = true;
        }
        if ((!G2() && z11) || z10) {
            return Y0.b.d(j10, Y0.b.l(j10), 0, Y0.b.k(j10), 0, 10, null);
        }
        long jL = this.f28762n.l();
        long jD2 = D2(AbstractC6538n.a(Y0.c.i(j10, I2(jL) ? Math.round(C6537m.i(jL)) : Y0.b.n(j10)), Y0.c.h(j10, H2(jL) ? Math.round(C6537m.g(jL)) : Y0.b.m(j10))));
        return Y0.b.d(j10, Y0.c.i(j10, Math.round(C6537m.i(jD2))), 0, Y0.c.h(j10, Math.round(C6537m.g(jD2))), 0, 10, null);
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        if (!G2()) {
            return interfaceC2534n.S(i10);
        }
        long jJ2 = J2(Y0.c.b(0, 0, 0, i10, 7, null));
        return Math.max(Y0.b.n(jJ2), interfaceC2534n.S(i10));
    }

    public final AbstractC7554d E2() {
        return this.f28762n;
    }

    public final boolean F2() {
        return this.f28763o;
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        long jL = this.f28762n.l();
        long jA = AbstractC6538n.a(I2(jL) ? C6537m.i(jL) : C6537m.i(interfaceC7036c.c()), H2(jL) ? C6537m.g(jL) : C6537m.g(interfaceC7036c.c()));
        long jB = (C6537m.i(interfaceC7036c.c()) == 0.0f || C6537m.g(interfaceC7036c.c()) == 0.0f) ? C6537m.f52356b.b() : T.b(jA, this.f28765q.a(jA, interfaceC7036c.c()));
        long jA2 = this.f28764p.a(s.a(Math.round(C6537m.i(jB)), Math.round(C6537m.g(jB))), s.a(Math.round(C6537m.i(interfaceC7036c.c())), Math.round(C6537m.g(interfaceC7036c.c()))), interfaceC7036c.getLayoutDirection());
        float fH = n.h(jA2);
        float fI = n.i(jA2);
        interfaceC7036c.k1().e().c(fH, fI);
        try {
            this.f28762n.j(interfaceC7036c, jB, this.f28766r, this.f28767s);
            interfaceC7036c.k1().e().c(-fH, -fI);
            interfaceC7036c.X1();
        } catch (Throwable th2) {
            interfaceC7036c.k1().e().c(-fH, -fI);
            throw th2;
        }
    }

    public final void K2(f0.c cVar) {
        this.f28764p = cVar;
    }

    public final void L2(AbstractC6735w0 abstractC6735w0) {
        this.f28767s = abstractC6735w0;
    }

    public final void M2(InterfaceC2528h interfaceC2528h) {
        this.f28765q = interfaceC2528h;
    }

    public final void N2(AbstractC7554d abstractC7554d) {
        this.f28762n = abstractC7554d;
    }

    public final void O2(boolean z10) {
        this.f28763o = z10;
    }

    public final void a(float f10) {
        this.f28766r = f10;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        t tVarT = b10.T(J2(j10));
        return m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return false;
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        if (!G2()) {
            return interfaceC2534n.s0(i10);
        }
        long jJ2 = J2(Y0.c.b(0, i10, 0, 0, 13, null));
        return Math.max(Y0.b.m(jJ2), interfaceC2534n.s0(i10));
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        if (!G2()) {
            return interfaceC2534n.R(i10);
        }
        long jJ2 = J2(Y0.c.b(0, 0, 0, i10, 7, null));
        return Math.max(Y0.b.n(jJ2), interfaceC2534n.R(i10));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f28762n + ", sizeToIntrinsics=" + this.f28763o + ", alignment=" + this.f28764p + ", alpha=" + this.f28766r + ", colorFilter=" + this.f28767s + ')';
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        if (!G2()) {
            return interfaceC2534n.s(i10);
        }
        long jJ2 = J2(Y0.c.b(0, i10, 0, 0, 13, null));
        return Math.max(Y0.b.m(jJ2), interfaceC2534n.s(i10));
    }
}
