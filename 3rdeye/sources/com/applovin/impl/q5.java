package com.applovin.impl;

import N7.G8;
import android.app.Activity;
import com.applovin.impl.r5;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20799g;

    public q5(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f20799g = kVar;
    }

    private void f() {
        if (this.f20799g.S().c()) {
            return;
        }
        Activity activityU0 = this.f20799g.u0();
        if (activityU0 != null) {
            this.f20799g.S().a(activityU0);
            return;
        }
        this.f20799g.E().a(y1.f21802k0, this.f21693b + ":maybeInitializeAdapters()");
        this.f20799g.q0().a(new f6(this.f20799g, true, "initializeAdapters", new B.b(this, 20)), r5.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    private void g() {
        String str;
        boolean zC = this.f20799g.o0().c();
        Map mapN = this.f20799g.B().n();
        Map mapK = this.f20799g.B().K();
        String strA = zC ? this.f20799g.B().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapN.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        n2 n2Var = new n2();
        n2Var.a().a("=====AppLovin SDK=====");
        n2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f20799g.a(l4.f19705B3)).a("Ad Review Version", C2123i.b()).a("OM SDK Version", this.f20799g.d0().c());
        n2Var.a("===Device Info===").a("OS", a7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapN.get(CommonUrlParts.MODEL)).a("Locale", mapN.get(CommonUrlParts.LOCALE)).a("Emulator", mapN.get("sim")).a("Tablet", mapN.get("is_tablet"));
        n2Var.a("===App Info===").a("Application ID", mapK.get("package_name")).a("Target SDK", mapK.get("target_sdk"));
        n2Var.a("===SDK Settings===").a("SDK Key", this.f20799g.i0()).a("Mediation Provider", this.f20799g.V()).a("TG", z6.a(this.f20799g)).a("MD", this.f20799g.a(l4.f20026t)).a("Test Mode On", Boolean.valueOf(this.f20799g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        n2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(AbstractC2130l0.a(a()));
        n2Var.a("===MAX Terms and Privcay Policy Flow===");
        C2139p0 c2139p0Y = this.f20799g.y();
        boolean zJ = c2139p0Y.j();
        n2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f20799g.w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = c2139p0Y.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            n2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (a7.c(this.f20799g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                n2Var.a("Debug User Geography", str2);
            }
        }
        n2Var.a("Privacy Policy URI", c2139p0Y.f()).a("Terms of Service URI", c2139p0Y.h());
        n2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f20799g.r0().i());
        n2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", n2Var.toString());
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sbU;
        str = "failed";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f20799g.H().b(a());
            this.f20799g.H().e(a());
            this.f20799g.q0().a((w4) new x4(this.f20799g), r5.b.OTHER);
            this.f20799g.B().U();
            this.f20799g.l0().c();
            this.f20799g.z().l();
            if (a7.c(this.f20799g)) {
                this.f20799g.a();
            }
            this.f20799g.Y0();
            this.f20799g.p().collectAppHubData();
            g();
            f();
            this.f20799g.a(true);
            this.f20799g.e0().b();
            this.f20799g.k().maybeFireAppKilledWhilePlayingAdPostback();
            this.f20799g.G().maybeTrackAppOpenEvent();
            this.f20799g.A().a();
            if (((Boolean) this.f20799g.a(l4.f19767J2)).booleanValue()) {
                this.f20799g.x0().b();
            }
            if (((Boolean) this.f20799g.a(l4.f19833T0)).booleanValue()) {
                this.f20799g.h().b();
            } else {
                this.f20799g.h().g();
            }
            if (this.f20799g.U().g() || (((Boolean) this.f20799g.a(g3.f19386R6)).booleanValue() && a7.c(this.f20799g) && this.f20799g.G0())) {
                this.f20799g.U().e();
            }
            if (this.f20799g.g0() != null) {
                this.f20799g.g0().b((String) this.f20799g.a(l4.f20034u));
            }
            this.f20799g.d0().i();
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f20799g.a(false);
                a(th);
                if (((Boolean) this.f20799g.a(l4.i)).booleanValue()) {
                    this.f20799g.e0().a();
                }
                if (((Boolean) this.f20799g.a(l4.f19933h)).booleanValue()) {
                    this.f20799g.U0();
                }
                if (this.f20799g.g0() != null) {
                    this.f20799g.g0().b((String) this.f20799g.a(l4.f20034u));
                }
                this.f20799g.d0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f21694c;
                str2 = this.f21693b;
                sbU = G8.u("AppLovin SDK ");
                sbU.append(AppLovinSdk.VERSION);
                sbU.append(" initialization ");
                if (this.f20799g.B0()) {
                }
            } catch (Throwable th2) {
                if (this.f20799g.g0() != null) {
                    this.f20799g.g0().b((String) this.f20799g.a(l4.f20034u));
                }
                this.f20799g.d0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f21694c;
                    String str3 = this.f21693b;
                    StringBuilder sb = new StringBuilder("AppLovin SDK ");
                    sb.append(AppLovinSdk.VERSION);
                    sb.append(" initialization ");
                    sb.append(this.f20799g.B0() ? "succeeded" : "failed");
                    sb.append(" in ");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb.append("ms");
                    oVar2.a(str3, sb.toString());
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f21694c;
            str2 = this.f21693b;
            sbU = G8.u("AppLovin SDK ");
            sbU.append(AppLovinSdk.VERSION);
            sbU.append(" initialization ");
            if (this.f20799g.B0()) {
                str = "succeeded";
            }
            sbU.append(str);
            sbU.append(" in ");
            sbU.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbU.append("ms");
            oVar.a(str2, sbU.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f20799g.S().a(this.f20799g.e().b());
    }
}
