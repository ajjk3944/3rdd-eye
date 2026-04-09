package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final C4986u0 f40447a;

    /* renamed from: b, reason: collision with root package name */
    public final Uk f40448b;

    /* renamed from: c, reason: collision with root package name */
    public final C4810n4 f40449c;

    public Z(C4986u0 c4986u0, Uk uk, C4810n4 c4810n4) {
        this.f40447a = c4986u0;
        this.f40448b = uk;
        this.f40449c = c4810n4;
    }

    public final void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        boolean z10;
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        this.f40447a.getClass();
        synchronized (C4961t0.class) {
            z10 = C4961t0.f41658f;
        }
        if (!z10) {
            mainPublicOrAnonymousLogger.info("Session autotracking enabled", new Object[0]);
            this.f40448b.a();
        }
        this.f40447a.getClass();
        C4961t0 c4961t0A = C4961t0.a(context);
        c4961t0A.f41663d.a(null, c4961t0A);
        IHandlerExecutor iHandlerExecutorA = this.f40449c.a();
        ((S9) iHandlerExecutorA).f40100b.post(new Z.e(this, context, appMetricaLibraryAdapterConfig, 11));
        this.f40447a.getClass();
        C4986u0.a();
    }

    public static final void a(Z z10, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        z10.f40447a.getClass();
        C4961t0 c4961t0A = C4961t0.a(context);
        c4961t0A.f().a(appMetricaLibraryAdapterConfig);
        C5065x4.l().f42014c.a().execute(new RunnableC4936s1(c4961t0A.f41660a));
    }
}
