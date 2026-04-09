package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x3;
import io.sentry.x5;
import io.sentry.y3;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements q1, io.sentry.o0, Closeable {
    public x3 B;

    /* renamed from: a, reason: collision with root package name */
    public final y3 f11509a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.e f11510d;

    /* renamed from: r, reason: collision with root package name */
    public io.sentry.p0 f11512r;

    /* renamed from: x, reason: collision with root package name */
    public v3 f11513x;

    /* renamed from: y, reason: collision with root package name */
    public SentryAndroidOptions f11514y;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11511g = new AtomicBoolean(false);
    public final AtomicBoolean D = new AtomicBoolean(false);
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final io.sentry.util.a F = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(y3 y3Var, io.sentry.util.e eVar) {
        this.f11509a = y3Var;
        this.f11510d = eVar;
    }

    public final void b(v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.q qVarA = this.F.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new t0(this, sentryAndroidOptions, v3Var, 0));
                if (((Boolean) this.f11510d.a()).booleanValue() && this.f11511g.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().m(b5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().m(b5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().m(b5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                qVarA.close();
            } finally {
            }
        } catch (RejectedExecutionException e4) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e4);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.set(true);
        io.sentry.p0 p0Var = this.f11512r;
        if (p0Var != null) {
            p0Var.a0(this);
        }
    }

    @Override // io.sentry.o0
    public final void f(io.sentry.n0 n0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        v3 v3Var = this.f11513x;
        if (v3Var == null || (sentryAndroidOptions = this.f11514y) == null || n0Var == io.sentry.n0.DISCONNECTED) {
            return;
        }
        b(v3Var, sentryAndroidOptions);
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        v3 v3Var = v3.f12830a;
        this.f11513x = v3Var;
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11514y = sentryAndroidOptions;
        String cacheDirPath = x5Var.getCacheDirPath();
        io.sentry.u0 logger = x5Var.getLogger();
        this.f11509a.getClass();
        if (!y3.H(logger, cacheDirPath)) {
            x5Var.getLogger().m(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            ic.a.b("SendCachedEnvelope");
            b(v3Var, this.f11514y);
        }
    }
}
