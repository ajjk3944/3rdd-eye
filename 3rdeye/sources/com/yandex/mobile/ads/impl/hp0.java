package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class hp0 extends td0<hp0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(Context context, a8 adResponse, C4072a3 adConfiguration, pc0 fullScreenAdVisibilityValidator, dg0 htmlAdResponseReportManager, wc0 fullScreenController) {
        super(context, adResponse, adConfiguration, fullScreenAdVisibilityValidator, fullScreenController, new C4129i4());
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        htmlAdResponseReportManager.a((a8<String>) adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.td0
    public final td0 o() {
        return this;
    }
}
