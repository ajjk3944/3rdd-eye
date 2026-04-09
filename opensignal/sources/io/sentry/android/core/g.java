package io.sentry.android.core;

import io.sentry.b1;
import io.sentry.b5;
import io.sentry.c3;
import io.sentry.c4;
import io.sentry.e1;
import io.sentry.f3;
import io.sentry.h5;
import io.sentry.k4;
import io.sentry.n2;
import io.sentry.r6;
import io.sentry.x5;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements io.sentry.q0, io.sentry.transport.o {
    public final io.sentry.android.core.internal.util.q B;
    public b1 F;
    public Future G;
    public io.sentry.l H;
    public io.sentry.protocol.t J;
    public io.sentry.protocol.t K;
    public final AtomicBoolean L;
    public k4 M;
    public volatile boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public final io.sentry.util.a R;
    public final io.sentry.util.a S;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.u0 f11570a;

    /* renamed from: d, reason: collision with root package name */
    public final String f11571d;

    /* renamed from: g, reason: collision with root package name */
    public final int f11572g;

    /* renamed from: r, reason: collision with root package name */
    public final e1 f11573r;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f11574x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11575y = false;
    public q D = null;
    public boolean E = false;
    public final ArrayList I = new ArrayList();

    public g(f0 f0Var, io.sentry.android.core.internal.util.q qVar, io.sentry.u0 u0Var, String str, int i10, e1 e1Var) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        this.J = tVar;
        this.K = tVar;
        this.L = new AtomicBoolean(false);
        this.M = new h5();
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = new io.sentry.util.a();
        this.S = new io.sentry.util.a();
        this.f11570a = u0Var;
        this.B = qVar;
        this.f11574x = f0Var;
        this.f11571d = str;
        this.f11572g = i10;
        this.f11573r = e1Var;
    }

    @Override // io.sentry.q0
    public final void a(boolean z10) {
        io.sentry.q qVarA = this.R.a();
        try {
            this.Q = 0;
            this.O = true;
            if (z10) {
                d(false);
                this.L.set(true);
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

    public final void b() {
        b1 b1Var = this.F;
        if ((b1Var == null || b1Var == n2.f12445b) && c4.c() != n2.f12445b) {
            this.F = c4.c();
            this.H = c4.c().k().getCompositePerformanceCollector();
            io.sentry.transport.p pVarD = this.F.d();
            if (pVarD != null) {
                ((CopyOnWriteArrayList) pVarD.f12779x).add(this);
            }
        }
    }

    public final void c() {
        b();
        this.f11574x.getClass();
        boolean z10 = this.f11575y;
        io.sentry.u0 u0Var = this.f11570a;
        if (!z10) {
            this.f11575y = true;
            String str = this.f11571d;
            if (str == null) {
                u0Var.m(b5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i10 = this.f11572g;
                if (i10 <= 0) {
                    u0Var.m(b5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
                } else {
                    this.D = new q(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i10, this.B, null, this.f11570a);
                }
            }
        }
        if (this.D == null) {
            return;
        }
        b1 b1Var = this.F;
        if (b1Var != null) {
            io.sentry.transport.p pVarD = b1Var.d();
            if (pVarD != null && (pVarD.f(io.sentry.m.All) || pVarD.f(io.sentry.m.ProfileChunkUi))) {
                u0Var.m(b5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                d(false);
                return;
            } else {
                if (this.F.k().getConnectionStatusProvider().N() == io.sentry.n0.DISCONNECTED) {
                    u0Var.m(b5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    d(false);
                    return;
                }
                this.M = this.F.k().getDateProvider().a();
            }
        } else {
            this.M = new h5();
        }
        if (this.D.c() == null) {
            return;
        }
        this.E = true;
        io.sentry.protocol.t tVar = this.J;
        io.sentry.protocol.t tVar2 = io.sentry.protocol.t.f12636d;
        if (tVar.equals(tVar2)) {
            this.J = new io.sentry.protocol.t();
        }
        if (this.K.equals(tVar2)) {
            this.K = new io.sentry.protocol.t();
        }
        io.sentry.l lVar = this.H;
        if (lVar != null) {
            lVar.a(this.K.toString());
        }
        try {
            this.G = this.f11573r.q(new androidx.lifecycle.f0(19, this), 60000L);
        } catch (RejectedExecutionException e4) {
            u0Var.g(b5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e4);
            this.O = true;
        }
    }

    public final void d(boolean z10) {
        b();
        io.sentry.q qVarA = this.R.a();
        try {
            Future future = this.G;
            if (future != null) {
                future.cancel(true);
            }
            if (this.D != null && this.E) {
                this.f11574x.getClass();
                io.sentry.l lVar = this.H;
                d5.y0 y0VarA = this.D.a(lVar != null ? lVar.c(this.K.toString()) : null, false);
                io.sentry.u0 u0Var = this.f11570a;
                if (y0VarA == null) {
                    u0Var.m(b5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.q qVarA2 = this.S.a();
                    try {
                        this.I.add(new c3(this.J, this.K, (Map) y0VarA.f7110y, (File) y0VarA.f7109x, this.M));
                        qVarA2.close();
                    } finally {
                    }
                }
                this.E = false;
                this.K = io.sentry.protocol.t.f12636d;
                b1 b1Var = this.F;
                if (b1Var != null) {
                    x5 x5VarK = b1Var.k();
                    try {
                        x5VarK.getExecutorService().submit(new t0(this, x5VarK, b1Var, 2));
                    } catch (Throwable th2) {
                        x5VarK.getLogger().g(b5.DEBUG, "Failed to send profile chunks.", th2);
                    }
                }
                if (!z10 || this.O) {
                    this.J = io.sentry.protocol.t.f12636d;
                    u0Var.m(b5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    u0Var.m(b5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    c();
                }
                qVarA.close();
                return;
            }
            io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
            this.J = tVar;
            this.K = tVar;
            qVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.q0
    public final void l(f3 f3Var) {
        io.sentry.q qVarA = this.R.a();
        try {
            int i10 = f.f11567a[f3Var.ordinal()];
            if (i10 == 1) {
                int i11 = this.Q - 1;
                this.Q = i11;
                if (i11 > 0) {
                    qVarA.close();
                    return;
                } else {
                    if (i11 < 0) {
                        this.Q = 0;
                    }
                    this.O = true;
                }
            } else if (i10 == 2) {
                this.O = true;
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

    @Override // io.sentry.q0
    public final void n(f3 f3Var, r6 r6Var) {
        io.sentry.q qVarA = this.R.a();
        try {
            if (this.N) {
                double dC = io.sentry.util.i.a().c();
                Double profileSessionSampleRate = r6Var.f12694a.getProfileSessionSampleRate();
                this.P = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
                this.N = false;
            }
            if (!this.P) {
                this.f11570a.m(b5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                qVarA.close();
                return;
            }
            int i10 = f.f11567a[f3Var.ordinal()];
            if (i10 == 1) {
                if (this.Q < 0) {
                    this.Q = 0;
                }
                this.Q++;
            } else if (i10 == 2 && this.E) {
                this.f11570a.m(b5.DEBUG, "Profiler is already running.", new Object[0]);
                qVarA.close();
                return;
            }
            if (!this.E) {
                this.f11570a.m(b5.DEBUG, "Started Profiler.", new Object[0]);
                c();
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

    @Override // io.sentry.transport.o
    public final void q(io.sentry.transport.p pVar) {
        if (pVar.f(io.sentry.m.All) || pVar.f(io.sentry.m.ProfileChunkUi)) {
            this.f11570a.m(b5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            d(false);
        }
    }

    @Override // io.sentry.q0
    public final void r() {
        this.N = true;
    }

    @Override // io.sentry.q0
    public final io.sentry.protocol.t s() {
        return this.J;
    }
}
