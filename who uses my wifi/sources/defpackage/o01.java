package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class o01 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final pz f;
    public static final h80 g;
    public static final h80 h;

    static {
        String property;
        int i = wz0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = zt0.v("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = wz0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = zt0.w("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = zt0.w("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(zt0.v("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = pz.k;
        g = new h80(0, 3);
        h = new h80(1, 3);
    }
}
