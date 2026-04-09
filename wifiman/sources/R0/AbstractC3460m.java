package R0;

/* renamed from: R0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3460m {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = L0.S.l(j10);
        int iK = L0.S.k(j10);
        if (L0.S.p(j11, j10)) {
            if (L0.S.d(j11, j10)) {
                iL = L0.S.l(j11);
                iK = iL;
            } else {
                if (L0.S.d(j10, j11)) {
                    iJ = L0.S.j(j11);
                } else if (L0.S.e(j11, iL)) {
                    iL = L0.S.l(j11);
                    iJ = L0.S.j(j11);
                } else {
                    iK = L0.S.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > L0.S.l(j11)) {
            iL -= L0.S.j(j11);
            iJ = L0.S.j(j11);
            iK -= iJ;
        }
        return L0.T.b(iL, iK);
    }
}
