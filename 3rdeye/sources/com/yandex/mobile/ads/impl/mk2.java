package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class mk2 implements fq1<za2, List<? extends za2>> {

    /* renamed from: a, reason: collision with root package name */
    private final ad2 f30426a;

    public mk2(ad2 reportParametersProvider) {
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        this.f30426a = reportParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(za2 za2Var) {
        za2 request = za2Var;
        kotlin.jvm.internal.l.f(request, "request");
        Map<String, String> reportData = this.f30426a.a();
        ip1.b reportType = ip1.b.f28816o;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        return new ip1(reportType.a(), C2078B.u(reportData), (C4075b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(rq1<List<? extends za2>> rq1Var, int i, za2 za2Var) {
        ip1.c cVar;
        za2 request = za2Var;
        kotlin.jvm.internal.l.f(request, "request");
        List<? extends za2> list = rq1Var != null ? rq1Var.f32763a : null;
        if (204 == i) {
            cVar = ip1.c.f28831e;
        } else if (list != null && i == 200) {
            cVar = list.isEmpty() ? ip1.c.f28831e : ip1.c.f28829c;
        } else {
            cVar = ip1.c.f28830d;
        }
        LinkedHashMap linkedHashMapQ = C2078B.q(this.f30426a.a(), C2077A.m(new b9.l("status", cVar.a())));
        ip1.b reportType = ip1.b.f28817p;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        return new ip1(reportType.a(), C2078B.u(linkedHashMapQ), (C4075b) null);
    }
}
