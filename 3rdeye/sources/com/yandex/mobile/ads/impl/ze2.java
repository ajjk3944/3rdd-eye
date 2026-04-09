package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ze2 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f36460a;

    /* renamed from: b, reason: collision with root package name */
    private final hc2 f36461b;

    public ze2(Context context, C4072a3 adConfiguration, a8<?> adResponse, mp1 metricaReporter, hc2 reportParametersProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        this.f36460a = metricaReporter;
        this.f36461b = reportParametersProvider;
    }

    public final void a(String str) {
        jp1 jp1VarA = this.f36461b.a();
        jp1VarA.b(str, "error_message");
        ip1.b bVar = ip1.b.f28820s;
        Map<String, Object> mapB = jp1VarA.b();
        this.f36460a.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }
}
