package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements q1, Closeable, a0 {
    public a1 H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11519a;

    /* renamed from: d, reason: collision with root package name */
    public volatile ai.c f11520d;

    /* renamed from: g, reason: collision with root package name */
    public SentryAndroidOptions f11521g;

    /* renamed from: r, reason: collision with root package name */
    public v3 f11522r;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f11523x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f11524y = false;
    public volatile boolean B = false;
    public volatile IntentFilter D = null;
    public volatile HandlerThread E = null;
    public final AtomicBoolean F = new AtomicBoolean(false);
    public final io.sentry.util.a G = new io.sentry.util.a();

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.f11519a = applicationContext == null ? context : applicationContext;
        this.f11523x = strArr;
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        if (this.f11522r == null || this.f11521g == null) {
            return;
        }
        this.B = false;
        h(this.f11522r, this.f11521g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.q qVarA = this.G.a();
        try {
            this.f11524y = true;
            this.D = null;
            if (this.E != null) {
                this.E.quit();
            }
            this.E = null;
            qVarA.close();
            d0.f11554x.i(this);
            SentryAndroidOptions sentryAndroidOptions = this.f11521g;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new androidx.lifecycle.f0(22, this));
                } catch (RejectedExecutionException unused) {
                    i();
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f11521g;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().m(b5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
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

    @Override // io.sentry.android.core.a0
    public final void f() {
        SentryAndroidOptions sentryAndroidOptions = this.f11521g;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new androidx.lifecycle.f0(22, this));
        } catch (RejectedExecutionException unused) {
            i();
        }
    }

    public final void h(v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f11524y && !this.B && this.f11520d == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new t0(this, v3Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().m(b5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void i() {
        io.sentry.q qVarA = this.G.a();
        try {
            this.B = true;
            ai.c cVar = this.f11520d;
            this.f11520d = null;
            qVarA.close();
            if (cVar != null) {
                this.f11519a.unregisterReceiver(cVar);
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
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11521g = sentryAndroidOptions;
        this.f11522r = v3.f12830a;
        sentryAndroidOptions.getLogger().m(b5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f11521g.isEnableSystemEventBreadcrumbs()));
        if (this.f11521g.isEnableSystemEventBreadcrumbs()) {
            d0.f11554x.b(this);
            if (e0.i()) {
                h(this.f11522r, this.f11521g);
            }
        }
    }
}
