package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    private final qq f28507a;

    /* renamed from: b, reason: collision with root package name */
    private final y71 f28508b;

    public /* synthetic */ i6() {
        this(new qq(), new m71());
    }

    public final jp1 a(a8<?> a8Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        if ((a8Var != null ? a8Var.v() : null) != cs.f25764c) {
            return this.f28507a.a(a8Var, adConfiguration);
        }
        Object objI = a8Var.I();
        return this.f28508b.a(a8Var, adConfiguration, objI instanceof p61 ? (p61) objI : null);
    }

    public i6(qq commonReportDataProvider, y71 nativeCommonReportDataProvider) {
        kotlin.jvm.internal.l.f(commonReportDataProvider, "commonReportDataProvider");
        kotlin.jvm.internal.l.f(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f28507a = commonReportDataProvider;
        this.f28508b = nativeCommonReportDataProvider;
    }
}
