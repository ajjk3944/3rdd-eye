package L;

import F.T;
import W0.t;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return Y0.b.f24516b.b(0, c(j10, z10, i10, f10), 0, Y0.b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !t.e(i10, t.f23567a.b())) {
            return AbstractC7978m.d(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iL = ((z10 || t.e(i10, t.f23567a.b())) && Y0.b.h(j10)) ? Y0.b.l(j10) : MPv3.MAX_MESSAGE_ID;
        return Y0.b.n(j10) == iL ? iL : AbstractC7978m.k(T.a(f10), Y0.b.n(j10), iL);
    }
}
