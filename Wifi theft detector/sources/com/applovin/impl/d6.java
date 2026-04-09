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

/* loaded from: classes.dex */
public class d6 {

    /* renamed from: r, reason: collision with root package name */
    private static final ExecutorService f5780r = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5781a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5782b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5783c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5784d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5785e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5786f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5787g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5788h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5789i;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f5791k;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f5792l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5795o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5796p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f5797q;

    /* renamed from: j, reason: collision with root package name */
    private final Map f5790j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final List f5793m = new ArrayList(5);

    /* renamed from: n, reason: collision with root package name */
    private final Object f5794n = new Object();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5798a;

        static {
            int[] iArr = new int[b.values().length];
            f5798a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5798a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5798a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5798a[b.TIMEOUT.ordinal()] = 4;
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

    public static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private final long f5805f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j10) {
            super(kVar, i5Var, bVar);
            this.f5805f = j10;
        }
    }

    public class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f5806a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.o unused = d6.this.f5782b;
                if (com.applovin.impl.sdk.o.a()) {
                    d6.this.f5782b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public d(String str) {
            this.f5806a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f5806a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f5781a.a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f5809a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5810b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f5811c;

        /* renamed from: d, reason: collision with root package name */
        protected final i5 f5812d;

        /* renamed from: e, reason: collision with root package name */
        protected final b f5813e;

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.f5809a = kVar;
            this.f5811c = kVar.O();
            this.f5810b = i5Var.c();
            this.f5812d = i5Var;
            this.f5813e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f5809a.E0() || this.f5812d.d()) {
                    ScheduledFuture scheduledFutureB = this.f5812d.b(Thread.currentThread(), ((Long) this.f5809a.a(x4.f8594v)).longValue());
                    this.f5812d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5811c.d(this.f5810b, "Task re-scheduled...");
                    }
                    this.f5809a.q0().a(this.f5812d, this.f5813e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5811c.a(this.f5810b, "Task failed execution", th);
                    }
                    this.f5812d.a(th);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5811c.d(this.f5810b, this.f5813e + " queue finished task " + this.f5812d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5811c.d(this.f5810b, this.f5813e + " queue finished task " + this.f5812d.c());
                    }
                }
            }
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.f5781a = kVar;
        this.f5782b = kVar.O();
        this.f5796p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.f5797q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.f5783c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.f5784d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.f5785e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.f5787g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.f5788h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f5786f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.f5789i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.f5791k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f5792l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.f5796p ? this.f5785e : this.f5784d;
    }

    public ExecutorService d() {
        return this.f5792l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f5795o;
    }

    public void g() {
        synchronized (this.f5794n) {
            try {
                this.f5795o = true;
                for (e eVar : this.f5793m) {
                    if (this.f5797q) {
                        c cVar = (c) eVar;
                        a(cVar.f5812d, cVar.f5813e, cVar.f5805f);
                    } else {
                        a(eVar.f5812d, eVar.f5813e);
                    }
                }
                this.f5793m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f5794n) {
            this.f5795o = false;
        }
    }

    public ExecutorService a() {
        return this.f5791k;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j10) {
        if (this.f5796p) {
            return a(new e(this.f5781a, i5Var, bVar)).schedule(i5Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f5783c.schedule(i5Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public void a(i5 i5Var, b bVar, long j10) {
        a(i5Var, bVar, j10, false);
    }

    public void a(i5 i5Var, b bVar, long j10, boolean z10) {
        i5 i5Var2;
        long j11;
        e eVar;
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f5797q) {
                i5Var2 = i5Var;
                j11 = j10;
                eVar = new c(this.f5781a, i5Var2, bVar, j11);
            } else {
                i5Var2 = i5Var;
                j11 = j10;
                eVar = new e(this.f5781a, i5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j11, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5782b.d(i5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
    }

    public ExecutorService b() {
        return this.f5796p ? this.f5787g : f5780r;
    }

    private boolean b(e eVar) {
        if (eVar.f5812d.d()) {
            return false;
        }
        synchronized (this.f5794n) {
            try {
                if (this.f5795o) {
                    return false;
                }
                this.f5793m.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f5796p) {
            com.applovin.impl.sdk.k kVar = this.f5781a;
            e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f5783c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.q9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f7395a.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.f5781a, str, runnable));
    }

    public void a(i5 i5Var) {
        if (i5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f5796p ? this.f5785e : this.f5784d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f5781a, i5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = i5Var.b(Thread.currentThread(), ((Long) this.f5781a.a(x4.f8594v)).longValue());
                i5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5782b.a(i5Var.c(), "Task failed execution", th);
                }
                i5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(i5 i5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f5790j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f5790j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f5781a, i5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f5796p ? a(eVar) : this.f5784d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            g0.a(j10, this.f5781a, new Runnable() { // from class: com.applovin.impl.p9
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f5798a[eVar.f5813e.ordinal()];
        if (i10 == 1) {
            return this.f5785e;
        }
        if (i10 == 2) {
            return this.f5787g;
        }
        if (i10 == 3) {
            return this.f5788h;
        }
        if (i10 != 4) {
            return this.f5789i;
        }
        return this.f5786f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5782b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f5782b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
