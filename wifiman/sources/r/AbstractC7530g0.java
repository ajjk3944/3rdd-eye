package r;

import org.snmp4j.smi.Counter32;

/* renamed from: r.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7530g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f59704a = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        return V.a((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final float b() {
        return f59704a;
    }
}
