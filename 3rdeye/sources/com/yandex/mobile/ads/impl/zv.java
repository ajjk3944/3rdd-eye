package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zv implements yv {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f36754a;

    /* renamed from: b, reason: collision with root package name */
    private final jp1 f36755b;

    public zv(g01 metricaReporter, jp1 reportDataWrapper) {
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(reportDataWrapper, "reportDataWrapper");
        this.f36754a = metricaReporter;
        this.f36755b = reportDataWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.yv
    public final void a(xv eventType) {
        kotlin.jvm.internal.l.f(eventType, "eventType");
        this.f36755b.b(eventType.a(), "log_type");
        ip1.b bVar = ip1.b.f28796V;
        Map<String, Object> mapB = this.f36755b.b();
        this.f36754a.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(this.f36755b, bVar, "reportType", mapB, "reportData")));
    }
}
