package M0;

import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class i0 {
    public static long a(long j10) {
        return j10;
    }

    public static final int b(long j10) {
        return (int) (j10 & Counter32.MAX_COUNTER32_VALUE);
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }
}
