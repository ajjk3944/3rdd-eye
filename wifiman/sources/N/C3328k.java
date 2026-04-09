package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.C6733v0;

/* renamed from: N.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3328k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3328k f14492a = new C3328k();

    /* renamed from: b, reason: collision with root package name */
    public static final int f14493b = 0;

    private C3328k() {
    }

    public final InterfaceC3326j a(long j10, long j11, long j12, long j13, long j14, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        long jL = (i11 & 1) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).l() : j10;
        long jK = (i11 & 2) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jN = (i11 & 4) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).n() : j12;
        long jK2 = (i11 & 8) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jK3 = (i11 & 16) != 0 ? C6733v0.k(jL, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(469524104, i10, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:231)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.j(jL)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.j(jK)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.j(jN)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.j(jK2)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC3540l.j(jK3)) || (i10 & 24576) == 16384);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            long j15 = jK3;
            long j16 = jK2;
            objF = new C3351w(jN, C6733v0.k(jN, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jL, C6733v0.k(jL, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j16, C6733v0.k(j16, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j15, jL, jK, j16, j15, null);
            interfaceC3540l.K(objF);
        }
        C3351w c3351w = (C3351w) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3351w;
    }
}
