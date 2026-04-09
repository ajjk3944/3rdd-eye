package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class m71 implements y71 {

    /* renamed from: a, reason: collision with root package name */
    private final yq1 f30293a;

    /* renamed from: b, reason: collision with root package name */
    private final o7 f30294b;

    /* renamed from: c, reason: collision with root package name */
    private final dr f30295c;

    public /* synthetic */ m71() {
        this(new yq1(), new o7(), new dr());
    }

    @Override // com.yandex.mobile.ads.impl.y71
    public final jp1 a(a8 a8Var, C4072a3 adConfiguration, p61 p61Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = this.f30293a.a(a8Var, adConfiguration, p61Var);
        jp1 jp1VarA2 = this.f30294b.a(adConfiguration.a());
        dr drVar = this.f30295c;
        drVar.getClass();
        jp1 jp1VarA3 = drVar.a(adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(Boolean.valueOf(adConfiguration.u()), "image_loading_automatically");
        return kp1.a(kp1.a(jp1VarA, jp1VarA2), kp1.a(jp1VarA3, jp1Var));
    }

    public m71(yq1 responseDataProvider, o7 adRequestReportDataProvider, dr configurationReportDataProvider) {
        kotlin.jvm.internal.l.f(responseDataProvider, "responseDataProvider");
        kotlin.jvm.internal.l.f(adRequestReportDataProvider, "adRequestReportDataProvider");
        kotlin.jvm.internal.l.f(configurationReportDataProvider, "configurationReportDataProvider");
        this.f30293a = responseDataProvider;
        this.f30294b = adRequestReportDataProvider;
        this.f30295c = configurationReportDataProvider;
    }
}
