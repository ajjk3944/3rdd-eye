package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.e0;
import io.sentry.android.core.f0;
import io.sentry.android.core.internal.util.j;
import io.sentry.android.core.s;
import io.sentry.m2;
import io.sentry.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f extends a {
    public static volatile f L;
    public static long K = SystemClock.uptimeMillis();
    public static final io.sentry.util.a M = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public e f11726a = e.UNKNOWN;
    public s D = null;
    public io.sentry.android.core.g E = null;
    public cj.a F = null;
    public boolean G = false;
    public boolean H = true;
    public final AtomicInteger I = new AtomicInteger();
    public final AtomicBoolean J = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final g f11728g = new g();

    /* renamed from: r, reason: collision with root package name */
    public final g f11729r = new g();

    /* renamed from: x, reason: collision with root package name */
    public final g f11730x = new g();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f11731y = new HashMap();
    public final ArrayList B = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f11727d = e0.i();

    public static f b() {
        if (L == null) {
            q qVarA = M.a();
            try {
                if (L == null) {
                    L = new f();
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return L;
    }

    public static void c(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVar = new g();
        gVar.c(jUptimeMillis);
        b().f11731y.put(contentProvider, gVar);
    }

    public static void d(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVar = (g) b().f11731y.get(contentProvider);
        if (gVar == null || gVar.f11735r != 0) {
            return;
        }
        gVar.f11732a = contentProvider.getClass().getName().concat(".onCreate");
        gVar.f11735r = jUptimeMillis;
    }

    public final g a(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f11726a != e.UNKNOWN && this.f11727d) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                g gVar = this.f11728g;
                if (gVar.b() && gVar.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return gVar;
                }
            }
            g gVar2 = this.f11729r;
            if (gVar2.b() && gVar2.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return gVar2;
            }
        }
        return new g();
    }

    public final synchronized void e() {
        if (!this.J.getAndSet(true)) {
            f fVarB = b();
            g gVar = fVarB.f11729r;
            gVar.getClass();
            gVar.f11735r = SystemClock.uptimeMillis();
            g gVar2 = fVarB.f11728g;
            gVar2.getClass();
            gVar2.f11735r = SystemClock.uptimeMillis();
        }
    }

    public final void f(Application application) {
        if (this.G) {
            return;
        }
        boolean z10 = true;
        this.G = true;
        if (!this.f11727d && !e0.i()) {
            z10 = false;
        }
        this.f11727d = z10;
        application.registerActivityLifecycleCallbacks(L);
        new Handler(Looper.getMainLooper()).post(new d(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f0.f11568b.c(activity);
        if (this.I.incrementAndGet() == 1 && !this.J.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            g gVar = this.f11728g;
            long j = jUptimeMillis - gVar.f11734g;
            if (!this.f11727d || j > TimeUnit.MINUTES.toMillis(1L)) {
                this.f11726a = e.WARM;
                this.H = true;
                gVar.f11732a = null;
                gVar.f11734g = 0L;
                gVar.f11735r = 0L;
                gVar.f11733d = 0L;
                gVar.f11734g = SystemClock.uptimeMillis();
                gVar.f11733d = System.currentTimeMillis();
                gVar.c(jUptimeMillis);
                K = jUptimeMillis;
                this.f11731y.clear();
                g gVar2 = this.f11730x;
                gVar2.f11732a = null;
                gVar2.f11734g = 0L;
                gVar2.f11735r = 0L;
                gVar2.f11733d = 0L;
            } else {
                this.f11726a = bundle == null ? e.COLD : e.WARM;
            }
        }
        this.f11727d = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f0 f0Var = f0.f11568b;
        WeakReference weakReference = (WeakReference) f0Var.f11569a;
        if (weakReference == null || weakReference.get() == activity) {
            f0Var.f11569a = null;
        }
        if (this.I.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f11727d = false;
        this.H = true;
        this.J.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f0 f0Var = f0.f11568b;
        WeakReference weakReference = (WeakReference) f0Var.f11569a;
        if (weakReference == null || weakReference.get() == activity) {
            f0Var.f11569a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f0.f11568b.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f0.f11568b.c(activity);
        if (this.J.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            j.a(activity, new d(this, 1), new f0(m2.f12434a));
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this, 2));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f0 f0Var = f0.f11568b;
        WeakReference weakReference = (WeakReference) f0Var.f11569a;
        if (weakReference == null || weakReference.get() == activity) {
            f0Var.f11569a = null;
        }
    }
}
