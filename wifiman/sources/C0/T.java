package C0;

import l0.AbstractC6538n;
import l0.C6537m;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class T {
    public static final long a(float f10, float f11) {
        return S.a((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10, long j11) {
        return AbstractC6538n.a(C6537m.i(j10) * S.b(j11), C6537m.g(j10) * S.c(j11));
    }
}
