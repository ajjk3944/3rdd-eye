package G5;

import E5.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1713a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1714b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1715c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1716d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1717e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f1718f;

    /* renamed from: g, reason: collision with root package name */
    public static final V0.m f1719g;

    /* renamed from: h, reason: collision with root package name */
    public static final V0.m f1720h;

    static {
        String property;
        int i = v.f1415a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1713a = property;
        f1714b = E5.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = v.f1415a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1715c = E5.a.j(i3, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f1716d = E5.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f1717e = TimeUnit.SECONDS.toNanos(E5.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1718f = g.f1708a;
        f1719g = new V0.m(0, 1);
        f1720h = new V0.m(1, 1);
    }
}
