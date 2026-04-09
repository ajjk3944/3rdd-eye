package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.d6;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c6 extends i5 {
    private final com.applovin.impl.sdk.k g;

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z3, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.g.D().a("license_validation", exc);
        }
        this.g.q0().a(new s6(this.g, p2Var, exc));
    }

    private void g() {
        String str;
        boolean zC = this.g.o0().c();
        Map mapP = this.g.A().p();
        Map mapM = this.g.A().M();
        String strA = zC ? this.g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapP.get("model")).a("Locale", mapP.get("locale")).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.g.i0()).a("Mediation Provider", this.g.V()).a("TG", m7.a(this.g)).a("MD", this.g.a(x4.f6138t)).a("Test Mode On", Boolean.valueOf(this.g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.g.a(x4.f6177y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f6316i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.g.a(x4.f6185z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.g.N().a(l10.longValue()).a(this.g.q0().a("lv_task"), new x8(0, this));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sbZ;
        str = "failed";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.g.G().b(a());
            this.g.G().e(a());
            this.g.q0().a((i5) new j5(this.g), d6.b.OTHER);
            this.g.A().b0();
            this.g.l0().c();
            this.g.y().l();
            if (n7.c(this.g)) {
                this.g.a();
            }
            this.g.X0();
            g();
            f();
            this.g.a(true);
            h();
            this.g.f0().b();
            this.g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.g.a(x4.C2)).booleanValue()) {
                this.g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.g.F().maybeTrackAppOpenEvent();
            this.g.z().a();
            if (((Boolean) this.g.a(x4.P2)).booleanValue()) {
                this.g.x0().b();
            }
            if (((Boolean) this.g.a(x4.X0)).booleanValue()) {
                this.g.h().b();
            } else {
                this.g.h().g();
            }
            if (this.g.U().g() || (((Boolean) this.g.a(r3.u7)).booleanValue() && n7.c(this.g) && this.g.G0())) {
                this.g.U().e();
            }
            this.g.e0().i();
        } catch (Throwable th2) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th2);
                this.g.a(false);
                a(th2);
                if (((Boolean) this.g.a(x4.f6053i)).booleanValue()) {
                    this.g.f0().a();
                }
                if (((Boolean) this.g.a(x4.f6044h)).booleanValue()) {
                    this.g.T0();
                }
                this.g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f4289c;
                str2 = this.f4288b;
                sbZ = d.h.z("AppLovin SDK ");
                sbZ.append(AppLovinSdk.VERSION);
                sbZ.append(" initialization ");
                if (this.g.B0()) {
                }
            } catch (Throwable th3) {
                this.g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f4289c;
                    String str3 = this.f4288b;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.g.B0() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    a0.g.B(sb2, "ms", oVar2, str3);
                }
                throw th3;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f4289c;
            str2 = this.f4288b;
            sbZ = d.h.z("AppLovin SDK ");
            sbZ.append(AppLovinSdk.VERSION);
            sbZ.append(" initialization ");
            if (this.g.B0()) {
                str = "succeeded";
            }
            sbZ.append(str);
            sbZ.append(" in ");
            sbZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            a0.g.B(sbZ, "ms", oVar, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.g.S().a(this.g.e().b());
    }

    private void f() {
        if (this.g.S().c()) {
            return;
        }
        Activity activityU0 = this.g.u0();
        if (activityU0 != null) {
            this.g.S().a(activityU0);
            return;
        }
        this.g.D().a(d2.D0, this.f4288b + ":maybeInitializeAdapters()");
        this.g.q0().a(new r6(this.g, true, "initializeAdapters", new v9(6, this)), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }
}
