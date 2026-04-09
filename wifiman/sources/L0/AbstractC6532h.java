package l0;

import a1.AbstractC3751b;
import org.snmp4j.smi.Counter32;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6532h {
    public static final long a(float f10, float f11) {
        return C6531g.e((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        long j11 = (j10 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j11) & (j11 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j10) {
        return (j10 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j10) {
        return (j10 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long e(long j10, long j11, float f10) {
        float fB = AbstractC3751b.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fB2 = AbstractC3751b.b(Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)), Float.intBitsToFloat((int) (j11 & Counter32.MAX_COUNTER32_VALUE)), f10);
        return C6531g.e((Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fB2) & Counter32.MAX_COUNTER32_VALUE));
    }
}
