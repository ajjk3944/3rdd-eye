package R0;

import L0.C3174d;

/* loaded from: classes.dex */
public abstract class S {
    public static final C3174d a(Q q10) {
        return q10.f().s(q10.h());
    }

    public static final C3174d b(Q q10, int i10) {
        return q10.f().subSequence(L0.S.k(q10.h()), Math.min(L0.S.k(q10.h()) + i10, q10.i().length()));
    }

    public static final C3174d c(Q q10, int i10) {
        return q10.f().subSequence(Math.max(0, L0.S.l(q10.h()) - i10), L0.S.l(q10.h()));
    }
}
