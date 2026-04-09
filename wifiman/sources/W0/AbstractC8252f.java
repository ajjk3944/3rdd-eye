package w0;

import org.snmp4j.smi.Counter32;

/* renamed from: w0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8252f {
    public static final long a(int i10) {
        return C8247a.n((i10 << 32) | (0 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }
}
