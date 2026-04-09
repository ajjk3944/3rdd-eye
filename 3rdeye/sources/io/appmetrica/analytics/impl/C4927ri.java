package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ri, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4927ri implements InterfaceC4739kb {

    /* renamed from: a, reason: collision with root package name */
    public final C4986u0 f41581a;

    /* renamed from: b, reason: collision with root package name */
    public final Lh f41582b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f41583c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f41584d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f41585e;

    /* renamed from: f, reason: collision with root package name */
    public final Ai f41586f;

    /* renamed from: g, reason: collision with root package name */
    public final C4485af f41587g;

    public C4927ri(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C4986u0());
    }

    public static InterfaceC4739kb a(C4986u0 c4986u0, Context context, ReporterConfig reporterConfig) {
        c4986u0.getClass();
        return C4961t0.a(context).f().c(reporterConfig);
    }

    public final void c(String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4591ei(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4850oi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f41587g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new Wh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4824ni(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f41582b.f39791h.a(adRevenue);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4488ai(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f41582b.f39792j.a(map);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4746ki(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f41582b.i.a(eCommerceEvent);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4540ci(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f41582b.f39785b.a(str);
        this.f41586f.getClass();
        if (th == null) {
            th = new T1();
            th.fillInStackTrace();
        }
        this.f41583c.execute(new Sh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f41582b.f39784a.a(str);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4876pi(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f41582b.f39790g.a(revenue);
        this.f41586f.getClass();
        this.f41583c.execute(new Zh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f41582b.f39788e.a(th);
        this.f41586f.getClass();
        this.f41583c.execute(new Uh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f41582b.f39789f.a(userProfile);
        this.f41586f.getClass();
        this.f41583c.execute(new Yh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new Vh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4798mi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4566di(this, z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4669hi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new Xh(this, str));
    }

    public C4927ri(Context context, String str, C4986u0 c4986u0) {
        this(context, new Lh(), c4986u0, new Ai(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4739kb, io.appmetrica.analytics.impl.InterfaceC4817nb
    public final void a(Kn kn) {
        this.f41582b.f39787d.a(kn);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4720ji(this, kn));
    }

    public C4927ri(Context context, Lh lh, C4986u0 c4986u0, Ai ai, ReporterConfig reporterConfig) {
        this(context, lh, c4986u0, ai, reporterConfig, new C4485af(new C4514bi(c4986u0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z10) {
        this.f41582b.f39791h.a(adRevenue);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4694ii(this, adRevenue, z10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f41582b.f39784a.a(str);
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4902qi(this, str, str2));
    }

    public C4927ri(Context context, Lh lh, C4986u0 c4986u0, Ai ai, ReporterConfig reporterConfig, C4485af c4485af) {
        this.f41583c = C5065x4.l().g().a();
        this.f41584d = context;
        this.f41582b = lh;
        this.f41581a = c4986u0;
        this.f41586f = ai;
        this.f41585e = reporterConfig;
        this.f41587g = c4485af;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f41582b.f39786c.a(str);
        this.f41586f.getClass();
        this.f41583c.execute(new Th(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4739kb, io.appmetrica.analytics.impl.InterfaceC4573e0
    public final void a(U u8) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4772li(this, u8));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f41582b.f39784a.a(str);
        this.f41586f.getClass();
        this.f41583c.execute(new Rh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4617fi(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f41582b.getClass();
        this.f41586f.getClass();
        this.f41583c.execute(new RunnableC4643gi(this, moduleEvent));
    }
}
