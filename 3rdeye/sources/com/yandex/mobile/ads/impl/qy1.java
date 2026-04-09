package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class qy1 implements y71 {

    /* renamed from: a, reason: collision with root package name */
    private final w31 f32374a;

    /* renamed from: b, reason: collision with root package name */
    private final yq1 f32375b;

    /* renamed from: c, reason: collision with root package name */
    private final o7 f32376c;

    /* renamed from: d, reason: collision with root package name */
    private final dr f32377d;

    public qy1(w31 w31Var, yq1 responseDataProvider, o7 adRequestReportDataProvider, dr configurationReportDataProvider) {
        kotlin.jvm.internal.l.f(w31Var, "native");
        kotlin.jvm.internal.l.f(responseDataProvider, "responseDataProvider");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(configurationReportDataProvider, "configurationReportDataProvider");
        this.f32374a = w31Var;
        this.f32375b = responseDataProvider;
        this.f32376c = adRequestReportDataProvider;
        this.f32377d = configurationReportDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.y71
    public final jp1 a(a8 a8Var, C4072a3 adConfiguration, p61 p61Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = this.f32375b.a(a8Var, p61Var, adConfiguration, this.f32374a);
        jp1 jp1VarA2 = this.f32376c.a(adConfiguration.a());
        dr drVar = this.f32377d;
        drVar.getClass();
        jp1 jp1VarA3 = drVar.a(adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(Boolean.valueOf(adConfiguration.u()), "image_loading_automatically");
        return kp1.a(kp1.a(jp1VarA, jp1VarA2), kp1.a(jp1VarA3, jp1Var));
    }
}
