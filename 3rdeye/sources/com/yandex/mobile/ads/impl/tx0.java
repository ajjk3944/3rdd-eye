package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class tx0 {

    /* renamed from: a, reason: collision with root package name */
    private final qq f33801a;

    /* renamed from: b, reason: collision with root package name */
    private final y71 f33802b;

    public /* synthetic */ tx0() {
        this(new qq(), new m71());
    }

    public final jp1 a(a8<?> a8Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        if ((a8Var != null ? a8Var.v() : null) != cs.f25764c) {
            return this.f33801a.a(a8Var, adConfiguration);
        }
        Object objI = a8Var.I();
        return this.f33802b.a(a8Var, adConfiguration, objI instanceof p61 ? (p61) objI : null);
    }

    public tx0(qq commonReportDataProvider, y71 nativeCommonReportDataProvider) {
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f33801a = commonReportDataProvider;
        this.f33802b = nativeCommonReportDataProvider;
    }
}
