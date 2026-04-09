package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f14042a = new U();

    private U() {
    }

    public final V a(float f10, float f11, float f12, float f13, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = Y0.h.j(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = Y0.h.j(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = Y0.h.j(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Y0.h.j(8);
        }
        float f17 = f13;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:248)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.g(f14)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.g(f15)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.g(f16)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.g(f17)) || (i10 & 3072) == 2048);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C3355y(f14, f15, f16, f17, null);
            interfaceC3540l.K(objF);
        }
        C3355y c3355y = (C3355y) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3355y;
    }
}
