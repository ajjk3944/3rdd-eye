package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.d6;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5660g;

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f5660g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f5660g.D().a("license_validation", exc);
        }
        this.f5660g.q0().a(new s6(this.f5660g, p2Var, exc));
    }

    private void g() {
        String str;
        boolean zC = this.f5660g.o0().c();
        Map mapP = this.f5660g.A().p();
        Map mapM = this.f5660g.A().M();
        String strA = zC ? this.f5660g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f5660g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f5660g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapP.get("model")).a("Locale", mapP.get("locale")).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get(CampaignEx.JSON_KEY_PACKAGE_NAME)).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f5660g.i0()).a("Mediation Provider", this.f5660g.V()).a("TG", m7.a(this.f5660g)).a("MD", this.f5660g.a(x4.f8578t)).a("Test Mode On", Boolean.valueOf(this.f5660g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.f5660g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f5660g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.f5660g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f5660g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.f5660g.a(x4.f8618y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f8782i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.f5660g.a(x4.f8626z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f5660g.N().a(l10.longValue()).a(this.f5660g.q0().a("lv_task"), new s4.b() { // from class: com.applovin.impl.k9
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f6334a.a(z10, (p2) obj, (Exception) obj2);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sb;
        str = "failed";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f5660g.G().b(a());
            this.f5660g.G().e(a());
            this.f5660g.q0().a((i5) new j5(this.f5660g), d6.b.OTHER);
            this.f5660g.A().b0();
            this.f5660g.l0().c();
            this.f5660g.y().l();
            if (n7.c(this.f5660g)) {
                this.f5660g.a();
            }
            this.f5660g.X0();
            g();
            f();
            this.f5660g.a(true);
            h();
            this.f5660g.f0().b();
            this.f5660g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f5660g.a(x4.C2)).booleanValue()) {
                this.f5660g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f5660g.F().maybeTrackAppOpenEvent();
            this.f5660g.z().a();
            if (((Boolean) this.f5660g.a(x4.P2)).booleanValue()) {
                this.f5660g.x0().b();
            }
            if (((Boolean) this.f5660g.a(x4.X0)).booleanValue()) {
                this.f5660g.h().b();
            } else {
                this.f5660g.h().g();
            }
            if (this.f5660g.U().g() || (((Boolean) this.f5660g.a(r3.f7483u7)).booleanValue() && n7.c(this.f5660g) && this.f5660g.G0())) {
                this.f5660g.U().e();
            }
            this.f5660g.e0().i();
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f5660g.a(false);
                a(th);
                if (((Boolean) this.f5660g.a(x4.f8486i)).booleanValue()) {
                    this.f5660g.f0().a();
                }
                if (((Boolean) this.f5660g.a(x4.f8477h)).booleanValue()) {
                    this.f5660g.T0();
                }
                this.f5660g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f6220c;
                str2 = this.f6219b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (this.f5660g.B0()) {
                }
            } catch (Throwable th2) {
                this.f5660g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f6220c;
                    String str3 = this.f6219b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.f5660g.B0() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append("ms");
                    oVar2.a(str3, sb2.toString());
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f6220c;
            str2 = this.f6219b;
            sb = new StringBuilder();
            sb.append("AppLovin SDK ");
            sb.append(AppLovinSdk.VERSION);
            sb.append(" initialization ");
            if (this.f5660g.B0()) {
                str = "succeeded";
            }
            sb.append(str);
            sb.append(" in ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            oVar.a(str2, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f5660g.S().a(this.f5660g.e().b());
    }

    private void f() {
        if (this.f5660g.S().c()) {
            return;
        }
        Activity activityU0 = this.f5660g.u0();
        if (activityU0 != null) {
            this.f5660g.S().a(activityU0);
            return;
        }
        this.f5660g.D().a(d2.D0, this.f6219b + ":maybeInitializeAdapters()");
        this.f5660g.q0().a(new r6(this.f5660g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.j9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6282a.e();
            }
        }), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }
}
