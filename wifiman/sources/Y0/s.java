package Y0;

import l0.AbstractC6538n;
import l0.C6537m;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class s {
    public static final long a(int i10, int i11) {
        return r.c((i11 & Counter32.MAX_COUNTER32_VALUE) | (i10 << 32));
    }

    public static final long b(long j10) {
        return n.c((((j10 << 32) >> 33) & Counter32.MAX_COUNTER32_VALUE) | ((j10 >> 33) << 32));
    }

    public static final long c(long j10) {
        return r.c((Math.round(C6537m.g(j10)) & Counter32.MAX_COUNTER32_VALUE) | (Math.round(C6537m.i(j10)) << 32));
    }

    public static final long d(long j10) {
        return AbstractC6538n.a(r.g(j10), r.f(j10));
    }
}
