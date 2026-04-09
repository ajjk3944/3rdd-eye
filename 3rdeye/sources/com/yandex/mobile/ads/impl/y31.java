package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y31 {

    /* renamed from: a, reason: collision with root package name */
    private final g01 f35610a;

    /* renamed from: b, reason: collision with root package name */
    private final tg f35611b;

    public y31(Context context, C4072a3 adConfiguration, InterfaceC4143k4 adInfoReportDataProviderFactory, ns adType, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(adType, "adType");
        adConfiguration.q().f();
        this.f35610a = gd.a(context, wm2.f35021a, adConfiguration.q().b());
        this.f35611b = new tg(adInfoReportDataProviderFactory, adType, str);
    }

    public final void a(ArrayList assetNames, ip1.b reportType) {
        kotlin.jvm.internal.l.f(assetNames, "assetNames");
        kotlin.jvm.internal.l.f(reportType, "reportType");
        jp1 jp1VarA = this.f35611b.a();
        jp1VarA.b(assetNames, "assets");
        Map<String, Object> mapB = jp1VarA.b();
        this.f35610a.a(new ip1(reportType.a(), C2078B.u(mapB), xe1.a(jp1VarA, reportType, "reportType", mapB, "reportData")));
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f35611b.a(reportParameterManager);
    }
}
