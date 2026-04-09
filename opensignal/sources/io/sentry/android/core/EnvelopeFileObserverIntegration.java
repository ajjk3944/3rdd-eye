package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import io.sentry.z2;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public l0 f11496a;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.u0 f11497d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11498g = false;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.a f11499r = new io.sentry.util.a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i10) {
            this();
        }
    }

    public final void b(x5 x5Var, String str) {
        l0 l0Var = new l0(str, new z2(v3.f12830a, x5Var.getEnvelopeReader(), x5Var.getSerializer(), x5Var.getLogger(), x5Var.getFlushTimeoutMillis(), x5Var.getMaxQueueSize()), x5Var.getLogger(), x5Var.getFlushTimeoutMillis());
        this.f11496a = l0Var;
        try {
            l0Var.startWatching();
            x5Var.getLogger().m(b5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            ic.a.b("EnvelopeFileObserver");
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.q qVarA = this.f11499r.a();
        try {
            this.f11498g = true;
            qVarA.close();
            l0 l0Var = this.f11496a;
            if (l0Var != null) {
                l0Var.stopWatching();
                io.sentry.u0 u0Var = this.f11497d;
                if (u0Var != null) {
                    u0Var.m(b5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        this.f11497d = x5Var.getLogger();
        String outboxPath = x5Var.getOutboxPath();
        if (outboxPath == null) {
            this.f11497d.m(b5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f11497d.m(b5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            x5Var.getExecutorService().submit(new t0(this, x5Var, outboxPath, 3));
        } catch (Throwable th2) {
            this.f11497d.g(b5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }
}
