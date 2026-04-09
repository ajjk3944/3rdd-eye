package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.C6733v0;

/* renamed from: N.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3350v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3350v0 f14813a = new C3350v0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f14814b = 0;

    private C3350v0() {
    }

    public final InterfaceC3348u0 a(long j10, long j11, long j12, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        long jL = (i11 & 1) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).l() : j10;
        long jK = (i11 & 2) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jK2 = (i11 & 4) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1370708026, i10, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:165)");
        }
        boolean z10 = (((6 ^ (i10 & 14)) > 4 && interfaceC3540l.j(jL)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.j(jK)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.j(jK2)) || (i10 & 384) == 256);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new A(jL, jK, jK2, null);
            interfaceC3540l.K(objF);
        }
        A a10 = (A) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return a10;
    }
}
