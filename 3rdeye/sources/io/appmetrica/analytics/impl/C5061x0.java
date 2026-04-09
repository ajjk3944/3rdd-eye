package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5061x0 implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41998a;

    /* renamed from: b, reason: collision with root package name */
    public final Ua f41999b;

    /* renamed from: c, reason: collision with root package name */
    public final C4666hf f42000c;

    /* renamed from: d, reason: collision with root package name */
    public final Ll f42001d;

    /* renamed from: e, reason: collision with root package name */
    public final C5002ug f42002e;

    /* renamed from: f, reason: collision with root package name */
    public final Nf f42003f;

    /* renamed from: g, reason: collision with root package name */
    public final C5004ui f42004g;

    /* renamed from: h, reason: collision with root package name */
    public final Gi f42005h;
    public final W7 i;

    /* renamed from: j, reason: collision with root package name */
    public final Uk f42006j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Cc f42007k;

    /* renamed from: l, reason: collision with root package name */
    public final C4702j0 f42008l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42009m;

    public C5061x0(Context context, Ua ua2) {
        this.f41998a = context;
        this.f41999b = ua2;
        C4666hf c4666hfB = C5065x4.l().b(context);
        this.f42000c = c4666hfB;
        Gd.a();
        C5065x4 c5065x4L = C5065x4.l();
        c5065x4L.m().a(new C4629g4(context));
        Nf nfA = AbstractC5086y0.a(context, AbstractC5086y0.a(ua2.b(), this));
        this.f42003f = nfA;
        W7 w7J = c5065x4L.j();
        this.i = w7J;
        Gi giA = AbstractC5086y0.a(nfA, context, ua2.getDefaultExecutor());
        this.f42005h = giA;
        w7J.a(giA);
        Ll llA = AbstractC5086y0.a(context, giA, c4666hfB, ua2.b());
        this.f42001d = llA;
        giA.a(llA);
        this.f42002e = AbstractC5086y0.a(giA, c4666hfB, ua2.b());
        this.f42004g = AbstractC5086y0.a(context, nfA, giA, ua2.b(), llA);
        this.f42006j = c5065x4L.o();
        this.f42008l = new C4702j0(c4666hfB);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final InterfaceC4739kb c(ReporterConfig reporterConfig) {
        return this.f42004g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final C4894qa d() {
        return this.f42001d.e();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final String e() {
        return this.f42001d.d();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final Map<String, String> g() {
        return this.f42001d.b();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final AdvIdentifiersResult h() {
        return this.f42001d.a();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final Cc i() {
        return this.f42007k;
    }

    public final InterfaceC4507bb j() {
        Cc cc = this.f42007k;
        kotlin.jvm.internal.l.c(cc);
        return cc.f39254a;
    }

    public final C5004ui k() {
        return this.f42004g;
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void setDataSendingEnabled(boolean z10) {
        j().setDataSendingEnabled(z10);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        C4702j0 c4702j0 = this.f42008l;
        AppMetricaConfig appMetricaConfigF = c4702j0.f41097a.f();
        if (appMetricaConfigF == null) {
            C4909r0 c4909r0 = c4702j0.f41098b;
            c4909r0.getClass();
            AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c4909r0.f41524a.c() && kotlin.jvm.internal.l.b(c4909r0.f41525b.f41846a, Boolean.TRUE)) {
                builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
            }
            Boolean bool = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool.booleanValue());
            appMetricaConfigF = builderNewConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigF, new C5036w0(this, appMetricaConfigF, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z10;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new C5011v0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (zA || this.f42009m) {
            z10 = false;
        } else {
            a(appMetricaConfig, orCreateMainPublicLogger);
            z10 = true;
        }
        if (zA || z10) {
            this.f42000c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z10) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f42009m = true;
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void b(boolean z10) {
        j().b(z10);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.S6
    public final void a(int i, Bundle bundle) {
        this.f42001d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f42002e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f42002e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(ReporterConfig reporterConfig) {
        this.f42004g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f42001d.a(startupParamsCallback, list, AbstractC5122zb.c(this.f42003f.f39902a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Pc pc) {
        if (this.f42007k == null) {
            a(appMetricaConfig, publicLogger);
            this.f42002e.a();
            Ac acA = pc.a();
            R7 r72 = new R7(acA);
            Cc cc = new Cc(acA, r72);
            this.f41999b.c().a(r72);
            this.f42007k = cc;
            F5 f52 = this.f42006j.f40249b;
            synchronized (f52) {
                try {
                    f52.f39409a = acA;
                    Iterator it = f52.f39410b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4820ne) it.next()).consume(acA);
                    }
                    f52.f39410b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        pc.a();
        return false;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f41999b.d().a(this.f41998a, appMetricaConfig, this);
            this.f41999b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f41999b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f42006j.a();
        } else {
            Uk uk = this.f42006j;
            synchronized (uk) {
                if (uk.f40254g) {
                    uk.f40248a.unregisterListener(uk.f40250c, ActivityEvent.RESUMED);
                    uk.f40248a.unregisterListener(uk.f40251d, ActivityEvent.PAUSED);
                    uk.f40254g = false;
                }
            }
        }
        this.f42003f.d(appMetricaConfig);
        Ll ll = this.f42001d;
        ll.f39803e = publicLogger;
        ll.b(appMetricaConfig.customHosts);
        Ll ll2 = this.f42001d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ll2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f42001d.a(str);
        if (str != null) {
            this.f42001d.b("api");
        }
        this.f42005h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking);
        this.f42001d.i();
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(boolean z10) {
        j().a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC4791mb
    public final InterfaceC4765lb a() {
        return this.f42004g;
    }
}
