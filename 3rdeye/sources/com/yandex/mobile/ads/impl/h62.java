package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h62 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28102a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f28103b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h62(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, gd.a(context, wm2.f35021a, c4072a3.q().b()));
        c4072a3.q().f();
    }

    public final void a(Map reportData, du1 du1Var) {
        ip1.b reportType = ip1.b.f28800Z;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        if (du1Var == null || !du1Var.N()) {
            return;
        }
        C4072a3 c4072a3 = this.f28102a;
        b9.l lVar = new b9.l(Constants.ADMON_AD_TYPE, c4072a3.b().b());
        String strC = c4072a3.c();
        if (strC == null) {
            strC = "";
        }
        this.f28103b.a(new ip1(reportType.a(), C2078B.u(C2078B.q(C2078B.o(lVar, new b9.l(Constants.ADMON_AD_UNIT_ID, strC)), reportData)), (C4075b) null));
    }

    public h62(Context context, C4072a3 adConfiguration, mp1 metricaReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        this.f28102a = adConfiguration;
        this.f28103b = metricaReporter;
    }
}
