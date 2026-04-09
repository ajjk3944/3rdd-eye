package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.AbstractC6737x0;
import m0.C6733v0;

/* renamed from: N.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3317e0 {
    private static final float a(long j10, long j11, long j12) {
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        for (int i10 = 0; i10 < 7; i10++) {
            float fC = (c(j10, f11, j11, j12) / 4.5f) - 1.0f;
            if (0.0f <= fC && fC <= 0.01f) {
                break;
            }
            if (fC < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
        }
        return f11;
    }

    public static final float b(long j10, long j11) {
        float fI = AbstractC6737x0.i(j10) + 0.05f;
        float fI2 = AbstractC6737x0.i(j11) + 0.05f;
        return Math.max(fI, fI2) / Math.min(fI, fI2);
    }

    private static final float c(long j10, float f10, long j11, long j12) {
        long jG = AbstractC6737x0.g(C6733v0.k(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return b(AbstractC6737x0.g(j11, jG), jG);
    }

    public static final long d(long j10, long j11, long j12) {
        return C6733v0.k(j10, c(j10, 0.4f, j11, j12) >= 4.5f ? 0.4f : c(j10, 0.2f, j11, j12) < 4.5f ? 0.2f : a(j10, j11, j12), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final M.K e(C3332m c3332m, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j10 = c3332m.j();
        long jC = c3332m.c();
        interfaceC3540l.U(1102762072);
        long jA = AbstractC3334n.a(c3332m, jC);
        if (jA == 16) {
            jA = ((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u();
        }
        long j11 = jA;
        interfaceC3540l.J();
        long jK = C6733v0.k(j11, r.f14715a.d(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zJ = interfaceC3540l.j(j10) | interfaceC3540l.j(jC) | interfaceC3540l.j(jK);
        Object objF = interfaceC3540l.f();
        if (zJ || objF == InterfaceC3540l.f21100a.a()) {
            objF = new M.K(c3332m.j(), d(j10, jK, jC), null);
            interfaceC3540l.K(objF);
        }
        M.K k10 = (M.K) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return k10;
    }
}
