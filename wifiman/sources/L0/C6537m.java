package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6537m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52356b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f52357c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f52358d = d(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name */
    private final long f52359a;

    /* renamed from: l0.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C6537m.f52358d;
        }

        public final long b() {
            return C6537m.f52357c;
        }

        private a() {
        }
    }

    private /* synthetic */ C6537m(long j10) {
        this.f52359a = j10;
    }

    public static final /* synthetic */ C6537m c(long j10) {
        return new C6537m(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C6537m) && j10 == ((C6537m) obj).m();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        if (j10 == 9205357640488583168L) {
            AbstractC6528d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final float h(long j10) {
        if (j10 == 9205357640488583168L) {
            AbstractC6528d.a("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float i(long j10) {
        if (j10 == 9205357640488583168L) {
            AbstractC6528d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean k(long j10) {
        if (j10 == 9205357640488583168L) {
            AbstractC6528d.a("Size is unspecified");
        }
        long j11 = j10 & (~((((-9223372034707292160L) & j10) >>> 31) * (-1)));
        return ((j11 & Counter32.MAX_COUNTER32_VALUE) & (j11 >>> 32)) == 0;
    }

    public static String l(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC6527c.a(i(j10), 1) + ", " + AbstractC6527c.a(g(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f52359a, obj);
    }

    public int hashCode() {
        return j(this.f52359a);
    }

    public final /* synthetic */ long m() {
        return this.f52359a;
    }

    public String toString() {
        return l(this.f52359a);
    }
}
