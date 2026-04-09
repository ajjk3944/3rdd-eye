package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6531g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52335b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f52336c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f52337d = e(9187343241974906880L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f52338e = e(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name */
    private final long f52339a;

    /* renamed from: l0.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C6531g.f52337d;
        }

        public final long b() {
            return C6531g.f52338e;
        }

        public final long c() {
            return C6531g.f52336c;
        }

        private a() {
        }
    }

    private /* synthetic */ C6531g(long j10) {
        this.f52339a = j10;
    }

    public static final /* synthetic */ C6531g d(long j10) {
        return new C6531g(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (Counter32.MAX_COUNTER32_VALUE & j10));
        }
        return f(j10, f10, f11);
    }

    public static final long h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) / f10;
        return e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof C6531g) && j10 == ((C6531g) obj).v();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final float k(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        long j11 = j10 & 9223372034707292159L;
        return (((~j11) & (j11 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long q(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) - Float.intBitsToFloat((int) (j11 & Counter32.MAX_COUNTER32_VALUE));
        return e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final long r(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) + Float.intBitsToFloat((int) (j11 & Counter32.MAX_COUNTER32_VALUE));
        return e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final long s(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) * f10;
        return e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static String t(long j10) {
        if (!AbstractC6532h.c(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC6527c.a(m(j10), 1) + ", " + AbstractC6527c.a(n(j10), 1) + ')';
    }

    public static final long u(long j10) {
        return e(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return i(this.f52339a, obj);
    }

    public int hashCode() {
        return o(this.f52339a);
    }

    public String toString() {
        return t(this.f52339a);
    }

    public final /* synthetic */ long v() {
        return this.f52339a;
    }
}
