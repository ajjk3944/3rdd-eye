package el;

import cl.v;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23569a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f23570b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23571c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23572d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f23573e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f23574f;

    static {
        String property;
        int i4 = v.f2943a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f23569a = property;
        f23570b = cl.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = v.f2943a;
        if (i10 < 2) {
            i10 = 2;
        }
        f23571c = cl.b.l(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f23572d = cl.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f23573e = TimeUnit.SECONDS.toNanos(cl.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f23574f = g.f23564a;
    }
}
