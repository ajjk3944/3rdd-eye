package D6;

import kotlin.jvm.internal.C6486l;
import org.snmp4j.smi.Counter32;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f2890a;

    private /* synthetic */ a(long j10) {
        this.f2890a = j10;
    }

    public static final /* synthetic */ a a(long j10) {
        return new a(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static final long c(long j10, float f10, float f11) {
        return b.a(f10, f11);
    }

    public static /* synthetic */ long d(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = g(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = h(j10);
        }
        return c(j10, f10, f11);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        C6486l c6486l = C6486l.f51726a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float h(long j10) {
        C6486l c6486l = C6486l.f51726a;
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        return "Point(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f2890a, obj);
    }

    public int hashCode() {
        return i(this.f2890a);
    }

    public final /* synthetic */ long k() {
        return this.f2890a;
    }

    public String toString() {
        return j(this.f2890a);
    }
}
