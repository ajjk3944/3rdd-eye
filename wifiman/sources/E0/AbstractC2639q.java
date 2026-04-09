package E0;

import org.snmp4j.smi.Counter32;

/* renamed from: E0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2639q {
    public static final int a(long j10, long j11) {
        boolean zD = d(j10);
        return zD != d(j11) ? zD ? -1 : 1 : (int) Math.signum(c(j10) - c(j11));
    }

    public static long b(long j10) {
        return j10;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean d(long j10) {
        return ((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) != 0;
    }
}
