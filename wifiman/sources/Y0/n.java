package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24536b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24537c = c(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f24538a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f24537c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j10) {
        this.f24538a = j10;
    }

    public static final /* synthetic */ n b(long j10) {
        return new n(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, int i10, int i11) {
        return c((i10 << 32) | (i11 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (Counter32.MAX_COUNTER32_VALUE & j10);
        }
        return d(j10, i10, i11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).n();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int i(long j10) {
        return (int) (j10 & Counter32.MAX_COUNTER32_VALUE);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        return c(((((int) (j10 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) - ((int) (j11 & Counter32.MAX_COUNTER32_VALUE))) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static final long l(long j10, long j11) {
        return c(((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & Counter32.MAX_COUNTER32_VALUE)) + ((int) (j11 & Counter32.MAX_COUNTER32_VALUE))) & Counter32.MAX_COUNTER32_VALUE));
    }

    public static String m(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f24538a, obj);
    }

    public int hashCode() {
        return j(this.f24538a);
    }

    public final /* synthetic */ long n() {
        return this.f24538a;
    }

    public String toString() {
        return m(this.f24538a);
    }
}
