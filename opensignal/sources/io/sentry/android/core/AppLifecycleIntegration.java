package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.q1;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class AppLifecycleIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f11492a = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    public volatile o0 f11493d;

    /* renamed from: g, reason: collision with root package name */
    public SentryAndroidOptions f11494g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.q qVarA = this.f11492a.a();
        try {
            o0 o0Var = this.f11493d;
            this.f11493d = null;
            qVarA.close();
            if (o0Var != null) {
                d0.f11554x.i(o0Var);
                SentryAndroidOptions sentryAndroidOptions = this.f11494g;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().m(b5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            d0.f11554x.q();
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
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11494g = sentryAndroidOptions;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f11494g.isEnableAutoSessionTracking()));
        this.f11494g.getLogger().m(b5Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f11494g.isEnableAppLifecycleBreadcrumbs()));
        if (this.f11494g.isEnableAutoSessionTracking() || this.f11494g.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.q qVarA = this.f11492a.a();
            try {
                if (this.f11493d != null) {
                    qVarA.close();
                    return;
                }
                this.f11493d = new o0(this.f11494g.getSessionTrackingIntervalMillis(), this.f11494g.isEnableAutoSessionTracking(), this.f11494g.isEnableAppLifecycleBreadcrumbs());
                d0.f11554x.b(this.f11493d);
                qVarA.close();
                x5Var.getLogger().m(b5Var, "AppLifecycleIntegration installed.", new Object[0]);
                ic.a.b("AppLifecycle");
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
