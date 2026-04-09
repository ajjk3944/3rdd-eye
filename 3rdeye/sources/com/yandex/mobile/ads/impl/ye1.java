package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ye1 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f35774a;

    /* renamed from: b, reason: collision with root package name */
    private final wk f35775b;

    /* renamed from: c, reason: collision with root package name */
    private final wg1 f35776c;

    public ye1(C4198s4 adLoadingPhasesManager, mp1 reporter, wk reportDataProvider, wg1 phasesParametersProvider) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(reportDataProvider, "reportDataProvider");
        kotlin.jvm.internal.l.f(phasesParametersProvider, "phasesParametersProvider");
        this.f35774a = reporter;
        this.f35775b = reportDataProvider;
        this.f35776c = phasesParametersProvider;
    }

    public final void a(xk xkVar) {
        this.f35775b.getClass();
        jp1 jp1VarA = wk.a(xkVar);
        jp1VarA.b(ip1.c.f28830d.a(), "status");
        jp1VarA.b("Cannot load bidder token. Token generation failed", "failure_reason");
        jp1VarA.b(this.f35776c.a(), "durations");
        ip1.b bVar = ip1.b.f28797W;
        Map<String, Object> mapB = jp1VarA.b();
        this.f35774a.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public final void a(xk xkVar, bu1 bu1Var) {
        this.f35775b.getClass();
        jp1 jp1VarA = wk.a(xkVar);
        jp1VarA.b(ip1.c.f28829c.a(), "status");
        jp1VarA.b(this.f35776c.a(), "durations");
        jp1VarA.a(bu1Var != null ? bu1Var.a() : null, "stub_reason");
        ip1.b bVar = ip1.b.f28797W;
        Map<String, Object> mapB = jp1VarA.b();
        this.f35774a.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }
}
