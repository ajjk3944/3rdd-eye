package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4859p1 {

    /* renamed from: a, reason: collision with root package name */
    public final C4986u0 f41402a;

    /* renamed from: b, reason: collision with root package name */
    public final Ao f41403b;

    /* renamed from: c, reason: collision with root package name */
    public final C5129zi f41404c;

    /* renamed from: d, reason: collision with root package name */
    public final W7 f41405d;

    /* renamed from: e, reason: collision with root package name */
    public final C4594el f41406e;

    /* renamed from: f, reason: collision with root package name */
    public final M2 f41407f;

    /* renamed from: g, reason: collision with root package name */
    public final C4545cn f41408g;

    /* renamed from: h, reason: collision with root package name */
    public final Uk f41409h;

    public C4859p1(C4986u0 c4986u0, M2 m22, C4594el c4594el, Ao ao, C4545cn c4545cn, C5129zi c5129zi, W7 w72, Uk uk) {
        this.f41402a = c4986u0;
        this.f41403b = ao;
        this.f41404c = c5129zi;
        this.f41405d = w72;
        this.f41407f = m22;
        this.f41408g = c4545cn;
        this.f41406e = c4594el;
        this.f41409h = uk;
    }

    public static IHandlerExecutor c() {
        return C5065x4.l().f42014c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        M2 m22 = this.f41407f;
        m22.f39827f.a(context);
        m22.f39823b.a(appMetricaConfig);
        C4545cn c4545cn = this.f41408g;
        Context applicationContext = context.getApplicationContext();
        c4545cn.f40669e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c4545cn.f40668d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c4545cn.f40665a.getClass();
        C4961t0 c4961t0A = C4961t0.a(applicationContext);
        c4961t0A.f41663d.a(appMetricaConfig, c4961t0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new N.d(this, context, appMetricaConfig, 11));
        this.f41402a.getClass();
        synchronized (C4961t0.class) {
            C4961t0.f41658f = true;
        }
    }

    public final String b() {
        this.f41402a.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        if (c4961t0 == null) {
            return null;
        }
        return c4961t0.f().e();
    }

    public final Cc d() {
        this.f41402a.getClass();
        return C4961t0.f41657e.f().i();
    }

    public final void e() {
        d().f39254a.a(this.f41409h.a());
    }

    public final void f() {
        this.f41407f.f39822a.a(null);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new R0(this));
    }

    public final void c(Activity activity) {
        this.f41407f.f39822a.a(null);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4523c1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C4986u0 c4986u0 = this.f41402a;
        Context applicationContext = context.getApplicationContext();
        c4986u0.getClass();
        C4961t0 c4961t0A = C4961t0.a(applicationContext);
        c4961t0A.f().b(this.f41405d.a(appMetricaConfig));
        Context context2 = c4961t0A.f41660a;
        ((S9) C5065x4.l().f42014c.a()).execute(new RunnableC4936s1(context2));
    }

    public final void e(String str) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new P0(this, str));
    }

    public final void d(String str) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39830j.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new K0(this, str));
    }

    public C4859p1() {
        this(C5065x4.l().d(), new Ao());
    }

    public final void c(String str, String str2) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39839s.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4729k1(this, str, str2));
    }

    public C4859p1(C4986u0 c4986u0, Ao ao) {
        this(c4986u0, new M2(c4986u0), new C4594el(c4986u0), ao, new C4545cn(c4986u0, ao), C5129zi.a(), C5065x4.l().j(), C5065x4.l().o());
    }

    public final void d(String str, String str2) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        if (m22.f39835o.a(str).f41158a) {
            this.f41408g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((S9) iHandlerExecutorC).f40100b.post(new Z0(this, str, str2));
        }
    }

    public final void b(String str) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39839s.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4703j1(this, str));
    }

    public final void c(boolean z10) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new M0(this, z10));
    }

    public final void b(Activity activity) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39824c.a(activity);
        this.f41408g.getClass();
        Intent intentA = C4545cn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new H0(this, intentA));
    }

    public final void c(String str) {
        if (this.f41406e.a((Void) null).f41158a && this.f41407f.f39834n.a(str).f41158a) {
            this.f41408g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4471a1(this, str));
        }
    }

    public final void a(Activity activity) {
        this.f41407f.f39822a.a(null);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4678i1(this, activity));
    }

    public final void b(boolean z10) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new O0(this, z10));
    }

    public final void a(Application application) {
        this.f41407f.f39826e.a(application);
        this.f41408g.f40667c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new C.V(this, 27));
    }

    public final void b(String str, String str2) {
        this.f41407f.f39832l.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new X0(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39839s.a(str);
        this.f41408g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4755l1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f41407f.f39822a.a(null);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new com.vungle.ads.internal.util.a(objArr, 6));
    }

    public final void b(Context context) {
        this.f41407f.f39827f.a(context);
        this.f41408g.f40669e.a(context);
        this.f41402a.getClass();
        C4961t0.a(context);
    }

    public final void a(String str, Throwable th) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39840t.a(str);
        this.f41408g.getClass();
        if (th == null) {
            th = new T1();
            th.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4781m1(this, str, th));
    }

    public final void a(String str, String str2, Throwable th) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39841u.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4807n1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39842v.a(th);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4833o1(this, th));
    }

    public final void a(String str) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.i.a(str);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new I0(this, str));
    }

    public final void a(Intent intent) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39825d.a(intent);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new J0(this, intent));
    }

    public final void a(Location location) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new L0(this, location));
    }

    public final void a(boolean z10) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new N0(this, z10));
    }

    public final void a(UserProfile userProfile) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39843w.a(userProfile);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new Q0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39844x.a(revenue);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new S0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39845y.a(adRevenue);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new T0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39846z.a(eCommerceEvent);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new U0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39828g.a(deferredDeeplinkParametersListener);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new V0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39828g.a(deferredDeeplinkListener);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new W0(this, deferredDeeplinkListener));
    }

    public final InterfaceC4739kb a(Context context, String str) {
        M2 m22 = this.f41407f;
        m22.f39827f.a(context);
        m22.f39831k.a(str);
        C4545cn c4545cn = this.f41408g;
        c4545cn.f40669e.a(context.getApplicationContext());
        return this.f41404c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        M2 m22 = this.f41407f;
        m22.f39827f.a(context);
        m22.f39829h.a(reporterConfig);
        C4545cn c4545cn = this.f41408g;
        c4545cn.f40669e.a(context.getApplicationContext());
        C5129zi c5129zi = this.f41404c;
        Context applicationContext = context.getApplicationContext();
        if (((C4927ri) c5129zi.f42196a.get(reporterConfig.apiKey)) == null) {
            synchronized (c5129zi.f42196a) {
                try {
                    if (((C4927ri) c5129zi.f42196a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorA = C5065x4.l().f42014c.a();
                        c5129zi.f42197b.getClass();
                        if (C4961t0.f41657e == null) {
                            ((S9) iHandlerExecutorA).f40100b.post(new RunnableC5079xi(c5129zi, applicationContext));
                        }
                        C4927ri c4927ri = new C4927ri(applicationContext.getApplicationContext(), str, new C4986u0());
                        c5129zi.f42196a.put(str, c4927ri);
                        c4927ri.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(WebView webView) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39833m.a(webView);
        Ao ao = this.f41408g.f40666b;
        ao.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                xo xoVar = new xo();
                synchronized (ao) {
                    try {
                        PublicLogger publicLogger = ao.f39132b;
                        if (publicLogger == null) {
                            ao.f39131a.add(xoVar);
                        } else {
                            xoVar.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ao.a(new yo());
            }
        } catch (Throwable th) {
            ao.a(new zo(th));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new Y0(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f41407f.f39827f.a(context);
        C4545cn c4545cn = this.f41408g;
        Context applicationContext = context.getApplicationContext();
        c4545cn.f40669e.a(applicationContext);
        c4545cn.f40670f.a(applicationContext);
        return C5065x4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4497b1(this, str, str2));
    }

    public final void a() {
        this.f41407f.getClass();
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4549d1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        M2 m22 = this.f41407f;
        m22.f39827f.a(context);
        m22.f39836p.a(startupParamsCallback);
        C4545cn c4545cn = this.f41408g;
        c4545cn.f40669e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4574e1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39837q.a(anrListener);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4600f1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        M2 m22 = this.f41407f;
        m22.f39822a.a(null);
        m22.f39838r.a(externalAttribution);
        this.f41408g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4626g1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C5065x4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f41407f.f39821A.a(map);
        this.f41408g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((S9) iHandlerExecutorC).f40100b.post(new RunnableC4652h1(this, listFromMap));
    }

    public static InterfaceC4507bb a(C4859p1 c4859p1) {
        return c4859p1.d().f39254a;
    }
}
