package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24545b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24546c = c(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f24547a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f24546c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(long j10) {
        this.f24547a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & Counter32.MAX_COUNTER32_VALUE);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10) + " x " + f(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f24547a, obj);
    }

    public int hashCode() {
        return h(this.f24547a);
    }

    public final /* synthetic */ long j() {
        return this.f24547a;
    }

    public String toString() {
        return i(this.f24547a);
    }
}
