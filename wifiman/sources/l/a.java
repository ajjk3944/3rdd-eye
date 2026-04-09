package L;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0437a f10899a = new C0437a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f10900b = b(Float.NaN, Float.NaN);

    /* renamed from: L.a$a, reason: collision with other inner class name */
    public static final class C0437a {
        public /* synthetic */ C0437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f10900b;
        }

        private C0437a() {
        }
    }

    public static long b(float f10, float f11) {
        return c((Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
    }

    private static long c(long j10) {
        return j10;
    }

    public static long d(Y0.d dVar) {
        return b(dVar.getDensity(), dVar.y());
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static String h(long j10) {
        return "InlineDensity(density=" + f(j10) + ", fontScale=" + g(j10) + ')';
    }
}
