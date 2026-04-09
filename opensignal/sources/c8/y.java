package c8;

import android.os.Build;

/* loaded from: classes.dex */
public final class y implements k {
    @Override // c8.k
    public final l a(f8.m mVar, l8.n nVar) {
        cv.i iVarI = mVar.f8701a.i();
        if (!iVarI.m0(0L, u.f3367b) && !iVarI.m0(0L, u.f3366a) && (!iVarI.m0(0L, u.f3368c) || !iVarI.m0(8L, u.f3369d) || !iVarI.m0(12L, u.f3370e) || !iVarI.S(17L) || ((byte) (iVarI.s().q(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !iVarI.m0(4L, u.f3371f)) {
                return null;
            }
            if (!iVarI.m0(8L, u.f3372g) && !iVarI.m0(8L, u.f3373h) && !iVarI.m0(8L, u.f3374i)) {
                return null;
            }
        }
        return new c0(mVar.f8701a, nVar);
    }

    public final boolean equals(Object obj) {
        return obj instanceof y;
    }

    public final int hashCode() {
        return y.class.hashCode();
    }
}
