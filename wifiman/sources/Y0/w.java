package Y0;

import a1.AbstractC3751b;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class w {
    public static final long a(float f10, long j10) {
        return j(j10, f10);
    }

    public static final void b(long j10) {
        if (h(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j10, long j11) {
        if (h(j10) || h(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (x.g(v.g(j10), v.g(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) x.i(v.g(j10))) + " and " + ((Object) x.i(v.g(j11)))).toString());
    }

    public static final long d(double d10) {
        return j(8589934592L, (float) d10);
    }

    public static final long e(double d10) {
        return j(4294967296L, (float) d10);
    }

    public static final long f(float f10) {
        return j(4294967296L, f10);
    }

    public static final long g(int i10) {
        return j(4294967296L, i10);
    }

    public static final boolean h(long j10) {
        return v.f(j10) == 0;
    }

    public static final long i(long j10, long j11, float f10) {
        c(j10, j11);
        return j(v.f(j10), AbstractC3751b.b(v.h(j10), v.h(j11), f10));
    }

    public static final long j(long j10, float f10) {
        return v.c(j10 | (Float.floatToIntBits(f10) & Counter32.MAX_COUNTER32_VALUE));
    }
}
