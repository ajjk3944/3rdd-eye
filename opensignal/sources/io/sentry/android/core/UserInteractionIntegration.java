package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.b5;
import io.sentry.o6;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class UserInteractionIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11525a;

    /* renamed from: d, reason: collision with root package name */
    public v3 f11526d;

    /* renamed from: g, reason: collision with root package name */
    public SentryAndroidOptions f11527g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11528r = sm.f.K(this.f11527g, "androidx.core.view.GestureDetectorCompat");

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11529x = sm.f.K(this.f11527g, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application, sm.f fVar) {
        this.f11525a = application;
    }

    public final void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f11527g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().m(b5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f11526d == null || this.f11527g == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.g(callback, activity, new io.sentry.android.core.internal.gestures.f(activity, this.f11526d, this.f11527g), this.f11527g));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11525a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f11527g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f11527g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().m(b5.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) callback;
            gVar.f11614g.d(o6.CANCELLED);
            Window.Callback callback2 = gVar.f11613d;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11527g = sentryAndroidOptions;
        this.f11526d = v3.f12830a;
        boolean z10 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f11527g.isEnableUserInteractionTracing();
        io.sentry.u0 logger = this.f11527g.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.f11528r) {
                x5Var.getLogger().m(b5.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f11525a.registerActivityLifecycleCallbacks(this);
            this.f11527g.getLogger().m(b5Var, "UserInteractionIntegration installed.", new Object[0]);
            ic.a.b("UserInteraction");
            if (this.f11529x) {
                WeakReference weakReference = (WeakReference) f0.f11568b.f11569a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof androidx.lifecycle.v) && ((androidx.lifecycle.v) activity).h().e1() == androidx.lifecycle.n.RESUMED) {
                    b(activity);
                }
            }
        }
    }
}
