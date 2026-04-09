package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4572e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f40767g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f40768h = "WatchDog-" + Md.f39862a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f40769a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f40770b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f40771c;

    /* renamed from: d, reason: collision with root package name */
    public C4547d f40772d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40773e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f40774f;

    public C4572e(Wb wb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f40769a = copyOnWriteArrayList;
        this.f40770b = new AtomicInteger();
        this.f40771c = new Handler(Looper.getMainLooper());
        this.f40773e = new AtomicBoolean();
        this.f40774f = new C.V(this, 26);
        copyOnWriteArrayList.add(wb);
    }

    public final /* synthetic */ void a() {
        this.f40773e.set(true);
    }

    public final synchronized void b() {
        C4547d c4547d = this.f40772d;
        if (c4547d != null) {
            c4547d.f40673a.set(false);
            this.f40772d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i) {
        AtomicInteger atomicInteger = this.f40770b;
        int i10 = 5;
        if (i >= 5) {
            i10 = i;
        }
        atomicInteger.set(i10);
        if (this.f40772d == null) {
            C4547d c4547d = new C4547d(this);
            this.f40772d = c4547d;
            try {
                c4547d.setName(f40768h);
            } catch (SecurityException unused) {
            }
            this.f40772d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
