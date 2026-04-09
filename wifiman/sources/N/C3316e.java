package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.AbstractC6737x0;
import m0.C6733v0;

/* renamed from: N.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3316e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3316e f14407a = new C3316e();

    /* renamed from: b, reason: collision with root package name */
    private static final float f14408b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14409c;

    /* renamed from: d, reason: collision with root package name */
    private static final z.N f14410d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f14411e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f14412f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f14413g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f14414h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f14415i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f14416j;

    /* renamed from: k, reason: collision with root package name */
    private static final z.N f14417k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14418l = 0;

    static {
        float fJ = Y0.h.j(16);
        f14408b = fJ;
        float f10 = 8;
        float fJ2 = Y0.h.j(f10);
        f14409c = fJ2;
        z.N nD = androidx.compose.foundation.layout.o.d(fJ, fJ2, fJ, fJ2);
        f14410d = nD;
        f14411e = Y0.h.j(64);
        f14412f = Y0.h.j(36);
        f14413g = Y0.h.j(18);
        f14414h = Y0.h.j(f10);
        f14415i = Y0.h.j(1);
        float fJ3 = Y0.h.j(f10);
        f14416j = fJ3;
        f14417k = androidx.compose.foundation.layout.o.d(fJ3, nD.d(), fJ3, nD.c());
    }

    private C3316e() {
    }

    public final InterfaceC3314d a(long j10, long j11, long j12, long j13, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        long jG;
        long j14 = (i11 & 1) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).j() : j10;
        long jB = (i11 & 2) != 0 ? AbstractC3334n.b(j14, interfaceC3540l, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            C3319f0 c3319f0 = C3319f0.f14419a;
            jG = AbstractC6737x0.g(C6733v0.k(c3319f0.a(interfaceC3540l, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), c3319f0.a(interfaceC3540l, 6).n());
        } else {
            jG = j12;
        }
        long jK = (i11 & 8) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:413)");
        }
        C3347u c3347u = new C3347u(j14, jB, jG, jK, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3347u;
    }

    public final InterfaceC3318f b(float f10, float f11, float f12, float f13, float f14, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = Y0.h.j(2);
        }
        float f15 = f10;
        if ((i11 & 2) != 0) {
            f11 = Y0.h.j(8);
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = Y0.h.j(0);
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = Y0.h.j(4);
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = Y0.h.j(4);
        }
        float f19 = f14;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:378)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.g(f15)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.g(f16)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.g(f17)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.g(f18)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC3540l.g(f19)) || (i10 & 24576) == 16384);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C3349v(f15, f16, f17, f18, f19, null);
            interfaceC3540l.K(objF);
        }
        C3349v c3349v = (C3349v) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3349v;
    }

    public final z.N c() {
        return f14410d;
    }

    public final float d() {
        return f14412f;
    }

    public final float e() {
        return f14411e;
    }

    public final z.N f() {
        return f14417k;
    }

    public final InterfaceC3314d g(long j10, long j11, long j12, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        long jN = (i11 & 1) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).n() : j10;
        long j13 = (i11 & 2) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).j() : j11;
        long jK = (i11 & 4) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:434)");
        }
        C3347u c3347u = new C3347u(jN, j13, jN, jK, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3347u;
    }

    public final InterfaceC3314d h(long j10, long j11, long j12, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        long jD = (i11 & 1) != 0 ? C6733v0.f52951b.d() : j10;
        long j13 = (i11 & 2) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).j() : j11;
        long jK = (i11 & 4) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:455)");
        }
        C3347u c3347u = new C3347u(jD, j13, jD, jK, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3347u;
    }
}
