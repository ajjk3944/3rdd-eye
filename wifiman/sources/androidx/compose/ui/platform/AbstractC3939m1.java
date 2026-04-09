package androidx.compose.ui.platform;

import kotlin.NoWhenBranchMatchedException;
import l0.AbstractC6525a;
import l0.C6533i;
import l0.C6535k;
import m0.AbstractC6688Y;
import m0.Q0;

/* renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3939m1 {
    private static final boolean a(C6535k c6535k) {
        return AbstractC6525a.d(c6535k.h()) + AbstractC6525a.d(c6535k.i()) <= c6535k.j() && AbstractC6525a.d(c6535k.b()) + AbstractC6525a.d(c6535k.c()) <= c6535k.j() && AbstractC6525a.e(c6535k.h()) + AbstractC6525a.e(c6535k.b()) <= c6535k.d() && AbstractC6525a.e(c6535k.i()) + AbstractC6525a.e(c6535k.c()) <= c6535k.d();
    }

    public static final boolean b(m0.Q0 q02, float f10, float f11, m0.U0 u02, m0.U0 u03) {
        if (q02 instanceof Q0.b) {
            return e(((Q0.b) q02).b(), f10, f11);
        }
        if (q02 instanceof Q0.c) {
            return f((Q0.c) q02, f10, f11, u02, u03);
        }
        if (q02 instanceof Q0.a) {
            return d(((Q0.a) q02).b(), f10, f11, u02, u03);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(m0.Q0 q02, float f10, float f11, m0.U0 u02, m0.U0 u03, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            u02 = null;
        }
        if ((i10 & 16) != 0) {
            u03 = null;
        }
        return b(q02, f10, f11, u02, u03);
    }

    private static final boolean d(m0.U0 u02, float f10, float f11, m0.U0 u03, m0.U0 u04) {
        C6533i c6533i = new C6533i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (u03 == null) {
            u03 = AbstractC6688Y.a();
        }
        m0.U0.g(u03, c6533i, null, 2, null);
        if (u04 == null) {
            u04 = AbstractC6688Y.a();
        }
        u04.k(u02, u03, m0.Y0.f52866a.b());
        boolean zIsEmpty = u04.isEmpty();
        u04.a();
        u03.a();
        return !zIsEmpty;
    }

    private static final boolean e(C6533i c6533i, float f10, float f11) {
        return c6533i.k() <= f10 && f10 < c6533i.l() && c6533i.n() <= f11 && f11 < c6533i.e();
    }

    private static final boolean f(Q0.c cVar, float f10, float f11, m0.U0 u02, m0.U0 u03) {
        C6535k c6535kB = cVar.b();
        if (f10 < c6535kB.e() || f10 >= c6535kB.f() || f11 < c6535kB.g() || f11 >= c6535kB.a()) {
            return false;
        }
        if (!a(c6535kB)) {
            m0.U0 u0A = u03 == null ? AbstractC6688Y.a() : u03;
            m0.U0.t(u0A, c6535kB, null, 2, null);
            return d(u0A, f10, f11, u02, u03);
        }
        float fD = AbstractC6525a.d(c6535kB.h()) + c6535kB.e();
        float fE = AbstractC6525a.e(c6535kB.h()) + c6535kB.g();
        float f12 = c6535kB.f() - AbstractC6525a.d(c6535kB.i());
        float fE2 = AbstractC6525a.e(c6535kB.i()) + c6535kB.g();
        float f13 = c6535kB.f() - AbstractC6525a.d(c6535kB.c());
        float fA = c6535kB.a() - AbstractC6525a.e(c6535kB.c());
        float fA2 = c6535kB.a() - AbstractC6525a.e(c6535kB.b());
        float fD2 = AbstractC6525a.d(c6535kB.b()) + c6535kB.e();
        if (f10 < fD && f11 < fE) {
            return g(f10, f11, c6535kB.h(), fD, fE);
        }
        if (f10 < fD2 && f11 > fA2) {
            return g(f10, f11, c6535kB.b(), fD2, fA2);
        }
        if (f10 > f12 && f11 < fE2) {
            return g(f10, f11, c6535kB.i(), f12, fE2);
        }
        if (f10 <= f13 || f11 <= fA) {
            return true;
        }
        return g(f10, f11, c6535kB.c(), f13, fA);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fD = AbstractC6525a.d(j10);
        float fE = AbstractC6525a.e(j10);
        return ((f14 * f14) / (fD * fD)) + ((f15 * f15) / (fE * fE)) <= 1.0f;
    }
}
