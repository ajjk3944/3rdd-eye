package com.applovin.impl;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d6 {

    /* renamed from: r, reason: collision with root package name */
    private static final ExecutorService f3934r = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3935a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3936b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3937c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3938d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3939e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3940f;
    private final ScheduledThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3941h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3942i;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f3943k;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f3944l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3947o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3948p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f3949q;
    private final Map j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final List f3945m = new ArrayList(5);

    /* renamed from: n, reason: collision with root package name */
    private final Object f3946n = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3950a;

        static {
            int[] iArr = new int[b.values().length];
            f3950a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3950a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3950a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3950a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private final long f3957f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j) {
            super(kVar, i5Var, bVar);
            this.f3957f = j;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f3958a;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.o unused = d6.this.f3936b;
                if (com.applovin.impl.sdk.o.a()) {
                    d6.this.f3936b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public d(String str) {
            this.f3958a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f3958a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f3935a.a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f3961a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3962b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f3963c;

        /* renamed from: d, reason: collision with root package name */
        protected final i5 f3964d;

        /* renamed from: e, reason: collision with root package name */
        protected final b f3965e;

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.f3961a = kVar;
            this.f3963c = kVar.O();
            this.f3962b = i5Var.c();
            this.f3964d = i5Var;
            this.f3965e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f3961a.E0() || this.f3964d.d()) {
                    ScheduledFuture scheduledFutureB = this.f3964d.b(Thread.currentThread(), ((Long) this.f3961a.a(x4.f6153v)).longValue());
                    this.f3964d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3963c.d(this.f3962b, "Task re-scheduled...");
                    }
                    this.f3961a.q0().a(this.f3964d, this.f3965e, 2000L);
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3963c.a(this.f3962b, "Task failed execution", th2);
                    }
                    this.f3964d.a(th2);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3963c.d(this.f3962b, this.f3965e + " queue finished task " + this.f3964d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3963c.d(this.f3962b, this.f3965e + " queue finished task " + this.f3964d.c());
                    }
                }
            }
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.f3935a = kVar;
        this.f3936b = kVar.O();
        this.f3948p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.f3949q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.f3937c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.f3938d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.f3939e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.f3941h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f3940f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.f3942i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.f3943k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f3944l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.f3948p ? this.f3939e : this.f3938d;
    }

    public ExecutorService d() {
        return this.f3944l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f3947o;
    }

    public void g() {
        synchronized (this.f3946n) {
            try {
                this.f3947o = true;
                for (e eVar : this.f3945m) {
                    if (this.f3949q) {
                        c cVar = (c) eVar;
                        a(cVar.f3964d, cVar.f3965e, cVar.f3957f);
                    } else {
                        a(eVar.f3964d, eVar.f3965e);
                    }
                }
                this.f3945m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h() {
        synchronized (this.f3946n) {
            this.f3947o = false;
        }
    }

    public ExecutorService a() {
        return this.f3943k;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j) {
        if (this.f3948p) {
            return a(new e(this.f3935a, i5Var, bVar)).schedule(i5Var, j, TimeUnit.MILLISECONDS);
        }
        return this.f3937c.schedule(i5Var, j, TimeUnit.MILLISECONDS);
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public void a(i5 i5Var, b bVar, long j) {
        a(i5Var, bVar, j, false);
    }

    public void a(i5 i5Var, b bVar, long j, boolean z3) {
        i5 i5Var2;
        long j8;
        e eVar;
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            if (this.f3949q) {
                i5Var2 = i5Var;
                j8 = j;
                eVar = new c(this.f3935a, i5Var2, bVar, j8);
            } else {
                i5Var2 = i5Var;
                j8 = j;
                eVar = new e(this.f3935a, i5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j8, z3);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3936b.d(i5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(a0.g.j(j, "Invalid delay (millis) specified: "));
    }

    public ExecutorService b() {
        return this.f3948p ? this.g : f3934r;
    }

    private boolean b(e eVar) {
        if (eVar.f3964d.d()) {
            return false;
        }
        synchronized (this.f3946n) {
            try {
                if (this.f3947o) {
                    return false;
                }
                this.f3945m.add(eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ScheduledThreadPoolExecutor b(String str, int i4) {
        return new ScheduledThreadPoolExecutor(i4, new d(str));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f3948p) {
            com.applovin.impl.sdk.k kVar = this.f3935a;
            e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f3937c.submit(runnable);
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.y8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f6260a.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.f3935a, str, runnable));
    }

    public void a(i5 i5Var) {
        if (i5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f3948p ? this.f3939e : this.f3938d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f3935a, i5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = i5Var.b(Thread.currentThread(), ((Long) this.f3935a.a(x4.f6153v)).longValue());
                i5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3936b.a(i5Var.c(), "Task failed execution", th2);
                }
                i5Var.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(i5 i5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f3935a, i5Var, b.MEDIATION));
    }

    private void a(e eVar, long j, boolean z3) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f3948p ? a(eVar) : this.f3938d;
        if (j <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z3) {
            g0.a(j, this.f3935a, new w8(1, scheduledThreadPoolExecutorA, eVar));
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i4 = a.f3950a[eVar.f3965e.ordinal()];
        if (i4 == 1) {
            return this.f3939e;
        }
        if (i4 == 2) {
            return this.g;
        }
        if (i4 == 3) {
            return this.f3941h;
        }
        if (i4 != 4) {
            return this.f3942i;
        }
        return this.f3940f;
    }

    public ExecutorService a(String str, int i4) {
        return Executors.newFixedThreadPool(i4, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3936b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f3936b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
