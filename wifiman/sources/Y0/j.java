package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24528b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24529c = b(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f24530d = b(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name */
    private final long f24531a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j10) {
        this.f24531a = j10;
    }

    public static final /* synthetic */ j a(long j10) {
        return new j(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).i();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final float e(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final float f(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE)));
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.r(e(j10))) + ", " + ((Object) h.r(f(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f24531a, obj);
    }

    public int hashCode() {
        return g(this.f24531a);
    }

    public final /* synthetic */ long i() {
        return this.f24531a;
    }

    public String toString() {
        return h(this.f24531a);
    }
}
