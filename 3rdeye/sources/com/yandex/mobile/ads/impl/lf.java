package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class lf extends td0<lf> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(Context context, a8 adResponse, C4072a3 adConfiguration, pc0 adVisibilityValidator, dg0 htmlAdResponseReportManager, wc0 fullScreenController) {
        super(context, adResponse, adConfiguration, adVisibilityValidator, fullScreenController, new C4129i4());
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        kotlin.jvm.internal.l.f(adVisibilityValidator, "adVisibilityValidator");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        htmlAdResponseReportManager.a((a8<String>) adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.td0
    public final td0 o() {
        return this;
    }
}
