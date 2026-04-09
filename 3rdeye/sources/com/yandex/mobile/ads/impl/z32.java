package com.yandex.mobile.ads.impl;

import b9.C1992A;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class z32 {

    /* renamed from: h, reason: collision with root package name */
    public static final z32 f36157h = new z32(new c(t82.a(t82.f33486g + " TaskRunner", true)));
    private static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    private final a f36158a;

    /* renamed from: b, reason: collision with root package name */
    private int f36159b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36160c;

    /* renamed from: d, reason: collision with root package name */
    private long f36161d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f36162e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f36163f;

    /* renamed from: g, reason: collision with root package name */
    private final a42 f36164g;

    public interface a {
        long a();

        void a(z32 z32Var);

        void a(z32 z32Var, long j4);

        void execute(Runnable runnable);
    }

    public static final class b {
        public static Logger a() {
            return z32.i;
        }
    }

    static {
        Logger logger = Logger.getLogger(z32.class.getName());
        kotlin.jvm.internal.l.e(logger, "getLogger(...)");
        i = logger;
    }

    public z32(c backend) {
        kotlin.jvm.internal.l.f(backend, "backend");
        this.f36158a = backend;
        this.f36159b = 10000;
        this.f36162e = new ArrayList();
        this.f36163f = new ArrayList();
        this.f36164g = new a42(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(v32 v32Var) {
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(v32Var.b());
        try {
            long jE = v32Var.e();
            synchronized (this) {
                a(v32Var, jE);
                C1992A c1992a = C1992A.f18074a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                a(v32Var, -1L);
                C1992A c1992a2 = C1992A.f18074a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void c() {
        int size = this.f36162e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((y32) this.f36162e.get(size)).b();
            }
        }
        for (int size2 = this.f36163f.size() - 1; -1 < size2; size2--) {
            y32 y32Var = (y32) this.f36163f.get(size2);
            y32Var.b();
            if (y32Var.e().isEmpty()) {
                this.f36163f.remove(size2);
            }
        }
    }

    public final a d() {
        return this.f36158a;
    }

    public final y32 e() {
        int i10;
        synchronized (this) {
            i10 = this.f36159b;
            this.f36159b = i10 + 1;
        }
        return new y32(this, C4356c.h(i10, "Q"));
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f36165a;

        public c(ThreadFactory threadFactory) {
            kotlin.jvm.internal.l.f(threadFactory, "threadFactory");
            this.f36165a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.z32.a
        public final void a(z32 taskRunner) {
            kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.yandex.mobile.ads.impl.z32.a
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.l.f(runnable, "runnable");
            this.f36165a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.z32.a
        public final void a(z32 taskRunner, long j4) throws InterruptedException {
            kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
            long j10 = j4 / 1000000;
            long j11 = j4 - (1000000 * j10);
            if (j10 > 0 || j4 > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // com.yandex.mobile.ads.impl.z32.a
        public final long a() {
            return System.nanoTime();
        }
    }

    public final void a(y32 taskQueue) {
        kotlin.jvm.internal.l.f(taskQueue, "taskQueue");
        if (t82.f33485f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f36163f.remove(taskQueue);
            } else {
                t82.a(this.f36163f, taskQueue);
            }
        }
        if (this.f36160c) {
            this.f36158a.a(this);
        } else {
            this.f36158a.execute(this.f36164g);
        }
    }

    private final void a(v32 v32Var) {
        if (t82.f33485f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        v32Var.a(-1L);
        y32 y32VarD = v32Var.d();
        kotlin.jvm.internal.l.c(y32VarD);
        y32VarD.e().remove(v32Var);
        this.f36163f.remove(y32VarD);
        y32VarD.a(v32Var);
        this.f36162e.add(y32VarD);
    }

    public final v32 b() {
        boolean z10;
        if (t82.f33485f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f36163f.isEmpty()) {
            long jA = this.f36158a.a();
            Iterator it = this.f36163f.iterator();
            long jMin = Long.MAX_VALUE;
            v32 v32Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                v32 v32Var2 = (v32) ((y32) it.next()).e().get(0);
                long jMax = Math.max(0L, v32Var2.c() - jA);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (v32Var != null) {
                        z10 = true;
                        break;
                    }
                    v32Var = v32Var2;
                }
            }
            if (v32Var != null) {
                a(v32Var);
                if (z10 || (!this.f36160c && !this.f36163f.isEmpty())) {
                    this.f36158a.execute(this.f36164g);
                }
                return v32Var;
            }
            if (this.f36160c) {
                if (jMin < this.f36161d - jA) {
                    this.f36158a.a(this);
                }
                return null;
            }
            this.f36160c = true;
            this.f36161d = jA + jMin;
            try {
                try {
                    this.f36158a.a(this, jMin);
                } catch (InterruptedException unused) {
                    c();
                }
            } finally {
                this.f36160c = false;
            }
        }
        return null;
    }

    private final void a(v32 v32Var, long j4) {
        if (t82.f33485f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        y32 y32VarD = v32Var.d();
        kotlin.jvm.internal.l.c(y32VarD);
        if (y32VarD.c() == v32Var) {
            boolean zD = y32VarD.d();
            y32VarD.i();
            y32VarD.a(null);
            this.f36162e.remove(y32VarD);
            if (j4 != -1 && !zD && !y32VarD.g()) {
                y32VarD.a(v32Var, j4, true);
            }
            if (y32VarD.e().isEmpty()) {
                return;
            }
            this.f36163f.add(y32VarD);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
