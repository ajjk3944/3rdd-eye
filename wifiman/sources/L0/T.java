package L0;

import org.snmp4j.smi.Counter32;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class T {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return S.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int iK = AbstractC7978m.k(S.n(j10), i10, i11);
        int iK2 = AbstractC7978m.k(S.i(j10), i10, i11);
        return (iK == S.n(j10) && iK2 == S.i(j10)) ? j10 : b(iK, iK2);
    }

    private static final long d(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            return (i11 & Counter32.MAX_COUNTER32_VALUE) | (i10 << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    public static final String e(CharSequence charSequence, long j10) {
        return charSequence.subSequence(S.l(j10), S.k(j10)).toString();
    }
}
