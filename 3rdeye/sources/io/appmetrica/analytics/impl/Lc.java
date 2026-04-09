package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Lc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39769a;

    /* renamed from: b, reason: collision with root package name */
    public final Gi f39770b;

    /* renamed from: c, reason: collision with root package name */
    public final Od f39771c;

    /* renamed from: d, reason: collision with root package name */
    public final C4609fa f39772d;

    /* renamed from: e, reason: collision with root package name */
    public final T8 f39773e;

    /* renamed from: f, reason: collision with root package name */
    public final Qh f39774f;

    /* renamed from: g, reason: collision with root package name */
    public final C4730k2 f39775g;

    /* renamed from: h, reason: collision with root package name */
    public final J6 f39776h;
    public final C4857p i;

    /* renamed from: j, reason: collision with root package name */
    public final Ve f39777j;

    /* renamed from: k, reason: collision with root package name */
    public final Ln f39778k;

    /* renamed from: l, reason: collision with root package name */
    public final Pg f39779l;

    /* renamed from: m, reason: collision with root package name */
    public final N6 f39780m;

    /* renamed from: n, reason: collision with root package name */
    public final C4496b0 f39781n;

    public Lc(Context context, Nf nf, Gi gi, Ll ll) {
        this.f39769a = context;
        this.f39770b = gi;
        this.f39771c = new Od(nf);
        C4609fa c4609fa = new C4609fa(context);
        this.f39772d = c4609fa;
        T8 t82 = new T8(new C4853ol(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f39773e = t82;
        this.f39774f = new Qh(nf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), t82);
        this.f39775g = new C4730k2();
        this.f39776h = C5065x4.l().n();
        this.i = new C4857p();
        this.f39777j = new Ve(c4609fa);
        this.f39778k = new Ln();
        this.f39779l = new Pg();
        this.f39780m = new N6();
        this.f39781n = new C4496b0();
    }

    public final C4496b0 a() {
        return this.f39781n;
    }

    public final Context b() {
        return this.f39769a;
    }

    public final N6 c() {
        return this.f39780m;
    }

    public final C4609fa d() {
        return this.f39772d;
    }

    public final Ve e() {
        return this.f39777j;
    }

    public final J6 f() {
        return this.f39776h;
    }

    public final Pg g() {
        return this.f39779l;
    }

    public final Qh h() {
        return this.f39774f;
    }

    public final Gi i() {
        return this.f39770b;
    }

    public final Ln j() {
        return this.f39778k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f39774f.f40684b.applyFromConfig(appMetricaConfig);
        Qh qh = this.f39774f;
        String str = appMetricaConfig.userProfileID;
        synchronized (qh) {
            qh.f40021f = str;
        }
        Qh qh2 = this.f39774f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        qh2.f40019d = new Gf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
