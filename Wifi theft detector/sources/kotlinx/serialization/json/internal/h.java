package kotlinx.serialization.json.internal;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23013a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final z8.j f23014b = new z8.j();

    /* renamed from: c, reason: collision with root package name */
    public static int f23015c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23016d;

    static {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.p.d(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objB = Result.b(s9.q.o(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f23016d = num != null ? num.intValue() : ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public final void a(char[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        synchronized (this) {
            try {
                int i10 = f23015c;
                if (array.length + i10 < f23016d) {
                    f23015c = i10 + array.length;
                    f23014b.addLast(array);
                }
                y8.s sVar = y8.s.f25199a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b() {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) f23014b.y();
            if (cArr != null) {
                f23015c -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[128] : cArr;
    }
}
