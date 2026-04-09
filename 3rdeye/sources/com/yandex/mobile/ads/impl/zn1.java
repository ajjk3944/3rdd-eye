package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zn1 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f36566a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f36567b;

    /* renamed from: c, reason: collision with root package name */
    private final tg f36568c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36569d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(Context context, C4072a3 c4072a3, InterfaceC4143k4 interfaceC4143k4, ns nsVar, a8 a8Var, String str) {
        this(context, c4072a3, interfaceC4143k4, nsVar, a8Var, str, gd.a(context, wm2.f35021a, c4072a3.q().b()));
        c4072a3.q().f();
    }

    public final void a() {
        if (this.f36569d) {
            this.f36569d = false;
            return;
        }
        jp1 jp1VarA = this.f36568c.a();
        Map<String, Object> mapS = this.f36566a.s();
        if (mapS != null) {
            jp1VarA.a((Map<String, ? extends Object>) mapS);
        }
        jp1VarA.a(this.f36566a.a());
        ip1.b bVar = ip1.b.f28784J;
        Map<String, Object> mapB = jp1VarA.b();
        this.f36567b.a(new ip1(bVar.a(), C2078B.u(mapB), xe1.a(jp1VarA, bVar, "reportType", mapB, "reportData")));
    }

    public zn1(Context context, C4072a3 adConfiguration, InterfaceC4143k4 adInfoReportDataProviderFactory, ns adType, a8<?> adResponse, String str, mp1 metricaReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        this.f36566a = adResponse;
        this.f36567b = metricaReporter;
        this.f36568c = new tg(adInfoReportDataProviderFactory, adType, str);
        this.f36569d = true;
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f36568c.a(reportParameterManager);
    }
}
