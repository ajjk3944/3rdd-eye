package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11467a;

    /* renamed from: d, reason: collision with root package name */
    public v3 f11468d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11469g;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.a f11470r = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f11467a = application;
    }

    public final void b(Activity activity, String str) {
        if (this.f11468d == null) {
            return;
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.f12204x = "navigation";
        eVar.b(str, "state");
        eVar.b(activity.getClass().getSimpleName(), "screen");
        eVar.B = "ui.lifecycle";
        eVar.E = b5.INFO;
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.c(activity, "android:activity");
        this.f11468d.g(eVar, h0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11469g) {
            this.f11467a.unregisterActivityLifecycleCallbacks(this);
            v3 v3Var = this.f11468d;
            if (v3Var != null) {
                v3Var.k().getLogger().m(b5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.q qVarA = this.f11470r.a();
        try {
            b(activity, "stopped");
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

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11468d = v3.f12830a;
        this.f11469g = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.u0 logger = x5Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f11469g));
        if (this.f11469g) {
            this.f11467a.registerActivityLifecycleCallbacks(this);
            x5Var.getLogger().m(b5Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            ic.a.b("ActivityBreadcrumbs");
        }
    }
}
