package l0;

import org.snmp4j.smi.Counter32;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6538n {
    public static final long a(float f10, float f11) {
        return C6537m.d((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10) {
        if (j10 == 9205357640488583168L) {
            AbstractC6528d.a("Size is unspecified");
        }
        return AbstractC6532h.a(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) / 2.0f);
    }

    public static final C6533i c(long j10) {
        return AbstractC6534j.b(C6531g.f52335b.c(), j10);
    }
}
