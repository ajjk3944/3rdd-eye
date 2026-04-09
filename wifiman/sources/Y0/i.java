package Y0;

import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class i {
    public static final long a(float f10, float f11) {
        return j.b((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(float f10, float f11) {
        return k.d((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }
}
