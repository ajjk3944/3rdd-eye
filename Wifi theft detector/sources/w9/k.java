package w9;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.f0;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24855a = d0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f24856b = f0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f24857c = f0.e("kotlinx.coroutines.scheduler.core.pool.size", q9.e.b(d0.a(), 2), 1, 0, 8, null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f24858d = f0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e, reason: collision with root package name */
    public static final long f24859e = TimeUnit.SECONDS.toNanos(f0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f, reason: collision with root package name */
    public static f f24860f = d.f24845a;

    /* renamed from: g, reason: collision with root package name */
    public static final h f24861g = new i(0);

    /* renamed from: h, reason: collision with root package name */
    public static final h f24862h = new i(1);
}
