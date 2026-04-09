package l0;

import org.snmp4j.smi.Counter32;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6526b {
    public static final long a(float f10, float f11) {
        return AbstractC6525a.b((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a(f10, f11);
    }
}
