package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.q1;
import io.sentry.x5;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class NdkIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11500a;

    /* renamed from: d, reason: collision with root package name */
    public SentryAndroidOptions f11501d;

    public NdkIntegration(Class cls) {
        this.f11500a = cls;
    }

    public static void b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f11501d;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f11500a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f11501d.getLogger().m(b5.DEBUG, "NdkIntegration removed.", new Object[0]);
                        b(this.f11501d);
                    } catch (Throwable th2) {
                        this.f11501d.getLogger().g(b5.ERROR, "Failed to close SentryNdk.", th2);
                        b(this.f11501d);
                    }
                } catch (NoSuchMethodException e4) {
                    this.f11501d.getLogger().g(b5.ERROR, "Failed to invoke the SentryNdk.close method.", e4);
                    b(this.f11501d);
                }
            }
        } catch (Throwable th3) {
            b(this.f11501d);
            throw th3;
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11501d = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.u0 logger = this.f11501d.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.m(b5Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f11500a) == null) {
            b(this.f11501d);
            return;
        }
        if (this.f11501d.getCacheDirPath() == null) {
            this.f11501d.getLogger().m(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.f11501d);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f11501d);
            this.f11501d.getLogger().m(b5Var, "NdkIntegration installed.", new Object[0]);
            ic.a.b("Ndk");
        } catch (NoSuchMethodException e4) {
            b(this.f11501d);
            this.f11501d.getLogger().g(b5.ERROR, "Failed to invoke the SentryNdk.init method.", e4);
        } catch (Throwable th2) {
            b(this.f11501d);
            this.f11501d.getLogger().g(b5.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
