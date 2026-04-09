package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yo implements np1 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35934a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f35935b;

    /* renamed from: c, reason: collision with root package name */
    private final q41 f35936c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f35937d;

    /* renamed from: e, reason: collision with root package name */
    private final qq f35938e;

    /* renamed from: f, reason: collision with root package name */
    private final bd f35939f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(Context context, a8 a8Var, C4072a3 c4072a3, q41 q41Var) {
        this(context, a8Var, c4072a3, q41Var, gd.a(context, wm2.f35021a, c4072a3.q().b()), new qq(), new bd(context));
        c4072a3.q().f();
    }

    private final ip1 a(ip1.b bVar, HashMap map) {
        jp1 jp1Var = new jp1(map, 2);
        jp1Var.b(ip1.a.f28774a, "adapter");
        jp1 jp1VarA = kp1.a(jp1Var, this.f35938e.a(this.f35934a, this.f35935b));
        vy1 vy1VarR = this.f35935b.r();
        if (vy1VarR != null) {
            jp1VarA.b(vy1VarR.a().a(), "size_type");
            jp1VarA.b(Integer.valueOf(vy1VarR.getWidth()), "width");
            jp1VarA.b(Integer.valueOf(vy1VarR.getHeight()), "height");
        }
        q41 q41Var = this.f35936c;
        if (q41Var != null) {
            jp1VarA.a((Map<String, ? extends Object>) q41Var.a());
        }
        Map<String, Object> mapB = jp1VarA.b();
        return new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData"));
    }

    public yo(Context context, a8<?> adResponse, C4072a3 adConfiguration, q41 q41Var, mp1 metricaReporter, qq commonReportDataProvider, bd metricaLibraryEventReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f35934a = adResponse;
        this.f35935b = adConfiguration;
        this.f35936c = q41Var;
        this.f35937d = metricaReporter;
        this.f35938e = commonReportDataProvider;
        this.f35939f = metricaLibraryEventReporter;
    }

    @Override // com.yandex.mobile.ads.impl.np1
    public final void a(ip1.b reportType) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        this.f35937d.a(a(reportType, new HashMap()));
    }

    @Override // com.yandex.mobile.ads.impl.np1
    public final void a(HashMap reportData) {
        ip1.b reportType = ip1.b.f28777C;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        ip1 ip1VarA = a(reportType, reportData);
        this.f35937d.a(ip1VarA);
        this.f35939f.a(reportType, ip1VarA.b(), ip1.a.f28774a, null);
    }
}
