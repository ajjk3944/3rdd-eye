package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24558b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24559c = c(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f24560a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return y.f24559c;
        }

        private a() {
        }
    }

    private /* synthetic */ y(long j10) {
        this.f24560a = j10;
    }

    public static final /* synthetic */ y b(long j10) {
        return new y(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, float f10, float f11) {
        return c((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static /* synthetic */ long e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (Counter32.MAX_COUNTER32_VALUE & j10));
        }
        return d(j10, f10, f11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof y) && j10 == ((y) obj).o();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) - Float.intBitsToFloat((int) (j11 & Counter32.MAX_COUNTER32_VALUE));
        return c((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final long l(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) + Float.intBitsToFloat((int) (j11 & Counter32.MAX_COUNTER32_VALUE));
        return c((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final long m(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) * f10;
        return c((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static String n(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f24560a, obj);
    }

    public int hashCode() {
        return j(this.f24560a);
    }

    public final /* synthetic */ long o() {
        return this.f24560a;
    }

    public String toString() {
        return n(this.f24560a);
    }
}
