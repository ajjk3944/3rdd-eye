package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.AbstractC6737x0;

/* renamed from: N.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3353x implements M {

    /* renamed from: a, reason: collision with root package name */
    public static final C3353x f14843a = new C3353x();

    private C3353x() {
    }

    @Override // N.M
    public long a(long j10, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1687113661);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        C3332m c3332mA = C3319f0.f14419a.a(interfaceC3540l, 6);
        if (Y0.h.h(f10, Y0.h.j(0)) <= 0 || c3332mA.o()) {
            interfaceC3540l.U(1169152471);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1169013963);
            j10 = AbstractC6737x0.g(N.b(j10, f10, interfaceC3540l, i10 & 126), j10);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return j10;
    }
}
