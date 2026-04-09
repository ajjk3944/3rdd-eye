package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Ac extends V2 implements InterfaceC4507bb {

    /* renamed from: s, reason: collision with root package name */
    public static final Long f39096s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final C5109yn f39097p;

    /* renamed from: q, reason: collision with root package name */
    public final Lc f39098q;

    /* renamed from: r, reason: collision with root package name */
    public final Bc f39099r;

    public Ac(Lc lc) {
        super(lc.b(), lc.i(), lc.h(), lc.d(), lc.f(), lc.j(), lc.g(), lc.c(), lc.a(), lc.e());
        this.f39097p = new C5109yn(new C4794me("Referral url"));
        this.f39098q = lc;
        this.f39099r = new Bc(this);
        l();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(String str, boolean z10) {
        this.f40268c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        HashMap map = new HashMap();
        map.put("type", com.vungle.ads.internal.presenter.g.OPEN);
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z10));
        String strB = AbstractC5122zb.b(map);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(strB, "", 8208, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void b(String str) {
        this.f39097p.a(str);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC5122zb.b(map);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(strB, "", 8208, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void c() {
        Bc bc = this.f39099r;
        synchronized (bc) {
            bc.f39169b.a(bc.f39168a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final List<String> f() {
        return this.f40267b.f40683a.b();
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final void k() {
        super.k();
        C5065x4.l().m().c();
    }

    public final void l() {
        Gi gi = this.f40273h;
        gi.f39540c.a(this.f40267b.f40683a);
        C4730k2 c4730k2 = this.f39098q.f39775g;
        C5123zc c5123zc = new C5123zc(this);
        long jLongValue = f39096s.longValue();
        synchronized (c4730k2) {
            c4730k2.a(c5123zc, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(EnumC4779m enumC4779m) {
        if (enumC4779m == EnumC4779m.f41217b) {
            this.f40268c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f40268c.warning("Could not enable activity auto tracking. " + enumC4779m.f41221a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void b(Activity activity) {
        if (this.f39098q.i.a(activity, EnumC4831o.PAUSED)) {
            this.f40268c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C4730k2 c4730k2 = this.f39098q.f39775g;
            synchronized (c4730k2) {
                for (C4704j2 c4704j2 : c4730k2.f41129a) {
                    if (!c4704j2.f41104d) {
                        c4704j2.f41104d = true;
                        c4704j2.f41102b.executeDelayed(c4704j2.f41105e, c4704j2.f41103c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(Activity activity) {
        if (this.f39098q.i.a(activity, EnumC4831o.RESUMED)) {
            this.f40268c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C4730k2 c4730k2 = this.f39098q.f39775g;
            synchronized (c4730k2) {
                for (C4704j2 c4704j2 : c4730k2.f41129a) {
                    if (c4704j2.f41104d) {
                        c4704j2.f41104d = false;
                        c4704j2.f41102b.remove(c4704j2.f41105e);
                        Ac ac = c4704j2.f41101a.f42175a;
                        ac.f40273h.f39540c.b(ac.f40267b.f40683a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void b(boolean z10) {
        this.f40268c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z10));
        this.f40267b.f40684b.setAdvIdentifiersTracking(z10);
    }

    public final void a(AppMetricaConfig appMetricaConfig, boolean z10) {
        if (z10) {
            clearAppEnvironment();
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f40268c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            Od od = this.f39098q.f39771c;
            Context context = this.f40266a;
            od.f39938d = new C0(this.f40267b.f40684b.getApiKey(), od.f39935a.f39902a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, od.f39935a.f39902a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), od.f39935a.f39902a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f40267b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = od.f39936b;
                D0 d02 = od.f39937c;
                C0 c02 = od.f39938d;
                if (c02 != null) {
                    d02.getClass();
                    nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, D0.a(c02)));
                } else {
                    kotlin.jvm.internal.l.l("nativeCrashMetadata");
                    throw null;
                }
            }
        }
        Bc bc = this.f39099r;
        synchronized (bc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                bc.f39168a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    bc.f39169b.a(bc.f39168a);
                } else {
                    bc.f39169b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(Location location) {
        this.f40267b.f40684b.setManualLocation(location);
        this.f40268c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(boolean z10) {
        this.f40267b.f40684b.setLocationTracking(z10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(Ao ao) {
        PublicLogger publicLogger = this.f40268c;
        synchronized (ao) {
            ao.f39132b = publicLogger;
        }
        Iterator it = ao.f39131a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        ao.f39131a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(AnrListener anrListener) {
        this.f39099r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4507bb
    public final void a(ExternalAttribution externalAttribution) {
        this.f40268c.info("External attribution received: %s", externalAttribution);
        Gi gi = this.f40273h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(bytes, "", 42, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.V2, io.appmetrica.analytics.impl.InterfaceC4507bb, io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(String str, String str2) {
        super.a(str, str2);
        Od od = this.f39098q.f39771c;
        String strD = this.f40267b.d();
        C0 c02 = od.f39938d;
        if (c02 != null) {
            C0 c03 = new C0(c02.f39215a, c02.f39216b, c02.f39217c, c02.f39218d, c02.f39219e, strD);
            od.f39938d = c03;
            NativeCrashClientModule nativeCrashClientModule = od.f39936b;
            od.f39937c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(D0.a(c03));
        }
    }
}
