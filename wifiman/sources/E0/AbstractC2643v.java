package E0;

import org.snmp4j.smi.Counter32;

/* renamed from: E0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2643v {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10) {
        return AbstractC2639q.b(((z10 ? 1L : 0L) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToIntBits(f10) << 32));
    }
}
