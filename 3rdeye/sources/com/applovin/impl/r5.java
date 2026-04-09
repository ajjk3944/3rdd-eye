package com.applovin.impl;

import io.appmetrica.analytics.impl.Oo;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class r5 {

    /* renamed from: o, reason: collision with root package name */
    private static final ExecutorService f20870o = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20871a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20872b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20873c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20874d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20875e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20876f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20877g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f20878h;
    private final ScheduledThreadPoolExecutor i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f20879j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final List f20880k = new ArrayList(5);

    /* renamed from: l, reason: collision with root package name */
    private final Object f20881l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f20882m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20883n;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20884a;

        static {
            int[] iArr = new int[b.values().length];
            f20884a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20884a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20884a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20884a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f20891a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.o unused = r5.this.f20872b;
                if (com.applovin.impl.sdk.o.a()) {
                    r5.this.f20872b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public c(String str) {
            this.f20891a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f20891a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) r5.this.f20871a.a(l4.f19798O)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f20894a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20895b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f20896c;

        /* renamed from: d, reason: collision with root package name */
        private final w4 f20897d;

        /* renamed from: e, reason: collision with root package name */
        private final b f20898e;

        public d(com.applovin.impl.sdk.k kVar, w4 w4Var, b bVar) {
            this.f20894a = kVar;
            this.f20896c = kVar.O();
            this.f20895b = w4Var.c();
            this.f20897d = w4Var;
            this.f20898e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC2128k0.a();
                if (!this.f20894a.E0() || this.f20897d.d()) {
                    ScheduledFuture scheduledFutureB = this.f20897d.b(Thread.currentThread(), ((Long) this.f20894a.a(l4.f20050w)).longValue());
                    this.f20897d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20896c.d(this.f20895b, "Task re-scheduled...");
                    }
                    this.f20894a.q0().a(this.f20897d, this.f20898e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20896c.a(this.f20895b, "Task failed execution", th);
                    }
                    this.f20897d.a(th);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20896c.d(this.f20895b, this.f20898e + " queue finished task " + this.f20897d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20896c.d(this.f20895b, this.f20898e + " queue finished task " + this.f20897d.c());
                    }
                }
            }
        }
    }

    public r5(com.applovin.impl.sdk.k kVar) {
        this.f20871a = kVar;
        this.f20872b = kVar.O();
        this.f20883n = ((Boolean) kVar.a(l4.f19818R)).booleanValue();
        this.f20873c = a("auxiliary_operations", ((Integer) kVar.a(l4.f19785M)).intValue());
        this.f20874d = a("shared_thread_pool", ((Integer) kVar.a(l4.f19778L)).intValue());
        this.f20875e = a("core", ((Integer) kVar.a(l4.f19825S)).intValue());
        this.f20877g = a("caching", ((Integer) kVar.a(l4.f19832T)).intValue());
        this.f20878h = a("mediation", ((Integer) kVar.a(l4.f19839U)).intValue());
        this.f20876f = a("timeout", ((Integer) kVar.a(l4.f19846V)).intValue());
        this.i = a("other", ((Integer) kVar.a(l4.f19853W)).intValue());
    }

    public Executor c() {
        return this.f20883n ? this.f20875e : this.f20874d;
    }

    public boolean d() {
        return this.f20882m;
    }

    public void e() {
        synchronized (this.f20881l) {
            try {
                this.f20882m = true;
                for (d dVar : this.f20880k) {
                    a(dVar.f20897d, dVar.f20898e);
                }
                this.f20880k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.f20881l) {
            this.f20882m = false;
        }
    }

    public void a(w4 w4Var, b bVar) {
        a(w4Var, bVar, 0L);
    }

    public void a(w4 w4Var, b bVar, long j4) {
        a(w4Var, bVar, j4, false);
    }

    public ScheduledFuture b(w4 w4Var, b bVar, long j4) {
        if (this.f20883n) {
            return a(new d(this.f20871a, w4Var, bVar)).schedule(w4Var, j4, TimeUnit.MILLISECONDS);
        }
        return this.f20873c.schedule(w4Var, j4, TimeUnit.MILLISECONDS);
    }

    public void a(w4 w4Var, b bVar, long j4, boolean z10) {
        if (w4Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j4 >= 0) {
            d dVar = new d(this.f20871a, w4Var, bVar);
            if (!b(dVar)) {
                a(dVar, j4, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20872b.d(w4Var.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(Oo.d(j4, "Invalid delay (millis) specified: "));
    }

    public ExecutorService b() {
        return this.f20883n ? this.f20877g : f20870o;
    }

    private boolean b(d dVar) {
        if (dVar.f20897d.d()) {
            return false;
        }
        synchronized (this.f20881l) {
            try {
                if (this.f20882m) {
                    return false;
                }
                this.f20880k.add(dVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f20883n) {
            com.applovin.impl.sdk.k kVar = this.f20871a;
            d dVar = new d(kVar, new f6(kVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f20873c.submit(runnable);
    }

    public ExecutorService a() {
        return this.f20883n ? this.i : this.f20873c;
    }

    public void a(w4 w4Var) {
        if (w4Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f20883n ? this.f20875e : this.f20874d;
            try {
                if (a7.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f20871a, w4Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = w4Var.b(Thread.currentThread(), ((Long) this.f20871a.a(l4.f20050w)).longValue());
                w4Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20872b.a(w4Var.c(), "Task failed execution", th);
                }
                w4Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(w4 w4Var, a3 a3Var) {
        String strB = a3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = (ScheduledThreadPoolExecutor) this.f20879j.get(strB);
        if (scheduledThreadPoolExecutorA == null) {
            scheduledThreadPoolExecutorA = a(strB, 1);
            this.f20879j.put(strB, scheduledThreadPoolExecutorA);
        }
        scheduledThreadPoolExecutorA.submit(new d(this.f20871a, w4Var, b.MEDIATION));
    }

    private void a(d dVar, long j4, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f20883n ? a(dVar) : this.f20874d;
        if (j4 <= 0) {
            scheduledThreadPoolExecutorA.submit(dVar);
        } else if (z10) {
            C2112c0.a(j4, this.f20871a, new H0(1, scheduledThreadPoolExecutorA, dVar));
        } else {
            scheduledThreadPoolExecutorA.schedule(dVar, j4, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i = a.f20884a[dVar.f20898e.ordinal()];
        if (i == 1) {
            return this.f20875e;
        }
        if (i == 2) {
            return this.f20877g;
        }
        if (i == 3) {
            return this.f20878h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f20876f;
    }

    private ScheduledThreadPoolExecutor a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new c(str));
    }
}
