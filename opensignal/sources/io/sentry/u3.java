package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class u3 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f12789a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f12790b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f12791c;

    /* renamed from: d, reason: collision with root package name */
    public final l f12792d;

    /* renamed from: e, reason: collision with root package name */
    public final k f12793e;

    /* renamed from: f, reason: collision with root package name */
    public final h7.r1 f12794f;

    public u3(z0 z0Var, z0 z0Var2, z0 z0Var3) {
        this.f12793e = new k(z0Var3, z0Var2, z0Var, 0);
        this.f12789a = z0Var;
        this.f12790b = z0Var2;
        this.f12791c = z0Var3;
        x5 x5VarK = k();
        ir.f0.T(x5VarK, "SentryOptions is required.");
        if (x5VarK.getDsn() == null || x5VarK.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f12792d = x5VarK.getCompositePerformanceCollector();
        this.f12794f = new h7.r1(10, this);
    }

    @Override // io.sentry.b1
    public final void a(boolean z10) {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (q1 q1Var : k().getIntegrations()) {
                if (q1Var instanceof Closeable) {
                    try {
                        ((Closeable) q1Var).close();
                    } catch (Throwable th2) {
                        k().getLogger().m(b5.WARNING, "Failed to close the integration {}.", q1Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            k kVar = this.f12793e;
            if (zIsEnabled) {
                try {
                    kVar.Z(null).clear();
                } catch (Throwable th3) {
                    k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var = t3.ISOLATION;
            if (isEnabled()) {
                try {
                    kVar.Z(t3Var).clear();
                } catch (Throwable th4) {
                    k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            k().getBackpressureMonitor().close();
            k().getTransactionProfiler().close();
            k().getContinuousProfiler().a(true);
            k().getCompositePerformanceCollector().close();
            k().getConnectionStatusProvider().close();
            e1 executorService = k().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new a5.o(this, 18, executorService));
                } catch (RejectedExecutionException e4) {
                    k().getLogger().g(b5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e4);
                    executorService.d(k().getShutdownTimeoutMillis());
                }
            } else {
                executorService.d(k().getShutdownTimeoutMillis());
            }
            t3 t3Var2 = t3.CURRENT;
            if (isEnabled()) {
                try {
                    kVar.Z(t3Var2).y().a(z10);
                } catch (Throwable th5) {
                    k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var3 = t3.ISOLATION;
            if (isEnabled()) {
                try {
                    kVar.Z(t3Var3).y().a(z10);
                } catch (Throwable th6) {
                    k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var4 = t3.GLOBAL;
            if (!isEnabled()) {
                k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                kVar.Z(t3Var4).y().a(z10);
            } catch (Throwable th7) {
                k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            k().getLogger().g(b5.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.b1
    public final void b(String str, String str2) {
        if (isEnabled()) {
            this.f12793e.b(str, str2);
        } else {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.b1
    public final void c(long j) {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f12793e.y().c(j);
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.transport.p d() {
        return this.f12793e.y().d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return this.f12793e.y().e();
    }

    @Override // io.sentry.b1
    public final void f(Throwable th2, j6 j6Var, String str) {
        this.f12793e.f(th2, j6Var, str);
    }

    @Override // io.sentry.b1
    public final void g(e eVar, h0 h0Var) {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (eVar == null) {
            k().getLogger().m(b5.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f12793e.g(eVar, h0Var);
        }
    }

    @Override // io.sentry.b1
    public final i1 h() {
        if (isEnabled()) {
            return this.f12793e.h();
        }
        k().getLogger().m(b5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return this.f12793e.y().isEnabled();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t j(i4.b bVar, h0 h0Var) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            io.sentry.protocol.t tVarJ = this.f12793e.y().j(bVar, h0Var);
            return tVarJ != null ? tVarJ : tVar;
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error while capturing envelope.", th2);
            return tVar;
        }
    }

    @Override // io.sentry.b1
    public final x5 k() {
        return ((z0) this.f12793e.f12397d).k();
    }

    @Override // io.sentry.b1
    public final k1 l() {
        if (isEnabled()) {
            return this.f12793e.l();
        }
        k().getLogger().m(b5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.b1
    public final void m(e eVar) {
        g(eVar, new h0());
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t n(d3 d3Var) {
        ir.f0.T(d3Var, "profilingContinuousData is required");
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            return this.f12793e.y().n(d3Var);
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error while capturing profile chunk with id: " + d3Var.f12181g, th2);
            return tVar;
        }
    }

    @Override // io.sentry.b1
    public final void o() {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        k kVar = this.f12793e;
        i6 i6VarO = kVar.o();
        if (i6VarO != null) {
            kVar.y().b(i6VarO, dr.a.j(new et.d()));
        }
    }

    @Override // io.sentry.b1
    public final void p() {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        k kVar = this.f12793e;
        t tVarP = kVar.p();
        if (tVarP == null) {
            k().getLogger().m(b5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        i6 i6Var = (i6) tVarP.f12736a;
        if (i6Var != null) {
            kVar.y().b(i6Var, dr.a.j(new et.d()));
        }
        kVar.y().b((i6) tVarP.f12737d, dr.a.j(new io.sentry.hints.i(0)));
    }

    @Override // io.sentry.b1
    public final k1 q(s6 s6Var, t6 t6Var) {
        Double dValueOf;
        s6Var.E = (String) t6Var.f7150d;
        boolean zIsEnabled = isEnabled();
        k1 k1VarA = v2.f12829a;
        if (!zIsEnabled) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.j.a(s6Var.E, k().getIgnoredSpanOrigins())) {
            k().getLogger().m(b5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", s6Var.E);
        } else if (!k().getInstrumenter().equals(s6Var.H)) {
            k().getLogger().m(b5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", s6Var.H, k().getInstrumenter());
        } else if (k().isTracingEnabled()) {
            c cVar = s6Var.I;
            if (cVar == null || (dValueOf = cVar.f12095d) == null) {
                Double d6 = ((c) this.f12793e.v().f12399r).f12095d;
                dValueOf = Double.valueOf(d6 == null ? 0.0d : d6.doubleValue());
            }
            cj.a aVarA = k().getInternalTracesSampler().a(new i4.b(s6Var, dValueOf));
            Boolean bool = (Boolean) aVarA.f3974d;
            s6Var.a(aVarA);
            j1 spanFactory = k().getSpanFactory();
            if (bool.booleanValue() && k().isContinuousProfilingEnabled()) {
                f3 profileLifecycle = k().getProfileLifecycle();
                f3 f3Var = f3.TRACE;
                if (profileLifecycle == f3Var && s6Var.J.equals(io.sentry.protocol.t.f12636d)) {
                    k().getContinuousProfiler().n(f3Var, k().getInternalTracesSampler());
                }
            }
            k1VarA = spanFactory.a(s6Var, this, t6Var, this.f12792d);
            if (bool.booleanValue() && ((Boolean) aVarA.f3977x).booleanValue()) {
                l1 transactionProfiler = k().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.j(k1VarA);
                } else if (t6Var.f12741e) {
                    transactionProfiler.j(k1VarA);
                }
            }
        } else {
            k().getLogger().m(b5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (q3.ON == ((q3) t6Var.f7147a)) {
            k1VarA.m();
        }
        return k1VarA;
    }

    @Override // io.sentry.b1
    public final void r(r3 r3Var) {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            r3Var.i(this.f12793e.Z(null));
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a s() {
        return this.f12794f;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t t(z5 z5Var, h0 h0Var) {
        z0 z0Var = this.f12793e;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            return z0Var.y().f(z5Var, z0Var, h0Var);
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error while capturing replay", th2);
            return tVar;
        }
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t u(Throwable th2, h0 h0Var) {
        io.sentry.protocol.t tVarO = io.sentry.protocol.t.f12636d;
        boolean zIsEnabled = isEnabled();
        z0 z0Var = this.f12793e;
        if (zIsEnabled) {
            try {
                t4 t4Var = new t4(th2);
                z0Var.C(t4Var);
                tVarO = z0Var.y().o(t4Var, z0Var, h0Var);
            } catch (Throwable th3) {
                k().getLogger().g(b5.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        } else {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        }
        z0Var.H(tVarO);
        return tVarO;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t v(String str, b5 b5Var) {
        io.sentry.protocol.t tVarO = io.sentry.protocol.t.f12636d;
        boolean zIsEnabled = isEnabled();
        z0 z0Var = this.f12793e;
        if (!zIsEnabled) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            k().getLogger().m(b5.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                d1 d1VarY = z0Var.y();
                d1VarY.getClass();
                t4 t4Var = new t4();
                io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                lVar.f12586a = str;
                t4Var.M = lVar;
                t4Var.Q = b5Var;
                tVarO = d1VarY.o(t4Var, z0Var, null);
            } catch (Throwable th2) {
                k().getLogger().g(b5.ERROR, "Error while capturing message: ".concat(str), th2);
            }
        }
        z0Var.H(tVarO);
        return tVarO;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t w(io.sentry.protocol.a0 a0Var, q6 q6Var, h0 h0Var, g3 g3Var) {
        io.sentry.protocol.a0 a0Var2;
        z0 z0Var = this.f12793e;
        ArrayList arrayList = a0Var.O;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (a0Var.N == null) {
            k().getLogger().m(b5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", a0Var.f12268a);
            return tVar;
        }
        Boolean bool = Boolean.TRUE;
        k6 k6VarH = a0Var.f12269d.h();
        cj.a aVar = k6VarH == null ? null : k6VarH.f12415r;
        if (!bool.equals(Boolean.valueOf(aVar != null ? ((Boolean) aVar.f3974d).booleanValue() : false))) {
            k().getLogger().m(b5.DEBUG, "Transaction %s was dropped due to sampling decision.", a0Var.f12268a);
            if (k().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.f clientReportRecorder = k().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.l(dVar, m.Transaction);
                k().getClientReportRecorder().p(dVar, m.Span, arrayList.size() + 1);
                return tVar;
            }
            io.sentry.clientreport.f clientReportRecorder2 = k().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.l(dVar2, m.Transaction);
            k().getClientReportRecorder().p(dVar2, m.Span, arrayList.size() + 1);
            return tVar;
        }
        try {
            a0Var2 = a0Var;
            try {
                return z0Var.y().l(a0Var2, q6Var, z0Var, h0Var, g3Var);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                k().getLogger().g(b5.ERROR, "Error while capturing transaction with id: " + a0Var2.f12268a, th3);
                return tVar;
            }
        } catch (Throwable th4) {
            th = th4;
            a0Var2 = a0Var;
        }
    }

    @Override // io.sentry.b1
    public final b1 x(String str) {
        return new u3(this.f12789a.clone(), this.f12790b.clone(), this.f12791c);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t y(t4 t4Var, h0 h0Var) {
        z0 z0Var = this.f12793e;
        io.sentry.protocol.t tVarO = io.sentry.protocol.t.f12636d;
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return tVarO;
        }
        try {
            z0Var.C(t4Var);
            tVarO = z0Var.y().o(t4Var, z0Var, h0Var);
            z0Var.H(tVarO);
            return tVarO;
        } catch (Throwable th2) {
            k().getLogger().g(b5.ERROR, "Error while capturing event with id: " + t4Var.f12268a, th2);
            return tVarO;
        }
    }

    @Override // io.sentry.b1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m43clone() {
        if (!isEnabled()) {
            k().getLogger().m(b5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new m0((u3) x("scopes clone"));
    }
}
