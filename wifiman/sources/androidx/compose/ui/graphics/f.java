package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.p1;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28939b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f28940c = p1.a(0.5f, 0.5f);

    /* renamed from: a, reason: collision with root package name */
    private final long f28941a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f.f28940c;
        }

        private a() {
        }
    }

    private /* synthetic */ f(long j10) {
        this.f28941a = j10;
    }

    public static final /* synthetic */ f b(long j10) {
        return new f(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f28941a, obj);
    }

    public int hashCode() {
        return h(this.f28941a);
    }

    public final /* synthetic */ long j() {
        return this.f28941a;
    }

    public String toString() {
        return i(this.f28941a);
    }
}
