package I9;

import E.u;
import F9.z;
import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2632a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2633b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2634c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2635d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2636e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f2637f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f2638g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f2639h;

    static {
        String property;
        int i = z.f1790a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f2632a = property;
        f2633b = u.O(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i10 = z.f1790a;
        if (i10 < 2) {
            i10 = 2;
        }
        f2634c = u.P(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f2635d = u.P(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f2636e = TimeUnit.SECONDS.toNanos(u.O(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f2637f = e.f2626b;
        f2638g = new i(0);
        f2639h = new i(1);
    }
}
