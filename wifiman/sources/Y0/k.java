package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24532b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24533c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f24534d = d(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name */
    private final long f24535a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f24534d;
        }

        public final long b() {
            return k.f24533c;
        }

        private a() {
        }
    }

    private /* synthetic */ k(long j10) {
        this.f24535a = j10;
    }

    public static final /* synthetic */ k c(long j10) {
        return new k(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof k) && j10 == ((k) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)));
    }

    public static final float h(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.r(h(j10))) + " x " + ((Object) h.r(g(j10)));
    }

    public boolean equals(Object obj) {
        return e(this.f24535a, obj);
    }

    public int hashCode() {
        return i(this.f24535a);
    }

    public final /* synthetic */ long k() {
        return this.f24535a;
    }

    public String toString() {
        return j(this.f24535a);
    }
}
