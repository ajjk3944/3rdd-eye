package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4159a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f4160b;

    /* renamed from: c, reason: collision with root package name */
    private long f4161c;

    /* renamed from: d, reason: collision with root package name */
    private long f4162d;

    /* renamed from: e, reason: collision with root package name */
    private long f4163e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4164f;
    private final Runnable g;

    /* renamed from: h, reason: collision with root package name */
    private long f4165h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f4166i = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.g.run();
                synchronized (g7.this.f4166i) {
                    try {
                        if (g7.this.f4164f) {
                            g7.this.f4161c = System.currentTimeMillis();
                            g7 g7Var = g7.this;
                            g7Var.f4162d = g7Var.f4163e;
                        } else {
                            g7.this.f4160b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (g7.this.f4159a != null) {
                        g7.this.f4159a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.f4159a.O().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        g7.this.f4159a.D().a("Timer", "executingTimedTask", th2);
                    }
                    synchronized (g7.this.f4166i) {
                        try {
                            if (g7.this.f4164f) {
                                g7.this.f4161c = System.currentTimeMillis();
                                g7 g7Var2 = g7.this;
                                g7Var2.f4162d = g7Var2.f4163e;
                            } else {
                                g7.this.f4160b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (g7.this.f4166i) {
                        try {
                            if (g7.this.f4164f) {
                                g7.this.f4161c = System.currentTimeMillis();
                                g7 g7Var3 = g7.this;
                                g7Var3.f4162d = g7Var3.f4163e;
                            } else {
                                g7.this.f4160b = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f4159a = kVar;
        this.g = runnable;
    }

    public long c() {
        if (this.f4160b == null) {
            return this.f4162d - this.f4165h;
        }
        return this.f4162d - (System.currentTimeMillis() - this.f4161c);
    }

    public void d() {
        synchronized (this.f4166i) {
            Timer timer = this.f4160b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f4165h = Math.max(1L, System.currentTimeMillis() - this.f4161c);
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f4159a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f4159a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f4159a.O().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f4160b = null;
                    } finally {
                        this.f4160b = null;
                    }
                }
            }
        }
    }

    public void e() {
        g7 g7Var;
        synchronized (this.f4166i) {
            try {
                try {
                    long j = this.f4165h;
                    if (j > 0) {
                        try {
                            long j8 = this.f4162d - j;
                            this.f4162d = j8;
                            if (j8 < 0) {
                                this.f4162d = 0L;
                            }
                            this.f4160b = new Timer();
                            g7Var = this;
                            try {
                                g7Var.a(b(), this.f4162d, this.f4164f, this.f4163e);
                                g7Var.f4161c = System.currentTimeMillis();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    com.applovin.impl.sdk.k kVar = g7Var.f4159a;
                                    if (kVar != null) {
                                        kVar.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            g7Var.f4159a.O();
                                            if (com.applovin.impl.sdk.o.a()) {
                                                g7Var.f4159a.O().a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    g7Var.f4165h = 0L;
                                } finally {
                                    g7Var.f4165h = 0L;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            g7Var = this;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public static g7 a(long j, boolean z3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(kVar, runnable);
            g7Var.f4161c = System.currentTimeMillis();
            g7Var.f4162d = j;
            g7Var.f4164f = z3;
            g7Var.f4163e = j;
            try {
                g7Var.f4160b = new Timer();
                g7Var.a(g7Var.b(), j, z3, g7Var.f4163e);
                return g7Var;
            } catch (OutOfMemoryError e2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e2);
                }
                return g7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f4166i) {
            Timer timer = this.f4160b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f4160b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f4159a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f4159a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f4159a.O().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f4160b = null;
                    } catch (Throwable th3) {
                        this.f4160b = null;
                        this.f4165h = 0L;
                        throw th3;
                    }
                }
                this.f4165h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j, boolean z3, long j8) {
        if (z3) {
            this.f4160b.schedule(timerTask, j, j8);
        } else {
            this.f4160b.schedule(timerTask, j);
        }
    }
}
