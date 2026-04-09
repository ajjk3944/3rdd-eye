package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class t6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21465a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f21466b;

    /* renamed from: c, reason: collision with root package name */
    private long f21467c;

    /* renamed from: d, reason: collision with root package name */
    private long f21468d;

    /* renamed from: e, reason: collision with root package name */
    private long f21469e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21470f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f21471g;

    /* renamed from: h, reason: collision with root package name */
    private long f21472h;
    private final Object i = new Object();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                t6.this.f21471g.run();
                synchronized (t6.this.i) {
                    try {
                        if (t6.this.f21470f) {
                            t6.this.f21467c = System.currentTimeMillis();
                            t6 t6Var = t6.this;
                            t6Var.f21468d = t6Var.f21469e;
                        } else {
                            t6.this.f21466b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (t6.this.f21465a != null) {
                        t6.this.f21465a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            t6.this.f21465a.O().a("Timer", "Encountered error while executing timed task", th);
                        }
                        t6.this.f21465a.E().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (t6.this.i) {
                        try {
                            if (t6.this.f21470f) {
                                t6.this.f21467c = System.currentTimeMillis();
                                t6 t6Var2 = t6.this;
                                t6Var2.f21468d = t6Var2.f21469e;
                            } else {
                                t6.this.f21466b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (t6.this.i) {
                        try {
                            if (t6.this.f21470f) {
                                t6.this.f21467c = System.currentTimeMillis();
                                t6 t6Var3 = t6.this;
                                t6Var3.f21468d = t6Var3.f21469e;
                            } else {
                                t6.this.f21466b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private t6(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f21465a = kVar;
        this.f21471g = runnable;
    }

    public long c() {
        if (this.f21466b == null) {
            return this.f21468d - this.f21472h;
        }
        return this.f21468d - (System.currentTimeMillis() - this.f21467c);
    }

    public void d() {
        synchronized (this.i) {
            Timer timer = this.f21466b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21472h = Math.max(1L, System.currentTimeMillis() - this.f21467c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f21465a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21465a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21465a.O().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f21466b = null;
                    } finally {
                        this.f21466b = null;
                    }
                }
            }
        }
    }

    public void e() {
        t6 t6Var;
        synchronized (this.i) {
            try {
                try {
                    long j4 = this.f21472h;
                    if (j4 > 0) {
                        try {
                            long j10 = this.f21468d - j4;
                            this.f21468d = j10;
                            if (j10 < 0) {
                                this.f21468d = 0L;
                            }
                            this.f21466b = new Timer();
                            t6Var = this;
                            try {
                                t6Var.a(b(), this.f21468d, this.f21470f, this.f21469e);
                                t6Var.f21467c = System.currentTimeMillis();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    com.applovin.impl.sdk.k kVar = t6Var.f21465a;
                                    if (kVar != null) {
                                        kVar.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            t6Var.f21465a.O();
                                            if (com.applovin.impl.sdk.o.a()) {
                                                t6Var.f21465a.O().a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    t6Var.f21472h = 0L;
                                } finally {
                                    t6Var.f21472h = 0L;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            t6Var = this;
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

    public static t6 a(long j4, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j4, false, kVar, runnable);
    }

    public static t6 a(long j4, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j4 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j4 + ".");
        }
        if (runnable != null) {
            t6 t6Var = new t6(kVar, runnable);
            t6Var.f21467c = System.currentTimeMillis();
            t6Var.f21468d = j4;
            t6Var.f21470f = z10;
            t6Var.f21469e = j4;
            try {
                t6Var.f21466b = new Timer();
                t6Var.a(t6Var.b(), j4, z10, t6Var.f21469e);
                return t6Var;
            } catch (OutOfMemoryError e4) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e4);
                }
                return t6Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.i) {
            Timer timer = this.f21466b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21466b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f21465a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21465a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21465a.O().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f21466b = null;
                    } catch (Throwable th2) {
                        this.f21466b = null;
                        this.f21472h = 0L;
                        throw th2;
                    }
                }
                this.f21472h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j4, boolean z10, long j10) {
        if (z10) {
            this.f21466b.schedule(timerTask, j4, j10);
        } else {
            this.f21466b.schedule(timerTask, j4);
        }
    }
}
