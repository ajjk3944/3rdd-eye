package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.b5;
import io.sentry.q1;
import io.sentry.x5;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class AnrV2Integration implements q1, Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final long f11483r = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a, reason: collision with root package name */
    public final Context f11484a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.transport.d f11485d;

    /* renamed from: g, reason: collision with root package name */
    public SentryAndroidOptions f11486g;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11484a = applicationContext != null ? applicationContext : context;
        this.f11485d = io.sentry.transport.d.f12759a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f11486g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        SentryAndroidOptions sentryAndroidOptions = x5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x5Var : null;
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11486g = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().m(b5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f11486g.isAnrEnabled()));
        if (this.f11486g.getCacheDirPath() == null) {
            this.f11486g.getLogger().m(b5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f11486g.isAnrEnabled()) {
            try {
                x5Var.getExecutorService().submit(new w(this.f11484a, this.f11486g, this.f11485d));
            } catch (Throwable th2) {
                x5Var.getLogger().g(b5.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            x5Var.getLogger().m(b5.DEBUG, "AnrV2Integration installed.", new Object[0]);
            ic.a.b("AnrV2");
        }
    }
}
