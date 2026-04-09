package com.yandex.mobile.ads.impl;

import N7.G8;
import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.iu1;
import com.yandex.mobile.ads.impl.ju1;

/* loaded from: classes3.dex */
public final class hu1 {

    /* renamed from: a, reason: collision with root package name */
    private final cc f28372a;

    /* renamed from: b, reason: collision with root package name */
    private final k50 f28373b;

    /* renamed from: c, reason: collision with root package name */
    private final C4198s4 f28374c;

    /* renamed from: d, reason: collision with root package name */
    private final ou1 f28375d;

    /* renamed from: e, reason: collision with root package name */
    private final ju1 f28376e;

    /* renamed from: f, reason: collision with root package name */
    private final aq1 f28377f;

    /* renamed from: g, reason: collision with root package name */
    private final lu1 f28378g;

    /* renamed from: h, reason: collision with root package name */
    private final f22 f28379h;
    private final Context i;

    public interface a {
        void a(du1 du1Var, er erVar);

        void a(fi2 fi2Var, er erVar);
    }

    public /* synthetic */ hu1(Context context, mp1 mp1Var, cc ccVar, k50 k50Var, C4198s4 c4198s4) {
        this(context, mp1Var, ccVar, k50Var, c4198s4, new ou1(context, mp1Var), ju1.a.a(), aq1.a.a(), new lu1(), new f22(mp1Var));
    }

    public final void a() {
        aq1 aq1Var = this.f28377f;
        Context context = this.i;
        aq1Var.getClass();
        aq1.a(context, this);
    }

    public final void a(zw1 sensitiveModeChecker, tk0 initializationCallSource, iu1.a.b listener) {
        String str;
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(initializationCallSource, "initializationCallSource");
        kotlin.jvm.internal.l.f(listener, "listener");
        du1 du1VarA = ew1.a.a().a(this.i);
        if (du1VarA != null && !this.f28375d.a()) {
            listener.a(du1VarA, er.f26990d);
            return;
        }
        pu1 pu1Var = new pu1(this.i, this.f28376e, listener, this.f28374c);
        this.f28379h.a(initializationCallSource);
        j50 j50VarC = this.f28373b.c();
        Context context = this.i;
        String strA = j50VarC.a();
        if (strA == null || strA.length() == 0) {
            str = null;
        } else {
            String strA2 = this.f28378g.a(context, sensitiveModeChecker, this.f28372a, j50VarC);
            StringBuilder sbU = G8.u(strA);
            if (!kotlin.jvm.internal.l.b(String.valueOf(y9.r.y0(sbU)), "/")) {
                sbU.append("/");
            }
            sbU.append("v1/startup");
            sbU.append("?");
            sbU.append(strA2);
            String string = sbU.toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            str = string;
        }
        if (str == null || str.length() == 0) {
            pu1Var.a((fi2) new C4093d3(EnumC4135j3.f28939j, null));
            return;
        }
        nu1 nu1Var = new nu1(this.i, str, this.f28375d, j50VarC.d(), pu1Var, pu1Var);
        nu1Var.b(this);
        C4198s4 c4198s4 = this.f28374c;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32463m;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        aq1 aq1Var = this.f28377f;
        Context context2 = this.i;
        synchronized (aq1Var) {
            kotlin.jvm.internal.l.f(context2, "context");
            xc1.a(context2).a(nu1Var);
        }
    }

    public hu1(Context context, mp1 reporter, cc advertisingConfiguration, k50 environmentController, C4198s4 adLoadingPhasesManager, ou1 requestPolicy, ju1 sdkConfigurationProvider, aq1 requestManager, lu1 queryConfigurator, f22 startupRequestReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(sdkConfigurationProvider, "sdkConfigurationProvider");
        kotlin.jvm.internal.l.f(requestManager, "requestManager");
        kotlin.jvm.internal.l.f(queryConfigurator, "queryConfigurator");
        kotlin.jvm.internal.l.f(startupRequestReporter, "startupRequestReporter");
        this.f28372a = advertisingConfiguration;
        this.f28373b = environmentController;
        this.f28374c = adLoadingPhasesManager;
        this.f28375d = requestPolicy;
        this.f28376e = sdkConfigurationProvider;
        this.f28377f = requestManager;
        this.f28378g = queryConfigurator;
        this.f28379h = startupRequestReporter;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.i = applicationContext;
    }
}
