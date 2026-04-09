package m0;

import l0.C6533i;

/* renamed from: m0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6717n0 {
    static /* synthetic */ void o(InterfaceC6717n0 interfaceC6717n0, C6533i c6533i, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6731u0.f52948a.b();
        }
        interfaceC6717n0.i(c6533i, i10);
    }

    static /* synthetic */ void p(InterfaceC6717n0 interfaceC6717n0, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = AbstractC6731u0.f52948a.b();
        }
        interfaceC6717n0.b(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void t(InterfaceC6717n0 interfaceC6717n0, U0 u02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6731u0.f52948a.b();
        }
        interfaceC6717n0.d(u02, i10);
    }

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(U0 u02, int i10);

    void e(float f10, float f11);

    void f(float f10);

    void g(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, S0 s02);

    void h(long j10, long j11, S0 s02);

    default void i(C6533i c6533i, int i10) {
        b(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e(), i10);
    }

    void j();

    void k();

    void l(C6533i c6533i, S0 s02);

    void m(U0 u02, S0 s02);

    void n(float[] fArr);

    void q(J0 j02, long j10, S0 s02);

    void r();

    void s(J0 j02, long j10, long j11, long j12, long j13, S0 s02);

    void u(float f10, float f11, float f12, float f13, float f14, float f15, S0 s02);

    default void v(C6533i c6533i, S0 s02) {
        x(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e(), s02);
    }

    void w(long j10, float f10, S0 s02);

    void x(float f10, float f11, float f12, float f13, S0 s02);

    void y();
}
