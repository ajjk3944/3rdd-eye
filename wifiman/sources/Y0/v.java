package Y0;

import Y0.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24549b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final x[] f24550c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f24551d;

    /* renamed from: a, reason: collision with root package name */
    private final long f24552a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return v.f24551d;
        }

        private a() {
        }
    }

    static {
        x.a aVar = x.f24553b;
        f24550c = new x[]{x.d(aVar.c()), x.d(aVar.b()), x.d(aVar.a())};
        f24551d = w.j(0L, Float.NaN);
    }

    private /* synthetic */ v(long j10) {
        this.f24552a = j10;
    }

    public static final /* synthetic */ v b(long j10) {
        return new v(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f24550c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long jG = g(j10);
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (x.g(jG, aVar.b())) {
            return h(j10) + ".sp";
        }
        if (!x.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j10) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.f24552a, obj);
    }

    public int hashCode() {
        return i(this.f24552a);
    }

    public final /* synthetic */ long k() {
        return this.f24552a;
    }

    public String toString() {
        return j(this.f24552a);
    }
}
