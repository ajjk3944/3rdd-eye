package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2125a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f2126b = T.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static long a(long j10) {
        return j10;
    }

    public static final float b(long j10) {
        if (!(j10 != f2126b)) {
            B0.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        if (!(j10 != f2126b)) {
            B0.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }
}
