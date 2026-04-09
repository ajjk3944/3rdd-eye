package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements q1, Closeable, ComponentCallbacks2 {

    /* renamed from: x, reason: collision with root package name */
    public static final io.sentry.h0 f11487x = new io.sentry.h0();

    /* renamed from: a, reason: collision with root package name */
    public final Context f11488a;

    /* renamed from: d, reason: collision with root package name */
    public v3 f11489d;

    /* renamed from: g, reason: collision with root package name */
    public SentryAndroidOptions f11490g;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f11491r = new io.sentry.android.core.internal.util.g(0, 60000);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11488a = applicationContext != null ? applicationContext : context;
    }

    public final void b(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f11490g;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f11490g.getLogger().f(b5.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f11488a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f11490g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(b5.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f11490g;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().m(b5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b(new z(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 >= 40 && !this.f11491r.a()) {
            b(new rb.s(this, System.currentTimeMillis(), i10, 2));
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        this.f11489d = v3.f12830a;
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11490g = sentryAndroidOptions;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f11490g.isEnableAppComponentBreadcrumbs()));
        if (this.f11490g.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f11488a.registerComponentCallbacks(this);
                x5Var.getLogger().m(b5Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                ic.a.b("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f11490g.setEnableAppComponentBreadcrumbs(false);
                x5Var.getLogger().f(b5.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}
