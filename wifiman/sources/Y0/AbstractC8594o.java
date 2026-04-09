package y0;

import l0.C6531g;
import l0.C6537m;

/* renamed from: y0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8594o {
    public static final boolean a(C8604y c8604y) {
        return (c8604y.p() || c8604y.l() || !c8604y.i()) ? false : true;
    }

    public static final boolean b(C8604y c8604y) {
        return !c8604y.l() && c8604y.i();
    }

    public static final boolean c(C8604y c8604y) {
        return (c8604y.p() || !c8604y.l() || c8604y.i()) ? false : true;
    }

    public static final boolean d(C8604y c8604y) {
        return c8604y.l() && !c8604y.i();
    }

    public static final boolean e(C8604y c8604y, long j10) {
        long jH = c8604y.h();
        float fM = C6531g.m(jH);
        float fN = C6531g.n(jH);
        return fM < 0.0f || fM > ((float) Y0.r.g(j10)) || fN < 0.0f || fN > ((float) Y0.r.f(j10));
    }

    public static final boolean f(C8604y c8604y, long j10, long j11) {
        if (!AbstractC8572L.g(c8604y.n(), AbstractC8572L.f66233a.d())) {
            return e(c8604y, j10);
        }
        long jH = c8604y.h();
        float fM = C6531g.m(jH);
        float fN = C6531g.n(jH);
        return fM < (-C6537m.i(j11)) || fM > ((float) Y0.r.g(j10)) + C6537m.i(j11) || fN < (-C6537m.g(j11)) || fN > ((float) Y0.r.f(j10)) + C6537m.g(j11);
    }

    public static final long g(C8604y c8604y) {
        return i(c8604y, false);
    }

    public static final long h(C8604y c8604y) {
        return i(c8604y, true);
    }

    private static final long i(C8604y c8604y, boolean z10) {
        long jQ = C6531g.q(c8604y.h(), c8604y.k());
        return (z10 || !c8604y.p()) ? jQ : C6531g.f52335b.c();
    }

    public static final boolean j(C8604y c8604y) {
        return !C6531g.j(i(c8604y, false), C6531g.f52335b.c());
    }

    public static final boolean k(C8604y c8604y) {
        return !C6531g.j(i(c8604y, true), C6531g.f52335b.c());
    }
}
