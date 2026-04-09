package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dc2 {

    /* renamed from: a, reason: collision with root package name */
    private final hc2 f26130a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f26131b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc2(Context context, C4072a3 c4072a3, hc2 hc2Var) {
        this(context, c4072a3, hc2Var, gd.a(context, wm2.f35021a, c4072a3.q().b()));
        c4072a3.q().f();
    }

    public final void a() {
        ip1.b bVar = ip1.b.f28819r;
        jp1 jp1VarA = this.f26130a.a();
        Map<String, Object> mapB = jp1VarA.b();
        this.f26131b.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public final void b() {
        ip1.b bVar = ip1.b.f28818q;
        jp1 jp1VarA = this.f26130a.a();
        Map<String, Object> mapB = jp1VarA.b();
        this.f26131b.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public dc2(Context context, C4072a3 adConfiguration, hc2 reportParametersProvider, mp1 metricaReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        this.f26130a = reportParametersProvider;
        this.f26131b = metricaReporter;
    }
}
