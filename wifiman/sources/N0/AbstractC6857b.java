package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6857b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f54104a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f54105b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f54106c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f54107d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f54108e;

    /* renamed from: n0.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return AbstractC6857b.f54107d;
        }

        public final long b() {
            return AbstractC6857b.f54105b;
        }

        public final long c() {
            return AbstractC6857b.f54106c;
        }

        private a() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f54105b = d((0 & Counter32.MAX_COUNTER32_VALUE) | j11);
        f54106c = d((1 & Counter32.MAX_COUNTER32_VALUE) | j11);
        f54107d = d(j11 | (2 & Counter32.MAX_COUNTER32_VALUE));
        f54108e = d((j10 & Counter32.MAX_COUNTER32_VALUE) | (4 << 32));
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f54105b) ? "Rgb" : e(j10, f54106c) ? "Xyz" : e(j10, f54107d) ? "Lab" : e(j10, f54108e) ? "Cmyk" : "Unknown";
    }
}
