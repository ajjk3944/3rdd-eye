package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zc {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f36404d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final af f36405a;

    /* renamed from: b, reason: collision with root package name */
    private final at0 f36406b;

    /* renamed from: c, reason: collision with root package name */
    private final ew1 f36407c;

    public /* synthetic */ zc() {
        this(new af(), new at0(), ew1.a.a());
    }

    public final void a(Context context) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f36407c.a(context);
        boolean z10 = du1VarA != null && du1VarA.m();
        this.f36406b.getClass();
        if (at0.d(context) && !z10 && f36404d.compareAndSet(false, true)) {
            dd configuration = this.f36405a.a(context);
            yc.f35705a.getClass();
            kotlin.jvm.internal.l.f(configuration, "configuration");
            try {
                AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfigBuild = AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(configuration.a()).build();
                kotlin.jvm.internal.l.e(appMetricaLibraryAdapterConfigBuild, "build(...)");
                AppMetricaLibraryAdapter.activate(context, appMetricaLibraryAdapterConfigBuild);
                objA = C1992A.f18074a;
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (b9.m.a(objA) != null) {
                fp0.b(new Object[0]);
            }
        }
    }

    public zc(af appMetricaPolicyConfigurator, at0 manifestAnalyzer, ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        kotlin.jvm.internal.l.f(manifestAnalyzer, "manifestAnalyzer");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f36405a = appMetricaPolicyConfigurator;
        this.f36406b = manifestAnalyzer;
        this.f36407c = sdkSettings;
    }
}
