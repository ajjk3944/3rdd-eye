package o;

import org.snmp4j.smi.Counter32;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7014e {
    public static long a(float f10, float f11) {
        return b((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static long b(long j10) {
        return j10;
    }
}
