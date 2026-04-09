package Y0;

import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class z {
    public static final long a(float f10, float f11) {
        return y.c((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }
}
