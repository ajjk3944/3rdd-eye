package io.sentry;

import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements q1, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final io.sentry.util.a f11447x = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f11448a;

    /* renamed from: d, reason: collision with root package name */
    public v3 f11449d;

    /* renamed from: g, reason: collision with root package name */
    public x5 f11450g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11451r = false;

    public final void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            x5 x5Var = this.f11450g;
            if (x5Var != null) {
                x5Var.getLogger().m(b5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            x5 x5Var2 = this.f11450g;
            if (x5Var2 != null) {
                x5Var2.getLogger().m(b5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f11448a;
            if (this != uncaughtExceptionHandler2) {
                b(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f11448a = this.f11448a;
            x5 x5Var3 = this.f11450g;
            if (x5Var3 != null) {
                x5Var3.getLogger().m(b5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVarA = f11447x.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.f11448a);
                x5 x5Var = this.f11450g;
                if (x5Var != null) {
                    x5Var.getLogger().m(b5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                b(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        io.sentry.protocol.t tVar;
        x5 x5Var = this.f11450g;
        if (x5Var == null || this.f11449d == null) {
            return;
        }
        x5Var.getLogger().m(b5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            u6 u6Var = new u6(this.f11450g.getFlushTimeoutMillis(), this.f11450g.getLogger());
            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
            kVar.f12583r = Boolean.FALSE;
            kVar.f12580a = "UncaughtExceptionHandler";
            t4 t4Var = new t4(new io.sentry.exception.a(kVar, th2, thread, false));
            t4Var.Q = b5.FATAL;
            if (this.f11449d.l() == null && (tVar = t4Var.f12268a) != null) {
                u6Var.g(tVar);
            }
            h0 h0VarJ = dr.a.j(u6Var);
            boolean zEquals = this.f11449d.y(t4Var, h0VarJ).equals(io.sentry.protocol.t.f12636d);
            io.sentry.hints.e eVar = (io.sentry.hints.e) h0VarJ.b(io.sentry.hints.e.class, "sentry:eventDropReason");
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !u6Var.d()) {
                this.f11450g.getLogger().m(b5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", t4Var.f12268a);
            }
        } catch (Throwable th3) {
            this.f11450g.getLogger().g(b5.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f11448a != null) {
            this.f11450g.getLogger().m(b5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f11448a.uncaughtException(thread, th2);
        } else if (this.f11450g.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        v3 v3Var;
        v3 v3Var2 = v3.f12830a;
        if (this.f11451r) {
            x5Var.getLogger().m(b5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f11451r = true;
        this.f11449d = v3Var2;
        this.f11450g = x5Var;
        u0 logger = x5Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f11450g.isEnableUncaughtExceptionHandler()));
        if (this.f11450g.isEnableUncaughtExceptionHandler()) {
            q qVarA = f11447x.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f11450g.getLogger().m(b5Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (v3Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f11449d) == null) {
                        this.f11448a = defaultUncaughtExceptionHandler;
                    } else {
                        c1 c1Var = c4.f12106a;
                        v3Var.getClass();
                        this.f11448a = uncaughtExceptionHandlerIntegration.f11448a;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                qVarA.close();
                this.f11450g.getLogger().m(b5Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                ic.a.b("UncaughtExceptionHandler");
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
