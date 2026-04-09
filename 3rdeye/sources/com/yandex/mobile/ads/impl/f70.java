package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f70 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f27224a;

    /* renamed from: b, reason: collision with root package name */
    private final tg f27225b;

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f27226c;

    public f70(Context context, C4072a3 adConfiguration, InterfaceC4143k4 adInfoReportDataProviderFactory, ns adType, a8 adResponse, tg assetViewsValidationReportParametersProvider, mp1 metricaReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(assetViewsValidationReportParametersProvider, "assetViewsValidationReportParametersProvider");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        this.f27224a = adResponse;
        this.f27225b = assetViewsValidationReportParametersProvider;
        this.f27226c = metricaReporter;
    }

    public final void a(ArrayList assetNames) {
        kotlin.jvm.internal.l.f(assetNames, "assetNames");
        tg tgVar = this.f27225b;
        tgVar.getClass();
        jp1 jp1VarA = tgVar.a();
        jp1VarA.b("no_view_for_asset", "reason");
        jp1VarA.b(assetNames, "assets");
        Map<String, Object> mapS = this.f27224a.s();
        if (mapS != null) {
            jp1VarA.a((Map<String, ? extends Object>) mapS);
        }
        jp1VarA.a(this.f27224a.a());
        ip1.b bVar = ip1.b.f28786L;
        Map<String, Object> mapB = jp1VarA.b();
        this.f27226c.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public /* synthetic */ f70(Context context, C4072a3 c4072a3, InterfaceC4143k4 interfaceC4143k4, ns nsVar, a8 a8Var, String str) {
        tg tgVar = new tg(interfaceC4143k4, nsVar, str);
        c4072a3.q().f();
        this(context, c4072a3, interfaceC4143k4, nsVar, a8Var, tgVar, gd.a(context, wm2.f35021a, c4072a3.q().b()));
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f27225b.a(reportParameterManager);
    }
}
