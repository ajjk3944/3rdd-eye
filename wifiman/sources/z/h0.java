package z;

/* loaded from: classes.dex */
public abstract class h0 {
    public static final f0 a(int i10, int i11, int i12, int i13) {
        return new C8694q(i10, i11, i12, i13);
    }

    public static final f0 b(float f10, float f11, float f12, float f13) {
        return new C8693p(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ f0 c(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Y0.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Y0.h.j(0);
        }
        return b(f10, f11, f12, f13);
    }

    public static final f0 d(f0 f0Var, f0 f0Var2) {
        return new C8678a(f0Var, f0Var2);
    }

    public static final f0 e(N n10) {
        return new Q(n10);
    }

    public static final N f(f0 f0Var, Y0.d dVar) {
        return new G(f0Var, dVar);
    }

    public static final f0 g(f0 f0Var, f0 f0Var2) {
        return new C8692o(f0Var, f0Var2);
    }

    public static final f0 h(f0 f0Var, f0 f0Var2) {
        return new c0(f0Var, f0Var2);
    }
}
