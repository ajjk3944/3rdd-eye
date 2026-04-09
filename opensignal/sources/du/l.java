package du;

import bu.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7578a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7579b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7580c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7581d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7582e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f7583f;

    static {
        String property;
        int i10 = u.f2991a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7578a = property;
        f7579b = bu.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = u.f2991a;
        if (i11 < 2) {
            i11 = 2;
        }
        f7580c = bu.a.j("kotlinx.coroutines.scheduler.core.pool.size", i11, 8);
        f7581d = bu.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7582e = TimeUnit.SECONDS.toNanos(bu.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7583f = h.f7573a;
    }
}
