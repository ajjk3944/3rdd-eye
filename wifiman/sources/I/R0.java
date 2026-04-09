package I;

import l0.C6531g;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class R0 {
    private static final float a(long j10, C6533i c6533i) {
        if (M.A.a(c6533i, j10)) {
            return 0.0f;
        }
        float fL = C6531g.l(C6531g.q(c6533i.p(), j10));
        if (fL >= Float.MAX_VALUE) {
            fL = Float.MAX_VALUE;
        }
        float fL2 = C6531g.l(C6531g.q(c6533i.q(), j10));
        if (fL2 < fL) {
            fL = fL2;
        }
        float fL3 = C6531g.l(C6531g.q(c6533i.g(), j10));
        if (fL3 < fL) {
            fL = fL3;
        }
        float fL4 = C6531g.l(C6531g.q(c6533i.h(), j10));
        return fL4 < fL ? fL4 : fL;
    }

    public static final int b(long j10, C6533i c6533i, C6533i c6533i2) {
        float fA = a(j10, c6533i);
        float fA2 = a(j10, c6533i2);
        if (fA == fA2) {
            return 0;
        }
        return fA < fA2 ? -1 : 1;
    }
}
