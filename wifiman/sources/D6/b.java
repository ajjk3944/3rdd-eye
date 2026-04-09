package D6;

import org.snmp4j.smi.Counter32;

/* loaded from: classes3.dex */
public abstract class b {
    public static final long a(float f10, float f11) {
        return a.b((Float.floatToIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToIntBits(f10) << 32));
    }
}
