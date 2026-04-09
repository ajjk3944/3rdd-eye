package Y0;

import l0.AbstractC6532h;
import l0.C6531g;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class o {
    public static final long a(int i10, int i11) {
        return n.c((i11 & Counter32.MAX_COUNTER32_VALUE) | (i10 << 32));
    }

    public static final long b(long j10, long j11) {
        return AbstractC6532h.a(C6531g.m(j10) - n.h(j11), C6531g.n(j10) - n.i(j11));
    }

    public static final long c(long j10, long j11) {
        return AbstractC6532h.a(C6531g.m(j10) + n.h(j11), C6531g.n(j10) + n.i(j11));
    }

    public static final long d(long j10) {
        return n.c((Math.round(C6531g.n(j10)) & Counter32.MAX_COUNTER32_VALUE) | (Math.round(C6531g.m(j10)) << 32));
    }
}
