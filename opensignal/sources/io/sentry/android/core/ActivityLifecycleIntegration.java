package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.b5;
import io.sentry.f2;
import io.sentry.g5;
import io.sentry.h5;
import io.sentry.i1;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.m6;
import io.sentry.o6;
import io.sentry.p1;
import io.sentry.q1;
import io.sentry.s6;
import io.sentry.t6;
import io.sentry.v3;
import io.sentry.x5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p.v2;

/* loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {
    public final boolean B;
    public i1 F;
    public final v2 M;

    /* renamed from: a, reason: collision with root package name */
    public final Application f11471a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11472d;

    /* renamed from: g, reason: collision with root package name */
    public v3 f11473g;

    /* renamed from: r, reason: collision with root package name */
    public SentryAndroidOptions f11474r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11475x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11476y = false;
    public boolean D = false;
    public io.sentry.g0 E = null;
    public final WeakHashMap G = new WeakHashMap();
    public final WeakHashMap H = new WeakHashMap();
    public final WeakHashMap I = new WeakHashMap();
    public k4 J = new h5(new Date(0), 0);
    public Future K = null;
    public final WeakHashMap L = new WeakHashMap();
    public final io.sentry.util.a N = new io.sentry.util.a();
    public final io.sentry.util.a O = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, f0 f0Var, v2 v2Var) {
        this.f11471a = application;
        this.f11472d = f0Var;
        this.M = v2Var;
        if (Build.VERSION.SDK_INT >= 29) {
            this.B = true;
        }
    }

    public static void f(i1 i1Var, i1 i1Var2) {
        if (i1Var == null || i1Var.d()) {
            return;
        }
        String description = i1Var.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = i1Var.getDescription() + " - Deadline Exceeded";
        }
        i1Var.o(description);
        k4 k4VarV = i1Var2 != null ? i1Var2.v() : null;
        if (k4VarV == null) {
            k4VarV = i1Var.A();
        }
        h(i1Var, k4VarV, o6.DEADLINE_EXCEEDED);
    }

    public static void h(i1 i1Var, k4 k4Var, o6 o6Var) {
        if (i1Var == null || i1Var.d()) {
            return;
        }
        if (o6Var == null) {
            o6Var = i1Var.u() != null ? i1Var.u() : o6.OK;
        }
        i1Var.x(o6Var, k4Var);
    }

    public final void b() {
        g5 g5Var;
        io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f11474r);
        if (gVarA.f11735r != 0) {
            g5Var = new g5((gVarA.b() ? gVarA.f11733d + gVarA.a() : 0L) * 1000000);
        } else {
            g5Var = null;
        }
        if (!this.f11475x || g5Var == null) {
            return;
        }
        h(this.F, g5Var, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11471a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f11474r;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        v2 v2Var = this.M;
        io.sentry.q qVarA = ((io.sentry.util.a) v2Var.B).a();
        try {
            if (v2Var.f()) {
                v2Var.h(new androidx.lifecycle.f0(18, v2Var), "FrameMetricsAggregator.stop");
                a5.t tVar = ((FrameMetricsAggregator) ((io.sentry.util.e) v2Var.f20201d).a()).f1209a;
                Object obj = tVar.f154b;
                tVar.f154b = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) v2Var.f20203r).clear();
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

    public final void i(k1 k1Var, i1 i1Var, i1 i1Var2) {
        if (k1Var == null || k1Var.d()) {
            return;
        }
        o6 o6Var = o6.DEADLINE_EXCEEDED;
        if (i1Var != null && !i1Var.d()) {
            i1Var.g(o6Var);
        }
        f(i1Var2, i1Var);
        Future future = this.K;
        if (future != null) {
            future.cancel(false);
            this.K = null;
        }
        o6 o6VarU = k1Var.u();
        if (o6VarU == null) {
            o6VarU = o6.OK;
        }
        k1Var.g(o6VarU);
        v3 v3Var = this.f11473g;
        if (v3Var != null) {
            v3Var.r(new bf.a(this, 22, k1Var));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.g0 g0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.B) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.q qVarA = this.N.a();
        try {
            if (this.f11473g != null && (sentryAndroidOptions = this.f11474r) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f11473g.r(new m6(ir.f0.B(activity), 1));
            }
            y(activity);
            i1 i1Var = (i1) this.G.get(activity);
            i1 i1Var2 = (i1) this.H.get(activity);
            this.D = true;
            if (this.f11475x && i1Var != null && i1Var2 != null && (g0Var = this.E) != null) {
                g0Var.f12261a.add(new d5.v(22));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.H;
        WeakHashMap weakHashMap2 = this.G;
        WeakHashMap weakHashMap3 = this.I;
        io.sentry.q qVarA = this.N.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity);
            if (bVar != null) {
                i1 i1Var = bVar.f11720d;
                if (i1Var != null && !i1Var.d()) {
                    bVar.f11720d.g(o6.CANCELLED);
                }
                bVar.f11720d = null;
                i1 i1Var2 = bVar.f11721e;
                if (i1Var2 != null && !i1Var2.d()) {
                    bVar.f11721e.g(o6.CANCELLED);
                }
                bVar.f11721e = null;
            }
            boolean z10 = this.f11475x;
            WeakHashMap weakHashMap4 = this.L;
            if (z10) {
                i1 i1Var3 = this.F;
                o6 o6Var = o6.CANCELLED;
                if (i1Var3 != null && !i1Var3.d()) {
                    i1Var3.g(o6Var);
                }
                i1 i1Var4 = (i1) weakHashMap2.get(activity);
                i1 i1Var5 = (i1) weakHashMap.get(activity);
                o6 o6Var2 = o6.DEADLINE_EXCEEDED;
                if (i1Var4 != null && !i1Var4.d()) {
                    i1Var4.g(o6Var2);
                }
                f(i1Var5, i1Var4);
                Future future = this.K;
                if (future != null) {
                    future.cancel(false);
                    this.K = null;
                }
                if (this.f11475x) {
                    i((k1) weakHashMap4.get(activity), null, null);
                }
                this.F = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.D = false;
                this.J = new h5(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.q qVarA = this.N.a();
        try {
            if (!this.B) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.I.get(activity);
        if (bVar != null) {
            i1 i1Var = this.F;
            if (i1Var == null) {
                i1Var = (i1) this.L.get(activity);
            }
            if (bVar.f11718b == null || i1Var == null) {
                return;
            }
            i1 i1VarA = io.sentry.android.core.performance.b.a(i1Var, bVar.f11717a.concat(".onCreate"), bVar.f11718b);
            bVar.f11720d = i1VarA;
            i1VarA.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.I.get(activity);
        if (bVar != null) {
            i1 i1Var = this.F;
            if (i1Var == null) {
                i1Var = (i1) this.L.get(activity);
            }
            if (bVar.f11719c != null && i1Var != null) {
                i1 i1VarA = io.sentry.android.core.performance.b.a(i1Var, bVar.f11717a.concat(".onStart"), bVar.f11719c);
                bVar.f11721e = i1VarA;
                i1VarA.k();
            }
            i1 i1Var2 = bVar.f11720d;
            if (i1Var2 == null || bVar.f11721e == null) {
                return;
            }
            k4 k4VarV = i1Var2.v();
            k4 k4VarV2 = bVar.f11721e.v();
            if (k4VarV == null || k4VarV2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            i.f11591a.getClass();
            h5 h5Var = new h5();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(h5Var.b(bVar.f11720d.A()));
            long millis2 = timeUnit.toMillis(h5Var.b(k4VarV));
            long millis3 = timeUnit.toMillis(h5Var.b(bVar.f11721e.A()));
            long millis4 = timeUnit.toMillis(h5Var.b(k4VarV2));
            io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
            String description = bVar.f11720d.getDescription();
            long millis5 = timeUnit.toMillis(bVar.f11720d.A().d());
            io.sentry.android.core.performance.g gVar = cVar.f11722a;
            gVar.f11732a = description;
            gVar.f11733d = millis5;
            gVar.f11734g = jUptimeMillis - millis;
            gVar.f11735r = jUptimeMillis - millis2;
            String description2 = bVar.f11721e.getDescription();
            long millis6 = timeUnit.toMillis(bVar.f11721e.A().d());
            io.sentry.android.core.performance.g gVar2 = cVar.f11723d;
            gVar2.f11732a = description2;
            gVar2.f11733d = millis6;
            gVar2.f11734g = jUptimeMillis - millis3;
            gVar2.f11735r = jUptimeMillis - millis4;
            io.sentry.android.core.performance.f.b().B.add(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        k4 h5Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.I.put(activity, bVar);
        if (this.D) {
            return;
        }
        v3 v3Var = this.f11473g;
        if (v3Var != null) {
            h5Var = v3Var.k().getDateProvider().a();
        } else {
            i.f11591a.getClass();
            h5Var = new h5();
        }
        this.J = h5Var;
        bVar.f11718b = h5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        k4 h5Var;
        this.D = true;
        v3 v3Var = this.f11473g;
        if (v3Var != null) {
            h5Var = v3Var.k().getDateProvider().a();
        } else {
            i.f11591a.getClass();
            h5Var = new h5();
        }
        this.J = h5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        k4 h5Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.I.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f11474r;
            if (sentryAndroidOptions != null) {
                h5Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                i.f11591a.getClass();
                h5Var = new h5();
            }
            bVar.f11719c = h5Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.q qVarA = this.N.a();
        try {
            if (!this.B) {
                onActivityPostStarted(activity);
            }
            if (this.f11475x) {
                final i1 i1Var = (i1) this.G.get(activity);
                final i1 i1Var2 = (i1) this.H.get(activity);
                if (activity.getWindow() != null) {
                    final int i10 = 0;
                    io.sentry.android.core.internal.util.j.a(activity, new Runnable(this) { // from class: io.sentry.android.core.d

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f11551d;

                        {
                            this.f11551d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f11551d.q(i1Var2, i1Var);
                                    break;
                                default:
                                    this.f11551d.q(i1Var2, i1Var);
                                    break;
                            }
                        }
                    }, this.f11472d);
                } else {
                    final int i11 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.d

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f11551d;

                        {
                            this.f11551d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f11551d.q(i1Var2, i1Var);
                                    break;
                                default:
                                    this.f11551d.q(i1Var2, i1Var);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.q qVarA = this.N.a();
        try {
            if (!this.B) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f11475x) {
                this.M.a(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void q(i1 i1Var, i1 i1Var2) {
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        io.sentry.android.core.performance.g gVar = fVarB.f11728g;
        io.sentry.android.core.performance.g gVar2 = fVarB.f11729r;
        if (gVar.b() && gVar.f11735r == 0) {
            gVar.f11735r = SystemClock.uptimeMillis();
        }
        if (gVar2.b() && gVar2.f11735r == 0) {
            gVar2.f11735r = SystemClock.uptimeMillis();
        }
        b();
        io.sentry.q qVarA = this.O.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f11474r;
            if (sentryAndroidOptions != null && i1Var2 != null) {
                k4 k4VarA = sentryAndroidOptions.getDateProvider().a();
                i1Var2.s("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(k4VarA.b(i1Var2.A()))), f2.MILLISECOND);
                h(i1Var2, k4VarA, null);
            } else if (i1Var2 != null && !i1Var2.d()) {
                i1Var2.k();
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

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11474r = sentryAndroidOptions;
        this.f11473g = v3.f12830a;
        this.f11475x = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.E = this.f11474r.getFullyDisplayedReporter();
        this.f11476y = this.f11474r.isEnableTimeToFullDisplayTracing();
        this.f11471a.registerActivityLifecycleCallbacks(this);
        this.f11474r.getLogger().m(b5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        ic.a.b("ActivityLifecycle");
    }

    public final void y(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        g5 g5Var;
        k4 k4Var;
        d8.a aVar;
        k1 k1Var;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f11473g != null) {
            WeakHashMap weakHashMap3 = this.L;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f11475x) {
                weakHashMap3.put(activity, io.sentry.v2.f12829a);
                if (this.f11474r.isEnableAutoTraceIdGeneration()) {
                    this.f11473g.r(new u0(4));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.H;
                weakHashMap2 = this.G;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                i((k1) entry.getValue(), (i1) weakHashMap2.get(entry.getKey()), (i1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f11474r);
            cj.a aVar2 = null;
            if (e0.i() && gVarA.b()) {
                g5 g5Var2 = gVarA.b() ? new g5(gVarA.f11733d * 1000000) : null;
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.f.b().f11726a == io.sentry.android.core.performance.e.COLD);
                g5Var = g5Var2;
            } else {
                boolValueOf = null;
                g5Var = null;
            }
            t6 t6Var = new t6();
            long deadlineTimeout = this.f11474r.getDeadlineTimeout();
            t6Var.f12744h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.f11474r.isEnableActivityLifecycleTracingAutoFinish()) {
                t6Var.f12743g = this.f11474r.getIdleTimeout();
                t6Var.f7148b = true;
            }
            t6Var.f12742f = true;
            t6Var.f12745i = new e(this, weakReference, simpleName);
            if (this.D || g5Var == null || boolValueOf == null) {
                k4Var = this.J;
            } else {
                cj.a aVar3 = io.sentry.android.core.performance.f.b().F;
                io.sentry.android.core.performance.f.b().F = null;
                aVar2 = aVar3;
                k4Var = g5Var;
            }
            t6Var.f7149c = k4Var;
            t6Var.f12741e = aVar2 != null;
            t6Var.f7150d = "auto.ui.activity";
            k1 k1VarQ = this.f11473g.q(new s6(simpleName, io.sentry.protocol.c0.COMPONENT, "ui.load", aVar2), t6Var);
            d8.a aVar4 = new d8.a(2, false);
            aVar4.f7150d = "auto.ui.activity";
            if (this.D || g5Var == null || boolValueOf == null) {
                aVar = aVar4;
            } else {
                i1 i1VarY = k1VarQ.y(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", g5Var, p1.SENTRY, aVar4);
                k1VarQ = k1VarQ;
                aVar = aVar4;
                this.F = i1VarY;
                b();
            }
            String strConcat = simpleName.concat(" initial display");
            p1 p1Var = p1.SENTRY;
            k4 k4Var2 = k4Var;
            i1 i1VarY2 = k1VarQ.y("ui.load.initial_display", strConcat, k4Var2, p1Var, aVar);
            weakHashMap2.put(activity, i1VarY2);
            if (!this.f11476y || this.E == null || this.f11474r == null) {
                k1Var = k1VarQ;
            } else {
                i1 i1VarY3 = k1VarQ.y("ui.load.full_display", simpleName.concat(" full display"), k4Var2, p1Var, aVar);
                k1Var = k1VarQ;
                try {
                    weakHashMap.put(activity, i1VarY3);
                    this.K = this.f11474r.getExecutorService().q(new a5.o(this, i1VarY3, i1VarY2), 25000L);
                } catch (RejectedExecutionException e4) {
                    this.f11474r.getLogger().g(b5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e4);
                }
            }
            this.f11473g.r(new androidx.media3.exoplayer.trackselection.h(this, 19, k1Var));
            weakHashMap3.put(activity, k1Var);
        }
    }
}
