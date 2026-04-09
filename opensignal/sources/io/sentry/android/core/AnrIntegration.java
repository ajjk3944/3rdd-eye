package io.sentry.android.core;

import android.content.Context;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class AnrIntegration implements q1, Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static a f11477x;

    /* renamed from: y, reason: collision with root package name */
    public static final io.sentry.util.a f11478y = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f11479a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11480d = false;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.a f11481g = new io.sentry.util.a();

    /* renamed from: r, reason: collision with root package name */
    public x5 f11482r;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11479a = applicationContext != null ? applicationContext : context;
    }

    public final void b(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.q qVarA = f11478y.a();
        try {
            if (f11477x == null) {
                io.sentry.u0 logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                logger.m(b5Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new androidx.media3.exoplayer.trackselection.h(this, 20, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f11479a);
                f11477x = aVar;
                aVar.start();
                sentryAndroidOptions.getLogger().m(b5Var, "AnrIntegration installed.", new Object[0]);
            }
            qVarA.close();
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.q qVarA = this.f11481g.a();
        try {
            this.f11480d = true;
            qVarA.close();
            qVarA = f11478y.a();
            try {
                a aVar = f11477x;
                if (aVar != null) {
                    aVar.interrupt();
                    f11477x = null;
                    x5 x5Var = this.f11482r;
                    if (x5Var != null) {
                        x5Var.getLogger().m(b5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                qVarA.close();
            } finally {
                try {
                    qVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        this.f11482r = x5Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) x5Var;
        sentryAndroidOptions.getLogger().m(b5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            ic.a.b("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new a5.o(this, 21, sentryAndroidOptions));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().g(b5.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
