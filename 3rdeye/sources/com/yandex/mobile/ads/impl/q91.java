package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yj;

/* loaded from: classes3.dex */
public final class q91 implements yj.a<p61> {

    /* renamed from: a, reason: collision with root package name */
    private final y71 f32117a;

    public /* synthetic */ q91() {
        this(new m71());
    }

    @Override // com.yandex.mobile.ads.impl.yj.a
    public final jp1 a(rq1<a8<p61>> rq1Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        a8<p61> a8Var = rq1Var != null ? rq1Var.f32763a : null;
        return this.f32117a.a(a8Var, adConfiguration, a8Var != null ? a8Var.I() : null);
    }

    public q91(y71 nativeCommonReportDataProvider) {
        kotlin.jvm.internal.l.f(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f32117a = nativeCommonReportDataProvider;
    }
}
