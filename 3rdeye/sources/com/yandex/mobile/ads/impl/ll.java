package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f30027a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f30028b;

    /* renamed from: c, reason: collision with root package name */
    private final tg f30029c;

    public ll(InterfaceC4143k4 adInfoReportDataProviderFactory, ns adType, a8 adResponse, mp1 metricaReporter, tg assetViewsValidationReportParametersProvider) {
        kotlin.jvm.internal.l.f(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(assetViewsValidationReportParametersProvider, "assetViewsValidationReportParametersProvider");
        this.f30027a = adResponse;
        this.f30028b = metricaReporter;
        this.f30029c = assetViewsValidationReportParametersProvider;
    }

    public final void a(String str) {
        tg tgVar = this.f30029c;
        tgVar.getClass();
        jp1 jp1VarA = tgVar.a();
        jp1VarA.b("no_view_for_asset", "reason");
        jp1VarA.b(str, "asset_name");
        Map<String, Object> mapS = this.f30027a.s();
        if (mapS != null) {
            jp1VarA.a((Map<String, ? extends Object>) mapS);
        }
        jp1VarA.a(this.f30027a.a());
        ip1.b bVar = ip1.b.f28785K;
        Map<String, Object> mapB = jp1VarA.b();
        this.f30028b.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public /* synthetic */ ll(InterfaceC4143k4 interfaceC4143k4, ns nsVar, a8 a8Var, String str, mp1 mp1Var) {
        this(interfaceC4143k4, nsVar, a8Var, mp1Var, new tg(interfaceC4143k4, nsVar, str));
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f30029c.a(reportParameterManager);
    }
}
