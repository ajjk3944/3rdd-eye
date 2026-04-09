package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2077A;
import c9.C2078B;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.a;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fx0<T extends com.monetization.ads.mediation.base.a, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f27480a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f27481b;

    /* renamed from: c, reason: collision with root package name */
    private final mx0<T, L> f27482c;

    /* renamed from: d, reason: collision with root package name */
    private final ux0 f27483d;

    /* renamed from: e, reason: collision with root package name */
    private final gx0<T> f27484e;

    /* renamed from: f, reason: collision with root package name */
    private final cg1 f27485f;

    /* renamed from: g, reason: collision with root package name */
    private final rx0 f27486g;

    /* renamed from: h, reason: collision with root package name */
    private ex0<T> f27487h;

    public /* synthetic */ fx0(C4072a3 c4072a3, C4198s4 c4198s4, mx0 mx0Var, ux0 ux0Var, gx0 gx0Var, cg1 cg1Var) {
        this(c4072a3, c4198s4, mx0Var, ux0Var, gx0Var, cg1Var, new rx0());
    }

    public final ex0<T> a() {
        return this.f27487h;
    }

    public final void b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            Map<String, ? extends Object> mapM = C2077A.m(new b9.l("status", "success"));
            this.f27483d.f(context, ex0Var.c(), mapM, ex0Var.a().b().getNetworkName());
        }
    }

    public final void c(Context context, Map<String, ? extends Object> mediatedReportData) {
        zy0 zy0VarC;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediatedReportData, "mediatedReportData");
        ex0<T> ex0Var = this.f27487h;
        List<String> listD = (ex0Var == null || (zy0VarC = ex0Var.c()) == null) ? null : zy0VarC.d();
        h9 h9Var = new h9(context, this.f27480a);
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                h9Var.a((String) it.next(), m62.f30286g);
            }
        }
        LinkedHashMap linkedHashMapU = C2078B.u(mediatedReportData);
        linkedHashMapU.put("status", "success");
        ex0<T> ex0Var2 = this.f27487h;
        if (ex0Var2 != null) {
            hx0 hx0VarA = ex0Var2.a();
            this.f27486g.getClass();
            linkedHashMapU.putAll(rx0.a(hx0VarA));
            this.f27483d.g(context, ex0Var2.c(), linkedHashMapU, ex0Var2.a().b().getNetworkName());
        }
    }

    public final void d(Context context, Map<String, ? extends Object> additionalReportData) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            this.f27483d.e(context, ex0Var.c(), additionalReportData, ex0Var.a().b().getNetworkName());
        }
    }

    public final void e(Context context, Map<String, ? extends Object> additionalReportData) {
        hx0 hx0VarA;
        MediatedAdapterInfo mediatedAdapterInfoB;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        ex0<T> ex0Var = this.f27487h;
        String networkName = null;
        zy0 zy0VarC = ex0Var != null ? ex0Var.c() : null;
        if (zy0VarC != null) {
            ux0 ux0Var = this.f27483d;
            ex0<T> ex0Var2 = this.f27487h;
            if (ex0Var2 != null && (hx0VarA = ex0Var2.a()) != null && (mediatedAdapterInfoB = hx0VarA.b()) != null) {
                networkName = mediatedAdapterInfoB.getNetworkName();
            }
            ux0Var.b(context, zy0VarC, additionalReportData, networkName);
        }
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            try {
                this.f27482c.a(ex0Var.b());
            } catch (Throwable th) {
                zy0 zy0VarC = ex0Var.c();
                String networkName = ex0Var.a().b().getNetworkName();
                fp0.c(new Object[0]);
                this.f27483d.a(context, zy0VarC, C2077A.m(new b9.l("reason", C2077A.m(new b9.l("exception_in_adapter", th.toString())))), networkName);
            }
        }
    }

    public fx0(C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, mx0<T, L> mediatedAdLoader, ux0 mediatedAdapterReporter, gx0<T> mediatedAdCreator, cg1 passbackAdLoader, rx0 mediatedAdapterInfoReportDataProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(mediatedAdLoader, "mediatedAdLoader");
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediatedAdCreator, "mediatedAdCreator");
        kotlin.jvm.internal.l.f(passbackAdLoader, "passbackAdLoader");
        kotlin.jvm.internal.l.f(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f27480a = adConfiguration;
        this.f27481b = adLoadingPhasesManager;
        this.f27482c = mediatedAdLoader;
        this.f27483d = mediatedAdapterReporter;
        this.f27484e = mediatedAdCreator;
        this.f27485f = passbackAdLoader;
        this.f27486g = mediatedAdapterInfoReportDataProvider;
    }

    public final void b(Context context, C4128i3 adFetchRequestError, L l5) {
        zy0 zy0VarC;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
        ex0<T> ex0Var = this.f27487h;
        ja jaVar = new ja(ip1.c.f28830d, (ex0Var == null || (zy0VarC = ex0Var.c()) == null) ? null : zy0VarC.e());
        C4198s4 c4198s4 = this.f27481b;
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
        c4198s4.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4.a(adLoadingPhaseType, jaVar, null);
        LinkedHashMap linkedHashMapP = C2078B.p(new b9.l("status", com.vungle.ads.internal.presenter.g.ERROR), new b9.l("error_code", Integer.valueOf(adFetchRequestError.b())), new b9.l("error_description", adFetchRequestError.c()));
        ex0<T> ex0Var2 = this.f27487h;
        if (ex0Var2 != null) {
            hx0 hx0VarA = ex0Var2.a();
            this.f27486g.getClass();
            linkedHashMapP.putAll(rx0.a(hx0VarA));
            this.f27483d.g(context, ex0Var2.c(), linkedHashMapP, ex0Var2.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l5);
    }

    public final void a(Context context, L l5) {
        Context context2;
        L l10;
        zy0 zy0VarC;
        kotlin.jvm.internal.l.f(context, "context");
        ex0<T> ex0VarA = this.f27484e.a(context);
        this.f27487h = ex0VarA;
        if (ex0VarA != null) {
            this.f27480a.a(ex0VarA.c());
            this.f27480a.c(ex0VarA.a().b().getNetworkName());
            C4198s4 c4198s4 = this.f27481b;
            EnumC4191r4 enumC4191r4 = EnumC4191r4.f32454c;
            uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
            zy0 zy0VarC2 = ex0VarA.c();
            String networkName = ex0VarA.a().b().getNetworkName();
            this.f27483d.b(context, zy0VarC2, networkName);
            try {
                context2 = context;
                l10 = l5;
            } catch (Throwable th) {
                th = th;
                context2 = context;
                l10 = l5;
            }
            try {
                this.f27482c.a(context2, ex0VarA.b(), l10, ex0VarA.a(context), ex0VarA.d());
                return;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                fp0.c(new Object[0]);
                this.f27483d.a(context2, zy0VarC2, C2077A.m(new b9.l("reason", C2077A.m(new b9.l("exception_in_adapter", th3.toString())))), networkName);
                ex0<T> ex0Var = this.f27487h;
                ja jaVar = new ja(ip1.c.f28830d, (ex0Var == null || (zy0VarC = ex0Var.c()) == null) ? null : zy0VarC.e());
                C4198s4 c4198s42 = this.f27481b;
                EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
                c4198s42.getClass();
                kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
                c4198s42.a(adLoadingPhaseType, jaVar, null);
                a(context2, (Context) l10);
                return;
            }
        }
        this.f27485f.a();
    }

    public final void c(Context context) {
        hx0 hx0VarA;
        MediatedAdapterInfo mediatedAdapterInfoB;
        kotlin.jvm.internal.l.f(context, "context");
        ex0<T> ex0Var = this.f27487h;
        String networkName = null;
        zy0 zy0VarC = ex0Var != null ? ex0Var.c() : null;
        if (zy0VarC != null) {
            ux0 ux0Var = this.f27483d;
            ex0<T> ex0Var2 = this.f27487h;
            if (ex0Var2 != null && (hx0VarA = ex0Var2.a()) != null && (mediatedAdapterInfoB = hx0VarA.b()) != null) {
                networkName = mediatedAdapterInfoB.getNetworkName();
            }
            ux0Var.a(context, zy0VarC, networkName);
        }
    }

    public final void b(Context context, Map<String, ? extends Object> additionalReportData) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            zy0 zy0VarC = ex0Var.c();
            String networkName = ex0Var.a().b().getNetworkName();
            List<String> listH = zy0VarC.h();
            if (listH != null) {
                Iterator<String> it = listH.iterator();
                while (it.hasNext()) {
                    new h9(context, this.f27480a).a(it.next(), m62.f30285f);
                }
            }
            this.f27483d.d(context, zy0VarC, additionalReportData, networkName);
        }
    }

    public final boolean b() {
        hx0 hx0VarA;
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var == null || (hx0VarA = ex0Var.a()) == null) {
            return true;
        }
        return hx0VarA.c();
    }

    public final void a(Context context, Map<String, ? extends Object> additionalReportData) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(additionalReportData, "additionalReportData");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            zy0 zy0VarC = ex0Var.c();
            String networkName = ex0Var.a().b().getNetworkName();
            List<String> listG = zy0VarC.g();
            if (listG != null) {
                Iterator<String> it = listG.iterator();
                while (it.hasNext()) {
                    new h9(context, this.f27480a).a(it.next(), m62.f30283d);
                }
            }
            LinkedHashMap linkedHashMapU = C2078B.u(additionalReportData);
            linkedHashMapU.put("click_type", "default");
            this.f27483d.c(context, zy0VarC, linkedHashMapU, networkName);
        }
    }

    public final void a(Context context, C4128i3 adFetchRequestError, L l5) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
        ex0<T> ex0Var = this.f27487h;
        if (ex0Var != null) {
            this.f27483d.f(context, ex0Var.c(), C2078B.o(new b9.l("status", com.vungle.ads.internal.presenter.g.ERROR), new b9.l("error_code", Integer.valueOf(adFetchRequestError.b()))), ex0Var.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l5);
    }

    public final void a(Context context, a8<String> a8Var) {
        hx0 hx0VarA;
        MediatedAdapterInfo mediatedAdapterInfoB;
        kotlin.jvm.internal.l.f(context, "context");
        ex0<T> ex0Var = this.f27487h;
        String networkName = null;
        zy0 zy0VarC = ex0Var != null ? ex0Var.c() : null;
        if (zy0VarC != null) {
            ux0 ux0Var = this.f27483d;
            ex0<T> ex0Var2 = this.f27487h;
            if (ex0Var2 != null && (hx0VarA = ex0Var2.a()) != null && (mediatedAdapterInfoB = hx0VarA.b()) != null) {
                networkName = mediatedAdapterInfoB.getNetworkName();
            }
            ux0Var.a(context, zy0VarC, a8Var, networkName);
        }
    }
}
