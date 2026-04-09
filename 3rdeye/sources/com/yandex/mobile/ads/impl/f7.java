package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f27218a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f27219b;

    /* renamed from: c, reason: collision with root package name */
    private final dg0 f27220c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f27221d;

    /* renamed from: e, reason: collision with root package name */
    private final wg1 f27222e;

    /* renamed from: f, reason: collision with root package name */
    private final du1 f27223f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(Context context, a8 a8Var, C4072a3 c4072a3, C4198s4 c4198s4, dg0 dg0Var) {
        this(context, a8Var, c4072a3, c4198s4, dg0Var, gd.a(context, wm2.f35021a, c4072a3.q().b()), new e7(c4198s4), ew1.a.a().a(context));
        c4072a3.q().f();
    }

    public final void a() {
        jp1 jp1VarA = this.f27220c.a();
        jp1VarA.b(ip1.a.f28774a, "adapter");
        jp1VarA.a(this.f27222e.a());
        vy1 vy1VarR = this.f27219b.r();
        if (vy1VarR != null) {
            jp1VarA.b(vy1VarR.a().a(), "size_type");
            jp1VarA.b(Integer.valueOf(vy1VarR.getWidth()), "width");
            jp1VarA.b(Integer.valueOf(vy1VarR.getHeight()), "height");
        }
        du1 du1Var = this.f27223f;
        if (du1Var != null) {
            jp1VarA.b(du1Var.n(), "banner_size_calculation_type");
        }
        jp1VarA.a(this.f27218a.a());
        ip1.b bVar = ip1.b.f28805d;
        Map<String, Object> mapB = jp1VarA.b();
        this.f27221d.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public f7(Context context, a8<?> adResponse, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, dg0 reportParameterManager, mp1 metricaReporter, wg1 phasesParametersProvider, du1 du1Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(phasesParametersProvider, "phasesParametersProvider");
        this.f27218a = adResponse;
        this.f27219b = adConfiguration;
        this.f27220c = reportParameterManager;
        this.f27221d = metricaReporter;
        this.f27222e = phasesParametersProvider;
        this.f27223f = du1Var;
    }
}
