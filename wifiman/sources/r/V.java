package r;

import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class V {
    public static long a(long j10) {
        return j10;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }
}
