package io.sentry.android.core;

import android.content.Context;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11502a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11503d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.a f11504g = new io.sentry.util.a();

    /* renamed from: r, reason: collision with root package name */
    public volatile r0 f11505r;

    public NetworkBreadcrumbsIntegration(Context context, f0 f0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f11502a = applicationContext != null ? applicationContext : context;
        this.f11503d = f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.q qVarA = this.f11504g.a();
        try {
            r0 r0Var = this.f11505r;
            this.f11505r = null;
            qVarA.close();
            if (r0Var != null) {
                io.sentry.q qVarA2 = io.sentry.android.core.internal.util.c.J.a();
                try {
                    io.sentry.android.core.internal.util.c.K.remove(r0Var);
                    qVarA2.close();
                } catch (Throwable th2) {
                    try {
                        qVarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                qVarA.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        io.sentry.u0 logger = x5Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f11503d.getClass();
            io.sentry.q qVarA = this.f11504g.a();
            try {
                this.f11505r = new r0(this.f11503d, x5Var.getDateProvider());
                if (io.sentry.android.core.internal.util.c.h(this.f11502a, x5Var.getLogger(), this.f11503d, this.f11505r)) {
                    x5Var.getLogger().m(b5Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    ic.a.b("NetworkBreadcrumbs");
                } else {
                    x5Var.getLogger().m(b5Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
    }
}
