package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yj;

/* loaded from: classes3.dex */
public final class d8 implements yj.a<String> {

    /* renamed from: a, reason: collision with root package name */
    private final qq f26017a;

    public /* synthetic */ d8() {
        this(new qq());
    }

    @Override // com.yandex.mobile.ads.impl.yj.a
    public final jp1 a(rq1<a8<String>> rq1Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        return this.f26017a.a(rq1Var != null ? rq1Var.f32763a : null, adConfiguration);
    }

    public d8(qq commonReportDataProvider) {
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        this.f26017a = commonReportDataProvider;
    }
}
