package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6063a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f6064b;

    /* renamed from: c, reason: collision with root package name */
    private long f6065c;

    /* renamed from: d, reason: collision with root package name */
    private long f6066d;

    /* renamed from: e, reason: collision with root package name */
    private long f6067e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6068f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f6069g;

    /* renamed from: h, reason: collision with root package name */
    private long f6070h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f6071i = new Object();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.f6069g.run();
                synchronized (g7.this.f6071i) {
                    try {
                        if (g7.this.f6068f) {
                            g7.this.f6065c = System.currentTimeMillis();
                            g7 g7Var = g7.this;
                            g7Var.f6066d = g7Var.f6067e;
                        } else {
                            g7.this.f6064b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (g7.this.f6063a != null) {
                        g7.this.f6063a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.f6063a.O().a("Timer", "Encountered error while executing timed task", th);
                        }
                        g7.this.f6063a.D().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (g7.this.f6071i) {
                        try {
                            if (g7.this.f6068f) {
                                g7.this.f6065c = System.currentTimeMillis();
                                g7 g7Var2 = g7.this;
                                g7Var2.f6066d = g7Var2.f6067e;
                            } else {
                                g7.this.f6064b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (g7.this.f6071i) {
                        try {
                            if (g7.this.f6068f) {
                                g7.this.f6065c = System.currentTimeMillis();
                                g7 g7Var3 = g7.this;
                                g7Var3.f6066d = g7Var3.f6067e;
                            } else {
                                g7.this.f6064b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f6063a = kVar;
        this.f6069g = runnable;
    }

    public long c() {
        if (this.f6064b == null) {
            return this.f6066d - this.f6070h;
        }
        return this.f6066d - (System.currentTimeMillis() - this.f6065c);
    }

    public void d() {
        synchronized (this.f6071i) {
            Timer timer = this.f6064b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f6070h = Math.max(1L, System.currentTimeMillis() - this.f6065c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f6063a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6063a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6063a.O().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f6064b = null;
                    } finally {
                        this.f6064b = null;
                    }
                }
            }
        }
    }

    public void e() {
        g7 g7Var;
        synchronized (this.f6071i) {
            try {
                try {
                    long j10 = this.f6070h;
                    if (j10 > 0) {
                        try {
                            long j11 = this.f6066d - j10;
                            this.f6066d = j11;
                            if (j11 < 0) {
                                this.f6066d = 0L;
                            }
                            this.f6064b = new Timer();
                            g7Var = this;
                            try {
                                g7Var.a(b(), this.f6066d, this.f6068f, this.f6067e);
                                g7Var.f6065c = System.currentTimeMillis();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    com.applovin.impl.sdk.k kVar = g7Var.f6063a;
                                    if (kVar != null) {
                                        kVar.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            g7Var.f6063a.O();
                                            if (com.applovin.impl.sdk.o.a()) {
                                                g7Var.f6063a.O().a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    g7Var.f6070h = 0L;
                                } finally {
                                    g7Var.f6070h = 0L;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            g7Var = this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g7 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(kVar, runnable);
            g7Var.f6065c = System.currentTimeMillis();
            g7Var.f6066d = j10;
            g7Var.f6068f = z10;
            g7Var.f6067e = j10;
            try {
                g7Var.f6064b = new Timer();
                g7Var.a(g7Var.b(), j10, z10, g7Var.f6067e);
                return g7Var;
            } catch (OutOfMemoryError e10) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e10);
                }
                return g7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f6071i) {
            Timer timer = this.f6064b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f6064b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f6063a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6063a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6063a.O().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f6064b = null;
                    } catch (Throwable th2) {
                        this.f6064b = null;
                        this.f6070h = 0L;
                        throw th2;
                    }
                }
                this.f6070h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f6064b.schedule(timerTask, j10, j11);
        } else {
            this.f6064b.schedule(timerTask, j10);
        }
    }
}
