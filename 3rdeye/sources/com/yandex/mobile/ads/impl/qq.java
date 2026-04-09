package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class qq {

    /* renamed from: a, reason: collision with root package name */
    private final yq1 f32311a;

    /* renamed from: b, reason: collision with root package name */
    private final o7 f32312b;

    /* renamed from: c, reason: collision with root package name */
    private final dr f32313c;

    public /* synthetic */ qq() {
        this(new yq1(), new o7(), new dr());
    }

    public final jp1 a(a8<?> a8Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarB = this.f32311a.b(a8Var, adConfiguration);
        jp1 jp1VarA = this.f32312b.a(adConfiguration.a());
        return kp1.a(kp1.a(jp1VarB, jp1VarA), this.f32313c.a(adConfiguration));
    }

    public qq(yq1 responseDataProvider, o7 adRequestReportDataProvider, dr configurationReportDataProvider) {
        kotlin.jvm.internal.l.f(responseDataProvider, "responseDataProvider");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(configurationReportDataProvider, "configurationReportDataProvider");
        this.f32311a = responseDataProvider;
        this.f32312b = adRequestReportDataProvider;
        this.f32313c = configurationReportDataProvider;
    }
}
