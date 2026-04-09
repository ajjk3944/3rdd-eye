package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6525a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1932a f52329a = new C1932a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f52330b = AbstractC6526b.b(0.0f, 0.0f, 2, null);

    /* renamed from: l0.a$a, reason: collision with other inner class name */
    public static final class C1932a {
        public /* synthetic */ C1932a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return AbstractC6525a.f52330b;
        }

        private C1932a() {
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (d(j10) == e(j10)) {
            return "CornerRadius.circular(" + AbstractC6527c.a(d(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC6527c.a(d(j10), 1) + ", " + AbstractC6527c.a(e(j10), 1) + ')';
    }
}
